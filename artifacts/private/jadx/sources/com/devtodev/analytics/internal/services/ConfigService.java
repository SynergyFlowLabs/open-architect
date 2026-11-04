package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.backend.BackendConfig;
import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.backend.IBackend;
import com.devtodev.analytics.internal.backend.Identifiers;
import com.devtodev.analytics.internal.backend.Versions;
import com.devtodev.analytics.internal.backend.repository.AbTestOffer;
import com.devtodev.analytics.internal.backend.repository.BackendUserData;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataError;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataErrorWithResponse;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataJsonError;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataNoConnection;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataRetry;
import com.devtodev.analytics.internal.backend.repository.DoNotRetryBackendUserData;
import com.devtodev.analytics.internal.backend.repository.InvolvedExperiment;
import com.devtodev.analytics.internal.backend.repository.InvolvedExperiments;
import com.devtodev.analytics.internal.backend.repository.RemoteConfig;
import com.devtodev.analytics.internal.backend.repository.RemoteConfigSealedClass;
import com.devtodev.analytics.internal.backend.repository.SummaryBackendData;
import com.devtodev.analytics.internal.backend.repository.UserData;
import com.devtodev.analytics.internal.backend.repository.UserIdentifications;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.abTests.SuitableExperiments;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IAbTestManager;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.queue.QueueManager;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nConfigService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigService.kt\ncom/devtodev/analytics/internal/services/ConfigService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
public final class ConfigService implements IAnalyticsConfigService, IAbTestConfigService {
    private boolean abConfigRequestInProcess;

    @NotNull
    private final IAbTestManager abTestManager;

    @NotNull
    private final IBackend backend;
    private boolean backendIDsRequestInProcess;
    private long backendIdentifiersAttempt;

    @Nullable
    private Function1<? super RemoteConfig, Unit> configUpdate;

    @Nullable
    private Function0<Unit> offerNoConnection;

    @Nullable
    private Function2<? super List<InvolvedExperiment>, ? super SuitableExperiments, Unit> offerUpdate;

    @Nullable
    private Function1<? super Exception, Unit> offerUserChanged;

    @Nullable
    private Function1<? super UserData, Unit> onBackendUserDataUpdate;

    @Nullable
    private Function1<? super Long, Unit> onIdentifiersUpdate;

    @Nullable
    private Function1<? super ConfigEntry, Unit> onSdkConfigUpdate;
    private long remoteConfigAttempt;

    @Nullable
    private TimerTask retryTimer;
    private long sdkConfigAttempt;

