package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.services.IAbTestConfigService;
import com.devtodev.analytics.internal.services.IActivityService;
import com.devtodev.analytics.internal.services.IAnalyticsConfigService;
import com.devtodev.analytics.internal.services.IAntiCheatService;
import com.devtodev.analytics.internal.services.ICurrencyAccrualService;
import com.devtodev.analytics.internal.services.IEventsService;
import com.devtodev.analytics.internal.services.ILevelResourceService;
import com.devtodev.analytics.internal.services.IPeopleService;
import com.devtodev.analytics.internal.services.IProjectService;
import com.devtodev.analytics.internal.services.IReportService;
import com.devtodev.analytics.internal.services.ITimerService;
import com.devtodev.analytics.internal.services.IUserService;
import com.devtodev.analytics.internal.services.abtests.IAbTestRemoteConfigService;
import com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService;
import com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService;
import com.devtodev.analytics.internal.services.abtests.ITaskService;
import com.devtodev.analytics.internal.services.abtests.IUserConfigService;
import com.devtodev.analytics.internal.services.purchases.IPurchasesService;
import com.devtodev.analytics.internal.services.purchases.ISubscriptionService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IServicesFactory {
    @NotNull
    IAbTestConfigService getAbTestConfigService();

    @NotNull
    IAbTestRemoteConfigService getAbTestRemoteConfigService();

    @NotNull
    IActivityService getActivityService();

    @NotNull
    IAnalyticsConfigService getAnalyticsConfigService();

    @NotNull
    IAntiCheatService getAntiCheatService();

    @NotNull
    ICurrencyAccrualService getCurrencyAccrualService();

    @NotNull
    IEventsService getEventsService();

    @NotNull
    IInvolvedExperimentsService getInvolvedExperimentsService();

    @NotNull
    ILevelResourceService getLevelResourceService();

    @NotNull
    IPeopleService getPeopleService();

    @NotNull
    IProjectService getProjectService();

    @NotNull
    IPurchasesService getPurchasesService();

    @NotNull
    IReportService getReportService();

    @NotNull
    ISubscriptionService getSubscriptionService();

    @NotNull
    ISuitableExperimentsService getSuitableExperimentsService();

    @NotNull
    ITaskService getTaskService();

    @NotNull
    ITimerService getTimerService();

    @NotNull
    IUserConfigService getUserConfigService();

    @NotNull
    IUserService getUserService();
}
