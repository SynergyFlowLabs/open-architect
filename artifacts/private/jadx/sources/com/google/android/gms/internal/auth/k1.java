package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;

/* JADX INFO: loaded from: classes4.dex */
final class k1 implements h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("GservicesLoader.class")
    private static k1 f107678c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.h
    private final Context f107679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.h
    private final ContentObserver f107680b;

    private k1() {
        this.f107679a = null;
        this.f107680b = null;
    }

    static k1 b(Context context) {
        k1 k1Var;
        synchronized (k1.class) {
            try {
                if (f107678c == null) {
                    f107678c = androidx.core.content.i0.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new k1(context) : new k1();
                }
                k1Var = f107678c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k1Var;
    }

    static synchronized void e() {
        Context context;
        try {
            k1 k1Var = f107678c;
            if (k1Var != null && (context = k1Var.f107679a) != null && k1Var.f107680b != null) {
                context.getContentResolver().unregisterContentObserver(f107678c.f107680b);
            }
            f107678c = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.auth.h1
    @fj.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.f107679a;
        if (context != null && !y0.a(context)) {
            try {
                return (String) f1.a(new g1() { // from class: com.google.android.gms.internal.auth.i1
                    @Override // com.google.android.gms.internal.auth.g1
                    public final Object a() {
                        return this.f107656a.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    final /* synthetic */ String d(String str) {
        return x0.a(this.f107679a.getContentResolver(), str, null);
    }

    private k1(Context context) {
        this.f107679a = context;
        j1 j1Var = new j1(this, null);
        this.f107680b = j1Var;
        context.getContentResolver().registerContentObserver(x0.f107870a, true, j1Var);
    }
}
