package io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class t2 implements Executor, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f289838d = Logger.getLogger(t2.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f289839e = c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f289840f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f289841g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Executor f289842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<Runnable> f289843b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f289844c = 0;

    private static abstract class b {
        private b() {
        }

        public abstract boolean a(t2 t2Var, int i10, int i11);

        public abstract void b(t2 t2Var, int i10);
    }

    private static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<t2> f289845a;

        @Override // io.grpc.internal.t2.b
        public boolean a(t2 t2Var, int i10, int i11) {
            return this.f289845a.compareAndSet(t2Var, i10, i11);
        }

        @Override // io.grpc.internal.t2.b
        public void b(t2 t2Var, int i10) {
            this.f289845a.set(t2Var, i10);
        }

        private c(AtomicIntegerFieldUpdater<t2> atomicIntegerFieldUpdater) {
            super();
            this.f289845a = atomicIntegerFieldUpdater;
        }
    }

    private static final class d extends b {
        private d() {
            super();
        }

        @Override // io.grpc.internal.t2.b
        public boolean a(t2 t2Var, int i10, int i11) {
            synchronized (t2Var) {
                try {
                    if (t2Var.f289844c != i10) {
                        return false;
                    }
                    t2Var.f289844c = i11;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.t2.b
        public void b(t2 t2Var, int i10) {
            synchronized (t2Var) {
                try {
                    t2Var.f289844c = i10;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public t2(Executor executor) {
        com.google.common.base.j0.F(executor, "'executor' must not be null.");
        this.f289842a = executor;
    }

    private static b c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(t2.class, "c"));
        } catch (Throwable th2) {
            f289838d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th2);
            return new d();
        }
    }

    private void d(@fj.h Runnable runnable) {
        if (f289839e.a(this, 0, -1)) {
            try {
                this.f289842a.execute(this);
            } catch (Throwable th2) {
                if (runnable != null) {
                    this.f289843b.remove(runnable);
                }
                f289839e.b(this, 0);
                throw th2;
            }
        }
    }

    public void e(Executor executor) {
        com.google.common.base.j0.F(executor, "'executor' must not be null.");
        this.f289842a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f289843b.add((Runnable) com.google.common.base.j0.F(runnable, "'r' must not be null."));
        d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnablePoll;
        try {
            Executor executor = this.f289842a;
            while (executor == this.f289842a && (runnablePoll = this.f289843b.poll()) != null) {
                try {
                    runnablePoll.run();
                } catch (RuntimeException e10) {
                    f289838d.log(Level.SEVERE, "Exception while executing runnable " + runnablePoll, (Throwable) e10);
                }
            }
            f289839e.b(this, 0);
            if (this.f289843b.isEmpty()) {
                return;
            }
            d(null);
        } catch (Throwable th2) {
            f289839e.b(this, 0);
            throw th2;
        }
    }
}
