package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public abstract class l implements j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s1 f120156b = new s1(l.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f120157a = new g(this, null);

    class a extends j2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScheduledExecutorService f120158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f120159b;

        a(final l this$0, final ScheduledExecutorService val$executor) {
            this.f120158a = val$executor;
            this.f120159b = this$0;
        }

        @Override // com.google.common.util.concurrent.j2.a
        public void a(j2.b from, Throwable failure) {
            this.f120158a.shutdown();
        }

        @Override // com.google.common.util.concurrent.j2.a
        public void e(j2.b from) {
            this.f120158a.shutdown();
        }
    }

    class b implements ThreadFactory {
        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return a2.n(l.this.o(), runnable);
        }
    }

    interface c {
        void cancel(boolean mayInterruptIfRunning);

        boolean isCancelled();
    }

    public static abstract class d extends f {

        private final class a implements Callable<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Runnable f120161a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ScheduledExecutorService f120162b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final p f120163c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final ReentrantLock f120164d = new ReentrantLock();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @a8.a(io.sentry.protocol.z.b.f306551r)
            @fj.a
            private c f120165e;

            a(p service, ScheduledExecutorService executor, Runnable runnable) {
                this.f120161a = runnable;
                this.f120162b = executor;
                this.f120163c = service;
            }

            @a8.a(io.sentry.protocol.z.b.f306551r)
            private c b(b schedule) {
                c cVar = this.f120165e;
                if (cVar == null) {
                    c cVar2 = new c(this.f120164d, d(schedule));
                    this.f120165e = cVar2;
                    return cVar2;
                }
                if (!cVar.f120170b.isCancelled()) {
                    this.f120165e.f120170b = d(schedule);
                }
                return this.f120165e;
            }

            private ScheduledFuture<Void> d(b schedule) {
                return this.f120162b.schedule(this, schedule.f120167a, schedule.f120168b);
            }

            @Override // java.util.concurrent.Callable
            @fj.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.f120161a.run();
                c();
                return null;
            }

            @z7.a
            public c c() throws Exception {
                c eVar;
                try {
                    b bVarD = d.this.d();
                    this.f120164d.lock();
                    try {
                        eVar = b(bVarD);
                        this.f120164d.unlock();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            eVar = new e(h1.m());
                            this.f120164d.unlock();
                        } catch (Throwable th3) {
                            this.f120164d.unlock();
                            throw th3;
                        }
                    }
                    if (th != null) {
                        this.f120163c.u(th);
                    }
                    return eVar;
                } catch (Throwable th4) {
                    f2.b(th4);
                    this.f120163c.u(th4);
                    return new e(h1.m());
                }
            }
        }

        protected static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f120167a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TimeUnit f120168b;

            public b(long delay, TimeUnit unit) {
                this.f120167a = delay;
                this.f120168b = (TimeUnit) com.google.common.base.j0.E(unit);
            }
        }

        private static final class c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ReentrantLock f120169a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @a8.a(io.sentry.protocol.z.b.f306551r)
            private Future<Void> f120170b;

            c(ReentrantLock lock, Future<Void> currentFuture) {
                this.f120169a = lock;
                this.f120170b = currentFuture;
            }

            @Override // com.google.common.util.concurrent.l.c
            public void cancel(boolean mayInterruptIfRunning) {
                this.f120169a.lock();
                try {
                    this.f120170b.cancel(mayInterruptIfRunning);
                    ReentrantLock reentrantLock = this.f120169a;
                } finally {
                    this.f120169a.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.l.c
            public boolean isCancelled() {
                this.f120169a.lock();
                try {
                    boolean zIsCancelled = this.f120170b.isCancelled();
                    return zIsCancelled;
                } finally {
                    this.f120169a.unlock();
                }
            }
        }

        public d() {
            super(null);
        }

        @Override // com.google.common.util.concurrent.l.f
        final c c(p service, ScheduledExecutorService executor, Runnable runnable) {
            return new a(service, executor, runnable).c();
        }

        protected abstract b d() throws Exception;
    }

    private static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Future<?> f120171a;

        e(Future<?> delegate) {
            this.f120171a = delegate;
        }

        @Override // com.google.common.util.concurrent.l.c
        public void cancel(boolean mayInterruptIfRunning) {
            this.f120171a.cancel(mayInterruptIfRunning);
        }

        @Override // com.google.common.util.concurrent.l.c
        public boolean isCancelled() {
            return this.f120171a.isCancelled();
        }
    }

    public static abstract class f {

        class a extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f120172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f120173b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TimeUnit f120174c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(final long val$initialDelay, final long val$delay, final TimeUnit val$unit) {
                super(null);
                this.f120172a = val$initialDelay;
                this.f120173b = val$delay;
                this.f120174c = val$unit;
            }

            @Override // com.google.common.util.concurrent.l.f
            public c c(p service, ScheduledExecutorService executor, Runnable task) {
                return new e(executor.scheduleWithFixedDelay(task, this.f120172a, this.f120173b, this.f120174c));
            }
        }

        class b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f120175a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f120176b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TimeUnit f120177c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(final long val$initialDelay, final long val$period, final TimeUnit val$unit) {
                super(null);
                this.f120175a = val$initialDelay;
                this.f120176b = val$period;
                this.f120177c = val$unit;
            }

            @Override // com.google.common.util.concurrent.l.f
            public c c(p service, ScheduledExecutorService executor, Runnable task) {
                return new e(executor.scheduleAtFixedRate(task, this.f120175a, this.f120176b, this.f120177c));
            }
        }

        /* synthetic */ f(a aVar) {
            this();
        }

        public static f a(final long initialDelay, final long delay, final TimeUnit unit) {
            com.google.common.base.j0.E(unit);
            com.google.common.base.j0.p(delay > 0, "delay must be > 0, found %s", delay);
            return new a(initialDelay, delay, unit);
        }

        public static f b(final long initialDelay, final long period, final TimeUnit unit) {
            com.google.common.base.j0.E(unit);
            com.google.common.base.j0.p(period > 0, "period must be > 0, found %s", period);
            return new b(initialDelay, period, unit);
        }

        abstract c c(p service, ScheduledExecutorService executor, Runnable runnable);

        private f() {
        }
    }

    protected l() {
    }

    @Override // com.google.common.util.concurrent.j2
    public final void a(j2.a listener, Executor executor) {
        this.f120157a.a(listener, executor);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void b(long timeout, TimeUnit unit) throws TimeoutException {
        this.f120157a.b(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void c(long timeout, TimeUnit unit) throws TimeoutException {
        this.f120157a.c(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void d() {
        this.f120157a.d();
    }

    @Override // com.google.common.util.concurrent.j2
    public final Throwable e() {
        return this.f120157a.e();
    }

    @Override // com.google.common.util.concurrent.j2
    public final void f() {
        this.f120157a.f();
    }

    @Override // com.google.common.util.concurrent.j2
    @z7.a
    public final j2 g() throws Exception {
        this.f120157a.g();
        return this;
    }

    @Override // com.google.common.util.concurrent.j2
    public final j2.b h() {
        return this.f120157a.h();
    }

    @Override // com.google.common.util.concurrent.j2
    @z7.a
    public final j2 i() throws Exception {
        this.f120157a.i();
        return this;
    }

    @Override // com.google.common.util.concurrent.j2
    public final boolean isRunning() {
        return this.f120157a.isRunning();
    }

    protected ScheduledExecutorService l() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new b());
        a(new a(this, scheduledExecutorServiceNewSingleThreadScheduledExecutor), a2.c());
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    protected abstract void m() throws Exception;

    protected abstract f n();

    protected String o() {
        return getClass().getSimpleName();
    }

    protected void p() throws Exception {
    }

    protected void q() throws Exception {
    }

    public String toString() {
        return o() + " [" + h() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class g extends p {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @fj.a
        private volatile c f120178p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @fj.a
        private volatile ScheduledExecutorService f120179q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final ReentrantLock f120180r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final Runnable f120181s;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f120180r.lock();
                try {
                    c cVar = g.this.f120178p;
                    Objects.requireNonNull(cVar);
                    if (!cVar.isCancelled()) {
                        l.this.m();
                    }
                } catch (Throwable th2) {
                    try {
                        f2.b(th2);
                        try {
                            l.this.p();
                        } catch (Exception e10) {
                            f2.b(e10);
                            l.f120156b.a().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e10);
                        }
                        g.this.u(th2);
                        c cVar2 = g.this.f120178p;
                        Objects.requireNonNull(cVar2);
                        cVar2.cancel(false);
                    } catch (Throwable th3) {
                        g.this.f120180r.unlock();
                        throw th3;
                    }
                }
                g.this.f120180r.unlock();
            }
        }

        private g() {
            this.f120180r = new ReentrantLock();
            this.f120181s = new a();
        }

        public static /* synthetic */ void A(g gVar) {
            gVar.f120180r.lock();
            try {
                l.this.q();
                Objects.requireNonNull(gVar.f120179q);
                gVar.f120178p = l.this.n().c(l.this.f120157a, gVar.f120179q, gVar.f120181s);
                gVar.v();
            } catch (Throwable th2) {
                try {
                    f2.b(th2);
                    gVar.u(th2);
                    if (gVar.f120178p != null) {
                        gVar.f120178p.cancel(false);
                    }
                } catch (Throwable th3) {
                    gVar.f120180r.unlock();
                    throw th3;
                }
            }
            gVar.f120180r.unlock();
        }

        public static /* synthetic */ void B(g gVar) throws Exception {
            gVar.getClass();
            try {
                gVar.f120180r.lock();
                try {
                    if (gVar.h() != j2.b.STOPPING) {
                        gVar.f120180r.unlock();
                        return;
                    }
                    l.this.p();
                    gVar.f120180r.unlock();
                    gVar.w();
                } catch (Throwable th2) {
                    gVar.f120180r.unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                f2.b(th3);
                gVar.u(th3);
            }
        }

        public static /* synthetic */ String z(g gVar) {
            return l.this.o() + " " + gVar.h();
        }

        @Override // com.google.common.util.concurrent.p
        protected final void n() {
            this.f120179q = a2.s(l.this.l(), new com.google.common.base.s0() { // from class: com.google.common.util.concurrent.m
                @Override // com.google.common.base.s0
                public final Object get() {
                    return l.g.z(this.f120215a);
                }
            });
            this.f120179q.execute(new Runnable() { // from class: com.google.common.util.concurrent.n
                @Override // java.lang.Runnable
                public final void run() {
                    l.g.A(this.f120218a);
                }
            });
        }

        @Override // com.google.common.util.concurrent.p
        protected final void o() {
            Objects.requireNonNull(this.f120178p);
            Objects.requireNonNull(this.f120179q);
            this.f120178p.cancel(false);
            this.f120179q.execute(new Runnable() { // from class: com.google.common.util.concurrent.o
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    l.g.B(this.f120225a);
                }
            });
        }

        @Override // com.google.common.util.concurrent.p
        public String toString() {
            return l.this.toString();
        }

        /* synthetic */ g(l lVar, a aVar) {
            this();
        }
    }
}
