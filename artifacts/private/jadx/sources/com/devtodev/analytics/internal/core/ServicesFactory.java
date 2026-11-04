package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.helpfultools.ABTestDefaultParamsCache;
import com.devtodev.analytics.internal.helpfultools.ABTestInitialData;
import com.devtodev.analytics.internal.managers.IAbTestManager;
import com.devtodev.analytics.internal.managers.IEventController;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.services.ConfigService;
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
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ServicesFactory implements IServicesFactory {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static ServicesFactory INSTANCE;

    @NotNull
    private final f0 abTestConfigService$delegate;

    @NotNull
    private final ABTestDefaultParamsCache abTestDefaultParamsCache;

    @NotNull
    private final ABTestInitialData abTestInitialData;

    @NotNull
    private final IAbTestManager abTestManager;

    @NotNull
    private final f0 abTestRemoteConfigService$delegate;

    @NotNull
    private final f0 activityService$delegate;

    @NotNull
    private final f0 analyticsConfigService$delegate;

    @NotNull
    private final f0 antiCheatService$delegate;

    @NotNull
    private final f0 configService$delegate;

    @NotNull
    private final ICoreFactory coreFactory;

    @NotNull
    private final f0 currencyAccrualService$delegate;

    @NotNull
    private final IEventController eventController;

    @NotNull
    private final f0 eventsService$delegate;

    @NotNull
    private final f0 initialData$delegate;

    @NotNull
    private final f0 involvedExperimentsService$delegate;

    @NotNull
    private final f0 levelResourceService$delegate;

    @NotNull
    private final f0 peopleService$delegate;

    @NotNull
    private final f0 projectService$delegate;

    @NotNull
    private final f0 purchasesService$delegate;

    @NotNull
    private final f0 reportService$delegate;

    @NotNull
    private final IStateManager stateManager;

    @NotNull
    private final f0 subscriptionService$delegate;

    @NotNull
    private final f0 suitableExperimentsService$delegate;

    @NotNull
    private final f0 taskService$delegate;

    @NotNull
    private final f0 timerService$delegate;

    @NotNull
    private final f0 userConfigService$delegate;

    @NotNull
    private final f0 userService$delegate;

    @SourceDebugExtension({"SMAP\nServicesFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServicesFactory.kt\ncom/devtodev/analytics/internal/core/ServicesFactory$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ServicesFactory getInstance(@NotNull IStateManager stateManager, @NotNull ICoreFactory coreFactory, @NotNull IAbTestManager abTestManager, @NotNull IEventController eventController, @NotNull ABTestInitialData abTestInitialData, @NotNull ABTestDefaultParamsCache abTestDefaultParamsCache) {
            Intrinsics.checkNotNullParameter(stateManager, "stateManager");
            Intrinsics.checkNotNullParameter(coreFactory, "coreFactory");
            Intrinsics.checkNotNullParameter(abTestManager, "abTestManager");
            Intrinsics.checkNotNullParameter(eventController, "eventController");
            Intrinsics.checkNotNullParameter(abTestInitialData, "abTestInitialData");
            Intrinsics.checkNotNullParameter(abTestDefaultParamsCache, "abTestDefaultParamsCache");
            ServicesFactory servicesFactory = ServicesFactory.INSTANCE;
            if (servicesFactory != null) {
                return servicesFactory;
            }
            ServicesFactory servicesFactory2 = new ServicesFactory(stateManager, coreFactory, abTestManager, eventController, abTestInitialData, abTestDefaultParamsCache, null);
            ServicesFactory.INSTANCE = servicesFactory2;
            return servicesFactory2;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ServicesFactory(IStateManager iStateManager, ICoreFactory iCoreFactory, IAbTestManager iAbTestManager, IEventController iEventController, ABTestInitialData aBTestInitialData, ABTestDefaultParamsCache aBTestDefaultParamsCache, DefaultConstructorMarker defaultConstructorMarker) {
        this(iStateManager, iCoreFactory, iAbTestManager, iEventController, aBTestInitialData, aBTestDefaultParamsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfigService getConfigService() {
        return (ConfigService) this.configService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ABTestInitialData getInitialData() {
        return (ABTestInitialData) this.initialData$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IAbTestConfigService getAbTestConfigService() {
        return (IAbTestConfigService) this.abTestConfigService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IAbTestRemoteConfigService getAbTestRemoteConfigService() {
        return (IAbTestRemoteConfigService) this.abTestRemoteConfigService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IActivityService getActivityService() {
        return (IActivityService) this.activityService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IAnalyticsConfigService getAnalyticsConfigService() {
        return (IAnalyticsConfigService) this.analyticsConfigService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IAntiCheatService getAntiCheatService() {
        return (IAntiCheatService) this.antiCheatService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public ICurrencyAccrualService getCurrencyAccrualService() {
        return (ICurrencyAccrualService) this.currencyAccrualService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IEventsService getEventsService() {
        return (IEventsService) this.eventsService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IInvolvedExperimentsService getInvolvedExperimentsService() {
        return (IInvolvedExperimentsService) this.involvedExperimentsService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public ILevelResourceService getLevelResourceService() {
        return (ILevelResourceService) this.levelResourceService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IPeopleService getPeopleService() {
        return (IPeopleService) this.peopleService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IProjectService getProjectService() {
        return (IProjectService) this.projectService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IPurchasesService getPurchasesService() {
        return (IPurchasesService) this.purchasesService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IReportService getReportService() {
        return (IReportService) this.reportService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public ISubscriptionService getSubscriptionService() {
        return (ISubscriptionService) this.subscriptionService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public ISuitableExperimentsService getSuitableExperimentsService() {
        return (ISuitableExperimentsService) this.suitableExperimentsService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public ITaskService getTaskService() {
        return (ITaskService) this.taskService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public ITimerService getTimerService() {
        return (ITimerService) this.timerService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IUserConfigService getUserConfigService() {
        return (IUserConfigService) this.userConfigService$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IServicesFactory
    @NotNull
    public IUserService getUserService() {
        return (IUserService) this.userService$delegate.getValue();
    }

    private ServicesFactory(IStateManager iStateManager, ICoreFactory iCoreFactory, IAbTestManager iAbTestManager, IEventController iEventController, ABTestInitialData aBTestInitialData, ABTestDefaultParamsCache aBTestDefaultParamsCache) {
        this.stateManager = iStateManager;
        this.coreFactory = iCoreFactory;
        this.abTestManager = iAbTestManager;
        this.eventController = iEventController;
        this.abTestInitialData = aBTestInitialData;
        this.abTestDefaultParamsCache = aBTestDefaultParamsCache;
        j0 j0Var = j0.PUBLICATION;
        this.configService$delegate = g0.b(j0Var, new ServicesFactory$configService$2(this));
        this.initialData$delegate = g0.b(j0Var, new ServicesFactory$initialData$2(this));
        this.peopleService$delegate = g0.b(j0Var, new ServicesFactory$peopleService$2(this));
        this.activityService$delegate = g0.b(j0Var, new ServicesFactory$activityService$2(this));
        this.analyticsConfigService$delegate = g0.b(j0Var, new ServicesFactory$analyticsConfigService$2(this));
        this.abTestConfigService$delegate = g0.b(j0Var, new ServicesFactory$abTestConfigService$2(this));
        this.currencyAccrualService$delegate = g0.b(j0Var, new ServicesFactory$currencyAccrualService$2(this));
        this.eventsService$delegate = g0.b(j0Var, new ServicesFactory$eventsService$2(this));
        this.levelResourceService$delegate = g0.b(j0Var, new ServicesFactory$levelResourceService$2(this));
        this.projectService$delegate = g0.b(j0Var, new ServicesFactory$projectService$2(this));
        this.userService$delegate = g0.b(j0Var, new ServicesFactory$userService$2(this));
        this.timerService$delegate = g0.b(j0Var, new ServicesFactory$timerService$2(this));
        this.reportService$delegate = g0.b(j0Var, new ServicesFactory$reportService$2(this));
        this.purchasesService$delegate = g0.b(j0Var, new ServicesFactory$purchasesService$2(this));
        this.subscriptionService$delegate = g0.b(j0Var, new ServicesFactory$subscriptionService$2(this));
        this.antiCheatService$delegate = g0.b(j0Var, new ServicesFactory$antiCheatService$2(this));
        this.abTestRemoteConfigService$delegate = g0.b(j0Var, new ServicesFactory$abTestRemoteConfigService$2(this));
        this.suitableExperimentsService$delegate = g0.b(j0Var, new ServicesFactory$suitableExperimentsService$2(this));
        this.taskService$delegate = g0.b(j0Var, new ServicesFactory$taskService$2(this));
        this.involvedExperimentsService$delegate = g0.b(j0Var, new ServicesFactory$involvedExperimentsService$2(this));
        this.userConfigService$delegate = g0.b(j0Var, new ServicesFactory$userConfigService$2(this));
    }
}
