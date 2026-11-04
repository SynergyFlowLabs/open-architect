package com.devtodev.core.utils;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static String a(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0 ? ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName() : "";
    }

    @e.a({"MissingPermission", "HardwareIds"})
    public static String b(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0 ? ((TelephonyManager) context.getSystemService("phone")).getDeviceId() : "";
    }

    @e.a({"HardwareIds"})
    public static String c(Context context) {
        String macAddress;
        return (context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") != 0 || (macAddress = ((WifiManager) context.getApplicationContext().getSystemService(com.segment.analytics.kotlin.android.plugins.a.f266549p2)).getConnectionInfo().getMacAddress()) == null) ? "" : macAddress;
    }

    public static int d(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            try {
                return Integer.parseInt(((TelephonyManager) context.getSystemService("phone")).getNetworkOperator());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0;
    }
}
