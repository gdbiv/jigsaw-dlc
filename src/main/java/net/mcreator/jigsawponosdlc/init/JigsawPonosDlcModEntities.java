
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.jigsawponosdlc.entity.ZombieBeaverEntity;
import net.mcreator.jigsawponosdlc.entity.UniversePigEntity;
import net.mcreator.jigsawponosdlc.entity.SledgeDebugRMBEntity;
import net.mcreator.jigsawponosdlc.entity.SledgeDebugLMBEntity;
import net.mcreator.jigsawponosdlc.entity.PushkaPerdushkaEntity;
import net.mcreator.jigsawponosdlc.entity.PonosthrowerEntity;
import net.mcreator.jigsawponosdlc.entity.PonosBombEntity;
import net.mcreator.jigsawponosdlc.entity.PiggunEntity;
import net.mcreator.jigsawponosdlc.entity.PerdezhingCloudEntity;
import net.mcreator.jigsawponosdlc.entity.OpPiggunEntity;
import net.mcreator.jigsawponosdlc.entity.ExtinguisherEntity;
import net.mcreator.jigsawponosdlc.entity.BeaverGunEntity;
import net.mcreator.jigsawponosdlc.entity.AutoForkEntity;
import net.mcreator.jigsawponosdlc.JigsawPonosDlcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JigsawPonosDlcModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, JigsawPonosDlcMod.MODID);
	public static final RegistryObject<EntityType<PushkaPerdushkaEntity>> PUSHKA_PERDUSHKA = register("projectile_pushka_perdushka", EntityType.Builder.<PushkaPerdushkaEntity>of(PushkaPerdushkaEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PushkaPerdushkaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PonosthrowerEntity>> PONOSTHROWER = register("projectile_ponosthrower",
			EntityType.Builder.<PonosthrowerEntity>of(PonosthrowerEntity::new, MobCategory.MISC).setCustomClientFactory(PonosthrowerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PonosBombEntity>> PONOS_BOMB = register("projectile_ponos_bomb",
			EntityType.Builder.<PonosBombEntity>of(PonosBombEntity::new, MobCategory.MISC).setCustomClientFactory(PonosBombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AutoForkEntity>> AUTO_FORK = register("projectile_auto_fork",
			EntityType.Builder.<AutoForkEntity>of(AutoForkEntity::new, MobCategory.MISC).setCustomClientFactory(AutoForkEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PiggunEntity>> PIGGUN = register("projectile_piggun",
			EntityType.Builder.<PiggunEntity>of(PiggunEntity::new, MobCategory.MISC).setCustomClientFactory(PiggunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZombieBeaverEntity>> ZOMBIE_BEAVER = register("zombie_beaver",
			EntityType.Builder.<ZombieBeaverEntity>of(ZombieBeaverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombieBeaverEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OpPiggunEntity>> OP_PIGGUN = register("projectile_op_piggun",
			EntityType.Builder.<OpPiggunEntity>of(OpPiggunEntity::new, MobCategory.MISC).setCustomClientFactory(OpPiggunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BeaverGunEntity>> BEAVER_GUN = register("projectile_beaver_gun",
			EntityType.Builder.<BeaverGunEntity>of(BeaverGunEntity::new, MobCategory.MISC).setCustomClientFactory(BeaverGunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExtinguisherEntity>> EXTINGUISHER = register("projectile_extinguisher",
			EntityType.Builder.<ExtinguisherEntity>of(ExtinguisherEntity::new, MobCategory.MISC).setCustomClientFactory(ExtinguisherEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SledgeDebugLMBEntity>> SLEDGE_DEBUG_LMB = register("projectile_sledge_debug_lmb",
			EntityType.Builder.<SledgeDebugLMBEntity>of(SledgeDebugLMBEntity::new, MobCategory.MISC).setCustomClientFactory(SledgeDebugLMBEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SledgeDebugRMBEntity>> SLEDGE_DEBUG_RMB = register("projectile_sledge_debug_rmb",
			EntityType.Builder.<SledgeDebugRMBEntity>of(SledgeDebugRMBEntity::new, MobCategory.MISC).setCustomClientFactory(SledgeDebugRMBEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PerdezhingCloudEntity>> PERDEZHING_CLOUD = register("perdezhing_cloud", EntityType.Builder.<PerdezhingCloudEntity>of(PerdezhingCloudEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(PerdezhingCloudEntity::new).fireImmune().sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<UniversePigEntity>> UNIVERSE_PIG = register("universe_pig", EntityType.Builder.<UniversePigEntity>of(UniversePigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(10000).setUpdateInterval(3).setCustomClientFactory(UniversePigEntity::new).fireImmune().sized(3.5f, 5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ZombieBeaverEntity.init();
			PerdezhingCloudEntity.init();
			UniversePigEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZOMBIE_BEAVER.get(), ZombieBeaverEntity.createAttributes().build());
		event.put(PERDEZHING_CLOUD.get(), PerdezhingCloudEntity.createAttributes().build());
		event.put(UNIVERSE_PIG.get(), UniversePigEntity.createAttributes().build());
	}
}
