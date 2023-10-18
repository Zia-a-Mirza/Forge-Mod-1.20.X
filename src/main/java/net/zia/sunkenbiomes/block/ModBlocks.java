package net.zia.sunkenbiomes.block;

import com.mojang.blaze3d.shaders.Uniform;
import net.minecraft.client.resources.model.Material;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zia.sunkenbiomes.SunkenBiomes;
import net.zia.sunkenbiomes.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SunkenBiomes.MOD_ID);

    public static final RegistryObject<Block> Chlorophyte_Block = registerBlock("chlorophyte_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).requiresCorrectToolForDrops().strength(6f)));

    public static final RegistryObject<Block> Chlorophyte_Ore = registerBlock("chlorophyte_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.MUD), UniformInt.of(4,10)));

    public static final RegistryObject<Block> Jungle_Bricks = registerBlock("jungle_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).sound(SoundType.DEEPSLATE_BRICKS)
                    .requiresCorrectToolForDrops().strength(50f, 1200)));

    public static final RegistryObject<Block> Jungle_Brick_Stairs = registerBlock("jungle_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.Jungle_Bricks.get().defaultBlockState(),BlockBehaviour
                    .Properties.copy(Blocks.BLACKSTONE_STAIRS).sound(SoundType.DEEPSLATE_BRICKS)
                    .requiresCorrectToolForDrops().strength(50f, 1200)));

    public static final RegistryObject<Block> Jungle_Brick_Slab = registerBlock("jungle_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE_SLAB).sound(SoundType.DEEPSLATE_BRICKS)
                    .requiresCorrectToolForDrops().strength(50f, 1200)));

    public static final RegistryObject<Block> Jungle_Brick_Pressure_Plate = registerBlock("jungle_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS,
                    BlockBehaviour.Properties.copy(Blocks.BLACKSTONE_SLAB).sound(SoundType.DEEPSLATE_BRICKS)
                    .requiresCorrectToolForDrops().strength(10f, 1200), BlockSetType.STONE));

    public static final RegistryObject<Block> Jungle_Brick_Button = registerBlock("jungle_brick_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE_SLAB).sound(SoundType.DEEPSLATE_BRICKS)
                    .requiresCorrectToolForDrops().strength(10f, 1200),
                    BlockSetType.STONE, 50, true));

    public static final RegistryObject<Block> Jungle_Brick_Fence = registerBlock("jungle_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).sound(SoundType.DEEPSLATE_BRICKS)
                    .requiresCorrectToolForDrops().strength(20f, 1200)));

    public static final RegistryObject<Block> Jungle_Brick_Fence_Gate = registerBlock("jungle_brick_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).sound(SoundType.DEEPSLATE_BRICKS)
                    .requiresCorrectToolForDrops().strength(20f, 1200), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> Jungle_Brick_Wall = registerBlock("jungle_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).sound(SoundType.DEEPSLATE_BRICKS)
                    .requiresCorrectToolForDrops().strength(25f, 1200)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
