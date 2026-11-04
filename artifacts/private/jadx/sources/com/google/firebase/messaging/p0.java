package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123693f = "com.google.android.c2dm.permission.SEND";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f123694g = "com.google.android.gms";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f123695h = "com.google.iid.TOKEN_REQUEST";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f123696i = "com.google.android.c2dm.intent.REGISTER";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f123697j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f123698k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f123699l = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f123700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private String f123701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private String f123702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f123703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f123704e = 0;

    p0(Context context) {
        this.f123700a = context;
    }

    static String c(com.google.firebase.h hVar) {
        String strM = hVar.s().m();
        if (strM != null) {
            return strM;
        }
        String strJ = hVar.s().j();
        if (!strJ.startsWith("1:")) {
            return strJ;
        }
        String[] strArrSplit = strJ.split(":");
        int i10 = 1 >> 2;
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f123700a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
            return null;
        }
    }

    private synchronized void h() {
        try {
            PackageInfo packageInfoF = f(this.f123700a.getPackageName());
            if (packageInfoF != null) {
                this.f123701b = Integer.toString(packageInfoF.versionCode);
                this.f123702c = packageInfoF.versionName;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized String a() {
        try {
            if (this.f123701b == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f123701b;
    }

    synchronized String b() {
        try {
            if (this.f123702c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f123702c;
    }

    synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f123703d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f123703d = packageInfoF.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f123703d;
    }

    synchronized int e() {
        try {
            int i10 = this.f123704e;
            if (i10 != 0) {
                return i10;
            }
            PackageManager packageManager = this.f123700a.getPackageManager();
            if (packageManager.checkPermission(f123693f, "com.google.android.gms") == -1) {
                return 0;
            }
            if (!com.google.android.gms.common.util.v.n()) {
                Intent intent = new Intent(f123696i);
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                    this.f123704e = 1;
                    return 1;
                }
            }
            Intent intent2 = new Intent(f123695h);
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                this.f123704e = 2;
                return 2;
            }
            if (com.google.android.gms.common.util.v.n()) {
                this.f123704e = 2;
            } else {
                this.f123704e = 1;
            }
            return this.f123704e;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    boolean g() {
        return e() != 0;
    }
}
