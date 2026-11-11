package vtb2s.additions.datagen;


import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import org.jspecify.annotations.NonNull;
import vtb2s.additions.item.ModItems;

import static vtb2s.additions.block.ModStoneBlocks.*;
import static vtb2s.additions.block.ModQuartzBlocks.*;
import static vtb2s.additions.block.ModOreBlocks.*;
import static vtb2s.additions.block.ModVanillaVariantBlocks.*;
import static vtb2s.additions.block.ModMiscBlocks.*;
import static vtb2s.additions.block.ModColouredBlocks.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Marble
        BlockStateModelGenerator.BlockTexturePool marblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MARBLE);
        marblePool.stairs(MARBLE_STAIRS);
        marblePool.slab(MARBLE_SLAB);
        marblePool.wall(MARBLE_WALL);
        //Polished Marble
        BlockStateModelGenerator.BlockTexturePool polishedMarblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_MARBLE);
        polishedMarblePool.stairs(POLISHED_MARBLE_STAIRS);
        polishedMarblePool.slab(POLISHED_MARBLE_SLAB);
        polishedMarblePool.wall(POLISHED_MARBLE_WALL);
        //Marble Bricks
        BlockStateModelGenerator.BlockTexturePool marbleBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(MARBLE_BRICKS);
        marbleBricksPool.stairs(MARBLE_BRICK_STAIRS);
        marbleBricksPool.slab(MARBLE_BRICK_SLAB);
        marbleBricksPool.wall(MARBLE_BRICK_WALL);
        //Marble Tiles
        BlockStateModelGenerator.BlockTexturePool marbleTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(MARBLE_TILES);
        marbleTilesPool.stairs(MARBLE_TILE_STAIRS);
        marbleTilesPool.slab(MARBLE_TILE_SLAB);
        marbleTilesPool.wall(MARBLE_TILE_WALL);


        //Rose Quartz Family//
        blockStateModelGenerator.registerSimpleCubeAll(ROSE_NETHER_QUARTZ_ORE);
        //Rose Quartz
        BlockStateModelGenerator.BlockTexturePool roseQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ROSE_QUARTZ_BLOCK);
        roseQuartzPool.stairs(ROSE_QUARTZ_STAIRS);
        roseQuartzPool.slab(ROSE_QUARTZ_SLAB);
        roseQuartzPool.wall(ROSE_QUARTZ_WALL);
        //Rose Quartz Bricks
        BlockStateModelGenerator.BlockTexturePool roseQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ROSE_QUARTZ_BRICKS);
        roseQuartzBrickPool.stairs(ROSE_QUARTZ_BRICK_STAIRS);
        roseQuartzBrickPool.slab(ROSE_QUARTZ_BRICK_SLAB);
        roseQuartzBrickPool.wall(ROSE_QUARTZ_BRICK_WALL);
        //Rose Quartz Tiles
        BlockStateModelGenerator.BlockTexturePool roseQuartzTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ROSE_QUARTZ_TILES);
        roseQuartzTilePool.stairs(ROSE_QUARTZ_TILE_STAIRS);
        roseQuartzTilePool.slab(ROSE_QUARTZ_TILE_SLAB);
        roseQuartzTilePool.wall(ROSE_QUARTZ_TILE_WALL);
        //Smooth Rose Quartz
        BlockStateModelGenerator.BlockTexturePool smoothRoseQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_ROSE_QUARTZ);
        smoothRoseQuartzPool.stairs(SMOOTH_ROSE_QUARTZ_STAIRS);
        smoothRoseQuartzPool.slab(SMOOTH_ROSE_QUARTZ_SLAB);
        smoothRoseQuartzPool.wall(SMOOTH_ROSE_QUARTZ_WALL);
        //Crimson Quartz Family//
        blockStateModelGenerator.registerSimpleCubeAll(CRIMSON_NETHER_QUARTZ_ORE);
        //Crimson Quartz
        BlockStateModelGenerator.BlockTexturePool crimsonQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(CRIMSON_QUARTZ_BLOCK);
        crimsonQuartzPool.stairs(CRIMSON_QUARTZ_STAIRS);
        crimsonQuartzPool.slab(CRIMSON_QUARTZ_SLAB);
        crimsonQuartzPool.wall(CRIMSON_QUARTZ_WALL);
        //Crimson Quartz Bricks
        BlockStateModelGenerator.BlockTexturePool crimsonQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(CRIMSON_QUARTZ_BRICKS);
        crimsonQuartzBrickPool.stairs(CRIMSON_QUARTZ_BRICK_STAIRS);
        crimsonQuartzBrickPool.slab(CRIMSON_QUARTZ_BRICK_SLAB);
        crimsonQuartzBrickPool.wall(CRIMSON_QUARTZ_BRICK_WALL);
        //Crimson Quartz Tiles
        BlockStateModelGenerator.BlockTexturePool crimsonQuartzTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CRIMSON_QUARTZ_TILES);
        crimsonQuartzTilePool.stairs(CRIMSON_QUARTZ_TILE_STAIRS);
        crimsonQuartzTilePool.slab(CRIMSON_QUARTZ_TILE_SLAB);
        crimsonQuartzTilePool.wall(CRIMSON_QUARTZ_TILE_WALL);
        //Smooth Crimson Quartz
        BlockStateModelGenerator.BlockTexturePool smoothCrimsonQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_CRIMSON_QUARTZ);
        smoothCrimsonQuartzPool.stairs(SMOOTH_CRIMSON_QUARTZ_STAIRS);
        smoothCrimsonQuartzPool.slab(SMOOTH_CRIMSON_QUARTZ_SLAB);
        smoothCrimsonQuartzPool.wall(SMOOTH_CRIMSON_QUARTZ_WALL);
        //Infernal Quartz Family//
        //Ore is manually added
        //Infernal Quartz
        BlockStateModelGenerator.BlockTexturePool infernalQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(INFERNAL_QUARTZ_BLOCK);
        infernalQuartzPool.stairs(INFERNAL_QUARTZ_STAIRS);
        infernalQuartzPool.slab(INFERNAL_QUARTZ_SLAB);
        infernalQuartzPool.wall(INFERNAL_QUARTZ_WALL);
        //Infernal Quartz Bricks
        BlockStateModelGenerator.BlockTexturePool infernalQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(INFERNAL_QUARTZ_BRICKS);
        infernalQuartzBrickPool.stairs(INFERNAL_QUARTZ_BRICK_STAIRS);
        infernalQuartzBrickPool.slab(INFERNAL_QUARTZ_BRICK_SLAB);
        infernalQuartzBrickPool.wall(INFERNAL_QUARTZ_BRICK_WALL);
        //Infernal Quartz Tiles
        BlockStateModelGenerator.BlockTexturePool infernalQuartzTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(INFERNAL_QUARTZ_TILES);
        infernalQuartzTilePool.stairs(INFERNAL_QUARTZ_TILE_STAIRS);
        infernalQuartzTilePool.slab(INFERNAL_QUARTZ_TILE_SLAB);
        infernalQuartzTilePool.wall(INFERNAL_QUARTZ_TILE_WALL);
        //Smooth Infernal Quartz
        BlockStateModelGenerator.BlockTexturePool smoothInfernalQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_INFERNAL_QUARTZ);
        smoothInfernalQuartzPool.stairs(SMOOTH_INFERNAL_QUARTZ_STAIRS);
        smoothInfernalQuartzPool.slab(SMOOTH_INFERNAL_QUARTZ_SLAB);
        smoothInfernalQuartzPool.wall(SMOOTH_INFERNAL_QUARTZ_WALL);
        //Smokey Quartz Family//
        blockStateModelGenerator.registerSimpleCubeAll(SMOKEY_NETHER_QUARTZ_ORE);
        //Smokey Quartz
        BlockStateModelGenerator.BlockTexturePool smokeyQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOKEY_QUARTZ_BLOCK);
        smokeyQuartzPool.stairs(SMOKEY_QUARTZ_STAIRS);
        smokeyQuartzPool.slab(SMOKEY_QUARTZ_SLAB);
        smokeyQuartzPool.wall(SMOKEY_QUARTZ_WALL);
        //Smokey Quartz Bricks
        BlockStateModelGenerator.BlockTexturePool smokeyQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOKEY_QUARTZ_BRICKS);
        smokeyQuartzBrickPool.stairs(SMOKEY_QUARTZ_BRICK_STAIRS);
        smokeyQuartzBrickPool.slab(SMOKEY_QUARTZ_BRICK_SLAB);
        smokeyQuartzBrickPool.wall(SMOKEY_QUARTZ_BRICK_WALL);
        //Smokey Quartz Tiles
        BlockStateModelGenerator.BlockTexturePool smokeyQuartzTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOKEY_QUARTZ_TILES);
        smokeyQuartzTilePool.stairs(SMOKEY_QUARTZ_TILE_STAIRS);
        smokeyQuartzTilePool.slab(SMOKEY_QUARTZ_TILE_SLAB);
        smokeyQuartzTilePool.wall(SMOKEY_QUARTZ_TILE_WALL);
        //Smooth Smokey Quartz
        BlockStateModelGenerator.BlockTexturePool smoothSmokeyQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_SMOKEY_QUARTZ);
        smoothSmokeyQuartzPool.stairs(SMOOTH_SMOKEY_QUARTZ_STAIRS);
        smoothSmokeyQuartzPool.slab(SMOOTH_SMOKEY_QUARTZ_SLAB);
        smoothSmokeyQuartzPool.wall(SMOOTH_SMOKEY_QUARTZ_WALL);
        //Soul Quartz Family//
        blockStateModelGenerator.registerSimpleCubeAll(SOUL_NETHER_QUARTZ_ORE);
        //Soul Quartz
        BlockStateModelGenerator.BlockTexturePool soulQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SOUL_QUARTZ_BLOCK);
        soulQuartzPool.stairs(SOUL_QUARTZ_STAIRS);
        soulQuartzPool.slab(SOUL_QUARTZ_SLAB);
        soulQuartzPool.wall(SOUL_QUARTZ_WALL);
        //Soul Quartz Bricks
        BlockStateModelGenerator.BlockTexturePool soulQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SOUL_QUARTZ_BRICKS);
        soulQuartzBrickPool.stairs(SOUL_QUARTZ_BRICK_STAIRS);
        soulQuartzBrickPool.slab(SOUL_QUARTZ_BRICK_SLAB);
        soulQuartzBrickPool.wall(SOUL_QUARTZ_BRICK_WALL);
        //Soul Quartz Tiles
        BlockStateModelGenerator.BlockTexturePool soulQuartzTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SOUL_QUARTZ_TILES);
        soulQuartzTilePool.stairs(SOUL_QUARTZ_TILE_STAIRS);
        soulQuartzTilePool.slab(SOUL_QUARTZ_TILE_SLAB);
        soulQuartzTilePool.wall(SOUL_QUARTZ_TILE_WALL);
        //Smooth Soul Quartz
        BlockStateModelGenerator.BlockTexturePool smoothSoulQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_SOUL_QUARTZ);
        smoothSoulQuartzPool.stairs(SMOOTH_SOUL_QUARTZ_STAIRS);
        smoothSoulQuartzPool.slab(SMOOTH_SOUL_QUARTZ_SLAB);
        smoothSoulQuartzPool.wall(SMOOTH_SOUL_QUARTZ_WALL);
        //Prasiolite Quartz Family//
        blockStateModelGenerator.registerSimpleCubeAll(PRASIOLITE_QUARTZ_ORE);
        //Prasiolite Quartz
        BlockStateModelGenerator.BlockTexturePool prasioliteQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(PRASIOLITE_QUARTZ_BLOCK);
        prasioliteQuartzPool.stairs(PRASIOLITE_QUARTZ_STAIRS);
        prasioliteQuartzPool.slab(PRASIOLITE_QUARTZ_SLAB);
        prasioliteQuartzPool.wall(PRASIOLITE_QUARTZ_WALL);
        //Prasiolite Quartz Bricks
        BlockStateModelGenerator.BlockTexturePool prasioliteQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(PRASIOLITE_QUARTZ_BRICKS);
        prasioliteQuartzBrickPool.stairs(PRASIOLITE_QUARTZ_BRICK_STAIRS);
        prasioliteQuartzBrickPool.slab(PRASIOLITE_QUARTZ_BRICK_SLAB);
        prasioliteQuartzBrickPool.wall(PRASIOLITE_QUARTZ_BRICK_WALL);
        //Prasiolite Quartz Tiles
        BlockStateModelGenerator.BlockTexturePool prasioliteQuartzTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PRASIOLITE_QUARTZ_TILES);
        prasioliteQuartzTilePool.stairs(PRASIOLITE_QUARTZ_TILE_STAIRS);
        prasioliteQuartzTilePool.slab(PRASIOLITE_QUARTZ_TILE_SLAB);
        prasioliteQuartzTilePool.wall(PRASIOLITE_QUARTZ_TILE_WALL);
        //Smooth Prasiolite Quartz
        BlockStateModelGenerator.BlockTexturePool smoothPrasioliteQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_PRASIOLITE_QUARTZ);
        smoothPrasioliteQuartzPool.stairs(SMOOTH_PRASIOLITE_QUARTZ_STAIRS);
        smoothPrasioliteQuartzPool.slab(SMOOTH_PRASIOLITE_QUARTZ_SLAB);
        smoothPrasioliteQuartzPool.wall(SMOOTH_PRASIOLITE_QUARTZ_WALL);
        //Indigo Quartz Family//
        blockStateModelGenerator.registerSimpleCubeAll(END_INDIGO_QUARTZ_ORE);
        //Indigo Quartz
        BlockStateModelGenerator.BlockTexturePool indigoQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(INDIGO_QUARTZ_BLOCK);
        indigoQuartzPool.stairs(INDIGO_QUARTZ_STAIRS);
        indigoQuartzPool.slab(INDIGO_QUARTZ_SLAB);
        indigoQuartzPool.wall(INDIGO_QUARTZ_WALL);
        //Indigo Quartz Bricks
        BlockStateModelGenerator.BlockTexturePool indigoQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(INDIGO_QUARTZ_BRICKS);
        indigoQuartzBrickPool.stairs(INDIGO_QUARTZ_BRICK_STAIRS);
        indigoQuartzBrickPool.slab(INDIGO_QUARTZ_BRICK_SLAB);
        indigoQuartzBrickPool.wall(INDIGO_QUARTZ_BRICK_WALL);
        //Indigo Quartz Tiles
        BlockStateModelGenerator.BlockTexturePool indigoQuartzTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(INDIGO_QUARTZ_TILES);
        indigoQuartzTilePool.stairs(INDIGO_QUARTZ_TILE_STAIRS);
        indigoQuartzTilePool.slab(INDIGO_QUARTZ_TILE_SLAB);
        indigoQuartzTilePool.wall(INDIGO_QUARTZ_TILE_WALL);
        //Smooth Indigo Quartz
        BlockStateModelGenerator.BlockTexturePool smoothIndigoQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_INDIGO_QUARTZ);
        smoothIndigoQuartzPool.stairs(SMOOTH_INDIGO_QUARTZ_STAIRS);
        smoothIndigoQuartzPool.slab(SMOOTH_INDIGO_QUARTZ_SLAB);
        smoothIndigoQuartzPool.wall(SMOOTH_INDIGO_QUARTZ_WALL);
        //Citrine Family//
        blockStateModelGenerator.registerSimpleCubeAll(CITRINE_ORE);
        //Citrine
        BlockStateModelGenerator.BlockTexturePool citrinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CITRINE_BLOCK);
        citrinePool.stairs(CITRINE_STAIRS);
        citrinePool.slab(CITRINE_SLAB);
        citrinePool.wall(CITRINE_WALL);
        //Citrine Bricks
        BlockStateModelGenerator.BlockTexturePool citrineBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(CITRINE_BRICKS);
        citrineBrickPool.stairs(CITRINE_BRICK_STAIRS);
        citrineBrickPool.slab(CITRINE_BRICK_SLAB);
        citrineBrickPool.wall(CITRINE_BRICK_WALL);
        //Citrine Tiles
        BlockStateModelGenerator.BlockTexturePool citrineTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CITRINE_TILES);
        citrineTilePool.stairs(CITRINE_TILE_STAIRS);
        citrineTilePool.slab(CITRINE_TILE_SLAB);
        citrineTilePool.wall(CITRINE_TILE_WALL);
        //Smooth Citrine
        BlockStateModelGenerator.BlockTexturePool smoothCitrinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_CITRINE);
        smoothCitrinePool.stairs(SMOOTH_CITRINE_STAIRS);
        smoothCitrinePool.slab(SMOOTH_CITRINE_SLAB);
        smoothCitrinePool.wall(SMOOTH_CITRINE_WALL);


        //Refined Basalt Family//
        //Refined Basalt
        BlockStateModelGenerator.BlockTexturePool refinedBasaltPool = blockStateModelGenerator.registerCubeAllModelTexturePool(REFINED_BASALT);
        refinedBasaltPool.stairs(REFINED_BASALT_STAIRS);
        refinedBasaltPool.slab(REFINED_BASALT_SLAB);
        refinedBasaltPool.wall(REFINED_BASALT_WALL);
        //Calcite Bricks
        BlockStateModelGenerator.BlockTexturePool basaltBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(REFINED_BASALT_BRICKS);
        basaltBricksPool.stairs(REFINED_BASALT_BRICK_STAIRS);
        basaltBricksPool.slab(REFINED_BASALT_BRICK_SLAB);
        basaltBricksPool.wall(REFINED_BASALT_BRICK_WALL);
        //Calcite Tiles
        BlockStateModelGenerator.BlockTexturePool basaltTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(REFINED_BASALT_TILES);
        basaltTilesPool.stairs(REFINED_BASALT_TILE_STAIRS);
        basaltTilesPool.slab(REFINED_BASALT_TILE_SLAB);
        basaltTilesPool.wall(REFINED_BASALT_TILE_WALL);

        //Quartz Tiles
        BlockStateModelGenerator.BlockTexturePool QuartzTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(QUARTZ_TILES);
        QuartzTilePool.stairs(QUARTZ_TILE_STAIRS);
        QuartzTilePool.slab(QUARTZ_TILE_SLAB);
        QuartzTilePool.wall(QUARTZ_TILE_WALL);
                

        //Calcite Family//
        //Polished Calcite
        BlockStateModelGenerator.BlockTexturePool polishedCalcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_CALCITE);
        polishedCalcitePool.stairs(POLISHED_CALCITE_STAIRS);
        polishedCalcitePool.slab(POLISHED_CALCITE_SLAB);
        polishedCalcitePool.wall(POLISHED_CALCITE_WALL);
        //Calcite Bricks
        BlockStateModelGenerator.BlockTexturePool calciteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(CALCITE_BRICKS);
        calciteBricksPool.stairs(CALCITE_BRICK_STAIRS);
        calciteBricksPool.slab(CALCITE_BRICK_SLAB);
        calciteBricksPool.wall(CALCITE_BRICK_WALL);
        //Calcite Tiles
        BlockStateModelGenerator.BlockTexturePool calciteTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(CALCITE_TILES);
        calciteTilesPool.stairs(CALCITE_TILE_STAIRS);
        calciteTilesPool.slab(CALCITE_TILE_SLAB);
        calciteTilesPool.wall(CALCITE_TILE_WALL);


        //Dripstone Family//
        //Polished Dripstone
        BlockStateModelGenerator.BlockTexturePool polishedDripstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_DRIPSTONE);
        polishedDripstonePool.stairs(POLISHED_DRIPSTONE_STAIRS);
        polishedDripstonePool.slab(POLISHED_DRIPSTONE_SLAB);
        polishedDripstonePool.wall(POLISHED_DRIPSTONE_WALL);
        //Dripstone Bricks
        BlockStateModelGenerator.BlockTexturePool dripstoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(DRIPSTONE_BRICKS);
        dripstoneBricksPool.stairs(DRIPSTONE_BRICK_STAIRS);
        dripstoneBricksPool.slab(DRIPSTONE_BRICK_SLAB);
        dripstoneBricksPool.wall(DRIPSTONE_BRICK_WALL);
        //Dripstone Tiles
        BlockStateModelGenerator.BlockTexturePool dripstoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(DRIPSTONE_TILES);
        dripstoneTilesPool.stairs(DRIPSTONE_TILE_STAIRS);
        dripstoneTilesPool.slab(DRIPSTONE_TILE_SLAB);
        dripstoneTilesPool.wall(DRIPSTONE_TILE_WALL);
        
        
        //Amethyst Family//
        //Polished Amethyst
        BlockStateModelGenerator.BlockTexturePool polishedAmethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_AMETHYST);
        polishedAmethystPool.stairs(POLISHED_AMETHYST_STAIRS);
        polishedAmethystPool.slab(POLISHED_AMETHYST_SLAB);
        polishedAmethystPool.wall(POLISHED_AMETHYST_WALL);
        //Amethyst Bricks
        BlockStateModelGenerator.BlockTexturePool amethystBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(AMETHYST_BRICKS);
        amethystBrickPool.stairs(AMETHYST_BRICK_STAIRS);
        amethystBrickPool.slab(AMETHYST_BRICK_SLAB);
        amethystBrickPool.wall(AMETHYST_BRICK_WALL);
        //Amethyst Tiles
        BlockStateModelGenerator.BlockTexturePool amethystTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(AMETHYST_TILES);
        amethystTilePool.stairs(AMETHYST_TILE_STAIRS);
        amethystTilePool.slab(AMETHYST_TILE_SLAB);
        amethystTilePool.wall(AMETHYST_TILE_WALL);
        //Smooth Amethyst 
        BlockStateModelGenerator.BlockTexturePool smoothAmethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_AMETHYST);
        smoothAmethystPool.stairs(SMOOTH_AMETHYST_STAIRS);
        smoothAmethystPool.slab(SMOOTH_AMETHYST_SLAB);
        smoothAmethystPool.wall(SMOOTH_AMETHYST_WALL);


        //Netherrack Family//
        //Polished Netherrack
        BlockStateModelGenerator.BlockTexturePool polishedNetherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_NETHERRACK);
        polishedNetherrackPool.stairs(POLISHED_NETHERRACK_STAIRS);
        polishedNetherrackPool.slab(POLISHED_NETHERRACK_SLAB);
        polishedNetherrackPool.wall(POLISHED_NETHERRACK_WALL);
        //Netherrack Bricks
        BlockStateModelGenerator.BlockTexturePool netherrackBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(NETHERRACK_BRICKS);
        netherrackBricksPool.stairs(NETHERRACK_BRICK_STAIRS);
        netherrackBricksPool.slab(NETHERRACK_BRICK_SLAB);
        netherrackBricksPool.wall(NETHERRACK_BRICK_WALL);
        //Netherrack Tiles
        BlockStateModelGenerator.BlockTexturePool netherrackTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(NETHERRACK_TILES);
        netherrackTilesPool.stairs(NETHERRACK_TILE_STAIRS);
        netherrackTilesPool.slab(NETHERRACK_TILE_SLAB);
        netherrackTilesPool.wall(NETHERRACK_TILE_WALL);


        //End Stone Family//
        //Polished End Stone
        BlockStateModelGenerator.BlockTexturePool polishedEndStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_END_STONE);
        polishedEndStonePool.stairs(POLISHED_END_STONE_STAIRS);
        polishedEndStonePool.slab(POLISHED_END_STONE_SLAB);
        polishedEndStonePool.wall(POLISHED_END_STONE_WALL);
        //End Stone Tiles
        BlockStateModelGenerator.BlockTexturePool endStoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(END_STONE_TILES);
        endStoneTilesPool.stairs(END_STONE_TILE_STAIRS);
        endStoneTilesPool.slab(END_STONE_TILE_SLAB);
        endStoneTilesPool.wall(END_STONE_TILE_WALL);


        //Mineral Bricks
        BlockStateModelGenerator.BlockTexturePool goldBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(GOLD_BRICKS);
        goldBricksPool.stairs(GOLD_BRICK_STAIRS);
        goldBricksPool.slab(GOLD_BRICK_SLAB);
        goldBricksPool.wall(GOLD_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool diamondBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(DIAMOND_BRICKS);
        diamondBricksPool.stairs(DIAMOND_BRICK_STAIRS);
        diamondBricksPool.slab(DIAMOND_BRICK_SLAB);
        diamondBricksPool.wall(DIAMOND_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool netheriteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(NETHERITE_BRICKS);
        netheriteBricksPool.stairs(NETHERITE_BRICK_STAIRS);
        netheriteBricksPool.slab(NETHERITE_BRICK_SLAB);
        netheriteBricksPool.wall(NETHERITE_BRICK_WALL);


        //Igneous Rock Addons//
        //Andesite//
        //Andesite Bricks
        BlockStateModelGenerator.BlockTexturePool andesiteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ANDESITE_BRICKS);
        andesiteBricksPool.stairs(ANDESITE_BRICK_STAIRS);
        andesiteBricksPool.slab(ANDESITE_BRICK_SLAB);
        andesiteBricksPool.wall(ANDESITE_BRICK_WALL);
        //Andesite Tiles
        BlockStateModelGenerator.BlockTexturePool andesiteTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ANDESITE_TILES);
        andesiteTilesPool.stairs(ANDESITE_TILE_STAIRS);
        andesiteTilesPool.slab(ANDESITE_TILE_SLAB);
        andesiteTilesPool.wall(ANDESITE_TILE_WALL);
        //Granite//
        //Granite Bricks
        BlockStateModelGenerator.BlockTexturePool graniteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(GRANITE_BRICKS);
        graniteBricksPool.stairs(GRANITE_BRICK_STAIRS);
        graniteBricksPool.slab(GRANITE_BRICK_SLAB);
        graniteBricksPool.wall(GRANITE_BRICK_WALL);
        //Granite Tiles
        BlockStateModelGenerator.BlockTexturePool graniteTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(GRANITE_TILES);
        graniteTilesPool.stairs(GRANITE_TILE_STAIRS);
        graniteTilesPool.slab(GRANITE_TILE_SLAB);
        graniteTilesPool.wall(GRANITE_TILE_WALL);
        //Diorite//
        //Diorite Bricks
        BlockStateModelGenerator.BlockTexturePool dioriteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(DIORITE_BRICKS);
        dioriteBricksPool.stairs(DIORITE_BRICK_STAIRS);
        dioriteBricksPool.slab(DIORITE_BRICK_SLAB);
        dioriteBricksPool.wall(DIORITE_BRICK_WALL);
        //Diorite Tiles
        BlockStateModelGenerator.BlockTexturePool dioriteTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(DIORITE_TILES);
        dioriteTilesPool.stairs(DIORITE_TILE_STAIRS);
        dioriteTilesPool.slab(DIORITE_TILE_SLAB);
        dioriteTilesPool.wall(DIORITE_TILE_WALL);


        //Misc
        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        stonePool.wall(STONE_WALL);
        BlockStateModelGenerator.BlockTexturePool smoothStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        smoothStonePool.stairs(SMOOTH_STONE_STAIRS);
        smoothStonePool.wall(SMOOTH_STONE_WALL);
        BlockStateModelGenerator.BlockTexturePool calcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
        calcitePool.stairs(CALCITE_STAIRS);
        calcitePool.slab(CALCITE_SLAB);
        calcitePool.wall(CALCITE_WALL);
        BlockStateModelGenerator.BlockTexturePool dripstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DRIPSTONE_BLOCK);
        dripstonePool.stairs(DRIPSTONE_STAIRS);
        dripstonePool.slab(DRIPSTONE_SLAB);
        dripstonePool.wall(DRIPSTONE_WALL);
        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        polishedAndesitePool.wall(POLISHED_ANDESITE_WALL);
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        polishedDioritePool.wall(POLISHED_DIORITE_WALL);
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        polishedGranitePool.wall(POLISHED_GRANITE_WALL);
        BlockStateModelGenerator.BlockTexturePool smooth_basaltPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);
        smooth_basaltPool.stairs(SMOOTH_BASALT_STAIRS);
        smooth_basaltPool.slab(SMOOTH_BASALT_SLAB);
        smooth_basaltPool.wall(SMOOTH_BASALT_WALL);
        BlockStateModelGenerator.BlockTexturePool amethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);
        amethystPool.stairs(AMETHYST_STAIRS);
        amethystPool.slab(AMETHYST_SLAB);
        amethystPool.wall(AMETHYST_WALL);
        BlockStateModelGenerator.BlockTexturePool deepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE);
        deepslatePool.stairs(DEEPSLATE_STAIRS);
        deepslatePool.slab(DEEPSLATE_SLAB);
        deepslatePool.wall(DEEPSLATE_WALL);
        BlockStateModelGenerator.BlockTexturePool netherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERRACK);
        netherrackPool.stairs(NETHERRACK_STAIRS);
        netherrackPool.slab(NETHERRACK_SLAB);
        netherrackPool.wall(NETHERRACK_WALL);
        BlockStateModelGenerator.BlockTexturePool endStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        endStonePool.stairs(END_STONE_STAIRS);
        endStonePool.slab(END_STONE_SLAB);
        endStonePool.wall(END_STONE_WALL);

        //Quartz minus Quartz Wall (manually added)
        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        smoothQuartzPool.wall(SMOOTH_QUARTZ_WALL);
        BlockStateModelGenerator.BlockTexturePool quartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        quartzBrickPool.stairs(QUARTZ_BRICK_STAIRS);
        quartzBrickPool.slab(QUARTZ_BRICK_SLAB);
        quartzBrickPool.wall(QUARTZ_BRICK_WALL);
        
        //Concrete
        //White
        BlockStateModelGenerator.BlockTexturePool whiteConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        whiteConcretePool.stairs(WHITE_CONCRETE_STAIRS);
        whiteConcretePool.slab(WHITE_CONCRETE_SLAB);
        whiteConcretePool.wall(WHITE_CONCRETE_WALL);
        //Light Gray
        BlockStateModelGenerator.BlockTexturePool lightGrayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        lightGrayConcretePool.stairs(LIGHT_GRAY_CONCRETE_STAIRS);
        lightGrayConcretePool.slab(LIGHT_GRAY_CONCRETE_SLAB);
        lightGrayConcretePool.wall(LIGHT_GRAY_CONCRETE_WALL);
        //Gray
        BlockStateModelGenerator.BlockTexturePool grayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        grayConcretePool.stairs(GRAY_CONCRETE_STAIRS);
        grayConcretePool.slab(GRAY_CONCRETE_SLAB);
        grayConcretePool.wall(GRAY_CONCRETE_WALL);
        //Black
        BlockStateModelGenerator.BlockTexturePool blackConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        blackConcretePool.stairs(BLACK_CONCRETE_STAIRS);
        blackConcretePool.slab(BLACK_CONCRETE_SLAB);
        blackConcretePool.wall(BLACK_CONCRETE_WALL);
        //Brown
        BlockStateModelGenerator.BlockTexturePool brownConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        brownConcretePool.stairs(BROWN_CONCRETE_STAIRS);
        brownConcretePool.slab(BROWN_CONCRETE_SLAB);
        brownConcretePool.wall(BROWN_CONCRETE_WALL);
        //Red
        BlockStateModelGenerator.BlockTexturePool redConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        redConcretePool.stairs(RED_CONCRETE_STAIRS);
        redConcretePool.slab(RED_CONCRETE_SLAB);
        redConcretePool.wall(RED_CONCRETE_WALL);
        //Orange
        BlockStateModelGenerator.BlockTexturePool orangeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        orangeConcretePool.stairs(ORANGE_CONCRETE_STAIRS);
        orangeConcretePool.slab(ORANGE_CONCRETE_SLAB);
        orangeConcretePool.wall(ORANGE_CONCRETE_WALL);
        //Yellow
        BlockStateModelGenerator.BlockTexturePool yellowConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        yellowConcretePool.stairs(YELLOW_CONCRETE_STAIRS);
        yellowConcretePool.slab(YELLOW_CONCRETE_SLAB);
        yellowConcretePool.wall(YELLOW_CONCRETE_WALL);
        //Lime
        BlockStateModelGenerator.BlockTexturePool limeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        limeConcretePool.stairs(LIME_CONCRETE_STAIRS);
        limeConcretePool.slab(LIME_CONCRETE_SLAB);
        limeConcretePool.wall(LIME_CONCRETE_WALL);
        //Green
        BlockStateModelGenerator.BlockTexturePool greenConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        greenConcretePool.stairs(GREEN_CONCRETE_STAIRS);
        greenConcretePool.slab(GREEN_CONCRETE_SLAB);
        greenConcretePool.wall(GREEN_CONCRETE_WALL);
        //Cyan
        BlockStateModelGenerator.BlockTexturePool cyanConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        cyanConcretePool.stairs(CYAN_CONCRETE_STAIRS);
        cyanConcretePool.slab(CYAN_CONCRETE_SLAB);
        cyanConcretePool.wall(CYAN_CONCRETE_WALL);
        //Light Blue
        BlockStateModelGenerator.BlockTexturePool lightBlueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        lightBlueConcretePool.stairs(LIGHT_BLUE_CONCRETE_STAIRS);
        lightBlueConcretePool.slab(LIGHT_BLUE_CONCRETE_SLAB);
        lightBlueConcretePool.wall(LIGHT_BLUE_CONCRETE_WALL);
        //Blue
        BlockStateModelGenerator.BlockTexturePool blueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        blueConcretePool.stairs(BLUE_CONCRETE_STAIRS);
        blueConcretePool.slab(BLUE_CONCRETE_SLAB);
        blueConcretePool.wall(BLUE_CONCRETE_WALL);
        //Purple
        BlockStateModelGenerator.BlockTexturePool purpleConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        purpleConcretePool.stairs(PURPLE_CONCRETE_STAIRS);
        purpleConcretePool.slab(PURPLE_CONCRETE_SLAB);
        purpleConcretePool.wall(PURPLE_CONCRETE_WALL);
        //Magenta
        BlockStateModelGenerator.BlockTexturePool magentaConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        magentaConcretePool.stairs(MAGENTA_CONCRETE_STAIRS);
        magentaConcretePool.slab(MAGENTA_CONCRETE_SLAB);
        magentaConcretePool.wall(MAGENTA_CONCRETE_WALL);
        //Pink
        BlockStateModelGenerator.BlockTexturePool pinkConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        pinkConcretePool.stairs(PINK_CONCRETE_STAIRS);
        pinkConcretePool.slab(PINK_CONCRETE_SLAB);
        pinkConcretePool.wall(PINK_CONCRETE_WALL);
        
        //Stained Bricks//
        //White
        BlockStateModelGenerator.BlockTexturePool whiteStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(WHITE_STAINED_BRICKS);
        whiteStainedBrickPool.stairs(WHITE_STAINED_BRICK_STAIRS);
        whiteStainedBrickPool.slab(WHITE_STAINED_BRICK_SLAB);
        whiteStainedBrickPool.wall(WHITE_STAINED_BRICK_WALL);
        //Light Gray
        BlockStateModelGenerator.BlockTexturePool lightGrayStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(LIGHT_GRAY_STAINED_BRICKS);
        lightGrayStainedBrickPool.stairs(LIGHT_GRAY_STAINED_BRICK_STAIRS);
        lightGrayStainedBrickPool.slab(LIGHT_GRAY_STAINED_BRICK_SLAB);
        lightGrayStainedBrickPool.wall(LIGHT_GRAY_STAINED_BRICK_WALL);
        //Gray
        BlockStateModelGenerator.BlockTexturePool grayStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(GRAY_STAINED_BRICKS);
        grayStainedBrickPool.stairs(GRAY_STAINED_BRICK_STAIRS);
        grayStainedBrickPool.slab(GRAY_STAINED_BRICK_SLAB);
        grayStainedBrickPool.wall(GRAY_STAINED_BRICK_WALL);
        //Black
        BlockStateModelGenerator.BlockTexturePool blackStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BLACK_STAINED_BRICKS);
        blackStainedBrickPool.stairs(BLACK_STAINED_BRICK_STAIRS);
        blackStainedBrickPool.slab(BLACK_STAINED_BRICK_SLAB);
        blackStainedBrickPool.wall(BLACK_STAINED_BRICK_WALL);
        //Brown
        BlockStateModelGenerator.BlockTexturePool brownStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BROWN_STAINED_BRICKS);
        brownStainedBrickPool.stairs(BROWN_STAINED_BRICK_STAIRS);
        brownStainedBrickPool.slab(BROWN_STAINED_BRICK_SLAB);
        brownStainedBrickPool.wall(BROWN_STAINED_BRICK_WALL);
        //Red
        BlockStateModelGenerator.BlockTexturePool redStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(RED_STAINED_BRICKS);
        redStainedBrickPool.stairs(RED_STAINED_BRICK_STAIRS);
        redStainedBrickPool.slab(RED_STAINED_BRICK_SLAB);
        redStainedBrickPool.wall(RED_STAINED_BRICK_WALL);
        //Orange
        BlockStateModelGenerator.BlockTexturePool orangeStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ORANGE_STAINED_BRICKS);
        orangeStainedBrickPool.stairs(ORANGE_STAINED_BRICK_STAIRS);
        orangeStainedBrickPool.slab(ORANGE_STAINED_BRICK_SLAB);
        orangeStainedBrickPool.wall(ORANGE_STAINED_BRICK_WALL);
        //Yellow
        BlockStateModelGenerator.BlockTexturePool yellowStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(YELLOW_STAINED_BRICKS);
        yellowStainedBrickPool.stairs(YELLOW_STAINED_BRICK_STAIRS);
        yellowStainedBrickPool.slab(YELLOW_STAINED_BRICK_SLAB);
        yellowStainedBrickPool.wall(YELLOW_STAINED_BRICK_WALL);
        //Lime
        BlockStateModelGenerator.BlockTexturePool limeStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(LIME_STAINED_BRICKS);
        limeStainedBrickPool.stairs(LIME_STAINED_BRICK_STAIRS);
        limeStainedBrickPool.slab(LIME_STAINED_BRICK_SLAB);
        limeStainedBrickPool.wall(LIME_STAINED_BRICK_WALL);
        //Green
        BlockStateModelGenerator.BlockTexturePool greenStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(GREEN_STAINED_BRICKS);
        greenStainedBrickPool.stairs(GREEN_STAINED_BRICK_STAIRS);
        greenStainedBrickPool.slab(GREEN_STAINED_BRICK_SLAB);
        greenStainedBrickPool.wall(GREEN_STAINED_BRICK_WALL);
        //Cyan
        BlockStateModelGenerator.BlockTexturePool cyanStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(CYAN_STAINED_BRICKS);
        cyanStainedBrickPool.stairs(CYAN_STAINED_BRICK_STAIRS);
        cyanStainedBrickPool.slab(CYAN_STAINED_BRICK_SLAB);
        cyanStainedBrickPool.wall(CYAN_STAINED_BRICK_WALL);
        //Light Blue
        BlockStateModelGenerator.BlockTexturePool lightBlueStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(LIGHT_BLUE_STAINED_BRICKS);
        lightBlueStainedBrickPool.stairs(LIGHT_BLUE_STAINED_BRICK_STAIRS);
        lightBlueStainedBrickPool.slab(LIGHT_BLUE_STAINED_BRICK_SLAB);
        lightBlueStainedBrickPool.wall(LIGHT_BLUE_STAINED_BRICK_WALL);
        //Blue
        BlockStateModelGenerator.BlockTexturePool blueStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BLUE_STAINED_BRICKS);
        blueStainedBrickPool.stairs(BLUE_STAINED_BRICK_STAIRS);
        blueStainedBrickPool.slab(BLUE_STAINED_BRICK_SLAB);
        blueStainedBrickPool.wall(BLUE_STAINED_BRICK_WALL);
        //Purple
        BlockStateModelGenerator.BlockTexturePool purpleStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(PURPLE_STAINED_BRICKS);
        purpleStainedBrickPool.stairs(PURPLE_STAINED_BRICK_STAIRS);
        purpleStainedBrickPool.slab(PURPLE_STAINED_BRICK_SLAB);
        purpleStainedBrickPool.wall(PURPLE_STAINED_BRICK_WALL);
        //Magenta
        BlockStateModelGenerator.BlockTexturePool magentaStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(MAGENTA_STAINED_BRICKS);
        magentaStainedBrickPool.stairs(MAGENTA_STAINED_BRICK_STAIRS);
        magentaStainedBrickPool.slab(MAGENTA_STAINED_BRICK_SLAB);
        magentaStainedBrickPool.wall(MAGENTA_STAINED_BRICK_WALL);
        //Pink
        BlockStateModelGenerator.BlockTexturePool pinkStainedBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(PINK_STAINED_BRICKS);
        pinkStainedBrickPool.stairs(PINK_STAINED_BRICK_STAIRS);
        pinkStainedBrickPool.slab(PINK_STAINED_BRICK_SLAB);
        pinkStainedBrickPool.wall(PINK_STAINED_BRICK_WALL);
        

    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CRIMSON_NETHER_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_NETHER_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.INFERNAL_NETHER_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMOKEY_NETHER_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_NETHER_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRASIOLITE_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_INDIGO_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.CITRINE, Models.GENERATED);
    }
}
