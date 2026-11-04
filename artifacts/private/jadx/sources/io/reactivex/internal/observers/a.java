package io.reactivex.internal.observers;

import io.reactivex.i0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a<T, R> implements i0<T>, ej.j<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final i0<? super R> f298736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected io.reactivex.disposables.c f298737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ej.j<T> f298738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f298739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f298740e;

    public a(i0<? super R> i0Var) {
        this.f298736a = i0Var;
    }

    protected void a() {
    }

    protected boolean b() {
        return true;
    }

    protected final void c(Throwable th2) {
        io.reactivex.exceptions.b.b(th2);
        this.f298737b.dispose();
        onError(th2);
    }

    @Override // ej.o
    public void clear() {
        this.f298738c.clear();
    }

    @Override // io.reactivex.i0
    public final void d(io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.disposables.d.q(this.f298737b, cVar)) {
            this.f298737b = cVar;
            if (cVar instanceof ej.j) {
                this.f298738c = (ej.j) cVar;
            }
            if (b()) {
                this.f298736a.d(this);
                a();
            }
        }
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        this.f298737b.dispose();
    }

    protected final int e(int i10) {
        ej.j<T> jVar = this.f298738c;
        if (jVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iP = jVar.p(i10);
        if (iP != 0) {
            this.f298740e = iP;
        }
        return iP;
    }

    @Override // ej.o
    public boolean isEmpty() {
        return this.f298738c.isEmpty();
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f298737b.k();
    }

    @Override // ej.o
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        if (this.f298739d) {
            return;
        }
        this.f298739d = true;
        this.f298736a.onComplete();
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        if (this.f298739d) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            this.f298739d = true;
            this.f298736a.onError(th2);
        }
    }

    @Override // ej.o
    public final boolean r(R r10, R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
