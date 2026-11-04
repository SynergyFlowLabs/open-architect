package com.devtodev.analytics.internal.core;

import android.content.Context;
import com.devtodev.analytics.external.DTDLogLevel;
import com.devtodev.analytics.external.abtest.DTDRemoteConfigListener;
import com.devtodev.analytics.external.analytics.DTDAnalyticsConfiguration;
import com.devtodev.analytics.internal.helpfultools.ABTestDefaultParamsCache;
import com.devtodev.analytics.internal.helpfultools.ABTestInitialData;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.AbTestManager;
import com.devtodev.analytics.internal.managers.CoreManager;
import com.devtodev.analytics.internal.managers.DeviceManager;
import com.devtodev.analytics.internal.managers.EventController;
import com.devtodev.analytics.internal.managers.StateManager;
import com.devtodev.analytics.internal.migrator.Migration;
import com.devtodev.analytics.internal.modues.abtest.AbTestLogicProxy;
import com.devtodev.analytics.internal.modues.abtest.IAbTestProxy;
import com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy;
import com.devtodev.analytics.internal.modues.analytics.IAnalyticsProxy;
import com.devtodev.analytics.internal.modues.analytics.SdkConstraints;
import com.devtodev.analytics.internal.modues.anticheat.AntiCheatProxy;
import com.devtodev.analytics.internal.modues.anticheat.IAntiCheatProxy;
import com.devtodev.analytics.internal.modues.messaging.IMessagingProxy;
import com.devtodev.analytics.internal.modues.messaging.MessagingLogicProxy;
import com.devtodev.analytics.internal.modues.observers.AnalyticsObserver;
import com.devtodev.analytics.internal.modues.observers.IAnalyticsObserver;
import com.devtodev.analytics.internal.modues.people.IPeopleLogicProxy;
import com.devtodev.analytics.internal.modues.people.PeopleLogicProxy;
import com.devtodev.analytics.internal.modues.purchases.IPurchasesProxy;
import com.devtodev.analytics.internal.modues.purchases.PurchasesProxy;
import com.devtodev.analytics.internal.platform.IPlatform;
import com.devtodev.analytics.internal.queue.QueueManager;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.validator.ValidatorRules;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Core {

    @NotNull
    private static ABTestDefaultParamsCache abTestDefaultParamsCache;

    @NotNull
    private static final ABTestInitialData abTestInitialData;
    private static boolean coppaCompliant;
    private static boolean isInitialized;

    @NotNull
    private static final Object lock;

    @NotNull
    public static final Core INSTANCE = new Core();

    @NotNull
    private static IAnalyticsProxy analyticsProxy = new AnalyticsProxy();

    @NotNull
    private static IPeopleLogicProxy peopleProxy = new PeopleLogicProxy();

    @NotNull
    private static IMessagingProxy messagingProxy = new MessagingLogicProxy();

    @NotNull
    private static IPurchasesProxy purchasesProxy = new PurchasesProxy();

    @NotNull
    private static final IAbTestProxy abTestProxy = new AbTestLogicProxy();

    @NotNull
    private static IAntiCheatProxy antiCheatProxy = new AntiCheatProxy();

    @NotNull
    private static final IAnalyticsObserver analyticsObserver = new AnalyticsObserver();

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.core.Core$initialize$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l0 implements Function0<Unit> {
        final /* synthetic */ DTDRemoteConfigListener $abConfigListener;
        final /* synthetic */ DTDAnalyticsConfiguration $analyticsConfiguration;
        final /* synthetic */ String $appKey;
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DTDAnalyticsConfiguration dTDAnalyticsConfiguration, Context context, String str, DTDRemoteConfigListener dTDRemoteConfigListener) {
            super(0);
            this.$analyticsConfiguration = dTDAnalyticsConfiguration;
            this.$context = context;
            this.$appKey = str;
            this.$abConfigListener = dTDRemoteConfigListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.$analyticsConfiguration.getLogLevel() != DTDLogLevel.Unknown) {
                Logger.INSTANCE.setLogLevel(this.$analyticsConfiguration.getLogLevel());
            }
            Context baseContext = this.$context.getApplicationContext();
            ValidatorRules validatorRules = ValidatorRules.INSTANCE;
            String strValidateInitializeKey = validatorRules.validateInitializeKey(this.$appKey);
            DTDAnalyticsConfiguration dTDAnalyticsConfigurationValidateInitialize = validatorRules.validateInitialize(this.$analyticsConfiguration);
            if (strValidateInitializeKey == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
            CoreFactory coreFactory = new CoreFactory(baseContext);
            IPlatform platform = coreFactory.getPlatform();
            IRepository identifiersRepository = coreFactory.getIdentifiersRepository();
            IRepository devToDevUuidRepository = coreFactory.getDevToDevUuidRepository();
            IRepository toolsRepository = coreFactory.getToolsRepository();
            Core core = Core.INSTANCE;
            StateManager stateManager = new StateManager(new DeviceManager(platform, identifiersRepository, devToDevUuidRepository, toolsRepository, core.getCoppaCompliant()), new CoreManager(strValidateInitializeKey, coreFactory.getProjectRepository(), coreFactory.getUserStorage()), dTDAnalyticsConfigurationValidateInitialize.getUserId(), new Migration(strValidateInitializeKey, coreFactory, baseContext));
            AbTestManager abTestManager = new AbTestManager();
            EventController eventController = new EventController();
            ModulesFactory modulesFactory = new ModulesFactory(ServicesFactory.Companion.getInstance(stateManager, coreFactory, abTestManager, eventController, core.getAbTestInitialData(), core.getAbTestDefaultParamsCache()), eventController, this.$abConfigListener, baseContext);
            boolean z10 = this.$abConfigListener != null;
            core.injectModules(modulesFactory, coreFactory, z10);
            core.modulesPrepare(modulesFactory, z10);
            core.modulesOrderedInitialization(modulesFactory, dTDAnalyticsConfigurationValidateInitialize, z10);
            core.getAnalyticsObserver().finishInitialization();
        }
    }

    static {
        SdkConstraints.Companion companion = SdkConstraints.Companion;
        abTestInitialData = new ABTestInitialData(companion.getAbConfigWaiting(), companion.getAbGroupWaiting(), false, 4, null);
        abTestDefaultParamsCache = new ABTestDefaultParamsCache();
        lock = new Object();
        Logger.INSTANCE.setSdkVersion(companion.getSdkVersion());
    }

    private Core() {
    }

    public static /* synthetic */ void initialize$default(Core core, String str, DTDAnalyticsConfiguration dTDAnalyticsConfiguration, Context context, DTDRemoteConfigListener dTDRemoteConfigListener, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            dTDRemoteConfigListener = null;
        }
        core.initialize(str, dTDAnalyticsConfiguration, context, dTDRemoteConfigListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void injectModules(IModulesFactory iModulesFactory, ICoreFactory iCoreFactory, boolean z10) {
        if (z10) {
            abTestProxy.initialize(iModulesFactory.getAbTestLogic(), iCoreFactory.getLifeCycle());
        }
        analyticsProxy.initialize(iModulesFactory.getAnalyticsLogic(), iCoreFactory.getLifeCycle());
        antiCheatProxy.initialize(iModulesFactory.getAntiCheatLogic());
        analyticsObserver.addLogicReceiver(iModulesFactory.getAnalyticsLogic());
        peopleProxy.initialize(iModulesFactory.getPeopleLogic());
        messagingProxy.initialize(iModulesFactory.getMessagingLogic());
        purchasesProxy.initialize(iModulesFactory.getPurchasesLogic());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void modulesOrderedInitialization(ModulesFactory modulesFactory, DTDAnalyticsConfiguration dTDAnalyticsConfiguration, boolean z10) {
        if (z10) {
            modulesFactory.getAbTestLogic().startAbTestLogic();
        }
        modulesFactory.getAnalyticsLogic().applyAnalyticsConfiguration(dTDAnalyticsConfiguration);
        modulesFactory.getAnalyticsLogic().tryStartSDK();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void modulesPrepare(ModulesFactory modulesFactory, boolean z10) {
        if (z10) {
            modulesFactory.getAbTestLogic().prepareCallbacks();
        }
        modulesFactory.getAnalyticsLogic().prepareCallBacks();
        modulesFactory.getPeopleLogic().prepareCallBacks();
    }

    @NotNull
    public final ABTestDefaultParamsCache getAbTestDefaultParamsCache() {
        return abTestDefaultParamsCache;
    }

    @NotNull
    public final ABTestInitialData getAbTestInitialData() {
        return abTestInitialData;
    }

    @NotNull
    public final IAbTestProxy getAbTestProxy() {
        return abTestProxy;
    }

    @NotNull
    public final IAnalyticsObserver getAnalyticsObserver() {
        return analyticsObserver;
    }

    @NotNull
    public final IAnalyticsProxy getAnalyticsProxy() {
        return analyticsProxy;
    }

    @NotNull
    public final IAntiCheatProxy getAntiCheatProxy() {
        return antiCheatProxy;
    }

    public final boolean getCoppaCompliant() {
        return coppaCompliant;
    }

    @NotNull
    public final IMessagingProxy getMessagingProxy() {
        return messagingProxy;
    }

    @NotNull
    public final IPeopleLogicProxy getPeopleProxy() {
        return peopleProxy;
    }

    @NotNull
    public final IPurchasesProxy getPurchasesProxy() {
        return purchasesProxy;
    }

    public final void initialize(@NotNull String appKey, @NotNull DTDAnalyticsConfiguration analyticsConfiguration, @NotNull Context context, @Nullable DTDRemoteConfigListener dTDRemoteConfigListener) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(analyticsConfiguration, "analyticsConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (lock) {
            try {
                if (isInitialized) {
                    Logger.error$default(Logger.INSTANCE, "In the Initialize method an error has occurred: SDK is already initialized", null, 2, null);
                    return;
                }
                isInitialized = true;
                Unit unit = Unit.f312394a;
                QueueManager.Companion.runIncoming(new AnonymousClass2(analyticsConfiguration, context, appKey, dTDRemoteConfigListener));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isInitialized() {
        return isInitialized;
    }

    public final void setAbTestDefaultParamsCache(@NotNull ABTestDefaultParamsCache aBTestDefaultParamsCache) {
        Intrinsics.checkNotNullParameter(aBTestDefaultParamsCache, "<set-?>");
        abTestDefaultParamsCache = aBTestDefaultParamsCache;
    }

    public final void setAnalyticsProxy(@NotNull IAnalyticsProxy iAnalyticsProxy) {
        Intrinsics.checkNotNullParameter(iAnalyticsProxy, "<set-?>");
        analyticsProxy = iAnalyticsProxy;
    }

    public final void setAntiCheatProxy(@NotNull IAntiCheatProxy iAntiCheatProxy) {
        Intrinsics.checkNotNullParameter(iAntiCheatProxy, "<set-?>");
        antiCheatProxy = iAntiCheatProxy;
    }

    public final void setCoppaCompliant(boolean z10) {
        coppaCompliant = z10;
    }

    public final void setInitialized(boolean z10) {
        isInitialized = z10;
    }

    public final void setMessagingProxy(@NotNull IMessagingProxy iMessagingProxy) {
        Intrinsics.checkNotNullParameter(iMessagingProxy, "<set-?>");
        messagingProxy = iMessagingProxy;
    }

    public final void setPeopleProxy(@NotNull IPeopleLogicProxy iPeopleLogicProxy) {
        Intrinsics.checkNotNullParameter(iPeopleLogicProxy, "<set-?>");
        peopleProxy = iPeopleLogicProxy;
    }

    public final void setPurchasesProxy(@NotNull IPurchasesProxy iPurchasesProxy) {
        Intrinsics.checkNotNullParameter(iPurchasesProxy, "<set-?>");
        purchasesProxy = iPurchasesProxy;
    }
}
