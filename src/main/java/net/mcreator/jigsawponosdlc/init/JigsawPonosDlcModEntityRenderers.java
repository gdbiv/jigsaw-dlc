
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.jigsawponosdlc.client.renderer.ZombieBeaverRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.UniversePigRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.SledgeDebugRMBRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.PerdezhingCloudRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.BeaverSpiderRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JigsawPonosDlcModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PUSHKA_PERDUSHKA.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PONOSTHROWER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PONOS_BOMB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.AUTO_FORK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PIGGUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.ZOMBIE_BEAVER.get(), ZombieBeaverRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.OP_PIGGUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.BEAVER_GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.EXTINGUISHER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.SLEDGE_DEBUG_LMB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.SLEDGE_DEBUG_RMB.get(), SledgeDebugRMBRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PERDEZHING_CLOUD.get(), PerdezhingCloudRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.UNIVERSE_PIG.get(), UniversePigRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.BEAVER_SPIDER.get(), BeaverSpiderRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PONOSTHROWER_NON_ANAL.get(), ThrownItemRenderer::new);
	}
}
