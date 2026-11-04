package io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class w<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.g0<? extends R>> f302481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.internal.util.j f302482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f302483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f302484e;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c, io.reactivex.internal.observers.t<R> {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f302485o = 8080567949447303262L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f302486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<? extends R>> f302487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f302488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f302489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.util.j f302490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.util.c f302491f = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ArrayDeque<io.reactivex.internal.observers.s<R>> f302492g = new ArrayDeque<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ej.o<T> f302493h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.c f302494i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f302495j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f302496k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f302497l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        io.reactivex.internal.observers.s<R> f302498m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f302499n;

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends R>> oVar, int i10, int i11, io.reactivex.internal.util.j jVar) {
            this.f302486a = i0Var;
            this.f302487b = oVar;
            this.f302488c = i10;
            this.f302489d = i11;
            this.f302490e = jVar;
        }

        void a() {
            io.reactivex.internal.observers.s<R> sVar = this.f302498m;
            if (sVar != null) {
                sVar.dispose();
            }
            while (true) {
                io.reactivex.internal.observers.s<R> sVarPoll = this.f302492g.poll();
                if (sVarPoll == null) {
                    return;
                } else {
                    sVarPoll.dispose();
                }
            }
        }

        void b() {
            if (getAndIncrement() == 0) {
                do {
                    this.f302493h.clear();
                    a();
                } while (decrementAndGet() != 0);
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0139 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:102:0x0185 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:104:0x01aa A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:107:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x0130  */
        /* JADX WARN: Code duplicated, block: B:65:0x0140  */
        /* JADX WARN: Code duplicated, block: B:75:0x0172  */
        /* JADX WARN: Code duplicated, block: B:76:0x0174  */
        /* JADX WARN: Code duplicated, block: B:82:0x0187 A[LOOP:2: B:61:0x0134->B:82:0x0187, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:99:0x01a0 A[SYNTHETIC] */
        @Override // io.reactivex.internal.observers.t
        public void c() {
            ej.o<R> oVarC;
            boolean zB;
            R rPoll;
            boolean z10;
            if (getAndIncrement() == 0) {
                ej.o<T> oVar = this.f302493h;
                ArrayDeque<io.reactivex.internal.observers.s<R>> arrayDeque = this.f302492g;
                io.reactivex.i0<? super R> i0Var = this.f302486a;
                io.reactivex.internal.util.j jVar = this.f302490e;
                int iAddAndGet = 1;
                while (true) {
                    int i10 = this.f302499n;
                    while (i10 != this.f302488c) {
                        if (this.f302497l) {
                            oVar.clear();
                            a();
                            return;
                        }
                        if (jVar == io.reactivex.internal.util.j.IMMEDIATE && this.f302491f.get() != null) {
                            oVar.clear();
                            a();
                            i0Var.onError(this.f302491f.c());
                            return;
                        }
                        try {
                            T tPoll = oVar.poll();
                            if (tPoll == null) {
                                break;
                            }
                            io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302487b.apply(tPoll), "The mapper returned a null ObservableSource");
                            io.reactivex.internal.observers.s<R> sVar = new io.reactivex.internal.observers.s<>(this, this.f302489d);
                            arrayDeque.offer(sVar);
                            g0Var.a(sVar);
                            i10++;
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.b.b(th2);
                            this.f302494i.dispose();
                            oVar.clear();
                            a();
                            this.f302491f.a(th2);
                            i0Var.onError(this.f302491f.c());
                            return;
                        }
                    }
                    this.f302499n = i10;
                    if (this.f302497l) {
                        oVar.clear();
                        a();
                        return;
                    }
                    if (jVar == io.reactivex.internal.util.j.IMMEDIATE && this.f302491f.get() != null) {
                        oVar.clear();
                        a();
                        i0Var.onError(this.f302491f.c());
                        return;
                    }
                    io.reactivex.internal.observers.s<R> sVar2 = this.f302498m;
                    if (sVar2 != null) {
                        if (sVar2 != null) {
                            oVarC = sVar2.c();
                            while (true) {
                                if (this.f302497l) {
                                    oVar.clear();
                                    a();
                                    return;
                                }
                                zB = sVar2.b();
                                if (jVar != io.reactivex.internal.util.j.IMMEDIATE && this.f302491f.get() != null) {
                                    oVar.clear();
                                    a();
                                    i0Var.onError(this.f302491f.c());
                                    return;
                                }
                                try {
                                    rPoll = oVarC.poll();
                                    if (rPoll == null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!zB && z10) {
                                        this.f302498m = null;
                                        this.f302499n--;
                                    } else if (z10) {
                                        i0Var.onNext(rPoll);
                                    }
                                } catch (Throwable th3) {
                                    io.reactivex.exceptions.b.b(th3);
                                    this.f302491f.a(th3);
                                    this.f302498m = null;
                                    this.f302499n--;
                                }
                            }
                        }
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else {
                        if (jVar == io.reactivex.internal.util.j.BOUNDARY && this.f302491f.get() != null) {
                            oVar.clear();
                            a();
                            i0Var.onError(this.f302491f.c());
                            return;
                        }
                        boolean z11 = this.f302495j;
                        io.reactivex.internal.observers.s<R> sVarPoll = arrayDeque.poll();
                        boolean z12 = sVarPoll == null;
                        if (!z11 || !z12) {
                            if (!z12) {
                                this.f302498m = sVarPoll;
                            }
                            sVar2 = sVarPoll;
                            if (sVar2 != null) {
                                oVarC = sVar2.c();
                                while (true) {
                                    if (this.f302497l) {
                                        oVar.clear();
                                        a();
                                        return;
                                    }
                                    zB = sVar2.b();
                                    if (jVar != io.reactivex.internal.util.j.IMMEDIATE) {
                                    }
                                    rPoll = oVarC.poll();
                                    if (rPoll == null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!zB) {
                                    }
                                    if (z10) {
                                        i0Var.onNext(rPoll);
                                    }
                                }
                            }
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                            }
                        } else if (this.f302491f.get() != null) {
                            oVar.clear();
                            a();
                            i0Var.onError(this.f302491f.c());
                        } else {
                            i0Var.onComplete();
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302494i, cVar)) {
                this.f302494i = cVar;
                if (cVar instanceof ej.j) {
                    ej.j jVar = (ej.j) cVar;
                    int iP = jVar.p(3);
                    if (iP == 1) {
                        this.f302496k = iP;
                        this.f302493h = jVar;
                        this.f302495j = true;
                        this.f302486a.d(this);
                        c();
                        return;
                    }
                    if (iP == 2) {
                        this.f302496k = iP;
                        this.f302493h = jVar;
                        this.f302486a.d(this);
                        return;
                    }
                }
                this.f302493h = new io.reactivex.internal.queue.c(this.f302489d);
                this.f302486a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f302497l) {
                return;
            }
            this.f302497l = true;
            this.f302494i.dispose();
            b();
        }

        @Override // io.reactivex.internal.observers.t
        public void e(io.reactivex.internal.observers.s<R> sVar, Throwable th2) {
            if (!this.f302491f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f302490e == io.reactivex.internal.util.j.IMMEDIATE) {
                this.f302494i.dispose();
            }
            sVar.e();
            c();
        }

        @Override // io.reactivex.internal.observers.t
        public void f(io.reactivex.internal.observers.s<R> sVar) {
            sVar.e();
            c();
        }

        @Override // io.reactivex.internal.observers.t
        public void g(io.reactivex.internal.observers.s<R> sVar, R r10) {
            sVar.c().offer(r10);
            c();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302497l;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302495j = true;
            c();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f302491f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302495j = true;
                c();
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302496k == 0) {
                this.f302493h.offer(t10);
            }
            c();
        }
    }

    public w(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends R>> oVar, io.reactivex.internal.util.j jVar, int i10, int i11) {
        super(g0Var);
        this.f302481b = oVar;
        this.f302482c = jVar;
        this.f302483d = i10;
        this.f302484e = i11;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super R> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302481b, this.f302483d, this.f302484e, this.f302482c));
    }
}
