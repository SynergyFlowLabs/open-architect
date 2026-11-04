package com.android.volley.toolbox;

import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class a0<T> implements Future<T>, com.android.volley.v.b<T>, com.android.volley.v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.android.volley.s<?> f89508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f89509b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f89510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.android.volley.a0 f89511d;

    private a0() {
    }

    private synchronized T c(Long l10) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f89511d != null) {
            throw new ExecutionException(this.f89511d);
        }
        if (this.f89509b) {
            return this.f89510c;
        }
        if (l10 == null) {
            while (!isDone()) {
                wait(0L);
            }
        } else if (l10.longValue() > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jLongValue = l10.longValue() + jUptimeMillis;
            while (!isDone() && jUptimeMillis < jLongValue) {
                wait(jLongValue - jUptimeMillis);
                jUptimeMillis = SystemClock.uptimeMillis();
            }
        }
        if (this.f89511d != null) {
            throw new ExecutionException(this.f89511d);
        }
        if (!this.f89509b) {
            throw new TimeoutException();
        }
        return this.f89510c;
    }

    public static <E> a0<E> d() {
        return new a0<>();
    }

    @Override // com.android.volley.v.a
    public synchronized void b(com.android.volley.a0 a0Var) {
        try {
            this.f89511d = a0Var;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z10) {
        if (this.f89508a == null) {
            return false;
        }
        if (isDone()) {
            return false;
        }
        this.f89508a.cancel();
        return true;
    }

    public void e(com.android.volley.s<?> sVar) {
        this.f89508a = sVar;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        try {
            return c(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        com.android.volley.s<?> sVar = this.f89508a;
        if (sVar == null) {
            return false;
        }
        return sVar.isCanceled();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f89509b || this.f89511d != null || isCancelled();
    }

    @Override // com.android.volley.v.b
    public synchronized void onResponse(T t10) {
        this.f89509b = true;
        this.f89510c = t10;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return c(Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, timeUnit)));
    }
}
