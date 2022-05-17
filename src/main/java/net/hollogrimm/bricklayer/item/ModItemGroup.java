package net.hollogrimm.bricklayer.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.hollogrimm.bricklayer.BricklayerMain;
import net.hollogrimm.bricklayer.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BRICKLAYER_MATERIALS = FabricItemGroupBuilder.build(new Identifier(BricklayerMain.MOD_ID, "bricklayer_materials"),
            () -> new ItemStack(ModItems.WHITE_BRICK));

    public static final ItemGroup BRICKLAYER_BLOCKS = FabricItemGroupBuilder.build(new Identifier(BricklayerMain.MOD_ID, "bricklayer_blocks"),
            () -> new ItemStack(ModBlocks.WHITE_BRICKS));
}
