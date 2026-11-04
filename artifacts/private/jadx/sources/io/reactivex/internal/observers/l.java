package io.reactivex.internal.observers;

import io.reactivex.i0;

/* JADX INFO: loaded from: classes8.dex */
public class l<T> extends b<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f298763d = -5502432239815349361L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f298764e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f298765f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f298766g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f298767h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f298768i = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final i0<? super T> f298769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected T f298770c;

    public l(i0<? super T> i0Var) {
        this.f298769b = i0Var;
    }

    public final void a() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f298769b.onComplete();
    }

    public final void c(T t10) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        i0<? super T> i0Var = this.f298769b;
        if (i10 == 8) {
            this.f298770c = t10;
            lazySet(16);
            i0Var.onNext(null);
        } else {
            lazySet(2);
            i0Var.onNext(t10);
        }
        if (get() != 4) {
            i0Var.onComplete();
        }
    }

    @Override // ej.o
    public final void clear() {
        lazySet(32);
        this.f298770c = null;
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        set(4);
        int i10 = 3 << 0;
        this.f298770c = null;
    }

    public final void e(Throwable th2) {
        if ((get() & 54) != 0) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            lazySet(2);
            this.f298769b.onError(th2);
        }
    }

    public final boolean f() {
        return getAndSet(4) != 4;
    }

    @Override // ej.o
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return get() == 4;
    }

    @Override // ej.k
    public final int p(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // ej.o
    @cj.g
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t10 = this.f298770c;
        this.f298770c = null;
        lazySet(32);
        return t10;
    }
}
