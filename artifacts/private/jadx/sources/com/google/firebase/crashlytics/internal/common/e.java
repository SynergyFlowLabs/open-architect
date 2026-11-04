package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes5.dex */
class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f121016c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f121017d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f121018e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Float f121019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f121020b;

    private e(Float f10, boolean z10) {
        this.f121020b = z10;
        this.f121019a = f10;
    }

    public static e a(Context context) {
        boolean zF = false;
        Float fD = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zF = f(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e10) {
            com.google.firebase.crashlytics.internal.g.f().e("An error occurred getting battery state.", e10);
        }
        return new e(fD, zF);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean f(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f121019a;
    }

    public int c() {
        Float f10;
        if (!this.f121020b || (f10 = this.f121019a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }

    boolean e() {
        return this.f121020b;
    }
}
