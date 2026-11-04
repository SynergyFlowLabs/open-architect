package androidx.core.os;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48045a = "HandlerCompat";

    @w0(28)
    private static class a {
        private a() {
        }

        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static Handler b(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        public static boolean c(Handler handler, Runnable runnable, Object obj, long j10) {
            return handler.postDelayed(runnable, obj, j10);
        }
    }

    @w0(29)
    private static class b {
        private b() {
        }

        public static boolean a(Handler handler, Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    private k() {
    }

    @NonNull
    public static Handler a(@NonNull Looper looper) {
        return a.a(looper);
    }

    @NonNull
    public static Handler b(@NonNull Looper looper, @NonNull Handler.Callback callback) {
        return a.b(looper, callback);
    }

    public static boolean c(@NonNull Handler handler, @NonNull Runnable runnable) {
        return b.a(handler, runnable);
    }

    public static boolean d(@NonNull Handler handler, @NonNull Runnable runnable, @androidx.annotation.p0 Object obj, long j10) {
        return a.c(handler, runnable, obj, j10);
    }
}
