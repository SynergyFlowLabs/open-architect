package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f121189b = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f121190a;

    p0() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f121190a == null) {
                this.f121190a = b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return "".equals(this.f121190a) ? null : this.f121190a;
    }
}
