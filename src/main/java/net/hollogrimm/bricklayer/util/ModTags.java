package net.hollogrimm.bricklayer.util;

import net.hollogrimm.bricklayer.BricklayerMain;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> PAINTABLE_BRICKS
                = createtag("paintable_bricks");

        public static final TagKey<Block> LARGE_PAINTABLE_BRICKS
                = createtag("large_paintable_bricks");

        private static TagKey<Block> createtag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(BricklayerMain.MOD_ID, name ));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name ));
        }

    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(BricklayerMain.MOD_ID, name ));
        }

        private static TagKey<Item> forgeTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name ));
        }
    }
}
