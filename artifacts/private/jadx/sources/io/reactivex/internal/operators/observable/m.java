package io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class m<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f301930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f301931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<U> f301932d;

    static final class a<T, U extends Collection<? super T>> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super U> f301933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f301934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Callable<U> f301935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        U f301936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f301937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.c f301938f;

        a(io.reactivex.i0<? super U> i0Var, int i10, Callable<U> callable) {
            this.f301933a = i0Var;
            this.f301934b = i10;
            this.f301935c = callable;
        }

        boolean a() {
            try {
                this.f301936d = (U) io.reactivex.internal.functions.b.g(this.f301935c.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301936d = null;
                io.reactivex.disposables.c cVar = this.f301938f;
                if (cVar == null) {
                    io.reactivex.internal.disposables.e.l(th2, this.f301933a);
                    return false;
                }
                cVar.dispose();
                this.f301933a.onError(th2);
                return false;
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301938f, cVar)) {
                this.f301938f = cVar;
                this.f301933a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301938f.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301938f.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            U u10 = this.f301936d;
            if (u10 != null) {
                this.f301936d = null;
                if (!u10.isEmpty()) {
                    this.f301933a.onNext(u10);
                }
                this.f301933a.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301936d = null;
            this.f301933a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            U u10 = this.f301936d;
            if (u10 != null) {
                u10.add(t10);
                int i10 = this.f301937e + 1;
                this.f301937e = i10;
                if (i10 >= this.f301934b) {
                    this.f301933a.onNext(u10);
                    this.f301937e = 0;
                    a();
                }
            }
        }
    }

    static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f301939h = -8223395059921494546L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super U> f301940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f301941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f301942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Callable<U> f301943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f301944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ArrayDeque<U> f301945f = new ArrayDeque<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f301946g;

        b(io.reactivex.i0<? super U> i0Var, int i10, int i11, Callable<U> callable) {
            this.f301940a = i0Var;
            this.f301941b = i10;
            this.f301942c = i11;
            this.f301943d = callable;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301944e, cVar)) {
                this.f301944e = cVar;
                this.f301940a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301944e.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301944e.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            while (!this.f301945f.isEmpty()) {
                this.f301940a.onNext(this.f301945f.poll());
            }
            this.f301940a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301945f.clear();
            this.f301940a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            long j10 = this.f301946g;
            this.f301946g = 1 + j10;
            if (j10 % ((long) this.f301942c) == 0) {
                try {
                    this.f301945f.offer((U) ((Collection) io.reactivex.internal.functions.b.g(this.f301943d.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
                } catch (Throwable th2) {
                    this.f301945f.clear();
                    this.f301944e.dispose();
                    this.f301940a.onError(th2);
                    return;
                }
            }
            Iterator<U> it = this.f301945f.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.f301941b <= next.size()) {
                    it.remove();
                    this.f301940a.onNext(next);
                }
            }
        }
    }

    public m(io.reactivex.g0<T> g0Var, int i10, int i11, Callable<U> callable) {
        super(g0Var);
        this.f301930b = i10;
        this.f301931c = i11;
        this.f301932d = callable;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super U> i0Var) {
        int i10 = this.f301931c;
        int i11 = this.f301930b;
        if (i10 != i11) {
            this.f301291a.a(new b(i0Var, this.f301930b, this.f301931c, this.f301932d));
            return;
        }
        a aVar = new a(i0Var, i11, this.f301932d);
        if (aVar.a()) {
            this.f301291a.a(aVar);
        }
    }
}
