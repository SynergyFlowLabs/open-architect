package com.superwall.sdk.models.config;

import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class RawFeatureFlag$$serializer implements p0<RawFeatureFlag> {

    @NotNull
    public static final RawFeatureFlag$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RawFeatureFlag$$serializer rawFeatureFlag$$serializer = new RawFeatureFlag$$serializer();
        INSTANCE = rawFeatureFlag$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.config.RawFeatureFlag", rawFeatureFlag$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("key", false);
        pluginGeneratedSerialDescriptor.i("enabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RawFeatureFlag$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, i.f315935a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final RawFeatureFlag deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        boolean zDecodeBooleanElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            i10 = 3;
            int i11 = 7 & 3;
        } else {
            boolean z10 = true;
            boolean zDecodeBooleanElement2 = false;
            int i12 = 0;
            strDecodeStringElement = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i12 |= 2;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i10 = i12;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new RawFeatureFlag(i10, strDecodeStringElement, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull RawFeatureFlag value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        RawFeatureFlag.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
