package net.hollogrimm.bricklayer.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hollogrimm.bricklayer.BricklayerMain;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Dyed Bricks

    public static final Item WHITE_BRICK = registerItem("white_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item ORANGE_BRICK = registerItem("orange_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item MAGENTA_BRICK = registerItem("magenta_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LIGHT_BLUE_BRICK = registerItem("light_blue_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item YELLOW_BRICK = registerItem("yellow_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LIME_BRICK = registerItem("lime_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item PINK_BRICK = registerItem("pink_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item GRAY_BRICK = registerItem("gray_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LIGHT_GRAY_BRICK = registerItem("light_gray_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item CYAN_BRICK = registerItem("cyan_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item PURPLE_BRICK = registerItem("purple_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item BLUE_BRICK = registerItem("blue_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item BROWN_BRICK = registerItem("brown_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item GREEN_BRICK = registerItem("green_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item RED_BRICK = registerItem("red_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item BLACK_BRICK = registerItem("black_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    // Clay Clump

    public static final Item CLAY_CLUMP = registerItem("clay_clump",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    // Large Bricks

    public static final Item LARGE_BRICK = registerItem("large_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_WHITE_BRICK = registerItem("large_white_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_ORANGE_BRICK = registerItem("large_orange_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_MAGENTA_BRICK = registerItem("large_magenta_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_LIGHT_BLUE_BRICK = registerItem("large_light_blue_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_YELLOW_BRICK = registerItem("large_yellow_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_LIME_BRICK = registerItem("large_lime_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_PINK_BRICK = registerItem("large_pink_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_GRAY_BRICK = registerItem("large_gray_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_LIGHT_GRAY_BRICK = registerItem("large_light_gray_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_CYAN_BRICK = registerItem("large_cyan_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_PURPLE_BRICK = registerItem("large_purple_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_BLUE_BRICK = registerItem("large_blue_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_BROWN_BRICK = registerItem("large_brown_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_GREEN_BRICK = registerItem("large_green_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_RED_BRICK = registerItem("large_red_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    public static final Item LARGE_BLACK_BRICK = registerItem("large_black_brick",
            new Item(new FabricItemSettings().group(ModItemGroup.BRICKLAYER_MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BricklayerMain.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BricklayerMain.LOGGER.info("Registering Mod Items for " + BricklayerMain.MOD_ID);
    }

}
