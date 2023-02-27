
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.jigsawponosdlc.client.model.ModelUniversePig;
import net.mcreator.jigsawponosdlc.client.model.ModelScrap_hammer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JigsawPonosDlcModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelUniversePig.LAYER_LOCATION, ModelUniversePig::createBodyLayer);
		event.registerLayerDefinition(ModelScrap_hammer.LAYER_LOCATION, ModelScrap_hammer::createBodyLayer);
	}
}
