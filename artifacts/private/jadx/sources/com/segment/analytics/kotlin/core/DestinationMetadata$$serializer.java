package com.segment.analytics.kotlin.core;

import java.util.List;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
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
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
public final class DestinationMetadata$$serializer implements p0<DestinationMetadata> {

    @NotNull
    public static final DestinationMetadata$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DestinationMetadata$$serializer destinationMetadata$$serializer = new DestinationMetadata$$serializer();
        INSTANCE = destinationMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.segment.analytics.kotlin.core.DestinationMetadata", destinationMetadata$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("bundled", true);
        pluginGeneratedSerialDescriptor.i("unbundled", true);
        pluginGeneratedSerialDescriptor.i("bundledIds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DestinationMetadata$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{hk.a.v(new kotlinx.serialization.internal.f(b3Var)), hk.a.v(new kotlinx.serialization.internal.f(b3Var)), hk.a.v(new kotlinx.serialization.internal.f(b3Var))};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public DestinationMetadata deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        Object objDecodeNullableSerializableElement4 = null;
        if (dVarBeginStructure.c()) {
            b3 b3Var = b3.f315897a;
            objDecodeNullableSerializableElement = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 0, new kotlinx.serialization.internal.f(b3Var), null);
            objDecodeNullableSerializableElement2 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, new kotlinx.serialization.internal.f(b3Var), null);
            objDecodeNullableSerializableElement3 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, new kotlinx.serialization.internal.f(b3Var), null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeNullableSerializableElement6 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeNullableSerializableElement4 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 0, new kotlinx.serialization.internal.f(b3.f315897a), objDecodeNullableSerializableElement4);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeNullableSerializableElement5 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, new kotlinx.serialization.internal.f(b3.f315897a), objDecodeNullableSerializableElement5);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    objDecodeNullableSerializableElement6 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, new kotlinx.serialization.internal.f(b3.f315897a), objDecodeNullableSerializableElement6);
                    i11 |= 4;
                }
            }
            Object obj = objDecodeNullableSerializableElement4;
            i10 = i11;
            objDecodeNullableSerializableElement = obj;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement6;
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new DestinationMetadata(i10, (List) objDecodeNullableSerializableElement, (List) objDecodeNullableSerializableElement2, (List) objDecodeNullableSerializableElement3, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull DestinationMetadata value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(descriptor2);
        DestinationMetadata.l(value, eVarBeginStructure, descriptor2);
        eVarBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
