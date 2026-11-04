package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class r1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.a<TLeft, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<? extends TRight> f302236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super TLeft, ? extends io.reactivex.g0<TLeftEnd>> f302237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super TRight, ? extends io.reactivex.g0<TRightEnd>> f302238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.c<? super TLeft, ? super TRight, ? extends R> f302239e;

    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements io.reactivex.disposables.c, k1.b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f302240n = -6071216598687999801L;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final Integer f302241o = 1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final Integer f302242s = 2;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final Integer f302243t = 3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final Integer f302244v = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f302245a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final dj.o<? super TLeft, ? extends io.reactivex.g0<TLeftEnd>> f302251g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final dj.o<? super TRight, ? extends io.reactivex.g0<TRightEnd>> f302252h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final dj.c<? super TLeft, ? super TRight, ? extends R> f302253i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f302255k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f302256l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile boolean f302257m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.b f302247c = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.queue.c<Object> f302246b = new io.reactivex.internal.queue.c<>(io.reactivex.b0.T());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Map<Integer, TLeft> f302248d = new LinkedHashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Map<Integer, TRight> f302249e = new LinkedHashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<Throwable> f302250f = new AtomicReference<>();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicInteger f302254j = new AtomicInteger(2);

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super TLeft, ? extends io.reactivex.g0<TLeftEnd>> oVar, dj.o<? super TRight, ? extends io.reactivex.g0<TRightEnd>> oVar2, dj.c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.f302245a = i0Var;
            this.f302251g = oVar;
            this.f302252h = oVar2;
            this.f302253i = cVar;
        }

        @Override // io.reactivex.internal.operators.observable.k1.b
        public void a(Throwable th2) {
            if (!io.reactivex.internal.util.k.a(this.f302250f, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302254j.decrementAndGet();
                g();
            }
        }

        @Override // io.reactivex.internal.operators.observable.k1.b
        public void b(Throwable th2) {
            if (io.reactivex.internal.util.k.a(this.f302250f, th2)) {
                g();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.k1.b
        public void c(boolean z10, Object obj) {
            synchronized (this) {
                try {
                    this.f302246b.r(z10 ? f302241o : f302242s, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // io.reactivex.internal.operators.observable.k1.b
        public void d(boolean z10, k1.c cVar) {
            synchronized (this) {
                try {
                    this.f302246b.r(z10 ? f302243t : f302244v, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f302257m) {
                return;
            }
            this.f302257m = true;
            f();
            if (getAndIncrement() == 0) {
                this.f302246b.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.k1.b
        public void e(k1.d dVar) {
            this.f302247c.b(dVar);
            this.f302254j.decrementAndGet();
            g();
        }

        void f() {
            this.f302247c.dispose();
        }

        void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.c<?> cVar = this.f302246b;
            io.reactivex.i0<? super R> i0Var = this.f302245a;
            int iAddAndGet = 1;
            while (!this.f302257m) {
                if (this.f302250f.get() != null) {
                    cVar.clear();
                    f();
                    h(i0Var);
                    return;
                }
                boolean z10 = this.f302254j.get() == 0;
                Integer num = (Integer) cVar.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    this.f302248d.clear();
                    this.f302249e.clear();
                    this.f302247c.dispose();
                    i0Var.onComplete();
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = cVar.poll();
                    if (num == f302241o) {
                        int i10 = this.f302255k;
                        this.f302255k = i10 + 1;
                        this.f302248d.put(Integer.valueOf(i10), (TLeft) objPoll);
                        try {
                            io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302251g.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            k1.c cVar2 = new k1.c(this, true, i10);
                            this.f302247c.c(cVar2);
                            g0Var.a(cVar2);
                            if (this.f302250f.get() != null) {
                                cVar.clear();
                                f();
                                h(i0Var);
                                return;
                            } else {
                                Iterator<TRight> it = this.f302249e.values().iterator();
                                while (it.hasNext()) {
                                    try {
                                        i0Var.onNext((Object) io.reactivex.internal.functions.b.g(this.f302253i.apply(objPoll, it.next()), "The resultSelector returned a null value"));
                                    } catch (Throwable th2) {
                                        i(th2, i0Var, cVar);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            i(th3, i0Var, cVar);
                            return;
                        }
                    } else if (num == f302242s) {
                        int i11 = this.f302256l;
                        this.f302256l = i11 + 1;
                        this.f302249e.put(Integer.valueOf(i11), (TRight) objPoll);
                        try {
                            io.reactivex.g0 g0Var2 = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302252h.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            k1.c cVar3 = new k1.c(this, false, i11);
                            this.f302247c.c(cVar3);
                            g0Var2.a(cVar3);
                            if (this.f302250f.get() != null) {
                                cVar.clear();
                                f();
                                h(i0Var);
                                return;
                            } else {
                                Iterator<TLeft> it2 = this.f302248d.values().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        i0Var.onNext((Object) io.reactivex.internal.functions.b.g(this.f302253i.apply(it2.next(), objPoll), "The resultSelector returned a null value"));
                                    } catch (Throwable th4) {
                                        i(th4, i0Var, cVar);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            i(th5, i0Var, cVar);
                            return;
                        }
                    } else if (num == f302243t) {
                        k1.c cVar4 = (k1.c) objPoll;
                        this.f302248d.remove(Integer.valueOf(cVar4.f301860c));
                        this.f302247c.a(cVar4);
                    } else {
                        k1.c cVar5 = (k1.c) objPoll;
                        this.f302249e.remove(Integer.valueOf(cVar5.f301860c));
                        this.f302247c.a(cVar5);
                    }
                }
            }
            cVar.clear();
        }

        void h(io.reactivex.i0<?> i0Var) {
            Throwable thC = io.reactivex.internal.util.k.c(this.f302250f);
            this.f302248d.clear();
            this.f302249e.clear();
            i0Var.onError(thC);
        }

        void i(Throwable th2, io.reactivex.i0<?> i0Var, io.reactivex.internal.queue.c<?> cVar) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.util.k.a(this.f302250f, th2);
            cVar.clear();
            f();
            h(i0Var);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302257m;
        }
    }

    public r1(io.reactivex.g0<TLeft> g0Var, io.reactivex.g0<? extends TRight> g0Var2, dj.o<? super TLeft, ? extends io.reactivex.g0<TLeftEnd>> oVar, dj.o<? super TRight, ? extends io.reactivex.g0<TRightEnd>> oVar2, dj.c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(g0Var);
        this.f302236b = g0Var2;
        this.f302237c = oVar;
        this.f302238d = oVar2;
        this.f302239e = cVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super R> i0Var) {
        a aVar = new a(i0Var, this.f302237c, this.f302238d, this.f302239e);
        i0Var.d(aVar);
        k1.d dVar = new k1.d(aVar, true);
        aVar.f302247c.c(dVar);
        k1.d dVar2 = new k1.d(aVar, false);
        aVar.f302247c.c(dVar2);
        this.f301291a.a(dVar);
        this.f302236b.a(dVar2);
    }
}
