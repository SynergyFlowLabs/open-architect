package io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class g4<T, B, V> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.b0<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<B> f301619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super B, ? extends io.reactivex.g0<V>> f301620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301621d;

    static final class a<T, V> extends io.reactivex.observers.e<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c<T, ?, V> f301622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.subjects.j<T> f301623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f301624d;

        a(c<T, ?, V> cVar, io.reactivex.subjects.j<T> jVar) {
            this.f301622b = cVar;
            this.f301623c = jVar;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301624d) {
                return;
            }
            this.f301624d = true;
            this.f301622b.j(this);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301624d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301624d = true;
                this.f301622b.n(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(V v10) {
            dispose();
            onComplete();
        }
    }

    static final class b<T, B> extends io.reactivex.observers.e<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c<T, B, ?> f301625b;

        b(c<T, B, ?> cVar) {
            this.f301625b = cVar;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301625b.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301625b.n(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(B b10) {
            this.f301625b.o(b10);
        }
    }

    static final class c<T, B, V> extends io.reactivex.internal.observers.v<T, Object, io.reactivex.b0<T>> implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        final io.reactivex.g0<B> f301626q3;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        final dj.o<? super B, ? extends io.reactivex.g0<V>> f301627r3;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        final int f301628s3;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        final io.reactivex.disposables.b f301629t3;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        io.reactivex.disposables.c f301630u3;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301631v3;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        final List<io.reactivex.subjects.j<T>> f301632w3;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        final AtomicLong f301633x3;

        /* JADX INFO: renamed from: y3, reason: collision with root package name */
        final AtomicBoolean f301634y3;

        c(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var, io.reactivex.g0<B> g0Var, dj.o<? super B, ? extends io.reactivex.g0<V>> oVar, int i10) {
            super(i0Var, new io.reactivex.internal.queue.a());
            this.f301631v3 = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f301633x3 = atomicLong;
            this.f301634y3 = new AtomicBoolean();
            this.f301626q3 = g0Var;
            this.f301627r3 = oVar;
            this.f301628s3 = i10;
            this.f301629t3 = new io.reactivex.disposables.b();
            this.f301632w3 = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301630u3, cVar)) {
                this.f301630u3 = cVar;
                this.f298800l3.d(this);
                if (this.f301634y3.get()) {
                    return;
                }
                b bVar = new b(this);
                if (androidx.compose.animation.core.z1.a(this.f301631v3, null, bVar)) {
                    this.f301626q3.a(bVar);
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f301634y3.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.d.b(this.f301631v3);
                if (this.f301633x3.decrementAndGet() == 0) {
                    this.f301630u3.dispose();
                }
            }
        }

        @Override // io.reactivex.internal.observers.v, io.reactivex.internal.util.r
        public void f(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var, Object obj) {
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void j(a<T, V> aVar) {
            this.f301629t3.b(aVar);
            this.f298801m3.offer((U) new d(aVar.f301623c, null));
            if (b()) {
                m();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301634y3.get();
        }

        void l() {
            this.f301629t3.dispose();
            io.reactivex.internal.disposables.d.b(this.f301631v3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void m() {
            io.reactivex.internal.queue.a aVar = (io.reactivex.internal.queue.a) this.f298801m3;
            io.reactivex.i0<? super V> i0Var = this.f298800l3;
            List<io.reactivex.subjects.j<T>> list = this.f301632w3;
            int iA = 1;
            while (true) {
                boolean z10 = this.f298803o3;
                Object objPoll = aVar.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    l();
                    Throwable th2 = this.f298804p3;
                    if (th2 != null) {
                        Iterator<io.reactivex.subjects.j<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<io.reactivex.subjects.j<T>> it2 = list.iterator();
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
                    io.reactivex.subjects.j<T> jVar = dVar.f301635a;
                    if (jVar != null) {
                        if (list.remove(jVar)) {
                            dVar.f301635a.onComplete();
                            if (this.f301633x3.decrementAndGet() == 0) {
                                l();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f301634y3.get()) {
                        io.reactivex.subjects.j<T> jVarN8 = io.reactivex.subjects.j.n8(this.f301628s3);
                        list.add(jVarN8);
                        i0Var.onNext(jVarN8);
                        try {
                            io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f301627r3.apply(dVar.f301636b), "The ObservableSource supplied is null");
                            a aVar2 = new a(this, jVarN8);
                            if (this.f301629t3.c(aVar2)) {
                                this.f301633x3.getAndIncrement();
                                g0Var.a(aVar2);
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.b.b(th3);
                            this.f301634y3.set(true);
                            i0Var.onError(th3);
                        }
                    }
                } else {
                    Iterator<io.reactivex.subjects.j<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(io.reactivex.internal.util.q.r(objPoll));
                    }
                }
            }
        }

        void n(Throwable th2) {
            this.f301630u3.dispose();
            this.f301629t3.dispose();
            onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void o(B b10) {
            this.f298801m3.offer((U) new d(null, b10));
            if (b()) {
                m();
            }
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f298803o3) {
                return;
            }
            this.f298803o3 = true;
            if (b()) {
                m();
            }
            if (this.f301633x3.decrementAndGet() == 0) {
                this.f301629t3.dispose();
            }
            this.f298800l3.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f298803o3) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f298804p3 = th2;
            this.f298803o3 = true;
            if (b()) {
                m();
            }
            if (this.f301633x3.decrementAndGet() == 0) {
                this.f301629t3.dispose();
            }
            this.f298800l3.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (g()) {
                Iterator<io.reactivex.subjects.j<T>> it = this.f301632w3.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.f298801m3.offer((U) io.reactivex.internal.util.q.x(t10));
                if (!b()) {
                    return;
                }
            }
            m();
        }
    }

    static final class d<T, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.subjects.j<T> f301635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final B f301636b;

        d(io.reactivex.subjects.j<T> jVar, B b10) {
            this.f301635a = jVar;
            this.f301636b = b10;
        }
    }

    public g4(io.reactivex.g0<T> g0Var, io.reactivex.g0<B> g0Var2, dj.o<? super B, ? extends io.reactivex.g0<V>> oVar, int i10) {
        super(g0Var);
        this.f301619b = g0Var2;
        this.f301620c = oVar;
        this.f301621d = i10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var) {
        this.f301291a.a(new c(new io.reactivex.observers.m(i0Var), this.f301619b, this.f301620c, this.f301621d));
    }
}
