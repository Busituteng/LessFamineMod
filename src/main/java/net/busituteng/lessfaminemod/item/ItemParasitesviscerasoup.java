
package net.busituteng.lessfaminemod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.busituteng.lessfaminemod.procedure.ProcedureParasitesviscerasoupFoodEaten;
import net.busituteng.lessfaminemod.creativetab.TabTabsrp1;
import net.busituteng.lessfaminemod.ElementsLessfaminemodMod;

import java.util.Map;
import java.util.HashMap;

@ElementsLessfaminemodMod.ModElement.Tag
public class ItemParasitesviscerasoup extends ElementsLessfaminemodMod.ModElement {
	@GameRegistry.ObjectHolder("lessfaminemod:parasitesviscerasoup")
	public static final Item block = null;
	public ItemParasitesviscerasoup(ElementsLessfaminemodMod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lessfaminemod:parasitesviscerasoup", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(13, 0.2f, false);
			setUnlocalizedName("parasitesviscerasoup");
			setRegistryName("parasitesviscerasoup");
			setAlwaysEdible();
			setCreativeTab(TabTabsrp1.tab);
			setMaxStackSize(1);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.DRINK;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureParasitesviscerasoupFoodEaten.executeProcedure($_dependencies);
			}
		}
	}
}
