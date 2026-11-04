package io.reactivex.internal.operators.flowable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class u4<T, B, V> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.l<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<B> f300338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super B, ? extends org.reactivestreams.u<V>> f300339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f300340e;

    static final class a<T, V> extends io.reactivex.subscribers.b<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c<T, ?, V> f300341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.processors.h<T> f300342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f300343d;

        a(c<T, ?, V> cVar, io.reactivex.processors.h<T> hVar) {
            this.f300341b = cVar;
            this.f300342c = hVar;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300343d) {
                return;
            }
            this.f300343d = true;
            this.f300341b.m(this);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300343d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300343d = true;
                this.f300341b.o(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(V v10) {
            b();
            onComplete();
        }
    }

    static final class b<T, B> extends io.reactivex.subscribers.b<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c<T, B, ?> f300344b;

        b(c<T, B, ?> cVar) {
            this.f300344b = cVar;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300344b.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300344b.o(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(B b10) {
            this.f300344b.p(b10);
        }
    }

    static final class c<T, B, V> extends io.reactivex.internal.subscribers.n<T, Object, io.reactivex.l<T>> implements org.reactivestreams.w {
        final org.reactivestreams.u<B> G3;
        final dj.o<? super B, ? extends org.reactivestreams.u<V>> H3;
        final int I3;
        final io.reactivex.disposables.b J3;
        org.reactivestreams.w K3;
        final AtomicReference<io.reactivex.disposables.c> L3;
        final List<io.reactivex.processors.h<T>> M3;
        final AtomicLong N3;
        final AtomicBoolean O3;

        c(org.reactivestreams.v<? super io.reactivex.l<T>> vVar, org.reactivestreams.u<B> uVar, dj.o<? super B, ? extends org.reactivestreams.u<V>> oVar, int i10) {
            super(vVar, new io.reactivex.internal.queue.a());
            this.L3 = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.N3 = atomicLong;
            this.O3 = new AtomicBoolean();
            this.G3 = uVar;
            this.H3 = oVar;
            this.I3 = i10;
            this.J3 = new io.reactivex.disposables.b();
            this.M3 = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.O3.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.d.b(this.L3);
                if (this.N3.decrementAndGet() == 0) {
                    this.K3.cancel();
                }
            }
        }

        void dispose() {
            this.J3.dispose();
            io.reactivex.internal.disposables.d.b(this.L3);
        }

        @Override // io.reactivex.internal.subscribers.n, io.reactivex.internal.util.u
        public boolean f(org.reactivestreams.v<? super io.reactivex.l<T>> vVar, Object obj) {
            return false;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.K3, wVar)) {
                this.K3 = wVar;
                this.B3.l(this);
                if (this.O3.get()) {
                    return;
                }
                b bVar = new b(this);
                if (androidx.compose.animation.core.z1.a(this.L3, null, bVar)) {
                    wVar.request(Long.MAX_VALUE);
                    this.G3.e(bVar);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void m(a<T, V> aVar) {
            this.J3.b(aVar);
            this.C3.offer((U) new d(aVar.f300342c, null));
            if (b()) {
                n();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void n() {
            ej.o oVar = this.C3;
            org.reactivestreams.v<? super V> vVar = this.B3;
            List<io.reactivex.processors.h<T>> list = this.M3;
            int iA = 1;
            while (true) {
                boolean z10 = this.E3;
                Object objPoll = oVar.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    dispose();
                    Throwable th2 = this.F3;
                    if (th2 != null) {
                        Iterator<io.reactivex.processors.h<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<io.reactivex.processors.h<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (objPoll instanceof d) {
                    d dVar = (d) objPoll;
                    io.reactivex.processors.h<T> hVar = dVar.f300345a;
                    if (hVar != null) {
                        if (list.remove(hVar)) {
                            dVar.f300345a.onComplete();
                            if (this.N3.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.O3.get()) {
                        io.reactivex.processors.h<T> hVarT8 = io.reactivex.processors.h.T8(this.I3);
                        long jRequested = requested();
                        if (jRequested != 0) {
                            list.add(hVarT8);
                            vVar.onNext(hVarT8);
                            if (jRequested != Long.MAX_VALUE) {
                                d(1L);
                            }
                            try {
                                org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.H3.apply(dVar.f300346b), "The publisher supplied is null");
                                a aVar = new a(this, hVarT8);
                                if (this.J3.c(aVar)) {
                                    this.N3.getAndIncrement();
                                    uVar.e(aVar);
                                }
                            } catch (Throwable th3) {
                                cancel();
                                vVar.onError(th3);
                            }
                        } else {
                            cancel();
                            vVar.onError(new io.reactivex.exceptions.c("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<io.reactivex.processors.h<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(io.reactivex.internal.util.q.r(objPoll));
                    }
                }
            }
        }

        void o(Throwable th2) {
            this.K3.cancel();
            this.J3.dispose();
            io.reactivex.internal.disposables.d.b(this.L3);
            this.B3.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.E3) {
                return;
            }
            this.E3 = true;
            if (b()) {
                n();
            }
            if (this.N3.decrementAndGet() == 0) {
                this.J3.dispose();
            }
            this.B3.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.E3) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.F3 = th2;
            this.E3 = true;
            if (b()) {
                n();
            }
            if (this.N3.decrementAndGet() == 0) {
                this.J3.dispose();
            }
            this.B3.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.E3) {
                return;
            }
            if (g()) {
                Iterator<io.reactivex.processors.h<T>> it = this.M3.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.C3.offer((U) io.reactivex.internal.util.q.x(t10));
                if (!b()) {
                    return;
                }
            }
            n();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void p(B b10) {
            this.C3.offer((U) new d(null, b10));
            if (b()) {
                n();
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            j(j10);
        }
    }

    static final class d<T, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.processors.h<T> f300345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final B f300346b;

        d(io.reactivex.processors.h<T> hVar, B b10) {
            this.f300345a = hVar;
            this.f300346b = b10;
        }
    }

    public u4(io.reactivex.l<T> lVar, org.reactivestreams.u<B> uVar, dj.o<? super B, ? extends org.reactivestreams.u<V>> oVar, int i10) {
        super(lVar);
        this.f300338c = uVar;
        this.f300339d = oVar;
        this.f300340e = i10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super io.reactivex.l<T>> vVar) {
        this.f299043b.j6(new c(new io.reactivex.subscribers.e(vVar), this.f300338c, this.f300339d, this.f300340e));
    }
}
