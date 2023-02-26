
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.jigsawponosdlc.block.ShitWooferBlock;
import net.mcreator.jigsawponosdlc.block.PonosblockBlock;
import net.mcreator.jigsawponosdlc.block.PerdezhBlockBlock;
import net.mcreator.jigsawponosdlc.block.JarFilledBlock;
import net.mcreator.jigsawponosdlc.block.JarBlock;
import net.mcreator.jigsawponosdlc.block.FartTurretBlock;
import net.mcreator.jigsawponosdlc.block.DiamondIronBlockBlock;
import net.mcreator.jigsawponosdlc.block.BrawlLeavesBlock;
import net.mcreator.jigsawponosdlc.block.BobrovuhaInfusingBlock;
import net.mcreator.jigsawponosdlc.block.BobrovuhaDoneBlock;
import net.mcreator.jigsawponosdlc.JigsawPonosDlcMod;

public class JigsawPonosDlcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JigsawPonosDlcMod.MODID);
	public static final RegistryObject<Block> PONOSBLOCK = REGISTRY.register("ponosblock", () -> new PonosblockBlock());
	public static final RegistryObject<Block> PERDEZH_BLOCK = REGISTRY.register("perdezh_block", () -> new PerdezhBlockBlock());
	public static final RegistryObject<Block> SHIT_WOOFER = REGISTRY.register("shit_woofer", () -> new ShitWooferBlock());
	public static final RegistryObject<Block> BRAWL_LEAVES = REGISTRY.register("brawl_leaves", () -> new BrawlLeavesBlock());
	public static final RegistryObject<Block> FART_TURRET = REGISTRY.register("fart_turret", () -> new FartTurretBlock());
	public static final RegistryObject<Block> DIAMOND_IRON_BLOCK = REGISTRY.register("diamond_iron_block", () -> new DiamondIronBlockBlock());
	public static final RegistryObject<Block> JAR = REGISTRY.register("jar", () -> new JarBlock());
	public static final RegistryObject<Block> JAR_FILLED = REGISTRY.register("jar_filled", () -> new JarFilledBlock());
	public static final RegistryObject<Block> BOBROVUHA_INFUSING = REGISTRY.register("bobrovuha_infusing", () -> new BobrovuhaInfusingBlock());
	public static final RegistryObject<Block> BOBROVUHA_DONE = REGISTRY.register("bobrovuha_done", () -> new BobrovuhaDoneBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PerdezhBlockBlock.registerRenderLayer();
			ShitWooferBlock.registerRenderLayer();
			FartTurretBlock.registerRenderLayer();
			JarBlock.registerRenderLayer();
			JarFilledBlock.registerRenderLayer();
			BobrovuhaInfusingBlock.registerRenderLayer();
			BobrovuhaDoneBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			BrawlLeavesBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			BrawlLeavesBlock.itemColorLoad(event);
		}
	}
}
