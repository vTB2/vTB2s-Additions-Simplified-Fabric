package vtb2s.additions;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vtb2s.additions.block.*;
import vtb2s.additions.item.ModItems;

public class vTB2sAdditions implements ModInitializer {
	public static final String MOD_ID = "vtb2s_additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

	/*	addOreFeature("ore_marble", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_rare_marble", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_marble_mountain", BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN));
		addOreFeature("ore_calcite", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_calcite_mountain", BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN));
		addOreFeature("ore_prasiolite_quartz", BiomeSelectors.foundInOverworld());
		addOreFeature("ore_rose_nether_quartz", BiomeSelectors.foundInTheNether());
		addOreFeature("ore_smokey_nether_quartz", BiomeSelectors.foundInTheNether());
		addOreFeature("ore_crimson_nether_quartz", BiomeSelectors.includeByKey(Biomes.CRIMSON_FOREST));
		addOreFeature("ore_soul_nether_quartz", BiomeSelectors.includeByKey(Biomes.SOUL_SAND_VALLEY));
		addOreFeature("ore_infernal_nether_quartz", BiomeSelectors.includeByKey(Biomes.BASALT_DELTAS));
		addOreFeature("ore_end_indigo_quartz", BiomeSelectors.foundInTheEnd());
		//adding in 1.3.0			addOreFeature("ore_citrine",BiomeSelectors.foundInOverworld());
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
	}*/
	}
}
