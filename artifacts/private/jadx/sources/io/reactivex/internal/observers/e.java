package io.reactivex.internal.observers;

import io.reactivex.i0;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e<T> extends CountDownLatch implements i0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f298746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f298747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    io.reactivex.disposables.c f298748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f298749d;

    public e() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.e.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                throw io.reactivex.internal.util.k.f(e10);
            }
        }
        Throwable th2 = this.f298747b;
        if (th2 == null) {
            return this.f298746a;
        }
        throw io.reactivex.internal.util.k.f(th2);
    }

    @Override // io.reactivex.i0
    public final void d(io.reactivex.disposables.c cVar) {
        this.f298748c = cVar;
        if (this.f298749d) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        this.f298749d = true;
        io.reactivex.disposables.c cVar = this.f298748c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return this.f298749d;
    }

    @Override // io.reactivex.i0
    public final void onComplete() {
        countDown();
    }
}
