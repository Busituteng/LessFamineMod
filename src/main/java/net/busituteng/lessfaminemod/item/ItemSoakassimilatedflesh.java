
package net.busituteng.lessfaminemod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.busituteng.lessfaminemod.creativetab.TabTabsrp1;
import net.busituteng.lessfaminemod.ElementsLessFamineMod;

@ElementsLessFamineMod.ModElement.Tag
public class ItemSoakassimilatedflesh extends ElementsLessFamineMod.ModElement {
	@GameRegistry.ObjectHolder("lessfaminemod:soakassimilatedflesh")
	public static final Item block = null;
	public ItemSoakassimilatedflesh(ElementsLessFamineMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lessfaminemod:soakassimilatedflesh", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 0f, false);
			setUnlocalizedName("soakassimilatedflesh");
			setRegistryName("soakassimilatedflesh");
			setAlwaysEdible();
			setCreativeTab(TabTabsrp1.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
