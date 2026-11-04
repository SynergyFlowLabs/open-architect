package com.devtodev.analytics.internal.services.purchases;

import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.events.correncyPayment.SubscriptionInfo;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSubscriptionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionService.kt\ncom/devtodev/analytics/internal/services/purchases/SubscriptionService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n288#2,2:69\n*S KotlinDebug\n*F\n+ 1 SubscriptionService.kt\ncom/devtodev/analytics/internal/services/purchases/SubscriptionService\n*L\n58#1:69,2\n*E\n"})
public final class SubscriptionService implements ISubscriptionService {

    @NotNull
    private final IStateManager stateManager;

    @NotNull
    private final IRepository subscriptionRepository;

    public SubscriptionService(@NotNull IStateManager stateManager, @NotNull IRepository subscriptionRepository) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(subscriptionRepository, "subscriptionRepository");
        this.stateManager = stateManager;
        this.subscriptionRepository = subscriptionRepository;
    }

    private final SubscriptionInfo currentSubInfo() {
        Object next;
        Project activeProject = this.stateManager.getActiveProject();
        List<DbModel> all = this.subscriptionRepository.getAll(SubscriptionInfo.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.correncyPayment.SubscriptionInfo>");
        Iterator<T> it = all.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((SubscriptionInfo) next).getProjectId() != activeProject.getIdKey());
        SubscriptionInfo subscriptionInfo = (SubscriptionInfo) next;
        if (subscriptionInfo != null) {
            return subscriptionInfo;
        }
        SubscriptionInfo subscriptionInfo2 = new SubscriptionInfo(0L, activeProject.getIdKey(), false, 5, null);
        this.subscriptionRepository.insert(subscriptionInfo2);
        return subscriptionInfo2;
    }

    @Override // com.devtodev.analytics.internal.services.purchases.ISubscriptionService
    public boolean isHistoryNeedReset(@NotNull ConfigEntry config) {
        Intrinsics.checkNotNullParameter(config, "config");
        long sbsConfigVersion = this.stateManager.getActiveProject().getConfiguration().getSbsConfigVersion();
        long sbsConfigVersion2 = config.getSbsConfigVersion();
        boolean z10 = true & false;
        if (sbsConfigVersion != 0 && sbsConfigVersion2 != 0 && sbsConfigVersion != sbsConfigVersion2) {
            return true;
        }
        return false;
    }

    @Override // com.devtodev.analytics.internal.services.purchases.ISubscriptionService
    public boolean isNeedRestoreHistory() {
        return !currentSubInfo().getAlreadySendRestoreEvent();
    }

    @Override // com.devtodev.analytics.internal.services.purchases.ISubscriptionService
    public void markAsSendRestoredHistory() {
        SubscriptionInfo subscriptionInfoCurrentSubInfo = currentSubInfo();
        subscriptionInfoCurrentSubInfo.setAlreadySendRestoreEvent(true);
        this.subscriptionRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(subscriptionInfoCurrentSubInfo.getIdKey()))), subscriptionInfoCurrentSubInfo);
    }

    @Override // com.devtodev.analytics.internal.services.purchases.ISubscriptionService
    public void resetHistoryMark() {
        SubscriptionInfo subscriptionInfoCurrentSubInfo = currentSubInfo();
        subscriptionInfoCurrentSubInfo.setAlreadySendRestoreEvent(false);
        this.subscriptionRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(subscriptionInfoCurrentSubInfo.getIdKey()))), subscriptionInfoCurrentSubInfo);
    }
}
