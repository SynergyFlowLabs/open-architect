package io.reactivex;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f303517a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    static final class a implements io.reactivex.disposables.c, Runnable, io.reactivex.schedulers.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @cj.f
        final Runnable f303518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @cj.f
        final c f303519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @cj.g
        Thread f303520c;

        a(@cj.f Runnable runnable, @cj.f c cVar) {
            this.f303518a = runnable;
            this.f303519b = cVar;
        }

        @Override // io.reactivex.schedulers.a
        public Runnable a() {
            return this.f303518a;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f303520c == Thread.currentThread()) {
                c cVar = this.f303519b;
                if (cVar instanceof io.reactivex.internal.schedulers.i) {
                    ((io.reactivex.internal.schedulers.i) cVar).h();
                    return;
                }
            }
            this.f303519b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303519b.k();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f303520c = Thread.currentThread();
            try {
                this.f303518a.run();
                dispose();
            } finally {
                dispose();
                this.f303520c = null;
            }
        }
    }

    static final class b implements io.reactivex.disposables.c, Runnable, io.reactivex.schedulers.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @cj.f
        final Runnable f303521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @cj.f
        final c f303522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f303523c;

        b(@cj.f Runnable runnable, @cj.f c cVar) {
            this.f303521a = runnable;
            this.f303522b = cVar;
        }

        @Override // io.reactivex.schedulers.a
        public Runnable a() {
            return this.f303521a;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f303523c = true;
            this.f303522b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303523c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f303523c) {
                return;
            }
            try {
                this.f303521a.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303522b.dispose();
                throw io.reactivex.internal.util.k.f(th2);
            }
        }
    }

    public static abstract class c implements io.reactivex.disposables.c {

        final class a implements Runnable, io.reactivex.schedulers.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @cj.f
            final Runnable f303524a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @cj.f
            final io.reactivex.internal.disposables.h f303525b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final long f303526c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f303527d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            long f303528e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            long f303529f;

            a(@cj.f long j10, Runnable runnable, @cj.f long j11, io.reactivex.internal.disposables.h hVar, long j12) {
                this.f303524a = runnable;
                this.f303525b = hVar;
                this.f303526c = j12;
                this.f303528e = j11;
                this.f303529f = j10;
            }

            @Override // io.reactivex.schedulers.a
            public Runnable a() {
                return this.f303524a;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x003a  */
            @Override // java.lang.Runnable
            public void run() {
                long j10;
                this.f303524a.run();
                if (this.f303525b.k()) {
                    return;
                }
                c cVar = c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jA = cVar.a(timeUnit);
                long j11 = j0.f303517a;
                long j12 = jA + j11;
                long j13 = this.f303528e;
                if (j12 >= j13) {
                    long j14 = this.f303526c;
                    if (jA >= j13 + j14 + j11) {
                        long j15 = this.f303526c;
                        long j16 = jA + j15;
                        long j17 = this.f303527d + 1;
                        this.f303527d = j17;
                        this.f303529f = j16 - (j15 * j17);
                        j10 = j16;
                    } else {
                        long j18 = this.f303529f;
                        long j19 = this.f303527d + 1;
                        this.f303527d = j19;
                        j10 = j18 + (j19 * j14);
                    }
                } else {
                    long j110 = this.f303526c;
                    long j111 = jA + j110;
                    long j112 = this.f303527d + 1;
                    this.f303527d = j112;
                    this.f303529f = j111 - (j110 * j112);
                    j10 = j111;
                }
                this.f303528e = jA;
                this.f303525b.a(c.this.c(this, j10 - jA, timeUnit));
            }
        }

        public long a(@cj.f TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @cj.f
        public io.reactivex.disposables.c b(@cj.f Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @cj.f
        public abstract io.reactivex.disposables.c c(@cj.f Runnable runnable, long j10, @cj.f TimeUnit timeUnit);

        @cj.f
        public io.reactivex.disposables.c d(@cj.f Runnable runnable, long j10, long j11, @cj.f TimeUnit timeUnit) {
            io.reactivex.internal.disposables.h hVar = new io.reactivex.internal.disposables.h();
            io.reactivex.internal.disposables.h hVar2 = new io.reactivex.internal.disposables.h(hVar);
            Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jA = a(TimeUnit.NANOSECONDS);
            io.reactivex.disposables.c cVarC = c(new a(jA + timeUnit.toNanos(j10), runnableB0, jA, hVar2, nanos), j10, timeUnit);
            if (cVarC == io.reactivex.internal.disposables.e.INSTANCE) {
                return cVarC;
            }
            hVar.a(cVarC);
            return hVar2;
        }
    }

    public static long b() {
        return f303517a;
    }

    @cj.f
    public abstract c c();

    public long d(@cj.f TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @cj.f
    public io.reactivex.disposables.c e(@cj.f Runnable runnable) {
        return f(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @cj.f
    public io.reactivex.disposables.c f(@cj.f Runnable runnable, long j10, @cj.f TimeUnit timeUnit) {
        c cVarC = c();
        a aVar = new a(io.reactivex.plugins.a.b0(runnable), cVarC);
        cVarC.c(aVar, j10, timeUnit);
        return aVar;
    }

    @cj.f
    public io.reactivex.disposables.c g(@cj.f Runnable runnable, long j10, long j11, @cj.f TimeUnit timeUnit) {
        c cVarC = c();
        b bVar = new b(io.reactivex.plugins.a.b0(runnable), cVarC);
        io.reactivex.disposables.c cVarD = cVarC.d(bVar, j10, j11, timeUnit);
        return cVarD == io.reactivex.internal.disposables.e.INSTANCE ? cVarD : bVar;
    }

    public void h() {
    }

    public void i() {
    }

    @cj.f
    public <S extends j0 & io.reactivex.disposables.c> S j(@cj.f dj.o<l<l<io.reactivex.c>>, io.reactivex.c> oVar) {
        return new io.reactivex.internal.schedulers.q(oVar, this);
    }
}
