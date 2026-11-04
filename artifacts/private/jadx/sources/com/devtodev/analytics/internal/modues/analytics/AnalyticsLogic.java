package com.devtodev.analytics.internal.modues.analytics;

import android.content.Context;
import com.devtodev.analytics.external.DTDTrackingStatus;
import com.devtodev.analytics.external.analytics.DTDAccrualType;
import com.devtodev.analytics.external.analytics.DTDAccrualTypeKt;
import com.devtodev.analytics.external.analytics.DTDAnalyticsConfiguration;
import com.devtodev.analytics.external.analytics.DTDFinishProgressionEventParameters;
import com.devtodev.analytics.external.analytics.DTDReferralProperty;
import com.devtodev.analytics.external.analytics.DTDStartProgressionEventParameters;
import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.core.IServicesFactory;
import com.devtodev.analytics.internal.domain.DeviceIdentifiers;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.AdImpression;
import com.devtodev.analytics.internal.domain.events.Alive;
import com.devtodev.analytics.internal.domain.events.CurrentBalance;
import com.devtodev.analytics.internal.domain.events.DeviceInfo;
import com.devtodev.analytics.internal.domain.events.LevelUp;
import com.devtodev.analytics.internal.domain.events.Referral;
import com.devtodev.analytics.internal.domain.events.TrackingStatus;
import com.devtodev.analytics.internal.domain.events.correncyPayment.VirtualCurrencyPayment;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.CurrencyAccrual;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.CurrencyAccrualResource;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResource;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResourceType;
import com.devtodev.analytics.internal.domain.events.customEvent.CustomEvent;
import com.devtodev.analytics.internal.domain.events.progressionEvent.Location;
import com.devtodev.analytics.internal.domain.events.progressionEvent.ProgressionEvent;
import com.devtodev.analytics.internal.domain.events.progressionEvent.ProgressionParameter;
import com.devtodev.analytics.internal.domain.events.session.SessionStart;
import com.devtodev.analytics.internal.domain.events.session.UserEngagement;
import com.devtodev.analytics.internal.domain.events.socialNetwork.SocialConnect;
import com.devtodev.analytics.internal.domain.events.socialNetwork.SocialPost;
import com.devtodev.analytics.internal.domain.events.tutorial.Tutorial;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.DTDPlatformOwner;
import com.devtodev.analytics.internal.platform.AdvertisingIdResult;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import com.devtodev.analytics.internal.queue.QueueManager;
import com.devtodev.analytics.internal.services.IActivityService;
import com.devtodev.analytics.internal.services.IAnalyticsConfigService;
import com.devtodev.analytics.internal.services.ICurrencyAccrualService;
import com.devtodev.analytics.internal.services.IEventsService;
import com.devtodev.analytics.internal.services.ILevelResourceService;
import com.devtodev.analytics.internal.services.IPeopleService;
import com.devtodev.analytics.internal.services.IProjectService;
import com.devtodev.analytics.internal.services.IReportService;
import com.devtodev.analytics.internal.services.ITimerService;
import com.devtodev.analytics.internal.services.IUserService;
import com.devtodev.analytics.internal.services.purchases.ISubscriptionService;
import com.devtodev.analytics.internal.utils.IService;
import com.devtodev.analytics.internal.utils.Service;
import com.devtodev.analytics.internal.validator.Validator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAnalyticsLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsLogic.kt\ncom/devtodev/analytics/internal/modues/analytics/AnalyticsLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,868:1\n1045#2:869\n1855#2,2:870\n1549#2:873\n1620#2,3:874\n288#2,2:877\n288#2,2:879\n1#3:872\n*S KotlinDebug\n*F\n+ 1 AnalyticsLogic.kt\ncom/devtodev/analytics/internal/modues/analytics/AnalyticsLogic\n*L\n314#1:869\n318#1:870,2\n364#1:873\n364#1:874,3\n466#1:877,2\n492#1:879,2\n*E\n"})
public final class AnalyticsLogic implements IAnalyticLogic {

    @NotNull
    private final IActivityService activityService;

    @NotNull
    private final IAnalyticsConfigService analyticsConfigService;

    @NotNull
    private final Context context;

    @NotNull
    private final ICurrencyAccrualService currencyAccrualService;

    @NotNull
    private final IEventsService eventsService;

    @NotNull
    private final ILevelResourceService levelResourceService;

    @Nullable
    private Function1<? super Long, Unit> onBackendIdentifiersUpdate;

    @NotNull
    private final IPeopleService peopleService;

    @NotNull
    private final IProjectService projectService;

