package net.kibdouble.deepplacemod.item;

import net.kibdouble.deepplacemod.DeepPlaceMod;
import net.kibdouble.deepplacemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DeepPlaceMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DEEP_PLACE_TAB = CREATIVE_MODE_TABS.register("deep_place_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LIGHT_SHARD.get()))
            .title(Component.translatable("creativetab.deep_place_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.LIGHT_SHARD.get());

                pOutput.accept(ModBlocks.ANCIENT_COATING.get());
                pOutput.accept(ModBlocks.ANCIENT_DEEP_STONE.get());
                pOutput.accept(ModBlocks.SHADED_LIGHT_SHARD.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
