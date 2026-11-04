package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class a3<T> extends io.reactivex.b0<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<? extends T> f301324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<? extends T> f301325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.d<? super T, ? super T> f301326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301327d;

    static final class a<T> extends AtomicInteger implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f301328j = -6178010334400373240L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super Boolean> f301329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.d<? super T, ? super T> f301330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.disposables.a f301331c = new io.reactivex.internal.disposables.a(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.g0<? extends T> f301332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.g0<? extends T> f301333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final b<T>[] f301334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f301335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        T f301336h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        T f301337i;

        a(io.reactivex.i0<? super Boolean> i0Var, int i10, io.reactivex.g0<? extends T> g0Var, io.reactivex.g0<? extends T> g0Var2, dj.d<? super T, ? super T> dVar) {
            this.f301329a = i0Var;
            this.f301332d = g0Var;
            this.f301333e = g0Var2;
            this.f301330b = dVar;
            int i11 = 0 >> 2;
            this.f301334f = new b[]{new b<>(this, 0, i10), new b<>(this, 1, i10)};
            boolean z10 = false & true;
        }

        void a(io.reactivex.internal.queue.c<T> cVar, io.reactivex.internal.queue.c<T> cVar2) {
            this.f301335g = true;
            cVar.clear();
            cVar2.clear();
        }

        void b() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.f301334f;
            b<T> bVar = bVarArr[0];
            io.reactivex.internal.queue.c<T> cVar = bVar.f301339b;
            b<T> bVar2 = bVarArr[1];
            io.reactivex.internal.queue.c<T> cVar2 = bVar2.f301339b;
            int iAddAndGet = 1;
            while (!this.f301335g) {
                boolean z10 = bVar.f301341d;
                if (z10 && (th3 = bVar.f301342e) != null) {
                    a(cVar, cVar2);
                    this.f301329a.onError(th3);
                    return;
                }
                boolean z11 = bVar2.f301341d;
                if (z11 && (th2 = bVar2.f301342e) != null) {
                    a(cVar, cVar2);
                    this.f301329a.onError(th2);
                    return;
                }
                if (this.f301336h == null) {
                    this.f301336h = cVar.poll();
                }
                boolean z12 = this.f301336h == null;
                if (this.f301337i == null) {
                    this.f301337i = cVar2.poll();
                }
                T t10 = this.f301337i;
                boolean z13 = t10 == null;
                if (z10 && z11 && z12 && z13) {
                    this.f301329a.onNext(Boolean.TRUE);
                    this.f301329a.onComplete();
                    return;
                }
                if (z10 && z11 && z12 != z13) {
                    a(cVar, cVar2);
                    this.f301329a.onNext(Boolean.FALSE);
                    this.f301329a.onComplete();
                    return;
                }
                if (!z12 && !z13) {
                    try {
                        if (!this.f301330b.test(this.f301336h, t10)) {
                            a(cVar, cVar2);
                            this.f301329a.onNext(Boolean.FALSE);
                            this.f301329a.onComplete();
                            return;
                        }
                        this.f301336h = null;
                        this.f301337i = null;
                    } catch (Throwable th4) {
                        io.reactivex.exceptions.b.b(th4);
                        a(cVar, cVar2);
                        this.f301329a.onError(th4);
                        return;
                    }
                }
                if (z12 || z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.clear();
            cVar2.clear();
        }

        boolean c(io.reactivex.disposables.c cVar, int i10) {
            return this.f301331c.b(i10, cVar);
        }

        void d() {
            b<T>[] bVarArr = this.f301334f;
            this.f301332d.a(bVarArr[0]);
            this.f301333e.a(bVarArr[1]);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (!this.f301335g) {
                this.f301335g = true;
                this.f301331c.dispose();
                if (getAndIncrement() == 0) {
                    b<T>[] bVarArr = this.f301334f;
                    bVarArr[0].f301339b.clear();
                    bVarArr[1].f301339b.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301335g;
        }
    }

    static final class b<T> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T> f301338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.queue.c<T> f301339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f301340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f301341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f301342e;

        b(a<T> aVar, int i10, int i11) {
            this.f301338a = aVar;
            this.f301340c = i10;
            this.f301339b = new io.reactivex.internal.queue.c<>(i11);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f301338a.c(cVar, this.f301340c);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301341d = true;
            this.f301338a.b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301342e = th2;
            this.f301341d = true;
            this.f301338a.b();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301339b.offer(t10);
            this.f301338a.b();
        }
    }

    public a3(io.reactivex.g0<? extends T> g0Var, io.reactivex.g0<? extends T> g0Var2, dj.d<? super T, ? super T> dVar, int i10) {
        this.f301324a = g0Var;
        this.f301325b = g0Var2;
        this.f301326c = dVar;
        this.f301327d = i10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super Boolean> i0Var) {
        a aVar = new a(i0Var, this.f301327d, this.f301324a, this.f301325b, this.f301326c);
        i0Var.d(aVar);
        aVar.d();
    }
}
