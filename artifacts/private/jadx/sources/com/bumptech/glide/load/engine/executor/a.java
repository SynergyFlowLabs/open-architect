package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.l1;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f96514b = "source";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f96515c = "disk-cache";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f96516d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f96517e = "GlideExecutor";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f96518f = "source-unlimited";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f96519g = "animation";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f96520h = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f96521i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile int f96522j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f96523a;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.a$a, reason: collision with other inner class name */
    public static final class C0856a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f96524g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f96525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f96526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f96527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private c f96528d = c.f96540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f96529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f96530f;

        C0856a(boolean z10) {
            this.f96525a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f96529e)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f96529e);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f96526b, this.f96527c, this.f96530f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f96529e, this.f96528d, this.f96525a));
            if (this.f96530f != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public C0856a b(String str) {
            this.f96529e = str;
            return this;
        }

        public C0856a c(@g0(from = 1) int i10) {
            this.f96526b = i10;
            this.f96527c = i10;
            return this;
        }

        public C0856a d(long j10) {
            this.f96530f = j10;
            return this;
        }

        public C0856a e(@NonNull c cVar) {
            this.f96528d = cVar;
            return this;
        }
    }

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f96531e = 9;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f96532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f96533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f96534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f96535d;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.a$b$a, reason: collision with other inner class name */
        class C0857a extends Thread {
            C0857a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (b.this.f96534c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th2) {
                    b.this.f96533b.a(th2);
                }
            }
        }

        b(String str, c cVar, boolean z10) {
            this.f96532a = str;
            this.f96533b = cVar;
            this.f96534c = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(@NonNull Runnable runnable) {
            C0857a c0857a;
            try {
                c0857a = new C0857a(runnable, "glide-" + this.f96532a + "-thread-" + this.f96535d);
                this.f96535d = this.f96535d + 1;
            } catch (Throwable th2) {
                throw th2;
            }
            return c0857a;
        }
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f96537a = new C0858a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f96538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f96539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f96540d;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.a$c$a, reason: collision with other inner class name */
        class C0858a implements c {
            C0858a() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(Throwable th2) {
            }
        }

        class b implements c {
            b() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(Throwable th2) {
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.a$c$c, reason: collision with other inner class name */
        class C0859c implements c {
            C0859c() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f96538b = bVar;
            f96539c = new C0859c();
            f96540d = bVar;
        }

        void a(Throwable th2);
    }

    @l1
    a(ExecutorService executorService) {
        this.f96523a = executorService;
    }

    public static int a() {
        if (f96522j == 0) {
            f96522j = Math.min(4, com.bumptech.glide.load.engine.executor.b.a());
        }
        return f96522j;
    }

    public static C0856a b() {
        return new C0856a(true).c(a() >= 4 ? 2 : 1).b(f96519g);
    }

    public static a c() {
        return b().a();
    }

    @Deprecated
    public static a d(int i10, c cVar) {
        return b().c(i10).e(cVar).a();
    }

    public static C0856a e() {
        return new C0856a(true).c(1).b(f96515c);
    }

    public static a f() {
        return e().a();
    }

    @Deprecated
    public static a g(int i10, String str, c cVar) {
        return e().c(i10).b(str).e(cVar).a();
    }

    @Deprecated
    public static a h(c cVar) {
        return e().e(cVar).a();
    }

    public static C0856a i() {
        return new C0856a(false).c(a()).b("source");
    }

    public static a j() {
        return i().a();
    }

    @Deprecated
    public static a k(int i10, String str, c cVar) {
        return i().c(i10).b(str).e(cVar).a();
    }

    @Deprecated
    public static a l(c cVar) {
        return i().e(cVar).a();
    }

    public static a m() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f96520h, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b(f96518f, c.f96540d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f96523a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f96523a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f96523a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f96523a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f96523a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f96523a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f96523a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f96523a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f96523a.submit(runnable);
    }

    public String toString() {
        return this.f96523a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f96523a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f96523a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t10) {
        return this.f96523a.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f96523a.submit(callable);
    }
}
