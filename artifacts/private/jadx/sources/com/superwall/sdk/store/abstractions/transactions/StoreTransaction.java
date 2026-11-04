package com.superwall.sdk.store.abstractions.transactions;

import com.superwall.sdk.models.serialization.DateSerializer;
import com.superwall.sdk.storage.core_data.ConvertersKt;
import com.superwall.sdk.store.abstractions.transactions.StoreTransaction;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@SourceDebugExtension({"SMAP\nStoreTransaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreTransaction.kt\ncom/superwall/sdk/store/abstractions/transactions/StoreTransaction\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,83:1\n216#2,2:84\n*S KotlinDebug\n*F\n+ 1 StoreTransaction.kt\ncom/superwall/sdk/store/abstractions/transactions/StoreTransaction\n*L\n75#1:84,2\n*E\n"})
public final class StoreTransaction implements StoreTransactionType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String appSessionId;

    @NotNull
    private final String configRequestId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267530id;

    @NotNull
    private final transient GoogleBillingPurchaseTransaction transaction;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<StoreTransaction> serializer() {
            return StoreTransaction$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoreTransaction(int i10, GoogleBillingPurchaseTransaction googleBillingPurchaseTransaction, String str, String str2, String str3, v2 v2Var) {
        if (7 != (i10 & 7)) {
            g2.b(i10, 7, StoreTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.transaction = googleBillingPurchaseTransaction;
        this.configRequestId = str;
        this.appSessionId = str2;
        if ((i10 & 8) != 0) {
            this.f267530id = str3;
            return;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f267530id = string;
    }

    @a0("app_session_id")
    public static /* synthetic */ void getAppSessionId$annotations() {
    }

    @a0("config_request_id")
    public static /* synthetic */ void getConfigRequestId$annotations() {
    }

    @b0(with = DateSerializer.class)
    public static /* synthetic */ void getExpirationDate$annotations() {
    }

    @b0(with = DateSerializer.class)
    public static /* synthetic */ void getOriginalTransactionDate$annotations() {
    }

    @b0(with = DateSerializer.class)
    public static /* synthetic */ void getRevocationDate$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toDictionary$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        return Unit.f312394a;
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(StoreTransaction storeTransaction, e eVar, SerialDescriptor serialDescriptor) {
        int i10 = 4 >> 0;
        eVar.encodeSerializableElement(serialDescriptor, 0, GoogleBillingPurchaseTransaction$$serializer.INSTANCE, storeTransaction.transaction);
        eVar.encodeStringElement(serialDescriptor, 1, storeTransaction.configRequestId);
        eVar.encodeStringElement(serialDescriptor, 2, storeTransaction.appSessionId);
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 3)) {
            String str = storeTransaction.f267530id;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (Intrinsics.areEqual(str, string)) {
                return;
            }
        }
        eVar.encodeStringElement(serialDescriptor, 3, storeTransaction.f267530id);
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getAppAccountToken() {
        return this.transaction.getAppAccountToken();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getAppBundleId() {
        return this.transaction.getAppBundleId();
    }

    @NotNull
    public final String getAppSessionId() {
        return this.appSessionId;
    }

    @NotNull
    public final String getConfigRequestId() {
        return this.configRequestId;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public Date getExpirationDate() {
        return this.transaction.getExpirationDate();
    }

    @NotNull
    public final String getId() {
        return this.f267530id;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getOfferId() {
        return this.transaction.getOfferId();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public Date getOriginalTransactionDate() {
        return this.transaction.getOriginalTransactionDate();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getOriginalTransactionIdentifier() {
        return this.transaction.getOriginalTransactionIdentifier();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public StorePayment getPayment() {
        return this.transaction.getPayment();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @NotNull
    public String getPurchaseToken() {
        return this.transaction.getPurchaseToken();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public Date getRevocationDate() {
        return this.transaction.getRevocationDate();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @NotNull
    public StoreTransactionState getState() {
        return this.transaction.getState();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getStoreTransactionId() {
        return this.transaction.getStoreTransactionId();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getSubscriptionGroupId() {
        return this.transaction.getSubscriptionGroupId();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public Date getTransactionDate() {
        return this.transaction.getTransactionDate();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getWebOrderLineItemID() {
        return this.transaction.getWebOrderLineItemID();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public Boolean isUpgraded() {
        return this.transaction.isUpgraded();
    }

    @NotNull
    public final Map<String, Object> toDictionary() {
        Json jsonJson$default = JsonKt.Json$default(null, new Function1() { // from class: eg.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StoreTransaction.toDictionary$lambda$0((JsonBuilder) obj);
            }
        }, 1, null);
        Map<String, Object> mutableMap = MapsKt.toMutableMap(ConvertersKt.toNullableTypedMap(jsonJson$default, jsonJson$default.encodeToString(Companion.serializer(), this)));
        Object obj = mutableMap.get("transaction");
        Map<? extends String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            mutableMap.remove("transaction");
            mutableMap.putAll(map);
        }
        Object obj2 = mutableMap.get("payment");
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map2 != null) {
            mutableMap.remove("payment");
            for (Map.Entry entry : map2.entrySet()) {
                String str = (String) entry.getKey();
                mutableMap.put("payment_" + str, entry.getValue());
            }
        }
        return mutableMap;
    }

    public StoreTransaction(@NotNull GoogleBillingPurchaseTransaction transaction, @NotNull String configRequestId, @NotNull String appSessionId) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(configRequestId, "configRequestId");
        Intrinsics.checkNotNullParameter(appSessionId, "appSessionId");
        this.transaction = transaction;
        this.configRequestId = configRequestId;
        this.appSessionId = appSessionId;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f267530id = string;
    }
}
