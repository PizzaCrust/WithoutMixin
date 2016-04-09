package org.example.mixin;

import org.example.main.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Main.class, remap = false)
public class MixinMain {
    @Inject(method = "message", at = @At("RETURN"))
    public void handleMessage(CallbackInfo info) {
        System.out.println("yes");
    }

    public void print(String msg) {
        System.out.println(msg);
    }
}
