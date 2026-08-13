package vtb2s.additions.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import vtb2s.additions.vTB2sAdditions;

import static vtb2s.additions.register.RegisterMethods.*;

public class ModItems {
    public static final Item CRIMSON_NETHER_QUARTZ = registerItem("crimson_nether_quartz", Item::new, 64);
    public static final Item ROSE_NETHER_QUARTZ = registerItem("rose_nether_quartz", Item::new, 64);
    public static final Item INFERNAL_NETHER_QUARTZ = registerItem("infernal_nether_quartz", Item::new, 64);
    public static final Item SMOKEY_NETHER_QUARTZ = registerItem("smokey_nether_quartz", Item::new, 64);
    public static final Item SOUL_NETHER_QUARTZ = registerItem("soul_nether_quartz", Item::new, 64);
    public static final Item PRASIOLITE_QUARTZ = registerItem("prasiolite_quartz", Item::new, 64);
    public static final Item END_INDIGO_QUARTZ = registerItem("end_indigo_quartz", Item::new, 64);
    public static final Item CITRINE = registerItem("citrine", Item::new, 64);

    private static void addIngredientsTab(FabricItemGroupEntries entries) {
        entries.add(CRIMSON_NETHER_QUARTZ);
        entries.add(ROSE_NETHER_QUARTZ);
        entries.add(INFERNAL_NETHER_QUARTZ);
        entries.add(SMOKEY_NETHER_QUARTZ);
        entries.add(SOUL_NETHER_QUARTZ);
        entries.add(PRASIOLITE_QUARTZ);
        entries.add(END_INDIGO_QUARTZ);
        entries.add(CITRINE);
    }

    public static void registerModItems() {
        vTB2sAdditions.LOGGER.info("Registering Mod Items for " + vTB2sAdditions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addIngredientsTab);
    }
}
