
package net.busituteng.lessfaminemod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.busituteng.lessfaminemod.item.ItemGlowballfudge;
import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

@ElementsLessfaminemodMod.ModElement.Tag
public class TabTabtic2 extends ElementsLessfaminemodMod.ModElement {
	public TabTabtic2(ElementsLessfaminemodMod instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtabtic_2") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemGlowballfudge.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
