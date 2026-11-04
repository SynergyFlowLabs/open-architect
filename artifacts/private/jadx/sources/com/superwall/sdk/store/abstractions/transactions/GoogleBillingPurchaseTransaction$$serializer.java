package com.superwall.sdk.store.abstractions.transactions;

import com.superwall.sdk.models.serialization.DateSerializer;
import hk.a;
import java.util.Date;
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
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class GoogleBillingPurchaseTransaction$$serializer implements p0<GoogleBillingPurchaseTransaction> {

    @NotNull
    public static final GoogleBillingPurchaseTransaction$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        GoogleBillingPurchaseTransaction$$serializer googleBillingPurchaseTransaction$$serializer = new GoogleBillingPurchaseTransaction$$serializer();
        INSTANCE = googleBillingPurchaseTransaction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.store.abstractions.transactions.GoogleBillingPurchaseTransaction", googleBillingPurchaseTransaction$$serializer, 15);
        pluginGeneratedSerialDescriptor.i("transaction_date", false);
        pluginGeneratedSerialDescriptor.i("original_transaction_identifier", false);
        pluginGeneratedSerialDescriptor.i("state", false);
        pluginGeneratedSerialDescriptor.i("store_transaction_id", false);
        pluginGeneratedSerialDescriptor.i("original_transaction_date", false);
        pluginGeneratedSerialDescriptor.i("web_order_line_item_id", false);
        pluginGeneratedSerialDescriptor.i("app_bundle_id", false);
        pluginGeneratedSerialDescriptor.i("subscription_group_id", false);
        pluginGeneratedSerialDescriptor.i("is_upgraded", false);
        pluginGeneratedSerialDescriptor.i("expiration_date", false);
        pluginGeneratedSerialDescriptor.i("offer_id", false);
        pluginGeneratedSerialDescriptor.i("revocation_date", false);
        pluginGeneratedSerialDescriptor.i("app_account_token", false);
        pluginGeneratedSerialDescriptor.i("purchase_token", false);
        pluginGeneratedSerialDescriptor.i("payment", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GoogleBillingPurchaseTransaction$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        DateSerializer dateSerializer = DateSerializer.INSTANCE;
        KSerializer<?> kSerializerV = a.v(dateSerializer);
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{kSerializerV, a.v(b3Var), StoreTransactionStateSerializer.INSTANCE, a.v(b3Var), a.v(dateSerializer), a.v(b3Var), a.v(b3Var), a.v(b3Var), a.v(i.f315935a), a.v(dateSerializer), a.v(b3Var), a.v(dateSerializer), a.v(b3Var), b3Var, StorePayment$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final GoogleBillingPurchaseTransaction deserialize(@NotNull Decoder decoder) {
        StoreTransactionState storeTransactionState;
        Date date;
        String str;
        StorePayment storePayment;
        String str2;
        String str3;
        Date date2;
        Boolean bool;
        String str4;
        Date date3;
        String str5;
        String str6;
        String str7;
        Date date4;
        int i10;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        StorePayment storePayment2 = null;
        if (dVarBeginStructure.c()) {
            DateSerializer dateSerializer = DateSerializer.INSTANCE;
            Date date5 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, dateSerializer, null);
            b3 b3Var = b3.f315897a;
            String str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3Var, null);
            storeTransactionState = (StoreTransactionState) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, StoreTransactionStateSerializer.INSTANCE, null);
            String str10 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3Var, null);
            Date date6 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, dateSerializer, null);
            String str11 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b3Var, null);
            String str12 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b3Var, null);
            String str13 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, b3Var, null);
            Boolean bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, i.f315935a, null);
            Date date7 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, dateSerializer, null);
            String str14 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, b3Var, null);
            Date date8 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, dateSerializer, null);
            String str15 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, b3Var, null);
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 13);
            date3 = date8;
            storePayment = (StorePayment) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 14, StorePayment$$serializer.INSTANCE, null);
            i10 = 32767;
            date = date5;
            str8 = strDecodeStringElement;
            date2 = date7;
            str5 = str13;
            str4 = str12;
            str6 = str11;
            str = str10;
            bool = bool2;
            date4 = date6;
            str3 = str14;
            str2 = str15;
            str7 = str9;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Date date9 = null;
            String str16 = null;
            String str17 = null;
            storeTransactionState = null;
            String str18 = null;
            String str19 = null;
            Date date10 = null;
            Boolean bool3 = null;
            String str20 = null;
            Date date11 = null;
            String str21 = null;
            String str22 = null;
            String strDecodeStringElement2 = null;
            Date date12 = null;
            while (z10) {
                String str23 = str17;
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        str17 = str23;
                        date9 = date9;
                        i11 = i11;
                        break;
                    case 0:
                        date12 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, DateSerializer.INSTANCE, date12);
                        i11 |= 1;
                        str17 = str23;
                        date9 = date9;
                        break;
                    case 1:
                        str17 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, str23);
                        i11 |= 2;
                        date9 = date9;
                        break;
                    case 2:
                        storeTransactionState = (StoreTransactionState) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, StoreTransactionStateSerializer.INSTANCE, storeTransactionState);
                        i11 |= 4;
                        str17 = str23;
                        break;
                    case 3:
                        str16 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, str16);
                        i11 |= 8;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 4:
                        date9 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DateSerializer.INSTANCE, date9);
                        i11 |= 16;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 5:
                        str22 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b3.f315897a, str22);
                        i11 |= 32;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 6:
                        str20 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b3.f315897a, str20);
                        i11 |= 64;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 7:
                        str21 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, b3.f315897a, str21);
                        i11 |= 128;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 8:
                        bool3 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, i.f315935a, bool3);
                        i11 |= 256;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 9:
                        date10 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, DateSerializer.INSTANCE, date10);
                        i11 |= 512;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 10:
                        str19 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, b3.f315897a, str19);
                        i11 |= 1024;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 11:
                        date11 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, DateSerializer.INSTANCE, date11);
                        i11 |= 2048;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 12:
                        str18 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, b3.f315897a, str18);
                        i11 |= 4096;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 13:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i11 |= 8192;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    case 14:
                        storePayment2 = (StorePayment) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 14, StorePayment$$serializer.INSTANCE, storePayment2);
                        i11 |= 16384;
                        str17 = str23;
                        storeTransactionState = storeTransactionState;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            date = date12;
            str = str16;
            storePayment = storePayment2;
            str2 = str18;
            str3 = str19;
            date2 = date10;
            bool = bool3;
            str4 = str20;
            date3 = date11;
            str5 = str21;
            str6 = str22;
            str7 = str17;
            date4 = date9;
            i10 = i11;
            str8 = strDecodeStringElement2;
        }
        StoreTransactionState storeTransactionState2 = storeTransactionState;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new GoogleBillingPurchaseTransaction(i10, date, str7, storeTransactionState2, str, date4, str6, str4, str5, bool, date2, str3, date3, str2, str8, storePayment, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull GoogleBillingPurchaseTransaction value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        GoogleBillingPurchaseTransaction.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
