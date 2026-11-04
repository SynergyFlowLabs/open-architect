package com.superwall.sdk.models.transactions;

import io.intercom.android.sdk.models.AttributeType;
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
public /* synthetic */ class SavedTransaction$$serializer implements p0<SavedTransaction> {

    @NotNull
    public static final SavedTransaction$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SavedTransaction$$serializer savedTransaction$$serializer = new SavedTransaction$$serializer();
        INSTANCE = savedTransaction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.transactions.SavedTransaction", savedTransaction$$serializer, 4);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i(AttributeType.DATE, false);
        pluginGeneratedSerialDescriptor.i("hasExternalPurchaseController", false);
        pluginGeneratedSerialDescriptor.i("isExternal", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SavedTransaction$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        i iVar = i.f315935a;
        return new KSerializer[]{b3.f315897a, k1.f315958a, iVar, iVar};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final SavedTransaction deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        boolean zDecodeBooleanElement;
        boolean z10;
        long j10;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            z10 = zDecodeBooleanElement2;
            j10 = jDecodeLongElement;
            i10 = 15;
        } else {
            strDecodeStringElement = null;
            boolean z11 = true;
            int i11 = 0;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            while (z11) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new t0(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i11 |= 8;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            z10 = zDecodeBooleanElement4;
            j10 = jDecodeLongElement2;
            i10 = i11;
        }
        String str = strDecodeStringElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new SavedTransaction(i10, str, j10, z10, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull SavedTransaction value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        SavedTransaction.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
