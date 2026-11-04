package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class c0 {
    private c0() {
    }

    @g6.a
    public static boolean a(@NonNull Context context, int i10) {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return com.google.android.gms.common.l.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @e.b(19)
    @g6.a
    public static boolean b(@NonNull Context context, int i10, @NonNull String str) {
        return com.google.android.gms.common.wrappers.d.a(context).i(i10, str);
    }
}
