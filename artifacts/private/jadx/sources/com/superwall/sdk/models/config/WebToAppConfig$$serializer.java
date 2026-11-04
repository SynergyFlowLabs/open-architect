package com.superwall.sdk.models.config;

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
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class WebToAppConfig$$serializer implements p0<WebToAppConfig> {

    @NotNull
    public static final WebToAppConfig$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WebToAppConfig$$serializer webToAppConfig$$serializer = new WebToAppConfig$$serializer();
        INSTANCE = webToAppConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.config.WebToAppConfig", webToAppConfig$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("entitlements_max_age_ms", true);
        pluginGeneratedSerialDescriptor.i("restore_access_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WebToAppConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{k1.f315958a, a.v(b3.f315897a)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final WebToAppConfig deserialize(@NotNull Decoder decoder) {
        long jDecodeLongElement;
        int i10;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 4 >> 0;
        String str2 = null;
        if (dVarBeginStructure.c()) {
            jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, null);
            i10 = 3;
        } else {
            jDecodeLongElement = 0;
            boolean z10 = true;
            int i12 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, str2);
                    i12 |= 2;
                }
            }
            i10 = i12;
            str = str2;
        }
        long j10 = jDecodeLongElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new WebToAppConfig(i10, j10, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull WebToAppConfig value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        WebToAppConfig.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
