package com.google.firebase.messaging.threads;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z7.d;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.messaging.threads.a f123783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile com.google.firebase.messaging.threads.a f123784b;

    /* JADX INFO: renamed from: com.google.firebase.messaging.threads.b$b, reason: collision with other inner class name */
    private static class C1176b implements com.google.firebase.messaging.threads.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f123785a = 60;

        private C1176b() {
        }

        @Override // com.google.firebase.messaging.threads.a
        @NonNull
        @e.a({"ThreadPoolCreation"})
        public ScheduledExecutorService a(int i10, c cVar) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i10));
        }

        @Override // com.google.firebase.messaging.threads.a
        @NonNull
        @e.a({"ThreadPoolCreation"})
        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        @Override // com.google.firebase.messaging.threads.a
        @NonNull
        public ExecutorService c(int i10, c cVar) {
            return b(i10, Executors.defaultThreadFactory(), cVar);
        }

        @Override // com.google.firebase.messaging.threads.a
        @NonNull
        public ExecutorService d(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        @Override // com.google.firebase.messaging.threads.a
        @NonNull
        @e.a({"ThreadPoolCreation"})
        public ExecutorService e(c cVar) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        }

        @Override // com.google.firebase.messaging.threads.a
        @NonNull
        @e.a({"ThreadPoolCreation"})
        public ScheduledExecutorService f(int i10, ThreadFactory threadFactory, c cVar) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i10, threadFactory));
        }

        @Override // com.google.firebase.messaging.threads.a
        @NonNull
        public ExecutorService g(c cVar) {
            return c(1, cVar);
        }

        @Override // com.google.firebase.messaging.threads.a
        @NonNull
        @e.a({"ThreadPoolCreation"})
        public Future<?> h(@d String str, @d String str2, c cVar, Runnable runnable) {
            FutureTask futureTask = new FutureTask(runnable, null);
            new Thread(futureTask, str2).start();
            return futureTask;
        }

        @Override // com.google.firebase.messaging.threads.a
        @NonNull
        @e.a({"ThreadPoolCreation"})
        public void i(@d String str, @d String str2, c cVar, Runnable runnable) {
            new Thread(runnable, str2).start();
        }

        @Override // com.google.firebase.messaging.threads.a
        @NonNull
        @e.a({"ThreadPoolCreation"})
        public ExecutorService j(ThreadFactory threadFactory, c cVar) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
        }
    }

    static {
        C1176b c1176b = new C1176b();
        f123783a = c1176b;
        f123784b = c1176b;
    }

    private b() {
    }

    public static com.google.firebase.messaging.threads.a a() {
        return f123784b;
    }

    static void b(com.google.firebase.messaging.threads.a aVar) {
        if (f123784b != f123783a) {
            throw new IllegalStateException("Trying to install an ExecutorFactory twice!");
        }
        f123784b = aVar;
    }
}
