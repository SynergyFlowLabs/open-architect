package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.e0;
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SessionConfigs$$a implements p0<SessionConfigs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SessionConfigs$$a f125084a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SessionConfigs$$a sessionConfigs$$a = new SessionConfigs$$a();
        f125084a = sessionConfigs$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.settings.SessionConfigs", sessionConfigs$$a, 5);
        pluginGeneratedSerialDescriptor.i("sessionsEnabled", false);
        pluginGeneratedSerialDescriptor.i("sessionSamplingRate", false);
        pluginGeneratedSerialDescriptor.i("sessionTimeoutSeconds", false);
        pluginGeneratedSerialDescriptor.i("cacheDurationSeconds", false);
        pluginGeneratedSerialDescriptor.i("cacheUpdatedTimeSeconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SessionConfigs$$a() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final SessionConfigs deserialize(@NotNull Decoder decoder) {
        int i10;
        Boolean bool;
        Double d10;
        Integer num;
        Integer num2;
        Long l10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool2 = null;
        if (dVarBeginStructure.c()) {
            Boolean bool3 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.i.f315935a, null);
            Double d11 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, e0.f315908a, null);
            y0 y0Var = y0.f316055a;
            Integer num3 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, y0Var, null);
            bool = bool3;
            num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, y0Var, null);
            l10 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, k1.f315958a, null);
            num = num3;
            d10 = d11;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Double d12 = null;
            Integer num4 = null;
            Integer num5 = null;
            Long l11 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.i.f315935a, bool2);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    d12 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, e0.f315908a, d12);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    num4 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, y0.f316055a, num4);
                    i11 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    num5 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, y0.f316055a, num5);
                    i11 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new t0(iDecodeElementIndex);
                    }
                    l11 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, k1.f315958a, l11);
                    i11 |= 16;
                }
            }
            i10 = i11;
            bool = bool2;
            d10 = d12;
            num = num4;
            num2 = num5;
            l10 = l11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new SessionConfigs(i10, bool, d10, num, num2, l10, null);
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void serialize(@NotNull Encoder encoder, @NotNull SessionConfigs value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        SessionConfigs.m(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializerV = hk.a.v(kotlinx.serialization.internal.i.f315935a);
        KSerializer<?> kSerializerV2 = hk.a.v(e0.f315908a);
        y0 y0Var = y0.f316055a;
        return new KSerializer[]{kSerializerV, kSerializerV2, hk.a.v(y0Var), hk.a.v(y0Var), hk.a.v(k1.f315958a)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
