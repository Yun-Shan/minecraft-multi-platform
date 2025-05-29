package org.yunshanmc.example_mcmp.mod.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundLoginPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.yunshanmc.example_mcmp.CommonExampleMcMP;

import java.util.Objects;

@Mixin(ClientPacketListener.class)
public class ExampleMixin {

    @Inject(at = @At("RETURN"), method = "handleLogin")
    private void handleLogin(ClientboundLoginPacket clientboundLoginPacket, CallbackInfo ci) {
        var p = Minecraft.getInstance().player;
        Objects.requireNonNull(p);
        p.displayClientMessage(
            Component.literal(
                CommonExampleMcMP.Greeting("Mixin", p.getName().getString())
            ),
            false
        );
    }

}
