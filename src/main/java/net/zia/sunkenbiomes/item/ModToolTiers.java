package net.zia.sunkenbiomes.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.zia.sunkenbiomes.SunkenBiomes;
import net.zia.sunkenbiomes.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier CHLOROPHYTE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2500, 9f, 5f, 10,
                    ModTags.Blocks.NEEDS_CHLOROPHYTE_TOOL, () -> Ingredient.of(ModItems.Chlorophyte_Ingot.get())),
            new ResourceLocation(SunkenBiomes.MOD_ID, "chlorophyte"), List.of(Tiers.NETHERITE), List.of());
}
