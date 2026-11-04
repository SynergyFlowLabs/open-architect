package io.grpc;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public final class c3 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f288697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<Runnable> f288698b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference<Thread> f288699c = new AtomicReference<>();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f288700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f288701b;

        a(c cVar, Runnable runnable) {
            this.f288700a = cVar;
            this.f288701b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            c3.this.execute(this.f288700a);
        }

        public String toString() {
            return this.f288701b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f288703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f288704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f288705c;

        b(c cVar, Runnable runnable, long j10) {
            this.f288703a = cVar;
            this.f288704b = runnable;
            this.f288705c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c3.this.execute(this.f288703a);
        }

        public String toString() {
            return this.f288704b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f288705c + ")";
        }
    }

    private static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f288707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f288708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f288709c;

        c(Runnable runnable) {
            this.f288707a = (Runnable) com.google.common.base.j0.F(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f288708b) {
                return;
            }
            this.f288709c = true;
            this.f288707a.run();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f288710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ScheduledFuture<?> f288711b;

        /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }

        public void a() {
            this.f288710a.f288708b = true;
            this.f288711b.cancel(false);
        }

        public boolean b() {
            c cVar = this.f288710a;
            return (cVar.f288709c || cVar.f288708b) ? false : true;
        }

        private d(c cVar, ScheduledFuture<?> scheduledFuture) {
            this.f288710a = (c) com.google.common.base.j0.F(cVar, "runnable");
            this.f288711b = (ScheduledFuture) com.google.common.base.j0.F(scheduledFuture, "future");
        }
    }

    public c3(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f288697a = (Thread.UncaughtExceptionHandler) com.google.common.base.j0.F(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        while (androidx.compose.animation.core.z1.a(this.f288699c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnablePoll = this.f288698b.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    try {
                        runnablePoll.run();
                    } catch (Throwable th2) {
                        this.f288697a.uncaughtException(Thread.currentThread(), th2);
                    }
                } catch (Throwable th3) {
                    this.f288699c.set(null);
                    throw th3;
                }
            }
            this.f288699c.set(null);
            if (this.f288698b.isEmpty()) {
                break;
            }
        }
    }

    public final void b(Runnable runnable) {
        this.f288698b.add((Runnable) com.google.common.base.j0.F(runnable, "runnable is null"));
    }

    public final d c(Runnable runnable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j10, timeUnit), null);
    }

    public final d d(Runnable runnable, long j10, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j11), j10, j11, timeUnit), null);
    }

    public void e() {
        com.google.common.base.j0.h0(Thread.currentThread() == this.f288699c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
