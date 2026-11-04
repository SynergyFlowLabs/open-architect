package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class k1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.a<TLeft, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<? extends TRight> f301835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super TLeft, ? extends io.reactivex.g0<TLeftEnd>> f301836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super TRight, ? extends io.reactivex.g0<TRightEnd>> f301837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.c<? super TLeft, ? super io.reactivex.b0<TRight>, ? extends R> f301838e;

    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements io.reactivex.disposables.c, b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f301839n = -6071216598687999801L;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final Integer f301840o = 1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final Integer f301841s = 2;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final Integer f301842t = 3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final Integer f301843v = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f301844a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final dj.o<? super TLeft, ? extends io.reactivex.g0<TLeftEnd>> f301850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final dj.o<? super TRight, ? extends io.reactivex.g0<TRightEnd>> f301851h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final dj.c<? super TLeft, ? super io.reactivex.b0<TRight>, ? extends R> f301852i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f301854k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f301855l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile boolean f301856m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.b f301846c = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.queue.c<Object> f301845b = new io.reactivex.internal.queue.c<>(io.reactivex.b0.T());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Map<Integer, io.reactivex.subjects.j<TRight>> f301847d = new LinkedHashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Map<Integer, TRight> f301848e = new LinkedHashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<Throwable> f301849f = new AtomicReference<>();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicInteger f301853j = new AtomicInteger(2);

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super TLeft, ? extends io.reactivex.g0<TLeftEnd>> oVar, dj.o<? super TRight, ? extends io.reactivex.g0<TRightEnd>> oVar2, dj.c<? super TLeft, ? super io.reactivex.b0<TRight>, ? extends R> cVar) {
            this.f301844a = i0Var;
            this.f301850g = oVar;
            this.f301851h = oVar2;
            this.f301852i = cVar;
        }

        @Override // io.reactivex.internal.operators.observable.k1.b
        public void a(Throwable th2) {
            if (!io.reactivex.internal.util.k.a(this.f301849f, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301853j.decrementAndGet();
                g();
            }
        }

        @Override // io.reactivex.internal.operators.observable.k1.b
        public void b(Throwable th2) {
            if (io.reactivex.internal.util.k.a(this.f301849f, th2)) {
                g();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.k1.b
        public void c(boolean z10, Object obj) {
            synchronized (this) {
                try {
                    this.f301845b.r(z10 ? f301840o : f301841s, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // io.reactivex.internal.operators.observable.k1.b
        public void d(boolean z10, c cVar) {
            synchronized (this) {
                try {
                    this.f301845b.r(z10 ? f301842t : f301843v, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (!this.f301856m) {
                this.f301856m = true;
                f();
                if (getAndIncrement() == 0) {
                    this.f301845b.clear();
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.k1.b
        public void e(d dVar) {
            this.f301846c.b(dVar);
            this.f301853j.decrementAndGet();
            g();
        }

        void f() {
            this.f301846c.dispose();
        }

        void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.c<?> cVar = this.f301845b;
            io.reactivex.i0<? super R> i0Var = this.f301844a;
            int iAddAndGet = 1;
            while (!this.f301856m) {
                if (this.f301849f.get() != null) {
                    cVar.clear();
                    f();
                    h(i0Var);
                    return;
                }
                boolean z10 = this.f301853j.get() == 0;
                Integer num = (Integer) cVar.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    Iterator<io.reactivex.subjects.j<TRight>> it = this.f301847d.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.f301847d.clear();
                    this.f301848e.clear();
                    this.f301846c.dispose();
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
                    if (num == f301840o) {
                        io.reactivex.subjects.j jVarM8 = io.reactivex.subjects.j.m8();
                        int i10 = this.f301854k;
                        this.f301854k = i10 + 1;
                        this.f301847d.put(Integer.valueOf(i10), (io.reactivex.subjects.j<TRight>) jVarM8);
                        try {
                            io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f301850g.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            c cVar2 = new c(this, true, i10);
                            this.f301846c.c(cVar2);
                            g0Var.a(cVar2);
                            if (this.f301849f.get() != null) {
                                cVar.clear();
                                f();
                                h(i0Var);
                                return;
                            } else {
                                try {
                                    i0Var.onNext((Object) io.reactivex.internal.functions.b.g(this.f301852i.apply(objPoll, jVarM8), "The resultSelector returned a null value"));
                                    Iterator<TRight> it2 = this.f301848e.values().iterator();
                                    while (it2.hasNext()) {
                                        jVarM8.onNext(it2.next());
                                    }
                                } catch (Throwable th2) {
                                    i(th2, i0Var, cVar);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            i(th3, i0Var, cVar);
                            return;
                        }
                    } else if (num == f301841s) {
                        int i11 = this.f301855l;
                        this.f301855l = i11 + 1;
                        this.f301848e.put(Integer.valueOf(i11), (TRight) objPoll);
                        try {
                            io.reactivex.g0 g0Var2 = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f301851h.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            c cVar3 = new c(this, false, i11);
                            this.f301846c.c(cVar3);
                            g0Var2.a(cVar3);
                            if (this.f301849f.get() != null) {
                                cVar.clear();
                                f();
                                h(i0Var);
                                return;
                            } else {
                                Iterator<io.reactivex.subjects.j<TRight>> it3 = this.f301847d.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(objPoll);
                                }
                            }
                        } catch (Throwable th4) {
                            i(th4, i0Var, cVar);
                            return;
                        }
                    } else if (num == f301842t) {
                        c cVar4 = (c) objPoll;
                        io.reactivex.subjects.j<TRight> jVarRemove = this.f301847d.remove(Integer.valueOf(cVar4.f301860c));
                        this.f301846c.a(cVar4);
                        if (jVarRemove != null) {
                            jVarRemove.onComplete();
                        }
                    } else if (num == f301843v) {
                        c cVar5 = (c) objPoll;
                        this.f301848e.remove(Integer.valueOf(cVar5.f301860c));
                        this.f301846c.a(cVar5);
                    }
                }
            }
            cVar.clear();
        }

        void h(io.reactivex.i0<?> i0Var) {
            Throwable thC = io.reactivex.internal.util.k.c(this.f301849f);
            Iterator<io.reactivex.subjects.j<TRight>> it = this.f301847d.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thC);
            }
            this.f301847d.clear();
            this.f301848e.clear();
            i0Var.onError(thC);
        }

        void i(Throwable th2, io.reactivex.i0<?> i0Var, io.reactivex.internal.queue.c<?> cVar) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.util.k.a(this.f301849f, th2);
            cVar.clear();
            f();
            h(i0Var);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301856m;
        }
    }

    interface b {
        void a(Throwable th2);

        void b(Throwable th2);

        void c(boolean z10, Object obj);

        void d(boolean z10, c cVar);

        void e(d dVar);
    }

    static final class c extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f301857d = 1883890389173668373L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f301858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f301859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f301860c;

        c(b bVar, boolean z10, int i10) {
            this.f301858a = bVar;
            this.f301859b = z10;
            this.f301860c = i10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
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
            this.f301858a.d(this.f301859b, this);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301858a.b(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(Object obj) {
            if (io.reactivex.internal.disposables.d.b(this)) {
                this.f301858a.d(this.f301859b, this);
            }
        }
    }

    static final class d extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f301861c = 1883890389173668373L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f301862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f301863b;

        d(b bVar, boolean z10) {
            this.f301862a = bVar;
            this.f301863b = z10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
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
            this.f301862a.e(this);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301862a.a(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(Object obj) {
            this.f301862a.c(this.f301863b, obj);
        }
    }

    public k1(io.reactivex.g0<TLeft> g0Var, io.reactivex.g0<? extends TRight> g0Var2, dj.o<? super TLeft, ? extends io.reactivex.g0<TLeftEnd>> oVar, dj.o<? super TRight, ? extends io.reactivex.g0<TRightEnd>> oVar2, dj.c<? super TLeft, ? super io.reactivex.b0<TRight>, ? extends R> cVar) {
        super(g0Var);
        this.f301835b = g0Var2;
        this.f301836c = oVar;
        this.f301837d = oVar2;
        this.f301838e = cVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super R> i0Var) {
        a aVar = new a(i0Var, this.f301836c, this.f301837d, this.f301838e);
        i0Var.d(aVar);
        d dVar = new d(aVar, true);
        aVar.f301846c.c(dVar);
        d dVar2 = new d(aVar, false);
        aVar.f301846c.c(dVar2);
        this.f301291a.a(dVar);
        this.f301835b.a(dVar2);
    }
}
