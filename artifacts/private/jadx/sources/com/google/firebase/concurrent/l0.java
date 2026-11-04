package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class l0 extends o implements k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f120887c;

    l0(g0 g0Var, ScheduledExecutorService scheduledExecutorService) {
        super(g0Var, scheduledExecutorService);
        this.f120887c = g0Var;
    }

    @Override // com.google.firebase.concurrent.e0
    public boolean o3() {
        return this.f120887c.o3();
    }

    @Override // com.google.firebase.concurrent.e0
    public void p() {
        this.f120887c.p();
    }

    @Override // com.google.firebase.concurrent.e0
    public void pause() {
        this.f120887c.pause();
    }

    @Override // com.google.firebase.concurrent.o, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.concurrent.o, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
