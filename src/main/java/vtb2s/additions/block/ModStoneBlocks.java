package vtb2s.additions.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static vtb2s.additions.register.RegisterMethods.*;
import static vtb2s.additions.vTB2sAdditions.MOD_ID;

public class ModStoneBlocks {
    //Marble Family//
    //Marble
    public static final Block MARBLE = registerBlock("marble",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble")))
                    .strength(1.5f)
                    .resistance(6.0f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE_STAIRS = registerBlock("marble_stairs",
            new StairsBlock(MARBLE.getDefaultState(), AbstractBlock.Settings.copy(MARBLE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_stairs")))));
    public static final Block MARBLE_SLAB = registerBlock("marble_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MARBLE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_slab")))));
    public static final Block MARBLE_WALL = registerBlock("marble_wall",
            new WallBlock(AbstractBlock.Settings.copy(MARBLE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_wall")))));
    //Polished Marble
    public static final Block POLISHED_MARBLE = registerBlock("polished_marble",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_marble")))
                    .strength(1.5f, 6.0f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_MARBLE_STAIRS = registerBlock("polished_marble_stairs",
            new StairsBlock(POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_MARBLE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_marble_stairs")))));

    public static final Block POLISHED_MARBLE_SLAB = registerBlock("polished_marble_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_MARBLE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_marble_slab")))));

    public static final Block POLISHED_MARBLE_WALL = registerBlock("polished_marble_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_MARBLE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_marble_wall")))));
    //Marble Bricks
    public static final Block MARBLE_BRICKS = registerBlock("marble_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_bricks")))
                    .strength(1.5f, 6.0f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE_BRICK_STAIRS = registerBlock("marble_brick_stairs",
            new StairsBlock(MARBLE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(MARBLE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_brick_stairs")))));
    public static final Block MARBLE_BRICK_SLAB = registerBlock("marble_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MARBLE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_brick_slab")))));
    public static final Block MARBLE_BRICK_WALL = registerBlock("marble_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(MARBLE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_brick_wall")))));
    //Marble Tile
    public static final Block MARBLE_TILES = registerBlock("marble_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_tiles")))
                    .strength(1.5f, 6.0f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE_TILE_STAIRS = registerBlock("marble_tile_stairs",
            new StairsBlock(MARBLE_TILES.getDefaultState(), AbstractBlock.Settings.copy(MARBLE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_tile_stairs")))));
    public static final Block MARBLE_TILE_SLAB = registerBlock("marble_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MARBLE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_tile_slab")))));
    public static final Block MARBLE_TILE_WALL = registerBlock("marble_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(MARBLE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "marble_tile_wall")))));


    //Calcite Family//
    //Polished Calcite
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_calcite")))
                    .strength(0.85F, 0.85F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            new StairsBlock(ModStoneBlocks.POLISHED_CALCITE.getDefaultState(), AbstractBlock.Settings.copy(ModStoneBlocks.POLISHED_CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_calcite_stairs")))));
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModStoneBlocks.POLISHED_CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_calcite_slab")))));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModStoneBlocks.POLISHED_CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_calcite_wall")))));
    //Calcite Bricks
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_bricks")))
                    .strength(0.85F, 0.85F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(ModStoneBlocks.CALCITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(ModStoneBlocks.CALCITE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_brick_stairs")))));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModStoneBlocks.CALCITE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_brick_slab")))));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModStoneBlocks.CALCITE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_brick_wall")))));
    //Calcite Tiles
    public static final Block CALCITE_TILES = registerBlock("calcite_tiles",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_tiles")))
                    .strength(0.85F, 0.85F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_TILE_STAIRS = registerBlock("calcite_tile_stairs",
            new StairsBlock(ModStoneBlocks.CALCITE_TILES.getDefaultState(), AbstractBlock.Settings.copy(ModStoneBlocks.CALCITE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_tile_stairs")))));
    public static final Block CALCITE_TILE_SLAB = registerBlock("calcite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModStoneBlocks.CALCITE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_tile_slab")))));
    public static final Block CALCITE_TILE_WALL = registerBlock("calcite_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModStoneBlocks.CALCITE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_tile_wall")))));

    
    //Igneous Rock Addons//
    //Andesite//
    //Andesite Bricks
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_bricks")))));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_ANDESITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_brick_stairs")))));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_brick_slab")))));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_brick_wall")))));
    //Andesite Tiles
    public static final Block ANDESITE_TILES = registerBlock("andesite_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_tiles")))));
    public static final Block ANDESITE_TILE_STAIRS = registerBlock("andesite_tile_stairs",
            new StairsBlock(Blocks.POLISHED_ANDESITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_tile_stairs")))));
    public static final Block ANDESITE_TILE_SLAB = registerBlock("andesite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_tile_slab")))));
    public static final Block ANDESITE_TILE_WALL = registerBlock("andesite_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_tile_wall")))));
    //Granite//
    //Granite Bricks
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_bricks")))));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_GRANITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_brick_stairs")))));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_brick_slab")))));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_brick_wall")))));
    //Granite Tiles
    public static final Block GRANITE_TILES = registerBlock("granite_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_tiles")))));
    public static final Block GRANITE_TILE_STAIRS = registerBlock("granite_tile_stairs",
            new StairsBlock(Blocks.POLISHED_GRANITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_tile_stairs")))));
    public static final Block GRANITE_TILE_SLAB = registerBlock("granite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_tile_slab")))));
    public static final Block GRANITE_TILE_WALL = registerBlock("granite_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_tile_wall")))));
    //Diorite//
    //Diorite Bricks
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_bricks")))));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_DIORITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_brick_stairs")))));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_brick_slab")))));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_brick_wall")))));
    //Diorite Tiles
    public static final Block DIORITE_TILES = registerBlock("diorite_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_tiles")))));
    public static final Block DIORITE_TILE_STAIRS = registerBlock("diorite_tile_stairs",
            new StairsBlock(Blocks.POLISHED_DIORITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_tile_stairs")))));
    public static final Block DIORITE_TILE_SLAB = registerBlock("diorite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_tile_slab")))));
    public static final Block DIORITE_TILE_WALL = registerBlock("diorite_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_tile_wall")))));


    //Basalt//
    //Refined Basalt
    public static final Block REFINED_BASALT = registerBlock("refined_basalt",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt")))
                    .strength(1.25F, 4.2F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block REFINED_BASALT_STAIRS = registerBlock("refined_basalt_stairs",
            new StairsBlock(REFINED_BASALT.getDefaultState(), AbstractBlock.Settings.copy(REFINED_BASALT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_stairs")))));
    public static final Block REFINED_BASALT_SLAB = registerBlock("refined_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(REFINED_BASALT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_slab")))));
    public static final Block REFINED_BASALT_WALL = registerBlock("refined_basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(REFINED_BASALT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_wall")))));
    //Refined Basalt Bricks
    public static final Block REFINED_BASALT_BRICKS = registerBlock("refined_basalt_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_bricks")))
                    .strength(1.25F, 4.2F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block REFINED_BASALT_BRICK_STAIRS = registerBlock("refined_basalt_brick_stairs",
            new StairsBlock(REFINED_BASALT_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(REFINED_BASALT_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_brick_stairs")))));
    public static final Block REFINED_BASALT_BRICK_SLAB = registerBlock("refined_basalt_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(REFINED_BASALT_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_brick_slab")))));
    public static final Block REFINED_BASALT_BRICK_WALL = registerBlock("refined_basalt_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(REFINED_BASALT_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_brick_wall")))));
    //Refined Basalt Tiles
    public static final Block REFINED_BASALT_TILES = registerBlock("refined_basalt_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_tiles")))
                    .strength(1.25F, 4.2F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block REFINED_BASALT_TILE_STAIRS = registerBlock("refined_basalt_tile_stairs",
            new StairsBlock(REFINED_BASALT_TILES.getDefaultState(), AbstractBlock.Settings.copy(REFINED_BASALT_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_tile_stairs")))));
    public static final Block REFINED_BASALT_TILE_SLAB = registerBlock("refined_basalt_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(REFINED_BASALT_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_tile_slab")))));
    public static final Block REFINED_BASALT_TILE_WALL = registerBlock("refined_basalt_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(REFINED_BASALT_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "refined_basalt_tile_wall")))));


    //Dripstone//
    //Polished Dripstone
    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_dripstone")))
                    .strength(0.85F, 0.85F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            new StairsBlock(ModStoneBlocks.POLISHED_DRIPSTONE.getDefaultState(), AbstractBlock.Settings.copy(ModStoneBlocks.POLISHED_DRIPSTONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_dripstone_stairs")))));
    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModStoneBlocks.POLISHED_DRIPSTONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_dripstone_slab")))));
    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModStoneBlocks.POLISHED_DRIPSTONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_dripstone_wall")))));
    //Dripstone Bricks
    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_bricks")))
                    .strength(0.85F, 0.85F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            new StairsBlock(ModStoneBlocks.DRIPSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(ModStoneBlocks.DRIPSTONE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_brick_stairs")))));
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModStoneBlocks.DRIPSTONE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_brick_slab")))));
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModStoneBlocks.DRIPSTONE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_brick_wall")))));
    //Dripstone Tiles
    public static final Block DRIPSTONE_TILES = registerBlock("dripstone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_tiles")))
                    .strength(0.85F, 0.85F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TILE_STAIRS = registerBlock("dripstone_tile_stairs",
            new StairsBlock(ModStoneBlocks.DRIPSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(ModStoneBlocks.DRIPSTONE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_tile_stairs")))));
    public static final Block DRIPSTONE_TILE_SLAB = registerBlock("dripstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModStoneBlocks.DRIPSTONE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_tile_slab")))));
    public static final Block DRIPSTONE_TILE_WALL = registerBlock("dripstone_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModStoneBlocks.DRIPSTONE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_tile_wall")))));



    public static void registerModStoneBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModStoneBlocks.MARBLE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            //Marble
            entries.add(ModStoneBlocks.MARBLE);
            entries.add(ModStoneBlocks.MARBLE_STAIRS);
            entries.add(ModStoneBlocks.MARBLE_SLAB);
            entries.add(ModStoneBlocks.MARBLE_WALL);
            //Polished Marble
            entries.add(ModStoneBlocks.POLISHED_MARBLE);
            entries.add(ModStoneBlocks.POLISHED_MARBLE_STAIRS);
            entries.add(ModStoneBlocks.POLISHED_MARBLE_SLAB);
            entries.add(ModStoneBlocks.POLISHED_MARBLE_WALL);
            //Marble Bricks
            entries.add(ModStoneBlocks.MARBLE_BRICKS);
            entries.add(ModStoneBlocks.MARBLE_BRICK_STAIRS);
            entries.add(ModStoneBlocks.MARBLE_BRICK_SLAB);
            entries.add(ModStoneBlocks.MARBLE_BRICK_WALL);
            //Marble Tiles
            entries.add(ModStoneBlocks.MARBLE_TILES);
            entries.add(ModStoneBlocks.MARBLE_TILE_STAIRS);
            entries.add(ModStoneBlocks.MARBLE_TILE_SLAB);
            entries.add(ModStoneBlocks.MARBLE_TILE_WALL);


            //Calcite Family//
            //Polished Calcite
            entries.add(ModStoneBlocks.POLISHED_CALCITE);
            entries.add(ModStoneBlocks.POLISHED_CALCITE_STAIRS);
            entries.add(ModStoneBlocks.POLISHED_CALCITE_SLAB);
            entries.add(ModStoneBlocks.POLISHED_CALCITE_WALL);
            //Calcite Bricks
            entries.add(ModStoneBlocks.CALCITE_BRICKS);
            entries.add(ModStoneBlocks.CALCITE_BRICK_STAIRS);
            entries.add(ModStoneBlocks.CALCITE_BRICK_SLAB);
            entries.add(ModStoneBlocks.CALCITE_BRICK_WALL);
            //Calcite Tiles
            entries.add(ModStoneBlocks.CALCITE_TILES);
            entries.add(ModStoneBlocks.CALCITE_TILE_STAIRS);
            entries.add(ModStoneBlocks.CALCITE_TILE_SLAB);
            entries.add(ModStoneBlocks.CALCITE_TILE_WALL);


            //Igneous Rock Addons
            //Andesite//
            //Andesite Bricks
            entries.add(ModStoneBlocks.ANDESITE_BRICKS);
            entries.add(ModStoneBlocks.ANDESITE_BRICK_STAIRS);
            entries.add(ModStoneBlocks.ANDESITE_BRICK_SLAB);
            entries.add(ModStoneBlocks.ANDESITE_BRICK_WALL);
            entries.add(ModStoneBlocks.ANDESITE_TILES);
            entries.add(ModStoneBlocks.ANDESITE_TILE_STAIRS);
            entries.add(ModStoneBlocks.ANDESITE_TILE_SLAB);
            entries.add(ModStoneBlocks.ANDESITE_TILE_WALL);
            //Granite//
            //Granite Bricks
            entries.add(ModStoneBlocks.GRANITE_BRICKS);
            entries.add(ModStoneBlocks.GRANITE_BRICK_STAIRS);
            entries.add(ModStoneBlocks.GRANITE_BRICK_SLAB);
            entries.add(ModStoneBlocks.GRANITE_BRICK_WALL);
            entries.add(ModStoneBlocks.GRANITE_TILES);
            entries.add(ModStoneBlocks.GRANITE_TILE_STAIRS);
            entries.add(ModStoneBlocks.GRANITE_TILE_SLAB);
            entries.add(ModStoneBlocks.GRANITE_TILE_WALL);
            //Diorite//
            //Diorite Bricks
            entries.add(ModStoneBlocks.DIORITE_BRICKS);
            entries.add(ModStoneBlocks.DIORITE_BRICK_STAIRS);
            entries.add(ModStoneBlocks.DIORITE_BRICK_SLAB);
            entries.add(ModStoneBlocks.DIORITE_BRICK_WALL);
            entries.add(ModStoneBlocks.DIORITE_TILES);
            entries.add(ModStoneBlocks.DIORITE_TILE_STAIRS);
            entries.add(ModStoneBlocks.DIORITE_TILE_SLAB);
            entries.add(ModStoneBlocks.DIORITE_TILE_WALL);


            //Basalt Family//
            //Refined Basalt
            entries.add(ModStoneBlocks.REFINED_BASALT);
            entries.add(ModStoneBlocks.REFINED_BASALT_STAIRS);
            entries.add(ModStoneBlocks.REFINED_BASALT_SLAB);
            entries.add(ModStoneBlocks.REFINED_BASALT_WALL);
            //Refined Basalt Bricks
            entries.add(ModStoneBlocks.REFINED_BASALT_BRICKS);
            entries.add(ModStoneBlocks.REFINED_BASALT_BRICK_STAIRS);
            entries.add(ModStoneBlocks.REFINED_BASALT_BRICK_SLAB);
            entries.add(ModStoneBlocks.REFINED_BASALT_BRICK_WALL);
            //Refined Basalt Tiles
            entries.add(ModStoneBlocks.REFINED_BASALT_TILES);
            entries.add(ModStoneBlocks.REFINED_BASALT_TILE_STAIRS);
            entries.add(ModStoneBlocks.REFINED_BASALT_TILE_SLAB);
            entries.add(ModStoneBlocks.REFINED_BASALT_TILE_WALL);


            //Dripstone Family//
            //Polished Dripstone
            entries.add(ModStoneBlocks.POLISHED_DRIPSTONE);
            entries.add(ModStoneBlocks.POLISHED_DRIPSTONE_STAIRS);
            entries.add(ModStoneBlocks.POLISHED_DRIPSTONE_SLAB);
            entries.add(ModStoneBlocks.POLISHED_DRIPSTONE_WALL);
            //Dripstone Bricks
            entries.add(ModStoneBlocks.DRIPSTONE_BRICKS);
            entries.add(ModStoneBlocks.DRIPSTONE_BRICK_STAIRS);
            entries.add(ModStoneBlocks.DRIPSTONE_BRICK_SLAB);
            entries.add(ModStoneBlocks.DRIPSTONE_BRICK_WALL);
            //Dripstone Tiles
            entries.add(ModStoneBlocks.DRIPSTONE_TILES);
            entries.add(ModStoneBlocks.DRIPSTONE_TILE_STAIRS);
            entries.add(ModStoneBlocks.DRIPSTONE_TILE_SLAB);
            entries.add(ModStoneBlocks.DRIPSTONE_TILE_WALL);
        });
    }
}
