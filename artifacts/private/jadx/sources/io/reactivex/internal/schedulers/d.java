package io.reactivex.internal.schedulers;

import io.reactivex.j0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j0 f303196d = io.reactivex.schedulers.b.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f303197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cj.f
    final Executor f303198c;

    final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f303199a;

        a(b bVar) {
            this.f303199a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f303199a;
            bVar.f303203b.a(d.this.e(bVar));
        }
    }

    static final class b extends AtomicReference<Runnable> implements Runnable, io.reactivex.disposables.c, io.reactivex.schedulers.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303201c = -4101336210206799084L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f303202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f303203b;

        b(Runnable runnable) {
            super(runnable);
            this.f303202a = new io.reactivex.internal.disposables.h();
            this.f303203b = new io.reactivex.internal.disposables.h();
        }

        @Override // io.reactivex.schedulers.a
        public Runnable a() {
            Runnable runnable = get();
            return runnable != null ? runnable : io.reactivex.internal.functions.a.f298691b;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f303202a.dispose();
                this.f303203b.dispose();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    io.reactivex.internal.disposables.h hVar = this.f303202a;
                    io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
                    hVar.lazySet(dVar);
                    this.f303203b.lazySet(dVar);
                } catch (Throwable th2) {
                    lazySet(null);
                    this.f303202a.lazySet(io.reactivex.internal.disposables.d.DISPOSED);
                    this.f303203b.lazySet(io.reactivex.internal.disposables.d.DISPOSED);
                    throw th2;
                }
            }
        }
    }

    public static final class c extends j0.c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f303204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f303205b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f303207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicInteger f303208e = new AtomicInteger();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.b f303209f = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Runnable> f303206c = new io.reactivex.internal.queue.a<>();

        static final class a extends AtomicBoolean implements Runnable, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f303210b = -2421395018820541164L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Runnable f303211a;

            a(Runnable runnable) {
                this.f303211a = runnable;
            }

            @Override // io.reactivex.disposables.c
            public void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.disposables.c
            public boolean k() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f303211a.run();
                    lazySet(true);
                } catch (Throwable th2) {
                    lazySet(true);
                    throw th2;
                }
            }
        }

        static final class b extends AtomicInteger implements Runnable, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final long f303212d = -3603436687413320876L;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            static final int f303213e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            static final int f303214f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            static final int f303215g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            static final int f303216h = 3;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            static final int f303217i = 4;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Runnable f303218a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final io.reactivex.internal.disposables.c f303219b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            volatile Thread f303220c;

            b(Runnable runnable, io.reactivex.internal.disposables.c cVar) {
                this.f303218a = runnable;
                this.f303219b = cVar;
            }

            void a() {
                io.reactivex.internal.disposables.c cVar = this.f303219b;
                if (cVar != null) {
                    cVar.b(this);
                }
            }

            @Override // io.reactivex.disposables.c
            public void dispose() {
                while (true) {
                    int i10 = get();
                    if (i10 >= 2) {
                        return;
                    }
                    if (i10 == 0) {
                        if (compareAndSet(0, 4)) {
                            a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f303220c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f303220c = null;
                        }
                        set(4);
                        a();
                        return;
                    }
                }
            }

            @Override // io.reactivex.disposables.c
            public boolean k() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f303220c = Thread.currentThread();
                    int i10 = 2 >> 1;
                    if (!compareAndSet(0, 1)) {
                        this.f303220c = null;
                        return;
                    }
                    try {
                        this.f303218a.run();
                        this.f303220c = null;
                        if (compareAndSet(1, 2)) {
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                    } finally {
                        this.f303220c = null;
                        if (compareAndSet(1, 2)) {
                            a();
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: io.reactivex.internal.schedulers.d$c$c, reason: collision with other inner class name */
        final class RunnableC2193c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final io.reactivex.internal.disposables.h f303221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Runnable f303222b;

            RunnableC2193c(io.reactivex.internal.disposables.h hVar, Runnable runnable) {
                this.f303221a = hVar;
                this.f303222b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f303221a.a(c.this.b(this.f303222b));
            }
        }

        public c(Executor executor, boolean z10) {
            this.f303205b = executor;
            this.f303204a = z10;
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c b(@cj.f Runnable runnable) {
            io.reactivex.disposables.c aVar;
            if (this.f303207d) {
                return io.reactivex.internal.disposables.e.INSTANCE;
            }
            Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
            if (this.f303204a) {
                aVar = new b(runnableB0, this.f303209f);
                this.f303209f.c(aVar);
            } else {
                aVar = new a(runnableB0);
            }
            this.f303206c.offer(aVar);
            if (this.f303208e.getAndIncrement() != 0) {
                return aVar;
            }
            try {
                this.f303205b.execute(this);
                return aVar;
            } catch (RejectedExecutionException e10) {
                this.f303207d = true;
                this.f303206c.clear();
                io.reactivex.plugins.a.Y(e10);
                return io.reactivex.internal.disposables.e.INSTANCE;
            }
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c c(@cj.f Runnable runnable, long j10, @cj.f TimeUnit timeUnit) {
            if (j10 <= 0) {
                return b(runnable);
            }
            if (this.f303207d) {
                return io.reactivex.internal.disposables.e.INSTANCE;
            }
            io.reactivex.internal.disposables.h hVar = new io.reactivex.internal.disposables.h();
            io.reactivex.internal.disposables.h hVar2 = new io.reactivex.internal.disposables.h(hVar);
            n nVar = new n(new RunnableC2193c(hVar2, io.reactivex.plugins.a.b0(runnable)), this.f303209f);
            this.f303209f.c(nVar);
            Executor executor = this.f303205b;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    nVar.a(((ScheduledExecutorService) executor).schedule((Callable) nVar, j10, timeUnit));
                } catch (RejectedExecutionException e10) {
                    this.f303207d = true;
                    io.reactivex.plugins.a.Y(e10);
                    return io.reactivex.internal.disposables.e.INSTANCE;
                }
            } else {
                nVar.a(new io.reactivex.internal.schedulers.c(d.f303196d.f(nVar, j10, timeUnit)));
            }
            hVar.a(nVar);
            return hVar2;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f303207d) {
                return;
            }
            this.f303207d = true;
            this.f303209f.dispose();
            if (this.f303208e.getAndIncrement() == 0) {
                this.f303206c.clear();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303207d;
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.internal.queue.a<Runnable> aVar = this.f303206c;
            int iAddAndGet = 1;
            while (!this.f303207d) {
                while (true) {
                    Runnable runnablePoll = aVar.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    runnablePoll.run();
                    if (this.f303207d) {
                        aVar.clear();
                        return;
                    }
                }
                if (this.f303207d) {
                    aVar.clear();
                    return;
                } else {
                    iAddAndGet = this.f303208e.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            aVar.clear();
        }
    }

    public d(@cj.f Executor executor, boolean z10) {
        this.f303198c = executor;
        this.f303197b = z10;
    }

    @Override // io.reactivex.j0
    @cj.f
    public j0.c c() {
        return new c(this.f303198c, this.f303197b);
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c e(@cj.f Runnable runnable) {
        Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
        try {
            if (this.f303198c instanceof ExecutorService) {
                m mVar = new m(runnableB0);
                mVar.b(((ExecutorService) this.f303198c).submit(mVar));
                return mVar;
            }
            if (this.f303197b) {
                c.b bVar = new c.b(runnableB0, null);
                this.f303198c.execute(bVar);
                return bVar;
            }
            c.a aVar = new c.a(runnableB0);
            this.f303198c.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e10) {
            io.reactivex.plugins.a.Y(e10);
            return io.reactivex.internal.disposables.e.INSTANCE;
        }
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c f(@cj.f Runnable runnable, long j10, TimeUnit timeUnit) {
        Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
        if (!(this.f303198c instanceof ScheduledExecutorService)) {
            b bVar = new b(runnableB0);
            bVar.f303202a.a(f303196d.f(new a(bVar), j10, timeUnit));
            return bVar;
        }
        try {
            m mVar = new m(runnableB0);
            mVar.b(((ScheduledExecutorService) this.f303198c).schedule(mVar, j10, timeUnit));
            return mVar;
        } catch (RejectedExecutionException e10) {
            io.reactivex.plugins.a.Y(e10);
            return io.reactivex.internal.disposables.e.INSTANCE;
        }
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c g(@cj.f Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        if (!(this.f303198c instanceof ScheduledExecutorService)) {
            return super.g(runnable, j10, j11, timeUnit);
        }
        try {
            l lVar = new l(io.reactivex.plugins.a.b0(runnable));
            lVar.b(((ScheduledExecutorService) this.f303198c).scheduleAtFixedRate(lVar, j10, j11, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e10) {
            io.reactivex.plugins.a.Y(e10);
            return io.reactivex.internal.disposables.e.INSTANCE;
        }
    }
}
