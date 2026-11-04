package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class x<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.i f302550b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T>, io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f302551d = -1953724749712440952L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.i f302553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f302554c;

        a(io.reactivex.i0<? super T> i0Var, io.reactivex.i iVar) {
            this.f302552a = i0Var;
            this.f302553b = iVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (!io.reactivex.internal.disposables.d.o(this, cVar) || this.f302554c) {
                return;
            }
            this.f302552a.d(this);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302554c) {
                this.f302552a.onComplete();
                return;
            }
            this.f302554c = true;
            io.reactivex.internal.disposables.d.d(this, null);
            io.reactivex.i iVar = this.f302553b;
            this.f302553b = null;
            iVar.b(this);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302552a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302552a.onNext(t10);
        }
    }

    public x(io.reactivex.b0<T> b0Var, io.reactivex.i iVar) {
        super(b0Var);
        this.f302550b = iVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302550b));
    }
}
