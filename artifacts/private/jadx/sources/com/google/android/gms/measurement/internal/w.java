package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
abstract class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Handler f110613d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f110614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f110615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f110616c;

    w(m8 m8Var) {
        com.google.android.gms.common.internal.w.r(m8Var);
        this.f110614a = m8Var;
        this.f110615b = new v(this, m8Var);
    }

    private final Handler f() {
        Handler handler;
        if (f110613d != null) {
            return f110613d;
        }
        synchronized (w.class) {
            try {
                if (f110613d == null) {
                    f110613d = new com.google.android.gms.internal.measurement.q1(this.f110614a.d().getMainLooper());
                }
                handler = f110613d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public abstract void a();

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            m8 m8Var = this.f110614a;
            this.f110616c = m8Var.e().currentTimeMillis();
            if (f().postDelayed(this.f110615b, j10)) {
                return;
            }
            m8Var.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean c() {
        return this.f110616c != 0;
    }

    final void d() {
        this.f110616c = 0L;
        f().removeCallbacks(this.f110615b);
    }

    final /* synthetic */ void e(long j10) {
        this.f110616c = 0L;
    }
}
