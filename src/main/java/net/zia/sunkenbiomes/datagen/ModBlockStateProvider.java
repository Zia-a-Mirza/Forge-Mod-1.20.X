package net.zia.sunkenbiomes.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zia.sunkenbiomes.SunkenBiomes;
import net.zia.sunkenbiomes.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SunkenBiomes.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.Chlorophyte_Block);
        blockWithItem(ModBlocks.Chlorophyte_Ore);
        blockWithItem(ModBlocks.Jungle_Bricks);

        stairsBlock((StairBlock) ModBlocks.Jungle_Brick_Stairs.get(), blockTexture(ModBlocks.Jungle_Bricks.get()));
        slabBlock(((SlabBlock) ModBlocks.Jungle_Brick_Slab.get()), blockTexture(ModBlocks.Jungle_Bricks.get()), blockTexture(ModBlocks.Jungle_Bricks.get()));
        buttonBlock((ButtonBlock) ModBlocks.Jungle_Brick_Button.get(), blockTexture(ModBlocks.Jungle_Bricks.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.Jungle_Brick_Pressure_Plate.get(), blockTexture(ModBlocks.Jungle_Bricks.get()));
        wallBlock((WallBlock) ModBlocks.Jungle_Brick_Wall.get(), blockTexture(ModBlocks.Jungle_Bricks.get()));
        fenceBlock((FenceBlock) ModBlocks.Jungle_Brick_Fence.get(), blockTexture(ModBlocks.Jungle_Bricks.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.Jungle_Brick_Fence_Gate.get(), blockTexture(ModBlocks.Jungle_Bricks.get()));


        blockItem(ModBlocks.Jungle_Brick_Stairs);
        blockItem(ModBlocks.Jungle_Brick_Slab);
        blockItem(ModBlocks.Jungle_Brick_Pressure_Plate);
        blockItem(ModBlocks.Jungle_Brick_Fence_Gate);

    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("sunkenbiomes:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
