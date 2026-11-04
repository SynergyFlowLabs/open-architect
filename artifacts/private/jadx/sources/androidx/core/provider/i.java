package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.core.util.t;
import io.sentry.k4;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
class i {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f48163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48164b;

        /* JADX INFO: renamed from: androidx.core.provider.i$a$a, reason: collision with other inner class name */
        private static class C0400a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f48165a;

            C0400a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f48165a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f48165a);
                super.run();
            }
        }

        a(@NonNull String str, int i10) {
            this.f48163a = str;
            this.f48164b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0400a(runnable, this.f48163a, this.f48164b);
        }
    }

    private static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f48166a;

        b(@NonNull Handler handler) {
            this.f48166a = (Handler) t.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (this.f48166a.post((Runnable) t.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f48166a + " is shutting down");
        }
    }

    private static class c<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private Callable<T> f48167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private androidx.core.util.e<T> f48168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private Handler f48169c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.e f48170a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f48171b;

            a(androidx.core.util.e eVar, Object obj) {
                this.f48170a = eVar;
                this.f48171b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f48170a.accept(this.f48171b);
            }
        }

        c(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull androidx.core.util.e<T> eVar) {
            this.f48167a = callable;
            this.f48168b = eVar;
            this.f48169c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f48167a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f48169c.post(new a(this.f48168b, tCall));
        }
    }

    private i() {
    }

    static ThreadPoolExecutor a(@NonNull String str, int i10, @g0(from = 0) int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(@NonNull Handler handler) {
        return new b(handler);
    }

    static <T> void c(@NonNull Executor executor, @NonNull Callable<T> callable, @NonNull androidx.core.util.e<T> eVar) {
        executor.execute(new c(androidx.core.provider.b.a(), callable, eVar));
    }

    static <T> T d(@NonNull ExecutorService executorService, @NonNull Callable<T> callable, @g0(from = 0) int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException(k4.f305718l3);
        }
    }
}
