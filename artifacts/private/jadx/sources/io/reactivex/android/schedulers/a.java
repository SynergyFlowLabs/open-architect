package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.j0;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j0 f298643a = io.reactivex.android.plugins.a.f(new CallableC2118a());

    /* JADX INFO: renamed from: io.reactivex.android.schedulers.a$a, reason: collision with other inner class name */
    static class CallableC2118a implements Callable<j0> {
        CallableC2118a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 call() throws Exception {
            return b.f298644a;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j0 f298644a = new io.reactivex.android.schedulers.b(new Handler(Looper.getMainLooper()));

        private b() {
        }
    }

    private a() {
        throw new AssertionError("No instances.");
    }

    public static j0 a(Looper looper) {
        if (looper != null) {
            return new io.reactivex.android.schedulers.b(new Handler(looper));
        }
        throw new NullPointerException("looper == null");
    }

    public static j0 b() {
        return io.reactivex.android.plugins.a.g(f298643a);
    }
}
