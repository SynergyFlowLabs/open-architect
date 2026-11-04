package io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class j1<T, K, V> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.observables.b<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends K> f301781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends V> f301782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f301784e;

    public static final class a<T, K, V> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f301785i = -3688291656102519502L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final Object f301786j = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super io.reactivex.observables.b<K, V>> f301787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends K> f301788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super T, ? extends V> f301789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f301790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f301791e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.c f301793g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicBoolean f301794h = new AtomicBoolean();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Map<Object, b<K, V>> f301792f = new ConcurrentHashMap();

        public a(io.reactivex.i0<? super io.reactivex.observables.b<K, V>> i0Var, dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, int i10, boolean z10) {
            this.f301787a = i0Var;
            this.f301788b = oVar;
            this.f301789c = oVar2;
            this.f301790d = i10;
            this.f301791e = z10;
            lazySet(1);
        }

        public void a(K k10) {
            if (k10 == null) {
                k10 = (K) f301786j;
            }
            this.f301792f.remove(k10);
            if (decrementAndGet() == 0) {
                this.f301793g.dispose();
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301793g, cVar)) {
                this.f301793g = cVar;
                this.f301787a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f301794h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f301793g.dispose();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301794h.get();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.f301792f.values());
            this.f301792f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onComplete();
            }
            this.f301787a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.f301792f.values());
            this.f301792f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onError(th2);
            }
            this.f301787a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.i0
        public void onNext(T t10) {
            try {
                K kApply = this.f301788b.apply(t10);
                Object obj = kApply != null ? kApply : f301786j;
                b<K, V> bVar = this.f301792f.get(obj);
                b bVar2 = bVar;
                if (bVar == false) {
                    if (this.f301794h.get()) {
                        return;
                    }
                    b<K, V> bVarI8 = b.i8(kApply, this.f301790d, this, this.f301791e);
                    this.f301792f.put(obj, bVarI8);
                    getAndIncrement();
                    this.f301787a.onNext(bVarI8);
                    bVar2 = bVarI8;
                }
                try {
                    bVar2.onNext(io.reactivex.internal.functions.b.g(this.f301789c.apply(t10), "The value supplied is null"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f301793g.dispose();
                    onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f301793g.dispose();
                onError(th3);
            }
        }
    }

    static final class b<K, T> extends io.reactivex.observables.b<K, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c<T, K> f301795b;

        protected b(K k10, c<T, K> cVar) {
            super(k10);
            this.f301795b = cVar;
        }

        public static <T, K> b<K, T> i8(K k10, int i10, a<?, K, T> aVar, boolean z10) {
            return new b<>(k10, new c(i10, aVar, k10, z10));
        }

        @Override // io.reactivex.b0
        protected void H5(io.reactivex.i0<? super T> i0Var) {
            this.f301795b.a(i0Var);
        }

        public void onComplete() {
            this.f301795b.d();
        }

        public void onError(Throwable th2) {
            this.f301795b.e(th2);
        }

        public void onNext(T t10) {
            this.f301795b.f(t10);
        }
    }

    static final class c<T, K> extends AtomicInteger implements io.reactivex.disposables.c, io.reactivex.g0<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f301796j = -3852313036005250360L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f301797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.queue.c<T> f301798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<?, K, T> f301799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f301800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f301801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Throwable f301802f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicBoolean f301803g = new AtomicBoolean();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicBoolean f301804h = new AtomicBoolean();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicReference<io.reactivex.i0<? super T>> f301805i = new AtomicReference<>();

        c(int i10, a<?, K, T> aVar, K k10, boolean z10) {
            this.f301798b = new io.reactivex.internal.queue.c<>(i10);
            this.f301799c = aVar;
            this.f301797a = k10;
            this.f301800d = z10;
        }

        @Override // io.reactivex.g0
        public void a(io.reactivex.i0<? super T> i0Var) {
            if (!this.f301804h.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.e.l(new IllegalStateException("Only one Observer allowed!"), i0Var);
                return;
            }
            i0Var.d(this);
            this.f301805i.lazySet(i0Var);
            if (this.f301803g.get()) {
                this.f301805i.lazySet(null);
            } else {
                c();
            }
        }

        boolean b(boolean z10, boolean z11, io.reactivex.i0<? super T> i0Var, boolean z12) {
            if (this.f301803g.get()) {
                this.f301798b.clear();
                this.f301799c.a(this.f301797a);
                this.f301805i.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f301802f;
                this.f301805i.lazySet(null);
                if (th2 != null) {
                    i0Var.onError(th2);
                } else {
                    i0Var.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f301802f;
            if (th3 != null) {
                this.f301798b.clear();
                this.f301805i.lazySet(null);
                i0Var.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f301805i.lazySet(null);
            i0Var.onComplete();
            return true;
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.c<T> cVar = this.f301798b;
            boolean z10 = this.f301800d;
            io.reactivex.i0<? super T> i0Var = this.f301805i.get();
            int iAddAndGet = 1;
            while (true) {
                if (i0Var != null) {
                    while (true) {
                        boolean z11 = this.f301801e;
                        T tPoll = cVar.poll();
                        boolean z12 = tPoll == null;
                        if (b(z11, z12, i0Var, z10)) {
                            return;
                        }
                        if (z12) {
                            break;
                        } else {
                            i0Var.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (i0Var == null) {
                    i0Var = this.f301805i.get();
                }
            }
        }

        public void d() {
            this.f301801e = true;
            c();
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f301803g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f301805i.lazySet(null);
                this.f301799c.a(this.f301797a);
            }
        }

        public void e(Throwable th2) {
            this.f301802f = th2;
            this.f301801e = true;
            c();
        }

        public void f(T t10) {
            this.f301798b.offer(t10);
            c();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301803g.get();
        }
    }

    public j1(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, int i10, boolean z10) {
        super(g0Var);
        this.f301781b = oVar;
        this.f301782c = oVar2;
        this.f301783d = i10;
        this.f301784e = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super io.reactivex.observables.b<K, V>> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301781b, this.f301782c, this.f301783d, this.f301784e));
    }
}
