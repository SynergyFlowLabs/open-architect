package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.m1;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class AFi1aSDK extends AFi1dSDK {
    public final Map<String, Object> getCurrencyIso4217Code;

    @NonNull
    final ExecutorService getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1aSDK$2, reason: invalid class name */
    final class AnonymousClass2 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        AnonymousClass2(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i10) {
            AFi1aSDK.this.getRevenue(installReferrerClient, context, i10);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i10) {
            ExecutorService executorService = AFi1aSDK.this.getMonetizationNetwork;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89687a.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i10);
                }
            });
        }
    }

    public AFi1aSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService, @NonNull AFc1pSDK aFc1pSDK) {
        super("store", "google", aFc1pSDK, runnable);
        this.getCurrencyIso4217Code = new HashMap();
        this.getMonetizationNetwork = executorService;
    }

    private boolean AFAdRevenueData(@NonNull Context context) {
        if (!getRevenue()) {
            return false;
        }
        try {
            if (AFj1iSDK.getMonetizationNetwork(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e10) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e10);
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
            StringBuilder sb2 = new StringBuilder("Class ");
            sb2.append("com.android.installreferrer.api.InstallReferrerClient");
            sb2.append(" not found");
            aFLogger.v(aFg1cSDK, sb2.toString());
            return false;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th2);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(Context context) {
        if (AFAdRevenueData(context)) {
            this.component1 = System.currentTimeMillis();
            this.component4 = AFj1qSDK.AFa1ySDK.STARTED;
            addObserver(new AFj1qSDK.AnonymousClass5());
            try {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Connecting to Install Referrer Library...");
                installReferrerClientBuild.startConnection(new AnonymousClass2(installReferrerClientBuild, context));
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "referrerClient -> startConnection", th2);
            }
        }
    }

    @l1
    @m1
    protected final void getRevenue(InstallReferrerClient installReferrerClient, Context context, int i10) {
        this.getCurrencyIso4217Code.put("code", String.valueOf(i10));
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, "com.android.vending")));
        this.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, "com.android.vending"));
        if (i10 == -1) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "SERVICE_DISCONNECTED");
        } else if (i10 == 0) {
            this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                aFLogger.d(aFg1cSDK, "InstallReferrer connected");
                if (!installReferrerClient.isReady()) {
                    aFLogger.w(aFg1cSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.getCurrencyIso4217Code.put(androidx.core.app.w.N0, "ReferrerClient: InstallReferrer is not ready");
                } else {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getCurrencyIso4217Code.put("val", installReferrer2);
                        this.AFAdRevenueData.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getCurrencyIso4217Code.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.AFAdRevenueData.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getCurrencyIso4217Code.put("install", Long.toString(installBeginTimestampSeconds));
                    this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap map = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getCurrencyIso4217Code.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e10) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e10);
                    }
                    try {
                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e11) {
                        AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "some method not exist", e11, false, false);
                    }
                    if (!map.isEmpty()) {
                        this.AFAdRevenueData.put("google_custom", map);
                    }
                    installReferrerClient.endConnection();
                }
            } catch (Throwable th2) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                StringBuilder sb2 = new StringBuilder("Failed to get install referrer: ");
                sb2.append(th2.getMessage());
                aFLogger2.w(aFg1cSDK2, sb2.toString());
                this.getCurrencyIso4217Code.put(androidx.core.app.w.N0, th2.getMessage());
                aFLogger2.e(aFg1cSDK2, "Failed to get install referrer", th2, false, false);
            }
        } else if (i10 == 1) {
            this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer not supported");
        } else if (i10 == 2) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "FEATURE_NOT_SUPPORTED");
        } else if (i10 != 3) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install Referrer collected locally");
        getMediationNetwork();
    }
}
