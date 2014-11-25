package mods.villagercannon.common;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMaterials extends Item {
	
	@SideOnly(Side.CLIENT)
    private IIcon iconItemType[];
	
	public ItemMaterials (){
		super ();
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		maxStackSize = 64;

	}
	
	@Override
    public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase entity)
    {
        if (entity.worldObj.isRemote)
        {
            return false;
        }
        
        if (entity != null && entity instanceof EntityVillager)
        {
        	if (itemstack.getItemDamage() == 0)
        	{
        		ItemStack dropItem = new ItemStack(this, 1, 1);
        		EntityItem drop = entity.entityDropItem(dropItem, 1.0F);
        		drop.motionY += itemRand.nextFloat() * 0.05F;
                drop.motionX += (itemRand.nextFloat() - itemRand.nextFloat()) * 0.1F;
                drop.motionZ += (itemRand.nextFloat() - itemRand.nextFloat()) * 0.1F;
                
                if (!player.capabilities.isCreativeMode && --itemstack.stackSize <= 0)
                {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                }
                player.worldObj.playSoundAtEntity(player, "random.pop", 0.4F, 1.8F);
                entity.setDead();
                return true;
        	}
        }
        
        return false;
    }
	
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int par1)
    {
        int j = MathHelper.clamp_int(par1, 0, 2);
        return this.iconItemType[j];
    }
	
	@Override
	public int getMetadata(int par1) {
		return par1;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		return super.getUnlocalizedName() + "_" + par1ItemStack.getItemDamage();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		par3List.add(new ItemStack(this, 1, 0));
		par3List.add(new ItemStack(this, 1, 1));
		par3List.add(new ItemStack(this, 1, 2));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.iconItemType = new IIcon[3];
		
		this.iconItemType[0] = par1IconRegister.registerIcon("villagercannon:hollowcore");
		this.iconItemType[1] = par1IconRegister.registerIcon("villagercannon:forcedcore");
		this.iconItemType[2] = par1IconRegister.registerIcon("villagercannon:forcedrod");
	}

}
