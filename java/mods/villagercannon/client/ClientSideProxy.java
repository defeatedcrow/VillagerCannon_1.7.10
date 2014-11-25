package mods.villagercannon.client;

import mods.villagercannon.common.CommonSideProxy;
import mods.villagercannon.common.EntityVillagerHead;
import mods.villagercannon.common.VillagerCannonCore;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
 
public class ClientSideProxy extends CommonSideProxy{
 
	@Override
	public World getClientWorld()
	{
		return FMLClientHandler.instance().getClient().theWorld;
	}
 
	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityVillagerHead.class, new EntityHeadRenderer(new VillagerHeadModel()));
		MinecraftForgeClient.registerItemRenderer(VillagerCannonCore.bulletSource, new ItemForceRenderer());
	}
}
 
