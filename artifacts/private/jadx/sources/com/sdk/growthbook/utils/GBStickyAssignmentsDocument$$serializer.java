package com.sdk.growthbook.utils;

import java.util.Map;
import kotlin.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class GBStickyAssignmentsDocument$$serializer implements p0<GBStickyAssignmentsDocument> {

    @NotNull
    public static final GBStickyAssignmentsDocument$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        GBStickyAssignmentsDocument$$serializer gBStickyAssignmentsDocument$$serializer = new GBStickyAssignmentsDocument$$serializer();
        INSTANCE = gBStickyAssignmentsDocument$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdk.growthbook.utils.GBStickyAssignmentsDocument", gBStickyAssignmentsDocument$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("attributeName", false);
        pluginGeneratedSerialDescriptor.i("attributeValue", false);
        pluginGeneratedSerialDescriptor.i("assignments", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GBStickyAssignmentsDocument$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        f0[] f0VarArr = GBStickyAssignmentsDocument.f266487d;
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, b3Var, f0VarArr[2].getValue()};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final GBStickyAssignmentsDocument deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        Map map;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        f0[] f0VarArr = GBStickyAssignmentsDocument.f266487d;
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.e) f0VarArr[2].getValue(), null);
            str = strDecodeStringElement2;
            i10 = 7;
            str2 = strDecodeStringElement3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strDecodeStringElement4 = null;
            Map map2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.e) f0VarArr[2].getValue(), map2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            map = map2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new GBStickyAssignmentsDocument(i10, str, str2, map, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull GBStickyAssignmentsDocument value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        GBStickyAssignmentsDocument.l(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
