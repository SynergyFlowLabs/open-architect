package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
final class f4 implements l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k4 f109118b = new k4(f4.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f109119a;

    f4(Object obj) {
        this.f109119a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f109119a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f109119a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void u0(Runnable runnable, Executor executor) {
        g0.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f109118b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f109119a;
    }
}
