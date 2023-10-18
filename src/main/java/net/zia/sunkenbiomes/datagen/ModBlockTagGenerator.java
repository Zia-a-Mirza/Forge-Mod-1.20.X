package net.zia.sunkenbiomes.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.zia.sunkenbiomes.SunkenBiomes;
import net.zia.sunkenbiomes.block.ModBlocks;
import net.zia.sunkenbiomes.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SunkenBiomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.Chlorophyte_Block.get())
                .add(ModBlocks.Jungle_Bricks.get())
                .add(ModBlocks.Jungle_Brick_Slab.get())
                .add(ModBlocks.Jungle_Brick_Stairs.get())
                .add(ModBlocks.Jungle_Brick_Wall.get())
                .add(ModBlocks.Jungle_Brick_Fence.get())
                .add(ModBlocks.Jungle_Brick_Fence_Gate.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.Chlorophyte_Ore.get());

        this.tag(ModTags.Blocks.NEEDS_CHLOROPHYTE_TOOL)
                .add(ModBlocks.Jungle_Bricks.get())
                .add(ModBlocks.Jungle_Brick_Slab.get())
                .add(ModBlocks.Jungle_Brick_Stairs.get())
                .add(ModBlocks.Jungle_Brick_Wall.get())
                .add(ModBlocks.Jungle_Brick_Fence.get())
                .add(ModBlocks.Jungle_Brick_Fence_Gate.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.Chlorophyte_Block.get())
                .add(ModBlocks.Chlorophyte_Ore.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.Jungle_Brick_Fence.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.Jungle_Brick_Wall.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.Jungle_Brick_Fence_Gate.get());


    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
