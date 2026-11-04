package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class n4<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f302036c = -8612022020200669122L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i0<? super T> f302037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.c> f302038b = new AtomicReference<>();

    public n4(io.reactivex.i0<? super T> i0Var) {
        this.f302037a = i0Var;
    }

    public void a(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.disposables.d.n(this, cVar);
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.disposables.d.o(this.f302038b, cVar)) {
            this.f302037a.d(this);
        }
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this.f302038b);
        io.reactivex.internal.disposables.d.b(this);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f302038b.get() == io.reactivex.internal.disposables.d.DISPOSED;
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        dispose();
        this.f302037a.onComplete();
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        dispose();
        this.f302037a.onError(th2);
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        this.f302037a.onNext(t10);
    }
}
