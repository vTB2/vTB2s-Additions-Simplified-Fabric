package vtb2s.additions.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.TagsProvider;
import org.jspecify.annotations.NonNull;
import vtb2s.additions.block.ModColouredBlocks;

import static vtb2s.additions.block.ModStoneBlocks.*;
import static vtb2s.additions.block.ModQuartzBlocks.*;
import static vtb2s.additions.block.ModOreBlocks.*;
import static vtb2s.additions.block.ModVanillaVariantBlocks.*;
import static vtb2s.additions.block.ModMiscBlocks.*;
import static vtb2s.additions.block.ModColouredBlocks.*;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends TagsProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.@NonNull WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                //Marble
                .add(MARBLE)
                .add(MARBLE_STAIRS)
                .add(MARBLE_SLAB)
                .add(MARBLE_WALL)
                //Polished Marble
                .add(POLISHED_MARBLE)
                .add(POLISHED_MARBLE_STAIRS)
                .add(POLISHED_MARBLE_SLAB)
                .add(POLISHED_MARBLE_WALL)
                //Marble Bricks
                .add(MARBLE_BRICKS)
                .add(MARBLE_BRICK_STAIRS)
                .add(MARBLE_BRICK_SLAB)
                .add(MARBLE_BRICK_WALL)
                //Marble Tiles
                .add(MARBLE_TILES)
                .add(MARBLE_TILE_STAIRS)
                .add(MARBLE_TILE_SLAB)
                .add(MARBLE_TILE_WALL)

                //Misc
                //Calcite Family//
                //Polished Calcite
                .add(POLISHED_CALCITE)
                .add(POLISHED_CALCITE_STAIRS)
                .add(POLISHED_CALCITE_SLAB)
                .add(POLISHED_CALCITE_WALL)
                //Calcite Bricks
                .add(CALCITE_BRICKS)
                .add(CALCITE_BRICK_STAIRS)
                .add(CALCITE_BRICK_SLAB)
                .add(CALCITE_BRICK_WALL)
                //Calcite Tiles
                .add(CALCITE_TILES)
                .add(CALCITE_TILE_STAIRS)
                .add(CALCITE_TILE_SLAB)
                .add(CALCITE_TILE_WALL)


                //Basalt Family//
                //Refined Basalt
                .add(REFINED_BASALT)
                .add(REFINED_BASALT_STAIRS)
                .add(REFINED_BASALT_SLAB)
                .add(REFINED_BASALT_WALL)
                //Refined Basalt Bricks
                .add(REFINED_BASALT_BRICKS)
                .add(REFINED_BASALT_BRICK_STAIRS)
                .add(REFINED_BASALT_BRICK_SLAB)
                .add(REFINED_BASALT_BRICK_WALL)
                //Refined Basalt Tiles
                .add(REFINED_BASALT_TILES)
                .add(REFINED_BASALT_TILE_STAIRS)
                .add(REFINED_BASALT_TILE_SLAB)
                .add(REFINED_BASALT_TILE_WALL)
                
                
                //Dripstone Family//
                //Polished Dripstone
                .add(POLISHED_DRIPSTONE)
                .add(POLISHED_DRIPSTONE_STAIRS)
                .add(POLISHED_DRIPSTONE_SLAB)
                .add(POLISHED_DRIPSTONE_WALL)
                //Dripstone Bricks
                .add(DRIPSTONE_BRICKS)
                .add(DRIPSTONE_BRICK_STAIRS)
                .add(DRIPSTONE_BRICK_SLAB)
                .add(DRIPSTONE_BRICK_WALL)
                //Dripstone Tiles
                .add(DRIPSTONE_TILES)
                .add(DRIPSTONE_TILE_STAIRS)
                .add(DRIPSTONE_TILE_SLAB)
                .add(DRIPSTONE_TILE_WALL)


                //Mineral Bricks//
                //Gold
                .add(GOLD_BRICKS)
                .add(GOLD_BRICK_STAIRS)
                .add(GOLD_BRICK_SLAB)
                .add(GOLD_BRICK_WALL)
                //Diamond
                .add(DIAMOND_BRICKS)
                .add(DIAMOND_BRICK_STAIRS)
                .add(DIAMOND_BRICK_SLAB)
                .add(DIAMOND_BRICK_WALL)
                //Netherite
                .add(NETHERITE_BRICKS)
                .add(NETHERITE_BRICK_STAIRS)
                .add(NETHERITE_BRICK_SLAB)
                .add(NETHERITE_BRICK_WALL)


                //Igneous Rocks Addons//
                //Andesite//
                //Andesite Bricks
                .add(ANDESITE_BRICKS)
                .add(ANDESITE_BRICK_STAIRS)
                .add(ANDESITE_BRICK_SLAB)
                .add(ANDESITE_BRICK_WALL)
                //Andesite Tiles
                .add(ANDESITE_TILES)
                .add(ANDESITE_TILE_STAIRS)
                .add(ANDESITE_TILE_SLAB)
                .add(ANDESITE_TILE_WALL)
                //Granite//
                //Granite Bricks
                .add(GRANITE_BRICKS)
                .add(GRANITE_BRICK_STAIRS)
                .add(GRANITE_BRICK_SLAB)
                .add(GRANITE_BRICK_WALL)
                //Granite Tiles
                .add(GRANITE_TILES)
                .add(GRANITE_TILE_STAIRS)
                .add(GRANITE_TILE_SLAB)
                .add(GRANITE_TILE_WALL)
                //Diorite//
                //Diorite Bricks
                .add(DIORITE_BRICKS)
                .add(DIORITE_BRICK_STAIRS)
                .add(DIORITE_BRICK_SLAB)
                .add(DIORITE_BRICK_WALL)
                //Diorite Tiles
                .add(DIORITE_TILES)
                .add(DIORITE_TILE_STAIRS)
                .add(DIORITE_TILE_SLAB)
                .add(DIORITE_TILE_WALL)


                //Quartz//
                //Rose Quartz Family//
                .add(ROSE_NETHER_QUARTZ_ORE)
                //Rose Quartz
                .add(ROSE_QUARTZ_BLOCK)
                .add(ROSE_QUARTZ_STAIRS)
                .add(ROSE_QUARTZ_SLAB)
                .add(ROSE_QUARTZ_WALL)
                //Rose Quartz Bricks
                .add(ROSE_QUARTZ_BRICKS)
                .add(ROSE_QUARTZ_BRICK_STAIRS)
                .add(ROSE_QUARTZ_BRICK_SLAB)
                .add(ROSE_QUARTZ_BRICK_WALL)
                //Rose Quartz Tiles
                .add(ROSE_QUARTZ_TILES)
                .add(ROSE_QUARTZ_TILE_STAIRS)
                .add(ROSE_QUARTZ_TILE_SLAB)
                .add(ROSE_QUARTZ_TILE_WALL)
                //Smooth Rose Quartz
                .add(SMOOTH_ROSE_QUARTZ)
                .add(SMOOTH_ROSE_QUARTZ_STAIRS)
                .add(SMOOTH_ROSE_QUARTZ_SLAB)
                .add(SMOOTH_ROSE_QUARTZ_WALL)
                //Crimson Quartz Family//
                .add(CRIMSON_NETHER_QUARTZ_ORE)
                //Crimson Quartz
                .add(CRIMSON_QUARTZ_BLOCK)
                .add(CRIMSON_QUARTZ_STAIRS)
                .add(CRIMSON_QUARTZ_SLAB)
                .add(CRIMSON_QUARTZ_WALL)
                //Crimson Quartz Bricks
                .add(CRIMSON_QUARTZ_BRICKS)
                .add(CRIMSON_QUARTZ_BRICK_STAIRS)
                .add(CRIMSON_QUARTZ_BRICK_SLAB)
                .add(CRIMSON_QUARTZ_BRICK_WALL)
                //Crimson Quartz Tiles
                .add(CRIMSON_QUARTZ_TILES)
                .add(CRIMSON_QUARTZ_TILE_STAIRS)
                .add(CRIMSON_QUARTZ_TILE_SLAB)
                .add(CRIMSON_QUARTZ_TILE_WALL)
                //Smooth Crimson Quartz
                .add(SMOOTH_CRIMSON_QUARTZ)
                .add(SMOOTH_CRIMSON_QUARTZ_STAIRS)
                .add(SMOOTH_CRIMSON_QUARTZ_SLAB)
                .add(SMOOTH_CRIMSON_QUARTZ_WALL)
                //Infernal Quartz Family//
                .add(INFERNAL_NETHER_QUARTZ_ORE)
                //Infernal Quartz
                .add(INFERNAL_QUARTZ_BLOCK)
                .add(INFERNAL_QUARTZ_STAIRS)
                .add(INFERNAL_QUARTZ_SLAB)
                .add(INFERNAL_QUARTZ_WALL)
                //Infernal Quartz Bricks
                .add(INFERNAL_QUARTZ_BRICKS)
                .add(INFERNAL_QUARTZ_BRICK_STAIRS)
                .add(INFERNAL_QUARTZ_BRICK_SLAB)
                .add(INFERNAL_QUARTZ_BRICK_WALL)
                //Infernal Quartz Tiles
                .add(INFERNAL_QUARTZ_TILES)
                .add(INFERNAL_QUARTZ_TILE_STAIRS)
                .add(INFERNAL_QUARTZ_TILE_SLAB)
                .add(INFERNAL_QUARTZ_TILE_WALL)
                //Smooth Infernal Quartz
                .add(SMOOTH_INFERNAL_QUARTZ)
                .add(SMOOTH_INFERNAL_QUARTZ_STAIRS)
                .add(SMOOTH_INFERNAL_QUARTZ_SLAB)
                .add(SMOOTH_INFERNAL_QUARTZ_WALL)
                //Smokey Quartz Family//
                .add(SMOKEY_NETHER_QUARTZ_ORE)
                //Smokey Quartz
                .add(SMOKEY_QUARTZ_BLOCK)
                .add(SMOKEY_QUARTZ_STAIRS)
                .add(SMOKEY_QUARTZ_SLAB)
                .add(SMOKEY_QUARTZ_WALL)
                //Smokey Quartz Bricks
                .add(SMOKEY_QUARTZ_BRICKS)
                .add(SMOKEY_QUARTZ_BRICK_STAIRS)
                .add(SMOKEY_QUARTZ_BRICK_SLAB)
                .add(SMOKEY_QUARTZ_BRICK_WALL)
                //Smokey Quartz Tiles
                .add(SMOKEY_QUARTZ_TILES)
                .add(SMOKEY_QUARTZ_TILE_STAIRS)
                .add(SMOKEY_QUARTZ_TILE_SLAB)
                .add(SMOKEY_QUARTZ_TILE_WALL)
                //Smooth Smokey Quartz
                .add(SMOOTH_SMOKEY_QUARTZ)
                .add(SMOOTH_SMOKEY_QUARTZ_STAIRS)
                .add(SMOOTH_SMOKEY_QUARTZ_SLAB)
                .add(SMOOTH_SMOKEY_QUARTZ_WALL)
                //Soul Quartz Family//
                //Soul Quartz
                .add(SOUL_QUARTZ_BLOCK)
                .add(SOUL_QUARTZ_STAIRS)
                .add(SOUL_QUARTZ_SLAB)
                .add(SOUL_QUARTZ_WALL)
                //Soul Quartz Bricks
                .add(SOUL_QUARTZ_BRICKS)
                .add(SOUL_QUARTZ_BRICK_STAIRS)
                .add(SOUL_QUARTZ_BRICK_SLAB)
                .add(SOUL_QUARTZ_BRICK_WALL)
                //Soul Quartz Tiles
                .add(SOUL_QUARTZ_TILES)
                .add(SOUL_QUARTZ_TILE_STAIRS)
                .add(SOUL_QUARTZ_TILE_SLAB)
                .add(SOUL_QUARTZ_TILE_WALL)
                //Smooth Soul Quartz
                .add(SMOOTH_SOUL_QUARTZ)
                .add(SMOOTH_SOUL_QUARTZ_STAIRS)
                .add(SMOOTH_SOUL_QUARTZ_SLAB)
                .add(SMOOTH_SOUL_QUARTZ_WALL)
                //Prasiolite Quartz Family//
                .add(PRASIOLITE_QUARTZ_ORE)
                //Prasiolite Quartz
                .add(PRASIOLITE_QUARTZ_BLOCK)
                .add(PRASIOLITE_QUARTZ_STAIRS)
                .add(PRASIOLITE_QUARTZ_SLAB)
                .add(PRASIOLITE_QUARTZ_WALL)
                //Prasiolite Quartz Bricks
                .add(PRASIOLITE_QUARTZ_BRICKS)
                .add(PRASIOLITE_QUARTZ_BRICK_STAIRS)
                .add(PRASIOLITE_QUARTZ_BRICK_SLAB)
                .add(PRASIOLITE_QUARTZ_BRICK_WALL)
                //Prasiolite Quartz Tiles
                .add(PRASIOLITE_QUARTZ_TILES)
                .add(PRASIOLITE_QUARTZ_TILE_STAIRS)
                .add(PRASIOLITE_QUARTZ_TILE_SLAB)
                .add(PRASIOLITE_QUARTZ_TILE_WALL)
                //Smooth Prasiolite Quartz
                .add(SMOOTH_PRASIOLITE_QUARTZ)
                .add(SMOOTH_PRASIOLITE_QUARTZ_STAIRS)
                .add(SMOOTH_PRASIOLITE_QUARTZ_SLAB)
                .add(SMOOTH_PRASIOLITE_QUARTZ_WALL)
                //Indigo Quartz Family//
                .add(END_INDIGO_QUARTZ_ORE)
                //Indigo Quartz
                .add(INDIGO_QUARTZ_BLOCK)
                .add(INDIGO_QUARTZ_STAIRS)
                .add(INDIGO_QUARTZ_SLAB)
                .add(INDIGO_QUARTZ_WALL)
                //Indigo Quartz Bricks
                .add(INDIGO_QUARTZ_BRICKS)
                .add(INDIGO_QUARTZ_BRICK_STAIRS)
                .add(INDIGO_QUARTZ_BRICK_SLAB)
                .add(INDIGO_QUARTZ_BRICK_WALL)
                //Indigo Quartz Tiles
                .add(INDIGO_QUARTZ_TILES)
                .add(INDIGO_QUARTZ_TILE_STAIRS)
                .add(INDIGO_QUARTZ_TILE_SLAB)
                .add(INDIGO_QUARTZ_TILE_WALL)
                //Smooth Indigo Quartz
                .add(SMOOTH_INDIGO_QUARTZ)
                .add(SMOOTH_INDIGO_QUARTZ_STAIRS)
                .add(SMOOTH_INDIGO_QUARTZ_SLAB)
                .add(SMOOTH_INDIGO_QUARTZ_WALL)
                //Citrine Family//
                .add(CITRINE_ORE)
                //Citrine 
                .add(CITRINE_BLOCK)
                .add(CITRINE_STAIRS)
                .add(CITRINE_SLAB)
                .add(CITRINE_WALL)
                //Citrine Bricks
                .add(CITRINE_BRICKS)
                .add(CITRINE_BRICK_STAIRS)
                .add(CITRINE_BRICK_SLAB)
                .add(CITRINE_BRICK_WALL)
                //Citrine Tiles
                .add(CITRINE_TILES)
                .add(CITRINE_TILE_STAIRS)
                .add(CITRINE_TILE_SLAB)
                .add(CITRINE_TILE_WALL)
                //Smooth Citrine 
                .add(SMOOTH_CITRINE)
                .add(SMOOTH_CITRINE_STAIRS)
                .add(SMOOTH_CITRINE_SLAB)
                .add(SMOOTH_CITRINE_WALL)


                //Amethyst Family//
                //Polished Amethyst
                .add(POLISHED_AMETHYST)
                .add(POLISHED_AMETHYST_STAIRS)
                .add(POLISHED_AMETHYST_SLAB)
                .add(POLISHED_AMETHYST_WALL)
                //Amethyst Bricks
                .add(AMETHYST_BRICKS)
                .add(AMETHYST_BRICK_STAIRS)
                .add(AMETHYST_BRICK_SLAB)
                .add(AMETHYST_BRICK_WALL)
                //Amethyst Tiles
                .add(AMETHYST_TILES)
                .add(AMETHYST_TILE_STAIRS)
                .add(AMETHYST_TILE_SLAB)
                .add(AMETHYST_TILE_WALL)
                //Smooth Amethyst
                .add(SMOOTH_AMETHYST)
                .add(SMOOTH_AMETHYST_STAIRS)
                .add(SMOOTH_AMETHYST_SLAB)
                .add(SMOOTH_AMETHYST_WALL)
                
                //Quartz Tiles//
                .add(QUARTZ_TILES)
                .add(QUARTZ_TILE_STAIRS)
                .add(QUARTZ_TILE_SLAB)
                .add(QUARTZ_TILE_WALL)


                //Misc
                .add(STONE_WALL)
                .add(SMOOTH_STONE_STAIRS)
                .add(SMOOTH_STONE_WALL)
                .add(CALCITE_STAIRS)
                .add(CALCITE_SLAB)
                .add(CALCITE_WALL)
                .add(DRIPSTONE_STAIRS)
                .add(DRIPSTONE_SLAB)
                .add(DRIPSTONE_WALL)
                .add(POLISHED_ANDESITE_WALL)
                .add(POLISHED_GRANITE_WALL)
                .add(POLISHED_DIORITE_WALL)
                .add(SMOOTH_BASALT_STAIRS)
                .add(SMOOTH_BASALT_SLAB)
                .add(SMOOTH_BASALT_WALL)
                .add(AMETHYST_STAIRS)
                .add(AMETHYST_SLAB)
                .add(AMETHYST_WALL)

                .add(QUARTZ_WALL)
                .add(SMOOTH_QUARTZ_WALL)
                .add(QUARTZ_BRICK_STAIRS)
                .add(QUARTZ_BRICK_SLAB)
                .add(QUARTZ_BRICK_WALL)

                //Stained Bricks
                .add(ModColouredBlocks.WHITE_STAINED_BRICKS)
                .add(ModColouredBlocks.WHITE_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.WHITE_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.WHITE_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.LIGHT_GRAY_STAINED_BRICKS)
                .add(ModColouredBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.LIGHT_GRAY_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.GRAY_STAINED_BRICKS)
                .add(ModColouredBlocks.GRAY_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.GRAY_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.GRAY_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.BLACK_STAINED_BRICKS)
                .add(ModColouredBlocks.BLACK_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.BLACK_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.BLACK_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.BROWN_STAINED_BRICKS)
                .add(ModColouredBlocks.BROWN_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.BROWN_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.BROWN_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.RED_STAINED_BRICKS)
                .add(ModColouredBlocks.RED_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.RED_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.RED_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.ORANGE_STAINED_BRICKS)
                .add(ModColouredBlocks.ORANGE_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.ORANGE_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.ORANGE_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.YELLOW_STAINED_BRICKS)
                .add(ModColouredBlocks.YELLOW_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.YELLOW_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.YELLOW_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.LIME_STAINED_BRICKS)
                .add(ModColouredBlocks.LIME_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.LIME_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.LIME_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.GREEN_STAINED_BRICKS)
                .add(ModColouredBlocks.GREEN_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.GREEN_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.GREEN_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.CYAN_STAINED_BRICKS)
                .add(ModColouredBlocks.CYAN_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.CYAN_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.CYAN_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.LIGHT_BLUE_STAINED_BRICKS)
                .add(ModColouredBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.LIGHT_BLUE_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.BLUE_STAINED_BRICKS)
                .add(ModColouredBlocks.BLUE_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.BLUE_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.BLUE_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.PURPLE_STAINED_BRICKS)
                .add(ModColouredBlocks.PURPLE_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.PURPLE_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.PURPLE_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.MAGENTA_STAINED_BRICKS)
                .add(ModColouredBlocks.MAGENTA_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.MAGENTA_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.MAGENTA_STAINED_BRICK_WALL)
                .add(ModColouredBlocks.PINK_STAINED_BRICKS)
                .add(ModColouredBlocks.PINK_STAINED_BRICK_STAIRS)
                .add(ModColouredBlocks.PINK_STAINED_BRICK_SLAB)
                .add(ModColouredBlocks.PINK_STAINED_BRICK_WALL)
        
                //Concrete
                //White
                .add(ModColouredBlocks.WHITE_CONCRETE_STAIRS)
                .add(ModColouredBlocks.WHITE_CONCRETE_SLAB)
                .add(ModColouredBlocks.WHITE_CONCRETE_WALL)
                //Light Gray
                .add(ModColouredBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
                .add(ModColouredBlocks.LIGHT_GRAY_CONCRETE_SLAB)
                .add(ModColouredBlocks.LIGHT_GRAY_CONCRETE_WALL)
                //Gray
                .add(ModColouredBlocks.GRAY_CONCRETE_STAIRS)
                .add(ModColouredBlocks.GRAY_CONCRETE_SLAB)
                .add(ModColouredBlocks.GRAY_CONCRETE_WALL)
                //Black
                .add(ModColouredBlocks.BLACK_CONCRETE_STAIRS)
                .add(ModColouredBlocks.BLACK_CONCRETE_SLAB)
                .add(ModColouredBlocks.BLACK_CONCRETE_WALL)
                //Brown
                .add(ModColouredBlocks.BROWN_CONCRETE_STAIRS)
                .add(ModColouredBlocks.BROWN_CONCRETE_SLAB)
                .add(ModColouredBlocks.BROWN_CONCRETE_WALL)
                //Red
                .add(ModColouredBlocks.RED_CONCRETE_STAIRS)
                .add(ModColouredBlocks.RED_CONCRETE_SLAB)
                .add(ModColouredBlocks.RED_CONCRETE_WALL)
                //Orange
                .add(ModColouredBlocks.ORANGE_CONCRETE_STAIRS)
                .add(ModColouredBlocks.ORANGE_CONCRETE_SLAB)
                .add(ModColouredBlocks.ORANGE_CONCRETE_WALL)
                //Yellow
                .add(ModColouredBlocks.YELLOW_CONCRETE_STAIRS)
                .add(ModColouredBlocks.YELLOW_CONCRETE_SLAB)
                .add(ModColouredBlocks.YELLOW_CONCRETE_WALL)
                //Lime
                .add(ModColouredBlocks.LIME_CONCRETE_STAIRS)
                .add(ModColouredBlocks.LIME_CONCRETE_SLAB)
                .add(ModColouredBlocks.LIME_CONCRETE_WALL)
                //Green
                .add(ModColouredBlocks.GREEN_CONCRETE_STAIRS)
                .add(ModColouredBlocks.GREEN_CONCRETE_SLAB)
                .add(ModColouredBlocks.GREEN_CONCRETE_WALL)
                //Cyan
                .add(ModColouredBlocks.CYAN_CONCRETE_STAIRS)
                .add(ModColouredBlocks.CYAN_CONCRETE_SLAB)
                .add(ModColouredBlocks.CYAN_CONCRETE_WALL)
                //Light Blue
                .add(ModColouredBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
                .add(ModColouredBlocks.LIGHT_BLUE_CONCRETE_SLAB)
                .add(ModColouredBlocks.LIGHT_BLUE_CONCRETE_WALL)
                //Blue
                .add(ModColouredBlocks.BLUE_CONCRETE_STAIRS)
                .add(ModColouredBlocks.BLUE_CONCRETE_SLAB)
                .add(ModColouredBlocks.BLUE_CONCRETE_WALL)
                //Purple
                .add(ModColouredBlocks.PURPLE_CONCRETE_STAIRS)
                .add(ModColouredBlocks.PURPLE_CONCRETE_SLAB)
                .add(ModColouredBlocks.PURPLE_CONCRETE_WALL)
                //Magenta
                .add(ModColouredBlocks.MAGENTA_CONCRETE_STAIRS)
                .add(ModColouredBlocks.MAGENTA_CONCRETE_SLAB)
                .add(ModColouredBlocks.MAGENTA_CONCRETE_WALL)
                //Pink
                .add(ModColouredBlocks.PINK_CONCRETE_STAIRS)
                .add(ModColouredBlocks.PINK_CONCRETE_SLAB)
                .add(ModColouredBlocks.PINK_CONCRETE_WALL);

        valueLookupBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(SOUL_NETHER_QUARTZ_ORE);

        valueLookupBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .add(SOUL_NETHER_QUARTZ_ORE)
                .add(SOUL_QUARTZ_BLOCK)
                .add(SOUL_QUARTZ_BRICKS)
                .add(SOUL_QUARTZ_TILES)
                .add(SMOOTH_SOUL_QUARTZ);

        valueLookupBuilder(BlockTags.SOUL_SPEED_BLOCKS)
                .add(SOUL_NETHER_QUARTZ_ORE);

        valueLookupBuilder(BlockTags.OVERWORLD_CARVER_REPLACEABLES)
                .add(MARBLE);

        valueLookupBuilder(BlockTags.BASE_STONE_OVERWORLD)
                .add(MARBLE);

        valueLookupBuilder(BlockTags.SCULK_REPLACEABLE_WORLD_GEN)
                .add(MARBLE);

        valueLookupBuilder(BlockTags.MOSS_REPLACEABLE)
                .add(MARBLE);

        valueLookupBuilder(BlockTags.AZALEA_ROOT_REPLACEABLE)
                .add(MARBLE);

        valueLookupBuilder(BlockTags.BATS_SPAWNABLE_ON)
                .add(MARBLE);

        valueLookupBuilder(BlockTags.DRIPSTONE_REPLACEABLE_BLOCKS)
                .add(MARBLE);

        valueLookupBuilder(BlockTags.LUSH_GROUND_REPLACEABLE)
                .add(MARBLE);

        valueLookupBuilder(BlockTags.STONE_ORE_REPLACEABLES)
                .add(MARBLE);

        valueLookupBuilder(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(GOLD_BRICKS)
                .add(GOLD_BRICK_STAIRS)
                .add(GOLD_BRICK_SLAB)
                .add(GOLD_BRICK_WALL)
                .add(DIAMOND_BRICKS)
                .add(DIAMOND_BRICK_STAIRS)
                .add(DIAMOND_BRICK_SLAB)
                .add(DIAMOND_BRICK_WALL)
                .add(NETHERITE_BRICKS)
                .add(NETHERITE_BRICK_STAIRS)
                .add(NETHERITE_BRICK_SLAB)
                .add(NETHERITE_BRICK_WALL)
                .add(END_INDIGO_QUARTZ_ORE);

        valueLookupBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(GOLD_BRICKS)
                .add(GOLD_BRICK_STAIRS)
                .add(GOLD_BRICK_SLAB)
                .add(GOLD_BRICK_WALL)
                .add(DIAMOND_BRICKS)
                .add(DIAMOND_BRICK_STAIRS)
                .add(DIAMOND_BRICK_SLAB)
                .add(DIAMOND_BRICK_WALL)
                .add(NETHERITE_BRICKS)
                .add(NETHERITE_BRICK_STAIRS)
                .add(NETHERITE_BRICK_SLAB)
                .add(NETHERITE_BRICK_WALL)
                .add(END_INDIGO_QUARTZ_ORE);

        valueLookupBuilder(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(GOLD_BRICKS)
                .add(GOLD_BRICK_STAIRS)
                .add(GOLD_BRICK_SLAB)
                .add(GOLD_BRICK_WALL)
                .add(DIAMOND_BRICKS)
                .add(DIAMOND_BRICK_STAIRS)
                .add(DIAMOND_BRICK_SLAB)
                .add(DIAMOND_BRICK_WALL)
                .add(NETHERITE_BRICKS)
                .add(NETHERITE_BRICK_STAIRS)
                .add(NETHERITE_BRICK_SLAB)
                .add(NETHERITE_BRICK_WALL)
                .add(END_INDIGO_QUARTZ_ORE);

        valueLookupBuilder(BlockTags.INCORRECT_FOR_COPPER_TOOL)

                .add(GOLD_BRICKS)
                .add(GOLD_BRICK_STAIRS)
                .add(GOLD_BRICK_SLAB)
                .add(GOLD_BRICK_WALL)
                .add(DIAMOND_BRICKS)
                .add(DIAMOND_BRICK_STAIRS)
                .add(DIAMOND_BRICK_SLAB)
                .add(DIAMOND_BRICK_WALL)
                .add(NETHERITE_BRICKS)
                .add(NETHERITE_BRICK_STAIRS)
                .add(NETHERITE_BRICK_SLAB)
                .add(NETHERITE_BRICK_WALL)
                .add(END_INDIGO_QUARTZ_ORE);

        valueLookupBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(NETHERITE_BRICKS)
                .add(NETHERITE_BRICK_STAIRS)
                .add(NETHERITE_BRICK_SLAB)
                .add(NETHERITE_BRICK_WALL);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(GOLD_BRICKS)
                .add(GOLD_BRICK_STAIRS)
                .add(GOLD_BRICK_SLAB)
                .add(GOLD_BRICK_WALL)
                .add(DIAMOND_BRICKS)
                .add(DIAMOND_BRICK_STAIRS)
                .add(DIAMOND_BRICK_SLAB)
                .add(DIAMOND_BRICK_WALL)
                .add(END_INDIGO_QUARTZ_ORE);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(NETHERITE_BRICKS)
                .add(NETHERITE_BRICK_STAIRS)
                .add(NETHERITE_BRICK_SLAB)
                .add(NETHERITE_BRICK_WALL);

        valueLookupBuilder(BlockTags.GUARDED_BY_PIGLINS)
                .add(GOLD_BRICKS)
                .add(GOLD_BRICK_STAIRS)
                .add(GOLD_BRICK_SLAB)
                .add(GOLD_BRICK_WALL);

        valueLookupBuilder(BlockTags.WALLS)
                .add(MARBLE_WALL)
                .add(POLISHED_MARBLE_WALL)
                .add(MARBLE_BRICK_WALL)
                .add(MARBLE_TILE_WALL)
                .add(ROSE_QUARTZ_WALL)
                .add(QUARTZ_WALL)
                .add(SMOOTH_QUARTZ_WALL)
                .add(QUARTZ_BRICK_WALL)
                .add(ROSE_QUARTZ_BRICK_WALL)
                .add(ROSE_QUARTZ_TILE_WALL)
                .add(SMOOTH_ROSE_QUARTZ_WALL)
                .add(WHITE_CONCRETE_WALL)
                .add(LIGHT_GRAY_CONCRETE_WALL)
                .add(GRAY_CONCRETE_WALL)
                .add(BLACK_CONCRETE_WALL)
                .add(BROWN_CONCRETE_WALL)
                .add(RED_CONCRETE_WALL)
                .add(ORANGE_CONCRETE_WALL)
                .add(YELLOW_CONCRETE_WALL)
                .add(LIME_CONCRETE_WALL)
                .add(GREEN_CONCRETE_WALL)
                .add(CYAN_CONCRETE_WALL)
                .add(LIGHT_BLUE_CONCRETE_WALL)
                .add(BLUE_CONCRETE_WALL)
                .add(PURPLE_CONCRETE_WALL)
                .add(MAGENTA_CONCRETE_WALL)
                .add(PINK_CONCRETE_WALL)
                .add(STONE_WALL)
                .add(SMOOTH_STONE_WALL)
                .add(GOLD_BRICK_WALL)
                .add(DIAMOND_BRICK_WALL)
                .add(NETHERITE_BRICK_WALL)
                .add(POLISHED_CALCITE_WALL)
                .add(CALCITE_BRICK_WALL)
                .add(CALCITE_TILE_WALL)
                .add(CALCITE_WALL)
                .add(ANDESITE_BRICK_WALL)
                .add(ANDESITE_TILE_WALL)
                .add(GRANITE_BRICK_WALL)
                .add(GRANITE_TILE_WALL)
                .add(DIORITE_BRICK_WALL)
                .add(DIORITE_TILE_WALL)
                .add(POLISHED_ANDESITE_WALL)
                .add(POLISHED_GRANITE_WALL)
                .add(POLISHED_DIORITE_WALL)
                .add(SMOOTH_BASALT_WALL)
                .add(REFINED_BASALT_WALL)
                .add(REFINED_BASALT_BRICK_WALL)
                .add(REFINED_BASALT_TILE_WALL)
                .add(CRIMSON_QUARTZ_WALL)
                .add(CRIMSON_QUARTZ_BRICK_WALL)
                .add(CRIMSON_QUARTZ_TILE_WALL)
                .add(SMOOTH_CRIMSON_QUARTZ_WALL)
                .add(INFERNAL_QUARTZ_WALL)
                .add(INFERNAL_QUARTZ_BRICK_WALL)
                .add(INFERNAL_QUARTZ_TILE_WALL)
                .add(SMOOTH_INFERNAL_QUARTZ_WALL)
                .add(SMOKEY_QUARTZ_WALL)
                .add(SMOKEY_QUARTZ_BRICK_WALL)
                .add(SMOKEY_QUARTZ_TILE_WALL)
                .add(SMOOTH_SMOKEY_QUARTZ_WALL)
                .add(SOUL_QUARTZ_WALL)
                .add(SOUL_QUARTZ_BRICK_WALL)
                .add(SOUL_QUARTZ_TILE_WALL)
                .add(SMOOTH_SOUL_QUARTZ_WALL)
                .add(PRASIOLITE_QUARTZ_WALL)
                .add(PRASIOLITE_QUARTZ_BRICK_WALL)
                .add(PRASIOLITE_QUARTZ_TILE_WALL)
                .add(SMOOTH_PRASIOLITE_QUARTZ_WALL)
                .add(INDIGO_QUARTZ_WALL)
                .add(INDIGO_QUARTZ_BRICK_WALL)
                .add(INDIGO_QUARTZ_TILE_WALL)
                .add(SMOOTH_INDIGO_QUARTZ_WALL)
                .add(CITRINE_WALL)
                .add(CITRINE_BRICK_WALL)
                .add(CITRINE_TILE_WALL)
                .add(SMOOTH_CITRINE_WALL)
                .add(POLISHED_AMETHYST_WALL)
                .add(AMETHYST_BRICK_WALL)
                .add(AMETHYST_TILE_WALL)
                .add(SMOOTH_AMETHYST_WALL)
                .add(AMETHYST_WALL)
                .add(QUARTZ_TILE_WALL)
                .add(WHITE_STAINED_BRICK_WALL)
                .add(LIGHT_GRAY_STAINED_BRICK_WALL)
                .add(GRAY_STAINED_BRICK_WALL)
                .add(BLACK_STAINED_BRICK_WALL)
                .add(BROWN_STAINED_BRICK_WALL)
                .add(RED_STAINED_BRICK_WALL)
                .add(ORANGE_STAINED_BRICK_WALL)
                .add(YELLOW_STAINED_BRICK_WALL)
                .add(LIME_STAINED_BRICK_WALL)
                .add(GREEN_STAINED_BRICK_WALL)
                .add(CYAN_STAINED_BRICK_WALL)
                .add(LIGHT_BLUE_STAINED_BRICK_WALL)
                .add(BLUE_STAINED_BRICK_WALL)
                .add(PURPLE_STAINED_BRICK_WALL)
                .add(MAGENTA_STAINED_BRICK_WALL)
                .add(PINK_STAINED_BRICK_WALL)
                .add(DRIPSTONE_WALL)
                .add(POLISHED_DRIPSTONE_WALL)
                .add(DRIPSTONE_BRICK_WALL)
                .add(DRIPSTONE_TILE_WALL);
    }
}
