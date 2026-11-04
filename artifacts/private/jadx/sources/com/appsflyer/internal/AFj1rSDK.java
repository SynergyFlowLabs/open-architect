package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.l1;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1rSDK extends AFj1qSDK {
    final ProviderInfo getMediationNetwork;
    private final AFc1dSDK getMonetizationNetwork;

    public AFj1rSDK(ProviderInfo providerInfo, Runnable runnable, AFc1dSDK aFc1dSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMonetizationNetwork = aFc1dSDK;
        this.getMediationNetwork = providerInfo;
    }

    @l1
    @androidx.annotation.p0
    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e10, false, true, false);
            return null;
        } catch (Throwable th2) {
            boolean z10 = true & false;
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th2, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(final Context context) {
        this.getMonetizationNetwork.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1rSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursorQuery;
                AFj1rSDK aFj1rSDK = AFj1rSDK.this;
                aFj1rSDK.component1 = System.currentTimeMillis();
                aFj1rSDK.component4 = AFj1qSDK.AFa1ySDK.STARTED;
                aFj1rSDK.addObserver(new AFj1qSDK.AnonymousClass5());
                StringBuilder sb2 = new StringBuilder("content://");
                sb2.append(AFj1rSDK.this.getMediationNetwork.authority);
                sb2.append("/transaction_id");
                Uri uri = Uri.parse(sb2.toString());
                ContentProviderClient contentProviderClientB_ = AFj1rSDK.B_(context, uri);
                try {
                    if (contentProviderClientB_ != null) {
                        try {
                            try {
                                StringBuilder sb3 = new StringBuilder("app_id=");
                                sb3.append(context.getPackageName());
                                cursorQuery = contentProviderClientB_.query(uri, null, sb3.toString(), null, null);
                                contentProviderClientB_.close();
                            } catch (DeadObjectException e10) {
                                AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e10, false, true, false);
                                contentProviderClientB_.close();
                                cursorQuery = null;
                            }
                        } catch (RemoteException e11) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e11, false, true, false);
                            contentProviderClientB_.close();
                            cursorQuery = null;
                        } catch (Throwable th2) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th2, false, true, false);
                            contentProviderClientB_.close();
                            cursorQuery = null;
                        }
                    } else {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        int columnIndex = cursorQuery.getColumnIndex("transaction_id");
                        if (columnIndex == -1) {
                            AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "Wrong column name");
                            AFj1rSDK.this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "FEATURE_NOT_SUPPORTED");
                        } else {
                            AFj1rSDK.this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "OK");
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(columnIndex);
                                cursorQuery.close();
                                if (string != null && !string.isEmpty()) {
                                    AFj1rSDK.this.AFAdRevenueData.put("referrer", string);
                                }
                            }
                        }
                        cursorQuery.close();
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                        AFj1rSDK.this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "SERVICE_UNAVAILABLE");
                    }
                    AFj1rSDK aFj1rSDK2 = AFj1rSDK.this;
                    aFj1rSDK2.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1rSDK2.getMediationNetwork).packageName)));
                    AFj1rSDK aFj1rSDK3 = AFj1rSDK.this;
                    aFj1rSDK3.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, ((PackageItemInfo) aFj1rSDK3.getMediationNetwork).packageName));
                    AFj1rSDK.this.getMediationNetwork();
                } catch (Throwable th3) {
                    contentProviderClientB_.close();
                    throw th3;
                }
            }
        });
    }
}
