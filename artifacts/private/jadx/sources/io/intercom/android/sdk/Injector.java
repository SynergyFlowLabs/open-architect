package io.intercom.android.sdk;

import android.app.Application;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.exceptions.IntercomIntegrationException;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.user.UserUpdaterHelper;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.FirstMessageUtilsKt;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.SystemSettings;
import io.intercom.android.sdk.utilities.UuidStringProvider;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* JADX INFO: loaded from: classes13.dex */
public class Injector {
    private static final Twig TWIG = LumberMill.getLogger();

    @e.a({"StaticFieldLeak"})
    @p0
    private static Injector instance;
    private AppIdentityInjector appIdentityInjector;
    private final Application application;

    @p0
    private IntercomDataLayer dataLayer;

    @p0
    private ErrorReporter errorReporter;

    @p0
    private com.google.gson.f gson;

    @p0
    private LifecycleTracker lifecycleTracker;

    @p0
    private MetricTracker metricTracker;

    @p0
    private MetricsStore metricsStore;

    @p0
    private OpsMetricTracker opsMetricTracker;

    @p0
    private OverlayPresenter overlayPresenter;

    @p0
    private ResetManager resetManager;

    @p0
    private DeDuper superDeDuper;

    @p0
    private UnreadConversationsTracker unreadConversationsTracker;
    private final UserIdentity userIdentity;

    @p0
    private UserUpdater userUpdater;

