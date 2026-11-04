package com.google.firebase.perf.logging;

/* JADX INFO: loaded from: classes5.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f123964a = "FirebasePerformance";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f123965b;

    private c() {
    }

    public static synchronized c c() {
        try {
            if (f123965b == null) {
                f123965b = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f123965b;
    }

    void a(String str) {
    }

    void b(String str) {
    }

    void d(String str) {
    }

    void e(String str) {
    }

    void f(String str) {
    }
}
