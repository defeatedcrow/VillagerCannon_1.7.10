package mods.villagercannon.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mods.defeatedcrow.common.DCsAppleMilk;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
		modid = "VillagerCannon",
		name = "VillagerCannonMod",
		version = "1.7.10_1.1",
		dependencies = "required-after:Forge@[10.13.0.1207,)"
		)
 
public class VillagerCannonCore {
 
	@SidedProxy(clientSide = "mods.villagercannon.client.ClientSideProxy", 
                    serverSide = "mods.villagercannon.common.CommonSideProxy")
	public static CommonSideProxy proxy;
 
	@Instance("villagerCannon")
    public static VillagerCannonCore instance;
	
	public static Logger logger = LogManager.getLogger("VillagerCannon");
 
	public static Item bulletSource;
	public static int entityIdHead = 170;
	
	public static Item materials;
 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//コンフィグファイルの作成。アイテム、エンティティのIDを変更可能にする。
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try
		{
			cfg.load();
			Property entityHead = cfg.get("entity", "VillagerHead", entityIdHead);
 
			entityIdHead = entityHead.getInt();
		}
		catch (Exception e)
		{
			logger.fatal("Error Message", e);
 
		}
		finally
		{
			cfg.save();
		}
 
		//アイテムの登録。
		bulletSource = new ItemVForce(Item.ToolMaterial.EMERALD)
		.setUnlocalizedName("villagerCannon.bulletSource")
		.setCreativeTab(CreativeTabs.tabCombat);
		
		materials = new ItemMaterials()
		.setUnlocalizedName("villagerCannon.materials")
		.setCreativeTab(CreativeTabs.tabMaterials);
 
		GameRegistry.registerItem(bulletSource, "villagerCannon.bulletSource");
		GameRegistry.registerItem(materials, "villagerCannon.materials");
		
		this.addRecipes();
 
	}
 
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		//エンティティの登録。
		EntityRegistry.registerModEntity(EntityVillagerHead.class, "villagerCannon.villagerHead", entityIdHead, this, 128, 5, true);
 
		//プロキシを通して、クライアントサイドのみでエンティティのモデル・レンダーの登録を行う。
		proxy.registerRenderers();
 
	}
	
	static void addRecipes()
	{
		GameRegistry.addRecipe(
	 			new ItemStack(materials, 1, 0),
	 			new Object[]{
	 					 "ZXZ",
	 					 "XYX",
	 					 "ZXZ",
	 					 'X', new ItemStack(Items.gold_ingot, 1),
	 					 'Y', new ItemStack(Items.flint, 1),
	 					 'Z', new ItemStack(Blocks.glass, 1)
	 			});
		
		GameRegistry.addRecipe(
	 			new ItemStack(materials, 1, 2),
	 			new Object[]{
	 					 "  Z",
	 					 " Y ",
	 					 "X  ",
	 					 'X', new ItemStack(Items.quartz, 1),
	 					 'Y', new ItemStack(Items.iron_ingot, 1),
	 					 'Z', new ItemStack(Items.dye, 1, 4)
	 			});
		
		GameRegistry.addRecipe(
	 			new ItemStack(bulletSource, 1, 0),
	 			new Object[]{
	 					 "Z Z",
	 					 " Y ",
	 					 "Z Z",
	 					 'Y', new ItemStack(materials, 1, 1),
	 					 'Z', new ItemStack(materials, 1, 2)
	 			});
	}
}
