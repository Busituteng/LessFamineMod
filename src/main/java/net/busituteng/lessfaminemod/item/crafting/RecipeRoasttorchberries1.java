
package net.busituteng.lessfaminemod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.busituteng.lessfaminemod.item.ItemSoaktorchberries;
import net.busituteng.lessfaminemod.item.ItemRoasttorchberries;
import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

@ElementsLessfaminemodMod.ModElement.Tag
public class RecipeRoasttorchberries1 extends ElementsLessfaminemodMod.ModElement {
	public RecipeRoasttorchberries1(ElementsLessfaminemodMod instance) {
		super(instance, 25);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSoaktorchberries.block, (int) (1)), new ItemStack(ItemRoasttorchberries.block, (int) (1)), 0F);
	}
}
