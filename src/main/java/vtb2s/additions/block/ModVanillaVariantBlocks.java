package vtb2s.additions.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static vtb2s.additions.register.RegisterMethods.registerBlock;
import static vtb2s.additions.vTB2sAdditions.MOD_ID;


public class ModVanillaVariantBlocks {
    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "stone_wall")))));
    
    //Smooth Stone//
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_stone_stairs")))));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_stone_wall")))));
    
    //Calcite//
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_stairs")))));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_slab")))));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_wall")))));

    //Smooth Basalt
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_basalt_stairs")))));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_basalt_slab")))));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_basalt_wall")))));
    
    //Dripstone
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_stairs")))));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_slab")))));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_wall")))));
    
    //Polished Igneous Walls//
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_andesite_wall")))));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_granite_wall")))));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_diorite_wall")))));
    
    //Quartz//
    //Quartz Wall//
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_wall")))));
    //Smooth Quartz//
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_quartz_wall")))));
    //Quartz Bricks//
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_brick_stairs")))));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_brick_slab")))));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_brick_wall")))));

    //Amethyst//
    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_stairs")))));
    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_slab")))));
    public static final Block AMETHYST_WALL = registerBlock("amethyst_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "amethyst_wall")))));
    
    //Deepslate//
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "deepslate_stairs")))));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "deepslate_slab")))));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "deepslate_wall")))));
    
    //Netherrack
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHERRACK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "netherrack_stairs")))));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "netherrack_slab")))));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "netherrack_wall")))));

    //End Stone
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.END_STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "end_stone_stairs")))));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "end_stone_slab")))));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "end_stone_wall")))));


    public static void registerModVanillaVariantBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModVanillaVariantBlocks.STONE_WALL);
            //Deepslate
            entries.add(DEEPSLATE_STAIRS);
            entries.add(DEEPSLATE_SLAB);
            entries.add(DEEPSLATE_WALL);
            //Smooth Stone
            entries.add(ModVanillaVariantBlocks.SMOOTH_STONE_WALL);
            entries.add(ModVanillaVariantBlocks.SMOOTH_STONE_STAIRS);
            //Calcite
            entries.add(ModVanillaVariantBlocks.CALCITE_STAIRS);
            entries.add(ModVanillaVariantBlocks.CALCITE_SLAB);
            entries.add(ModVanillaVariantBlocks.CALCITE_WALL);
            //Smooth Basalt
            entries.add(ModVanillaVariantBlocks.SMOOTH_BASALT_STAIRS);
            entries.add(ModVanillaVariantBlocks.SMOOTH_BASALT_SLAB);
            entries.add(ModVanillaVariantBlocks.SMOOTH_BASALT_WALL);
            //Dripstone
            entries.add(ModVanillaVariantBlocks.DRIPSTONE_STAIRS);
            entries.add(ModVanillaVariantBlocks.DRIPSTONE_SLAB);
            entries.add(ModVanillaVariantBlocks.DRIPSTONE_WALL);
            //Polished Igneous Walls
            entries.add(ModVanillaVariantBlocks.POLISHED_ANDESITE_WALL);
            entries.add(ModVanillaVariantBlocks.POLISHED_GRANITE_WALL);
            entries.add(ModVanillaVariantBlocks.POLISHED_DIORITE_WALL);
            //Amethyst
            entries.add(ModVanillaVariantBlocks.AMETHYST_STAIRS);
            entries.add(ModVanillaVariantBlocks.AMETHYST_SLAB);
            entries.add(ModVanillaVariantBlocks.AMETHYST_WALL);
            //Quartz
            entries.add(ModVanillaVariantBlocks.QUARTZ_WALL);
            entries.add(ModVanillaVariantBlocks.SMOOTH_QUARTZ_WALL);
            entries.add(ModVanillaVariantBlocks.QUARTZ_BRICK_STAIRS);
            entries.add(ModVanillaVariantBlocks.QUARTZ_BRICK_SLAB);
            entries.add(ModVanillaVariantBlocks.QUARTZ_BRICK_WALL);
            //Netherrack
            entries.add(NETHERRACK_STAIRS);
            entries.add(NETHERRACK_SLAB);
            entries.add(NETHERRACK_WALL);
            //End Stone
            entries.add(END_STONE_STAIRS);
            entries.add(END_STONE_SLAB);
            entries.add(END_STONE_WALL);
        });
    }
}


