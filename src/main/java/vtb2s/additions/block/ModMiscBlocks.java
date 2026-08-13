package vtb2s.additions.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static vtb2s.additions.register.RegisterMethods.*;
import static vtb2s.additions.vTB2sAdditions.MOD_ID;

public class ModMiscBlocks {
    //Mineral Block Bricks//
    //Gold
    public static final Block GOLD_BRICKS = registerBlock("gold_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gold_bricks")))));
    public static final Block GOLD_BRICK_STAIRS = registerBlock("gold_brick_stairs",
            new StairsBlock(GOLD_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gold_brick_stairs")))));
    public static final Block GOLD_BRICK_SLAB = registerBlock("gold_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gold_brick_slab")))));
    public static final Block GOLD_BRICK_WALL = registerBlock("gold_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gold_brick_wall")))));
    //Diamond
    public static final Block DIAMOND_BRICKS = registerBlock("diamond_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diamond_bricks")))));
    public static final Block DIAMOND_BRICK_STAIRS = registerBlock("diamond_brick_stairs",
            new StairsBlock(DIAMOND_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diamond_brick_stairs")))));
    public static final Block DIAMOND_BRICK_SLAB = registerBlock("diamond_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diamond_brick_slab")))));
    public static final Block DIAMOND_BRICK_WALL = registerBlock("diamond_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diamond_brick_wall")))));
    //Netherite
    public static final Block NETHERITE_BRICKS = registerFireImmuneBlock("netherite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "netherite_bricks")))));
    public static final Block NETHERITE_BRICK_STAIRS = registerFireImmuneBlock("netherite_brick_stairs",
            new StairsBlock(NETHERITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "netherite_brick_stairs")))));
    public static final Block NETHERITE_BRICK_SLAB = registerFireImmuneBlock("netherite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "netherite_brick_slab")))));
    public static final Block NETHERITE_BRICK_WALL = registerFireImmuneBlock("netherite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "netherite_brick_wall")))));

    public static void registerModMiscBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            //Mineral Bricks
            //Gold
            entries.add(ModMiscBlocks.GOLD_BRICKS);
            entries.add(ModMiscBlocks.GOLD_BRICK_STAIRS);
            entries.add(ModMiscBlocks.GOLD_BRICK_SLAB);
            entries.add(ModMiscBlocks.GOLD_BRICK_WALL);
            //Diamond
            entries.add(ModMiscBlocks.DIAMOND_BRICKS);
            entries.add(ModMiscBlocks.DIAMOND_BRICK_STAIRS);
            entries.add(ModMiscBlocks.DIAMOND_BRICK_SLAB);
            entries.add(ModMiscBlocks.DIAMOND_BRICK_WALL);
            //Netherite
            entries.add(ModMiscBlocks.NETHERITE_BRICKS);
            entries.add(ModMiscBlocks.NETHERITE_BRICK_STAIRS);
            entries.add(ModMiscBlocks.NETHERITE_BRICK_SLAB);
            entries.add(ModMiscBlocks.NETHERITE_BRICK_WALL);
        });
    }
}
