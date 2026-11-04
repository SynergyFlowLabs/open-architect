package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class c4 extends e4 {
    public static l4 a(Object obj) {
        return new f4(obj);
    }

    public static l4 b(l4 l4Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return l4Var.isDone() ? l4Var : x4.A(l4Var, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void c(l4 l4Var, a4 a4Var, Executor executor) {
        l4Var.u0(new b4(l4Var, a4Var), executor);
    }
}
