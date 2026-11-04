package com.google.vr.cardboard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes5.dex */
public class q {
    public static boolean a(String str) {
        return str != null && str.startsWith("com.google.");
    }

    public static boolean b(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            int i10 = applicationInfo != null ? applicationInfo.flags : 0;
            return ((i10 & 1) == 0 && (i10 & 128) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
