package io.reactivex.internal.schedulers;

import io.reactivex.j0;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class i extends j0.c implements io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f303261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f303262b;

    public i(ThreadFactory threadFactory) {
        this.f303261a = p.a(threadFactory);
    }

    @Override // io.reactivex.j0.c
    @cj.f
    public io.reactivex.disposables.c b(@cj.f Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // io.reactivex.j0.c
    @cj.f
    public io.reactivex.disposables.c c(@cj.f Runnable runnable, long j10, @cj.f TimeUnit timeUnit) {
        return this.f303262b ? io.reactivex.internal.disposables.e.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        if (this.f303262b) {
            return;
        }
        this.f303262b = true;
        this.f303261a.shutdownNow();
    }

    @cj.f
    public n e(Runnable runnable, long j10, @cj.f TimeUnit timeUnit, @cj.g io.reactivex.internal.disposables.c cVar) {
        n nVar = new n(io.reactivex.plugins.a.b0(runnable), cVar);
        if (cVar != null && !cVar.c(nVar)) {
            return nVar;
        }
        try {
            nVar.a(j10 <= 0 ? this.f303261a.submit((Callable) nVar) : this.f303261a.schedule((Callable) nVar, j10, timeUnit));
            return nVar;
        } catch (RejectedExecutionException e10) {
            if (cVar != null) {
                cVar.a(nVar);
            }
            io.reactivex.plugins.a.Y(e10);
            return nVar;
        }
    }

    public io.reactivex.disposables.c f(Runnable runnable, long j10, TimeUnit timeUnit) {
        m mVar = new m(io.reactivex.plugins.a.b0(runnable));
        try {
            mVar.b(j10 <= 0 ? this.f303261a.submit(mVar) : this.f303261a.schedule(mVar, j10, timeUnit));
            return mVar;
        } catch (RejectedExecutionException e10) {
            io.reactivex.plugins.a.Y(e10);
            return io.reactivex.internal.disposables.e.INSTANCE;
        }
    }

    public io.reactivex.disposables.c g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
        if (j11 <= 0) {
            f fVar = new f(runnableB0, this.f303261a);
            try {
                fVar.b(j10 <= 0 ? this.f303261a.submit(fVar) : this.f303261a.schedule(fVar, j10, timeUnit));
                return fVar;
            } catch (RejectedExecutionException e10) {
                io.reactivex.plugins.a.Y(e10);
                return io.reactivex.internal.disposables.e.INSTANCE;
            }
        }
        l lVar = new l(runnableB0);
        try {
            lVar.b(this.f303261a.scheduleAtFixedRate(lVar, j10, j11, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e11) {
            io.reactivex.plugins.a.Y(e11);
            return io.reactivex.internal.disposables.e.INSTANCE;
        }
    }

    public void h() {
        if (!this.f303262b) {
            this.f303262b = true;
            this.f303261a.shutdown();
        }
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f303262b;
    }
}
