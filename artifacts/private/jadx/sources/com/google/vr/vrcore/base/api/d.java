package com.google.vr.vrcore.base.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@s9.a
public final class d {
    public static int a(Context context) {
        return b(context);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:0: B:23:0x0057->B:42:?, LOOP_END, SYNTHETIC] */
    private static int b(Context context) {
        List<PackageInstaller.SessionInfo> allSessions;
        Iterator<PackageInstaller.SessionInfo> it;
        int i10 = 2 ^ 0;
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            return 0;
        }
        try {
            try {
                try {
                    if (context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 0).enabled) {
                        return !g(context) ? 9 : 0;
                    }
                    return 2;
                } catch (RuntimeException e10) {
                    new StringBuilder(String.valueOf(e10).length() + 45);
                    allSessions = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                allSessions = context.getPackageManager().getPackageInstaller().getAllSessions();
                if (allSessions != null) {
                    it = allSessions.iterator();
                    while (it.hasNext()) {
                        if ("com.google.vr.vrcore".equals(it.next().getAppPackageName())) {
                            return 3;
                        }
                    }
                }
                if (context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 8192).enabled) {
                    return 3;
                }
                return 1;
            }
            if (context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 8192).enabled) {
                return 3;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        new StringBuilder(String.valueOf(e10).length() + 45);
        allSessions = null;
        if (allSessions != null) {
            it = allSessions.iterator();
            while (it.hasNext()) {
                if ("com.google.vr.vrcore".equals(it.next().getAppPackageName())) {
                    return 3;
                }
            }
        }
        return 1;
    }

    public static String c(int i10) {
        switch (i10) {
            case 0:
                return "VR Service present";
            case 1:
                return "VR Service missing";
            case 2:
                return "VR Service disabled";
            case 3:
                return "VR Service updating";
            case 4:
                return "VR Service obsolete";
            case 5:
                return "VR Service not connected";
            case 6:
                return "No permission to do operation";
            case 7:
                return "This operation is not supported on this device";
            case 8:
                return "An unknown failure occurred";
            default:
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Invalid connection result: ");
                sb2.append(i10);
                return sb2.toString();
        }
    }

    @s9.a
    public static int d(Context context) throws c {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (!applicationInfo.enabled) {
                throw new c(2);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                return bundle.getInt("com.google.vr.vrcore.ClientApiVersion", 0);
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new c(a(context));
        }
    }

    public static String e(Context context) throws c {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (applicationInfo == null) {
                throw new c(8);
            }
            if (!applicationInfo.enabled) {
                throw new c(2);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                throw new c(4);
            }
            String string = bundle.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
            if (string.isEmpty()) {
                throw new c(4);
            }
            return string.substring(1);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new c(a(context));
        }
    }

    public static boolean f(String str) {
        return "com.google.vr.vrcore".equalsIgnoreCase(str);
    }

    private static boolean g(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.vr.vrcore", 64);
        if (b.b(packageInfo, b.f129944a)) {
            int i10 = 3 | 1;
            return true;
        }
        if (a.b(context)) {
            return b.b(packageInfo, b.f129945b);
        }
        return false;
    }
}
