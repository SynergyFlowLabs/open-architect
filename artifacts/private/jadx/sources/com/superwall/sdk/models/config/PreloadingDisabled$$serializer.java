package com.superwall.sdk.models.config;

import java.util.Set;
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
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PreloadingDisabled$$serializer implements p0<PreloadingDisabled> {

    @NotNull
    public static final PreloadingDisabled$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PreloadingDisabled$$serializer preloadingDisabled$$serializer = new PreloadingDisabled$$serializer();
        INSTANCE = preloadingDisabled$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.config.PreloadingDisabled", preloadingDisabled$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("all", false);
        pluginGeneratedSerialDescriptor.i("triggers", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PreloadingDisabled$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{i.f315935a, PreloadingDisabled.$childSerializers[1]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final PreloadingDisabled deserialize(@NotNull Decoder decoder) {
        Set set;
        boolean zDecodeBooleanElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PreloadingDisabled.$childSerializers;
        v2 v2Var = null;
        if (dVarBeginStructure.c()) {
            zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            set = (Set) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            boolean zDecodeBooleanElement2 = false;
            int i11 = 0;
            Set set2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    set2 = (Set) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], set2);
                    i11 |= 2;
                }
            }
            set = set2;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new PreloadingDisabled(i10, zDecodeBooleanElement, set, v2Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull PreloadingDisabled value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        PreloadingDisabled.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
