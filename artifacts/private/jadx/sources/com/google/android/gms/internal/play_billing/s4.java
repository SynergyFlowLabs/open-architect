package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class s4 extends o4 implements n4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ScheduledExecutorService f109326b;

    s4(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f109326b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f109326b;
        z4 z4VarZ = z4.z(runnable, null);
        return new p4(z4VarZ, scheduledExecutorService.schedule(z4VarZ, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        q4 q4Var = new q4(runnable);
        return new p4(q4Var, this.f109326b.scheduleAtFixedRate(q4Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        q4 q4Var = new q4(runnable);
        return new p4(q4Var, this.f109326b.scheduleWithFixedDelay(q4Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        z4 z4Var = new z4(callable);
        return new p4(z4Var, this.f109326b.schedule(z4Var, j10, timeUnit));
    }
}
