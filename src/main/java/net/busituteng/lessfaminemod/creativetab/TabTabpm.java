
package net.busituteng.lessfaminemod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.busituteng.lessfaminemod.item.ItemCookedyellowapricorn;
import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

@ElementsLessfaminemodMod.ModElement.Tag
public class TabTabpm extends ElementsLessfaminemodMod.ModElement {
	public TabTabpm(ElementsLessfaminemodMod instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtabpm") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCookedyellowapricorn.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
