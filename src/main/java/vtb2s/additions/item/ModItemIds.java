package vtb2s.additions.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import vtb2s.additions.vTB2sAdditions;

public class ModItemIds {
    private static ResourceKey<Item> create(final String name) {
        return  ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(vTB2sAdditions.MOD_ID, name));
    }

    public static final ResourceKey<Item> NETHER_CRIMSON_QUARTZ = create("nether_crimson_quartz");
    public static final ResourceKey<Item> NETHER_ROSE_QUARTZ = create("nether_rose_quartz");
    public static final ResourceKey<Item> NETHER_INFERNAL_QUARTZ = create("nether_infernal_quartz");
    public static final ResourceKey<Item> NETHER_SMOKEY_QUARTZ = create("nether_smokey_quartz");
    public static final ResourceKey<Item> NETHER_SOUL_QUARTZ = create("nether_soul_quartz");
    public static final ResourceKey<Item> PRASIOLITE_QUARTZ = create("prasiolite_quartz");
    public static final ResourceKey<Item> END_INDIGO_QUARTZ = create("end_indigo_quartz");
}