    @NotNull
    private final IStateManager stateManager;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$getABConfig$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$getABConfig$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C08891 extends l0 implements Function0<Unit> {
            final /* synthetic */ ConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08891(ConfigService configService) {
                super(0);
                this.this$0 = configService;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.receiveABConfig();
            }
        }

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
            QueueManager.Companion.runIncoming(new C08891(ConfigService.this));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$getBackendIdentifiers$1, reason: invalid class name and case insensitive filesystem */
    public static final class C26031 extends l0 implements Function0<Unit> {
        final /* synthetic */ BackendUserData $backendUserData;
        final /* synthetic */ long $lastRequestIdKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26031(long j10, BackendUserData backendUserData) {
            super(0);
            this.$lastRequestIdKey = j10;
            this.$backendUserData = backendUserData;
            int i10 = 6 ^ 0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConfigService.this.backendIDsRequestInProcess = false;
            if (!ConfigService.this.stateManager.getActiveProject().getTrackingAvailable()) {
                Logger.info$default(Logger.INSTANCE, "BackendIdentifiers: The query result was not applied. Tracking is Disabled", null, 2, null);
                return;
            }
            User activeUser = ConfigService.this.stateManager.getActiveUser();
            if (activeUser.getIdKey() != this.$lastRequestIdKey) {
                Logger.debug$default(Logger.INSTANCE, "In the process of receiving backend identifiers from the server, the user was changed. Request the identifiers again.", null, 2, null);
                ConfigService.this.receiveUserBackendIds();
                return;
            }
            Identifiers allIdentifiers = ConfigService.this.stateManager.getAllIdentifiers(activeUser);
            UserIdentifications userIdentifications = ((SummaryBackendData) this.$backendUserData).getUserIdentifications();
            if (!allIdentifiers.isValid() && Intrinsics.areEqual(allIdentifiers.getDevtodevId(), userIdentifications.getDevtodevId())) {
                Logger.warning$default(Logger.INSTANCE, "Once tracking is disabled, the devtodevID is invalid until changed!", null, 2, null);
                return;
            }
            ConfigService.this.stateManager.changeValidStateOfDeviceIdentifiers(true);
            ConfigService.this.stateManager.updateDeviceIdentifiers(userIdentifications.getDevtodevId(), userIdentifications.getCrossPlatformDevtodevId(), userIdentifications.getDevtodevIdTimestamp());
            Logger logger = Logger.INSTANCE;
            Logger.info$default(logger, "For [" + activeUser.getUserId() + "] user the updated backendIdentifiers are:\n" + userIdentifications, null, 2, null);
            Function1<Long, Unit> onIdentifiersUpdate = ConfigService.this.getOnIdentifiersUpdate();
            if (onIdentifiersUpdate != null) {
                onIdentifiersUpdate.invoke(userIdentifications.getDevtodevId());
            }
            Logger.info$default(logger, "For [" + activeUser.getUserId() + "] user the updated backendUserInfo are:\n" + ((SummaryBackendData) this.$backendUserData).getUserData(), null, 2, null);
            Function1<UserData, Unit> onBackendUserDataUpdate = ConfigService.this.getOnBackendUserDataUpdate();
            if (onBackendUserDataUpdate != null) {
                onBackendUserDataUpdate.invoke(((SummaryBackendData) this.$backendUserData).getUserData());
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$getBackendIdentifiers$3, reason: invalid class name */
    public static final class AnonymousClass3 extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$getBackendIdentifiers$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
            final /* synthetic */ ConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ConfigService configService) {
                super(0);
                this.this$0 = configService;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.receiveUserBackendIds();
            }
        }

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            QueueManager.Companion.runIncoming(new AnonymousClass1(ConfigService.this));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$processResultRecivingOffer$1, reason: invalid class name and case insensitive filesystem */
    public static final class C26041 extends l0 implements Function0<Unit> {
        final /* synthetic */ AbTestOffer $result;
        final /* synthetic */ SuitableExperiments $suitableExperiments;
        final /* synthetic */ User $user;

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$processResultRecivingOffer$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C08901 extends l0 implements Function0<Unit> {
            final /* synthetic */ ConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08901(ConfigService configService) {
                super(0);
                this.this$0 = configService;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.retryGetOffer();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26041(User user, AbTestOffer abTestOffer, SuitableExperiments suitableExperiments) {
            super(0);
            this.$user = user;
            this.$result = abTestOffer;
            this.$suitableExperiments = suitableExperiments;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (ConfigService.this.stateManager.getActiveUser().getIdKey() != this.$user.getIdKey()) {
                Exception exc = new Exception("[A/B-Test Module]  In the process of receiving offer from the server, the user was changed. Offer has been canceled.");
                Function1<Exception, Unit> offerUserChanged = ConfigService.this.getOfferUserChanged();
                if (offerUserChanged != null) {
                    offerUserChanged.invoke(exc);
                    return;
                }
                return;
            }
            if (!(this.$result instanceof InvolvedExperiments)) {
                Logger.debug$default(Logger.INSTANCE, "[A/B-Test Module] Failed to get A/B-Test offer", null, 2, null);
                ConfigService configService = ConfigService.this;
                configService.retryAfter(configService.remoteConfigAttempt, 2L, new C08901(ConfigService.this), "[A/B-Test Module] The query result was not applied. Tracking is Disabled");
            } else {
                Function2<List<InvolvedExperiment>, SuitableExperiments, Unit> offerUpdate = ConfigService.this.getOfferUpdate();
                if (offerUpdate != null) {
                    offerUpdate.invoke(((InvolvedExperiments) this.$result).getInvolvedExperiments(), this.$suitableExperiments);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$receiveABConfig$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l0 implements Function0<Unit> {
        final /* synthetic */ User $activeUser;
        final /* synthetic */ Identifiers $identifiers;
        final /* synthetic */ Project $project;
        final /* synthetic */ Versions $version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Project project, Identifiers identifiers, Versions versions, User user) {
            super(0);
            this.$project = project;
            this.$identifiers = identifiers;
            this.$version = versions;
            this.$activeUser = user;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConfigService.this.getABConfig(this.$project.getApplicationKey(), this.$identifiers, this.$version, this.$activeUser.getIdKey());
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$receiveAbBackendOffers$1, reason: invalid class name and case insensitive filesystem */
    public static final class C26051 extends l0 implements Function0<Unit> {
        final /* synthetic */ Identifiers $identifiers;
        final /* synthetic */ Project $project;
        final /* synthetic */ SuitableExperiments $suitableExperiments;
        final /* synthetic */ User $user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26051(Project project, Identifiers identifiers, SuitableExperiments suitableExperiments, User user) {
            super(0);
            this.$project = project;
            this.$identifiers = identifiers;
            this.$suitableExperiments = suitableExperiments;
            this.$user = user;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Logger.debug$default(Logger.INSTANCE, "[A/B-Test Module] Try get A/B-Test offer from server", null, 2, null);
            ConfigService.this.processResultRecivingOffer(this.$user, this.$suitableExperiments, ConfigService.this.backend.requestAbTestOffer(this.$project.getApplicationKey(), this.$identifiers, this.$suitableExperiments));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$receiveAnalyticsConfig$1, reason: invalid class name and case insensitive filesystem */
    public static final class C26061 extends l0 implements Function0<Unit> {
        final /* synthetic */ Identifiers $identifiers;
        final /* synthetic */ Project $project;
        final /* synthetic */ Versions $version;

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$receiveAnalyticsConfig$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C08911 extends l0 implements Function0<Unit> {
            final /* synthetic */ ConfigService this$0;

            /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$receiveAnalyticsConfig$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C08921 extends l0 implements Function0<Unit> {
                final /* synthetic */ ConfigService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08921(ConfigService configService) {
                    super(0);
                    this.this$0 = configService;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f312394a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.receiveAnalyticsConfig();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08911(ConfigService configService) {
                super(0);
                this.this$0 = configService;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                QueueManager.Companion.runIncoming(new C08921(this.this$0));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26061(Project project, Identifiers identifiers, Versions versions) {
            super(0);
            this.$project = project;
            this.$identifiers = identifiers;
            this.$version = versions;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BackendConfig backendConfigRequestConfig = ConfigService.this.backend.requestConfig(this.$project.getApplicationKey(), this.$identifiers, this.$version);
            if (!(backendConfigRequestConfig instanceof ConfigEntry)) {
                ConfigService configService = ConfigService.this;
                configService.sdkConfigAttempt = configService.retryAfter(configService.sdkConfigAttempt, 60L, new C08911(ConfigService.this), "Failed to get analytics configuration, using the default configuration");
            } else {
                Function1<ConfigEntry, Unit> onSdkConfigUpdate = ConfigService.this.getOnSdkConfigUpdate();
                if (onSdkConfigUpdate != 0) {
                    onSdkConfigUpdate.invoke(backendConfigRequestConfig);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$receiveUserBackendIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C26071 extends l0 implements Function0<Unit> {
        final /* synthetic */ User $activeUser;
        final /* synthetic */ String $applicationKey;
        final /* synthetic */ Identifiers $identifiers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26071(String str, Identifiers identifiers, User user) {
            super(0);
            this.$applicationKey = str;
            this.$identifiers = identifiers;
            this.$activeUser = user;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TimerTask timerTask = ConfigService.this.retryTimer;
            if (timerTask != null) {
                timerTask.cancel();
            }
            ConfigService.this.getBackendIdentifiers(1L, this.$applicationKey, this.$identifiers, this.$activeUser.getIdKey());
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$stopABTestRequestProcess$1, reason: invalid class name and case insensitive filesystem */
    public static final class C26081 extends l0 implements Function0<Unit> {
        public C26081() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConfigService.this.abConfigRequestInProcess = false;
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ConfigService$stopRequestProcess$1, reason: invalid class name and case insensitive filesystem */
    public static final class C26091 extends l0 implements Function0<Unit> {
        public C26091() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConfigService.this.backendIDsRequestInProcess = false;
        }
    }

    public ConfigService(@NotNull IStateManager stateManager, @NotNull IAbTestManager abTestManager, @NotNull IBackend backend) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(abTestManager, "abTestManager");
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.stateManager = stateManager;
        this.abTestManager = abTestManager;
        this.backend = backend;
        this.sdkConfigAttempt = 1L;
        this.backendIdentifiersAttempt = 1L;
        this.remoteConfigAttempt = 1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getABConfig(String str, Identifiers identifiers, Versions versions, long j10) {
        RemoteConfigSealedClass remoteConfigSealedClassRequestAbTestConfig = this.backend.requestAbTestConfig(str, identifiers, versions);
        if (!(remoteConfigSealedClassRequestAbTestConfig instanceof RemoteConfig)) {
            stopABTestRequestProcess();
            this.remoteConfigAttempt = retryAfter(this.remoteConfigAttempt, 60L, new AnonymousClass1(), "Failed to receive A/B-Test config");
            return;
        }
        this.abConfigRequestInProcess = false;
        if (!this.stateManager.getActiveProject().getTrackingAvailable()) {
            Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] The query result was not applied. Tracking is Disabled", null, 2, null);
            return;
        }
        if (j10 != this.stateManager.getActiveUser().getIdKey()) {
            Logger.debug$default(Logger.INSTANCE, "In the process of receiving AB-test configuration from the server, the user was changed. Request the configuration again.", null, 2, null);
            receiveABConfig();
        } else {
            Function1<RemoteConfig, Unit> configUpdate = getConfigUpdate();
            if (configUpdate != 0) {
                configUpdate.invoke(remoteConfigSealedClassRequestAbTestConfig);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBackendIdentifiers(final long j10, final String str, final Identifiers identifiers, final long j11) {
        BackendUserData backendUserDataRequestBackendUserData = this.backend.requestBackendUserData(str, j10, identifiers);
        if (backendUserDataRequestBackendUserData instanceof SummaryBackendData) {
            QueueManager.Companion.runIncoming(new C26031(j11, backendUserDataRequestBackendUserData));
            return;
        }
        if (backendUserDataRequestBackendUserData instanceof BackendUserDataRetry) {
            BackendUserDataRetry backendUserDataRetry = (BackendUserDataRetry) backendUserDataRequestBackendUserData;
            Logger.debug$default(Logger.INSTANCE, "BackendIdentifiers: let's retry after: " + backendUserDataRetry.getRetryAfter(), null, 2, null);
            Timer timer = new Timer();
            long retryAfter = backendUserDataRetry.getRetryAfter();
            TimerTask timerTask = new TimerTask() { // from class: com.devtodev.analytics.internal.services.ConfigService$getBackendIdentifiers$$inlined$schedule$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    QueueManager.Companion.runConfigQueue(new ConfigService$getBackendIdentifiers$2$1(this, j10 + 1, str, identifiers, j11));
                }
            };
            timer.schedule(timerTask, retryAfter);
            this.retryTimer = timerTask;
            return;
        }
        if (backendUserDataRequestBackendUserData instanceof DoNotRetryBackendUserData) {
            Logger.debug$default(Logger.INSTANCE, "BackendIdentifiers: doNotRetry", null, 2, null);
            stopRequestProcess();
            return;
        }
        if (backendUserDataRequestBackendUserData instanceof BackendUserDataErrorWithResponse) {
            Logger.debug$default(Logger.INSTANCE, "BackendIdentifier unknown status code: " + ((BackendUserDataErrorWithResponse) backendUserDataRequestBackendUserData).getResponse(), null, 2, null);
            stopRequestProcess();
            return;
        }
        if (backendUserDataRequestBackendUserData instanceof BackendUserDataJsonError) {
            Logger.debug$default(Logger.INSTANCE, "BackendIdentifiers: Identification Json Error", null, 2, null);
            stopRequestProcess();
        } else if (backendUserDataRequestBackendUserData instanceof BackendUserDataNoConnection) {
            stopRequestProcess();
            this.backendIdentifiersAttempt = retryAfter(this.backendIdentifiersAttempt, 60L, new AnonymousClass3(), "Failed to get devtodev backendId identifiers");
        } else if (backendUserDataRequestBackendUserData instanceof BackendUserDataError) {
            Logger.error$default(Logger.INSTANCE, "BackendIdentifiers: Identification Error", null, 2, null);
            stopRequestProcess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processResultRecivingOffer(User user, SuitableExperiments suitableExperiments, AbTestOffer abTestOffer) {
        QueueManager.Companion.runIncoming(new C26041(user, abTestOffer, suitableExperiments));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long retryAfter(long j10, long j11, final Function0<Unit> function0, String str) {
        long j12 = j11 * j10;
        new Timer().schedule(new TimerTask() { // from class: com.devtodev.analytics.internal.services.ConfigService$retryAfter$$inlined$schedule$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                function0.invoke();
            }
        }, ((long) 1000) * j12);
        Logger.debug$default(Logger.INSTANCE, str + ", retrying after [" + j12 + "] seconds", null, 2, null);
        if (j10 < 10) {
            return j10 + 1;
        }
        return 10L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryGetOffer() {
        if (!this.stateManager.getActiveProject().getTrackingAvailable()) {
            Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] The query result was not applied. Tracking is Disabled", null, 2, null);
            return;
        }
        Function0<Unit> offerNoConnection = getOfferNoConnection();
        if (offerNoConnection != null) {
            offerNoConnection.invoke();
        }
    }

    private final void stopABTestRequestProcess() {
        QueueManager.Companion.runIncoming(new C26081());
    }

    private final void stopRequestProcess() {
        QueueManager.Companion.runIncoming(new C26091());
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    @Nullable
    public Function1<RemoteConfig, Unit> getConfigUpdate() {
        return this.configUpdate;
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    @Nullable
    public Function0<Unit> getOfferNoConnection() {
        return this.offerNoConnection;
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    @Nullable
    public Function2<List<InvolvedExperiment>, SuitableExperiments, Unit> getOfferUpdate() {
        return this.offerUpdate;
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    @Nullable
    public Function1<Exception, Unit> getOfferUserChanged() {
        return this.offerUserChanged;
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    @Nullable
    public Function1<UserData, Unit> getOnBackendUserDataUpdate() {
        return this.onBackendUserDataUpdate;
    }

    @Override // com.devtodev.analytics.internal.services.IAnalyticsConfigService
    @Nullable
    public Function1<Long, Unit> getOnIdentifiersUpdate() {
        return this.onIdentifiersUpdate;
    }

    @Override // com.devtodev.analytics.internal.services.IAnalyticsConfigService
    @Nullable
    public Function1<ConfigEntry, Unit> getOnSdkConfigUpdate() {
        return this.onSdkConfigUpdate;
    }

    @Override // com.devtodev.analytics.internal.services.IAnalyticsConfigService
    public void invalidateUserBackendIds() {
        this.stateManager.changeValidStateOfDeviceIdentifiers(false);
        Logger.debug$default(Logger.INSTANCE, "Current devtodevID is invalid!", null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    public void receiveABConfig() {
        User activeUser = this.stateManager.getActiveUser();
        int i10 = (5 | 2) << 0;
        if (this.abConfigRequestInProcess) {
            Logger logger = Logger.INSTANCE;
            String userId = activeUser.getUserId();
            if (userId == null) {
                userId = "";
            }
            Logger.debug$default(logger, "[A/B-Test Module] Receiving operation for AB-test configuration [" + userId + "] has been canceled", null, 2, null);
            return;
        }
        this.abConfigRequestInProcess = true;
        Project activeProject = this.stateManager.getActiveProject();
        Identifiers identifiers = this.stateManager.getIdentifiers(this.stateManager.getActiveUser());
        Versions version = this.stateManager.getVersion();
        Long configVersion = this.abTestManager.getConfigVersion();
        if (configVersion != null) {
            version.setConfigVersion(configVersion.longValue());
        }
        Logger.debug$default(Logger.INSTANCE, "[A/B-Test Module] Trying get A/B-Test configuration from server", null, 2, null);
        QueueManager.Companion.runConfigQueue(new AnonymousClass2(activeProject, identifiers, version, activeUser));
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    public void receiveAbBackendOffers() {
        Project activeProject = this.stateManager.getActiveProject();
        User activeUser = this.stateManager.getActiveUser();
        QueueManager.Companion.runConfigQueue(new C26051(activeProject, this.stateManager.getIdentifiers(activeUser), new SuitableExperiments(this.abTestManager.getSuitableExperiments()), activeUser));
    }

    @Override // com.devtodev.analytics.internal.services.IAnalyticsConfigService
    public void receiveAnalyticsConfig() {
        Project activeProject = this.stateManager.getActiveProject();
        Identifiers identifiers = this.stateManager.getIdentifiers(this.stateManager.getActiveUser());
        Versions version = this.stateManager.getVersion();
        int i10 = 4 << 2;
        Logger.debug$default(Logger.INSTANCE, "Trying to get analytics configuration from the server", null, 2, null);
        QueueManager.Companion.runConfigQueue(new C26061(activeProject, identifiers, version));
    }

    @Override // com.devtodev.analytics.internal.services.IAnalyticsConfigService
    public void receiveUserBackendIds() {
        User activeUser = this.stateManager.getActiveUser();
        if (!this.backendIDsRequestInProcess) {
            String applicationKey = this.stateManager.getActiveProject().getApplicationKey();
            Identifiers identifiers = this.stateManager.getIdentifiers(activeUser);
            this.backendIDsRequestInProcess = true;
            QueueManager.Companion.runConfigQueue(new C26071(applicationKey, identifiers, activeUser));
            return;
        }
        Logger logger = Logger.INSTANCE;
        String userId = activeUser.getUserId();
        if (userId == null) {
            userId = "";
        }
        Logger.debug$default(logger, "Receiving operation for user backend identifiers [" + userId + "] has been canceled", null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    public void setConfigUpdate(@Nullable Function1<? super RemoteConfig, Unit> function1) {
        this.configUpdate = function1;
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    public void setOfferNoConnection(@Nullable Function0<Unit> function0) {
        this.offerNoConnection = function0;
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    public void setOfferUpdate(@Nullable Function2<? super List<InvolvedExperiment>, ? super SuitableExperiments, Unit> function2) {
        this.offerUpdate = function2;
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    public void setOfferUserChanged(@Nullable Function1<? super Exception, Unit> function1) {
        this.offerUserChanged = function1;
    }

    @Override // com.devtodev.analytics.internal.services.IAbTestConfigService
    public void setOnBackendUserDataUpdate(@Nullable Function1<? super UserData, Unit> function1) {
        this.onBackendUserDataUpdate = function1;
    }

    @Override // com.devtodev.analytics.internal.services.IAnalyticsConfigService
    public void setOnIdentifiersUpdate(@Nullable Function1<? super Long, Unit> function1) {
        this.onIdentifiersUpdate = function1;
    }

    @Override // com.devtodev.analytics.internal.services.IAnalyticsConfigService
    public void setOnSdkConfigUpdate(@Nullable Function1<? super ConfigEntry, Unit> function1) {
        this.onSdkConfigUpdate = function1;
    }
}
