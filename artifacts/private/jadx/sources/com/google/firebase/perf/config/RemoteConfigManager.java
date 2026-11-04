package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.h;
import com.google.firebase.remoteconfig.d0;
import com.google.firebase.remoteconfig.r;
import com.google.firebase.remoteconfig.y;
import com.google.firebase.v;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, y> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final e cache;
    private final Executor executor;

    @p0
    private r firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @p0
    private z8.b<d0> firebaseRemoteConfigProvider;
    private static final com.google.firebase.perf.logging.a logger = com.google.firebase.perf.logging.a.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @e.a({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(e.h(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(25000)) + 5000, getInitialStartupMillis());
    }

    public static /* synthetic */ void a(RemoteConfigManager remoteConfigManager, Exception exc) {
        remoteConfigManager.getClass();
        logger.m("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        remoteConfigManager.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    @l1
    static long getInitialStartupMillis() {
        v vVar;
        try {
            vVar = (v) h.p().l(v.class);
        } catch (IllegalStateException unused) {
            logger.a("Unable to get StartupTime instance.");
            vVar = null;
        }
        return vVar != null ? vVar.c() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private y getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            y yVar = this.allRcConfigMap.get(str);
            if (yVar.P() == 2) {
                logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", yVar.u(), str);
                return yVar;
            }
        }
        return null;
    }

    @l1
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j10) {
        return j10 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        return j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.p().k(this.executor, new com.google.android.gms.tasks.g() { // from class: com.google.firebase.perf.config.f
            @Override // com.google.android.gms.tasks.g
            public final void b(Object obj) {
                RemoteConfigManager remoteConfigManager = this.f123900a;
                remoteConfigManager.syncConfigValues(remoteConfigManager.firebaseRemoteConfig.q());
            }
        }).h(this.executor, new com.google.android.gms.tasks.f() { // from class: com.google.firebase.perf.config.g
            @Override // com.google.android.gms.tasks.f
            public final void d(Exception exc) {
                RemoteConfigManager.a(this.f123901a, exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.q());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public com.google.firebase.perf.util.f<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return com.google.firebase.perf.util.f.a();
        }
        y remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.util.f.e(Boolean.valueOf(remoteConfigValue.w()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.u().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.u(), str);
                }
            }
        }
        return com.google.firebase.perf.util.f.a();
    }

    @l1
    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public com.google.firebase.perf.util.f<Double> getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return com.google.firebase.perf.util.f.a();
        }
        y remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.util.f.e(Double.valueOf(remoteConfigValue.v()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.u().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.u(), str);
                }
            }
        }
        return com.google.firebase.perf.util.f.a();
    }

    public com.google.firebase.perf.util.f<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return com.google.firebase.perf.util.f.a();
        }
        y remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.util.f.e(Long.valueOf(remoteConfigValue.m()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.u().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.u(), str);
                }
            }
        }
        return com.google.firebase.perf.util.f.a();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t10) {
        y remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t10 instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.w());
                }
                if (t10 instanceof Double) {
                    return (T) Double.valueOf(remoteConfigValue.v());
                }
                if (!(t10 instanceof Long) && !(t10 instanceof Integer)) {
                    if (t10 instanceof String) {
                        return (T) remoteConfigValue.u();
                    }
                    T t11 = (T) remoteConfigValue.u();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t10);
                        return t11;
                    } catch (IllegalArgumentException unused) {
                        t10 = t11;
                        if (!remoteConfigValue.u().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.u(), str);
                        }
                        return t10;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.m());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t10;
    }

    public com.google.firebase.perf.util.f<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return com.google.firebase.perf.util.f.a();
        }
        y remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? com.google.firebase.perf.util.f.e(remoteConfigValue.u()) : com.google.firebase.perf.util.f.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        z8.b<d0> bVar;
        d0 d0Var;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (d0Var = bVar.get()) != null) {
            this.firebaseRemoteConfig = d0Var.e(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        r rVar = this.firebaseRemoteConfig;
        return rVar == null || rVar.t().c() == 1 || this.firebaseRemoteConfig.t().c() == 2;
    }

    public void setFirebaseRemoteConfigProvider(@p0 z8.b<d0> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l1
    public void syncConfigValues(Map<String, y> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        b.c cVarG = b.c.g();
        y yVar = this.allRcConfigMap.get(cVarG.e());
        if (yVar == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.o(cVarG.c(), yVar.w());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    @l1
    RemoteConfigManager(e eVar, Executor executor, r rVar, long j10, long j11) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = eVar;
        this.executor = executor;
        this.firebaseRemoteConfig = rVar;
        this.allRcConfigMap = rVar == null ? new ConcurrentHashMap<>() : new ConcurrentHashMap<>(rVar.q());
        this.appStartTimeInMs = j11;
        this.appStartConfigFetchDelayInMs = j10;
    }
}
