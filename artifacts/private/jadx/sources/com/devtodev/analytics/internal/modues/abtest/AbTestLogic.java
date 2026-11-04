package com.devtodev.analytics.internal.modues.abtest;

import com.devtodev.analytics.external.abtest.DTDRemoteConfigChangeResult;
import com.devtodev.analytics.external.abtest.DTDRemoteConfigListener;
import com.devtodev.analytics.external.abtest.DTDRemoteConfigReceiveResult;
import com.devtodev.analytics.internal.backend.repository.InvolvedExperiment;
import com.devtodev.analytics.internal.backend.repository.RemoteConfig;
import com.devtodev.analytics.internal.backend.repository.UserData;
import com.devtodev.analytics.internal.backend.repository.UserProperties;
import com.devtodev.analytics.internal.core.IServicesFactory;
import com.devtodev.analytics.internal.domain.EventObject;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import com.devtodev.analytics.internal.domain.events.abTests.AudienceLocalData;
import com.devtodev.analytics.internal.domain.events.abTests.ExperimentMarker;
import com.devtodev.analytics.internal.domain.events.abTests.SuitableExperiments;
import com.devtodev.analytics.internal.domain.events.people.People;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IEventController;
import com.devtodev.analytics.internal.queue.QueueManager;
import com.devtodev.analytics.internal.services.IAbTestConfigService;
import com.devtodev.analytics.internal.services.IPeopleService;
import com.devtodev.analytics.internal.services.IProjectService;
import com.devtodev.analytics.internal.services.IReportService;
import com.devtodev.analytics.internal.services.IUserService;
import com.devtodev.analytics.internal.services.abtests.IAbTestRemoteConfigService;
import com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService;
import com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService;
import com.devtodev.analytics.internal.services.abtests.ITaskService;
import com.devtodev.analytics.internal.services.abtests.IUserConfigService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAbTestLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbTestLogic.kt\ncom/devtodev/analytics/internal/modues/abtest/AbTestLogic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,483:1\n1#2:484\n*E\n"})
public final class AbTestLogic implements IAbTestLogic {

    @NotNull
    private final IAbTestConfigService abTestConfigService;

    @NotNull
    private final IEventController eventController;

    @NotNull
    private final IInvolvedExperimentsService involvedExpService;
    private boolean isABLogicStopped;
    private boolean isApplicationForeground;

    @NotNull
    private final IPeopleService peopleService;

    @NotNull
    private final IProjectService projectService;

    @Nullable
    private DTDRemoteConfigListener remoteConfigListener;

    @NotNull
    private final IAbTestRemoteConfigService remoteConfigService;

    @NotNull
    private final IReportService reportService;

    @NotNull
    private final ISuitableExperimentsService suitableExpService;

    @NotNull
    private final ITaskService taskService;

    @NotNull
    private final IUserConfigService userConfigService;

