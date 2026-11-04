package io.reactivex.internal.observers;

import io.reactivex.i0;

/* JADX INFO: loaded from: classes8.dex */
public final class n<T> implements i0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i0<? super T> f298773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super io.reactivex.disposables.c> f298774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.a f298775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    io.reactivex.disposables.c f298776d;

    public n(i0<? super T> i0Var, dj.g<? super io.reactivex.disposables.c> gVar, dj.a aVar) {
        this.f298773a = i0Var;
        this.f298774b = gVar;
        this.f298775c = aVar;
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        try {
            this.f298774b.accept(cVar);
            if (io.reactivex.internal.disposables.d.q(this.f298776d, cVar)) {
                this.f298776d = cVar;
                this.f298773a.d(this);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            cVar.dispose();
            this.f298776d = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.internal.disposables.e.l(th2, this.f298773a);
        }
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.disposables.c cVar = this.f298776d;
        io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
        if (cVar != dVar) {
            this.f298776d = dVar;
            try {
                this.f298775c.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            cVar.dispose();
        }
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f298776d.k();
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        io.reactivex.disposables.c cVar = this.f298776d;
        io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
        if (cVar != dVar) {
            this.f298776d = dVar;
            this.f298773a.onComplete();
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        io.reactivex.disposables.c cVar = this.f298776d;
        io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
        if (cVar == dVar) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            this.f298776d = dVar;
            this.f298773a.onError(th2);
        }
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        this.f298773a.onNext(t10);
    }
}
