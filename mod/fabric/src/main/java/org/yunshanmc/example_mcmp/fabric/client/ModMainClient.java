package org.yunshanmc.example_mcmp.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.minecraft.network.chat.Component;
import org.yunshanmc.example_mcmp.CommonExampleMcMP;

import java.util.Objects;

public final class ModMainClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        ClientPlayConnectionEvents.JOIN.register((clientPacketListener, packetSender, minecraft) -> {
            Objects.requireNonNull(minecraft.player);

            minecraft.player.displayClientMessage(
                Component.literal(
                    CommonExampleMcMP.Greeting("Fabric", minecraft.player.getName().getString())
                ),
                false
            );
        });
    }
}
