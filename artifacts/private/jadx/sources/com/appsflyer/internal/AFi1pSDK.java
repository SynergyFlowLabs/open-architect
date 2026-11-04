package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AFi1pSDK {

    @NotNull
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);

    @Nullable
    ConnectivityManager getMonetizationNetwork;

    @Nullable
    private final TelephonyManager getRevenue;

    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFi1pSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("connectivity");
        this.getMonetizationNetwork = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.getRevenue = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    protected static boolean v_(@Nullable NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.isConnectedOrConnecting();
        }
        return false;
    }

    @NotNull
    public final AFi1rSDK getMediationNetwork() {
        Throwable th2;
        String str;
        String simOperatorName;
        String networkOperatorName = null;
        try {
            TelephonyManager telephonyManager = this.getRevenue;
            if (telephonyManager != null) {
                simOperatorName = telephonyManager.getSimOperatorName();
                try {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    if (networkOperatorName == null || networkOperatorName.length() == 0) {
                        if (telephonyManager.getPhoneType() == 2) {
                            networkOperatorName = "CDMA";
                        }
                    }
                } catch (Throwable th3) {
                    str = networkOperatorName;
                    networkOperatorName = simOperatorName;
                    th2 = th3;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th2);
                    simOperatorName = networkOperatorName;
                    networkOperatorName = str;
                }
            } else {
                simOperatorName = null;
            }
        } catch (Throwable th4) {
            th2 = th4;
            str = null;
        }
        return new AFi1rSDK(getRevenue(), networkOperatorName, simOperatorName, getMonetizationNetwork());
    }

    public abstract boolean getMonetizationNetwork();

    @NotNull
    protected abstract String getRevenue();
}
