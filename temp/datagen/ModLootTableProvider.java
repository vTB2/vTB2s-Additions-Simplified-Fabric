package vtb2s.additions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import static vtb2s.additions.block.ModStoneBlocks.*;
import static vtb2s.additions.block.ModQuartzBlocks.*;
import static vtb2s.additions.block.ModVanillaVariantBlocks.*;
import static vtb2s.additions.block.ModMiscBlocks.*;
import static vtb2s.additions.block.ModColouredBlocks.*;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //Marble
        addDrop(MARBLE);
        addDrop(MARBLE_STAIRS);
        addDrop(MARBLE_SLAB);
        addDrop(MARBLE_WALL);
        //Polished Marble
        addDrop(POLISHED_MARBLE);
        addDrop(POLISHED_MARBLE_SLAB);
        addDrop(POLISHED_MARBLE_STAIRS);
        addDrop(POLISHED_MARBLE_WALL);
        //Marble Bricks
        addDrop(MARBLE_BRICKS);
        addDrop(MARBLE_BRICK_STAIRS);
        addDrop(MARBLE_BRICK_SLAB);
        addDrop(MARBLE_BRICK_WALL);
        //Marble Tiles
        addDrop(MARBLE_TILES);
        addDrop(MARBLE_TILE_STAIRS);
        addDrop(MARBLE_TILE_SLAB);
        addDrop(MARBLE_TILE_WALL);

        //Misc
        //Polished Calcite
        addDrop(POLISHED_CALCITE);
        addDrop(POLISHED_CALCITE_STAIRS);
        addDrop(POLISHED_CALCITE_SLAB);
        addDrop(POLISHED_CALCITE_WALL);
        //Calcite Bricks
        addDrop(CALCITE_BRICKS);
        addDrop(CALCITE_BRICK_STAIRS);
        addDrop(CALCITE_BRICK_SLAB);
        addDrop(CALCITE_BRICK_WALL);
        //Calcite Tiles
        addDrop(CALCITE_TILES);
        addDrop(CALCITE_TILE_STAIRS);
        addDrop(CALCITE_TILE_SLAB);
        addDrop(CALCITE_TILE_WALL);

        
        //Mineral Bricks
        //Gold
        addDrop(GOLD_BRICKS);
        addDrop(GOLD_BRICK_STAIRS);
        addDrop(GOLD_BRICK_SLAB);
        addDrop(GOLD_BRICK_WALL);
        //Diamond
        addDrop(DIAMOND_BRICKS);
        addDrop(DIAMOND_BRICK_STAIRS);
        addDrop(DIAMOND_BRICK_SLAB);
        addDrop(DIAMOND_BRICK_WALL);
        //Netherite
        addDrop(NETHERITE_BRICKS);
        addDrop(NETHERITE_BRICK_STAIRS);
        addDrop(NETHERITE_BRICK_SLAB);
        addDrop(NETHERITE_BRICK_WALL);
        
        
        //Igneous Rocks Addons//
        //Andesite//
        //Andesite Bricks
        addDrop(ANDESITE_BRICKS);
        addDrop(ANDESITE_BRICK_STAIRS);
        addDrop(ANDESITE_BRICK_SLAB);
        addDrop(ANDESITE_BRICK_WALL);
        //Andesite Tiles
        addDrop(ANDESITE_TILES);
        addDrop(ANDESITE_TILE_STAIRS);
        addDrop(ANDESITE_TILE_SLAB);
        addDrop(ANDESITE_TILE_WALL);
        //Granite//
        //Granite Bricks
        addDrop(GRANITE_BRICKS);
        addDrop(GRANITE_BRICK_STAIRS);
        addDrop(GRANITE_BRICK_SLAB);
        addDrop(GRANITE_BRICK_WALL);
        //Granite Tiles
        addDrop(GRANITE_TILES);
        addDrop(GRANITE_TILE_STAIRS);
        addDrop(GRANITE_TILE_SLAB);
        addDrop(GRANITE_TILE_WALL);
        //Diorite//
        //Diorite Bricks
        addDrop(DIORITE_BRICKS);
        addDrop(DIORITE_BRICK_STAIRS);
        addDrop(DIORITE_BRICK_SLAB);
        addDrop(DIORITE_BRICK_WALL);
        //Diorite Tiles
        addDrop(DIORITE_TILES);
        addDrop(DIORITE_TILE_STAIRS);
        addDrop(DIORITE_TILE_SLAB);
        addDrop(DIORITE_TILE_WALL);


        //Basalt Family//
        //Refined Basalt
        addDrop(REFINED_BASALT);
        addDrop(REFINED_BASALT_STAIRS);
        addDrop(REFINED_BASALT_SLAB);
        addDrop(REFINED_BASALT_WALL);
        //Refined Basalt Bricks
        addDrop(REFINED_BASALT_BRICKS);
        addDrop(REFINED_BASALT_BRICK_STAIRS);
        addDrop(REFINED_BASALT_BRICK_SLAB);
        addDrop(REFINED_BASALT_BRICK_WALL);
        //Refined Basalt Tiles
        addDrop(REFINED_BASALT_TILES);
        addDrop(REFINED_BASALT_TILE_STAIRS);
        addDrop(REFINED_BASALT_TILE_SLAB);
        addDrop(REFINED_BASALT_TILE_WALL);
        
        
        //Dripstone Family//
        //Polished Dripstone
        addDrop(POLISHED_DRIPSTONE);
        addDrop(POLISHED_DRIPSTONE_STAIRS);
        addDrop(POLISHED_DRIPSTONE_SLAB);
        addDrop(POLISHED_DRIPSTONE_WALL);
        //Dripstone Bricks
        addDrop(DRIPSTONE_BRICKS);
        addDrop(DRIPSTONE_BRICK_STAIRS);
        addDrop(DRIPSTONE_BRICK_SLAB);
        addDrop(DRIPSTONE_BRICK_WALL);
        //Dripstone Tiles
        addDrop(DRIPSTONE_TILES);
        addDrop(DRIPSTONE_TILE_STAIRS);
        addDrop(DRIPSTONE_TILE_SLAB);
        addDrop(DRIPSTONE_TILE_WALL);
        
        
        //Rose Quartz Family//
        //Rose Quartz
        addDrop(ROSE_QUARTZ_BLOCK);
        addDrop(ROSE_QUARTZ_STAIRS);
        addDrop(ROSE_QUARTZ_SLAB);
        addDrop(ROSE_QUARTZ_WALL);
        //Rose Quartz Bricks
        addDrop(ROSE_QUARTZ_BRICKS);
        addDrop(ROSE_QUARTZ_BRICK_STAIRS);
        addDrop(ROSE_QUARTZ_BRICK_SLAB);
        addDrop(ROSE_QUARTZ_BRICK_WALL);
        //Rose Quartz Tiles
        addDrop(ROSE_QUARTZ_TILES);
        addDrop(ROSE_QUARTZ_TILE_STAIRS);
        addDrop(ROSE_QUARTZ_TILE_SLAB);
        addDrop(ROSE_QUARTZ_TILE_WALL);
        //Smooth Rose Quartz
        addDrop(SMOOTH_ROSE_QUARTZ);
        addDrop(SMOOTH_ROSE_QUARTZ_STAIRS);
        addDrop(SMOOTH_ROSE_QUARTZ_SLAB);
        addDrop(SMOOTH_ROSE_QUARTZ_WALL);
        //Crimson Quartz Family//
        //Crimson Quartz
        addDrop(CRIMSON_QUARTZ_BLOCK);
        addDrop(CRIMSON_QUARTZ_STAIRS);
        addDrop(CRIMSON_QUARTZ_SLAB);
        addDrop(CRIMSON_QUARTZ_WALL);
        //Crimson Quartz Bricks
        addDrop(CRIMSON_QUARTZ_BRICKS);
        addDrop(CRIMSON_QUARTZ_BRICK_STAIRS);
        addDrop(CRIMSON_QUARTZ_BRICK_SLAB);
        addDrop(CRIMSON_QUARTZ_BRICK_WALL);
        //Crimson Quartz Tiles
        addDrop(CRIMSON_QUARTZ_TILES);
        addDrop(CRIMSON_QUARTZ_TILE_STAIRS);
        addDrop(CRIMSON_QUARTZ_TILE_SLAB);
        addDrop(CRIMSON_QUARTZ_TILE_WALL);
        //Smooth Crimson Quartz
        addDrop(SMOOTH_CRIMSON_QUARTZ);
        addDrop(SMOOTH_CRIMSON_QUARTZ_STAIRS);
        addDrop(SMOOTH_CRIMSON_QUARTZ_SLAB);
        addDrop(SMOOTH_CRIMSON_QUARTZ_WALL);
        //Infernal Quartz Family//
        //Infernal Quartz
        addDrop(INFERNAL_QUARTZ_BLOCK);
        addDrop(INFERNAL_QUARTZ_STAIRS);
        addDrop(INFERNAL_QUARTZ_SLAB);
        addDrop(INFERNAL_QUARTZ_WALL);
        //Infernal Quartz Bricks
        addDrop(INFERNAL_QUARTZ_BRICKS);
        addDrop(INFERNAL_QUARTZ_BRICK_STAIRS);
        addDrop(INFERNAL_QUARTZ_BRICK_SLAB);
        addDrop(INFERNAL_QUARTZ_BRICK_WALL);
        //Infernal Quartz Tiles
        addDrop(INFERNAL_QUARTZ_TILES);
        addDrop(INFERNAL_QUARTZ_TILE_STAIRS);
        addDrop(INFERNAL_QUARTZ_TILE_SLAB);
        addDrop(INFERNAL_QUARTZ_TILE_WALL);
        //Smooth Infernal Quartz
        addDrop(SMOOTH_INFERNAL_QUARTZ);
        addDrop(SMOOTH_INFERNAL_QUARTZ_STAIRS);
        addDrop(SMOOTH_INFERNAL_QUARTZ_SLAB);
        addDrop(SMOOTH_INFERNAL_QUARTZ_WALL);
        //Smokey Quartz Family//
        //Smokey Quartz
        addDrop(SMOKEY_QUARTZ_BLOCK);
        addDrop(SMOKEY_QUARTZ_STAIRS);
        addDrop(SMOKEY_QUARTZ_SLAB);
        addDrop(SMOKEY_QUARTZ_WALL);
        //Smokey Quartz Bricks
        addDrop(SMOKEY_QUARTZ_BRICKS);
        addDrop(SMOKEY_QUARTZ_BRICK_STAIRS);
        addDrop(SMOKEY_QUARTZ_BRICK_SLAB);
        addDrop(SMOKEY_QUARTZ_BRICK_WALL);
        //Smokey Quartz Tiles
        addDrop(SMOKEY_QUARTZ_TILES);
        addDrop(SMOKEY_QUARTZ_TILE_STAIRS);
        addDrop(SMOKEY_QUARTZ_TILE_SLAB);
        addDrop(SMOKEY_QUARTZ_TILE_WALL);
        //Smooth Smokey Quartz
        addDrop(SMOOTH_SMOKEY_QUARTZ);
        addDrop(SMOOTH_SMOKEY_QUARTZ_STAIRS);
        addDrop(SMOOTH_SMOKEY_QUARTZ_SLAB);
        addDrop(SMOOTH_SMOKEY_QUARTZ_WALL);
        //Soul Quartz Family//
        //Soul Quartz
        addDrop(SOUL_QUARTZ_BLOCK);
        addDrop(SOUL_QUARTZ_STAIRS);
        addDrop(SOUL_QUARTZ_SLAB);
        addDrop(SOUL_QUARTZ_WALL);
        //Soul Quartz Bricks
        addDrop(SOUL_QUARTZ_BRICKS);
        addDrop(SOUL_QUARTZ_BRICK_STAIRS);
        addDrop(SOUL_QUARTZ_BRICK_SLAB);
        addDrop(SOUL_QUARTZ_BRICK_WALL);
        //Soul Quartz Tiles
        addDrop(SOUL_QUARTZ_TILES);
        addDrop(SOUL_QUARTZ_TILE_STAIRS);
        addDrop(SOUL_QUARTZ_TILE_SLAB);
        addDrop(SOUL_QUARTZ_TILE_WALL);
        //Smooth Soul Quartz
        addDrop(SMOOTH_SOUL_QUARTZ);
        addDrop(SMOOTH_SOUL_QUARTZ_STAIRS);
        addDrop(SMOOTH_SOUL_QUARTZ_SLAB);
        addDrop(SMOOTH_SOUL_QUARTZ_WALL);
        //Prasiolite Quartz Family//
        //Prasiolite Quartz
        addDrop(PRASIOLITE_QUARTZ_BLOCK);
        addDrop(PRASIOLITE_QUARTZ_STAIRS);
        addDrop(PRASIOLITE_QUARTZ_SLAB);
        addDrop(PRASIOLITE_QUARTZ_WALL);
        //Prasiolite Quartz Bricks
        addDrop(PRASIOLITE_QUARTZ_BRICKS);
        addDrop(PRASIOLITE_QUARTZ_BRICK_STAIRS);
        addDrop(PRASIOLITE_QUARTZ_BRICK_SLAB);
        addDrop(PRASIOLITE_QUARTZ_BRICK_WALL);
        //Prasiolite Quartz Tiles
        addDrop(PRASIOLITE_QUARTZ_TILES);
        addDrop(PRASIOLITE_QUARTZ_TILE_STAIRS);
        addDrop(PRASIOLITE_QUARTZ_TILE_SLAB);
        addDrop(PRASIOLITE_QUARTZ_TILE_WALL);
        //Smooth Prasiolite Quartz
        addDrop(SMOOTH_PRASIOLITE_QUARTZ);
        addDrop(SMOOTH_PRASIOLITE_QUARTZ_STAIRS);
        addDrop(SMOOTH_PRASIOLITE_QUARTZ_SLAB);
        addDrop(SMOOTH_PRASIOLITE_QUARTZ_WALL);
        //Indigo Quartz Family//
        //Indigo Quartz
        addDrop(INDIGO_QUARTZ_BLOCK);
        addDrop(INDIGO_QUARTZ_STAIRS);
        addDrop(INDIGO_QUARTZ_SLAB);
        addDrop(INDIGO_QUARTZ_WALL);
        //Indigo Quartz Bricks
        addDrop(INDIGO_QUARTZ_BRICKS);
        addDrop(INDIGO_QUARTZ_BRICK_STAIRS);
        addDrop(INDIGO_QUARTZ_BRICK_SLAB);
        addDrop(INDIGO_QUARTZ_BRICK_WALL);
        //Indigo Quartz Tiles
        addDrop(INDIGO_QUARTZ_TILES);
        addDrop(INDIGO_QUARTZ_TILE_STAIRS);
        addDrop(INDIGO_QUARTZ_TILE_SLAB);
        addDrop(INDIGO_QUARTZ_TILE_WALL);
        //Smooth Indigo Quartz
        addDrop(SMOOTH_INDIGO_QUARTZ);
        addDrop(SMOOTH_INDIGO_QUARTZ_STAIRS);
        addDrop(SMOOTH_INDIGO_QUARTZ_SLAB);
        addDrop(SMOOTH_INDIGO_QUARTZ_WALL);
        //Citrine Family//
        //Citrine
        addDrop(CITRINE_BLOCK);
        addDrop(CITRINE_STAIRS);
        addDrop(CITRINE_SLAB);
        addDrop(CITRINE_WALL);
        //Citrine Bricks
        addDrop(CITRINE_BRICKS);
        addDrop(CITRINE_BRICK_STAIRS);
        addDrop(CITRINE_BRICK_SLAB);
        addDrop(CITRINE_BRICK_WALL);
        //Citrine Tiles
        addDrop(CITRINE_TILES);
        addDrop(CITRINE_TILE_STAIRS);
        addDrop(CITRINE_TILE_SLAB);
        addDrop(CITRINE_TILE_WALL);
        //Smooth Citrine
        addDrop(SMOOTH_CITRINE);
        addDrop(SMOOTH_CITRINE_STAIRS);
        addDrop(SMOOTH_CITRINE_SLAB);
        addDrop(SMOOTH_CITRINE_WALL);


        //Amethyst Family/
        //Polished Amethyst
        addDrop(POLISHED_AMETHYST);
        addDrop(POLISHED_AMETHYST_STAIRS);
        addDrop(POLISHED_AMETHYST_SLAB);
        addDrop(POLISHED_AMETHYST_WALL);
        //Amethyst Bricks
        addDrop(AMETHYST_BRICKS);
        addDrop(AMETHYST_BRICK_STAIRS);
        addDrop(AMETHYST_BRICK_SLAB);
        addDrop(AMETHYST_BRICK_WALL);
        //Amethyst Tiles
        addDrop(AMETHYST_TILES);
        addDrop(AMETHYST_TILE_STAIRS);
        addDrop(AMETHYST_TILE_SLAB);
        addDrop(AMETHYST_TILE_WALL);
        //Smooth Amethyst
        addDrop(SMOOTH_AMETHYST);
        addDrop(SMOOTH_AMETHYST_STAIRS);
        addDrop(SMOOTH_AMETHYST_SLAB);
        addDrop(SMOOTH_AMETHYST_WALL);

        //Quartz Tiles//
        addDrop(QUARTZ_TILES);
        addDrop(QUARTZ_TILE_STAIRS);
        addDrop(QUARTZ_TILE_SLAB);
        addDrop(QUARTZ_TILE_WALL);


        //Vanilla Addons
        //Misc
        addDrop(STONE_WALL);
        addDrop(SMOOTH_STONE_STAIRS);
        addDrop(SMOOTH_STONE_WALL);
        addDrop(CALCITE_STAIRS);
        addDrop(CALCITE_SLAB);
        addDrop(CALCITE_WALL);
        addDrop(DRIPSTONE_STAIRS);
        addDrop(DRIPSTONE_SLAB);
        addDrop(DRIPSTONE_WALL);
        addDrop(POLISHED_ANDESITE_WALL);
        addDrop(POLISHED_GRANITE_WALL);
        addDrop(POLISHED_DIORITE_WALL);
        addDrop(SMOOTH_BASALT_STAIRS);
        addDrop(SMOOTH_BASALT_SLAB);
        addDrop(SMOOTH_BASALT_WALL);
        addDrop(AMETHYST_STAIRS);
        addDrop(AMETHYST_SLAB);
        addDrop(AMETHYST_WALL);


        //Quartz
        addDrop(QUARTZ_WALL);
        addDrop(SMOOTH_QUARTZ_WALL);
        addDrop(QUARTZ_BRICK_STAIRS);
        addDrop(QUARTZ_BRICK_SLAB);
        addDrop(QUARTZ_BRICK_WALL);

        //Concrete
        //White
        addDrop(WHITE_CONCRETE_STAIRS);
        addDrop(WHITE_CONCRETE_SLAB);
        addDrop(WHITE_CONCRETE_WALL);
        //Light Gray
        addDrop(LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(LIGHT_GRAY_CONCRETE_SLAB);
        addDrop(LIGHT_GRAY_CONCRETE_WALL);
        //Gray
        addDrop(GRAY_CONCRETE_STAIRS);
        addDrop(GRAY_CONCRETE_SLAB);
        addDrop(GRAY_CONCRETE_WALL);
        //Black
        addDrop(BLACK_CONCRETE_STAIRS);
        addDrop(BLACK_CONCRETE_SLAB);
        addDrop(BLACK_CONCRETE_WALL);
        //Brown
        addDrop(BROWN_CONCRETE_STAIRS);
        addDrop(BROWN_CONCRETE_SLAB);
        addDrop(BROWN_CONCRETE_WALL);
        //Red
        addDrop(RED_CONCRETE_STAIRS);
        addDrop(RED_CONCRETE_SLAB);
        addDrop(RED_CONCRETE_WALL);
        //Orange
        addDrop(ORANGE_CONCRETE_STAIRS);
        addDrop(ORANGE_CONCRETE_SLAB);
        addDrop(ORANGE_CONCRETE_WALL);
        //Yellow
        addDrop(YELLOW_CONCRETE_STAIRS);
        addDrop(YELLOW_CONCRETE_SLAB);
        addDrop(YELLOW_CONCRETE_WALL);
        //Lime
        addDrop(LIME_CONCRETE_STAIRS);
        addDrop(LIME_CONCRETE_SLAB);
        addDrop(LIME_CONCRETE_WALL);
        //Green
        addDrop(GREEN_CONCRETE_STAIRS);
        addDrop(GREEN_CONCRETE_SLAB);
        addDrop(GREEN_CONCRETE_WALL);
        //Cyan
        addDrop(CYAN_CONCRETE_STAIRS);
        addDrop(CYAN_CONCRETE_SLAB);
        addDrop(CYAN_CONCRETE_WALL);
        //Light Blue
        addDrop(LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(LIGHT_BLUE_CONCRETE_SLAB);
        addDrop(LIGHT_BLUE_CONCRETE_WALL);
        //Blue
        addDrop(BLUE_CONCRETE_STAIRS);
        addDrop(BLUE_CONCRETE_SLAB);
        addDrop(BLUE_CONCRETE_WALL);
        //Purple
        addDrop(PURPLE_CONCRETE_STAIRS);
        addDrop(PURPLE_CONCRETE_SLAB);
        addDrop(PURPLE_CONCRETE_WALL);
        //Magenta
        addDrop(MAGENTA_CONCRETE_STAIRS);
        addDrop(MAGENTA_CONCRETE_SLAB);
        addDrop(MAGENTA_CONCRETE_WALL);
        //Pink
        addDrop(PINK_CONCRETE_STAIRS);
        addDrop(PINK_CONCRETE_SLAB);
        addDrop(PINK_CONCRETE_WALL);

        //Stained Bricks
        addDrop(WHITE_STAINED_BRICKS);
        addDrop(WHITE_STAINED_BRICK_STAIRS);
        addDrop(WHITE_STAINED_BRICK_SLAB);
        addDrop(WHITE_STAINED_BRICK_WALL);
        addDrop(LIGHT_GRAY_STAINED_BRICKS);
        addDrop(LIGHT_GRAY_STAINED_BRICK_STAIRS);
        addDrop(LIGHT_GRAY_STAINED_BRICK_SLAB);
        addDrop(LIGHT_GRAY_STAINED_BRICK_WALL);
        addDrop(GRAY_STAINED_BRICKS);
        addDrop(GRAY_STAINED_BRICK_STAIRS);
        addDrop(GRAY_STAINED_BRICK_SLAB);
        addDrop(GRAY_STAINED_BRICK_WALL);
        addDrop(BLACK_STAINED_BRICKS);
        addDrop(BLACK_STAINED_BRICK_STAIRS);
        addDrop(BLACK_STAINED_BRICK_SLAB);
        addDrop(BLACK_STAINED_BRICK_WALL);
        addDrop(BROWN_STAINED_BRICKS);
        addDrop(BROWN_STAINED_BRICK_STAIRS);
        addDrop(BROWN_STAINED_BRICK_SLAB);
        addDrop(BROWN_STAINED_BRICK_WALL);
        addDrop(RED_STAINED_BRICKS);
        addDrop(RED_STAINED_BRICK_STAIRS);
        addDrop(RED_STAINED_BRICK_SLAB);
        addDrop(RED_STAINED_BRICK_WALL);
        addDrop(ORANGE_STAINED_BRICKS);
        addDrop(ORANGE_STAINED_BRICK_STAIRS);
        addDrop(ORANGE_STAINED_BRICK_SLAB);
        addDrop(ORANGE_STAINED_BRICK_WALL);
        addDrop(YELLOW_STAINED_BRICKS);
        addDrop(YELLOW_STAINED_BRICK_STAIRS);
        addDrop(YELLOW_STAINED_BRICK_SLAB);
        addDrop(YELLOW_STAINED_BRICK_WALL);
        addDrop(LIME_STAINED_BRICKS);
        addDrop(LIME_STAINED_BRICK_STAIRS);
        addDrop(LIME_STAINED_BRICK_SLAB);
        addDrop(LIME_STAINED_BRICK_WALL);
        addDrop(GREEN_STAINED_BRICKS);
        addDrop(GREEN_STAINED_BRICK_STAIRS);
        addDrop(GREEN_STAINED_BRICK_SLAB);
        addDrop(GREEN_STAINED_BRICK_WALL);
        addDrop(CYAN_STAINED_BRICKS);
        addDrop(CYAN_STAINED_BRICK_STAIRS);
        addDrop(CYAN_STAINED_BRICK_SLAB);
        addDrop(CYAN_STAINED_BRICK_WALL);
        addDrop(LIGHT_BLUE_STAINED_BRICKS);
        addDrop(LIGHT_BLUE_STAINED_BRICK_STAIRS);
        addDrop(LIGHT_BLUE_STAINED_BRICK_SLAB);
        addDrop(LIGHT_BLUE_STAINED_BRICK_WALL);
        addDrop(BLUE_STAINED_BRICKS);
        addDrop(BLUE_STAINED_BRICK_STAIRS);
        addDrop(BLUE_STAINED_BRICK_SLAB);
        addDrop(BLUE_STAINED_BRICK_WALL);
        addDrop(PURPLE_STAINED_BRICKS);
        addDrop(PURPLE_STAINED_BRICK_STAIRS);
        addDrop(PURPLE_STAINED_BRICK_SLAB);
        addDrop(PURPLE_STAINED_BRICK_WALL);
        addDrop(MAGENTA_STAINED_BRICKS);
        addDrop(MAGENTA_STAINED_BRICK_STAIRS);
        addDrop(MAGENTA_STAINED_BRICK_SLAB);
        addDrop(MAGENTA_STAINED_BRICK_WALL);
        addDrop(PINK_STAINED_BRICKS);
        addDrop(PINK_STAINED_BRICK_STAIRS);
        addDrop(PINK_STAINED_BRICK_SLAB);
        addDrop(PINK_STAINED_BRICK_WALL);
    }

}
