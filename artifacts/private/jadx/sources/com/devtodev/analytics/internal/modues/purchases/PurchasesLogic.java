package com.devtodev.analytics.internal.modues.purchases;

import com.devtodev.analytics.internal.core.IServicesFactory;
import com.devtodev.analytics.internal.domain.events.autoPurchases.AutoPurchase;
import com.devtodev.analytics.internal.domain.events.correncyPayment.RealCurrencyPayment;
import com.devtodev.analytics.internal.domain.events.correncyPayment.SubscriptionHistory;
import com.devtodev.analytics.internal.domain.events.correncyPayment.SubscriptionPayment;
import com.devtodev.analytics.internal.domain.events.correncyPayment.Transaction;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.services.IActivityService;
import com.devtodev.analytics.internal.services.IEventsService;
import com.devtodev.analytics.internal.services.IPeopleService;
import com.devtodev.analytics.internal.services.IProjectService;
import com.devtodev.analytics.internal.services.IReportService;
import com.devtodev.analytics.internal.services.IUserService;
import com.devtodev.analytics.internal.services.purchases.IPurchasesService;
import com.devtodev.analytics.internal.services.purchases.ISubscriptionService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPurchasesLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasesLogic.kt\ncom/devtodev/analytics/internal/modues/purchases/PurchasesLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1549#2:146\n1620#2,3:147\n*S KotlinDebug\n*F\n+ 1 PurchasesLogic.kt\ncom/devtodev/analytics/internal/modues/purchases/PurchasesLogic\n*L\n128#1:146\n128#1:147,3\n*E\n"})
public final class PurchasesLogic implements IPurchases {

    @NotNull
    private final IActivityService activityService;
    private boolean autoPurchaseIsInitialized;

    @NotNull
    private final IEventsService eventsService;

    @NotNull
    private final IPeopleService peopleService;

    @NotNull
    private final IProjectService projectService;

    @NotNull
    private final IPurchasesService purchasesService;

    @NotNull
    private final IReportService reportService;

    @NotNull
    private final ISubscriptionService subscriptionService;

    @NotNull
    private final IUserService userService;

    public PurchasesLogic(@NotNull IServicesFactory servicesFactory) {
        Intrinsics.checkNotNullParameter(servicesFactory, "servicesFactory");
        this.activityService = servicesFactory.getActivityService();
        this.purchasesService = servicesFactory.getPurchasesService();
        this.userService = servicesFactory.getUserService();
        this.eventsService = servicesFactory.getEventsService();
        this.peopleService = servicesFactory.getPeopleService();
        this.reportService = servicesFactory.getReportService();
        this.subscriptionService = servicesFactory.getSubscriptionService();
        this.projectService = servicesFactory.getProjectService();
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void autoPayment(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String purchaseToken, @NotNull String currencyCode, int i10) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            long jLongValue = sessionId.longValue();
            if (!this.purchasesService.isAutoPaymentMarked(orderId)) {
                this.eventsService.addEvent(new AutoPurchase(jLongValue, this.userService.getUserLevel(), d10, orderId, productId, purchaseToken, currencyCode, i10, this.userService.getInProgressData()));
                this.purchasesService.markAutoPayment(orderId);
                this.peopleService.generatePeopleEvent(false);
                this.reportService.sendBufferedEvents();
                return;
            }
            Logger.debug$default(Logger.INSTANCE, "An automatically tracked purchase with orderId [" + orderId + "] is renewal", null, 2, null);
        }
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void autoPurchaseIsInitialized() {
        this.autoPurchaseIsInitialized = true;
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void isNeedRestoreHistory(@NotNull Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        callBack.invoke(Boolean.valueOf(this.subscriptionService.isNeedRestoreHistory()));
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void isRestoreTransactionHistoryRequired(@NotNull Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.autoPurchaseIsInitialized) {
            block.invoke(Boolean.FALSE);
        } else {
            block.invoke(Boolean.valueOf(this.subscriptionService.isNeedRestoreHistory()));
        }
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void realCurrencyPayment(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            long jLongValue = sessionId.longValue();
            if (!this.purchasesService.isCurrencyPaymentMarked(orderId)) {
                this.eventsService.addEvent(new RealCurrencyPayment(jLongValue, this.userService.getUserLevel(), d10, orderId, productId, currencyCode, this.userService.getInProgressData()));
                this.purchasesService.markCurrencyPayment(orderId);
                this.peopleService.generatePeopleEvent(false);
                this.reportService.sendBufferedEvents();
                return;
            }
            Logger.debug$default(Logger.INSTANCE, "Real payment with orderId [" + orderId + "] is already used", null, 2, null);
        }
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void subscriptionHistory(@NotNull List<String> purchaseList) {
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        if (this.subscriptionService.isNeedRestoreHistory()) {
            Long sessionId = this.activityService.getSessionId();
            if (sessionId == null) {
                Logger.error$default(Logger.INSTANCE, "Start subscription service is failed, sessionId is lost", null, 2, null);
                return;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(purchaseList, 10));
            Iterator<T> it = purchaseList.iterator();
            while (it.hasNext()) {
                arrayList.add(new JSONObject((String) it.next()));
            }
            this.subscriptionService.markAsSendRestoredHistory();
            List<Transaction> listGerActualPurchaseList = this.projectService.gerActualPurchaseList(arrayList);
            if (purchaseList.isEmpty()) {
                return;
            }
            this.eventsService.addEvent(new SubscriptionHistory(listGerActualPurchaseList, sessionId.longValue()));
            this.peopleService.generatePeopleEvent(false);
            this.reportService.sendBufferedEvents();
        }
    }

    @Override // com.devtodev.analytics.internal.modues.purchases.IPurchases
    public void subscriptionPayment(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            long jLongValue = sessionId.longValue();
            if (!this.purchasesService.isCurrencyPaymentMarked(orderId)) {
                this.eventsService.addEvent(new SubscriptionPayment(jLongValue, this.userService.getUserLevel(), d10, orderId, productId, currencyCode, this.userService.getInProgressData()));
                this.purchasesService.markCurrencyPayment(orderId);
                this.peopleService.generatePeopleEvent(false);
                this.reportService.sendBufferedEvents();
                return;
            }
            Logger.debug$default(Logger.INSTANCE, "Subscription payment with orderId [" + orderId + "] is renewal", null, 2, null);
        }
    }
}
