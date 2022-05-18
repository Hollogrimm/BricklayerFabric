package net.hollogrimm.bricklayer.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hollogrimm.bricklayer.BricklayerMain;
import net.hollogrimm.bricklayer.block.custom.ModStairsBlock;
import net.hollogrimm.bricklayer.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // Dyed Brick Blocks

    public static final Block WHITE_BRICKS = registerBlock("white_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block ORANGE_BRICKS = registerBlock("orange_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block MAGENTA_BRICKS = registerBlock("magenta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIGHT_BLUE_BRICKS = registerBlock("light_blue_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block YELLOW_BRICKS = registerBlock("yellow_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIME_BRICKS = registerBlock("lime_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PINK_BRICKS = registerBlock("pink_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block GRAY_BRICKS = registerBlock("gray_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIGHT_GRAY_BRICKS = registerBlock("light_gray_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block CYAN_BRICKS = registerBlock("cyan_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PURPLE_BRICKS = registerBlock("purple_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BLUE_BRICKS = registerBlock("blue_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BROWN_BRICKS = registerBlock("brown_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block GREEN_BRICKS = registerBlock("green_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block RED_BRICKS = registerBlock("red_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BLACK_BRICKS = registerBlock("black_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Dyed Brick Stairs

    public static final Block WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            new ModStairsBlock(ModBlocks.WHITE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block ORANGE_BRICK_STAIRS = registerBlock("orange_brick_stairs",
            new ModStairsBlock(ModBlocks.ORANGE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block MAGENTA_BRICK_STAIRS = registerBlock("magenta_brick_stairs",
            new ModStairsBlock(ModBlocks.MAGENTA_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIGHT_BLUE_BRICK_STAIRS = registerBlock("light_blue_brick_stairs",
            new ModStairsBlock(ModBlocks.LIGHT_BLUE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block YELLOW_BRICK_STAIRS = registerBlock("yellow_brick_stairs",
            new ModStairsBlock(ModBlocks.YELLOW_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIME_BRICK_STAIRS = registerBlock("lime_brick_stairs",
            new ModStairsBlock(ModBlocks.LIME_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PINK_BRICK_STAIRS = registerBlock("pink_brick_stairs",
            new ModStairsBlock(ModBlocks.PINK_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block GRAY_BRICK_STAIRS = registerBlock("gray_brick_stairs",
            new ModStairsBlock(ModBlocks.GRAY_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIGHT_GRAY_BRICK_STAIRS = registerBlock("light_gray_brick_stairs",
            new ModStairsBlock(ModBlocks.LIGHT_GRAY_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block CYAN_BRICK_STAIRS = registerBlock("cyan_brick_stairs",
            new ModStairsBlock(ModBlocks.CYAN_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PURPLE_BRICK_STAIRS = registerBlock("purple_brick_stairs",
            new ModStairsBlock(ModBlocks.PURPLE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BLUE_BRICK_STAIRS = registerBlock("blue_brick_stairs",
            new ModStairsBlock(ModBlocks.BLUE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BROWN_BRICK_STAIRS = registerBlock("brown_brick_stairs",
            new ModStairsBlock(ModBlocks.BROWN_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block GREEN_BRICK_STAIRS = registerBlock("green_brick_stairs",
            new ModStairsBlock(ModBlocks.GREEN_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block RED_BRICK_STAIRS = registerBlock("red_brick_stairs",
            new ModStairsBlock(ModBlocks.RED_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BLACK_BRICK_STAIRS = registerBlock("black_brick_stairs",
            new ModStairsBlock(ModBlocks.BLACK_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Dyed Brick Slabs

    public static final Block WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block ORANGE_BRICK_SLAB = registerBlock("orange_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block MAGENTA_BRICK_SLAB = registerBlock("magenta_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIGHT_BLUE_BRICK_SLAB = registerBlock("light_blue_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block YELLOW_BRICK_SLAB = registerBlock("yellow_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIME_BRICK_SLAB = registerBlock("lime_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PINK_BRICK_SLAB = registerBlock("pink_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block GRAY_BRICK_SLAB = registerBlock("gray_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIGHT_GRAY_BRICK_SLAB = registerBlock("light_gray_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block CYAN_BRICK_SLAB = registerBlock("cyan_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PURPLE_BRICK_SLAB = registerBlock("purple_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BLUE_BRICK_SLAB = registerBlock("blue_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BROWN_BRICK_SLAB = registerBlock("brown_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block GREEN_BRICK_SLAB = registerBlock("green_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block RED_BRICK_SLAB = registerBlock("red_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BLACK_BRICK_SLAB = registerBlock("black_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Dyed Brick Walls

    public static final Block WHITE_BRICK_WALL = registerBlock("white_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block ORANGE_BRICK_WALL = registerBlock("orange_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block MAGENTA_BRICK_WALL = registerBlock("magenta_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIGHT_BLUE_BRICK_WALL = registerBlock("light_blue_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block YELLOW_BRICK_WALL = registerBlock("yellow_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIME_BRICK_WALL = registerBlock("lime_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PINK_BRICK_WALL = registerBlock("pink_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block GRAY_BRICK_WALL = registerBlock("gray_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LIGHT_GRAY_BRICK_WALL = registerBlock("light_gray_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block CYAN_BRICK_WALL = registerBlock("cyan_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PURPLE_BRICK_WALL = registerBlock("purple_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BLUE_BRICK_WALL = registerBlock("blue_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BROWN_BRICK_WALL = registerBlock("brown_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block GREEN_BRICK_WALL = registerBlock("green_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block RED_BRICK_WALL = registerBlock("red_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block BLACK_BRICK_WALL = registerBlock("black_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Large Brick Blocks

    public static final Block LARGE_BRICKS = registerBlock("large_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_WHITE_BRICKS = registerBlock("large_white_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_ORANGE_BRICKS = registerBlock("large_orange_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_MAGENTA_BRICKS = registerBlock("large_magenta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIGHT_BLUE_BRICKS = registerBlock("large_light_blue_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_YELLOW_BRICKS = registerBlock("large_yellow_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIME_BRICKS = registerBlock("large_lime_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PINK_BRICKS = registerBlock("large_pink_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_GRAY_BRICKS = registerBlock("large_gray_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIGHT_GRAY_BRICKS = registerBlock("large_light_gray_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_CYAN_BRICKS = registerBlock("large_cyan_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PURPLE_BRICKS = registerBlock("large_purple_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BLUE_BRICKS = registerBlock("large_blue_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BROWN_BRICKS = registerBlock("large_brown_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_GREEN_BRICKS = registerBlock("large_green_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_RED_BRICKS = registerBlock("large_red_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BLACK_BRICKS = registerBlock("large_black_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Large Brick Stairs

    public static final Block LARGE_BRICK_STAIRS = registerBlock("large_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_WHITE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_WHITE_BRICK_STAIRS = registerBlock("large_white_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_WHITE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_ORANGE_BRICK_STAIRS = registerBlock("large_orange_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_ORANGE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_MAGENTA_BRICK_STAIRS = registerBlock("large_magenta_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_MAGENTA_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIGHT_BLUE_BRICK_STAIRS = registerBlock("large_light_blue_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_LIGHT_BLUE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_YELLOW_BRICK_STAIRS = registerBlock("large_yellow_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_YELLOW_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIME_BRICK_STAIRS = registerBlock("large_lime_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_LIME_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PINK_BRICK_STAIRS = registerBlock("large_pink_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_PINK_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_GRAY_BRICK_STAIRS = registerBlock("large_gray_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_GRAY_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIGHT_GRAY_BRICK_STAIRS = registerBlock("large_light_gray_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_LIGHT_GRAY_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_CYAN_BRICK_STAIRS = registerBlock("large_cyan_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_CYAN_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PURPLE_BRICK_STAIRS = registerBlock("large_purple_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_PURPLE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BLUE_BRICK_STAIRS = registerBlock("large_blue_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_BLUE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BROWN_BRICK_STAIRS = registerBlock("large_brown_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_BROWN_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_GREEN_BRICK_STAIRS = registerBlock("large_green_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_GREEN_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_RED_BRICK_STAIRS = registerBlock("large_red_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_RED_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BLACK_BRICK_STAIRS = registerBlock("large_black_brick_stairs",
            new ModStairsBlock(ModBlocks.LARGE_BLACK_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Large Brick Slabs

    public static final Block LARGE_BRICK_SLAB = registerBlock("large_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_WHITE_BRICK_SLAB = registerBlock("large_white_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_ORANGE_BRICK_SLAB = registerBlock("large_orange_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_MAGENTA_BRICK_SLAB = registerBlock("large_magenta_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIGHT_BLUE_BRICK_SLAB = registerBlock("large_light_blue_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_YELLOW_BRICK_SLAB = registerBlock("large_yellow_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIME_BRICK_SLAB = registerBlock("large_lime_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PINK_BRICK_SLAB = registerBlock("large_pink_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_GRAY_BRICK_SLAB = registerBlock("large_gray_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIGHT_GRAY_BRICK_SLAB = registerBlock("large_light_gray_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_CYAN_BRICK_SLAB = registerBlock("large_cyan_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PURPLE_BRICK_SLAB = registerBlock("large_purple_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BLUE_BRICK_SLAB = registerBlock("large_blue_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BROWN_BRICK_SLAB = registerBlock("large_brown_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_GREEN_BRICK_SLAB = registerBlock("large_green_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_RED_BRICK_SLAB = registerBlock("large_red_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BLACK_BRICK_SLAB = registerBlock("large_black_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Large Brick Walls

    public static final Block LARGE_BRICK_WALL = registerBlock("large_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_WHITE_BRICK_WALL = registerBlock("large_white_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_ORANGE_BRICK_WALL = registerBlock("large_orange_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_MAGENTA_BRICK_WALL = registerBlock("large_magenta_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIGHT_BLUE_BRICK_WALL = registerBlock("large_light_blue_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_YELLOW_BRICK_WALL = registerBlock("large_yellow_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIME_BRICK_WALL = registerBlock("large_lime_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PINK_BRICK_WALL = registerBlock("large_pink_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_GRAY_BRICK_WALL = registerBlock("large_gray_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_LIGHT_GRAY_BRICK_WALL = registerBlock("large_light_gray_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_CYAN_BRICK_WALL = registerBlock("large_cyan_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PURPLE_BRICK_WALL = registerBlock("large_purple_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BLUE_BRICK_WALL = registerBlock("large_blue_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BROWN_BRICK_WALL = registerBlock("large_brown_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_GREEN_BRICK_WALL = registerBlock("large_green_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_RED_BRICK_WALL = registerBlock("large_red_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_BLACK_BRICK_WALL = registerBlock("large_black_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Blocks

    public static final Block CARVED_BRICKS = registerBlock("carved_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_WHITE_BRICKS = registerBlock("painted_white_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_ORANGE_BRICKS = registerBlock("painted_orange_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_MAGENTA_BRICKS = registerBlock("painted_magenta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIGHT_BLUE_BRICKS = registerBlock("painted_light_blue_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_YELLOW_BRICKS = registerBlock("painted_yellow_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIME_BRICKS = registerBlock("painted_lime_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_PINK_BRICKS = registerBlock("painted_pink_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_GRAY_BRICKS = registerBlock("painted_gray_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIGHT_GRAY_BRICKS = registerBlock("painted_light_gray_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_CYAN_BRICKS = registerBlock("painted_cyan_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_PURPLE_BRICKS = registerBlock("painted_purple_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BLUE_BRICKS = registerBlock("painted_blue_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BROWN_BRICKS = registerBlock("painted_brown_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_GREEN_BRICKS = registerBlock("painted_green_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_RED_BRICKS = registerBlock("painted_red_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BLACK_BRICKS = registerBlock("painted_black_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Stairs

    public static final Block CARVED_BRICK_STAIRS = registerBlock("carved_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_WHITE_BRICK_STAIRS = registerBlock("painted_white_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_ORANGE_BRICK_STAIRS = registerBlock("painted_orange_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_MAGENTA_BRICK_STAIRS = registerBlock("painted_magenta_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIGHT_BLUE_BRICK_STAIRS = registerBlock("painted_light_blue_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_YELLOW_BRICK_STAIRS = registerBlock("painted_yellow_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIME_BRICK_STAIRS = registerBlock("painted_lime_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_PINK_BRICK_STAIRS = registerBlock("painted_pink_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_GRAY_BRICK_STAIRS = registerBlock("painted_gray_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIGHT_GRAY_BRICK_STAIRS = registerBlock("painted_light_gray_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_CYAN_BRICK_STAIRS = registerBlock("painted_cyan_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_PURPLE_BRICK_STAIRS = registerBlock("painted_purple_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BLUE_BRICK_STAIRS = registerBlock("painted_blue_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BROWN_BRICK_STAIRS = registerBlock("painted_brown_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_GREEN_BRICK_STAIRS = registerBlock("painted_green_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_RED_BRICK_STAIRS = registerBlock("painted_red_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BLACK_BRICK_STAIRS = registerBlock("painted_black_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Slabs

    public static final Block CARVED_BRICK_SLAB = registerBlock("carved_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_WHITE_BRICK_SLAB = registerBlock("painted_white_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_ORANGE_BRICK_SLAB = registerBlock("painted_orange_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_MAGENTA_BRICK_SLAB = registerBlock("painted_magenta_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIGHT_BLUE_BRICK_SLAB = registerBlock("painted_light_blue_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_YELLOW_BRICK_SLAB = registerBlock("painted_yellow_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIME_BRICK_SLAB = registerBlock("painted_lime_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_PINK_BRICK_SLAB = registerBlock("painted_pink_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_GRAY_BRICK_SLAB = registerBlock("painted_gray_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIGHT_GRAY_BRICK_SLAB = registerBlock("painted_light_gray_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_CYAN_BRICK_SLAB = registerBlock("painted_cyan_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_PURPLE_BRICK_SLAB = registerBlock("painted_purple_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BLUE_BRICK_SLAB = registerBlock("painted_blue_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BROWN_BRICK_SLAB = registerBlock("painted_brown_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_GREEN_BRICK_SLAB = registerBlock("painted_green_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_RED_BRICK_SLAB = registerBlock("painted_red_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BLACK_BRICK_SLAB = registerBlock("painted_black_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Walls

    public static final Block CARVED_BRICK_WALL = registerBlock("carved_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_WHITE_BRICK_WALL = registerBlock("painted_white_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_ORANGE_BRICK_WALL = registerBlock("painted_orange_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_MAGENTA_BRICK_WALL = registerBlock("painted_magenta_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIGHT_BLUE_BRICK_WALL = registerBlock("painted_light_blue_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_YELLOW_BRICK_WALL = registerBlock("painted_yellow_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIME_BRICK_WALL = registerBlock("painted_lime_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_PINK_BRICK_WALL = registerBlock("painted_pink_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_GRAY_BRICK_WALL = registerBlock("painted_gray_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_LIGHT_GRAY_BRICK_WALL = registerBlock("painted_light_gray_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_CYAN_BRICK_WALL = registerBlock("painted_cyan_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_PURPLE_BRICK_WALL = registerBlock("painted_purple_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BLUE_BRICK_WALL = registerBlock("painted_blue_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BROWN_BRICK_WALL = registerBlock("painted_brown_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_GREEN_BRICK_WALL = registerBlock("painted_green_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_RED_BRICK_WALL = registerBlock("painted_red_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block PAINTED_BLACK_BRICK_WALL = registerBlock("painted_black_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Large Painted / Carved Brick Blocks

    public static final Block LARGE_CARVED_BRICKS = registerBlock("large_carved_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_WHITE_BRICKS = registerBlock("large_painted_white_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_ORANGE_BRICKS = registerBlock("large_painted_orange_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_MAGENTA_BRICKS = registerBlock("large_painted_magenta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIGHT_BLUE_BRICKS = registerBlock("large_painted_light_blue_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_YELLOW_BRICKS = registerBlock("large_painted_yellow_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIME_BRICKS = registerBlock("large_painted_lime_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_PINK_BRICKS = registerBlock("large_painted_pink_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_GRAY_BRICKS = registerBlock("large_painted_gray_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIGHT_GRAY_BRICKS = registerBlock("large_painted_light_gray_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_YAN_BRICKS = registerBlock("large_painted_cyan_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_PURPLE_BRICKS = registerBlock("large_painted_purple_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BLUE_BRICKS = registerBlock("large_painted_blue_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BROWN_BRICKS = registerBlock("large_painted_brown_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_GREEN_BRICKS = registerBlock("large_painted_green_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_RED_BRICKS = registerBlock("large_painted_red_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BLACK_BRICKS = registerBlock("large_painted_black_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Large Painted / Carved Brick Stairs

    public static final Block LARGE_CARVED_BRICK_STAIRS = registerBlock("large_carved_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_WHITE_BRICK_STAIRS = registerBlock("large_painted_white_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_ORANGE_BRICK_STAIRS = registerBlock("large_painted_orange_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_MAGENTA_BRICK_STAIRS = registerBlock("large_painted_magenta_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIGHT_BLUE_BRICK_STAIRS = registerBlock("large_painted_light_blue_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_YELLOW_BRICK_STAIRS = registerBlock("large_painted_yellow_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIME_BRICK_STAIRS = registerBlock("large_painted_lime_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_PINK_BRICK_STAIRS = registerBlock("large_painted_pink_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_GRAY_BRICK_STAIRS = registerBlock("large_painted_gray_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIGHT_GRAY_BRICK_STAIRS = registerBlock("large_painted_light_gray_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_CYAN_BRICK_STAIRS = registerBlock("large_painted_cyan_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_PURPLE_BRICK_STAIRS = registerBlock("large_painted_purple_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BLUE_BRICK_STAIRS = registerBlock("large_painted_blue_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BROWN_BRICK_STAIRS = registerBlock("large_painted_brown_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_GREEN_BRICK_STAIRS = registerBlock("large_painted_green_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_RED_BRICK_STAIRS = registerBlock("large_painted_red_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BLACK_BRICK_STAIRS = registerBlock("large_painted_black_brick_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Slabs

    public static final Block LARGE_CARVED_BRICK_SLAB = registerBlock("large_carved_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_WHITE_BRICK_SLAB = registerBlock("large_painted_white_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_ORANGE_BRICK_SLAB = registerBlock("large_painted_orange_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_MAGENTA_BRICK_SLAB = registerBlock("large_painted_magenta_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIGHT_BLUE_BRICK_SLAB = registerBlock("large_painted_light_blue_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_YELLOW_BRICK_SLAB = registerBlock("large_painted_yellow_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIME_BRICK_SLAB = registerBlock("large_painted_lime_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_PINK_BRICK_SLAB = registerBlock("large_painted_pink_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_GRAY_BRICK_SLAB = registerBlock("large_painted_gray_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIGHT_GRAY_BRICK_SLAB = registerBlock("large_painted_light_gray_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_CYAN_BRICK_SLAB = registerBlock("large_painted_cyan_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_PURPLE_BRICK_SLAB = registerBlock("large_painted_purple_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BLUE_BRICK_SLAB = registerBlock("large_painted_blue_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BROWN_BRICK_SLAB = registerBlock("large_painted_brown_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_GREEN_BRICK_SLAB = registerBlock("large_painted_green_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_RED_BRICK_SLAB = registerBlock("large_painted_red_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BLACK_BRICK_SLAB = registerBlock("large_painted_black_brick_slab",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Walls

    public static final Block LARGE_CARVED_BRICK_WALL = registerBlock("large_carved_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_WHITE_BRICK_WALL = registerBlock("large_painted_white_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_ORANGE_BRICK_WALL = registerBlock("large_painted_orange_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_MAGENTA_BRICK_WALL = registerBlock("large_painted_magenta_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIGHT_BLUE_BRICK_WALL = registerBlock("large_painted_light_blue_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_YELLOW_BRICK_WALL = registerBlock("large_painted_yellow_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIME_BRICK_WALL = registerBlock("large_painted_lime_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_PINK_BRICK_WALL = registerBlock("large_painted_pink_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_GRAY_BRICK_WALL = registerBlock("large_painted_gray_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_LIGHT_GRAY_BRICK_WALL = registerBlock("large_painted_light_gray_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_CYAN_BRICK_WALL = registerBlock("large_painted_cyan_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_PURPLE_BRICK_WALL = registerBlock("large_painted_purple_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BLUE_BRICK_WALL = registerBlock("large_painted_blue_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BROWN_BRICK_WALL = registerBlock("large_painted_brown_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_GREEN_BRICK_WALL = registerBlock("large_painted_green_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_RED_BRICK_WALL = registerBlock("large_painted_red_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    public static final Block LARGE_PAINTED_BLACK_BRICK_WALL = registerBlock("large_painted_black_brick_wall",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f,
                    6f).requiresTool()), ModItemGroup.BRICKLAYER_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BricklayerMain.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(BricklayerMain.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        BricklayerMain.LOGGER.info("Registering ModBlocks for " + BricklayerMain.MOD_ID);
    }

}
