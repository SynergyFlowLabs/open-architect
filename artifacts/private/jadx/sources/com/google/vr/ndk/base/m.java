package com.google.vr.ndk.base;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f127181a = "DaydreamUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f127182b = "com.google.intent.category.DAYDREAM";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f127183c = "com.google.intent.category.CARDBOARD";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f127184d = "com.google.intent.category.DAYDREAM_CONTROLLER_OPTIONAL";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f127185e;

    protected m() {
    }

    private static boolean a(PackageManager packageManager, ComponentName componentName, Intent intent) {
        ActivityInfo activityInfo;
        String str;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 128);
        if (listQueryIntentActivities != null) {
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && (str = activityInfo.name) != null && str.equals(componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(PackageManager packageManager, ComponentName componentName, String str) {
        Intent intent = new Intent();
        intent.setPackage(componentName.getPackageName());
        intent.addCategory(str);
        return a(packageManager, componentName, intent);
    }

    public static l c(Context context, ComponentName componentName) {
        return d(context.getPackageManager(), componentName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static l d(PackageManager packageManager, ComponentName componentName) {
        boolean zB = b(packageManager, componentName, "com.google.intent.category.DAYDREAM");
        ?? r10 = zB;
        if (b(packageManager, componentName, "com.google.intent.category.CARDBOARD")) {
            r10 = (zB ? 1 : 0) | 2;
        }
        int i10 = r10;
        if (b(packageManager, componentName, "com.google.intent.category.DAYDREAM_CONTROLLER_OPTIONAL")) {
            i10 = (r10 == true ? 1 : 0) | 4;
        }
        return new l(i10);
    }

    public static String e(com.google.vr.sdk.proto.nano.a.c cVar) {
        return cVar == null ? "" : f(cVar.x(), cVar.u());
    }

    public static String f(String str, String str2) {
        if (str == null || str2 == null) {
            return str2 != null ? str2 : "";
        }
        if (str.equals("Google, Inc.") || str.equals("Google")) {
            if (str2.equals("Cardboard v1")) {
                return "Google Cardboard";
            }
            if (str2.equals("Cardboard")) {
                return "Google Cardboard (I/O 2015)";
            }
        }
        return str2;
    }

    public static boolean g(Context context) {
        if (f127185e) {
            return true;
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance");
    }

    public static boolean h(com.google.vr.sdk.proto.nano.a.c cVar) {
        return (cVar == null || cVar.f129894t == null) ? false : true;
    }

    public static void i(boolean z10) {
        f127185e = z10;
    }
}
