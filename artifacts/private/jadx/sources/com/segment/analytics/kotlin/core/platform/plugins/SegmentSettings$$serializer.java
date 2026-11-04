package com.segment.analytics.kotlin.core.platform.plugins;

import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
public final class SegmentSettings$$serializer implements p0<SegmentSettings> {

    @NotNull
    public static final SegmentSettings$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SegmentSettings$$serializer segmentSettings$$serializer = new SegmentSettings$$serializer();
        INSTANCE = segmentSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.segment.analytics.kotlin.core.platform.plugins.SegmentSettings", segmentSettings$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("apiKey", false);
        pluginGeneratedSerialDescriptor.i("apiHost", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SegmentSettings$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, hk.a.v(b3Var)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public SegmentSettings deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        Object objDecodeNullableSerializableElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 0);
            objDecodeNullableSerializableElement = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, b3.f315897a, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strDecodeStringElement = null;
            Object objDecodeNullableSerializableElement2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 0);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    objDecodeNullableSerializableElement2 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, b3.f315897a, objDecodeNullableSerializableElement2);
                    i11 |= 2;
                }
            }
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new SegmentSettings(i10, strDecodeStringElement, (String) objDecodeNullableSerializableElement, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull SegmentSettings value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(descriptor2);
        SegmentSettings.i(value, eVarBeginStructure, descriptor2);
        eVarBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
