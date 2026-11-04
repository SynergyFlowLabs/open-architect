package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class u4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    x4 f109353a;

    u4(x4 x4Var) {
        this.f109353a = x4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l4 l4Var;
        x4 x4Var = this.f109353a;
        if (x4Var != null && (l4Var = x4Var.f109428h) != null) {
            int i10 = 2 ^ 0;
            this.f109353a = null;
            if (l4Var.isDone()) {
                x4Var.o(l4Var);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = x4Var.f109429i;
                x4Var.f109429i = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (jAbs > 10) {
                            str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                        }
                    } catch (Throwable th2) {
                        x4Var.n(new v4(str, null));
                        throw th2;
                    }
                }
                x4Var.n(new v4(str + ": " + l4Var.toString(), null));
                l4Var.cancel(true);
            } catch (Throwable th3) {
                l4Var.cancel(true);
                throw th3;
            }
        }
    }
}
