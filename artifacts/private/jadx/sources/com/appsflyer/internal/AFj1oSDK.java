package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1oSDK extends AFi1dSDK {
    public AFj1oSDK(AFc1pSDK aFc1pSDK, Runnable runnable) {
        super("store", "xiaomi", aFc1pSDK, runnable);
    }

    private boolean getCurrencyIso4217Code() {
        if (!getRevenue()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            int i10 = 3 | 1;
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
            StringBuilder sb2 = new StringBuilder("Class ");
            sb2.append("com.miui.referrer.api.GetAppsReferrerClient");
            sb2.append(" not found");
            aFLogger.v(aFg1cSDK, sb2.toString());
            return false;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th2);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(final Context context) {
        if (getCurrencyIso4217Code()) {
            this.component1 = System.currentTimeMillis();
            this.component4 = AFj1qSDK.AFa1ySDK.STARTED;
            addObserver(new AFj1qSDK.AnonymousClass5());
            final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
            getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1oSDK.3
                public final void onGetAppsReferrerSetupFinished(int i10) {
                    AFj1oSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, "com.xiaomi.mipicks")));
                    AFj1oSDK.this.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, "com.xiaomi.mipicks"));
                    if (i10 == -1) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFj1oSDK.this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "SERVICE_DISCONNECTED");
                    } else if (i10 == 0) {
                        AFj1oSDK aFj1oSDK = AFj1oSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = getAppsReferrerClientBuild;
                        aFj1oSDK.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "OK");
                        try {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                            aFLogger.d(aFg1cSDK, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFj1oSDK.AFAdRevenueData.put("referrer", installReferrer2);
                                }
                                aFj1oSDK.AFAdRevenueData.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFj1oSDK.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap map = new HashMap();
                                map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                map.put("install_version", installReferrer.getInstallVersion());
                                aFj1oSDK.AFAdRevenueData.put("xiaomi_custom", map);
                            } else {
                                aFLogger.w(aFg1cSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th2) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                            StringBuilder sb2 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb2.append(th2.getMessage());
                            aFLogger2.w(aFg1cSDK2, sb2.toString());
                        }
                    } else if (i10 == 1) {
                        AFj1oSDK.this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i10 == 2) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFj1oSDK.this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "FEATURE_NOT_SUPPORTED");
                    } else if (i10 == 3) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1oSDK.this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "DEVELOPER_ERROR");
                    } else if (i10 != 4) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "responseCode not found.");
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1oSDK.this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "PERMISSION_ERROR");
                    }
                    AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFj1oSDK.this.getMediationNetwork();
                    getAppsReferrerClientBuild.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
