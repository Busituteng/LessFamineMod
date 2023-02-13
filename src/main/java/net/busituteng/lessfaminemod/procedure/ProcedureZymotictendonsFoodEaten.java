package net.busituteng.lessfaminemod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

import java.util.Map;

@ElementsLessfaminemodMod.ModElement.Tag
public class ProcedureZymotictendonsFoodEaten extends ElementsLessfaminemodMod.ModElement {
	public ProcedureZymotictendonsFoodEaten(ElementsLessfaminemodMod instance) {
		super(instance, 17);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ZymotictendonsFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 100, (int) 0));
	}
}
