package androidx.arch.core.executor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11704a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f11705b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private volatile Handler f11706c;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f11707c = "arch_disk_io_";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f11708a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(f11707c + this.f11708a.getAndIncrement());
            return thread;
        }
    }

    @w0(28)
    private static class b {
        private b() {
        }

        @NonNull
        public static Handler a(@NonNull Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @NonNull
    private static Handler e(@NonNull Looper looper) {
        return b.a(looper);
    }

    @Override // androidx.arch.core.executor.e
    public void a(@NonNull Runnable runnable) {
        this.f11705b.execute(runnable);
    }

    @Override // androidx.arch.core.executor.e
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // androidx.arch.core.executor.e
    public void d(@NonNull Runnable runnable) {
        if (this.f11706c == null) {
            synchronized (this.f11704a) {
                try {
                    if (this.f11706c == null) {
                        this.f11706c = e(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f11706c.post(runnable);
    }
}
