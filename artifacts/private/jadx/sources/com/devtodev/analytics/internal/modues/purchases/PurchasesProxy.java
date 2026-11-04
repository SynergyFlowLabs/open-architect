package com.devtodev.analytics.internal.modues.purchases;

import com.devtodev.analytics.internal.domain.events.autoPurchases.AutoPurchaseKt;
import com.devtodev.analytics.internal.domain.events.correncyPayment.SubscriptionHistoryKt;
import com.devtodev.analytics.internal.domain.events.correncyPayment.SubscriptionPaymentKt;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.queue.QueueManager;
import com.devtodev.analytics.internal.validator.PaymentData;
import com.devtodev.analytics.internal.validator.Validator;
import com.devtodev.analytics.internal.validator.ValidatorRules;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchasesProxy implements IPurchasesProxy {

    @Nullable
    private IPurchases purchasesLogic;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.purchases.PurchasesProxy$autoPayment$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $currencyCode;
        final /* synthetic */ String $orderId;
        final /* synthetic */ int $paymentType;
        final /* synthetic */ double $price;
        final /* synthetic */ String $productId;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10, String str, double d10, String str2, String str3, String str4) {
            super(0);
            this.$paymentType = i10;
            this.$orderId = str;
            this.$price = d10;
            this.$productId = str2;
            this.$currencyCode = str3;
            this.$purchaseToken = str4;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IPurchases iPurchases;
            IPurchases iPurchases2 = PurchasesProxy.this.purchasesLogic;
            PurchasesProxy purchasesProxy = PurchasesProxy.this;
            int i10 = this.$paymentType;
            String str = this.$orderId;
            double d10 = this.$price;
            String str2 = this.$productId;
            String str3 = this.$currencyCode;
            String str4 = this.$purchaseToken;
            if (iPurchases2 == null) {
                purchasesProxy.validateInitialization("autoPayment");
                return;
            }
            PaymentData paymentDataValidatePayment = ValidatorRules.INSTANCE.validatePayment(i10 == 0 ? "AutoPurchasePayment" : "AutoSubscriptionPayment", str, d10, str2, str3);
            if (paymentDataValidatePayment != null && !Validator.INSTANCE.isExcluded(AutoPurchaseKt.AUTO_PURCHASE_CODE, null) && (iPurchases = purchasesProxy.purchasesLogic) != null) {
                iPurchases.autoPayment(paymentDataValidatePayment.getOrderId(), paymentDataValidatePayment.getPrice(), paymentDataValidatePayment.getProductId(), str4, paymentDataValidatePayment.getCurrencyCode(), i10);
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.purchases.PurchasesProxy$autoPurchaseIsInitialized$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25971 extends l0 implements Function0<Unit> {
        public C25971() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IPurchases iPurchases = PurchasesProxy.this.purchasesLogic;
            if (iPurchases != null) {
                iPurchases.autoPurchaseIsInitialized();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.purchases.PurchasesProxy$isNeedRestoreHistory$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25981 extends l0 implements Function0<Unit> {
        final /* synthetic */ Function1<Boolean, Unit> $callBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25981(Function1<? super Boolean, Unit> function1) {
            super(0);
            this.$callBack = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IPurchases iPurchases = PurchasesProxy.this.purchasesLogic;
            Function1<Boolean, Unit> function1 = this.$callBack;
            if (iPurchases != null) {
                iPurchases.isNeedRestoreHistory(function1);
            } else {
                function1.invoke(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.purchases.PurchasesProxy$isRestoreTransactionHistoryRequired$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25991 extends l0 implements Function0<Unit> {
        final /* synthetic */ Function1<Boolean, Unit> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25991(Function1<? super Boolean, Unit> function1) {
            super(0);
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IPurchases iPurchases = PurchasesProxy.this.purchasesLogic;
            Function1<Boolean, Unit> function1 = this.$block;
            PurchasesProxy purchasesProxy = PurchasesProxy.this;
            if (iPurchases != null) {
                iPurchases.isRestoreTransactionHistoryRequired(function1);
            } else {
                function1.invoke(Boolean.FALSE);
                purchasesProxy.validateInitialization("isRestoreTransactionHistoryRequired");
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.purchases.PurchasesProxy$realCurrencyPayment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C26001 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $currencyCode;
        final /* synthetic */ String $orderId;
        final /* synthetic */ double $price;
        final /* synthetic */ String $productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26001(String str, double d10, String str2, String str3) {
            super(0);
            this.$orderId = str;
            this.$price = d10;
            this.$productId = str2;
            this.$currencyCode = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IPurchases iPurchases;
            IPurchases iPurchases2 = PurchasesProxy.this.purchasesLogic;
            PurchasesProxy purchasesProxy = PurchasesProxy.this;
            String str = this.$orderId;
            double d10 = this.$price;
            String str2 = this.$productId;
            String str3 = this.$currencyCode;
            if (iPurchases2 == null) {
                purchasesProxy.validateInitialization("realCurrencyPayment");
                return;
            }
            PaymentData paymentDataValidatePayment = ValidatorRules.INSTANCE.validatePayment("RealCurrencyPayment", str, d10, str2, str3);
            if (paymentDataValidatePayment == null || Validator.INSTANCE.isExcluded("rp", null) || (iPurchases = purchasesProxy.purchasesLogic) == null) {
                return;
            }
            iPurchases.realCurrencyPayment(paymentDataValidatePayment.getOrderId(), paymentDataValidatePayment.getPrice(), paymentDataValidatePayment.getProductId(), paymentDataValidatePayment.getCurrencyCode());
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.purchases.PurchasesProxy$subscriptionHistory$1, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nPurchasesProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasesProxy.kt\ncom/devtodev/analytics/internal/modues/purchases/PurchasesProxy$subscriptionHistory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n1549#2:173\n1620#2,3:174\n*S KotlinDebug\n*F\n+ 1 PurchasesProxy.kt\ncom/devtodev/analytics/internal/modues/purchases/PurchasesProxy$subscriptionHistory$1\n*L\n140#1:173\n140#1:174,3\n*E\n"})
    public static final class C26011 extends l0 implements Function0<Unit> {
        final /* synthetic */ List<String> $purchaseList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26011(List<String> list) {
            super(0);
            this.$purchaseList = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws JSONException {
            IPurchases iPurchases = PurchasesProxy.this.purchasesLogic;
            PurchasesProxy purchasesProxy = PurchasesProxy.this;
            List<String> list = this.$purchaseList;
            if (iPurchases == null) {
                purchasesProxy.validateInitialization("subscriptionHistory");
                return;
            }
            List<JSONObject> listValidateSubscriptionHistory = ValidatorRules.INSTANCE.validateSubscriptionHistory(list);
            if (listValidateSubscriptionHistory == null || Validator.INSTANCE.isExcluded(SubscriptionHistoryKt.SUBSCRIPTION_HISTORY_CODE, null)) {
                return;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listValidateSubscriptionHistory, 10));
            Iterator<T> it = listValidateSubscriptionHistory.iterator();
            while (it.hasNext()) {
                arrayList.add(((JSONObject) it.next()).toString());
            }
            iPurchases.subscriptionHistory(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.purchases.PurchasesProxy$subscriptionPayment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C26021 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $currencyCode;
        final /* synthetic */ String $orderId;
        final /* synthetic */ double $price;
        final /* synthetic */ String $productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26021(String str, double d10, String str2, String str3) {
            super(0);
            this.$orderId = str;
            this.$price = d10;
            this.$productId = str2;
            this.$currencyCode = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IPurchases iPurchases;
            IPurchases iPurchases2 = PurchasesProxy.this.purchasesLogic;
            PurchasesProxy purchasesProxy = PurchasesProxy.this;
            String str = this.$orderId;
            double d10 = this.$price;
            String str2 = this.$productId;
            String str3 = this.$currencyCode;
            if (iPurchases2 == null) {
                purchasesProxy.validateInitialization("subscriptionPayment");
                return;
            }
            PaymentData paymentDataValidatePayment = ValidatorRules.INSTANCE.validatePayment("SubscriptionPayment", str, d10, str2, str3);
            if (paymentDataValidatePayment == null || Validator.INSTANCE.isExcluded(SubscriptionPaymentKt.SUBSCRIPTION_PAYMENT_CODE, null) || (iPurchases = purchasesProxy.purchasesLogic) == null) {
                return;
            }
            iPurchases.subscriptionPayment(paymentDataValidatePayment.getOrderId(), paymentDataValidatePayment.getPrice(), paymentDataValidatePayment.getProductId(), paymentDataValidatePayment.getCurrencyCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateInitialization(String str) {
        Logger.INSTANCE.error("In the " + str + " method an error has occurred: The SDK is not initialized yet!", null);
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void autoPayment(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String purchaseToken, @NotNull String currencyCode, int i10) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        QueueManager.Companion.runIncoming(new AnonymousClass1(i10, orderId, d10, productId, currencyCode, purchaseToken));
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void autoPurchaseIsInitialized() {
        QueueManager.Companion.runIncoming(new C25971());
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchasesProxy
    public void initialize(@NotNull IPurchases purchasesLogic) {
        Intrinsics.checkNotNullParameter(purchasesLogic, "purchasesLogic");
        this.purchasesLogic = purchasesLogic;
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void isNeedRestoreHistory(@NotNull Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        QueueManager.Companion.runIncoming(new C25981(callBack));
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void isRestoreTransactionHistoryRequired(@NotNull Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        QueueManager.Companion.runIncoming(new C25991(block));
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void realCurrencyPayment(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        QueueManager.Companion.runIncoming(new C26001(orderId, d10, productId, currencyCode));
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void subscriptionHistory(@NotNull List<String> purchaseList) {
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        QueueManager.Companion.runIncoming(new C26011(purchaseList));
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void subscriptionPayment(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        QueueManager.Companion.runIncoming(new C26021(orderId, d10, productId, currencyCode));
    }
}
