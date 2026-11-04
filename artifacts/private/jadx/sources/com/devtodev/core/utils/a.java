package com.devtodev.core.utils;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return 0;
        }
    }

    public static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        return context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }
}
