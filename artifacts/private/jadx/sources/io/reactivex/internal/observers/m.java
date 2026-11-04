package io.reactivex.internal.observers;

import io.reactivex.i0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class m<T, R> extends l<R> implements i0<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f298771k = -266195175408988651L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected io.reactivex.disposables.c f298772j;

    public m(i0<? super R> i0Var) {
        super(i0Var);
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.disposables.d.q(this.f298772j, cVar)) {
            this.f298772j = cVar;
            this.f298769b.d(this);
        }
    }

    @Override // io.reactivex.internal.observers.l, io.reactivex.disposables.c
    public void dispose() {
        super.dispose();
        this.f298772j.dispose();
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        T t10 = this.f298770c;
        if (t10 == null) {
            a();
        } else {
            this.f298770c = null;
            c(t10);
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        this.f298770c = null;
        e(th2);
    }
}
