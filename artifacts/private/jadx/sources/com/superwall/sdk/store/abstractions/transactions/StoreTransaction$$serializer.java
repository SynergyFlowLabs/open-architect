package com.superwall.sdk.store.abstractions.transactions;

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
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class StoreTransaction$$serializer implements p0<StoreTransaction> {

    @NotNull
    public static final StoreTransaction$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StoreTransaction$$serializer storeTransaction$$serializer = new StoreTransaction$$serializer();
        INSTANCE = storeTransaction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.store.abstractions.transactions.StoreTransaction", storeTransaction$$serializer, 4);
        pluginGeneratedSerialDescriptor.i("transaction", false);
        pluginGeneratedSerialDescriptor.i("config_request_id", false);
        pluginGeneratedSerialDescriptor.i("app_session_id", false);
        pluginGeneratedSerialDescriptor.i("id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StoreTransaction$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{GoogleBillingPurchaseTransaction$$serializer.INSTANCE, b3Var, b3Var, b3Var};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final StoreTransaction deserialize(@NotNull Decoder decoder) {
        int i10;
        GoogleBillingPurchaseTransaction googleBillingPurchaseTransaction;
        String str;
        String str2;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        GoogleBillingPurchaseTransaction googleBillingPurchaseTransaction2 = null;
        if (dVarBeginStructure.c()) {
            GoogleBillingPurchaseTransaction googleBillingPurchaseTransaction3 = (GoogleBillingPurchaseTransaction) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, GoogleBillingPurchaseTransaction$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
            googleBillingPurchaseTransaction = googleBillingPurchaseTransaction3;
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
            str2 = strDecodeStringElement3;
            str = strDecodeStringElement2;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    googleBillingPurchaseTransaction2 = (GoogleBillingPurchaseTransaction) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, GoogleBillingPurchaseTransaction$$serializer.INSTANCE, googleBillingPurchaseTransaction2);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new t0(iDecodeElementIndex);
                    }
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i11 |= 8;
                }
            }
            i10 = i11;
            googleBillingPurchaseTransaction = googleBillingPurchaseTransaction2;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement6;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new StoreTransaction(i10, googleBillingPurchaseTransaction, str, str2, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull StoreTransaction value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        StoreTransaction.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
