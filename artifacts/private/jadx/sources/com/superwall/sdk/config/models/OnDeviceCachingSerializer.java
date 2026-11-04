package com.superwall.sdk.config.models;

import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.e0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@e0(forClass = OnDeviceCaching.class)
public final class OnDeviceCachingSerializer implements KSerializer<OnDeviceCaching> {

    @NotNull
    public static final OnDeviceCachingSerializer INSTANCE = new OnDeviceCachingSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.config.models.OnDeviceCaching", null, 0);

    private OnDeviceCachingSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public OnDeviceCaching deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        if (Intrinsics.areEqual(strDecodeString, "ENABLED")) {
            return OnDeviceCaching.Enabled.INSTANCE;
        }
        return Intrinsics.areEqual(strDecodeString, "DISABLED") ? OnDeviceCaching.Disabled.INSTANCE : OnDeviceCaching.Disabled.INSTANCE;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull OnDeviceCaching value) {
        String str;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof OnDeviceCaching.Enabled) {
            str = "ENABLED";
        } else {
            if (!(value instanceof OnDeviceCaching.Disabled)) {
                throw new k0();
            }
            str = "DISABLED";
        }
        encoder.encodeString(str);
    }
}
