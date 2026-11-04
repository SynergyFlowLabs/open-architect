package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.core.view.k2;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f112840a = 128;

    private e() {
    }

    public static void a(@NonNull Window window, boolean z10) {
        b(window, z10, null, null);
    }

    public static void b(@NonNull Window window, boolean z10, @androidx.annotation.l @androidx.annotation.p0 Integer num, @androidx.annotation.l @androidx.annotation.p0 Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iB = com.google.android.material.color.u.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(iB);
            }
            if (z12) {
                num2 = Integer.valueOf(iB);
            }
        }
        k2.c(window, !z10);
        int iD = d(window.getContext(), z10);
        int iC = c(window.getContext(), z10);
        window.setStatusBarColor(iD);
        window.setNavigationBarColor(iC);
        g(window, e(iD, com.google.android.material.color.u.q(num.intValue())));
        f(window, e(iC, com.google.android.material.color.u.q(num2.intValue())));
    }

    @e.b(21)
    private static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return com.google.android.material.color.u.b(context, R.attr.navigationBarColor, -16777216);
    }

    @e.b(21)
    private static int d(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return com.google.android.material.color.u.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean e(int i10, boolean z10) {
        if (com.google.android.material.color.u.q(i10)) {
            return true;
        }
        return i10 == 0 && z10;
    }

    public static void f(@NonNull Window window, boolean z10) {
        k2.a(window, window.getDecorView()).h(z10);
    }

    public static void g(@NonNull Window window, boolean z10) {
        k2.a(window, window.getDecorView()).i(z10);
    }
}
