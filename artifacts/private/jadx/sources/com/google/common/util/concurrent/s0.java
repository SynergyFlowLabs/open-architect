package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.d
@o0
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<t1<Void>> f120303a = new AtomicReference<>(h1.p());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    private e f120304b = new e(null);

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f120305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s0 f120306b;

        a(final s0 this$0, final Callable val$callable) {
            this.f120305a = val$callable;
            this.f120306b = this$0;
        }

        @Override // com.google.common.util.concurrent.v
        public t1<T> call() throws Exception {
            return h1.o(this.f120305a.call());
        }

        public String toString() {
            return this.f120305a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> implements v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f120307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f120308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s0 f120309c;

        b(final s0 this$0, final d val$taskExecutor, final v val$callable) {
            this.f120307a = val$taskExecutor;
            this.f120308b = val$callable;
            this.f120309c = this$0;
        }

        @Override // com.google.common.util.concurrent.v
        public t1<T> call() throws Exception {
            return !this.f120307a.d() ? h1.m() : this.f120308b.call();
        }

        public String toString() {
            return this.f120308b.toString();
        }
    }

    enum c {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d extends AtomicReference<c> implements Executor, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        s0 f120314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        Executor f120315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        Runnable f120316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @a8.b
        @fj.a
        Thread f120317d;

        /* synthetic */ d(Executor executor, s0 s0Var, a aVar) {
            this(executor, s0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return compareAndSet(c.NOT_RUN, c.CANCELLED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return compareAndSet(c.NOT_RUN, c.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable task) {
            if (get() == c.CANCELLED) {
                this.f120315b = null;
                this.f120314a = null;
                return;
            }
            this.f120317d = Thread.currentThread();
            try {
                s0 s0Var = this.f120314a;
                Objects.requireNonNull(s0Var);
                e eVar = s0Var.f120304b;
                if (eVar.f120318a == this.f120317d) {
                    this.f120314a = null;
                    com.google.common.base.j0.g0(eVar.f120319b == null);
                    eVar.f120319b = task;
                    Executor executor = this.f120315b;
                    Objects.requireNonNull(executor);
                    eVar.f120320c = executor;
                    this.f120315b = null;
                } else {
                    Executor executor2 = this.f120315b;
                    Objects.requireNonNull(executor2);
                    this.f120315b = null;
                    this.f120316c = task;
                    executor2.execute(this);
                }
                this.f120317d = null;
            } catch (Throwable th2) {
                this.f120317d = null;
                throw th2;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = null;
            if (threadCurrentThread != this.f120317d) {
                Runnable runnable = this.f120316c;
                Objects.requireNonNull(runnable);
                this.f120316c = null;
                runnable.run();
                return;
            }
            e eVar = new e(aVar);
            eVar.f120318a = threadCurrentThread;
            s0 s0Var = this.f120314a;
            Objects.requireNonNull(s0Var);
            s0Var.f120304b = eVar;
            this.f120314a = null;
            try {
                Runnable runnable2 = this.f120316c;
                Objects.requireNonNull(runnable2);
                this.f120316c = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = eVar.f120319b;
                    if (runnable3 == null || (executor = eVar.f120320c) == null) {
                        break;
                    }
                    eVar.f120319b = null;
                    eVar.f120320c = null;
                    executor.execute(runnable3);
                }
                eVar.f120318a = null;
            } catch (Throwable th2) {
                eVar.f120318a = null;
                throw th2;
            }
        }

        private d(Executor delegate, s0 sequencer) {
            super(c.NOT_RUN);
            this.f120315b = delegate;
            this.f120314a = sequencer;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @a8.b
        @fj.a
        Thread f120318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        Runnable f120319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        Executor f120320c;

        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    private s0() {
    }

    public static /* synthetic */ void a(b3 b3Var, m2 m2Var, t1 t1Var, t1 t1Var2, d dVar) {
        if (b3Var.isDone()) {
            m2Var.D(t1Var);
        } else if (t1Var2.isCancelled() && dVar.c()) {
            b3Var.cancel(false);
        }
    }

    public static s0 d() {
        return new s0();
    }

    public <T> t1<T> e(Callable<T> callable, Executor executor) {
        com.google.common.base.j0.E(callable);
        com.google.common.base.j0.E(executor);
        return f(new a(this, callable), executor);
    }

    public <T> t1<T> f(v<T> callable, Executor executor) {
        com.google.common.base.j0.E(callable);
        com.google.common.base.j0.E(executor);
        final d dVar = new d(executor, this, null);
        b bVar = new b(this, dVar, callable);
        final m2 m2VarF = m2.F();
        final t1<Void> andSet = this.f120303a.getAndSet(m2VarF);
        final b3 b3VarN = b3.N(bVar);
        andSet.m0(b3VarN, dVar);
        final t1<T> t1VarS = h1.s(b3VarN);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.r0
            @Override // java.lang.Runnable
            public final void run() {
                s0.a(b3VarN, m2VarF, andSet, t1VarS, dVar);
            }
        };
        t1VarS.m0(runnable, a2.c());
        b3VarN.m0(runnable, a2.c());
        return t1VarS;
    }
}
