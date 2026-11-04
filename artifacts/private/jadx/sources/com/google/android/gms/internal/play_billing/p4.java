package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class p4 extends y3 implements ScheduledFuture, l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f109249b;

    public p4(l4 l4Var, ScheduledFuture scheduledFuture) {
        super(l4Var);
        this.f109249b = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.x3, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zCancel = l().cancel(z10);
        if (zCancel) {
            this.f109249b.cancel(z10);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f109249b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f109249b.getDelay(timeUnit);
    }
}
