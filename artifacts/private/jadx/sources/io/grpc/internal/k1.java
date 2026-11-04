package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class k1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f289310b = Logger.getLogger(k1.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f289311a;

    public k1(Runnable runnable) {
        this.f289311a = (Runnable) com.google.common.base.j0.F(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f289311a.run();
        } catch (Throwable th2) {
            f289310b.log(Level.SEVERE, "Exception while executing runnable " + this.f289311a, th2);
            com.google.common.base.v0.w(th2);
            throw new AssertionError(th2);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f289311a + ")";
    }
}
