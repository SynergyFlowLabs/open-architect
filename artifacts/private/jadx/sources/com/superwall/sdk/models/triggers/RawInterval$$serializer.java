package com.superwall.sdk.models.triggers;

import hk.a;
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
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class RawInterval$$serializer implements p0<RawInterval> {

    @NotNull
    public static final RawInterval$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RawInterval$$serializer rawInterval$$serializer = new RawInterval$$serializer();
        INSTANCE = rawInterval$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.triggers.RawInterval", rawInterval$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("type", false);
        pluginGeneratedSerialDescriptor.i("minutes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RawInterval$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{RawInterval.$childSerializers[0], a.v(y0.f316055a)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final RawInterval deserialize(@NotNull Decoder decoder) {
        RawInterval.IntervalType intervalType;
        Integer num;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RawInterval.$childSerializers;
        v2 v2Var = null;
        if (dVarBeginStructure.c()) {
            intervalType = (RawInterval.IntervalType) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, y0.f316055a, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            RawInterval.IntervalType intervalType2 = null;
            Integer num2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    intervalType2 = (RawInterval.IntervalType) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], intervalType2);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, y0.f316055a, num2);
                    i11 |= 2;
                }
            }
            intervalType = intervalType2;
            num = num2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new RawInterval(i10, intervalType, num, v2Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull RawInterval value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        RawInterval.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
