package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
class s2 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f289800c = Logger.getLogger(s2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f289801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayDeque<Runnable> f289802b;

    s2() {
    }

    private void a() {
        while (true) {
            Runnable runnablePoll = this.f289802b.poll();
            if (runnablePoll == null) {
                return;
            }
            try {
                runnablePoll.run();
            } catch (Throwable th2) {
                f289800c.log(Level.SEVERE, "Exception while executing runnable " + runnablePoll, th2);
            }
        }
    }

    private void b(Runnable runnable) {
        if (this.f289802b == null) {
            this.f289802b = new ArrayDeque<>(4);
        }
        this.f289802b.add(runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.google.common.base.j0.F(runnable, "'task' must not be null.");
        if (this.f289801a) {
            b(runnable);
            return;
        }
        this.f289801a = true;
        try {
            runnable.run();
            if (this.f289802b != null) {
                a();
            }
        } catch (Throwable th2) {
            try {
                f289800c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th2);
                if (this.f289802b != null) {
                }
            } catch (Throwable th3) {
                if (this.f289802b != null) {
                    a();
                }
                this.f289801a = false;
                throw th3;
            }
        }
        this.f289801a = false;
    }
}
