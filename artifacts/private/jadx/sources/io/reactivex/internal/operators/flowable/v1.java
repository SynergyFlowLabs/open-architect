package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class v1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.flowable.a<TLeft, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<? extends TRight> f300366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super TLeft, ? extends org.reactivestreams.u<TLeftEnd>> f300367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.o<? super TRight, ? extends org.reactivestreams.u<TRightEnd>> f300368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final dj.c<? super TLeft, ? super TRight, ? extends R> f300369f;

    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements org.reactivestreams.w, o1.b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f300370o = -6071216598687999801L;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final Integer f300371s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final Integer f300372t = 2;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final Integer f300373v = 3;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final Integer f300374w = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300375a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final dj.o<? super TLeft, ? extends org.reactivestreams.u<TLeftEnd>> f300382h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final dj.o<? super TRight, ? extends org.reactivestreams.u<TRightEnd>> f300383i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final dj.c<? super TLeft, ? super TRight, ? extends R> f300384j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f300386l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f300387m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile boolean f300388n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicLong f300376b = new AtomicLong();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.disposables.b f300378d = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.c<Object> f300377c = new io.reactivex.internal.queue.c<>(io.reactivex.l.Y());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Map<Integer, TLeft> f300379e = new LinkedHashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Map<Integer, TRight> f300380f = new LinkedHashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<Throwable> f300381g = new AtomicReference<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicInteger f300385k = new AtomicInteger(2);

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super TLeft, ? extends org.reactivestreams.u<TLeftEnd>> oVar, dj.o<? super TRight, ? extends org.reactivestreams.u<TRightEnd>> oVar2, dj.c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.f300375a = vVar;
            this.f300382h = oVar;
            this.f300383i = oVar2;
            this.f300384j = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.o1.b
        public void a(Throwable th2) {
            if (!io.reactivex.internal.util.k.a(this.f300381g, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300385k.decrementAndGet();
                g();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.o1.b
        public void b(Throwable th2) {
            if (io.reactivex.internal.util.k.a(this.f300381g, th2)) {
                g();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.o1.b
        public void c(boolean z10, Object obj) {
            synchronized (this) {
                try {
                    this.f300377c.r(z10 ? f300371s : f300372t, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300388n) {
                return;
            }
            this.f300388n = true;
            f();
            if (getAndIncrement() == 0) {
                this.f300377c.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.o1.b
        public void d(boolean z10, o1.c cVar) {
            synchronized (this) {
                try {
                    this.f300377c.r(z10 ? f300373v : f300374w, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // io.reactivex.internal.operators.flowable.o1.b
        public void e(o1.d dVar) {
            this.f300378d.b(dVar);
            this.f300385k.decrementAndGet();
            g();
        }

        void f() {
            this.f300378d.dispose();
        }

        void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.c<Object> cVar = this.f300377c;
            org.reactivestreams.v<? super R> vVar = this.f300375a;
            boolean z10 = true;
            int iAddAndGet = 1;
            while (!this.f300388n) {
                if (this.f300381g.get() != null) {
                    cVar.clear();
                    f();
                    h(vVar);
                    return;
                }
                boolean z11 = this.f300385k.get() == 0 ? z10 : false;
                Integer num = (Integer) cVar.poll();
                boolean z12 = num == null ? z10 : false;
                if (z11 && z12) {
                    this.f300379e.clear();
                    this.f300380f.clear();
                    this.f300378d.dispose();
                    vVar.onComplete();
                    return;
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = cVar.poll();
                    if (num == f300371s) {
                        int i10 = this.f300386l;
                        this.f300386l = i10 + 1;
                        this.f300379e.put(Integer.valueOf(i10), (TLeft) objPoll);
                        try {
                            org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300382h.apply(objPoll), "The leftEnd returned a null Publisher");
                            o1.c cVar2 = new o1.c(this, z10, i10);
                            this.f300378d.c(cVar2);
                            uVar.e(cVar2);
                            if (this.f300381g.get() != null) {
                                cVar.clear();
                                f();
                                h(vVar);
                                return;
                            }
                            long j10 = this.f300376b.get();
                            Iterator<TRight> it = this.f300380f.values().iterator();
                            long j11 = 0;
                            while (it.hasNext()) {
                                try {
                                    a0.c cVar3 = (Object) io.reactivex.internal.functions.b.g(this.f300384j.apply(objPoll, it.next()), "The resultSelector returned a null value");
                                    if (j11 == j10) {
                                        io.reactivex.internal.util.k.a(this.f300381g, new io.reactivex.exceptions.c("Could not emit value due to lack of requests"));
                                        cVar.clear();
                                        f();
                                        h(vVar);
                                        return;
                                    }
                                    vVar.onNext(cVar3);
                                    j11++;
                                } catch (Throwable th2) {
                                    i(th2, vVar, cVar);
                                    return;
                                }
                            }
                            if (j11 != 0) {
                                io.reactivex.internal.util.d.e(this.f300376b, j11);
                            }
                        } catch (Throwable th3) {
                            i(th3, vVar, cVar);
                            return;
                        }
                    } else if (num == f300372t) {
                        int i11 = this.f300387m;
                        this.f300387m = i11 + 1;
                        this.f300380f.put(Integer.valueOf(i11), (TRight) objPoll);
                        try {
                            org.reactivestreams.u uVar2 = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300383i.apply(objPoll), "The rightEnd returned a null Publisher");
                            o1.c cVar4 = new o1.c(this, false, i11);
                            this.f300378d.c(cVar4);
                            uVar2.e(cVar4);
                            if (this.f300381g.get() != null) {
                                cVar.clear();
                                f();
                                h(vVar);
                                return;
                            }
                            long j12 = this.f300376b.get();
                            Iterator<TLeft> it2 = this.f300379e.values().iterator();
                            long j13 = 0;
                            while (it2.hasNext()) {
                                try {
                                    a0.c cVar5 = (Object) io.reactivex.internal.functions.b.g(this.f300384j.apply(it2.next(), objPoll), "The resultSelector returned a null value");
                                    if (j13 == j12) {
                                        io.reactivex.internal.util.k.a(this.f300381g, new io.reactivex.exceptions.c("Could not emit value due to lack of requests"));
                                        cVar.clear();
                                        f();
                                        h(vVar);
                                        return;
                                    }
                                    vVar.onNext(cVar5);
                                    j13++;
                                } catch (Throwable th4) {
                                    i(th4, vVar, cVar);
                                    return;
                                }
                            }
                            if (j13 != 0) {
                                io.reactivex.internal.util.d.e(this.f300376b, j13);
                            }
                        } catch (Throwable th5) {
                            i(th5, vVar, cVar);
                            return;
                        }
                    } else if (num == f300373v) {
                        o1.c cVar6 = (o1.c) objPoll;
                        this.f300379e.remove(Integer.valueOf(cVar6.f299944c));
                        this.f300378d.a(cVar6);
                    } else if (num == f300374w) {
                        o1.c cVar7 = (o1.c) objPoll;
                        this.f300380f.remove(Integer.valueOf(cVar7.f299944c));
                        this.f300378d.a(cVar7);
                    }
                    z10 = true;
                }
            }
            cVar.clear();
        }

        void h(org.reactivestreams.v<?> vVar) {
            Throwable thC = io.reactivex.internal.util.k.c(this.f300381g);
            this.f300379e.clear();
            this.f300380f.clear();
            vVar.onError(thC);
        }

        void i(Throwable th2, org.reactivestreams.v<?> vVar, ej.o<?> oVar) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.util.k.a(this.f300381g, th2);
            oVar.clear();
            f();
            h(vVar);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300376b, j10);
            }
        }
    }

    public v1(io.reactivex.l<TLeft> lVar, org.reactivestreams.u<? extends TRight> uVar, dj.o<? super TLeft, ? extends org.reactivestreams.u<TLeftEnd>> oVar, dj.o<? super TRight, ? extends org.reactivestreams.u<TRightEnd>> oVar2, dj.c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(lVar);
        this.f300366c = uVar;
        this.f300367d = oVar;
        this.f300368e = oVar2;
        this.f300369f = cVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        a aVar = new a(vVar, this.f300367d, this.f300368e, this.f300369f);
        vVar.l(aVar);
        o1.d dVar = new o1.d(aVar, true);
        aVar.f300378d.c(dVar);
        o1.d dVar2 = new o1.d(aVar, false);
        aVar.f300378d.c(dVar2);
        this.f299043b.j6(dVar);
        this.f300366c.e(dVar2);
    }
}
