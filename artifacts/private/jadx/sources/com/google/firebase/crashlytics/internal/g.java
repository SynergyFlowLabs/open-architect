package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f121250c = "FirebaseCrashlytics";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final g f121251d = new g(f121250c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f121253b = 4;

    public g(String str) {
        this.f121252a = str;
    }

    private boolean a(int i10) {
        if (this.f121253b > i10 && !Log.isLoggable(this.f121252a, i10)) {
            return false;
        }
        return true;
    }

    public static g f() {
        return f121251d;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        a(3);
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        a(6);
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th2) {
        a(4);
    }

    public void i(int i10, String str) {
        j(i10, str, false);
    }

    public void j(int i10, String str, boolean z10) {
        if (z10 || a(i10)) {
            Log.println(i10, this.f121252a, str);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th2) {
        a(2);
    }

    public void m(String str) {
        n(str, null);
    }

    public void n(String str, Throwable th2) {
        a(5);
    }
}
