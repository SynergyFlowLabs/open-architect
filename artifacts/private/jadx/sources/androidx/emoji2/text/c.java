package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f51055a = 15;

    @w0(28)
    static class a {
        private a() {
        }

        @u
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private c() {
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    @NonNull
    @Deprecated
    static Executor b(@NonNull Handler handler) {
        Objects.requireNonNull(handler);
        return new androidx.emoji2.text.a(handler);
    }

    static ThreadPoolExecutor c(@NonNull final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return c.a(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Handler d() {
        return a.a(Looper.getMainLooper());
    }
}
