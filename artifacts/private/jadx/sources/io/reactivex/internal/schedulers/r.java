package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.z1;
import io.reactivex.j0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f303303d = "rx2.single-priority";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f303304e = "RxSingleScheduler";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final k f303305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final ScheduledExecutorService f303306g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f303307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f303308c;

    static final class a extends j0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f303309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.disposables.b f303310b = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f303311c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f303309a = scheduledExecutorService;
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c c(@cj.f Runnable runnable, long j10, @cj.f TimeUnit timeUnit) {
            if (this.f303311c) {
                return io.reactivex.internal.disposables.e.INSTANCE;
            }
            n nVar = new n(io.reactivex.plugins.a.b0(runnable), this.f303310b);
            this.f303310b.c(nVar);
            try {
                nVar.a(j10 <= 0 ? this.f303309a.submit((Callable) nVar) : this.f303309a.schedule((Callable) nVar, j10, timeUnit));
                return nVar;
            } catch (RejectedExecutionException e10) {
                dispose();
                io.reactivex.plugins.a.Y(e10);
                return io.reactivex.internal.disposables.e.INSTANCE;
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f303311c) {
                return;
            }
            this.f303311c = true;
            this.f303310b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303311c;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f303306g = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f303305f = new k(f303304e, Math.max(1, Math.min(10, Integer.getInteger(f303303d, 5).intValue())), true);
    }

    public r() {
        this(f303305f);
    }

    static ScheduledExecutorService l(ThreadFactory threadFactory) {
        return p.a(threadFactory);
    }

    @Override // io.reactivex.j0
    @cj.f
    public j0.c c() {
        return new a(this.f303308c.get());
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c f(@cj.f Runnable runnable, long j10, TimeUnit timeUnit) {
        m mVar = new m(io.reactivex.plugins.a.b0(runnable));
        try {
            mVar.b(j10 <= 0 ? this.f303308c.get().submit(mVar) : this.f303308c.get().schedule(mVar, j10, timeUnit));
            return mVar;
        } catch (RejectedExecutionException e10) {
            io.reactivex.plugins.a.Y(e10);
            return io.reactivex.internal.disposables.e.INSTANCE;
        }
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c g(@cj.f Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
        if (j11 > 0) {
            l lVar = new l(runnableB0);
            try {
                lVar.b(this.f303308c.get().scheduleAtFixedRate(lVar, j10, j11, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e10) {
                io.reactivex.plugins.a.Y(e10);
                return io.reactivex.internal.disposables.e.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f303308c.get();
        f fVar = new f(runnableB0, scheduledExecutorService);
        try {
            fVar.b(j10 <= 0 ? scheduledExecutorService.submit(fVar) : scheduledExecutorService.schedule(fVar, j10, timeUnit));
            return fVar;
        } catch (RejectedExecutionException e11) {
            io.reactivex.plugins.a.Y(e11);
            return io.reactivex.internal.disposables.e.INSTANCE;
        }
    }

    @Override // io.reactivex.j0
    public void h() {
        ScheduledExecutorService andSet;
        ScheduledExecutorService scheduledExecutorService = this.f303308c.get();
        ScheduledExecutorService scheduledExecutorService2 = f303306g;
        if (scheduledExecutorService != scheduledExecutorService2 && (andSet = this.f303308c.getAndSet(scheduledExecutorService2)) != scheduledExecutorService2) {
            andSet.shutdownNow();
        }
    }

    @Override // io.reactivex.j0
    public void i() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorServiceL = null;
        do {
            scheduledExecutorService = this.f303308c.get();
            if (scheduledExecutorService != f303306g) {
                if (scheduledExecutorServiceL == null) {
                    break;
                }
                scheduledExecutorServiceL.shutdown();
                return;
            } else if (scheduledExecutorServiceL == null) {
                scheduledExecutorServiceL = l(this.f303307b);
            }
        } while (!z1.a(this.f303308c, scheduledExecutorService, scheduledExecutorServiceL));
    }

    public r(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f303308c = atomicReference;
        this.f303307b = threadFactory;
        atomicReference.lazySet(l(threadFactory));
    }
}
