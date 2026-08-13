package vtb2s.additions.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static vtb2s.additions.register.RegisterMethods.registerBlock;
import static vtb2s.additions.vTB2sAdditions.MOD_ID;

public class ModQuartzBlocks {
    //Amethyst Family//
    //Polished Amethyst
    public static final Block POLISHED_AMETHYST = registerBlock("polished_amethyst",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_amethyst")))
                    .strength(1.5F, 1.5F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block POLISHED_AMETHYST_STAIRS = registerBlock("polished_amethyst_stairs",
            new StairsBlock(POLISHED_AMETHYST.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_AMETHYST)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_amethyst_stairs")))));
    public static final Block POLISHED_AMETHYST_SLAB = registerBlock("polished_amethyst_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_AMETHYST)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_amethyst_slab")))));
    public static final Block POLISHED_AMETHYST_WALL = registerBlock("polished_amethyst_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_AMETHYST)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_amethyst_wall")))));
    //Amethyst Bricks
    public static final Block AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_bricks")))
                    .strength(1.5F, 1.5F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs",
            new StairsBlock(AMETHYST_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(AMETHYST_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_brick_stairs")))));
    public static final Block AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(AMETHYST_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_brick_slab")))));
    public static final Block AMETHYST_BRICK_WALL = registerBlock("amethyst_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(AMETHYST_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_brick_wall")))));
    //Amethyst Tiles
    public static final Block AMETHYST_TILES = registerBlock("amethyst_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_tiles")))
                    .strength(1.5F, 1.5F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block AMETHYST_TILE_STAIRS = registerBlock("amethyst_tile_stairs",
            new StairsBlock(AMETHYST_TILES.getDefaultState(), AbstractBlock.Settings.copy(AMETHYST_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_tile_stairs")))));
    public static final Block AMETHYST_TILE_SLAB = registerBlock("amethyst_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(AMETHYST_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_tile_slab")))));
    public static final Block AMETHYST_TILE_WALL = registerBlock("amethyst_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(AMETHYST_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_tile_wall")))));
    //Smooth Amethyst
    public static final Block SMOOTH_AMETHYST = registerBlock("smooth_amethyst",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_amethyst")))
                    .strength(2.5F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block SMOOTH_AMETHYST_STAIRS = registerBlock("smooth_amethyst_stairs",
            new StairsBlock(SMOOTH_AMETHYST.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_AMETHYST)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_amethyst_stairs")))));
    public static final Block SMOOTH_AMETHYST_SLAB = registerBlock("smooth_amethyst_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_AMETHYST)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_amethyst_slab")))));
    public static final Block SMOOTH_AMETHYST_WALL = registerBlock("smooth_amethyst_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_AMETHYST)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_amethyst_wall")))));


    //Rose Quartz Family//
    //Rose Quartz
    public static final Block ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_block")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block ROSE_QUARTZ_STAIRS = registerBlock("rose_quartz_stairs",
            new StairsBlock(ROSE_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(ROSE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_stairs")))));
    public static final Block ROSE_QUARTZ_SLAB = registerBlock("rose_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ROSE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_slab")))));
    public static final Block ROSE_QUARTZ_WALL = registerBlock("rose_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(ROSE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_wall")))));
    //Rose Quartz Bricks
    public static final Block ROSE_QUARTZ_BRICKS = registerBlock("rose_quartz_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_bricks")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block ROSE_QUARTZ_BRICK_STAIRS = registerBlock("rose_quartz_brick_stairs",
            new StairsBlock(ROSE_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(ROSE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_brick_stairs")))));
    public static final Block ROSE_QUARTZ_BRICK_SLAB = registerBlock("rose_quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ROSE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_brick_slab")))));
    public static final Block ROSE_QUARTZ_BRICK_WALL = registerBlock("rose_quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(ROSE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_brick_wall")))));
    //Rose Quartz Tiles
    public static final Block ROSE_QUARTZ_TILES = registerBlock("rose_quartz_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_tiles")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block ROSE_QUARTZ_TILE_STAIRS = registerBlock("rose_quartz_tile_stairs",
            new StairsBlock(ROSE_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(ROSE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_tile_stairs")))));
    public static final Block ROSE_QUARTZ_TILE_SLAB = registerBlock("rose_quartz_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ROSE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_tile_slab")))));
    public static final Block ROSE_QUARTZ_TILE_WALL = registerBlock("rose_quartz_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(ROSE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_quartz_tile_wall")))));
    //Smooth Rose Quartz
    public static final Block SMOOTH_ROSE_QUARTZ = registerBlock("smooth_rose_quartz",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_rose_quartz")))
                    .strength(2f, 6f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_ROSE_QUARTZ_STAIRS = registerBlock("smooth_rose_quartz_stairs",
            new StairsBlock(SMOOTH_ROSE_QUARTZ.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_ROSE_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_rose_quartz_stairs")))));
    public static final Block SMOOTH_ROSE_QUARTZ_SLAB = registerBlock("smooth_rose_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_ROSE_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_rose_quartz_slab")))));
    public static final Block SMOOTH_ROSE_QUARTZ_WALL = registerBlock("smooth_rose_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_ROSE_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_rose_quartz_wall")))));


    //Crimson Quartz Family//
    //Crimson Quartz
    public static final Block CRIMSON_QUARTZ_BLOCK = registerBlock("crimson_quartz_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_block")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRIMSON_QUARTZ_STAIRS = registerBlock("crimson_quartz_stairs",
            new StairsBlock(CRIMSON_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(CRIMSON_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_stairs")))));
    public static final Block CRIMSON_QUARTZ_SLAB = registerBlock("crimson_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(CRIMSON_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_slab")))));
    public static final Block CRIMSON_QUARTZ_WALL = registerBlock("crimson_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(CRIMSON_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_wall")))));
    //Crimson Quartz Bricks
    public static final Block CRIMSON_QUARTZ_BRICKS = registerBlock("crimson_quartz_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_bricks")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRIMSON_QUARTZ_BRICK_STAIRS = registerBlock("crimson_quartz_brick_stairs",
            new StairsBlock(CRIMSON_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(CRIMSON_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_brick_stairs")))));
    public static final Block CRIMSON_QUARTZ_BRICK_SLAB = registerBlock("crimson_quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(CRIMSON_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_brick_slab")))));
    public static final Block CRIMSON_QUARTZ_BRICK_WALL = registerBlock("crimson_quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(CRIMSON_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_brick_wall")))));
    //Crimson Quartz Tiles
    public static final Block CRIMSON_QUARTZ_TILES = registerBlock("crimson_quartz_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_tiles")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRIMSON_QUARTZ_TILE_STAIRS = registerBlock("crimson_quartz_tile_stairs",
            new StairsBlock(CRIMSON_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(CRIMSON_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_tile_stairs")))));
    public static final Block CRIMSON_QUARTZ_TILE_SLAB = registerBlock("crimson_quartz_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(CRIMSON_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_tile_slab")))));
    public static final Block CRIMSON_QUARTZ_TILE_WALL = registerBlock("crimson_quartz_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(CRIMSON_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_quartz_tile_wall")))));
    //Smooth Crimson Quartz
    public static final Block SMOOTH_CRIMSON_QUARTZ = registerBlock("smooth_crimson_quartz",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_crimson_quartz")))
                    .strength(2f, 6f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_CRIMSON_QUARTZ_STAIRS = registerBlock("smooth_crimson_quartz_stairs",
            new StairsBlock(SMOOTH_CRIMSON_QUARTZ.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_CRIMSON_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_crimson_quartz_stairs")))));
    public static final Block SMOOTH_CRIMSON_QUARTZ_SLAB = registerBlock("smooth_crimson_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_CRIMSON_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_crimson_quartz_slab")))));
    public static final Block SMOOTH_CRIMSON_QUARTZ_WALL = registerBlock("smooth_crimson_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_CRIMSON_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_crimson_quartz_wall")))));


    //Soul Quartz Family//
    //Soul Quartz
    public static final Block SOUL_QUARTZ_BLOCK = registerBlock("soul_quartz_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_block")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SOUL_QUARTZ_STAIRS = registerBlock("soul_quartz_stairs",
            new StairsBlock(SOUL_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SOUL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_stairs")))));
    public static final Block SOUL_QUARTZ_SLAB = registerBlock("soul_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SOUL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_slab")))));
    public static final Block SOUL_QUARTZ_WALL = registerBlock("soul_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(SOUL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_wall")))));
    //Soul Quartz Bricks
    public static final Block SOUL_QUARTZ_BRICKS = registerBlock("soul_quartz_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_bricks")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SOUL_QUARTZ_BRICK_STAIRS = registerBlock("soul_quartz_brick_stairs",
            new StairsBlock(SOUL_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SOUL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_brick_stairs")))));
    public static final Block SOUL_QUARTZ_BRICK_SLAB = registerBlock("soul_quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SOUL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_brick_slab")))));
    public static final Block SOUL_QUARTZ_BRICK_WALL = registerBlock("soul_quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(SOUL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_brick_wall")))));
    //Soul Quartz Tiles
    public static final Block SOUL_QUARTZ_TILES = registerBlock("soul_quartz_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_tiles")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SOUL_QUARTZ_TILE_STAIRS = registerBlock("soul_quartz_tile_stairs",
            new StairsBlock(SOUL_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SOUL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_tile_stairs")))));
    public static final Block SOUL_QUARTZ_TILE_SLAB = registerBlock("soul_quartz_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SOUL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_tile_slab")))));
    public static final Block SOUL_QUARTZ_TILE_WALL = registerBlock("soul_quartz_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(SOUL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_quartz_tile_wall")))));
    //Smooth Soul Quartz
    public static final Block SMOOTH_SOUL_QUARTZ = registerBlock("smooth_soul_quartz",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_soul_quartz")))
                    .strength(2f, 6f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_SOUL_QUARTZ_STAIRS = registerBlock("smooth_soul_quartz_stairs",
            new StairsBlock(SMOOTH_SOUL_QUARTZ.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_SOUL_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_soul_quartz_stairs")))));
    public static final Block SMOOTH_SOUL_QUARTZ_SLAB = registerBlock("smooth_soul_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_SOUL_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_soul_quartz_slab")))));
    public static final Block SMOOTH_SOUL_QUARTZ_WALL = registerBlock("smooth_soul_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_SOUL_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_soul_quartz_wall")))));


    //Smokey Quartz Family//
    //Smokey Quartz
    public static final Block SMOKEY_QUARTZ_BLOCK = registerBlock("smokey_quartz_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_block")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOKEY_QUARTZ_STAIRS = registerBlock("smokey_quartz_stairs",
            new StairsBlock(SMOKEY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKEY_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_stairs")))));
    public static final Block SMOKEY_QUARTZ_SLAB = registerBlock("smokey_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOKEY_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_slab")))));
    public static final Block SMOKEY_QUARTZ_WALL = registerBlock("smokey_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOKEY_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_wall")))));
    //Smokey Quartz Bricks
    public static final Block SMOKEY_QUARTZ_BRICKS = registerBlock("smokey_quartz_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_bricks")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOKEY_QUARTZ_BRICK_STAIRS = registerBlock("smokey_quartz_brick_stairs",
            new StairsBlock(SMOKEY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKEY_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_brick_stairs")))));
    public static final Block SMOKEY_QUARTZ_BRICK_SLAB = registerBlock("smokey_quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOKEY_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_brick_slab")))));
    public static final Block SMOKEY_QUARTZ_BRICK_WALL = registerBlock("smokey_quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOKEY_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_brick_wall")))));
    //Smokey Quartz Tiles
    public static final Block SMOKEY_QUARTZ_TILES = registerBlock("smokey_quartz_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_tiles")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOKEY_QUARTZ_TILE_STAIRS = registerBlock("smokey_quartz_tile_stairs",
            new StairsBlock(SMOKEY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKEY_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_tile_stairs")))));
    public static final Block SMOKEY_QUARTZ_TILE_SLAB = registerBlock("smokey_quartz_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOKEY_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_tile_slab")))));
    public static final Block SMOKEY_QUARTZ_TILE_WALL = registerBlock("smokey_quartz_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOKEY_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_quartz_tile_wall")))));
    //Smooth Smokey Quartz
    public static final Block SMOOTH_SMOKEY_QUARTZ = registerBlock("smooth_smokey_quartz",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_smokey_quartz")))
                    .strength(2f, 6f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_SMOKEY_QUARTZ_STAIRS = registerBlock("smooth_smokey_quartz_stairs",
            new StairsBlock(SMOOTH_SMOKEY_QUARTZ.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_SMOKEY_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_smokey_quartz_stairs")))));
    public static final Block SMOOTH_SMOKEY_QUARTZ_SLAB = registerBlock("smooth_smokey_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_SMOKEY_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_smokey_quartz_slab")))));
    public static final Block SMOOTH_SMOKEY_QUARTZ_WALL = registerBlock("smooth_smokey_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_SMOKEY_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_smokey_quartz_wall")))));


    //Infernal Quartz Family//
    //Infernal Quartz
    public static final Block INFERNAL_QUARTZ_BLOCK = registerBlock("infernal_quartz_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_block")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block INFERNAL_QUARTZ_STAIRS = registerBlock("infernal_quartz_stairs",
            new StairsBlock(INFERNAL_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(INFERNAL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_stairs")))));
    public static final Block INFERNAL_QUARTZ_SLAB = registerBlock("infernal_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(INFERNAL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_slab")))));
    public static final Block INFERNAL_QUARTZ_WALL = registerBlock("infernal_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(INFERNAL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_wall")))));
    //Infernal Quartz Bricks
    public static final Block INFERNAL_QUARTZ_BRICKS = registerBlock("infernal_quartz_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_bricks")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block INFERNAL_QUARTZ_BRICK_STAIRS = registerBlock("infernal_quartz_brick_stairs",
            new StairsBlock(INFERNAL_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(INFERNAL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_brick_stairs")))));
    public static final Block INFERNAL_QUARTZ_BRICK_SLAB = registerBlock("infernal_quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(INFERNAL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_brick_slab")))));
    public static final Block INFERNAL_QUARTZ_BRICK_WALL = registerBlock("infernal_quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(INFERNAL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_brick_wall")))));
    //Infernal Quartz Tiles
    public static final Block INFERNAL_QUARTZ_TILES = registerBlock("infernal_quartz_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_tiles")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block INFERNAL_QUARTZ_TILE_STAIRS = registerBlock("infernal_quartz_tile_stairs",
            new StairsBlock(INFERNAL_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(INFERNAL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_tile_stairs")))));
    public static final Block INFERNAL_QUARTZ_TILE_SLAB = registerBlock("infernal_quartz_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(INFERNAL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_tile_slab")))));
    public static final Block INFERNAL_QUARTZ_TILE_WALL = registerBlock("infernal_quartz_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(INFERNAL_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_quartz_tile_wall")))));
    //Smooth Infernal Quartz
    public static final Block SMOOTH_INFERNAL_QUARTZ = registerBlock("smooth_infernal_quartz",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_infernal_quartz")))
                    .strength(2f, 6f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_INFERNAL_QUARTZ_STAIRS = registerBlock("smooth_infernal_quartz_stairs",
            new StairsBlock(SMOOTH_INFERNAL_QUARTZ.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_INFERNAL_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_infernal_quartz_stairs")))));
    public static final Block SMOOTH_INFERNAL_QUARTZ_SLAB = registerBlock("smooth_infernal_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_INFERNAL_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_infernal_quartz_slab")))));
    public static final Block SMOOTH_INFERNAL_QUARTZ_WALL = registerBlock("smooth_infernal_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_INFERNAL_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_infernal_quartz_wall")))));


    //Prasiolite Quartz Family//
    //Prasiolite Quartz
    public static final Block PRASIOLITE_QUARTZ_BLOCK = registerBlock("prasiolite_quartz_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_block")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PRASIOLITE_QUARTZ_STAIRS = registerBlock("prasiolite_quartz_stairs",
            new StairsBlock(PRASIOLITE_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(PRASIOLITE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_stairs")))));
    public static final Block PRASIOLITE_QUARTZ_SLAB = registerBlock("prasiolite_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(PRASIOLITE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_slab")))));
    public static final Block PRASIOLITE_QUARTZ_WALL = registerBlock("prasiolite_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(PRASIOLITE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_wall")))));
    //Prasiolite Quartz Bricks
    public static final Block PRASIOLITE_QUARTZ_BRICKS = registerBlock("prasiolite_quartz_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_bricks")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PRASIOLITE_QUARTZ_BRICK_STAIRS = registerBlock("prasiolite_quartz_brick_stairs",
            new StairsBlock(PRASIOLITE_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(PRASIOLITE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_brick_stairs")))));
    public static final Block PRASIOLITE_QUARTZ_BRICK_SLAB = registerBlock("prasiolite_quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(PRASIOLITE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_brick_slab")))));
    public static final Block PRASIOLITE_QUARTZ_BRICK_WALL = registerBlock("prasiolite_quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(PRASIOLITE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_brick_wall")))));
    //Prasiolite Quartz Tiles
    public static final Block PRASIOLITE_QUARTZ_TILES = registerBlock("prasiolite_quartz_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_tiles")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PRASIOLITE_QUARTZ_TILE_STAIRS = registerBlock("prasiolite_quartz_tile_stairs",
            new StairsBlock(PRASIOLITE_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(PRASIOLITE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_tile_stairs")))));
    public static final Block PRASIOLITE_QUARTZ_TILE_SLAB = registerBlock("prasiolite_quartz_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(PRASIOLITE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_tile_slab")))));
    public static final Block PRASIOLITE_QUARTZ_TILE_WALL = registerBlock("prasiolite_quartz_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(PRASIOLITE_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_tile_wall")))));
    //Smooth Prasiolite Quartz
    public static final Block SMOOTH_PRASIOLITE_QUARTZ = registerBlock("smooth_prasiolite_quartz",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_prasiolite_quartz")))
                    .strength(2f, 6f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_PRASIOLITE_QUARTZ_STAIRS = registerBlock("smooth_prasiolite_quartz_stairs",
            new StairsBlock(SMOOTH_PRASIOLITE_QUARTZ.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_PRASIOLITE_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_prasiolite_quartz_stairs")))));
    public static final Block SMOOTH_PRASIOLITE_QUARTZ_SLAB = registerBlock("smooth_prasiolite_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_PRASIOLITE_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_prasiolite_quartz_slab")))));
    public static final Block SMOOTH_PRASIOLITE_QUARTZ_WALL = registerBlock("smooth_prasiolite_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_PRASIOLITE_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_prasiolite_quartz_wall")))));


    //Indigo Quartz Family//
    //Indigo Quartz
    public static final Block INDIGO_QUARTZ_BLOCK = registerBlock("indigo_quartz_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_block")))
                    .strength(0.8F, 0.8F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block INDIGO_QUARTZ_STAIRS = registerBlock("indigo_quartz_stairs",
            new StairsBlock(INDIGO_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(INDIGO_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_stairs")))));
    public static final Block INDIGO_QUARTZ_SLAB = registerBlock("indigo_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(INDIGO_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_slab")))));
    public static final Block INDIGO_QUARTZ_WALL = registerBlock("indigo_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(INDIGO_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_wall")))));
    //Indigo Quartz Bricks
    public static final Block INDIGO_QUARTZ_BRICKS = registerBlock("indigo_quartz_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_bricks")))
                    .strength(0.8F, 0.8F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block INDIGO_QUARTZ_BRICK_STAIRS = registerBlock("indigo_quartz_brick_stairs",
            new StairsBlock(INDIGO_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(INDIGO_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_brick_stairs")))));
    public static final Block INDIGO_QUARTZ_BRICK_SLAB = registerBlock("indigo_quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(INDIGO_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_brick_slab")))));
    public static final Block INDIGO_QUARTZ_BRICK_WALL = registerBlock("indigo_quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(INDIGO_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_brick_wall")))));
    //Indigo Quartz Tiles
    public static final Block INDIGO_QUARTZ_TILES = registerBlock("indigo_quartz_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_tiles")))
                    .strength(0.8F, 0.8F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block INDIGO_QUARTZ_TILE_STAIRS = registerBlock("indigo_quartz_tile_stairs",
            new StairsBlock(INDIGO_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(INDIGO_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_tile_stairs")))));
    public static final Block INDIGO_QUARTZ_TILE_SLAB = registerBlock("indigo_quartz_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(INDIGO_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_tile_slab")))));
    public static final Block INDIGO_QUARTZ_TILE_WALL = registerBlock("indigo_quartz_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(INDIGO_QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "indigo_quartz_tile_wall")))));
    //Smooth Indigo Quartz
    public static final Block SMOOTH_INDIGO_QUARTZ = registerBlock("smooth_indigo_quartz",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_indigo_quartz")))
                    .strength(2F, 6F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_INDIGO_QUARTZ_STAIRS = registerBlock("smooth_indigo_quartz_stairs",
            new StairsBlock(SMOOTH_INDIGO_QUARTZ.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_INDIGO_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_indigo_quartz_stairs")))));
    public static final Block SMOOTH_INDIGO_QUARTZ_SLAB = registerBlock("smooth_indigo_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_INDIGO_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_indigo_quartz_slab")))));
    public static final Block SMOOTH_INDIGO_QUARTZ_WALL = registerBlock("smooth_indigo_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_INDIGO_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_indigo_quartz_wall")))));


    //Citrine Family//
    //Citrine Quartz
    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_block")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_STAIRS = registerBlock("citrine_stairs",
            new StairsBlock(CITRINE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(CITRINE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_stairs")))));
    public static final Block CITRINE_SLAB = registerBlock("citrine_slab",
            new SlabBlock(AbstractBlock.Settings.copy(CITRINE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_slab")))));
    public static final Block CITRINE_WALL = registerBlock("citrine_wall",
            new WallBlock(AbstractBlock.Settings.copy(CITRINE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_wall")))));
    //Citrine Bricks
    public static final Block CITRINE_BRICKS = registerBlock("citrine_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_bricks")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_BRICK_STAIRS = registerBlock("citrine_brick_stairs",
            new StairsBlock(CITRINE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(CITRINE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_brick_stairs")))));
    public static final Block CITRINE_BRICK_SLAB = registerBlock("citrine_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(CITRINE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_brick_slab")))));
    public static final Block CITRINE_BRICK_WALL = registerBlock("citrine_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(CITRINE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_brick_wall")))));
    //Citrine Tiles
    public static final Block CITRINE_TILES = registerBlock("citrine_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_tiles")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_TILE_STAIRS = registerBlock("citrine_tile_stairs",
            new StairsBlock(CITRINE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(CITRINE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_tile_stairs")))));
    public static final Block CITRINE_TILE_SLAB = registerBlock("citrine_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(CITRINE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_tile_slab")))));
    public static final Block CITRINE_TILE_WALL = registerBlock("citrine_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(CITRINE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_tile_wall")))));
    //Smooth Citrine
    public static final Block SMOOTH_CITRINE = registerBlock("smooth_citrine",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_citrine")))
                    .strength(2f, 6f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_CITRINE_STAIRS = registerBlock("smooth_citrine_stairs",
            new StairsBlock(SMOOTH_CITRINE.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_CITRINE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_citrine_stairs")))));
    public static final Block SMOOTH_CITRINE_SLAB = registerBlock("smooth_citrine_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_CITRINE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_citrine_slab")))));
    public static final Block SMOOTH_CITRINE_WALL = registerBlock("smooth_citrine_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_CITRINE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_citrine_wall")))));


    //Quartz Tiles
    public static final Block QUARTZ_TILES = registerBlock("quartz_tiles",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_tiles")))
                    .strength(0.8f, 0.8f)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZ_TILE_STAIRS = registerBlock("quartz_tile_stairs",
            new StairsBlock(Blocks.QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_tile_stairs")))));
    public static final Block QUARTZ_TILE_SLAB = registerBlock("quartz_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_tile_slab")))));
    public static final Block QUARTZ_TILE_WALL = registerBlock("quartz_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_tile_wall")))));
    
    public static void registerModQuartzBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            //Rose Quartz Family//
            //Rose Quartz
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_BLOCK);
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_WALL);
            //Rose Quartz Bricks
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_BRICKS);
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_BRICK_STAIRS);
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_BRICK_SLAB);
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_BRICK_WALL);
            //Rose Quartz Tiles
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_TILES);
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_TILE_STAIRS);
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_TILE_SLAB);
            entries.add(ModQuartzBlocks.ROSE_QUARTZ_TILE_WALL);
            //Smooth Rose Quartz
            entries.add(ModQuartzBlocks.SMOOTH_ROSE_QUARTZ);
            entries.add(ModQuartzBlocks.SMOOTH_ROSE_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.SMOOTH_ROSE_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.SMOOTH_ROSE_QUARTZ_WALL);
            //Crimson Quartz Family//
            //Crimson Quartz
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_BLOCK);
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_WALL);
            //Crimson Quartz Bricks
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_BRICKS);
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_BRICK_STAIRS);
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_BRICK_SLAB);
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_BRICK_WALL);
            //Crimson Quartz Tiles
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_TILES);
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_TILE_STAIRS);
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_TILE_SLAB);
            entries.add(ModQuartzBlocks.CRIMSON_QUARTZ_TILE_WALL);
            //Smooth Crimson Quartz
            entries.add(ModQuartzBlocks.SMOOTH_CRIMSON_QUARTZ);
            entries.add(ModQuartzBlocks.SMOOTH_CRIMSON_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.SMOOTH_CRIMSON_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.SMOOTH_CRIMSON_QUARTZ_WALL);
            //Infernal Quartz Family//
            //Infernal Quartz
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_BLOCK);
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_WALL);
            //Infernal Quartz Bricks
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_BRICKS);
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_BRICK_STAIRS);
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_BRICK_SLAB);
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_BRICK_WALL);
            //Infernal Quartz Tiles
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_TILES);
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_TILE_STAIRS);
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_TILE_SLAB);
            entries.add(ModQuartzBlocks.INFERNAL_QUARTZ_TILE_WALL);
            //Smooth Infernal Quartz
            entries.add(ModQuartzBlocks.SMOOTH_INFERNAL_QUARTZ);
            entries.add(ModQuartzBlocks.SMOOTH_INFERNAL_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.SMOOTH_INFERNAL_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.SMOOTH_INFERNAL_QUARTZ_WALL);
            //Smokey Quartz Family//
            //Smokey Quartz
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_BLOCK);
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_WALL);
            //Smokey Quartz Bricks
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_BRICKS);
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_BRICK_STAIRS);
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_BRICK_SLAB);
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_BRICK_WALL);
            //Smokey Quartz Tiles
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_TILES);
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_TILE_STAIRS);
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_TILE_SLAB);
            entries.add(ModQuartzBlocks.SMOKEY_QUARTZ_TILE_WALL);
            //Smooth Smokey Quartz
            entries.add(ModQuartzBlocks.SMOOTH_SMOKEY_QUARTZ);
            entries.add(ModQuartzBlocks.SMOOTH_SMOKEY_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.SMOOTH_SMOKEY_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.SMOOTH_SMOKEY_QUARTZ_WALL);
            //Soul Quartz Family//
            //Soul Quartz
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_BLOCK);
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_WALL);
            //Soul Quartz Bricks
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_BRICKS);
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_BRICK_STAIRS);
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_BRICK_SLAB);
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_BRICK_WALL);
            //Soul Quartz Tiles
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_TILES);
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_TILE_STAIRS);
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_TILE_SLAB);
            entries.add(ModQuartzBlocks.SOUL_QUARTZ_TILE_WALL);
            //Smooth Soul Quartz
            entries.add(ModQuartzBlocks.SMOOTH_SOUL_QUARTZ);
            entries.add(ModQuartzBlocks.SMOOTH_SOUL_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.SMOOTH_SOUL_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.SMOOTH_SOUL_QUARTZ_WALL);
            //Prasiolite Quartz Family//
            //Prasiolite Quartz
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_BLOCK);
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_WALL);
            //Prasiolite Quartz Bricks
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_BRICKS);
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_BRICK_STAIRS);
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_BRICK_SLAB);
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_BRICK_WALL);
            //Prasiolite Quartz Tiles
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_TILES);
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_TILE_STAIRS);
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_TILE_SLAB);
            entries.add(ModQuartzBlocks.PRASIOLITE_QUARTZ_TILE_WALL);
            //Smooth Prasiolite Quartz
            entries.add(ModQuartzBlocks.SMOOTH_PRASIOLITE_QUARTZ);
            entries.add(ModQuartzBlocks.SMOOTH_PRASIOLITE_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.SMOOTH_PRASIOLITE_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.SMOOTH_PRASIOLITE_QUARTZ_WALL);
            //Indigo Quartz Family//
            //Indigo Quartz
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_BLOCK);
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_WALL);
            //Indigo Quartz Bricks
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_BRICKS);
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_BRICK_STAIRS);
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_BRICK_SLAB);
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_BRICK_WALL);
            //Indigo Quartz Tiles
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_TILES);
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_TILE_STAIRS);
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_TILE_SLAB);
            entries.add(ModQuartzBlocks.INDIGO_QUARTZ_TILE_WALL);
            //Smooth Indigo Quartz
            entries.add(ModQuartzBlocks.SMOOTH_INDIGO_QUARTZ);
            entries.add(ModQuartzBlocks.SMOOTH_INDIGO_QUARTZ_STAIRS);
            entries.add(ModQuartzBlocks.SMOOTH_INDIGO_QUARTZ_SLAB);
            entries.add(ModQuartzBlocks.SMOOTH_INDIGO_QUARTZ_WALL);
            //Citrine Family//
            //Citrine 
            entries.add(CITRINE_BLOCK);
            entries.add(CITRINE_STAIRS);
            entries.add(CITRINE_SLAB);
            entries.add(CITRINE_WALL);
            //Citrine Bricks
            entries.add(CITRINE_BRICKS);
            entries.add(CITRINE_BRICK_STAIRS);
            entries.add(CITRINE_BRICK_SLAB);
            entries.add(CITRINE_BRICK_WALL);
            //Citrine Tiles
            entries.add(CITRINE_TILES);
            entries.add(CITRINE_TILE_STAIRS);
            entries.add(CITRINE_TILE_SLAB);
            entries.add(CITRINE_TILE_WALL);
            //Smooth Citrine 
            entries.add(SMOOTH_CITRINE);
            entries.add(SMOOTH_CITRINE_STAIRS);
            entries.add(SMOOTH_CITRINE_SLAB);
            entries.add(SMOOTH_CITRINE_WALL);


            //Amethyst Family//
            //Polished Amethyst
            entries.add(ModQuartzBlocks.POLISHED_AMETHYST);
            entries.add(ModQuartzBlocks.POLISHED_AMETHYST_STAIRS);
            entries.add(ModQuartzBlocks.POLISHED_AMETHYST_SLAB);
            entries.add(ModQuartzBlocks.POLISHED_AMETHYST_WALL);
            //Amethyst Bricks
            entries.add(ModQuartzBlocks.AMETHYST_BRICKS);
            entries.add(ModQuartzBlocks.AMETHYST_BRICK_STAIRS);
            entries.add(ModQuartzBlocks.AMETHYST_BRICK_SLAB);
            entries.add(ModQuartzBlocks.AMETHYST_BRICK_WALL);
            //Amethyst Tiles
            entries.add(ModQuartzBlocks.AMETHYST_TILES);
            entries.add(ModQuartzBlocks.AMETHYST_TILE_STAIRS);
            entries.add(ModQuartzBlocks.AMETHYST_TILE_SLAB);
            entries.add(ModQuartzBlocks.AMETHYST_TILE_WALL);
            //Smooth Amethyst
            entries.add(ModQuartzBlocks.SMOOTH_AMETHYST);
            entries.add(ModQuartzBlocks.SMOOTH_AMETHYST_STAIRS);
            entries.add(ModQuartzBlocks.SMOOTH_AMETHYST_SLAB);
            entries.add(ModQuartzBlocks.SMOOTH_AMETHYST_WALL);


            //Quartz Tiles//
            entries.add(ModQuartzBlocks.QUARTZ_TILES);
            entries.add(ModQuartzBlocks.QUARTZ_TILE_STAIRS);
            entries.add(ModQuartzBlocks.QUARTZ_TILE_SLAB);
            entries.add(ModQuartzBlocks.QUARTZ_TILE_WALL);
        });
    }
}