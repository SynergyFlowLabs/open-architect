package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class d4<T, D> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends D> f301465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super D, ? extends io.reactivex.g0<? extends T>> f301466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super D> f301467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f301468d;

    static final class a<T, D> extends AtomicBoolean implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f301469f = 5904473792286235046L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final D f301471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.g<? super D> f301472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f301473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f301474e;

        a(io.reactivex.i0<? super T> i0Var, D d10, dj.g<? super D> gVar, boolean z10) {
            this.f301470a = i0Var;
            this.f301471b = d10;
            this.f301472c = gVar;
            this.f301473d = z10;
        }

        void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f301472c.accept(this.f301471b);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301474e, cVar)) {
                this.f301474e = cVar;
                this.f301470a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            a();
            this.f301474e.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (!this.f301473d) {
                this.f301470a.onComplete();
                this.f301474e.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f301472c.accept(this.f301471b);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f301470a.onError(th2);
                    return;
                }
            }
            this.f301474e.dispose();
            this.f301470a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f301473d) {
                this.f301470a.onError(th2);
                this.f301474e.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f301472c.accept(this.f301471b);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    th2 = new io.reactivex.exceptions.a(th2, th3);
                }
            }
            this.f301474e.dispose();
            this.f301470a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301470a.onNext(t10);
        }
    }

    public d4(Callable<? extends D> callable, dj.o<? super D, ? extends io.reactivex.g0<? extends T>> oVar, dj.g<? super D> gVar, boolean z10) {
        this.f301465a = callable;
        this.f301466b = oVar;
        this.f301467c = gVar;
        this.f301468d = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        try {
            D dCall = this.f301465a.call();
            try {
                ((io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f301466b.apply(dCall), "The sourceSupplier returned a null ObservableSource")).a(new a(i0Var, dCall, this.f301467c, this.f301468d));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                try {
                    this.f301467c.accept(dCall);
                    io.reactivex.internal.disposables.e.l(th2, i0Var);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    io.reactivex.internal.disposables.e.l(new io.reactivex.exceptions.a(th2, th3), i0Var);
                }
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.b.b(th4);
            io.reactivex.internal.disposables.e.l(th4, i0Var);
        }
    }
}
