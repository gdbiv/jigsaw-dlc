
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JigsawPonosDlcModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> BEAVERSPIDERSPAWN = GameRules.register("beaverspiderSpawn", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
}
