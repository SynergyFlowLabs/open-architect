package com.superwall.sdk.paywall.presentation.rule_logic.cel.models;

import java.util.Map;
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
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PassableMap$$serializer implements p0<PassableMap> {

    @NotNull
    public static final PassableMap$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PassableMap$$serializer passableMap$$serializer = new PassableMap$$serializer();
        INSTANCE = passableMap$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PassableMap", passableMap$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("map", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PassableMap$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{PassableMap.$childSerializers[0]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final PassableMap deserialize(@NotNull Decoder decoder) {
        Map map;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PassableMap.$childSerializers;
        int i10 = 1;
        if (dVarBeginStructure.c()) {
            map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            Map map2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], map2);
                    i11 = 1;
                }
            }
            map = map2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new PassableMap(i10, map, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull PassableMap value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        eVarBeginStructure.encodeSerializableElement(serialDescriptor, 0, PassableMap.$childSerializers[0], value.map);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
