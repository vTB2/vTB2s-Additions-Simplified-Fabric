package vtb2s.additions;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
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

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		addOreFeature("ore_marble", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_rare_marble", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_marble_mountain", BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN));
		addOreFeature("ore_calcite", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_calcite_mountain", BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN));
		addOreFeature("ore_prasiolite_quartz", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_nether_rose_quartz", BiomeSelectors.foundInTheNether());
		addOreFeature("ore_nether_smokey_quartz", BiomeSelectors.foundInTheNether());
		addOreFeature("ore_nether_crimson_quartz", BiomeSelectors.includeByKey(Biomes.CRIMSON_FOREST));
		addOreFeature("ore_nether_soul_quartz", BiomeSelectors.includeByKey(Biomes.SOUL_SAND_VALLEY));
		addOreFeature("ore_nether_infernal_quartz", BiomeSelectors.includeByKey(Biomes.BASALT_DELTAS));
		addOreFeature("ore_end_indigo_quartz", BiomeSelectors.foundInTheEnd());
	}

	public static void addFeature(String featureName, Predicate<BiomeSelectionContext> biomeSelector, GenerationStep.Decoration step) {
		BiomeModifications.addFeature(
				biomeSelector,
				step,
				ResourceKey.create(
						Registries.PLACED_FEATURE,
						Identifier.fromNamespaceAndPath(MOD_ID, featureName)
				)
		);
	}

	public static void addOreFeature(String featureName, Predicate<BiomeSelectionContext> biomeSelector) {
		addFeature(featureName, biomeSelector, GenerationStep.Decoration.UNDERGROUND_ORES);
	}
}
