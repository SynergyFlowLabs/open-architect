package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1vSDK extends AFi1dSDK {
    private final AFc1dSDK getCurrencyIso4217Code;
    private final AFi1eSDK getMediationNetwork;

    public AFj1vSDK(Runnable runnable, AFc1dSDK aFc1dSDK, AFi1eSDK aFi1eSDK) {
        super("store", "huawei", aFc1dSDK.getRevenue(), runnable);
        this.getCurrencyIso4217Code = aFc1dSDK;
        this.getMediationNetwork = aFi1eSDK;
    }

    private boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMediationNetwork.getRevenue(context)) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMediationNetwork.AFAdRevenueData(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(Context context) {
        this.component1 = System.currentTimeMillis();
        this.component4 = AFj1qSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1qSDK.AnonymousClass5());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, str)));
        this.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, str));
        Cursor cursorQuery = null;
        try {
            int i10 = 5 >> 0;
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursorQuery == null) {
                this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "SERVICE_UNAVAILABLE");
            } else if (cursorQuery.moveToFirst()) {
                this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "OK");
                this.AFAdRevenueData.put("referrer", cursorQuery.getString(0));
                this.AFAdRevenueData.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                this.AFAdRevenueData.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                if (cursorQuery.getColumnCount() > 3) {
                    this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                    HashMap map = new HashMap();
                    String string = cursorQuery.getString(4);
                    if (string != null) {
                        map.put("track_id", string);
                    }
                    map.put("referrer_ex", cursorQuery.getString(5));
                    this.AFAdRevenueData.put("huawei_custom", map);
                }
            } else {
                this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "FEATURE_NOT_SUPPORTED");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th2) {
            try {
                this.AFAdRevenueData.put(io.sentry.protocol.n.f306405g, "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, th2.getMessage() != null ? th2.getMessage() : "", th2, false, true);
                if (0 != 0) {
                }
            } catch (Throwable th3) {
                if (0 == 0) {
                    throw th3;
                }
                cursorQuery.close();
                throw th3;
            }
        }
        getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(final Context context) {
        if (AFAdRevenueData(context)) {
            this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89724a.getCurrencyIso4217Code(context);
                }
            });
        }
    }
}
