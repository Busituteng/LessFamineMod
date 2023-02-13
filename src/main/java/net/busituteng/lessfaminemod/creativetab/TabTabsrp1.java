
package net.busituteng.lessfaminemod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.busituteng.lessfaminemod.item.ItemTabsrp;
import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

@ElementsLessfaminemodMod.ModElement.Tag
public class TabTabsrp1 extends ElementsLessfaminemodMod.ModElement {
	public TabTabsrp1(ElementsLessfaminemodMod instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtabsrp1") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemTabsrp.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
