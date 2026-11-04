package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioTrack;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFc1eSDK implements AFc1dSDK {
    private static final int getMediationNetwork = (int) TimeUnit.SECONDS.toMillis(30);
    private AFe1zSDK AFInAppEventParameterName;
    private AFf1gSDK AFInAppEventType;
    private AFd1uSDK AFKeystoreWrapper;
    private AFc1vSDK AFLogger;
    private AFh1uSDK AFPurchaseDetails;
    private AFa1oSDK afDebugLog;
    private AFa1gSDK afErrorLog;
    private AFa1aSDK afInfoLog;
    private AFe1uSDK afLogForce;

    @androidx.annotation.p0
    private AFi1fSDK afRDLog;
    private AFf1dSDK afVerboseLog;
    private AFg1bSDK afWarnLog;
    private AFc1pSDK areAllFieldsValid;
    private PurchaseHandler component1;
    private AFc1jSDK component2;
    private AFf1oSDK component3;
    private AFd1lSDK component4;
    private AFg1qSDK copy;
    private AFh1vSDK copydefault;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AFj1fSDK f89666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AFb1bSDK f89667e;
    private AFd1pSDK equals;
    private AFg1vSDK force;
    private ExecutorService getCurrencyIso4217Code;
    private AFc1kSDK getLevel;
    private ScheduledExecutorService getMonetizationNetwork;
    private ExecutorService getRevenue;
    private AFj1lSDK hashCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AFg1uSDK f89668i;
    private AFj1sSDK registerClient;
    private AFe1lSDK toString;
    private AFi1lSDK unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AFi1kSDK f89669v;
    private AFg1xSDK values;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AFi1tSDK f89670w;
    private String afErrorLogForExcManagerOnly = null;
    public final AFc1iSDK AFAdRevenueData = new AFc1iSDK();

    static class AFa1ySDK implements ThreadFactory {
        private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
        private final AtomicInteger getMonetizationNetwork = new AtomicInteger();

        public AFa1ySDK() {
            getCurrencyIso4217Code.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i10 = getCurrencyIso4217Code.get();
            int iIncrementAndGet = this.getMonetizationNetwork.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i10);
            sb2.append("-");
            sb2.append(iIncrementAndGet);
            return new Thread(runnable, sb2.toString());
        }
    }

    @NonNull
    private synchronized ExecutorService AFLoggerLogLevel() {
        try {
            if (this.getCurrencyIso4217Code == null) {
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "");
                this.getCurrencyIso4217Code = executorServiceNewSingleThreadExecutor;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getCurrencyIso4217Code;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    /* JADX INFO: renamed from: AFPurchaseDetails, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1uSDK afRDLog() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFd1uSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFKeystoreWrapper;
    }

    @NonNull
    private synchronized AFd1lSDK afLogForce() {
        try {
            if (this.component4 == null) {
                this.component4 = new AFd1lSDK(new AFd1jSDK(getMediationNetwork), getMonetizationNetwork());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component4;
    }

    @NonNull
    private synchronized AFj1fSDK getLevel() {
        try {
            if (this.f89666d == null) {
                this.f89666d = new AFj1fSDK(getRevenue());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f89666d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences m_() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context != null) {
            return AFa1tSDK.c_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @NonNull
    private String valueOf() {
        if (this.afErrorLogForExcManagerOnly == null) {
            this.afErrorLogForExcManagerOnly = new AFa1vSDK().getMonetizationNetwork();
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @NonNull
    private synchronized AFg1xSDK values() {
        try {
            if (this.values == null) {
                this.values = new AFg1xSDK(AFInAppEventType(), getRevenue());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized ScheduledExecutorService AFAdRevenueData() {
        try {
            if (this.getMonetizationNetwork == null) {
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
                Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "");
                this.getMonetizationNetwork = scheduledExecutorServiceNewScheduledThreadPool;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFc1vSDK AFInAppEventParameterName() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFc1tSDK(AFInAppEventType(), component2());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFc1iSDK AFInAppEventType() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFe1zSDK AFKeystoreWrapper() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFe1zSDK(getRevenue(), component2());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFj1sSDK AFLogger() {
        try {
            if (this.registerClient == null) {
                this.registerClient = new AFj1sSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFb1bSDK afDebugLog() {
        if (this.f89667e == null) {
            ExecutorService executorServiceAFLoggerLogLevel = AFLoggerLogLevel();
            ScheduledExecutorService scheduledExecutorServiceAFAdRevenueData = AFAdRevenueData();
            AFa1oSDK aFa1oSDKD = d();
            if (this.f89669v == null) {
                this.f89669v = new AFi1oSDK();
            }
            this.f89667e = new AFb1aSDK(executorServiceAFLoggerLogLevel, scheduledExecutorServiceAFAdRevenueData, aFa1oSDKD, this.f89669v);
        }
        return this.f89667e;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFf1dSDK afErrorLog() {
        if (this.afVerboseLog == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            AFf1bSDK aFf1bSDK = new AFf1bSDK(context, AppsFlyerProperties.getInstance());
            if (this.getLevel == null) {
                this.getLevel = new AFc1kSDK();
            }
            this.afVerboseLog = new AFf1fSDK(aFf1bSDK, this.getLevel, AppsFlyerProperties.getInstance());
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @androidx.annotation.p0
    public final AFh1uSDK afErrorLogForExcManagerOnly() {
        if (AFh1sSDK.getCurrencyIso4217Code() && this.AFPurchaseDetails == null) {
            this.AFPurchaseDetails = new AFh1pSDK(getRevenue(), AFLogger());
        }
        return this.AFPurchaseDetails;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFc1kSDK afInfoLog() {
        if (this.getLevel == null) {
            this.getLevel = new AFc1kSDK();
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFa1gSDK afVerboseLog() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new AFa1lSDK(component2());
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFb1hSDK afWarnLog() {
        if (this.getLevel == null) {
            this.getLevel = new AFc1kSDK();
        }
        return new AFb1cSDK(this.getLevel, AFInAppEventType(), registerClient());
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFh1vSDK areAllFieldsValid() {
        try {
            if (this.copydefault == null) {
                this.copydefault = new AFh1vSDK(component2());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFf1oSDK component1() {
        try {
            if (this.component3 == null) {
                AFf1lSDK aFf1lSDK = new AFf1lSDK(component2());
                this.component3 = new AFf1oSDK(new AFf1pSDK(), getRevenue(), registerClient(), aFf1lSDK, new AFd1oSDK(afLogForce(), getRevenue(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), getLevel()), new AFf1iSDK(getRevenue(), aFf1lSDK), copydefault());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFc1qSDK component2() {
        if (this.component2 == null) {
            this.component2 = new AFc1jSDK(new AFc1hSDK(new Function0() { // from class: com.appsflyer.internal.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f89723a.m_();
                }
            }));
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFg1qSDK component3() {
        if (this.copy == null) {
            String strValueOf = valueOf();
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFi1mSDK();
            }
            AFi1lSDK aFi1lSDK = this.unregisterClient;
            if (this.f89668i == null) {
                this.f89668i = new AFg1sSDK();
            }
            AFg1uSDK aFg1uSDK = this.f89668i;
            if (this.hashCode == null) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.hashCode = new AFj1nSDK(context2, AFLoggerLogLevel());
            }
            AFj1lSDK aFj1lSDK = this.hashCode;
            if (this.force == null) {
                this.force = new AFg1tSDK();
            }
            AFg1vSDK aFg1vSDK = this.force;
            AFh1vSDK aFh1vSDKAreAllFieldsValid = areAllFieldsValid();
            AFc1qSDK aFc1qSDKComponent2 = component2();
            AFc1pSDK revenue = getRevenue();
            if (this.f89670w == null) {
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.f89670w = new AFi1tSDK(context3);
            }
            AFi1tSDK aFi1tSDK = this.f89670w;
            AFf1gSDK aFf1gSDKRegisterClient = registerClient();
            AFc1iSDK aFc1iSDKAFInAppEventType = AFInAppEventType();
            AFg1xSDK aFg1xSDKValues = values();
            if (this.getLevel == null) {
                this.getLevel = new AFc1kSDK();
            }
            this.copy = new AFg1oSDK(strValueOf, context, aFi1lSDK, aFg1uSDK, aFj1lSDK, aFg1vSDK, aFh1vSDKAreAllFieldsValid, aFc1qSDKComponent2, revenue, aFi1tSDK, aFf1gSDKRegisterClient, aFc1iSDKAFInAppEventType, aFg1xSDKValues, this.getLevel);
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized PurchaseHandler component4() {
        try {
            if (this.component1 == null) {
                this.component1 = new PurchaseHandler(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFd1pSDK copy() {
        try {
            if (this.equals == null) {
                this.equals = new AFd1kSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFe1lSDK copydefault() {
        try {
            if (this.toString == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1eSDK.3
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1ySDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.m
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        AFc1eSDK.getMediationNetwork(runnable, threadPoolExecutor2);
                    }
                });
                this.toString = new AFe1lSDK(threadPoolExecutor);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFa1oSDK d() {
        try {
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFa1oSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFa1aSDK e() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFa1bSDK(AFInAppEventType());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFj1lSDK equals() {
        if (this.hashCode == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.hashCode = new AFj1nSDK(context, AFLoggerLogLevel());
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @m1
    @androidx.annotation.p0
    public final AFi1fSDK force() {
        try {
            if (this.afRDLog == null) {
                try {
                    Object[] objArr = {getRevenue(), AFInAppEventType(), registerClient()};
                    int i10 = 0 << 0;
                    Map map = AFi1jSDK.f89681e;
                    Object declaredConstructor = map.get(-9506129);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1jSDK.AFAdRevenueData((-16777216) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getDeclaredConstructor(AFc1pSDK.class, AFc1iSDK.class, AFf1gSDK.class);
                        map.put(-9506129, declaredConstructor);
                    }
                    this.afRDLog = (AFi1fSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.PLAY_INTEGRITY_API, th3.getMessage() != null ? th3.getMessage() : "", th3, false, false);
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFd1oSDK getCurrencyIso4217Code() {
        return new AFd1oSDK(afLogForce(), getRevenue(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), getLevel());
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFe1uSDK getMediationNetwork() {
        if (this.afLogForce == null) {
            this.afLogForce = new AFe1uSDK(component2(), AFInAppEventType(), getRevenue(), getMonetizationNetwork(), component3(), registerClient(), copydefault());
        }
        return this.afLogForce;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized ExecutorService getMonetizationNetwork() {
        try {
            if (this.getRevenue == null) {
                this.getRevenue = new AFc1oSDK(0, 5, 60L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFc1pSDK getRevenue() {
        try {
            if (this.areAllFieldsValid == null) {
                AFc1iSDK aFc1iSDKAFInAppEventType = AFInAppEventType();
                AFc1qSDK aFc1qSDKComponent2 = component2();
                if (this.getLevel == null) {
                    this.getLevel = new AFc1kSDK();
                }
                this.areAllFieldsValid = new AFc1pSDK(aFc1iSDKAFInAppEventType, aFc1qSDKComponent2, this.getLevel, getMonetizationNetwork());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFi1tSDK i() {
        if (this.f89670w == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.f89670w = new AFi1tSDK(context);
        }
        return this.f89670w;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFf1gSDK registerClient() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFf1gSDK(AFInAppEventType(), new AFf1eSDK());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFi1lSDK unregisterClient() {
        if (this.unregisterClient == null) {
            this.unregisterClient = new AFi1mSDK();
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFg1bSDK v() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFg1aSDK(this);
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFi1kSDK w() {
        if (this.f89669v == null) {
            this.f89669v = new AFi1oSDK();
        }
        return this.f89669v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e10) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e10);
            Thread.currentThread().interrupt();
        }
    }
}
