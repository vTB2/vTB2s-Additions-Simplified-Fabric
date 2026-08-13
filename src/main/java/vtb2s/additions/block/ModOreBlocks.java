package vtb2s.additions.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static vtb2s.additions.register.RegisterMethods.registerBlock;
import static vtb2s.additions.vTB2sAdditions.MOD_ID;


public class ModOreBlocks {
    //Nether Ores//
    public static final Block ROSE_NETHER_QUARTZ_ORE = registerBlock("rose_nether_quartz_ore",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "rose_nether_quartz_ore")))
                    .strength(3F, 3F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block CRIMSON_NETHER_QUARTZ_ORE = registerBlock("crimson_nether_quartz_ore",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "crimson_nether_quartz_ore")))
                    .strength(3.0F, 3.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block INFERNAL_NETHER_QUARTZ_ORE = registerBlock("infernal_nether_quartz_ore",
            new PillarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "infernal_nether_quartz_ore")))
                    .strength(3.0F, 4.5F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block SOUL_NETHER_QUARTZ_ORE = registerBlock("soul_nether_quartz_ore",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "soul_nether_quartz_ore")))
                    .strength(2.5F, 2.5F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.SOUL_SOIL)));
    public static final Block SMOKEY_NETHER_QUARTZ_ORE = registerBlock("smokey_nether_quartz_ore",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smokey_nether_quartz_ore")))
                    .strength(3F, 3F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.NETHER_ORE)));

    //End Ores
    public static final Block END_INDIGO_QUARTZ_ORE = registerBlock("end_indigo_quartz_ore",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "end_indigo_quartz_ore")))
                    .strength(3.5F,9.5F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));

    //Overworld Ores//
    public static final Block PRASIOLITE_QUARTZ_ORE = registerBlock("prasiolite_quartz_ore",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prasiolite_quartz_ore")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_ORE = registerBlock("citrine_ore",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "citrine_ore")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.STONE)));

    public static void registerModOreBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModOreBlocks.ROSE_NETHER_QUARTZ_ORE);
            entries.add(ModOreBlocks.CRIMSON_NETHER_QUARTZ_ORE);
            entries.add(ModOreBlocks.INFERNAL_NETHER_QUARTZ_ORE);
            entries.add(ModOreBlocks.SMOKEY_NETHER_QUARTZ_ORE);
            entries.add(ModOreBlocks.SOUL_NETHER_QUARTZ_ORE);
            entries.add(ModOreBlocks.PRASIOLITE_QUARTZ_ORE);
            entries.add(ModOreBlocks.END_INDIGO_QUARTZ_ORE);
            entries.add(ModOreBlocks.CITRINE_ORE);
        });
    }
}
