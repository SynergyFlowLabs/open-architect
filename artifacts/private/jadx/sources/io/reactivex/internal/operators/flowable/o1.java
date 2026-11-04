package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class o1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.flowable.a<TLeft, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<? extends TRight> f299918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super TLeft, ? extends org.reactivestreams.u<TLeftEnd>> f299919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.o<? super TRight, ? extends org.reactivestreams.u<TRightEnd>> f299920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final dj.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> f299921f;

    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements org.reactivestreams.w, b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f299922o = -6071216598687999801L;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final Integer f299923s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final Integer f299924t = 2;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final Integer f299925v = 3;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final Integer f299926w = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f299927a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final dj.o<? super TLeft, ? extends org.reactivestreams.u<TLeftEnd>> f299934h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final dj.o<? super TRight, ? extends org.reactivestreams.u<TRightEnd>> f299935i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final dj.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> f299936j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f299938l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f299939m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile boolean f299940n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicLong f299928b = new AtomicLong();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.disposables.b f299930d = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.c<Object> f299929c = new io.reactivex.internal.queue.c<>(io.reactivex.l.Y());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Map<Integer, io.reactivex.processors.h<TRight>> f299931e = new LinkedHashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Map<Integer, TRight> f299932f = new LinkedHashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<Throwable> f299933g = new AtomicReference<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicInteger f299937k = new AtomicInteger(2);

        static {
            int i10 = 2 ^ 4;
        }

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super TLeft, ? extends org.reactivestreams.u<TLeftEnd>> oVar, dj.o<? super TRight, ? extends org.reactivestreams.u<TRightEnd>> oVar2, dj.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> cVar) {
            this.f299927a = vVar;
            this.f299934h = oVar;
            this.f299935i = oVar2;
            this.f299936j = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.o1.b
        public void a(Throwable th2) {
            if (!io.reactivex.internal.util.k.a(this.f299933g, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299937k.decrementAndGet();
                g();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.o1.b
        public void b(Throwable th2) {
            if (io.reactivex.internal.util.k.a(this.f299933g, th2)) {
                g();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.o1.b
        public void c(boolean z10, Object obj) {
            synchronized (this) {
                try {
                    this.f299929c.r(z10 ? f299923s : f299924t, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f299940n) {
                return;
            }
            this.f299940n = true;
            f();
            if (getAndIncrement() == 0) {
                this.f299929c.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.o1.b
        public void d(boolean z10, c cVar) {
            synchronized (this) {
                try {
                    this.f299929c.r(z10 ? f299925v : f299926w, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // io.reactivex.internal.operators.flowable.o1.b
        public void e(d dVar) {
            this.f299930d.b(dVar);
            this.f299937k.decrementAndGet();
            g();
        }

        void f() {
            this.f299930d.dispose();
        }

        void g() {
            if (getAndIncrement() == 0) {
                io.reactivex.internal.queue.c<Object> cVar = this.f299929c;
                org.reactivestreams.v<? super R> vVar = this.f299927a;
                int iAddAndGet = 1;
                while (!this.f299940n) {
                    if (this.f299933g.get() != null) {
                        cVar.clear();
                        f();
                        h(vVar);
                        return;
                    }
                    boolean z10 = this.f299937k.get() == 0;
                    Integer num = (Integer) cVar.poll();
                    boolean z11 = num == null;
                    if (z10 && z11) {
                        Iterator<io.reactivex.processors.h<TRight>> it = this.f299931e.values().iterator();
                        while (it.hasNext()) {
                            it.next().onComplete();
                        }
                        this.f299931e.clear();
                        this.f299932f.clear();
                        this.f299930d.dispose();
                        vVar.onComplete();
                        return;
                    }
                    if (z11) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else {
                        Object objPoll = cVar.poll();
                        if (num == f299923s) {
                            io.reactivex.processors.h hVarS8 = io.reactivex.processors.h.S8();
                            int i10 = this.f299938l;
                            this.f299938l = i10 + 1;
                            this.f299931e.put(Integer.valueOf(i10), (io.reactivex.processors.h<TRight>) hVarS8);
                            try {
                                org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299934h.apply(objPoll), "The leftEnd returned a null Publisher");
                                c cVar2 = new c(this, true, i10);
                                this.f299930d.c(cVar2);
                                uVar.e(cVar2);
                                if (this.f299933g.get() != null) {
                                    cVar.clear();
                                    f();
                                    h(vVar);
                                    return;
                                }
                                try {
                                    a0.c cVar3 = (Object) io.reactivex.internal.functions.b.g(this.f299936j.apply(objPoll, hVarS8), "The resultSelector returned a null value");
                                    if (this.f299928b.get() == 0) {
                                        i(new io.reactivex.exceptions.c("Could not emit value due to lack of requests"), vVar, cVar);
                                        return;
                                    }
                                    vVar.onNext(cVar3);
                                    io.reactivex.internal.util.d.e(this.f299928b, 1L);
                                    Iterator<TRight> it2 = this.f299932f.values().iterator();
                                    while (it2.hasNext()) {
                                        hVarS8.onNext(it2.next());
                                    }
                                } catch (Throwable th2) {
                                    i(th2, vVar, cVar);
                                    return;
                                }
                            } catch (Throwable th3) {
                                i(th3, vVar, cVar);
                                return;
                            }
                        } else if (num == f299924t) {
                            int i11 = this.f299939m;
                            this.f299939m = i11 + 1;
                            this.f299932f.put(Integer.valueOf(i11), (TRight) objPoll);
                            try {
                                org.reactivestreams.u uVar2 = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299935i.apply(objPoll), "The rightEnd returned a null Publisher");
                                c cVar4 = new c(this, false, i11);
                                this.f299930d.c(cVar4);
                                uVar2.e(cVar4);
                                if (this.f299933g.get() != null) {
                                    cVar.clear();
                                    f();
                                    h(vVar);
                                    return;
                                } else {
                                    Iterator<io.reactivex.processors.h<TRight>> it3 = this.f299931e.values().iterator();
                                    while (it3.hasNext()) {
                                        it3.next().onNext(objPoll);
                                    }
                                }
                            } catch (Throwable th4) {
                                i(th4, vVar, cVar);
                                return;
                            }
                        } else if (num == f299925v) {
                            c cVar5 = (c) objPoll;
                            io.reactivex.processors.h<TRight> hVarRemove = this.f299931e.remove(Integer.valueOf(cVar5.f299944c));
                            this.f299930d.a(cVar5);
                            if (hVarRemove != null) {
                                hVarRemove.onComplete();
                            }
                        } else if (num == f299926w) {
                            c cVar6 = (c) objPoll;
                            this.f299932f.remove(Integer.valueOf(cVar6.f299944c));
                            this.f299930d.a(cVar6);
                        }
                    }
                }
                cVar.clear();
            }
        }

        void h(org.reactivestreams.v<?> vVar) {
            Throwable thC = io.reactivex.internal.util.k.c(this.f299933g);
            Iterator<io.reactivex.processors.h<TRight>> it = this.f299931e.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thC);
            }
            this.f299931e.clear();
            this.f299932f.clear();
            vVar.onError(thC);
        }

        void i(Throwable th2, org.reactivestreams.v<?> vVar, ej.o<?> oVar) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.util.k.a(this.f299933g, th2);
            oVar.clear();
            f();
            h(vVar);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299928b, j10);
            }
        }
    }

    interface b {
        void a(Throwable th2);

        void b(Throwable th2);

        void c(boolean z10, Object obj);

        void d(boolean z10, c cVar);

        void e(d dVar);
    }

    static final class c extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f299941d = 1883890389173668373L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f299942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f299943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f299944c;

        c(b bVar, boolean z10, int i10) {
            this.f299942a = bVar;
            this.f299943b = z10;
            this.f299944c = i10;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299942a.d(this.f299943b, this);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299942a.b(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            if (io.reactivex.internal.subscriptions.j.b(this)) {
                this.f299942a.d(this.f299943b, this);
            }
        }
    }

    static final class d extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f299945c = 1883890389173668373L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f299946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f299947b;

        d(b bVar, boolean z10) {
            this.f299946a = bVar;
            this.f299947b = z10;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299946a.e(this);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299946a.a(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            this.f299946a.c(this.f299947b, obj);
        }
    }

    public o1(io.reactivex.l<TLeft> lVar, org.reactivestreams.u<? extends TRight> uVar, dj.o<? super TLeft, ? extends org.reactivestreams.u<TLeftEnd>> oVar, dj.o<? super TRight, ? extends org.reactivestreams.u<TRightEnd>> oVar2, dj.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> cVar) {
        super(lVar);
        this.f299918c = uVar;
        this.f299919d = oVar;
        this.f299920e = oVar2;
        this.f299921f = cVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        a aVar = new a(vVar, this.f299919d, this.f299920e, this.f299921f);
        vVar.l(aVar);
        d dVar = new d(aVar, true);
        aVar.f299930d.c(dVar);
        d dVar2 = new d(aVar, false);
        aVar.f299930d.c(dVar2);
        this.f299043b.j6(dVar);
        this.f299918c.e(dVar2);
    }
}