    @NotNull
    private final IUserService userService;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$configActualization$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AbTestLogic.this.isABLogicStopped = true;
            DTDRemoteConfigListener dTDRemoteConfigListener = AbTestLogic.this.remoteConfigListener;
            if (dTDRemoteConfigListener != null) {
                dTDRemoteConfigListener.onReceived(DTDRemoteConfigReceiveResult.Failure);
            }
            Logger.debug$default(Logger.INSTANCE, "[A/B-Test Module] ABTestLogic is stopped, because a config timer is expired", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$offerCallBacks$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25461 extends l0 implements Function2<List<? extends InvolvedExperiment>, SuitableExperiments, Unit> {

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$offerCallBacks$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C08851 extends l0 implements Function0<Unit> {
            final /* synthetic */ List<InvolvedExperiment> $involvedExp;
            final /* synthetic */ SuitableExperiments $suitableExp;
            final /* synthetic */ AbTestLogic this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08851(List<InvolvedExperiment> list, AbTestLogic abTestLogic, SuitableExperiments suitableExperiments) {
                super(0);
                this.$involvedExp = list;
                this.this$0 = abTestLogic;
                this.$suitableExp = suitableExperiments;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.$involvedExp.isEmpty()) {
                    Exception exc = new Exception("[A/B-Test Module] Server refused to conduct the experiment");
                    DTDRemoteConfigListener dTDRemoteConfigListener = this.this$0.remoteConfigListener;
                    if (dTDRemoteConfigListener != null) {
                        dTDRemoteConfigListener.onChanged(DTDRemoteConfigChangeResult.Failure, exc);
                    }
                    this.this$0.taskService.getActivationTask().stopTask();
                    this.this$0.remoteConfigService.markAsRefused(this.$suitableExp.getSuitableExperiments());
                    this.this$0.restartSearchExperiment();
                    Logger.error$default(Logger.INSTANCE, "[A/B-Test Module] Suitable experiments [" + this.$suitableExp.getSuitableExperiments() + "] marked as refused", null, 2, null);
                    return;
                }
                if (this.this$0.taskService.getActivationTask().isTimeoutValid()) {
                    InvolvedExperiment involvedExperiment = (InvolvedExperiment) CollectionsKt.firstOrNull((List) this.$involvedExp);
                    if (involvedExperiment != null) {
                        AbTestLogic abTestLogic = this.this$0;
                        ExperimentMarker experimentMarker = new ExperimentMarker(involvedExperiment.getId(), involvedExperiment.getGroup());
                        Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] Offer accept experiment id:[" + involvedExperiment.getId() + "] group:[" + involvedExperiment.getGroup() + "]", null, 2, null);
                        abTestLogic.involvedExpService.cacheExperimentMarker(experimentMarker);
                        abTestLogic.tryIntersectionParameters(experimentMarker);
                        return;
                    }
                    return;
                }
                if (this.this$0.isApplicationForeground) {
                    Exception exc2 = new Exception("[A/B-Test Module] Offer from devtodev not received within the allotted " + this.this$0.taskService.getActivationTask().getHoldUpTime() + " seconds");
                    DTDRemoteConfigListener dTDRemoteConfigListener2 = this.this$0.remoteConfigListener;
                    if (dTDRemoteConfigListener2 != null) {
                        dTDRemoteConfigListener2.onChanged(DTDRemoteConfigChangeResult.Failure, exc2);
                    }
                    this.this$0.suitableExpService.markAsProcessed(this.$suitableExp.getSuitableExperiments());
                    Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] Suitable experiments [" + this.$suitableExp.getSuitableExperiments() + "] marked as refused", null, 2, null);
                    this.this$0.restartSearchExperiment();
                }
            }
        }

        public C25461() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends InvolvedExperiment> list, SuitableExperiments suitableExperiments) {
            invoke2((List<InvolvedExperiment>) list, suitableExperiments);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<InvolvedExperiment> involvedExp, @NotNull SuitableExperiments suitableExp) {
            Intrinsics.checkNotNullParameter(involvedExp, "involvedExp");
            Intrinsics.checkNotNullParameter(suitableExp, "suitableExp");
            QueueManager.Companion.runIncoming(new C08851(involvedExp, AbTestLogic.this, suitableExp));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$offerCallBacks$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$offerCallBacks$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
            final /* synthetic */ AbTestLogic this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbTestLogic abTestLogic) {
                super(0);
                this.this$0 = abTestLogic;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List<Long> suitableExperiments = this.this$0.suitableExpService.getSuitableExperiments();
                if (suitableExperiments.isEmpty()) {
                    return;
                }
                if (this.this$0.taskService.getActivationTask().isTimeoutValid()) {
                    this.this$0.abTestConfigService.receiveAbBackendOffers();
                    return;
                }
                if (this.this$0.isApplicationForeground) {
                    Exception exc = new Exception("[A/B-Test Module] Offer from devtodev not received within the allotted " + this.this$0.taskService.getActivationTask().getHoldUpTime() + " seconds");
                    DTDRemoteConfigListener dTDRemoteConfigListener = this.this$0.remoteConfigListener;
                    if (dTDRemoteConfigListener != null) {
                        dTDRemoteConfigListener.onChanged(DTDRemoteConfigChangeResult.Failure, exc);
                    }
                    this.this$0.suitableExpService.markAsProcessed(suitableExperiments);
                    Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] Suitable experiments [" + suitableExperiments + "] marked as refused", null, 2, null);
                    this.this$0.restartSearchExperiment();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2() {
            super(0);
            int i10 = 7 >> 0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            QueueManager.Companion.runIncoming(new AnonymousClass1(AbTestLogic.this));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$offerCallBacks$3, reason: invalid class name */
    public static final class AnonymousClass3 extends l0 implements Function1<Exception, Unit> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
            invoke2(exc);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (AbTestLogic.this.involvedExpService.tryLoadExperimentMarker() == null) {
                Logger.INSTANCE.error("", it);
                DTDRemoteConfigListener dTDRemoteConfigListener = AbTestLogic.this.remoteConfigListener;
                if (dTDRemoteConfigListener != null) {
                    dTDRemoteConfigListener.onChanged(DTDRemoteConfigChangeResult.Failure, it);
                }
                AbTestLogic.this.restartSearchExperiment();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$prepareBackendCallBacks$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25471 extends l0 implements Function1<RemoteConfig, Unit> {

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$prepareBackendCallBacks$1$1, reason: invalid class name and collision with other inner class name */
        @SourceDebugExtension({"SMAP\nAbTestLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbTestLogic.kt\ncom/devtodev/analytics/internal/modues/abtest/AbTestLogic$prepareBackendCallBacks$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,483:1\n1#2:484\n*E\n"})
        public static final class C08861 extends l0 implements Function0<Unit> {
            final /* synthetic */ RemoteConfig $config;
            final /* synthetic */ AbTestLogic this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08861(AbTestLogic abTestLogic, RemoteConfig remoteConfig) {
                super(0);
                this.this$0 = abTestLogic;
                this.$config = remoteConfig;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX WARN: Code duplicated, block: B:22:0x007b  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object next;
                this.this$0.configReceivedNotification(this.$config.getAbExperiments().isEmpty() && !this.this$0.suitableExpService.hasActiveExperiments());
                this.this$0.taskService.getConfigTask().stopTask();
                Long abTestsProjectVersion = this.this$0.remoteConfigService.getAbTestsProjectVersion();
                Iterator<T> it = this.$config.getAbExperiments().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((AbTestsExperiment) next).isTesting());
                boolean z10 = next != null;
                if (abTestsProjectVersion != null) {
                    if (abTestsProjectVersion.longValue() != this.$config.getVersion() || z10) {
                        this.this$0.remoteConfigService.applyRemoteConfig(this.$config);
                        this.this$0.remoteConfigService.applyExperiments(this.$config.getAbExperiments());
                    }
                } else {
                    this.this$0.remoteConfigService.applyRemoteConfig(this.$config);
                    this.this$0.remoteConfigService.applyExperiments(this.$config.getAbExperiments());
                }
                this.this$0.remoteConfigService.createExperimentState();
                this.this$0.updateAudienceState(null);
                if (this.this$0.involvedExpService.tryLoadExperimentMarker() == null) {
                    this.this$0.searchSuitableExperiment(null);
                }
            }
        }

        public C25471() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RemoteConfig remoteConfig) {
            invoke2(remoteConfig);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull RemoteConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            QueueManager.Companion.runIncoming(new C08861(AbTestLogic.this, config));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$prepareBackendCallBacks$2, reason: invalid class name and case insensitive filesystem */
    public static final class C25482 extends l0 implements Function1<UserData, Unit> {
        public C25482() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserData userData) {
            invoke2(userData);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull UserData userData) {
            Intrinsics.checkNotNullParameter(userData, "userData");
            if (userData.getFirstVersion() == null) {
                userData.setFirstVersion(AbTestLogic.this.projectService.getAppData().getAppVersion());
            }
            AbTestLogic.this.updateAudienceState(userData);
            if (AbTestLogic.this.involvedExpService.tryLoadExperimentMarker() == null) {
                AbTestLogic.this.searchSuitableExperiment(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$restartSearchExperiment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25491 extends l0 implements Function1<EventObject, Unit> {
        public C25491() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EventObject eventObject) {
            invoke2(eventObject);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull EventObject eventObject) {
            Intrinsics.checkNotNullParameter(eventObject, "eventObject");
            AbTestLogic.this.searchSuitableExperiment(eventObject);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$searchSuitableExperiment$2, reason: invalid class name and case insensitive filesystem */
    public static final class C25502 extends l0 implements Function0<Unit> {
        public C25502() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ExperimentMarker experimentMarkerTryLoadExperimentMarker = AbTestLogic.this.involvedExpService.tryLoadExperimentMarker();
            if (experimentMarkerTryLoadExperimentMarker != null) {
                AbTestLogic.this.suitableExpService.markAsProcessed(CollectionsKt.listOf(Long.valueOf(experimentMarkerTryLoadExperimentMarker.getIdKey())));
                Logger.warning$default(Logger.INSTANCE, "[A/B-Test Module] Involved experiment [" + experimentMarkerTryLoadExperimentMarker.getIdKey() + "] was cancelled.\n\tReason: time is over", null, 2, null);
            }
            AbTestLogic.this.restartSearchExperiment();
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$servicesCallBacks$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25511 extends l0 implements Function0<Unit> {
        public C25511() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AbTestLogic.this.updateAudienceState(null);
            AbTestLogic.this.searchSuitableExperiment(null);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$servicesCallBacks$2, reason: invalid class name and case insensitive filesystem */
    public static final class C25522 extends l0 implements Function1<List<? extends Long>, Unit> {
        public C25522() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Long> list) {
            invoke2((List<Long>) list);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<Long> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbTestLogic.this.remoteConfigService.deleteInactiveExperimentsState(it);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$servicesCallBacks$3, reason: invalid class name and case insensitive filesystem */
    public static final class C25533 extends l0 implements Function0<Unit> {
        public C25533() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AbTestLogic.this.updateAudienceState(null);
            AbTestLogic.this.searchSuitableExperiment(null);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$servicesCallBacks$4, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nAbTestLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbTestLogic.kt\ncom/devtodev/analytics/internal/modues/abtest/AbTestLogic$servicesCallBacks$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,483:1\n1#2:484\n*E\n"})
    public static final class AnonymousClass4 extends l0 implements Function1<User, Unit> {
        public AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            invoke2(user);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull User prevUser) {
            Intrinsics.checkNotNullParameter(prevUser, "prevUser");
            if (AbTestLogic.this.remoteConfigListener != null && AbTestLogic.this.projectService.isUserCounting() && AbTestLogic.this.remoteConfigListener != null) {
                AbTestLogic.this.changeUser(prevUser);
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$startActivity$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25541 extends l0 implements Function1<EventObject, Unit> {
        public C25541() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EventObject eventObject) {
            invoke2(eventObject);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull EventObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbTestLogic.this.searchSuitableExperiment(it);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$startSearchExperiment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25551 extends l0 implements Function1<EventObject, Unit> {
        public C25551() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EventObject eventObject) {
            invoke2(eventObject);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull EventObject eventObject) {
            Intrinsics.checkNotNullParameter(eventObject, "eventObject");
            AbTestLogic.this.searchSuitableExperiment(eventObject);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogic$tryActivateExperiment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25561 extends l0 implements Function0<Unit> {
        public C25561() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ExperimentMarker experimentMarkerTryLoadExperimentMarker = AbTestLogic.this.involvedExpService.tryLoadExperimentMarker();
            if (experimentMarkerTryLoadExperimentMarker != null) {
                Logger.error$default(Logger.INSTANCE, "[A/B-Test Module] Involved experiment [" + experimentMarkerTryLoadExperimentMarker.getIdKey() + "] was cancelled.\n\tReason: time is over", null, 2, null);
                AbTestLogic.this.suitableExpService.markAsProcessed(CollectionsKt.listOf(Long.valueOf(experimentMarkerTryLoadExperimentMarker.getIdKey())));
            } else {
                Logger.error$default(Logger.INSTANCE, "[A/B-Test Module] Init activation task error: involved experiment is loose", null, 2, null);
            }
            AbTestLogic.this.restartSearchExperiment();
        }
    }

    public AbTestLogic(@NotNull IServicesFactory servicesFactory, @NotNull IEventController eventController, @Nullable DTDRemoteConfigListener dTDRemoteConfigListener) {
        Intrinsics.checkNotNullParameter(servicesFactory, "servicesFactory");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        this.eventController = eventController;
        this.abTestConfigService = servicesFactory.getAbTestConfigService();
        this.remoteConfigService = servicesFactory.getAbTestRemoteConfigService();
        this.involvedExpService = servicesFactory.getInvolvedExperimentsService();
        this.suitableExpService = servicesFactory.getSuitableExperimentsService();
        this.userConfigService = servicesFactory.getUserConfigService();
        this.taskService = servicesFactory.getTaskService();
        this.reportService = servicesFactory.getReportService();
        this.userService = servicesFactory.getUserService();
        this.projectService = servicesFactory.getProjectService();
        this.peopleService = servicesFactory.getPeopleService();
        this.remoteConfigListener = dTDRemoteConfigListener;
        this.isApplicationForeground = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeUser(User user) {
        this.taskService.getActivationTask().stopTask();
        this.isABLogicStopped = false;
        this.suitableExpService.removeAudienceCheckMarks();
        this.eventController.setExperimentMarker(null);
        this.eventController.setEventProvider(null);
        this.involvedExpService.cacheExperimentMarker(null);
        this.suitableExpService.clearTemporaryProcessedExperiments();
        this.involvedExpService.stopActiveExperiment();
        this.remoteConfigService.createExperimentState();
        this.suitableExpService.resetAudienceState();
        configActualization();
        ExperimentMarker experimentMarkerTryLoadExperimentMarker = this.involvedExpService.tryLoadExperimentMarker();
        if (experimentMarkerTryLoadExperimentMarker != null) {
            tryActivateExperiment(experimentMarkerTryLoadExperimentMarker);
            return;
        }
        if (!this.involvedExpService.isUserHasInvolvedGroup(user)) {
            startSearchExperiment();
            return;
        }
        this.userConfigService.clearRemoteConfigParameters();
        DTDRemoteConfigListener dTDRemoteConfigListener = this.remoteConfigListener;
        if (dTDRemoteConfigListener != null) {
            dTDRemoteConfigListener.onPrepareToChange();
        }
        DTDRemoteConfigListener dTDRemoteConfigListener2 = this.remoteConfigListener;
        if (dTDRemoteConfigListener2 != null) {
            DTDRemoteConfigListener.DefaultImpls.onChanged$default(dTDRemoteConfigListener2, DTDRemoteConfigChangeResult.Success, null, 2, null);
        }
        startSearchExperiment();
    }

    private final boolean checkConfigTaskValid() {
        if (!this.taskService.getConfigTask().isTimeoutValid() && this.taskService.getConfigTask().getHoldUpTime() != 0.0d) {
            return false;
        }
        return true;
    }

    private final void configActualization() {
        this.remoteConfigService.deleteExpiredExperiments();
        updateAudienceState(null);
        this.abTestConfigService.receiveABConfig();
        if (!this.taskService.getConfigTask().isTimeoutValid() && this.taskService.getConfigTask().getHoldUpTime() > 0.0d) {
            this.taskService.getConfigTask().launchTask(new AnonymousClass1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configReceivedNotification(boolean z10) {
        if (this.involvedExpService.tryLoadExperimentMarker() == null && checkConfigTaskValid()) {
            this.taskService.getConfigTask().stopTask();
            DTDRemoteConfigListener dTDRemoteConfigListener = this.remoteConfigListener;
            if (dTDRemoteConfigListener != null) {
                dTDRemoteConfigListener.onReceived(z10 ? DTDRemoteConfigReceiveResult.Empty : DTDRemoteConfigReceiveResult.Success);
            }
        }
    }

    private final void offerCallBacks() {
        this.abTestConfigService.setOfferUpdate(new C25461());
        this.abTestConfigService.setOfferNoConnection(new AnonymousClass2());
        this.abTestConfigService.setOfferUserChanged(new AnonymousClass3());
    }

    private final void prepareBackendCallBacks() {
        this.abTestConfigService.setConfigUpdate(new C25471());
        this.abTestConfigService.setOnBackendUserDataUpdate(new C25482());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartSearchExperiment() {
        this.userConfigService.clearRemoteConfigParameters();
        this.involvedExpService.clearExperimentMarker();
        this.eventController.setEventProvider(new C25491());
        startReportSending();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchSuitableExperiment(EventObject eventObject) {
        if (this.isABLogicStopped || this.involvedExpService.isMarkedExperimentFound()) {
            return;
        }
        List<Long> listSearchSuitableExperiments = this.suitableExpService.searchSuitableExperiments(eventObject);
        if (this.eventController.isReportSendingEnable() && !listSearchSuitableExperiments.isEmpty()) {
            Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] Suitable experiment is found!", null, 2, null);
            if (eventObject != null) {
                this.eventController.freezeEvent(eventObject);
            }
            this.reportService.sendBufferedEvents();
            this.eventController.stopReportSending();
            this.eventController.setEventProvider(null);
            this.suitableExpService.addSuitableExperiments(listSearchSuitableExperiments);
            if (this.taskService.getConfigTask().isTimeoutValid()) {
                this.taskService.getConfigTask().stopTask();
                DTDRemoteConfigListener dTDRemoteConfigListener = this.remoteConfigListener;
                if (dTDRemoteConfigListener != null) {
                    dTDRemoteConfigListener.onReceived(DTDRemoteConfigReceiveResult.Success);
                }
            }
            DTDRemoteConfigListener dTDRemoteConfigListener2 = this.remoteConfigListener;
            if (dTDRemoteConfigListener2 != null) {
                dTDRemoteConfigListener2.onPrepareToChange();
            }
            this.taskService.getActivationTask().launchTask(new C25502());
            this.abTestConfigService.receiveAbBackendOffers();
        }
    }

    private final void servicesCallBacks() {
        this.userService.setLevelIsChanged(new C25511());
        this.userService.setUsersIdsForDelete(new C25522());
        this.peopleService.setPeopleCardIsChanged(new C25533());
        this.userService.setUserIsChanged(new AnonymousClass4());
    }

    private final void startReportSending() {
        this.eventController.clearFreezedEvent();
        this.eventController.startReportSending();
        this.reportService.sendBufferedEvents();
    }

    private final void startSearchExperiment() {
        searchSuitableExperiment(null);
        this.eventController.setEventProvider(new C25551());
    }

    private final void stopAndRestart(List<Long> list) {
        this.taskService.getActivationTask().stopTask();
        this.suitableExpService.markAsProcessed(list);
        this.eventController.setExperimentMarker(null);
        restartSearchExperiment();
    }

    private final void tryActivateExperiment(ExperimentMarker experimentMarker) {
        this.eventController.stopReportSending();
        this.taskService.getConfigTask().stopTask();
        this.taskService.getActivationTask().launchTask(new C25561());
        DTDRemoteConfigListener dTDRemoteConfigListener = this.remoteConfigListener;
        if (dTDRemoteConfigListener != null) {
            dTDRemoteConfigListener.onReceived(DTDRemoteConfigReceiveResult.Success);
        }
        DTDRemoteConfigListener dTDRemoteConfigListener2 = this.remoteConfigListener;
        if (dTDRemoteConfigListener2 != null) {
            dTDRemoteConfigListener2.onPrepareToChange();
        }
        tryIntersectionParameters(experimentMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryIntersectionParameters(ExperimentMarker experimentMarker) {
        if (this.userConfigService.toRemoteConfigParameters(experimentMarker)) {
            DTDRemoteConfigListener dTDRemoteConfigListener = this.remoteConfigListener;
            if (dTDRemoteConfigListener != null) {
                DTDRemoteConfigListener.DefaultImpls.onChanged$default(dTDRemoteConfigListener, DTDRemoteConfigChangeResult.Success, null, 2, null);
            }
        } else {
            Exception exc = new Exception("[A/B-Test Module] Involved experiment [" + experimentMarker.getIdKey() + "] was cancelled.\n\tReason: remote configuration intersection error");
            stopAndRestart(CollectionsKt.listOf(Long.valueOf(experimentMarker.getIdKey())));
            DTDRemoteConfigListener dTDRemoteConfigListener2 = this.remoteConfigListener;
            if (dTDRemoteConfigListener2 != null) {
                dTDRemoteConfigListener2.onChanged(DTDRemoteConfigChangeResult.Failure, exc);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAudienceState(UserData userData) {
        if (this.isABLogicStopped) {
            return;
        }
        People people = new People(this.userService.getUserLevel(), 0L, this.peopleService.getParameters(true), null);
        double screenInches = this.projectService.getDeviceResolution().getScreenInches();
        String language = this.projectService.getDeviceConstants().getLanguage();
        UserProperties userProperties = this.remoteConfigService.getUserProperties();
        AudienceLocalData audienceLocalData = new AudienceLocalData(screenInches, userProperties != null ? userProperties.getCountry() : null, language, null, this.userService.getUserLevel(), 8, null);
        this.suitableExpService.removeAudienceCheckMarks();
        this.suitableExpService.updateActiveAudienceState(audienceLocalData, people, userData);
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestLogic
    @NotNull
    public Map<String, Object> getConfig() {
        return this.userConfigService.getUserConfig();
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestLogic
    public void prepareCallbacks() {
        this.userService.turnOnIdsRequest();
        prepareBackendCallBacks();
        offerCallBacks();
        servicesCallBacks();
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestLogic
    public void resetConfig() {
        ExperimentMarker experimentMarkerTryLoadExperimentMarker = this.involvedExpService.tryLoadExperimentMarker();
        List<Long> suitableExperiments = this.suitableExpService.getSuitableExperiments();
        if (experimentMarkerTryLoadExperimentMarker != null) {
            stopAndRestart(CollectionsKt.listOf(Long.valueOf(experimentMarkerTryLoadExperimentMarker.getIdKey())));
            Logger.warning$default(Logger.INSTANCE, "[A/B-Test Module] Involved experiment [" + experimentMarkerTryLoadExperimentMarker.getIdKey() + "] canceled!", null, 2, null);
            return;
        }
        if (suitableExperiments.isEmpty()) {
            Logger.warning$default(Logger.INSTANCE, "[A/B-Test Module] Unable to reset configuration, no suitable experiment found", null, 2, null);
            return;
        }
        stopAndRestart(suitableExperiments);
        Logger.warning$default(Logger.INSTANCE, "[A/B-Test Module] Offer request aborted, suitable experiments [" + suitableExperiments + "] canceled!", null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestLogic
    public void startAbTestLogic() {
        configActualization();
        ExperimentMarker experimentMarkerTryLoadExperimentMarker = this.involvedExpService.tryLoadExperimentMarker();
        if (experimentMarkerTryLoadExperimentMarker == null) {
            startSearchExperiment();
            return;
        }
        long idKey = experimentMarkerTryLoadExperimentMarker.getIdKey();
        boolean zIsNeedCacheTestingExperiment = this.involvedExpService.isNeedCacheTestingExperiment();
        if (!this.involvedExpService.isExperimentTesting(idKey) || zIsNeedCacheTestingExperiment) {
            tryActivateExperiment(experimentMarkerTryLoadExperimentMarker);
            return;
        }
        this.remoteConfigService.markAsRefused(CollectionsKt.listOf(Long.valueOf(idKey)));
        this.involvedExpService.clearExperimentMarker();
        startSearchExperiment();
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestLogic
    public void startActivity() {
        this.isApplicationForeground = true;
        if (!this.involvedExpService.isMarkedExperimentFound() && this.eventController.getEventProvider() == null) {
            this.eventController.setEventProvider(new C25541());
        }
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestLogic
    public void stopActivity() {
        DTDRemoteConfigListener dTDRemoteConfigListener;
        this.isApplicationForeground = false;
        if (this.taskService.getActivationTask().isTimeoutValid()) {
            this.taskService.getActivationTask().stopTask();
            startReportSending();
            this.userConfigService.clearRemoteConfigParameters();
            ISuitableExperimentsService iSuitableExperimentsService = this.suitableExpService;
            iSuitableExperimentsService.markAsProcessed(iSuitableExperimentsService.getSuitableExperiments());
            if (this.involvedExpService.getCacheExperimentMarker() == null && (dTDRemoteConfigListener = this.remoteConfigListener) != null) {
                dTDRemoteConfigListener.onChanged(DTDRemoteConfigChangeResult.Failure, new Exception("[A/B-Test Module] Offer refused, because application enter background"));
            }
            this.involvedExpService.clearExperimentMarker();
        }
        this.eventController.setEventProvider(null);
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestLogic
    public void tryStartInvolvedExperiment() {
        if (this.involvedExpService.getCacheExperimentMarker() == null) {
            Logger.warning$default(Logger.INSTANCE, "[A/B-Test Module] Current user is not involved into the experiment", null, 2, null);
            return;
        }
        if (this.involvedExpService.isActiveExperimentStarted()) {
            Logger.warning$default(Logger.INSTANCE, "[A/B-Test Module] Involved experiment is already active", null, 2, null);
            return;
        }
        this.taskService.getActivationTask().stopTask();
        this.involvedExpService.startActiveExperiment();
        this.involvedExpService.activateExperimentMarker();
        this.eventController.setExperimentMarker(this.involvedExpService.tryLoadExperimentMarker());
        this.eventController.setEventProvider(null);
        startReportSending();
    }
}
