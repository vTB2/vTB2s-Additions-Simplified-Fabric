package vtb2s.additions;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vtb2s.additions.block.*;
import vtb2s.additions.item.ModItems;

import java.util.function.Predicate;

public class vTB2sAdditions implements ModInitializer {
	public static final String MOD_ID = "vtb2s_additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModStoneBlocks.registerModStoneBlocks();
		ModQuartzBlocks.registerModQuartzBlocks();
		ModVanillaVariantBlocks.registerModVanillaVariantBlocks();
		ModOreBlocks.registerModOreBlocks();
		ModMiscBlocks.registerModMiscBlocks();
		ModColouredBlocks.registerModColouredBlocks();
		LOGGER.info("Registering Mod Blocks for " + MOD_ID);
		ModItems.registerModItems();

		addOreFeature("ore_marble", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_rare_marble", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_marble_mountain", BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN));
		addOreFeature("ore_calcite", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_calcite_mountain", BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN));
		addOreFeature("ore_prasiolite_quartz", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_rose_nether_quartz", BiomeSelectors.foundInTheNether());
		addOreFeature("ore_smokey_nether_quartz", BiomeSelectors.foundInTheNether());
		addOreFeature("ore_crimson_nether_quartz", BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST));
		addOreFeature("ore_soul_nether_quartz", BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY));
		addOreFeature("ore_infernal_nether_quartz", BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS));
		addOreFeature("ore_end_indigo_quartz", BiomeSelectors.foundInTheEnd());
		addOreFeature("ore_citrine",BiomeSelectors.foundInOverworld());
	}

	public static void addFeature(String featureName, Predicate<BiomeSelectionContext> biomeSelector, GenerationStep.Feature step) {
		BiomeModifications.addFeature(
				biomeSelector,
				step,
				RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MOD_ID, featureName)
				)
		);
	}

	public static void addOreFeature(String featureName, Predicate<BiomeSelectionContext> biomeSelector) {
		addFeature(featureName, biomeSelector, GenerationStep.Feature.UNDERGROUND_ORES);
	}
}
