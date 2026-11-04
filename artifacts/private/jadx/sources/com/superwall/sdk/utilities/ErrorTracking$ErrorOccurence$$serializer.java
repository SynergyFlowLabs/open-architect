package com.superwall.sdk.utilities;

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
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class ErrorTracking$ErrorOccurence$$serializer implements p0<ErrorTracking.ErrorOccurence> {

    @NotNull
    public static final ErrorTracking$ErrorOccurence$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ErrorTracking$ErrorOccurence$$serializer errorTracking$ErrorOccurence$$serializer = new ErrorTracking$ErrorOccurence$$serializer();
        INSTANCE = errorTracking$ErrorOccurence$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.utilities.ErrorTracking.ErrorOccurence", errorTracking$ErrorOccurence$$serializer, 5);
        pluginGeneratedSerialDescriptor.i("type", false);
        pluginGeneratedSerialDescriptor.i("message", false);
        pluginGeneratedSerialDescriptor.i("stacktrace", false);
        pluginGeneratedSerialDescriptor.i("timestamp", false);
        pluginGeneratedSerialDescriptor.i("isFatal", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ErrorTracking$ErrorOccurence$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, b3Var, b3Var, k1.f315958a, i.f315935a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final ErrorTracking.ErrorOccurence deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        boolean zDecodeBooleanElement;
        int i10;
        String str;
        String str2;
        long j10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
            zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            i10 = 31;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            j10 = jDecodeLongElement;
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            boolean z10 = true;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement2 = false;
            int i11 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i11 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i11 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new t0(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i11 |= 16;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i10 = i11;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            j10 = jDecodeLongElement2;
        }
        String str3 = strDecodeStringElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new ErrorTracking.ErrorOccurence(i10, str3, str2, str, j10, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull ErrorTracking.ErrorOccurence value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        ErrorTracking.ErrorOccurence.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
