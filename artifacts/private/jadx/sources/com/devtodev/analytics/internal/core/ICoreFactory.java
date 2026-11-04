package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.backend.IBackend;
import com.devtodev.analytics.internal.lifecycle.ILifecycleRepository;
import com.devtodev.analytics.internal.platform.IPlatform;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.IResourceRepository;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface ICoreFactory {
    @NotNull
    IRepository getAbTestExperimentsRepository();

    @NotNull
    IRepository getAbTestExperimentsStateRepository();

    @NotNull
    IRepository getAbTestRepository();

    @NotNull
    IRepository getAutoPurchasesRepository();

    @NotNull
    IBackend getBackend();

    @NotNull
    IResourceRepository getCurrencyAccrualResourcesRepository();

    @NotNull
    IRepository getDevToDevUuidRepository();

    @NotNull
    IRepository getEventRepository();

    @NotNull
    IRepository getIdentifiersRepository();

    @NotNull
    IResourceRepository getLevelResourceRepository();

    @NotNull
    ILifecycleRepository getLifeCycle();

    @NotNull
    IRepository getMessagingCategoryRepository();

    @NotNull
    IRepository getPaymentMarkRepository();

    @NotNull
    IRepository getPeopleCardRepository();

    @NotNull
    IPlatform getPlatform();

    @NotNull
    IRepository getProjectRepository();

    @NotNull
    IRepository getReportRepository();

    @NotNull
    IRepository getSubscriptionRepository();

    @NotNull
    IRepository getToolsRepository();

    @NotNull
    IRepository getTutorialMarkRepository();

    @NotNull
    IRepository getUserStorage();
}
