package com.google.firebase.installations.remote;

import androidx.annotation.b0;
import com.google.firebase.installations.u;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f123297d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f123298e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f123299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("this")
    private long f123300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("this")
    private int f123301c;

    e(u uVar) {
        this.f123299a = uVar;
    }

    private synchronized long a(int i10) {
        try {
            if (c(i10)) {
                return (long) Math.min(Math.pow(2.0d, this.f123301c) + this.f123299a.e(), f123298e);
            }
            return f123297d;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        try {
            this.f123301c = 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean b() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f123301c == 0 || this.f123299a.a() > this.f123300b;
    }

    public synchronized void f(int i10) {
        try {
            if (d(i10)) {
                e();
                return;
            }
            this.f123301c++;
            this.f123300b = this.f123299a.a() + a(i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    e() {
        this.f123299a = u.c();
    }
}
