
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jigsawponosdlc.item.WandOfMassDestructionItem;
import net.mcreator.jigsawponosdlc.item.SledgeDebugRMBItem;
import net.mcreator.jigsawponosdlc.item.SledgeDebugLMBItem;
import net.mcreator.jigsawponosdlc.item.SexySledgehammerItem;
import net.mcreator.jigsawponosdlc.item.PushkaPerdushkaItem;
import net.mcreator.jigsawponosdlc.item.PonosthrowerItem;
import net.mcreator.jigsawponosdlc.item.PonosItem;
import net.mcreator.jigsawponosdlc.item.PonosBombItemItem;
import net.mcreator.jigsawponosdlc.item.PonosBombItem;
import net.mcreator.jigsawponosdlc.item.PiggunItem;
import net.mcreator.jigsawponosdlc.item.PigAmmoItem;
import net.mcreator.jigsawponosdlc.item.PerdezhInBottleItem;
import net.mcreator.jigsawponosdlc.item.PerdezhDebugItem;
import net.mcreator.jigsawponosdlc.item.OpPiggunItem;
import net.mcreator.jigsawponosdlc.item.MaznyaEssenceItem;
import net.mcreator.jigsawponosdlc.item.FlintWreckerItem;
import net.mcreator.jigsawponosdlc.item.ExtinguisherItem;
import net.mcreator.jigsawponosdlc.item.BobrovuhaItem;
import net.mcreator.jigsawponosdlc.item.BeaverGunItem;
import net.mcreator.jigsawponosdlc.item.AutoForkItemItem;
import net.mcreator.jigsawponosdlc.item.AutoForkItem;
import net.mcreator.jigsawponosdlc.item.AdvancedBeaverCollarItem;
import net.mcreator.jigsawponosdlc.JigsawPonosDlcMod;

public class JigsawPonosDlcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JigsawPonosDlcMod.MODID);
	public static final RegistryObject<Item> PONOSBLOCK = block(JigsawPonosDlcModBlocks.PONOSBLOCK, JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS);
	public static final RegistryObject<Item> PONOS = REGISTRY.register("ponos", () -> new PonosItem());
	public static final RegistryObject<Item> FART_PROJECTILE = REGISTRY.register("fart_projectile", () -> new PerdezhDebugItem());
	public static final RegistryObject<Item> PUSHKA_PERDUSHKA = REGISTRY.register("pushka_perdushka", () -> new PushkaPerdushkaItem());
	public static final RegistryObject<Item> PERDEZH_IN_BOTTLE = REGISTRY.register("perdezh_in_bottle", () -> new PerdezhInBottleItem());
	public static final RegistryObject<Item> PERDEZH_BLOCK = block(JigsawPonosDlcModBlocks.PERDEZH_BLOCK, null);
	public static final RegistryObject<Item> ADVANCED_BEAVER_COLLAR = REGISTRY.register("advanced_beaver_collar", () -> new AdvancedBeaverCollarItem());
	public static final RegistryObject<Item> SHIT_WOOFER = block(JigsawPonosDlcModBlocks.SHIT_WOOFER, JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS);
	public static final RegistryObject<Item> PONOSTHROWER = REGISTRY.register("ponosthrower", () -> new PonosthrowerItem());
	public static final RegistryObject<Item> BRAWL_LEAVES = block(JigsawPonosDlcModBlocks.BRAWL_LEAVES, null);
	public static final RegistryObject<Item> FART_TURRET = block(JigsawPonosDlcModBlocks.FART_TURRET, JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS);
	public static final RegistryObject<Item> DIAMOND_IRON_BLOCK = block(JigsawPonosDlcModBlocks.DIAMOND_IRON_BLOCK, JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS);
	public static final RegistryObject<Item> PONOS_BOMB = REGISTRY.register("ponos_bomb", () -> new PonosBombItem());
	public static final RegistryObject<Item> AUTO_FORK = REGISTRY.register("auto_fork", () -> new AutoForkItem());
	public static final RegistryObject<Item> PIGGUN = REGISTRY.register("piggun", () -> new PiggunItem());
	public static final RegistryObject<Item> PIG_AMMO = REGISTRY.register("pig_ammo", () -> new PigAmmoItem());
	public static final RegistryObject<Item> ZOMBIE_BEAVER_SPAWN_EGG = REGISTRY.register("zombie_beaver_spawn_egg",
			() -> new ForgeSpawnEggItem(JigsawPonosDlcModEntities.ZOMBIE_BEAVER, -10040320, -3381760, new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS)));
	public static final RegistryObject<Item> OP_PIGGUN = REGISTRY.register("op_piggun", () -> new OpPiggunItem());
	public static final RegistryObject<Item> BEAVER_GUN = REGISTRY.register("beaver_gun", () -> new BeaverGunItem());
	public static final RegistryObject<Item> FLINT_WRECKER = REGISTRY.register("flint_wrecker", () -> new FlintWreckerItem());
	public static final RegistryObject<Item> AUTO_FORK_ITEM = REGISTRY.register("auto_fork_item", () -> new AutoForkItemItem());
	public static final RegistryObject<Item> EXTINGUISHER = REGISTRY.register("extinguisher", () -> new ExtinguisherItem());
	public static final RegistryObject<Item> MAZNYA_ESSENCE = REGISTRY.register("maznya_essence", () -> new MaznyaEssenceItem());
	public static final RegistryObject<Item> SLEDGE_DEBUG_LMB = REGISTRY.register("sledge_debug_lmb", () -> new SledgeDebugLMBItem());
	public static final RegistryObject<Item> SEXY_SLEDGEHAMMER = REGISTRY.register("sexy_sledgehammer", () -> new SexySledgehammerItem());
	public static final RegistryObject<Item> SLEDGE_DEBUG_RMB = REGISTRY.register("sledge_debug_rmb", () -> new SledgeDebugRMBItem());
	public static final RegistryObject<Item> PONOS_BOMB_ITEM = REGISTRY.register("ponos_bomb_item", () -> new PonosBombItemItem());
	public static final RegistryObject<Item> JAR = block(JigsawPonosDlcModBlocks.JAR, JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS);
	public static final RegistryObject<Item> JAR_FILLED = block(JigsawPonosDlcModBlocks.JAR_FILLED, null);
	public static final RegistryObject<Item> BOBROVUHA_INFUSING = block(JigsawPonosDlcModBlocks.BOBROVUHA_INFUSING, null);
	public static final RegistryObject<Item> BOBROVUHA_DONE = block(JigsawPonosDlcModBlocks.BOBROVUHA_DONE, null);
	public static final RegistryObject<Item> BOBROVUHA = REGISTRY.register("bobrovuha", () -> new BobrovuhaItem());
	public static final RegistryObject<Item> WAND_OF_MASS_DESTRUCTION = REGISTRY.register("wand_of_mass_destruction", () -> new WandOfMassDestructionItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
