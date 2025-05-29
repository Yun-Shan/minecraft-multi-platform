package org.yunshanmc.example_mcmp.mod;

import dev.architectury.event.events.client.ClientPlayerEvent;
import net.minecraft.network.chat.Component;
import org.yunshanmc.example_mcmp.CommonExampleMcMP;

public final class CommonModMain {
    public static final String MOD_ID = "example_mcmp";

    public static void init() {
        // Write common init code here.
        ClientPlayerEvent.CLIENT_PLAYER_JOIN.register(localPlayer -> {
            localPlayer.displayClientMessage(
                Component.literal(
                    CommonExampleMcMP.Greeting("Architectury", localPlayer.getName().getString())
                ),
                false
            );
        });
    }
}
