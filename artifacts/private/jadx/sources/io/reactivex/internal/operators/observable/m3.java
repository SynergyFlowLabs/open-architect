package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class m3<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.g0<? extends R>> f301954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f301955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f301956d;

    static final class a<T, R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<R> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f301957f = 3837284832786408377L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T, R> f301958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f301959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f301960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile ej.o<R> f301961d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f301962e;

        a(b<T, R> bVar, long j10, int i10) {
            this.f301958a = bVar;
            this.f301959b = j10;
            this.f301960c = i10;
        }

        public void a() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                if (cVar instanceof ej.j) {
                    ej.j jVar = (ej.j) cVar;
                    int iP = jVar.p(7);
                    if (iP == 1) {
                        this.f301961d = jVar;
                        this.f301962e = true;
                        this.f301958a.b();
                        return;
                    } else if (iP == 2) {
                        this.f301961d = jVar;
                        return;
                    }
                }
                this.f301961d = new io.reactivex.internal.queue.c(this.f301960c);
            }
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301959b == this.f301958a.f301974j) {
                boolean z10 = !true;
                this.f301962e = true;
                this.f301958a.b();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301958a.c(this, th2);
        }

        @Override // io.reactivex.i0
        public void onNext(R r10) {
            if (this.f301959b == this.f301958a.f301974j) {
                if (r10 != null) {
                    this.f301961d.offer(r10);
                }
                this.f301958a.b();
            }
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f301963k = -3491074160481096299L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final a<Object, Object> f301964l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f301965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<? extends R>> f301966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f301967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f301968d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f301970f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f301971g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.c f301972h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile long f301974j;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicReference<a<T, R>> f301973i = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.util.c f301969e = new io.reactivex.internal.util.c();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f301964l = aVar;
            aVar.a();
        }

        b(io.reactivex.i0<? super R> i0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends R>> oVar, int i10, boolean z10) {
            this.f301965a = i0Var;
            this.f301966b = oVar;
            this.f301967c = i10;
            this.f301968d = z10;
        }

        void a() {
            a<T, R> andSet;
            a<T, R> aVar = this.f301973i.get();
            a<Object, Object> aVar2 = f301964l;
            if (aVar == aVar2 || (andSet = this.f301973i.getAndSet((a<T, R>) aVar2)) == aVar2 || andSet == null) {
                return;
            }
            andSet.a();
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0014 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:97:0x010f A[SYNTHETIC] */
        void b() {
            ej.o<R> oVar;
            a0.c cVarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.i0<? super R> i0Var = this.f301965a;
            AtomicReference<a<T, R>> atomicReference = this.f301973i;
            boolean z10 = this.f301968d;
            int iAddAndGet = 1;
            while (!this.f301971g) {
                if (this.f301970f) {
                    boolean z11 = atomicReference.get() == null;
                    if (z10) {
                        if (z11) {
                            Throwable th2 = this.f301969e.get();
                            if (th2 != null) {
                                i0Var.onError(th2);
                                return;
                            } else {
                                i0Var.onComplete();
                                return;
                            }
                        }
                    } else if (this.f301969e.get() != null) {
                        i0Var.onError(this.f301969e.c());
                        return;
                    } else if (z11) {
                        i0Var.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = atomicReference.get();
                if (aVar != null && (oVar = aVar.f301961d) != null) {
                    if (aVar.f301962e) {
                        boolean zIsEmpty = oVar.isEmpty();
                        if (z10) {
                            if (zIsEmpty) {
                                androidx.compose.animation.core.z1.a(atomicReference, aVar, null);
                            }
                        } else if (this.f301969e.get() != null) {
                            i0Var.onError(this.f301969e.c());
                            return;
                        } else if (zIsEmpty) {
                            androidx.compose.animation.core.z1.a(atomicReference, aVar, null);
                        }
                    }
                    boolean z12 = false;
                    while (!this.f301971g) {
                        if (aVar == atomicReference.get()) {
                            if (!z10 && this.f301969e.get() != null) {
                                i0Var.onError(this.f301969e.c());
                                return;
                            }
                            boolean z13 = aVar.f301962e;
                            try {
                                cVarPoll = oVar.poll();
                            } catch (Throwable th3) {
                                io.reactivex.exceptions.b.b(th3);
                                this.f301969e.a(th3);
                                androidx.compose.animation.core.z1.a(atomicReference, aVar, null);
                                if (z10) {
                                    aVar.a();
                                } else {
                                    a();
                                    this.f301972h.dispose();
                                    this.f301970f = true;
                                }
                                z12 = true;
                                cVarPoll = null;
                            }
                            boolean z14 = cVarPoll == null;
                            if (z13 && z14) {
                                androidx.compose.animation.core.z1.a(atomicReference, aVar, null);
                            } else if (!z14) {
                                i0Var.onNext(cVarPoll);
                            }
                            if (z12) {
                                continue;
                            }
                        }
                        z12 = true;
                        if (z12) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void c(a<T, R> aVar, Throwable th2) {
            if (aVar.f301959b != this.f301974j || !this.f301969e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301968d) {
                this.f301972h.dispose();
            }
            aVar.f301962e = true;
            b();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301972h, cVar)) {
                this.f301972h = cVar;
                this.f301965a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f301971g) {
                return;
            }
            this.f301971g = true;
            this.f301972h.dispose();
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301971g;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301970f) {
                return;
            }
            this.f301970f = true;
            b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301970f || !this.f301969e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301968d) {
                a();
            }
            this.f301970f = true;
            b();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            a<T, R> aVar;
            long j10 = this.f301974j + 1;
            this.f301974j = j10;
            a<T, R> aVar2 = this.f301973i.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f301966b.apply(t10), "The ObservableSource returned is null");
                a aVar3 = new a(this, j10, this.f301967c);
                do {
                    aVar = this.f301973i.get();
                    if (aVar == f301964l) {
                        return;
                    }
                } while (!androidx.compose.animation.core.z1.a(this.f301973i, aVar, aVar3));
                g0Var.a(aVar3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301972h.dispose();
                onError(th2);
            }
        }
    }

    public m3(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends R>> oVar, int i10, boolean z10) {
        super(g0Var);
        this.f301954b = oVar;
        this.f301955c = i10;
        this.f301956d = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super R> i0Var) {
        if (x2.b(this.f301291a, i0Var, this.f301954b)) {
            return;
        }
        this.f301291a.a(new b(i0Var, this.f301954b, this.f301955c, this.f301956d));
    }
}