    @NotNull
    private final IReportService reportService;

    @NotNull
    private final IServicesFactory servicesFactory;

    @NotNull
    private IService sessionService;
    private boolean started;

    @NotNull
    private final ISubscriptionService subscriptionService;

    @NotNull
    private final ITimerService timerService;

    @NotNull
    private final IUserService userService;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareConfigCallback$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function1<ConfigEntry, Unit> {

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareConfigCallback$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C08871 extends l0 implements Function0<Unit> {
            final /* synthetic */ ConfigEntry $config;
            final /* synthetic */ AnalyticsLogic this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08871(AnalyticsLogic analyticsLogic, ConfigEntry configEntry) {
                super(0);
                this.this$0 = analyticsLogic;
                this.$config = configEntry;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean zIsHistoryNeedReset = this.this$0.subscriptionService.isHistoryNeedReset(this.$config);
                this.this$0.projectService.applyConfig(this.$config);
                if (this.this$0.projectService.checkIfNeedRemoveUsersData()) {
                    this.this$0.removeInactiveUsers();
                }
                if (zIsHistoryNeedReset) {
                    this.this$0.subscriptionService.resetHistoryMark();
                }
                this.this$0.timerService.resetTimers();
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConfigEntry configEntry) {
            invoke2(configEntry);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ConfigEntry config) {
            Intrinsics.checkNotNullParameter(config, "config");
            QueueManager.Companion.runIncoming(new C08871(AnalyticsLogic.this, config));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$preparePeopleCardCallback$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25601 extends l0 implements Function0<Unit> {
        public C25601() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnalyticsLogic.this.sendBufferedEvents();
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$preparePeopleCardCallback$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l0 implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnalyticsLogic.this.peopleService.generatePeopleEvent(true);
            AnalyticsLogic.this.reportService.sendBufferedEvents();
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareReportSendCallback$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25611 extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareReportSendCallback$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C08881 extends l0 implements Function0<Unit> {
            final /* synthetic */ AnalyticsLogic this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08881(AnalyticsLogic analyticsLogic) {
                super(0);
                this.this$0 = analyticsLogic;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.this$0.projectService.getTrackingAvailable() && this.this$0.activityService.isActive()) {
                    this.this$0.timerService.resetRequestTimer();
                    this.this$0.timerService.resetAliveTimer();
                }
            }
        }

        public C25611() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            QueueManager.Companion.runIncoming(new C08881(AnalyticsLogic.this));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareTimersCallback$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25621 extends l0 implements Function0<Unit> {
        public C25621() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnalyticsLogic.this.sendAlive();
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareTimersCallback$2, reason: invalid class name and case insensitive filesystem */
    public static final class C25632 extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareTimersCallback$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
            final /* synthetic */ AnalyticsLogic this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnalyticsLogic analyticsLogic) {
                super(0);
                this.this$0 = analyticsLogic;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Logger.debug$default(Logger.INSTANCE, "Currency accrual timer tick", null, 2, null);
                this.this$0.addCurrencyAccrual();
            }
        }

        public C25632() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            QueueManager.Companion.runIncoming(new AnonymousClass1(AnalyticsLogic.this));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareTimersCallback$3, reason: invalid class name */
    public static final class AnonymousClass3 extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareTimersCallback$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
            final /* synthetic */ AnalyticsLogic this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnalyticsLogic analyticsLogic) {
                super(0);
                this.this$0 = analyticsLogic;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.peopleService.generatePeopleEvent(false);
                this.this$0.reportService.sendBufferedEvents();
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
            QueueManager.Companion.runIncoming(new AnonymousClass1(AnalyticsLogic.this));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareTimersCallback$4, reason: invalid class name */
    public static final class AnonymousClass4 extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareTimersCallback$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
            final /* synthetic */ AnalyticsLogic this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnalyticsLogic analyticsLogic) {
                super(0);
                this.this$0 = analyticsLogic;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.servicesFactory.getActivityService().updateLastBackgroundTime();
            }
        }

        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            QueueManager.Companion.runIncoming(new AnonymousClass1(AnalyticsLogic.this));
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$prepareTimersCallback$5, reason: invalid class name */
    public static final class AnonymousClass5 extends l0 implements Function0<Unit> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Logger.debug$default(Logger.INSTANCE, "There are enough events for dispatching", null, 2, null);
            AnalyticsLogic.this.reportService.sendBufferedEvents();
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$sendAlive$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25641 extends l0 implements Function0<Unit> {
        public C25641() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Long sessionId;
            if (Validator.INSTANCE.isExcluded("al", null) || (sessionId = AnalyticsLogic.this.activityService.getSessionId()) == null) {
                return;
            }
            AnalyticsLogic.this.reportService.sendFlashEvent(new Alive(sessionId.longValue()));
        }
    }

    public AnalyticsLogic(@NotNull IServicesFactory servicesFactory, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(servicesFactory, "servicesFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        this.servicesFactory = servicesFactory;
        this.context = context;
        this.projectService = servicesFactory.getProjectService();
        this.userService = servicesFactory.getUserService();
        this.activityService = servicesFactory.getActivityService();
        this.analyticsConfigService = servicesFactory.getAnalyticsConfigService();
        this.currencyAccrualService = servicesFactory.getCurrencyAccrualService();
        this.eventsService = servicesFactory.getEventsService();
        this.reportService = servicesFactory.getReportService();
        this.levelResourceService = servicesFactory.getLevelResourceService();
        this.timerService = servicesFactory.getTimerService();
        this.peopleService = servicesFactory.getPeopleService();
        this.subscriptionService = servicesFactory.getSubscriptionService();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.sessionService = new Service(applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addCurrencyAccrual() {
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            long jLongValue = sessionId.longValue();
            if (this.currencyAccrualService.isContainsCurrencyAccrual()) {
                prepareCurrencyAccrualEvent$default(this, jLongValue, this.userService.getUserLevel(), null, null, 12, null);
            }
        }
    }

    private final void addSavedCurrencyAccrualResources() {
        for (User user : CollectionsKt.sortedWith(this.userService.getAllUsers(), new Comparator() { // from class: com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic$addSavedCurrencyAccrualResources$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                User user2 = (User) t10;
                Long sessionId = user2.getSessionId();
                long jLongValue = sessionId != null ? sessionId.longValue() : Long.MAX_VALUE;
                Long sessionId2 = user2.getSessionId();
                Boolean boolValueOf = Boolean.valueOf(jLongValue < (sessionId2 != null ? sessionId2.longValue() : Long.MAX_VALUE));
                User user3 = (User) t11;
                Long sessionId3 = user3.getSessionId();
                long jLongValue2 = sessionId3 != null ? sessionId3.longValue() : Long.MAX_VALUE;
                Long sessionId4 = user3.getSessionId();
                return a.l(boolValueOf, Boolean.valueOf(jLongValue2 < (sessionId4 != null ? sessionId4.longValue() : Long.MAX_VALUE)));
            }
        })) {
            Long sessionId = user.getSessionId();
            if (sessionId != null) {
                long jLongValue = sessionId.longValue();
                Long lastCreatedTime = this.currencyAccrualService.getLastCreatedTime(user);
                if (lastCreatedTime != null) {
                    prepareCurrencyAccrualEvent(jLongValue, user.getLevel(), Long.valueOf(lastCreatedTime.longValue()), user);
                }
            }
        }
    }

    private final void prepareConfigCallback() {
        this.analyticsConfigService.setOnSdkConfigUpdate(new AnonymousClass1());
    }

    private final void prepareCurrencyAccrualEvent(long j10, int i10, Long l10, User user) {
        long numberOfCurrencies = this.projectService.getNumberOfCurrencies();
        CurrencyAccrual currencyAccrual = new CurrencyAccrual(i10, this.currencyAccrualService.getBoughtResources(numberOfCurrencies, user), this.currencyAccrualService.getEarnedResources(numberOfCurrencies, user), j10);
        if (l10 != null) {
            currencyAccrual.setTimestamp(l10.longValue());
        }
        if (user != null) {
            this.eventsService.addEvent(currencyAccrual, user);
            this.currencyAccrualService.removeResources(user);
        } else {
            this.eventsService.addEvent(currencyAccrual);
            this.currencyAccrualService.removeResourcesForActiveUser();
        }
    }

    public static /* synthetic */ void prepareCurrencyAccrualEvent$default(AnalyticsLogic analyticsLogic, long j10, int i10, Long l10, User user, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            l10 = null;
        }
        if ((i11 & 8) != 0) {
            user = null;
        }
        analyticsLogic.prepareCurrencyAccrualEvent(j10, i10, l10, user);
    }

    private final void preparePeopleCardCallback() {
        this.peopleService.setOnClearedCard(new C25601());
        this.peopleService.setOnFilledCustomParams(new AnonymousClass2());
    }

    private final void prepareReportSendCallback() {
        this.reportService.setOnReportSendAction(new C25611());
    }

    private final void prepareTimersCallback() {
        this.timerService.setOnAliveTimerTick(new C25621());
        this.timerService.setOnCurrencyAccrualTimerTick(new C25632());
        this.timerService.setOnRequestTimerTick(new AnonymousClass3());
        this.timerService.setOnActivityTimerTick(new AnonymousClass4());
        this.eventsService.setOnFullStackAction(new AnonymousClass5());
    }

    private final void removeEventsAndResources() {
        this.eventsService.removeAllEvents();
        this.reportService.removeAllReports();
        this.levelResourceService.removeAllResources();
        this.currencyAccrualService.removeAllResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeInactiveUsers() {
        removeUser(this.userService.getInactiveUsers());
    }

    private final void removeUser(List<User> list) {
        if (list.isEmpty()) {
            return;
        }
        Logger logger = Logger.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String userId = ((User) it.next()).getUserId();
            if (userId == null) {
                userId = "";
            }
            arrayList.add(userId);
        }
        logger.debug("Remove inactive users " + arrayList, null);
        this.userService.removeInactiveUsersData(list);
        this.eventsService.removeInactiveUsers(list);
        this.currencyAccrualService.removeInactiveUsers(list);
        this.levelResourceService.removeInactiveUsers(list);
        this.reportService.removeInactiveUsers(list);
        this.peopleService.removeInactiveUsers(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAlive() {
        QueueManager.Companion.runIncoming(new C25641());
    }

    private final void sendDeviceInfo() {
        String token;
        boolean zIsLimitAdTrackingEnabled;
        if (Validator.INSTANCE.isExcluded("di", null)) {
            return;
        }
        DeviceConstants deviceConstants = this.projectService.getDeviceConstants();
        DeviceResolution deviceResolution = this.projectService.getDeviceResolution();
        AdvertisingIdResult advertisingId = this.projectService.getAdvertisingId();
        DeviceIdentifiers deviceIdentifiers = this.projectService.getDeviceIdentifiers();
        if (advertisingId instanceof AdvertisingIdResult.AdvertisingId) {
            AdvertisingIdResult.AdvertisingId advertisingId2 = (AdvertisingIdResult.AdvertisingId) advertisingId;
            zIsLimitAdTrackingEnabled = advertisingId2.isLimitAdTrackingEnabled();
            token = advertisingId2.getToken();
        } else {
            token = null;
            zIsLimitAdTrackingEnabled = true;
        }
        DeviceInfo deviceInfo = new DeviceInfo(deviceConstants.getDeviceVersionKey(), deviceConstants.getOsKey(), deviceResolution.getScreenDPI(), deviceResolution.getScreenResolution(), deviceResolution.getScreenInches(), deviceConstants.getManufacturer(), deviceConstants.getModel(), deviceConstants.getTimezoneOffset(), deviceConstants.isRooted() ? 1 : 0, zIsLimitAdTrackingEnabled, deviceConstants.getUserAgent(), null, token, deviceIdentifiers.getUuid(), null, deviceConstants.getDeviceType(), 18432, null);
        if (this.projectService.getDeviseOwner() != DTDPlatformOwner.Other) {
            deviceInfo.setAndroidId(deviceConstants.getAndroidId());
            deviceInfo.setInstanceId(deviceConstants.getOdin());
        }
        this.eventsService.addEvent(deviceInfo);
    }

    private final void sendReferrer() {
        Long sessionId;
        if (Validator.INSTANCE.isExcluded("rf", null) || this.projectService.isRefererSent() || (sessionId = this.activityService.getSessionId()) == null) {
            return;
        }
        this.projectService.getReferrerData(new AnalyticsLogic$sendReferrer$1$1(sessionId.longValue(), this));
    }

    private final void startSDK() {
        if (this.started) {
            Logger.error$default(Logger.INSTANCE, "The SDK is already running!", null, 2, null);
        }
        if (this.activityService.isActive()) {
            Logger.error$default(Logger.INSTANCE, "Activity cannot be launched before the SDK starts!", null, 2, null);
            return;
        }
        addSavedCurrencyAccrualResources();
        sendDeviceInfo();
        startActivity();
        sendReferrer();
        this.peopleService.generatePeopleEvent(true);
        this.reportService.sendBufferedEvents();
        this.projectService.updateValidator();
        this.analyticsConfigService.receiveAnalyticsConfig();
        if (!this.userService.hasDevToDevIds() || this.userService.needResetDevToDevIds() || this.userService.alwaysNeedRequest()) {
            this.analyticsConfigService.receiveUserBackendIds();
        } else {
            forceUpdate();
        }
        this.started = true;
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void adImpression(@NotNull String network, double d10, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(network, "network");
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            this.eventsService.addEvent(new AdImpression(sessionId.longValue(), network, d10, "sdk", str, str2, this.userService.getInProgressData()));
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalyticLogic
    public void applyAnalyticsConfiguration(@NotNull DTDAnalyticsConfiguration validConfiguration) {
        Intrinsics.checkNotNullParameter(validConfiguration, "validConfiguration");
        DTDTrackingStatus trackingAvailability = validConfiguration.getTrackingAvailability();
        if (!this.projectService.getTrackingAvailable() && trackingAvailability == DTDTrackingStatus.Enable) {
            this.projectService.setTrackingAvailable(true);
            this.eventsService.addEvent(new TrackingStatus(true));
        }
        if (this.projectService.getTrackingAvailable() && trackingAvailability == DTDTrackingStatus.Disable) {
            removeEventsAndResources();
            this.timerService.stopTimers();
            this.projectService.setTrackingAvailable(false);
            this.analyticsConfigService.invalidateUserBackendIds();
        }
        Integer currentLevel = validConfiguration.getCurrentLevel();
        if (currentLevel != null) {
            setCurrentLevel(currentLevel.intValue());
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void currencyAccrual(@NotNull String currencyName, int i10, @NotNull String source, @NotNull DTDAccrualType accrualType) {
        Intrinsics.checkNotNullParameter(currencyName, "currencyName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accrualType, "accrualType");
        long j10 = i10;
        this.levelResourceService.addLevelResource(new LevelResource(0L, 0L, LevelResourceType.Companion.fromLong(accrualType.getValue()), currencyName, j10, 3, null));
        this.currencyAccrualService.addCurrencyAccrual(new CurrencyAccrualResource(0L, 0L, DTDAccrualTypeKt.getAccrualType(accrualType.getValue()), currencyName, j10, source, 0L, 67, null));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void currentBalance(@NotNull Map<String, Long> balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            if (this.userService.isBalanceSentForActiveUser()) {
                Logger.INSTANCE.warning("The CurrentBalance event is already sent, in this game session", null);
                return;
            }
            this.eventsService.addEvent(new CurrentBalance(sessionId.longValue(), balances, this.userService.getUserLevel()));
            this.userService.changeCurBalanceSentMark(true);
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void customEvent(@NotNull String eventName, @NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            this.eventsService.addEvent(new CustomEvent(this.userService.getUserLevel(), sessionId.longValue(), eventName, parameters, this.userService.getInProgressData()));
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void finishProgressionEvent(@NotNull String eventName, @NotNull DTDFinishProgressionEventParameters parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Location location = this.userService.getLocation();
        if (location == null) {
            Logger.INSTANCE.warning("Progression event can't be finished!\n\tDoesn't have any started progression events", null);
            return;
        }
        if (!Intrinsics.areEqual(location.getName(), eventName)) {
            Logger.INSTANCE.warning("Progression event can't be finished!\n\tStarted progression event name is [" + location.getName() + "]\n\tCurrent event name is [" + eventName + "]", null);
            return;
        }
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int duration = parameters.getDuration();
            if (duration <= 0) {
                duration = (int) Math.ceil((jCurrentTimeMillis - location.getTimestamp()) / ((double) 1000));
            }
            this.eventsService.addEvent(new ProgressionEvent(sessionId.longValue(), this.userService.getUserLevel(), eventName, new ProgressionParameter(parameters.getSuccessfulCompletion(), duration == 0 ? null : Integer.valueOf(duration), location.getDifficulty(), location.getSource()), parameters.getSpent(), parameters.getEarned()));
            this.peopleService.generatePeopleEvent(false);
            this.reportService.sendBufferedEvents();
            this.userService.clearLocation(false);
            Logger.info$default(Logger.INSTANCE, "The ProgressionEvent: [" + eventName + "] is finished", null, 2, null);
        }
    }

    @Override // com.devtodev.analytics.internal.modues.observers.ILogicBroadcaster
    public void forceUpdate() {
        Function1<Long, Unit> onBackendIdentifiersUpdate;
        DeviceIdentifiers deviceIdentifiers = this.projectService.getDeviceIdentifiers();
        if (!deviceIdentifiers.isValid() || (onBackendIdentifiersUpdate = getOnBackendIdentifiersUpdate()) == null) {
            return;
        }
        onBackendIdentifiersUpdate.invoke(deviceIdentifiers.getDevtodevId());
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getCurrentLevel(@NotNull Function1<? super Integer, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        completionHandler.invoke(Integer.valueOf(this.userService.getUserLevel()));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public int getCustomEventParamsCount() {
        return this.projectService.paramsCount();
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getDeviceId(@NotNull Function1<? super String, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        completionHandler.invoke(this.projectService.getDeviceIdentifiers().getDeviceIdentifier());
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getObfuscatedAccountId(@NotNull Function1<? super String, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        completionHandler.invoke(this.projectService.getObfuscatedAccountId());
    }

    @Override // com.devtodev.analytics.internal.modues.observers.ILogicBroadcaster
    @Nullable
    public Function1<Long, Unit> getOnBackendIdentifiersUpdate() {
        return this.onBackendIdentifiersUpdate;
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getSDKVersion(@NotNull Function1<? super String, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        completionHandler.invoke(this.projectService.getSDKVersion());
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getTrackingAvailability(@NotNull Function1<? super Boolean, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        completionHandler.invoke(Boolean.valueOf(this.projectService.getTrackingAvailable()));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getUserId(@NotNull Function1<? super String, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        String activeUserId = this.userService.getActiveUserId();
        if (activeUserId != null) {
            completionHandler.invoke(activeUserId);
        } else {
            completionHandler.invoke("");
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void levelUp(int i10, @NotNull Map<String, Long> balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        Long sessionId = this.activityService.getSessionId();
        if (sessionId == null) {
            if (this.projectService.getTrackingAvailable()) {
                return;
            }
            this.userService.setUserLevel(i10);
            return;
        }
        addCurrencyAccrual();
        int userLevel = this.userService.getUserLevel();
        LevelUp levelUp = new LevelUp(i10, sessionId.longValue(), balances, null, null, null, this.userService.getInProgressData(), 56, null);
        if (i10 == userLevel + 1) {
            long numberOfCurrencies = this.projectService.getNumberOfCurrencies();
            levelUp.setSpent(this.levelResourceService.getSpendResources(numberOfCurrencies));
            levelUp.setEarned(this.levelResourceService.getEarnedResources(numberOfCurrencies));
            levelUp.setBought(this.levelResourceService.getBoughtResources(numberOfCurrencies));
        }
        this.userService.resourceAggregation(true);
        this.userService.setUserLevel(i10);
        this.eventsService.addEvent(levelUp);
        this.peopleService.generatePeopleEvent(false);
        this.reportService.sendBufferedEvents();
        this.levelResourceService.removeResourcesForActiveUser();
        this.currencyAccrualService.removeResourcesForActiveUser();
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalyticLogic
    public void prepareCallBacks() {
        prepareTimersCallback();
        prepareConfigCallback();
        prepareReportSendCallback();
        preparePeopleCardCallback();
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void referrer(@NotNull Map<DTDReferralProperty, String> utmData) {
        Intrinsics.checkNotNullParameter(utmData, "utmData");
        if (this.projectService.isRefererSent()) {
            Logger.info$default(Logger.INSTANCE, "The referrer has been sent", null, 2, null);
            return;
        }
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            this.eventsService.addEvent(new Referral(sessionId.longValue(), utmData.get(DTDReferralProperty.Source), null, utmData.get(DTDReferralProperty.Campaign), utmData.get(DTDReferralProperty.Content), utmData.get(DTDReferralProperty.Medium), utmData.get(DTDReferralProperty.Term), null, 132, null));
            this.peopleService.generatePeopleEvent(false);
            this.reportService.sendBufferedEvents();
            this.projectService.setRefererSent(true);
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void replaceUserId(@NotNull String fromUserId, @NotNull String toUserId) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(fromUserId, "fromUserId");
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        List<User> allUsers = this.userService.getAllUsers();
        Iterator<T> it = allUsers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((User) next).getUserId(), fromUserId));
        User user = (User) next;
        if (user == null) {
            Logger.INSTANCE.warning("The userId: [" + fromUserId + "] not found!\n\tReplace not possible!", null);
            return;
        }
        String deviceIdentifier = this.projectService.getDeviceIdentifiers().getDeviceIdentifier();
        if (Intrinsics.areEqual(toUserId, deviceIdentifier)) {
            Logger.INSTANCE.warning("The toUserId matches the device ID [" + deviceIdentifier + "]!\n\tReplace not possible!", null);
            return;
        }
        if (Intrinsics.areEqual(fromUserId, toUserId)) {
            Logger.INSTANCE.warning("The fromUserId is equal to the toUserId [" + toUserId + "]!\n\tReplace not possible!", null);
            return;
        }
        String activeUserId = this.userService.getActiveUserId();
        Iterator<T> it2 = allUsers.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.areEqual(((User) next2).getUserId(), toUserId));
        User user2 = (User) next2;
        if (user2 != null) {
            if (Intrinsics.areEqual(activeUserId, toUserId)) {
                this.userService.activateUser(fromUserId);
            }
            removeUser(CollectionsKt.listOf(user2));
        }
        this.userService.replaceUserId(user, toUserId);
        if ((!this.userService.hasDevToDevIds() && this.projectService.getTrackingAvailable()) || this.userService.alwaysNeedRequest()) {
            this.analyticsConfigService.receiveUserBackendIds();
        }
        if (!this.userService.isDefaultUser() && this.projectService.isUserCounting() && !Intrinsics.areEqual(activeUserId, this.userService.getActiveUserId())) {
            this.userService.clearLocation(true);
        }
        sendDeviceInfo();
        sendBufferedEvents();
        Logger.info$default(Logger.INSTANCE, "User: [" + fromUserId + "] renamed to [" + toUserId + "]", null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void sendBufferedEvents() {
        this.peopleService.generatePeopleEvent(false);
        this.reportService.sendBufferedEvents();
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void setCurrentLevel(int i10) {
        String activeUserId = this.userService.getActiveUserId();
        if (i10 != this.userService.getUserLevel()) {
            addCurrencyAccrual();
            this.reportService.sendBufferedEvents();
            this.levelResourceService.removeResourcesForActiveUser();
            this.userService.resourceAggregation(false);
        }
        this.userService.setUserLevel(i10);
        Logger logger = Logger.INSTANCE;
        if (activeUserId == null) {
            activeUserId = "";
        }
        Logger.info$default(logger, "Set level [" + i10 + "] for user [" + activeUserId + "]", null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.modues.observers.ILogicBroadcaster
    public void setOnBackendIdentifiersUpdate(@Nullable Function1<? super Long, Unit> function1) {
        this.onBackendIdentifiersUpdate = function1;
        this.analyticsConfigService.setOnIdentifiersUpdate(function1);
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void setTrackingAvailability(boolean z10) {
        if (this.projectService.getTrackingAvailable() == z10) {
            Logger.info$default(Logger.INSTANCE, "Tracking status is already " + (z10 ? "Enable" : "Disable"), null, 2, null);
            if (z10) {
                this.eventsService.addEvent(new TrackingStatus(true));
            }
            return;
        }
        if (!z10) {
            removeEventsAndResources();
            stopActivity();
            this.eventsService.addEvent(new TrackingStatus(false));
            sendBufferedEvents();
            this.projectService.setTrackingAvailable(z10);
            this.analyticsConfigService.invalidateUserBackendIds();
            return;
        }
        this.projectService.setTrackingAvailable(z10);
        this.eventsService.addEvent(new TrackingStatus(true));
        if (!this.started) {
            startSDK();
            return;
        }
        this.reportService.sendBufferedEvents();
        startActivity();
        this.analyticsConfigService.receiveAnalyticsConfig();
        this.analyticsConfigService.receiveUserBackendIds();
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void setUserId(@NotNull String newUserId) {
        Intrinsics.checkNotNullParameter(newUserId, "newUserId");
        String activeUserId = this.userService.getActiveUserId();
        if (activeUserId != null) {
            if (Intrinsics.areEqual(activeUserId, newUserId)) {
                Logger.INSTANCE.warning("The current userId is equal to the new userId [" + newUserId + "]!", null);
                return;
            }
            if (Intrinsics.areEqual(newUserId, this.projectService.getDeviceIdentifiers().getDeviceIdentifier())) {
                Logger.INSTANCE.warning("The userId matches the deviceId [" + newUserId + "]!\n\tSetting up a userId is not possible", null);
                return;
            }
            if (this.userService.isDefaultUser() && Intrinsics.areEqual(newUserId, "")) {
                Logger.INSTANCE.warning("The current user is already a default user", null);
                return;
            }
            if (!this.userService.isDefaultUser() && this.projectService.isUserCounting()) {
                this.userService.changeCurBalanceSentMark(false);
            }
            if (this.userService.isDefaultUser() || !this.projectService.isUserCounting()) {
                this.userService.activateUser(newUserId);
            } else {
                addCurrencyAccrual();
                stopActivity();
                this.userService.activateUser(newUserId);
                this.userService.clearLocation(true);
                sendDeviceInfo();
                startActivity();
                this.reportService.sendBufferedEvents();
            }
            Logger logger = Logger.INSTANCE;
            String activeUserId2 = this.userService.getActiveUserId();
            logger.info("The userId [" + activeUserId + "] changed to [" + (activeUserId2 != null ? activeUserId2 : "") + "]!", null);
            if (this.userService.isDefaultUser()) {
                Logger.debug$default(logger, "Default user activated!", null, 2, null);
            }
            if ((!this.userService.hasDevToDevIds() && this.projectService.getTrackingAvailable()) || this.userService.alwaysNeedRequest()) {
                this.analyticsConfigService.receiveUserBackendIds();
            }
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void socialNetworkConnect(@NotNull String socialNetwork) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            this.eventsService.addEvent(new SocialConnect(this.userService.getUserLevel(), sessionId.longValue(), socialNetwork, this.userService.getInProgressData()));
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void socialNetworkPost(@NotNull String socialNetwork, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            this.eventsService.addEvent(new SocialPost(this.userService.getUserLevel(), sessionId.longValue(), socialNetwork, reason, this.userService.getInProgressData()));
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void startActivity() {
        Long sessionId;
        this.sessionService.startSessionService();
        if (this.activityService.isActive()) {
            return;
        }
        if (!this.projectService.getTrackingAvailable()) {
            Logger.info$default(Logger.INSTANCE, "SDK not active!\n\t Tracking status is Disable!", null, 2, null);
            return;
        }
        Logger.debug$default(Logger.INSTANCE, "Start activity", null, 2, null);
        if (this.activityService.startActivity() && (sessionId = this.activityService.getSessionId()) != null) {
            long jLongValue = sessionId.longValue();
            this.eventsService.addEvent(new SessionStart(jLongValue, jLongValue, this.userService.getUserLevel(), this.userService.getInProgressData()));
            this.reportService.sendBufferedEvents();
        }
        this.timerService.startTimers();
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void startProgressionEvent(@NotNull String eventName, @NotNull DTDStartProgressionEventParameters parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.userService.activateLocation(new Location(eventName, parameters.getSource(), parameters.getDifficulty$DTDAnalytics_androidRelease()));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void stopActivity() {
        if (this.activityService.isActive()) {
            Logger logger = Logger.INSTANCE;
            Logger.debug$default(logger, "Stop activity", null, 2, null);
            addCurrencyAccrual();
            this.peopleService.generatePeopleEvent(false);
            Long sessionId = this.activityService.getSessionId();
            Long lStopActivity = this.activityService.stopActivity();
            if (sessionId != null && lStopActivity != null) {
                if (lStopActivity.longValue() > 0) {
                    this.eventsService.addEvent(new UserEngagement(sessionId.longValue(), this.userService.getUserLevel(), lStopActivity.longValue(), this.userService.getInProgressData()));
                } else {
                    Logger.debug$default(logger, "The user engagement event was not generated, session length is zero", null, 2, null);
                }
            }
            this.reportService.sendBufferedEvents();
            this.timerService.stopTimers();
            this.sessionService.stopSessionService();
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalyticLogic
    public void tryStartSDK() {
        if (this.projectService.getTrackingAvailable()) {
            startSDK();
        } else {
            this.reportService.sendFlashEvent(new TrackingStatus(false));
            Logger.info$default(Logger.INSTANCE, "SDK not active!\n\tTracking status is Disable!", null, 2, null);
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void tutorial(int i10) {
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null && !this.userService.isTutorialStepMarked(i10)) {
            this.eventsService.addEvent(new Tutorial(this.userService.getUserLevel(), sessionId.longValue(), i10, this.userService.getInProgressData()));
            this.userService.markTutorialStep(i10);
        } else {
            Logger.warning$default(Logger.INSTANCE, "Tutorial step [" + i10 + "] is already used", null, 2, null);
        }
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void virtualCurrencyPayment(@NotNull String purchaseId, @NotNull String purchaseType, int i10, @NotNull Map<String, Integer> resources) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Long sessionId = this.activityService.getSessionId();
        if (sessionId != null) {
            int userLevel = this.userService.getUserLevel();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Integer> entry : resources.entrySet()) {
                String key = entry.getKey();
                long jIntValue = entry.getValue().intValue();
                this.levelResourceService.addLevelResource(new LevelResource(0L, 0L, LevelResourceType.Spent, key, jIntValue, 3, null));
                linkedHashMap.put(key, Long.valueOf(jIntValue));
            }
            this.eventsService.addEvent(new VirtualCurrencyPayment(userLevel, sessionId.longValue(), i10, MapsKt.toMap(linkedHashMap), purchaseType, purchaseId, this.userService.getInProgressData()));
        }
    }
}
