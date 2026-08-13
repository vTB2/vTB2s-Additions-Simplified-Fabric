package vtb2s.additions.register;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import vtb2s.additions.vTB2sAdditions;

import java.util.function.Function;

public class RegisterMethods {

    //Blocks
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(vTB2sAdditions.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(vTB2sAdditions.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(vTB2sAdditions.MOD_ID, name)))));
    }

    public static Block registerFireImmuneBlock(String name, Block block) {
        registerFireImmuneBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(vTB2sAdditions.MOD_ID, name), block);
    }

    public static void registerFireImmuneBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(vTB2sAdditions.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().fireproof()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(vTB2sAdditions.MOD_ID, name)))));

    }

    //Items
    public static Item registerItem(String name, Function<Item.Settings, Item> function, int maxCount) {
        return Registry.register(Registries.ITEM, Identifier.of(vTB2sAdditions.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(vTB2sAdditions.MOD_ID, name))).maxCount(maxCount)));
    }
}