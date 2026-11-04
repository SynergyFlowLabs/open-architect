package io.reactivex.internal.observers;

import io.reactivex.n0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public final class h<T> extends CountDownLatch implements n0<T>, io.reactivex.f, io.reactivex.v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f298750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f298751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    io.reactivex.disposables.c f298752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f298753d;

    public h() {
        super(1);
    }

    public boolean a(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.e.b();
                if (!await(j10, timeUnit)) {
                    h();
                    return false;
                }
            } catch (InterruptedException e10) {
                h();
                throw io.reactivex.internal.util.k.f(e10);
            }
        }
        Throwable th2 = this.f298751b;
        if (th2 == null) {
            return true;
        }
        throw io.reactivex.internal.util.k.f(th2);
    }

    @Override // io.reactivex.n0
    public void b(T t10) {
        this.f298750a = t10;
        countDown();
    }

    public T c() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.e.b();
                await();
            } catch (InterruptedException e10) {
                h();
                throw io.reactivex.internal.util.k.f(e10);
            }
        }
        Throwable th2 = this.f298751b;
        if (th2 == null) {
            return this.f298750a;
        }
        throw io.reactivex.internal.util.k.f(th2);
    }

    @Override // io.reactivex.n0
    public void d(io.reactivex.disposables.c cVar) {
        this.f298752c = cVar;
        if (this.f298753d) {
            cVar.dispose();
        }
    }

    public T e(T t10) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.e.b();
                await();
            } catch (InterruptedException e10) {
                h();
                throw io.reactivex.internal.util.k.f(e10);
            }
        }
        Throwable th2 = this.f298751b;
        if (th2 != null) {
            throw io.reactivex.internal.util.k.f(th2);
        }
        T t11 = this.f298750a;
        return t11 != null ? t11 : t10;
    }

    public Throwable f() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.e.b();
                await();
            } catch (InterruptedException e10) {
                h();
                return e10;
            }
        }
        return this.f298751b;
    }

    public Throwable g(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.e.b();
                if (!await(j10, timeUnit)) {
                    h();
                    throw io.reactivex.internal.util.k.f(new TimeoutException(io.reactivex.internal.util.k.e(j10, timeUnit)));
                }
            } catch (InterruptedException e10) {
                h();
                throw io.reactivex.internal.util.k.f(e10);
            }
        }
        return this.f298751b;
    }

    void h() {
        this.f298753d = true;
        io.reactivex.disposables.c cVar = this.f298752c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.f
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.n0
    public void onError(Throwable th2) {
        this.f298751b = th2;
        countDown();
    }
}
