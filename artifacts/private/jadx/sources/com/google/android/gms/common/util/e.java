package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class e {
    private e() {
    }

    @g6.a
    public static int a(@NonNull Context context, @NonNull String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo packageInfoB = b(context, str);
        if (packageInfoB == null || (applicationInfo = packageInfoB.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @p0
    @g6.a
    public static PackageInfo b(@NonNull Context context, @NonNull String str) {
        try {
            return com.google.android.gms.common.wrappers.d.a(context).f(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @g6.a
    public static boolean c() {
        return false;
    }
}
