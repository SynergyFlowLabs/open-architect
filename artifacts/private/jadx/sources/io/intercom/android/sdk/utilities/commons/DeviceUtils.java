package io.intercom.android.sdk.utilities.commons;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes13.dex */
public class DeviceUtils {
    public static String getAppMinSdkVersionVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return "";
        }
    }

    public static String getAppName(Context context) {
        String packageName = context.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        return packageName;
    }

    public static String getAppVersion(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str != null) {
                return str;
            }
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
        }
        return "";
    }

    public static boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
