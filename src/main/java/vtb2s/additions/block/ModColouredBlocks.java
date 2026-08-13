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

public class ModColouredBlocks {
    //Stained Bricks//
    //White
    public static final Block WHITE_STAINED_BRICKS = registerBlock("white_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_STAINED_BRICK_STAIRS = registerBlock("white_stained_brick_stairs",
            new StairsBlock(WHITE_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(WHITE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_stained_brick_stairs")))));
    public static final Block WHITE_STAINED_BRICK_SLAB = registerBlock("white_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(WHITE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_stained_brick_slab")))));
    public static final Block WHITE_STAINED_BRICK_WALL = registerBlock("white_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(WHITE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_stained_brick_wall")))));
    //Light Gray
    public static final Block LIGHT_GRAY_STAINED_BRICKS = registerBlock("light_gray_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_GRAY_STAINED_BRICK_STAIRS = registerBlock("light_gray_stained_brick_stairs",
            new StairsBlock(LIGHT_GRAY_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(LIGHT_GRAY_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_stained_brick_stairs")))));
    public static final Block LIGHT_GRAY_STAINED_BRICK_SLAB = registerBlock("light_gray_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_stained_brick_slab")))));
    public static final Block LIGHT_GRAY_STAINED_BRICK_WALL = registerBlock("light_gray_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_stained_brick_wall")))));
    //Gray
    public static final Block GRAY_STAINED_BRICKS = registerBlock("gray_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GRAY_STAINED_BRICK_STAIRS = registerBlock("gray_stained_brick_stairs",
            new StairsBlock(GRAY_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(GRAY_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_stained_brick_stairs")))));
    public static final Block GRAY_STAINED_BRICK_SLAB = registerBlock("gray_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(GRAY_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_stained_brick_slab")))));
    public static final Block GRAY_STAINED_BRICK_WALL = registerBlock("gray_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(GRAY_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_stained_brick_wall")))));
    //Black
    public static final Block BLACK_STAINED_BRICKS = registerBlock("black_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BLACK_STAINED_BRICK_STAIRS = registerBlock("black_stained_brick_stairs",
            new StairsBlock(BLACK_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(BLACK_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_stained_brick_stairs")))));
    public static final Block BLACK_STAINED_BRICK_SLAB = registerBlock("black_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BLACK_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_stained_brick_slab")))));
    public static final Block BLACK_STAINED_BRICK_WALL = registerBlock("black_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(BLACK_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_stained_brick_wall")))));
    //Brown
    public static final Block BROWN_STAINED_BRICKS = registerBlock("brown_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BROWN_STAINED_BRICK_STAIRS = registerBlock("brown_stained_brick_stairs",
            new StairsBlock(BROWN_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(BROWN_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_stained_brick_stairs")))));
    public static final Block BROWN_STAINED_BRICK_SLAB = registerBlock("brown_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BROWN_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_stained_brick_slab")))));
    public static final Block BROWN_STAINED_BRICK_WALL = registerBlock("brown_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(BROWN_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_stained_brick_wall")))));
    //Red
    public static final Block RED_STAINED_BRICKS = registerBlock("red_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block RED_STAINED_BRICK_STAIRS = registerBlock("red_stained_brick_stairs",
            new StairsBlock(RED_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(RED_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_stained_brick_stairs")))));
    public static final Block RED_STAINED_BRICK_SLAB = registerBlock("red_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(RED_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_stained_brick_slab")))));
    public static final Block RED_STAINED_BRICK_WALL = registerBlock("red_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(RED_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_stained_brick_wall")))));
    //Orange
    public static final Block ORANGE_STAINED_BRICKS = registerBlock("orange_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_STAINED_BRICK_STAIRS = registerBlock("orange_stained_brick_stairs",
            new StairsBlock(ORANGE_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(ORANGE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_stained_brick_stairs")))));
    public static final Block ORANGE_STAINED_BRICK_SLAB = registerBlock("orange_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ORANGE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_stained_brick_slab")))));
    public static final Block ORANGE_STAINED_BRICK_WALL = registerBlock("orange_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(ORANGE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_stained_brick_wall")))));
    //Yellow
    public static final Block YELLOW_STAINED_BRICKS = registerBlock("yellow_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block YELLOW_STAINED_BRICK_STAIRS = registerBlock("yellow_stained_brick_stairs",
            new StairsBlock(YELLOW_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(YELLOW_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_stained_brick_stairs")))));
    public static final Block YELLOW_STAINED_BRICK_SLAB = registerBlock("yellow_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(YELLOW_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_stained_brick_slab")))));
    public static final Block YELLOW_STAINED_BRICK_WALL = registerBlock("yellow_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(YELLOW_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_stained_brick_wall")))));
    //Lime
    public static final Block LIME_STAINED_BRICKS = registerBlock("lime_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIME_STAINED_BRICK_STAIRS = registerBlock("lime_stained_brick_stairs",
            new StairsBlock(LIME_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(LIME_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_stained_brick_stairs")))));
    public static final Block LIME_STAINED_BRICK_SLAB = registerBlock("lime_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LIME_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_stained_brick_slab")))));
    public static final Block LIME_STAINED_BRICK_WALL = registerBlock("lime_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(LIME_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_stained_brick_wall")))));
    //Green
    public static final Block GREEN_STAINED_BRICKS = registerBlock("green_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_STAINED_BRICK_STAIRS = registerBlock("green_stained_brick_stairs",
            new StairsBlock(GREEN_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(GREEN_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_stained_brick_stairs")))));
    public static final Block GREEN_STAINED_BRICK_SLAB = registerBlock("green_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(GREEN_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_stained_brick_slab")))));
    public static final Block GREEN_STAINED_BRICK_WALL = registerBlock("green_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(GREEN_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_stained_brick_wall")))));
    //Cyan
    public static final Block CYAN_STAINED_BRICKS = registerBlock("cyan_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CYAN_STAINED_BRICK_STAIRS = registerBlock("cyan_stained_brick_stairs",
            new StairsBlock(CYAN_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(CYAN_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_stained_brick_stairs")))));
    public static final Block CYAN_STAINED_BRICK_SLAB = registerBlock("cyan_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(CYAN_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_stained_brick_slab")))));
    public static final Block CYAN_STAINED_BRICK_WALL = registerBlock("cyan_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(CYAN_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_stained_brick_wall")))));
    //Light Blue
    public static final Block LIGHT_BLUE_STAINED_BRICKS = registerBlock("light_blue_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_BLUE_STAINED_BRICK_STAIRS = registerBlock("light_blue_stained_brick_stairs",
            new StairsBlock(LIGHT_BLUE_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(LIGHT_BLUE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_stained_brick_stairs")))));
    public static final Block LIGHT_BLUE_STAINED_BRICK_SLAB = registerBlock("light_blue_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LIGHT_BLUE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_stained_brick_slab")))));
    public static final Block LIGHT_BLUE_STAINED_BRICK_WALL = registerBlock("light_blue_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(LIGHT_BLUE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_stained_brick_wall")))));
    //Blue
    public static final Block BLUE_STAINED_BRICKS = registerBlock("blue_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_STAINED_BRICK_STAIRS = registerBlock("blue_stained_brick_stairs",
            new StairsBlock(BLUE_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(BLUE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_stained_brick_stairs")))));
    public static final Block BLUE_STAINED_BRICK_SLAB = registerBlock("blue_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BLUE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_stained_brick_slab")))));
    public static final Block BLUE_STAINED_BRICK_WALL = registerBlock("blue_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(BLUE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_stained_brick_wall")))));
    //Purple
    public static final Block PURPLE_STAINED_BRICKS = registerBlock("purple_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PURPLE_STAINED_BRICK_STAIRS = registerBlock("purple_stained_brick_stairs",
            new StairsBlock(PURPLE_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(PURPLE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_stained_brick_stairs")))));
    public static final Block PURPLE_STAINED_BRICK_SLAB = registerBlock("purple_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(PURPLE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_stained_brick_slab")))));
    public static final Block PURPLE_STAINED_BRICK_WALL = registerBlock("purple_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(PURPLE_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_stained_brick_wall")))));
    //Magenta
    public static final Block MAGENTA_STAINED_BRICKS = registerBlock("magenta_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MAGENTA_STAINED_BRICK_STAIRS = registerBlock("magenta_stained_brick_stairs",
            new StairsBlock(MAGENTA_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(MAGENTA_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_stained_brick_stairs")))));
    public static final Block MAGENTA_STAINED_BRICK_SLAB = registerBlock("magenta_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MAGENTA_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_stained_brick_slab")))));
    public static final Block MAGENTA_STAINED_BRICK_WALL = registerBlock("magenta_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(MAGENTA_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_stained_brick_wall")))));
    //Pink
    public static final Block PINK_STAINED_BRICKS = registerBlock("pink_stained_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_stained_bricks")))
                    .strength(2.0F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_STAINED_BRICK_STAIRS = registerBlock("pink_stained_brick_stairs",
            new StairsBlock(PINK_STAINED_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(PINK_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_stained_brick_stairs")))));
    public static final Block PINK_STAINED_BRICK_SLAB = registerBlock("pink_stained_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(PINK_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_stained_brick_slab")))));
    public static final Block PINK_STAINED_BRICK_WALL = registerBlock("pink_stained_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(PINK_STAINED_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_stained_brick_wall")))));

    //Concrete//
    //White
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_concrete_stairs")))));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_concrete_slab")))));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_concrete_wall")))));
    //Light Gray
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_concrete_stairs")))));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_concrete_slab")))));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_concrete_wall")))));
    //Gray
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_concrete_stairs")))));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_concrete_slab")))));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_concrete_wall")))));
    //Black
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_concrete_stairs")))));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_concrete_slab")))));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_concrete_wall")))));
    //Brown
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_concrete_stairs")))));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_concrete_slab")))));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_concrete_wall")))));
    //Red
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_concrete_stairs")))));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_concrete_slab")))));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_concrete_wall")))));
    //Orange
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_concrete_stairs")))));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_concrete_slab")))));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_concrete_wall")))));
    //Yellow
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_concrete_stairs")))));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_concrete_slab")))));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_concrete_wall")))));
    //Lime
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_concrete_stairs")))));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_concrete_slab")))));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_concrete_wall")))));
    //Green
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_concrete_stairs")))));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_concrete_slab")))));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_concrete_wall")))));
    //Cyan
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_concrete_stairs")))));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_concrete_slab")))));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_concrete_wall")))));
    //Light Blue
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_concrete_stairs")))));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_concrete_slab")))));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_concrete_wall")))));
    //Blue
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_concrete_stairs")))));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_concrete_slab")))));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_concrete_wall")))));
    //Purple
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_concrete_stairs")))));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_concrete_slab")))));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_concrete_wall")))));
    //Magenta
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_concrete_stairs")))));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_concrete_slab")))));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_concrete_wall")))));
    //Pink
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_concrete_stairs")))));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_concrete_slab")))));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_concrete_wall")))));
    
    public static void registerModColouredBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            //Concrete
            entries.add(ModColouredBlocks.WHITE_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.WHITE_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.WHITE_CONCRETE_WALL);
            entries.add(ModColouredBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.LIGHT_GRAY_CONCRETE_WALL);
            entries.add(ModColouredBlocks.GRAY_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.GRAY_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.GRAY_CONCRETE_WALL);
            entries.add(ModColouredBlocks.BLACK_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.BLACK_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.BLACK_CONCRETE_WALL);
            entries.add(BROWN_CONCRETE_STAIRS);
            entries.add(BROWN_CONCRETE_SLAB);
            entries.add(BROWN_CONCRETE_WALL);
            entries.add(ModColouredBlocks.RED_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.RED_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.RED_CONCRETE_WALL);
            entries.add(ModColouredBlocks.ORANGE_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.ORANGE_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.ORANGE_CONCRETE_WALL);
            entries.add(ModColouredBlocks.YELLOW_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.YELLOW_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.YELLOW_CONCRETE_WALL);
            entries.add(ModColouredBlocks.LIME_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.LIME_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.LIME_CONCRETE_WALL);
            entries.add(ModColouredBlocks.GREEN_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.GREEN_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.GREEN_CONCRETE_WALL);
            entries.add(ModColouredBlocks.CYAN_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.CYAN_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.CYAN_CONCRETE_WALL);
            entries.add(ModColouredBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.LIGHT_BLUE_CONCRETE_WALL);
            entries.add(ModColouredBlocks.BLUE_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.BLUE_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.BLUE_CONCRETE_WALL);
            entries.add(ModColouredBlocks.PURPLE_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.PURPLE_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.PURPLE_CONCRETE_WALL);
            entries.add(ModColouredBlocks.MAGENTA_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.MAGENTA_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.MAGENTA_CONCRETE_WALL);
            entries.add(ModColouredBlocks.PINK_CONCRETE_STAIRS);
            entries.add(ModColouredBlocks.PINK_CONCRETE_SLAB);
            entries.add(ModColouredBlocks.PINK_CONCRETE_WALL);
            //Stained Bricks
            entries.add(ModColouredBlocks.WHITE_STAINED_BRICKS);
            entries.add(ModColouredBlocks.WHITE_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.WHITE_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.WHITE_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.LIGHT_GRAY_STAINED_BRICKS);
            entries.add(ModColouredBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.LIGHT_GRAY_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.GRAY_STAINED_BRICKS);
            entries.add(ModColouredBlocks.GRAY_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.GRAY_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.GRAY_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.BLACK_STAINED_BRICKS);
            entries.add(ModColouredBlocks.BLACK_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.BLACK_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.BLACK_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.BROWN_STAINED_BRICKS);
            entries.add(ModColouredBlocks.BROWN_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.BROWN_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.BROWN_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.RED_STAINED_BRICKS);
            entries.add(ModColouredBlocks.RED_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.RED_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.RED_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.ORANGE_STAINED_BRICKS);
            entries.add(ModColouredBlocks.ORANGE_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.ORANGE_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.ORANGE_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.YELLOW_STAINED_BRICKS);
            entries.add(ModColouredBlocks.YELLOW_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.YELLOW_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.YELLOW_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.LIME_STAINED_BRICKS);
            entries.add(ModColouredBlocks.LIME_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.LIME_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.LIME_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.GREEN_STAINED_BRICKS);
            entries.add(ModColouredBlocks.GREEN_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.GREEN_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.GREEN_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.CYAN_STAINED_BRICKS);
            entries.add(ModColouredBlocks.CYAN_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.CYAN_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.CYAN_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.LIGHT_BLUE_STAINED_BRICKS);
            entries.add(ModColouredBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.LIGHT_BLUE_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.BLUE_STAINED_BRICKS);
            entries.add(ModColouredBlocks.BLUE_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.BLUE_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.BLUE_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.PURPLE_STAINED_BRICKS);
            entries.add(ModColouredBlocks.PURPLE_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.PURPLE_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.PURPLE_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.MAGENTA_STAINED_BRICKS);
            entries.add(ModColouredBlocks.MAGENTA_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.MAGENTA_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.MAGENTA_STAINED_BRICK_WALL);
            entries.add(ModColouredBlocks.PINK_STAINED_BRICKS);
            entries.add(ModColouredBlocks.PINK_STAINED_BRICK_STAIRS);
            entries.add(ModColouredBlocks.PINK_STAINED_BRICK_SLAB);
            entries.add(ModColouredBlocks.PINK_STAINED_BRICK_WALL);
        });
    }
}
