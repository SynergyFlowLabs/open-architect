package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class z1<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.i f302671b;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f302672g = -4592979584110982903L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302674b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C2183a f302675c = new C2183a(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f302676d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f302677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f302678f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.z1$a$a, reason: collision with other inner class name */
        static final class C2183a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f302679b = -2935427570954647017L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?> f302680a;

            C2183a(a<?> aVar) {
                this.f302680a = aVar;
            }

            @Override // io.reactivex.f
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.f
            public void onComplete() {
                this.f302680a.a();
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                this.f302680a.b(th2);
            }
        }

        a(io.reactivex.i0<? super T> i0Var) {
            this.f302673a = i0Var;
        }

        void a() {
            this.f302678f = true;
            if (this.f302677e) {
                io.reactivex.internal.util.l.a(this.f302673a, this, this.f302676d);
            }
        }

        void b(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f302674b);
            io.reactivex.internal.util.l.c(this.f302673a, th2, this, this.f302676d);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f302674b, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f302674b);
            io.reactivex.internal.disposables.d.b(this.f302675c);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f302674b.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302677e = true;
            if (this.f302678f) {
                io.reactivex.internal.util.l.a(this.f302673a, this, this.f302676d);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f302674b);
            io.reactivex.internal.util.l.c(this.f302673a, th2, this, this.f302676d);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            io.reactivex.internal.util.l.e(this.f302673a, t10, this, this.f302676d);
        }
    }

    public z1(io.reactivex.b0<T> b0Var, io.reactivex.i iVar) {
        super(b0Var);
        this.f302671b = iVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        a aVar = new a(i0Var);
        i0Var.d(aVar);
        this.f301291a.a(aVar);
        this.f302671b.b(aVar.f302675c);
    }
}
