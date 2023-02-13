
package net.busituteng.lessfaminemod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.busituteng.lessfaminemod.item.ItemSoakassimilatedflesh;
import net.busituteng.lessfaminemod.item.ItemRoastassimilatedflesh;
import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

@ElementsLessfaminemodMod.ModElement.Tag
public class RecipeRoastassimilatedflesh1 extends ElementsLessfaminemodMod.ModElement {
	public RecipeRoastassimilatedflesh1(ElementsLessfaminemodMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSoakassimilatedflesh.block, (int) (1)), new ItemStack(ItemRoastassimilatedflesh.block, (int) (1)),
				0F);
	}
}
