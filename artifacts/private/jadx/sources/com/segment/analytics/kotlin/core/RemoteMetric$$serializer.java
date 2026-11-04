package com.segment.analytics.kotlin.core;

import java.util.Map;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
public final class RemoteMetric$$serializer implements p0<RemoteMetric> {

    @NotNull
    public static final RemoteMetric$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RemoteMetric$$serializer remoteMetric$$serializer = new RemoteMetric$$serializer();
        INSTANCE = remoteMetric$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.segment.analytics.kotlin.core.RemoteMetric", remoteMetric$$serializer, 5);
        pluginGeneratedSerialDescriptor.i("type", false);
        pluginGeneratedSerialDescriptor.i("metric", false);
        pluginGeneratedSerialDescriptor.i("value", false);
        pluginGeneratedSerialDescriptor.i("tags", false);
        pluginGeneratedSerialDescriptor.i("log", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RemoteMetric$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        int i10 = 2 & 5;
        return new KSerializer[]{b3Var, b3Var, y0.f316055a, new e1(b3Var, b3Var), hk.a.v(new e1(b3Var, b3Var))};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public RemoteMetric deserialize(@NotNull Decoder decoder) {
        int i10;
        int i11;
        String str;
        String str2;
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(descriptor2, 1);
            int iDecodeIntElement = dVarBeginStructure.decodeIntElement(descriptor2, 2);
            b3 b3Var = b3.f315897a;
            objDecodeSerializableElement = dVarBeginStructure.decodeSerializableElement(descriptor2, 3, new e1(b3Var, b3Var), null);
            objDecodeNullableSerializableElement = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new e1(b3Var, b3Var), null);
            str = strDecodeStringElement;
            i10 = iDecodeIntElement;
            str2 = strDecodeStringElement2;
            i11 = 31;
        } else {
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            Object objDecodeSerializableElement2 = null;
            Object objDecodeNullableSerializableElement2 = null;
            int i12 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(descriptor2, 0);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(descriptor2, 1);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(descriptor2, 2);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    b3 b3Var2 = b3.f315897a;
                    objDecodeSerializableElement2 = dVarBeginStructure.decodeSerializableElement(descriptor2, 3, new e1(b3Var2, b3Var2), objDecodeSerializableElement2);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new t0(iDecodeElementIndex);
                    }
                    b3 b3Var3 = b3.f315897a;
                    objDecodeNullableSerializableElement2 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new e1(b3Var3, b3Var3), objDecodeNullableSerializableElement2);
                    i12 |= 16;
                }
            }
            i10 = iDecodeIntElement2;
            i11 = i12;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            objDecodeSerializableElement = objDecodeSerializableElement2;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new RemoteMetric(i11, str, str2, i10, (Map) objDecodeSerializableElement, (Map) objDecodeNullableSerializableElement, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull RemoteMetric value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(descriptor2);
        RemoteMetric.n(value, eVarBeginStructure, descriptor2);
        eVarBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
