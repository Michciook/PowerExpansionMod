package net.michciook.powerexpansion.item;

import net.michciook.powerexpansion.PowerExpansion;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PowerExpansion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab POWER_EXPANSION;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        POWER_EXPANSION = event.registerCreativeModeTab(new ResourceLocation(PowerExpansion.MOD_ID, "power_expansion"),
                builder -> builder.icon(() -> new ItemStack(ModItems.STEEL_INGOT.get()))
                        .title(Component.translatable("creativemodetab.powerexpansion_tab")));
    }
}
