package io.reactivex.internal.operators.maybe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class l<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f300869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f300870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f300871d;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300872g = 5566860102500855068L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f300874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f300875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0 f300876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        T f300877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Throwable f300878f;

        a(io.reactivex.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f300873a = vVar;
            this.f300874b = j10;
            this.f300875c = timeUnit;
            this.f300876d = j0Var;
        }

        void a() {
            io.reactivex.internal.disposables.d.d(this, this.f300876d.f(this, this.f300874b, this.f300875c));
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300877e = t10;
            a();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f300873a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300878f = th2;
            a();
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f300878f;
            if (th2 != null) {
                this.f300873a.onError(th2);
                return;
            }
            T t10 = this.f300877e;
            if (t10 != null) {
                this.f300873a.b(t10);
            } else {
                this.f300873a.onComplete();
            }
        }
    }

    public l(io.reactivex.y<T> yVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        super(yVar);
        this.f300869b = j10;
        this.f300870c = timeUnit;
        this.f300871d = j0Var;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f300869b, this.f300870c, this.f300871d));
    }
}
