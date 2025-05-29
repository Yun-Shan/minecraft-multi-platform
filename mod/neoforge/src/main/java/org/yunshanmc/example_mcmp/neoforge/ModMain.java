package org.yunshanmc.example_mcmp.neoforge;

import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import org.yunshanmc.example_mcmp.CommonExampleMcMP;
import org.yunshanmc.example_mcmp.mod.CommonModMain;

@Mod(CommonModMain.MOD_ID)
public final class ModMain {
    public ModMain() {
        // Run our common setup.
        CommonModMain.init();
    }

    @EventBusSubscriber(modid = CommonModMain.MOD_ID, value = Dist.CLIENT)
    private static class EventHandler {
        @SubscribeEvent
        private static void onPlayerJoin(ClientPlayerNetworkEvent.LoggingIn event) {
            event.getPlayer().displayClientMessage(
                Component.literal(
                    CommonExampleMcMP.Greeting("NeoForge", event.getPlayer().getName().getString())
                ),
                false
            );
        }
    }
}
