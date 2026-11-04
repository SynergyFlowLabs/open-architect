package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
public class i0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f121094i = "firebase_crashlytics_collection_enabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f121095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.h f121096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f121097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.android.gms.tasks.l<Void> f121098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f121099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f121100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Boolean f121101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.tasks.l<Void> f121102h;

    public i0(com.google.firebase.h hVar) {
        Object obj = new Object();
        this.f121097c = obj;
        this.f121098d = new com.google.android.gms.tasks.l<>();
        this.f121099e = false;
        this.f121100f = false;
        this.f121102h = new com.google.android.gms.tasks.l<>();
        Context contextN = hVar.n();
        this.f121096b = hVar;
        this.f121095a = i.r(contextN);
        Boolean boolB = b();
        this.f121101g = boolB == null ? a(contextN) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f121098d.e(null);
                    this.f121099e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.p0
    private Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f121100f = false;
            return null;
        }
        this.f121100f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    @androidx.annotation.p0
    private Boolean b() {
        if (!this.f121095a.contains(f121094i)) {
            return null;
        }
        this.f121100f = false;
        return Boolean.valueOf(this.f121095a.getBoolean(f121094i, true));
    }

    private boolean e() {
        try {
            return this.f121096b.A();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z10) {
        String str;
        String str2 = z10 ? "ENABLED" : "DISABLED";
        if (this.f121101g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f121100f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        com.google.firebase.crashlytics.internal.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    @androidx.annotation.p0
    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f121094i)) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(f121094i));
            }
        } catch (PackageManager.NameNotFoundException e10) {
            com.google.firebase.crashlytics.internal.g.f().e("Could not read data collection permission from manifest", e10);
        }
        return null;
    }

    @e.a({"ApplySharedPref"})
    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean(f121094i, bool.booleanValue());
        } else {
            editorEdit.remove(f121094i);
        }
        editorEdit.apply();
    }

    public void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f121102h.e(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f121101g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th2) {
            throw th2;
        }
        return zBooleanValue;
    }

    public synchronized void h(@androidx.annotation.p0 Boolean bool) {
        if (bool != null) {
            try {
                this.f121100f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f121101g = bool != null ? bool : a(this.f121096b.n());
        i(this.f121095a, bool);
        synchronized (this.f121097c) {
            try {
                if (d()) {
                    if (!this.f121099e) {
                        this.f121098d.e(null);
                        this.f121099e = true;
                    }
                } else if (this.f121099e) {
                    this.f121098d = new com.google.android.gms.tasks.l<>();
                    this.f121099e = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public Task<Void> j() {
        Task<Void> taskA;
        synchronized (this.f121097c) {
            taskA = this.f121098d.a();
        }
        return taskA;
    }

    public Task<Void> k() {
        return com.google.firebase.crashlytics.internal.concurrency.b.b(this.f121102h.a(), j());
    }
}
