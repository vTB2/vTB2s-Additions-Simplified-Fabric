package vtb2s.additions.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import vtb2s.additions.vTB2sAdditions;

import java.util.function.Function;

public class ModItems {
    public static final Item NETHER_CRIMSON_QUARTZ = registerItem(ModItemIds.NETHER_CRIMSON_QUARTZ, Item::new, new Item.Properties());
    public static final Item NETHER_ROSE_QUARTZ = registerItem(ModItemIds.NETHER_ROSE_QUARTZ, Item::new, new Item.Properties());
    public static final Item NETHER_INFERNAL_QUARTZ = registerItem(ModItemIds.NETHER_INFERNAL_QUARTZ, Item::new, new Item.Properties());
    public static final Item NETHER_SMOKEY_QUARTZ = registerItem(ModItemIds.NETHER_SMOKEY_QUARTZ, Item::new, new Item.Properties());
    public static final Item NETHER_SOUL_QUARTZ = registerItem(ModItemIds.NETHER_SOUL_QUARTZ, Item::new, new Item.Properties());
    public static final Item PRASIOLITE_QUARTZ = registerItem(ModItemIds.PRASIOLITE_QUARTZ, Item::new, new Item.Properties());
    public static final Item END_INDIGO_QUARTZ = registerItem(ModItemIds.END_INDIGO_QUARTZ, Item::new, new Item.Properties());

    private static Item registerItem(final ResourceKey<Item> id, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
        Item item = itemFactory.apply(properties.setId(id));

        return Registry.register(BuiltInRegistries.ITEM, id, item);
    }

    public static void registerModItems() {
        vTB2sAdditions.LOGGER.info("Registering Mod Items for " + vTB2sAdditions.MOD_ID);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
                .register(entries -> {
                    entries.accept(NETHER_CRIMSON_QUARTZ);
                    entries.accept(NETHER_ROSE_QUARTZ);
                    entries.accept(NETHER_INFERNAL_QUARTZ);
                    entries.accept(NETHER_SMOKEY_QUARTZ);
                    entries.accept(NETHER_SOUL_QUARTZ);
                    entries.accept(PRASIOLITE_QUARTZ);
                    entries.accept(END_INDIGO_QUARTZ);
                });
    }
}
