package com.superwall.sdk.store.abstractions.transactions;

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
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class StorePayment$$serializer implements p0<StorePayment> {

    @NotNull
    public static final StorePayment$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StorePayment$$serializer storePayment$$serializer = new StorePayment$$serializer();
        INSTANCE = storePayment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.store.abstractions.transactions.StorePayment", storePayment$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("productIdentifier", false);
        pluginGeneratedSerialDescriptor.i("quantity", false);
        pluginGeneratedSerialDescriptor.i("discountIdentifier", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StorePayment$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, y0.f316055a, a.v(b3Var)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final StorePayment deserialize(@NotNull Decoder decoder) {
        int i10;
        int i11;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
            str = strDecodeStringElement;
            str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b3.f315897a, null);
            i10 = iDecodeIntElement;
            i11 = 7;
        } else {
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            String strDecodeStringElement2 = null;
            String str3 = null;
            int i12 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i12 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b3.f315897a, str3);
                    i12 |= 4;
                }
            }
            i10 = iDecodeIntElement2;
            i11 = i12;
            str = strDecodeStringElement2;
            str2 = str3;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new StorePayment(i11, str, i10, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull StorePayment value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        StorePayment.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
