package mods.villagercannon.common;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.*;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemVForce extends ItemSword{
	 
	/*剣としてのダメージ。*/
	private float damage;
 
	public ItemVForce (Item.ToolMaterial par2){
		super (par2);
		this.setMaxStackSize(1);
		this.setMaxDamage(64);
		this.damage = 5;
	}
 
	/*剣としてのダメージを設定するメソッド。今回はdamageに代入した値（ハート2.5個分）を使用。*/
	@Override
	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), 
                        new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.damage, 0));
        return multimap;
    }
 
	/*アイコンはバニラのエメラルドを使用。*/
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon("emerald");
	}
 
	/*
         * 右クリック使用をやめた時に呼ばれるメソッド。右クリックを継続して押していた時間をもとに、エンティティを発射する処理を行う。
         */
        public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
        {
    	//par4は右クリックの押下時間。
        int j = this.getMaxItemUseDuration(par1ItemStack) - par4;
 
        //まず、クリエイティブであるか＆このアイテムにInfinityエンチャントが付いているかを確かめる。いずれかを満たすとtrue。
        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || 
        EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;
 
        if (!flag)//アイテムにダメージを与える。
        {
        	par1ItemStack.damageItem(1, par3EntityPlayer);
        }
 
        //右クリック押下時間をもとに計算。20で割り（単位を秒に変換）、なにやら二次関数的な計算式に入れている。
        //ここではバニラ弓のまま使っているが、独自の計算式でも良いと思います。
        float f = (float)j / 20.0F;
        f = (f * f + f * 2.0F) / 3.0F;
 
        //タメ時間が一定以下の場合、何も起こさず処理から抜ける。
        if ((double)f < 0.1D)
        {
            return;
        }
 
        //fの上限値。
        if (f > 1.0F)
        {
            f = 1.0F;
        }
 
        EntityVillagerHead bullet = new EntityVillagerHead(par2World, par3EntityPlayer, f * 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);
        if (f == 1.0F)
        {
        	bullet.setIsCritical(true);
        }
        
        par2World.playSoundAtEntity(par3EntityPlayer, "mob.villager.idle", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
 
        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(bullet);
        }
    }
 
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	return par1ItemStack;
    }
 
    /*
     * 右クリックでの使用（タメ）時間の上限。
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }
 
    /*
     * 右クリック時の動作のタイプ。
     * ここではbow（引き絞るタメ動作）にしているが、ガードや飲食などに変えることも出来、呼ばれるメソッドが異なる。
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
 
    /*
     * 右クリックでの使用時に呼ばれるメソッド。
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
 
        return par1ItemStack;
    }
 
    @SideOnly(Side.CLIENT)
    /*
     * 右クリックでタメている時のアイコンを変えられる。今回は特に変えていない。
     */
    public IIcon getItemIconForUseDuration(int par1)
    {
        return this.itemIcon;
    }
 
}
