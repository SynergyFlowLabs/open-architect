package com.superwall.sdk.store.abstractions.transactions;

import com.android.billingclient.api.Purchase;
import com.superwall.sdk.models.serialization.DateSerializer;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.s0;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class GoogleBillingPurchaseTransaction implements StoreTransactionType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final String appAccountToken;

    @Nullable
    private final String appBundleId;

    @Nullable
    private final Date expirationDate;

    @Nullable
    private final Boolean isUpgraded;

    @Nullable
    private final String offerId;

    @Nullable
    private final Date originalTransactionDate;

    @Nullable
    private final String originalTransactionIdentifier;

    @NotNull
    private StorePayment payment;

    @NotNull
    private final String purchaseToken;

    @Nullable
    private final Date revocationDate;

    @NotNull
    private final StoreTransactionState state;

    @Nullable
    private final String storeTransactionId;

    @Nullable
    private final String subscriptionGroupId;

    @Nullable
    private final Date transactionDate;

    @Nullable
    private Purchase underlyingSK2Transaction;

    @Nullable
    private final String webOrderLineItemID;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<GoogleBillingPurchaseTransaction> serializer() {
            return GoogleBillingPurchaseTransaction$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GoogleBillingPurchaseTransaction(int i10, Date date, String str, StoreTransactionState storeTransactionState, String str2, Date date2, String str3, String str4, String str5, Boolean bool, Date date3, String str6, Date date4, String str7, String str8, StorePayment storePayment, v2 v2Var) {
        if (32767 != (i10 & 32767)) {
            g2.b(i10, 32767, GoogleBillingPurchaseTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.underlyingSK2Transaction = null;
        this.transactionDate = date;
        this.originalTransactionIdentifier = str;
        this.state = storeTransactionState;
        this.storeTransactionId = str2;
        this.originalTransactionDate = date2;
        this.webOrderLineItemID = str3;
        this.appBundleId = str4;
        this.subscriptionGroupId = str5;
        this.isUpgraded = bool;
        this.expirationDate = date3;
        this.offerId = str6;
        this.revocationDate = date4;
        this.appAccountToken = str7;
        this.purchaseToken = str8;
        this.payment = storePayment;
    }

    @a0("app_account_token")
    public static /* synthetic */ void getAppAccountToken$annotations() {
    }

    @a0("app_bundle_id")
    public static /* synthetic */ void getAppBundleId$annotations() {
    }

    @b0(with = DateSerializer.class)
    @a0("expiration_date")
    public static /* synthetic */ void getExpirationDate$annotations() {
    }

    @a0("offer_id")
    public static /* synthetic */ void getOfferId$annotations() {
    }

    @b0(with = DateSerializer.class)
    @a0("original_transaction_date")
    public static /* synthetic */ void getOriginalTransactionDate$annotations() {
    }

    @a0("original_transaction_identifier")
    public static /* synthetic */ void getOriginalTransactionIdentifier$annotations() {
    }

    @a0("purchase_token")
    public static /* synthetic */ void getPurchaseToken$annotations() {
    }

    @b0(with = DateSerializer.class)
    @a0("revocation_date")
    public static /* synthetic */ void getRevocationDate$annotations() {
    }

    @a0("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @a0("store_transaction_id")
    public static /* synthetic */ void getStoreTransactionId$annotations() {
    }

    @a0("subscription_group_id")
    public static /* synthetic */ void getSubscriptionGroupId$annotations() {
    }

    @b0(with = DateSerializer.class)
    @a0("transaction_date")
    public static /* synthetic */ void getTransactionDate$annotations() {
    }

    @s0
    public static /* synthetic */ void getUnderlyingSK2Transaction$annotations() {
    }

    @a0("web_order_line_item_id")
    public static /* synthetic */ void getWebOrderLineItemID$annotations() {
    }

    @a0("is_upgraded")
    public static /* synthetic */ void isUpgraded$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(GoogleBillingPurchaseTransaction googleBillingPurchaseTransaction, e eVar, SerialDescriptor serialDescriptor) {
        DateSerializer dateSerializer = DateSerializer.INSTANCE;
        eVar.encodeNullableSerializableElement(serialDescriptor, 0, dateSerializer, googleBillingPurchaseTransaction.getTransactionDate());
        b3 b3Var = b3.f315897a;
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, b3Var, googleBillingPurchaseTransaction.getOriginalTransactionIdentifier());
        eVar.encodeSerializableElement(serialDescriptor, 2, StoreTransactionStateSerializer.INSTANCE, googleBillingPurchaseTransaction.getState());
        eVar.encodeNullableSerializableElement(serialDescriptor, 3, b3Var, googleBillingPurchaseTransaction.getStoreTransactionId());
        eVar.encodeNullableSerializableElement(serialDescriptor, 4, dateSerializer, googleBillingPurchaseTransaction.getOriginalTransactionDate());
        eVar.encodeNullableSerializableElement(serialDescriptor, 5, b3Var, googleBillingPurchaseTransaction.getWebOrderLineItemID());
        eVar.encodeNullableSerializableElement(serialDescriptor, 6, b3Var, googleBillingPurchaseTransaction.getAppBundleId());
        eVar.encodeNullableSerializableElement(serialDescriptor, 7, b3Var, googleBillingPurchaseTransaction.getSubscriptionGroupId());
        eVar.encodeNullableSerializableElement(serialDescriptor, 8, i.f315935a, googleBillingPurchaseTransaction.isUpgraded());
        eVar.encodeNullableSerializableElement(serialDescriptor, 9, dateSerializer, googleBillingPurchaseTransaction.getExpirationDate());
        eVar.encodeNullableSerializableElement(serialDescriptor, 10, b3Var, googleBillingPurchaseTransaction.getOfferId());
        eVar.encodeNullableSerializableElement(serialDescriptor, 11, dateSerializer, googleBillingPurchaseTransaction.getRevocationDate());
        eVar.encodeNullableSerializableElement(serialDescriptor, 12, b3Var, googleBillingPurchaseTransaction.getAppAccountToken());
        eVar.encodeStringElement(serialDescriptor, 13, googleBillingPurchaseTransaction.getPurchaseToken());
        eVar.encodeSerializableElement(serialDescriptor, 14, StorePayment$$serializer.INSTANCE, googleBillingPurchaseTransaction.getPayment());
    }

    @Nullable
    public final Purchase component1() {
        return this.underlyingSK2Transaction;
    }

    @Nullable
    public final Boolean component10() {
        return this.isUpgraded;
    }

    @Nullable
    public final Date component11() {
        return this.expirationDate;
    }

    @Nullable
    public final String component12() {
        return this.offerId;
    }

    @Nullable
    public final Date component13() {
        return this.revocationDate;
    }

    @Nullable
    public final String component14() {
        return this.appAccountToken;
    }

    @NotNull
    public final String component15() {
        return this.purchaseToken;
    }

    @NotNull
    public final StorePayment component16() {
        return this.payment;
    }

    @Nullable
    public final Date component2() {
        return this.transactionDate;
    }

    @Nullable
    public final String component3() {
        return this.originalTransactionIdentifier;
    }

    @NotNull
    public final StoreTransactionState component4() {
        return this.state;
    }

    @Nullable
    public final String component5() {
        return this.storeTransactionId;
    }

    @Nullable
    public final Date component6() {
        return this.originalTransactionDate;
    }

    @Nullable
    public final String component7() {
        return this.webOrderLineItemID;
    }

    @Nullable
    public final String component8() {
        return this.appBundleId;
    }

    @Nullable
    public final String component9() {
        return this.subscriptionGroupId;
    }

    @NotNull
    public final GoogleBillingPurchaseTransaction copy(@Nullable Purchase purchase, @Nullable Date date, @Nullable String str, @NotNull StoreTransactionState state, @Nullable String str2, @Nullable Date date2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable Date date3, @Nullable String str6, @Nullable Date date4, @Nullable String str7, @NotNull String purchaseToken, @NotNull StorePayment payment) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(payment, "payment");
        return new GoogleBillingPurchaseTransaction(purchase, date, str, state, str2, date2, str3, str4, str5, bool, date3, str6, date4, str7, purchaseToken, payment);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleBillingPurchaseTransaction)) {
            return false;
        }
        GoogleBillingPurchaseTransaction googleBillingPurchaseTransaction = (GoogleBillingPurchaseTransaction) obj;
        return Intrinsics.areEqual(this.underlyingSK2Transaction, googleBillingPurchaseTransaction.underlyingSK2Transaction) && Intrinsics.areEqual(this.transactionDate, googleBillingPurchaseTransaction.transactionDate) && Intrinsics.areEqual(this.originalTransactionIdentifier, googleBillingPurchaseTransaction.originalTransactionIdentifier) && Intrinsics.areEqual(this.state, googleBillingPurchaseTransaction.state) && Intrinsics.areEqual(this.storeTransactionId, googleBillingPurchaseTransaction.storeTransactionId) && Intrinsics.areEqual(this.originalTransactionDate, googleBillingPurchaseTransaction.originalTransactionDate) && Intrinsics.areEqual(this.webOrderLineItemID, googleBillingPurchaseTransaction.webOrderLineItemID) && Intrinsics.areEqual(this.appBundleId, googleBillingPurchaseTransaction.appBundleId) && Intrinsics.areEqual(this.subscriptionGroupId, googleBillingPurchaseTransaction.subscriptionGroupId) && Intrinsics.areEqual(this.isUpgraded, googleBillingPurchaseTransaction.isUpgraded) && Intrinsics.areEqual(this.expirationDate, googleBillingPurchaseTransaction.expirationDate) && Intrinsics.areEqual(this.offerId, googleBillingPurchaseTransaction.offerId) && Intrinsics.areEqual(this.revocationDate, googleBillingPurchaseTransaction.revocationDate) && Intrinsics.areEqual(this.appAccountToken, googleBillingPurchaseTransaction.appAccountToken) && Intrinsics.areEqual(this.purchaseToken, googleBillingPurchaseTransaction.purchaseToken) && Intrinsics.areEqual(this.payment, googleBillingPurchaseTransaction.payment);
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getAppAccountToken() {
        return this.appAccountToken;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getAppBundleId() {
        return this.appBundleId;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getOfferId() {
        return this.offerId;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public Date getOriginalTransactionDate() {
        return this.originalTransactionDate;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getOriginalTransactionIdentifier() {
        return this.originalTransactionIdentifier;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @NotNull
    public StorePayment getPayment() {
        return this.payment;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @NotNull
    public String getPurchaseToken() {
        return this.purchaseToken;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public Date getRevocationDate() {
        return this.revocationDate;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @NotNull
    public StoreTransactionState getState() {
        return this.state;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getSubscriptionGroupId() {
        return this.subscriptionGroupId;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public Date getTransactionDate() {
        return this.transactionDate;
    }

    @Nullable
    public final Purchase getUnderlyingSK2Transaction() {
        return this.underlyingSK2Transaction;
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public String getWebOrderLineItemID() {
        return this.webOrderLineItemID;
    }

    public int hashCode() {
        Purchase purchase = this.underlyingSK2Transaction;
        int iHashCode = (purchase == null ? 0 : purchase.hashCode()) * 31;
        Date date = this.transactionDate;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.originalTransactionIdentifier;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.state.hashCode()) * 31;
        String str2 = this.storeTransactionId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date2 = this.originalTransactionDate;
        int iHashCode5 = (iHashCode4 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str3 = this.webOrderLineItemID;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appBundleId;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subscriptionGroupId;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isUpgraded;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date3 = this.expirationDate;
        int iHashCode10 = (iHashCode9 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str6 = this.offerId;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date4 = this.revocationDate;
        int iHashCode12 = (iHashCode11 + (date4 == null ? 0 : date4.hashCode())) * 31;
        String str7 = this.appAccountToken;
        return ((((iHashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.purchaseToken.hashCode()) * 31) + this.payment.hashCode();
    }

    @Override // com.superwall.sdk.store.abstractions.transactions.StoreTransactionType
    @Nullable
    public Boolean isUpgraded() {
        return this.isUpgraded;
    }

    public void setPayment(@NotNull StorePayment storePayment) {
        Intrinsics.checkNotNullParameter(storePayment, "<set-?>");
        this.payment = storePayment;
    }

    public final void setUnderlyingSK2Transaction(@Nullable Purchase purchase) {
        this.underlyingSK2Transaction = purchase;
    }

    @NotNull
    public String toString() {
        return "GoogleBillingPurchaseTransaction(underlyingSK2Transaction=" + this.underlyingSK2Transaction + ", transactionDate=" + this.transactionDate + ", originalTransactionIdentifier=" + this.originalTransactionIdentifier + ", state=" + this.state + ", storeTransactionId=" + this.storeTransactionId + ", originalTransactionDate=" + this.originalTransactionDate + ", webOrderLineItemID=" + this.webOrderLineItemID + ", appBundleId=" + this.appBundleId + ", subscriptionGroupId=" + this.subscriptionGroupId + ", isUpgraded=" + this.isUpgraded + ", expirationDate=" + this.expirationDate + ", offerId=" + this.offerId + ", revocationDate=" + this.revocationDate + ", appAccountToken=" + this.appAccountToken + ", purchaseToken=" + this.purchaseToken + ", payment=" + this.payment + ")";
    }

    public GoogleBillingPurchaseTransaction(@Nullable Purchase purchase, @Nullable Date date, @Nullable String str, @NotNull StoreTransactionState state, @Nullable String str2, @Nullable Date date2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable Date date3, @Nullable String str6, @Nullable Date date4, @Nullable String str7, @NotNull String purchaseToken, @NotNull StorePayment payment) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.underlyingSK2Transaction = purchase;
        this.transactionDate = date;
        this.originalTransactionIdentifier = str;
        this.state = state;
        this.storeTransactionId = str2;
        this.originalTransactionDate = date2;
        this.webOrderLineItemID = str3;
        this.appBundleId = str4;
        this.subscriptionGroupId = str5;
        this.isUpgraded = bool;
        this.expirationDate = date3;
        this.offerId = str6;
        this.revocationDate = date4;
        this.appAccountToken = str7;
        this.purchaseToken = purchaseToken;
        this.payment = payment;
    }

    public /* synthetic */ GoogleBillingPurchaseTransaction(Purchase purchase, Date date, String str, StoreTransactionState storeTransactionState, String str2, Date date2, String str3, String str4, String str5, Boolean bool, Date date3, String str6, Date date4, String str7, String str8, StorePayment storePayment, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : purchase, date, str, storeTransactionState, str2, date2, str3, str4, str5, bool, date3, str6, date4, str7, str8, storePayment);
    }

    public GoogleBillingPurchaseTransaction(@NotNull Purchase transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Date date = new Date(transaction.i());
        String strC = transaction.c();
        StoreTransactionState.Purchased purchased = StoreTransactionState.Purchased.INSTANCE;
        String strC2 = transaction.c();
        Date date2 = new Date(transaction.i());
        StorePayment storePayment = new StorePayment(transaction);
        String strJ = transaction.j();
        Intrinsics.checkNotNullExpressionValue(strJ, "getPurchaseToken(...)");
        this(transaction, date, strC, purchased, strC2, date2, null, null, null, null, null, null, null, null, strJ, storePayment);
    }
}
