package net.busituteng.lessfaminemod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

import java.util.Map;

@ElementsLessfaminemodMod.ModElement.Tag
public class ProcedureGlowballfudgeFoodEaten extends ElementsLessfaminemodMod.ModElement {
	public ProcedureGlowballfudgeFoodEaten(ElementsLessfaminemodMod instance) {
		super(instance, 35);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GlowballfudgeFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 400, (int) 0));
	}
}
