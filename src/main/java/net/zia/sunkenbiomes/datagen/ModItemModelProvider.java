package net.zia.sunkenbiomes.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zia.sunkenbiomes.SunkenBiomes;
import net.zia.sunkenbiomes.block.ModBlocks;
import net.zia.sunkenbiomes.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SunkenBiomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.Chlorophyte_Ingot);
        simpleItem(ModItems.Raw_Chlorophyte);
        simpleItem(ModItems.Jungle_Spores);
        simpleItem(ModItems.Jungle_Key);
        simpleItem(ModItems.Chlorophyte_Upgrade_Smithing_Template);

        //simpleItem(ModItems.Chlorophyte_Helmet);
        //simpleItem(ModItems.Chlorophyte_Chestplate);
        //simpleItem(ModItems.Chlorophyte_Leggings);
        //simpleItem(ModItems.Chlorophyte_Boots);

        handheldItem(ModItems.Chlorophyte_Sword);
        handheldItem(ModItems.Chlorophyte_Pickaxe);
        handheldItem(ModItems.Chlorophyte_Axe);
        handheldItem(ModItems.Chlorophyte_Shovel);
        handheldItem(ModItems.Chlorophyte_Hoe);

        buttonItem(ModBlocks.Jungle_Brick_Button, ModBlocks.Jungle_Bricks);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SunkenBiomes.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(SunkenBiomes.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(SunkenBiomes.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

}
