package com.google.firebase.crashlytics.internal.common;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f121109a = 2;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f121110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f121111b;

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.k0$a$a, reason: collision with other inner class name */
        class C1124a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f121112a;

            C1124a(Runnable runnable) {
                this.f121112a = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.d
            public void a() {
                this.f121112a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f121110a = str;
            this.f121111b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C1124a(runnable));
            threadNewThread.setName(this.f121110a + this.f121111b.getAndIncrement());
            return threadNewThread;
        }
    }

    class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f121114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f121115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f121116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f121117d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f121114a = str;
            this.f121115b = executorService;
            this.f121116c = j10;
            this.f121117d = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.d
        public void a() {
            try {
                com.google.firebase.crashlytics.internal.g.f().b("Executing shutdown hook for " + this.f121114a);
                this.f121115b.shutdown();
                if (!this.f121115b.awaitTermination(this.f121116c, this.f121117d)) {
                    com.google.firebase.crashlytics.internal.g.f().b(this.f121114a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f121115b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.internal.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f121114a));
                this.f121115b.shutdownNow();
            }
        }
    }

    private k0() {
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @e.a({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static Executor c(Executor executor) {
        return com.google.firebase.concurrent.y.h(executor);
    }

    public static ExecutorService d(String str) {
        ExecutorService executorServiceG = g(f(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceG);
        return executorServiceG;
    }

    public static ScheduledExecutorService e(String str) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(f(str));
        a(str, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static ThreadFactory f(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @e.a({"ThreadPoolCreation"})
    private static ExecutorService g(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
