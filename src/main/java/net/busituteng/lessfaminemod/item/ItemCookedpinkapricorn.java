
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

import net.busituteng.lessfaminemod.creativetab.TabTabpm;
import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

@ElementsLessfaminemodMod.ModElement.Tag
public class ItemCookedpinkapricorn extends ElementsLessfaminemodMod.ModElement {
	@GameRegistry.ObjectHolder("lessfaminemod:cookedpinkapricorn")
	public static final Item block = null;
	public ItemCookedpinkapricorn(ElementsLessfaminemodMod instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lessfaminemod:cookedpinkapricorn", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(7, 0.2f, false);
			setUnlocalizedName("cookedpinkapricorn");
			setRegistryName("cookedpinkapricorn");
			setAlwaysEdible();
			setCreativeTab(TabTabpm.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