    @p0
    private UserUpdaterHelper userUpdaterHelper;
    private final ActivityFinisher activityFinisher = new ActivityFinisher();
    private final Provider<AppConfig> appConfigProvider = new Provider<AppConfig>() { // from class: io.intercom.android.sdk.Injector.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.intercom.android.sdk.Provider
        public AppConfig get() {
            return Injector.this.dataLayer.getConfig().getValue();
        }
    };
    private final Provider<NexusClient> nexusClientProvider = new Provider() { // from class: io.intercom.android.sdk.x
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return this.f294211a.getNexusClient();
        }
    };
    private final Provider<UserUpdater> userUpdaterProvider = new Provider() { // from class: io.intercom.android.sdk.y
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return this.f294212a.getUserUpdater();
        }
    };
    private final Provider<Api> apiProvider = new Provider() { // from class: io.intercom.android.sdk.z
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return this.f294213a.getApi();
        }
    };
    private final Provider<UserIdentity> userIdentityProvider = new Provider() { // from class: io.intercom.android.sdk.a0
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return this.f291511a.getUserIdentity();
        }
    };
    private final Provider<MetricTracker> metricTrackerProvider = new Provider() { // from class: io.intercom.android.sdk.b0
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return this.f291522a.getMetricTracker();
        }
    };
    private final s0 applicationScope = t0.a(q3.a(null));

    protected Injector(Application application, UserIdentity userIdentity, String str, String str2, @p0 String str3) {
        this.application = application;
        this.userIdentity = userIdentity;
        this.appIdentityInjector = new AppIdentityInjector(application, str, str2, str3);
    }

    public static synchronized Injector get() {
        Injector injector;
        try {
            injector = instance;
            if (injector == null) {
                throw new IntercomIntegrationException("Intercom was not initialized correctly, Intercom.initialize() needs to be called in onCreate() in your Application class.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return injector;
    }

    public static synchronized void initIfCachedCredentials(Application application) {
        try {
            if (instance != null) {
                return;
            }
            AppIdentity appIdentityLoadFromDevice = AppIdentity.loadFromDevice(application);
            String strApiKey = appIdentityLoadFromDevice.apiKey();
            String strAppId = appIdentityLoadFromDevice.appId();
            if (!strAppId.isEmpty() && !strApiKey.isEmpty()) {
                initWithAppCredentials(application, strApiKey, strAppId);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void initWithAppCredentials(Application application, String str, String str2) {
        try {
            if (instance != null) {
                return;
            }
            TWIG.internal("Injector", "Initializing");
            Injector injector = new Injector(application, new UserIdentity(application), str, str2, null);
            instance = injector;
            application.registerActivityLifecycleCallbacks(injector.getLifecycleTracker());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized boolean isNotInitialised() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return instance == null;
    }

    @l1
    static void setSharedInstance(Injector injector) {
        instance = injector;
    }

    public synchronized void changeWorkspace(String str, String str2) {
        try {
            TWIG.internal("Injector", "Switching workspace");
            getResetManager().hardReset();
            this.appIdentityInjector.destroy();
            int i10 = 4 | 0;
            AppIdentityInjector appIdentityInjector = new AppIdentityInjector(getApplication(), str, str2, null);
            this.appIdentityInjector = appIdentityInjector;
            appIdentityInjector.initializeEvents();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public AblyManager getAblyManager() {
        return this.appIdentityInjector.getAblyManager();
    }

    public ActivityFinisher getActivityFinisher() {
        return this.activityFinisher;
    }

    public Api getApi() {
        return this.appIdentityInjector.getApi();
    }

    public Provider<Api> getApiProvider() {
        return this.apiProvider;
    }

    public Provider<AppConfig> getAppConfigProvider() {
        return this.appConfigProvider;
    }

    public AppIdentity getAppIdentity() {
        return this.appIdentityInjector.getAppIdentity();
    }

    public Application getApplication() {
        return this.application;
    }

    public synchronized IntercomDataLayer getDataLayer() {
        try {
            if (this.dataLayer == null) {
                this.dataLayer = new IntercomDataLayer(this.application, this.applicationScope);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.dataLayer;
    }

    public synchronized DeDuper getDeDuper() {
        try {
            if (this.superDeDuper == null) {
                DeDuper deDuper = new DeDuper(this.appConfigProvider, this.application.getSharedPreferences(PreferenceKeys.INTERCOM_DEDUPER_PREFS, 0));
                this.superDeDuper = deDuper;
                deDuper.readPersistedCachedAttributes();
            }
        } finally {
        }
        return this.superDeDuper;
    }

    public synchronized ErrorReporter getErrorReporter() {
        try {
            if (this.errorReporter == null) {
                this.errorReporter = ErrorReporter.create(this.application, getGson(), this.apiProvider);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.errorReporter;
    }

    public ExternalUploadApi getExternalUploadApi() {
        return this.appIdentityInjector.getExternalUploadApi();
    }

    public synchronized com.google.gson.f getGson() {
        try {
            if (this.gson == null) {
                this.gson = new com.google.gson.f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.gson;
    }

    public HelpCenterApi getHelpCenterApi() {
        return this.appIdentityInjector.getHelpCenterApi();
    }

    public synchronized LifecycleTracker getLifecycleTracker() {
        try {
            if (this.lifecycleTracker == null) {
                this.lifecycleTracker = LifecycleTracker.create(getMetricsStore(), getErrorReporter(), getDeDuper(), getTimeProvider(), getResetManager(), SystemSettings.getTransitionScale(this.application), getApiProvider(), getDataLayer(), getUserUpdaterHelper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.lifecycleTracker;
    }

    public MessengerApi getMessengerApi() {
        return this.appIdentityInjector.getMessengerApi();
    }

    public synchronized MetricTracker getMetricTracker() {
        try {
            if (this.metricTracker == null) {
                this.metricTracker = new MetricTracker(this.userIdentity, getMetricsStore(), getApplication());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.metricTracker;
    }

    public synchronized MetricsStore getMetricsStore() {
        try {
            if (this.metricsStore == null) {
                this.metricsStore = new MetricsStore(getApplication(), getApiProvider(), this.appConfigProvider);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.metricsStore;
    }

    public NexusClient getNexusClient() {
        return this.appIdentityInjector.getNexusClient();
    }

    public Provider<NexusClient> getNexusClientProvider() {
        return this.nexusClientProvider;
    }

    public synchronized OpsMetricTracker getOpsMetricTracker() {
        try {
            if (this.opsMetricTracker == null) {
                this.opsMetricTracker = new OpsMetricTracker(getMetricsStore(), getTimeProvider(), UuidStringProvider.SYSTEM);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.opsMetricTracker;
    }

    public synchronized OverlayPresenter getOverlayPresenter() {
        try {
            if (this.overlayPresenter == null) {
                this.overlayPresenter = new OverlayPresenter(getApplication(), this.appConfigProvider, getMetricTracker(), this.userIdentity, getDataLayer(), getApiProvider());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.overlayPresenter;
    }

    public synchronized ResetManager getResetManager() {
        try {
            if (this.resetManager == null) {
                this.resetManager = new ResetManager(getApiProvider(), getUserIdentity(), getOverlayPresenter(), this.appConfigProvider, this.application, this.activityFinisher, getDataLayer(), getUnreadConversationsTracker());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.resetManager;
    }

    public SurveyApi getSurveyApi() {
        return this.appIdentityInjector.getSurveyApi();
    }

    public TicketApi getTicketApi() {
        return this.appIdentityInjector.getTicketApi();
    }

    public TimeProvider getTimeProvider() {
        return TimeProvider.SYSTEM;
    }

    public synchronized UnreadConversationsTracker getUnreadConversationsTracker() {
        try {
            if (this.unreadConversationsTracker == null) {
                this.unreadConversationsTracker = new UnreadConversationsTracker(this.metricTrackerProvider);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.unreadConversationsTracker;
    }

    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    public synchronized UserUpdater getUserUpdater() {
        try {
            if (this.userUpdater == null) {
                this.userUpdater = new UserUpdater(getApiProvider(), getOpsMetricTracker(), getDataLayer());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.userUpdater;
    }

    public synchronized UserUpdaterHelper getUserUpdaterHelper() {
        try {
            if (this.userUpdaterHelper == null) {
                this.userUpdaterHelper = new UserUpdaterHelper(this.userUpdaterProvider, getDataLayer(), this.userIdentityProvider);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.userUpdaterHelper;
    }

    public Provider<UserUpdater> getUserUpdaterProvider() {
        return this.userUpdaterProvider;
    }

    public void initializeIntercomEventsListeners() {
        FirstMessageUtilsKt.handleFirstMessageToast(this.applicationScope, LumberMill.getLogger(), this.application, getDataLayer());
        this.appIdentityInjector.initializeEvents();
    }
}
