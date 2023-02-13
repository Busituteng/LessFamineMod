
package net.busituteng.lessfaminemod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.busituteng.lessfaminemod.item.ItemSoakrupterviscera;
import net.busituteng.lessfaminemod.item.ItemRoastrupterviscera;
import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

@ElementsLessfaminemodMod.ModElement.Tag
public class RecipeRoastrupterviscera1 extends ElementsLessfaminemodMod.ModElement {
	public RecipeRoastrupterviscera1(ElementsLessfaminemodMod instance) {
		super(instance, 10);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSoakrupterviscera.block, (int) (1)), new ItemStack(ItemRoastrupterviscera.block, (int) (1)), 0F);
	}
}
