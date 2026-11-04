package io.reactivex.internal.operators.observable;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class f1<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterable<? extends T> f301547a;

    static final class a<T> extends io.reactivex.internal.observers.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator<? extends T> f301549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f301550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f301551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f301552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f301553f;

        a(io.reactivex.i0<? super T> i0Var, Iterator<? extends T> it) {
            this.f301548a = i0Var;
            this.f301549b = it;
        }

        void a() {
            while (!k()) {
                try {
                    this.f301548a.onNext(io.reactivex.internal.functions.b.g(this.f301549b.next(), "The iterator returned a null value"));
                    if (k()) {
                        return;
                    }
                    try {
                        if (!this.f301549b.hasNext()) {
                            if (k()) {
                                return;
                            }
                            this.f301548a.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f301548a.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    this.f301548a.onError(th3);
                    return;
                }
            }
        }

        @Override // ej.o
        public void clear() {
            this.f301552e = true;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301550c = true;
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f301552e;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301550c;
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f301551d = true;
            return 1;
        }

        @Override // ej.o
        @cj.g
        public T poll() {
            if (this.f301552e) {
                return null;
            }
            if (!this.f301553f) {
                this.f301553f = true;
            } else if (!this.f301549b.hasNext()) {
                this.f301552e = true;
                return null;
            }
            return (T) io.reactivex.internal.functions.b.g(this.f301549b.next(), "The iterator returned a null value");
        }
    }

    public f1(Iterable<? extends T> iterable) {
        this.f301547a = iterable;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        try {
            Iterator<? extends T> it = this.f301547a.iterator();
            try {
                if (!it.hasNext()) {
                    io.reactivex.internal.disposables.e.d(i0Var);
                    return;
                }
                a aVar = new a(i0Var, it);
                i0Var.d(aVar);
                if (aVar.f301551d) {
                    return;
                }
                aVar.a();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.internal.disposables.e.l(th2, i0Var);
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.internal.disposables.e.l(th3, i0Var);
        }
    }
}
