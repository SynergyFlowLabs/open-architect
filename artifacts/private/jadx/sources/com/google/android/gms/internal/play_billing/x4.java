package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class x4 extends v3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @fj.a
    private l4 f109428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.a
    private ScheduledFuture f109429i;

    private x4(l4 l4Var) {
        this.f109428h = l4Var;
    }

    static l4 A(l4 l4Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        x4 x4Var = new x4(l4Var);
        u4 u4Var = new u4(x4Var);
        x4Var.f109429i = scheduledExecutorService.schedule(u4Var, 28500L, timeUnit);
        l4Var.u0(u4Var, u3.INSTANCE);
        return x4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.n3
    @fj.a
    protected final String g() {
        l4 l4Var = this.f109428h;
        ScheduledFuture scheduledFuture = this.f109429i;
        if (l4Var == null) {
            return null;
        }
        String str = "inputFuture=[" + l4Var.toString() + "]";
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return str + ", remaining delay=[" + delay + " ms]";
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.play_billing.n3
    protected final void l() {
        l4 l4Var = this.f109428h;
        if ((l4Var != null) & isCancelled()) {
            l4Var.cancel(p());
        }
        ScheduledFuture scheduledFuture = this.f109429i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f109428h = null;
        this.f109429i = null;
    }
}
