package net.zia.sunkenbiomes.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.zia.sunkenbiomes.SunkenBiomes;
import net.zia.sunkenbiomes.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, SunkenBiomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Chlorophyte_Helmet.get(),
                        ModItems.Chlorophyte_Chestplate.get(),
                        ModItems.Chlorophyte_Leggings.get(),
                        ModItems.Chlorophyte_Boots.get());

    }

    @Override
    public String getName() {
        return "Item Tags";
    }

    public static class ModBlockTagGenerator {
    }
}
