package net.zia.sunkenbiomes.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.zia.sunkenbiomes.block.ModBlocks;
import net.zia.sunkenbiomes.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.Chlorophyte_Block.get());

        this.add(ModBlocks.Chlorophyte_Ore.get(),
                block -> createOreDrop(ModBlocks.Chlorophyte_Ore.get(), ModItems.Raw_Chlorophyte.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
