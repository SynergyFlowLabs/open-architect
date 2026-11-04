package io.reactivex.android;

import android.os.Looper;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f298639a = new AtomicBoolean();

    /* JADX INFO: renamed from: io.reactivex.android.a$a, reason: collision with other inner class name */
    class RunnableC2117a implements Runnable {
        RunnableC2117a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a();
        }
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    protected abstract void a();

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        if (this.f298639a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
                return;
            }
            io.reactivex.android.schedulers.a.b().e(new RunnableC2117a());
        }
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return this.f298639a.get();
    }
}
