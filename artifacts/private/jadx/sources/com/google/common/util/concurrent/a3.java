package com.google.common.util.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
final class a3<V> extends u0.a<V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a8.b
    @fj.a
    private t1<V> f119935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @a8.b
    @fj.a
    private ScheduledFuture<?> f119936j;

    private static final class b<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @a8.b
        @fj.a
        a3<V> f119937a;

        b(a3<V> timeoutFuture) {
            this.f119937a = timeoutFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            t1<? extends V> t1Var;
            a3<V> a3Var = this.f119937a;
            if (a3Var == null || (t1Var = ((a3) a3Var).f119935i) == null) {
                return;
            }
            this.f119937a = null;
            if (t1Var.isDone()) {
                a3Var.D(t1Var);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = ((a3) a3Var).f119936j;
                ((a3) a3Var).f119936j = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (jAbs > 10) {
                            str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                        }
                    } catch (Throwable th2) {
                        a3Var.C(new c(str));
                        throw th2;
                    }
                }
                a3Var.C(new c(str + ": " + t1Var));
                t1Var.cancel(true);
            } catch (Throwable th3) {
                t1Var.cancel(true);
                throw th3;
            }
        }
    }

    private static final class c extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            try {
                setStackTrace(new StackTraceElement[0]);
            } catch (Throwable th2) {
                throw th2;
            }
            return this;
        }

        private c(String message) {
            super(message);
        }
    }

    private a3(t1<V> delegate) {
        this.f119935i = (t1) com.google.common.base.j0.E(delegate);
    }

    static <V> t1<V> Q(t1<V> delegate, long time, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
        a3 a3Var = new a3(delegate);
        b bVar = new b(a3Var);
        a3Var.f119936j = scheduledExecutor.schedule(bVar, time, unit);
        delegate.m0(bVar, a2.c());
        return a3Var;
    }

    @Override // com.google.common.util.concurrent.f
    protected void m() {
        x(this.f119935i);
        ScheduledFuture<?> scheduledFuture = this.f119936j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f119935i = null;
        this.f119936j = null;
    }

    @Override // com.google.common.util.concurrent.f
    @fj.a
    protected String y() {
        t1<V> t1Var = this.f119935i;
        ScheduledFuture<?> scheduledFuture = this.f119936j;
        if (t1Var == null) {
            return null;
        }
        String str = "inputFuture=[" + t1Var + "]";
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return str + ", remaining delay=[" + delay + " ms]";
            }
        }
        return str;
    }
}
