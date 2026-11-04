package com.devtodev.analytics.internal.services.purchases;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.events.autoPurchases.AutoPurchasesMark;
import com.devtodev.analytics.internal.domain.events.correncyPayment.PaymentMark;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.IRepository;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPurchasesService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasesService.kt\ncom/devtodev/analytics/internal/services/purchases/PurchasesService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n288#2,2:71\n288#2,2:73\n*S KotlinDebug\n*F\n+ 1 PurchasesService.kt\ncom/devtodev/analytics/internal/services/purchases/PurchasesService\n*L\n29#1:71,2\n53#1:73,2\n*E\n"})
public final class PurchasesService implements IPurchasesService {

    @NotNull
    private final IRepository autoPurchasesRepository;

    @NotNull
    private final IRepository paymentRepository;

    @NotNull
    private final IStateManager stateManager;

    public PurchasesService(@NotNull IStateManager stateManager, @NotNull IRepository paymentRepository, @NotNull IRepository autoPurchasesRepository) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(autoPurchasesRepository, "autoPurchasesRepository");
        this.stateManager = stateManager;
        this.paymentRepository = paymentRepository;
        this.autoPurchasesRepository = autoPurchasesRepository;
    }

    @NotNull
    public final IStateManager getStateManager() {
        return this.stateManager;
    }

    @Override // com.devtodev.analytics.internal.services.purchases.IPurchasesService
    public boolean isAutoPaymentMarked(@NotNull String orderId) {
        Object next;
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Project activeProject = this.stateManager.getActiveProject();
        List<DbModel> all = this.autoPurchasesRepository.getAll(AutoPurchasesMark.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.autoPurchases.AutoPurchasesMark>");
        Iterator<T> it = all.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AutoPurchasesMark autoPurchasesMark = (AutoPurchasesMark) next;
            if (Intrinsics.areEqual(autoPurchasesMark.getOrderId(), orderId) && autoPurchasesMark.getProjectId() == activeProject.getIdKey()) {
                break;
            }
        }
        return ((AutoPurchasesMark) next) != null;
    }

    @Override // com.devtodev.analytics.internal.services.purchases.IPurchasesService
    public boolean isCurrencyPaymentMarked(@NotNull String orderId) {
        Object next;
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Project activeProject = this.stateManager.getActiveProject();
        List<DbModel> all = this.paymentRepository.getAll(PaymentMark.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.correncyPayment.PaymentMark>");
        Iterator<T> it = all.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PaymentMark paymentMark = (PaymentMark) next;
            if (Intrinsics.areEqual(paymentMark.getOrderId(), orderId) && paymentMark.getProjectId() == activeProject.getIdKey()) {
                break;
            }
        }
        return ((PaymentMark) next) != null;
    }

    @Override // com.devtodev.analytics.internal.services.purchases.IPurchasesService
    public void markAutoPayment(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        if (!isAutoPaymentMarked(orderId)) {
            this.autoPurchasesRepository.insert(new AutoPurchasesMark(0L, this.stateManager.getActiveProject().getIdKey(), orderId, 1, null));
        } else {
            Logger.INSTANCE.warning("Auto currency payment with same [" + orderId + "] order id is already marked!", null);
        }
    }

    @Override // com.devtodev.analytics.internal.services.purchases.IPurchasesService
    public void markCurrencyPayment(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        if (!isCurrencyPaymentMarked(orderId)) {
            this.paymentRepository.insert(new PaymentMark(0L, this.stateManager.getActiveProject().getIdKey(), orderId, 1, null));
        } else {
            Logger.INSTANCE.warning("Real currency payment with same [" + orderId + "] order id is already marked!", null);
        }
    }
}
