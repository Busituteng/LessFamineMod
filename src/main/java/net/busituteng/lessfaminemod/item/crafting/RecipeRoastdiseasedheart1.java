
package net.busituteng.lessfaminemod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.busituteng.lessfaminemod.item.ItemSoakdiseasedheart;
import net.busituteng.lessfaminemod.item.ItemRoastdiseasedheart;
import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

@ElementsLessfaminemodMod.ModElement.Tag
public class RecipeRoastdiseasedheart1 extends ElementsLessfaminemodMod.ModElement {
	public RecipeRoastdiseasedheart1(ElementsLessfaminemodMod instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSoakdiseasedheart.block, (int) (1)), new ItemStack(ItemRoastdiseasedheart.block, (int) (1)), 0F);
	}
}
