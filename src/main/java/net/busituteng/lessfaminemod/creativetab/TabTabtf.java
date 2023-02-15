
package net.busituteng.lessfaminemod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.busituteng.lessfaminemod.item.ItemRoasttorchberries;
import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

@ElementsLessfaminemodMod.ModElement.Tag
public class TabTabtf extends ElementsLessfaminemodMod.ModElement {
	public TabTabtf(ElementsLessfaminemodMod instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtabtf") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemRoasttorchberries.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
