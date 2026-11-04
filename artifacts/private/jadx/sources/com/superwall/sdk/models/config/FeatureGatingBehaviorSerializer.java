package com.superwall.sdk.models.config;

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
@e0(forClass = FeatureGatingBehavior.class)
public final class FeatureGatingBehaviorSerializer implements KSerializer<FeatureGatingBehavior> {

    @NotNull
    public static final FeatureGatingBehaviorSerializer INSTANCE = new FeatureGatingBehaviorSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.config.FeatureGatingBehavior", null, 0);

    private FeatureGatingBehaviorSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public FeatureGatingBehavior deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        if (Intrinsics.areEqual(strDecodeString, "GATED")) {
            return FeatureGatingBehavior.Gated.INSTANCE;
        }
        return Intrinsics.areEqual(strDecodeString, "NON_GATED") ? FeatureGatingBehavior.NonGated.INSTANCE : FeatureGatingBehavior.NonGated.INSTANCE;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull FeatureGatingBehavior value) {
        String str;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof FeatureGatingBehavior.Gated) {
            str = "GATED";
        } else {
            if (!(value instanceof FeatureGatingBehavior.NonGated)) {
                throw new k0();
            }
            str = "NON_GATED";
        }
        encoder.encodeString(str);
    }
}
