package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.z1;
import io.reactivex.j0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f303233d = "RxCachedThreadScheduler";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final k f303234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f303235f = "RxCachedWorkerPoolEvictor";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final k f303236g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f303238i = 60;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final c f303241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f303242m = "rx2.io-priority";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final a f303243n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f303244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<a> f303245c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final TimeUnit f303240k = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f303237h = "rx2.io-keep-alive-time";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f303239j = Long.getLong(f303237h, 60).longValue();

    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f303246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f303247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.b f303248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ScheduledExecutorService f303249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Future<?> f303250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ThreadFactory f303251f;

        a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f303246a = nanos;
            this.f303247b = new ConcurrentLinkedQueue<>();
            this.f303248c = new io.reactivex.disposables.b();
            this.f303251f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, g.f303236g);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f303249d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f303250e = scheduledFutureScheduleWithFixedDelay;
        }

        void a() {
            if (this.f303247b.isEmpty()) {
                return;
            }
            long jC = c();
            for (c cVar : this.f303247b) {
                if (cVar.i() > jC) {
                    return;
                }
                if (this.f303247b.remove(cVar)) {
                    this.f303248c.a(cVar);
                }
            }
        }

        c b() {
            if (this.f303248c.k()) {
                return g.f303241l;
            }
            while (!this.f303247b.isEmpty()) {
                c cVarPoll = this.f303247b.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f303251f);
            this.f303248c.c(cVar);
            return cVar;
        }

        long c() {
            return System.nanoTime();
        }

        void d(c cVar) {
            cVar.j(c() + this.f303246a);
            this.f303247b.offer(cVar);
        }

        void e() {
            this.f303248c.dispose();
            Future<?> future = this.f303250e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f303249d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    static final class b extends j0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f303253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f303254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f303255d = new AtomicBoolean();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.disposables.b f303252a = new io.reactivex.disposables.b();

        b(a aVar) {
            this.f303253b = aVar;
            this.f303254c = aVar.b();
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c c(@cj.f Runnable runnable, long j10, @cj.f TimeUnit timeUnit) {
            return this.f303252a.k() ? io.reactivex.internal.disposables.e.INSTANCE : this.f303254c.e(runnable, j10, timeUnit, this.f303252a);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f303255d.compareAndSet(false, true)) {
                this.f303252a.dispose();
                this.f303253b.d(this.f303254c);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303255d.get();
        }
    }

    static final class c extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f303256c;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f303256c = 0L;
        }

        public long i() {
            return this.f303256c;
        }

        public void j(long j10) {
            this.f303256c = j10;
        }
    }

    static {
        c cVar = new c(new k("RxCachedThreadSchedulerShutdown"));
        f303241l = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger(f303242m, 5).intValue()));
        k kVar = new k(f303233d, iMax);
        f303234e = kVar;
        f303236g = new k(f303235f, iMax);
        a aVar = new a(0L, null, kVar);
        f303243n = aVar;
        aVar.e();
    }

    public g() {
        this(f303234e);
    }

    @Override // io.reactivex.j0
    @cj.f
    public j0.c c() {
        return new b(this.f303245c.get());
    }

    @Override // io.reactivex.j0
    public void h() {
        a aVar;
        a aVar2;
        do {
            aVar = this.f303245c.get();
            aVar2 = f303243n;
            if (aVar == aVar2) {
                return;
            }
        } while (!z1.a(this.f303245c, aVar, aVar2));
        aVar.e();
    }

    @Override // io.reactivex.j0
    public void i() {
        a aVar = new a(f303239j, f303240k, this.f303244b);
        if (z1.a(this.f303245c, f303243n, aVar)) {
            return;
        }
        aVar.e();
    }

    public int l() {
        return this.f303245c.get().f303248c.g();
    }

    public g(ThreadFactory threadFactory) {
        this.f303244b = threadFactory;
        this.f303245c = new AtomicReference<>(f303243n);
        i();
    }
}
