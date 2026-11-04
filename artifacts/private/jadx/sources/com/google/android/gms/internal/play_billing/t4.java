package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class t4 {
    public static m4 a(ExecutorService executorService) {
        if (executorService instanceof m4) {
            return (m4) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new s4((ScheduledExecutorService) executorService) : new o4(executorService);
    }

    public static n4 b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof n4 ? (n4) scheduledExecutorService : new s4(scheduledExecutorService);
    }
}
