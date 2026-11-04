package io.reactivex.internal.observers;

import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class s<T> extends AtomicReference<io.reactivex.disposables.c> implements i0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f298789f = -5417183359794346637L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final t<T> f298790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f298791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ej.o<T> f298792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f298793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f298794e;

    public s(t<T> tVar, int i10) {
        this.f298790a = tVar;
        this.f298791b = i10;
    }

    public int a() {
        return this.f298794e;
    }

    public boolean b() {
        return this.f298793d;
    }

    public ej.o<T> c() {
        return this.f298792c;
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.disposables.d.o(this, cVar)) {
            if (cVar instanceof ej.j) {
                ej.j jVar = (ej.j) cVar;
                int iP = jVar.p(3);
                if (iP == 1) {
                    this.f298794e = iP;
                    this.f298792c = jVar;
                    this.f298793d = true;
                    this.f298790a.f(this);
                    return;
                }
                if (iP == 2) {
                    this.f298794e = iP;
                    this.f298792c = jVar;
                    return;
                }
            }
            this.f298792c = io.reactivex.internal.util.v.c(-this.f298791b);
        }
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this);
    }

    public void e() {
        this.f298793d = true;
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return io.reactivex.internal.disposables.d.c(get());
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        this.f298790a.f(this);
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        this.f298790a.e(this, th2);
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        if (this.f298794e == 0) {
            this.f298790a.g(this, t10);
        } else {
            this.f298790a.c();
        }
    }
}
