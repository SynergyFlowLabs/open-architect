package io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class n<T, U extends Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<U> f301983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.g0<? extends Open> f301984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super Open, ? extends io.reactivex.g0<? extends Close>> f301985d;

    static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f301986m = -8466418554264089604L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super C> f301987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Callable<C> f301988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.g0<? extends Open> f301989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.o<? super Open, ? extends io.reactivex.g0<? extends Close>> f301990d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301994h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f301996j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f301997k;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final io.reactivex.internal.queue.c<C> f301995i = new io.reactivex.internal.queue.c<>(io.reactivex.b0.T());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.disposables.b f301991e = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301992f = new AtomicReference<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Map<Long, C> f301998l = new LinkedHashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.internal.util.c f301993g = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.n$a$a, reason: collision with other inner class name */
        static final class C2175a<Open> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<Open>, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301999b = -8498650778633225126L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, ?, Open, ?> f302000a;

            C2175a(a<?, ?, Open, ?> aVar) {
                this.f302000a = aVar;
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
                return get() == io.reactivex.internal.disposables.d.DISPOSED;
            }

            @Override // io.reactivex.i0
            public void onComplete() {
                lazySet(io.reactivex.internal.disposables.d.DISPOSED);
                this.f302000a.f(this);
            }

            @Override // io.reactivex.i0
            public void onError(Throwable th2) {
                lazySet(io.reactivex.internal.disposables.d.DISPOSED);
                this.f302000a.a(this, th2);
            }

            @Override // io.reactivex.i0
            public void onNext(Open open) {
                this.f302000a.e(open);
            }
        }

        a(io.reactivex.i0<? super C> i0Var, io.reactivex.g0<? extends Open> g0Var, dj.o<? super Open, ? extends io.reactivex.g0<? extends Close>> oVar, Callable<C> callable) {
            this.f301987a = i0Var;
            this.f301988b = callable;
            this.f301989c = g0Var;
            this.f301990d = oVar;
        }

        void a(io.reactivex.disposables.c cVar, Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f301992f);
            this.f301991e.b(cVar);
            onError(th2);
        }

        void b(b<T, C> bVar, long j10) {
            boolean z10;
            this.f301991e.b(bVar);
            if (this.f301991e.g() == 0) {
                io.reactivex.internal.disposables.d.b(this.f301992f);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f301998l;
                    if (map == null) {
                        return;
                    }
                    this.f301995i.offer(map.remove(Long.valueOf(j10)));
                    if (z10) {
                        this.f301994h = true;
                    }
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.i0<? super C> i0Var = this.f301987a;
            io.reactivex.internal.queue.c<C> cVar = this.f301995i;
            int iAddAndGet = 1;
            while (!this.f301996j) {
                boolean z10 = this.f301994h;
                if (z10 && this.f301993g.get() != null) {
                    cVar.clear();
                    i0Var.onError(this.f301993g.c());
                    return;
                }
                C cPoll = cVar.poll();
                boolean z11 = cPoll == null;
                if (z10 && z11) {
                    i0Var.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    i0Var.onNext(cPoll);
                }
            }
            cVar.clear();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this.f301992f, cVar)) {
                C2175a c2175a = new C2175a(this);
                this.f301991e.c(c2175a);
                this.f301989c.a(c2175a);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (io.reactivex.internal.disposables.d.b(this.f301992f)) {
                this.f301996j = true;
                this.f301991e.dispose();
                synchronized (this) {
                    try {
                        this.f301998l = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (getAndIncrement() != 0) {
                    this.f301995i.clear();
                }
            }
        }

        void e(Open open) {
            try {
                Collection collection = (Collection) io.reactivex.internal.functions.b.g(this.f301988b.call(), "The bufferSupplier returned a null Collection");
                io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f301990d.apply(open), "The bufferClose returned a null ObservableSource");
                long j10 = this.f301997k;
                this.f301997k = 1 + j10;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.f301998l;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j10), (C) collection);
                        b bVar = new b(this, j10);
                        this.f301991e.c(bVar);
                        g0Var.a(bVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                io.reactivex.internal.disposables.d.b(this.f301992f);
                onError(th3);
            }
        }

        void f(C2175a<Open> c2175a) {
            this.f301991e.b(c2175a);
            if (this.f301991e.g() == 0) {
                io.reactivex.internal.disposables.d.b(this.f301992f);
                this.f301994h = true;
                c();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f301992f.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301991e.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f301998l;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.f301995i.offer(it.next());
                    }
                    this.f301998l = null;
                    this.f301994h = true;
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f301993g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f301991e.dispose();
            synchronized (this) {
                try {
                    this.f301998l = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f301994h = true;
            c();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f301998l;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        it.next().add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static final class b<T, C extends Collection<? super T>> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302001c = -8498650778633225126L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T, C, ?, ?> f302002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302003b;

        b(a<T, C, ?, ?> aVar, long j10) {
            this.f302002a = aVar;
            this.f302003b = j10;
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
            return get() == io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar != dVar) {
                lazySet(dVar);
                this.f302002a.b(this, this.f302003b);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar == dVar) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                lazySet(dVar);
                this.f302002a.a(this, th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(Object obj) {
            io.reactivex.disposables.c cVar = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar != dVar) {
                lazySet(dVar);
                cVar.dispose();
                this.f302002a.b(this, this.f302003b);
            }
        }
    }

    public n(io.reactivex.g0<T> g0Var, io.reactivex.g0<? extends Open> g0Var2, dj.o<? super Open, ? extends io.reactivex.g0<? extends Close>> oVar, Callable<U> callable) {
        super(g0Var);
        this.f301984c = g0Var2;
        this.f301985d = oVar;
        this.f301983b = callable;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super U> i0Var) {
        a aVar = new a(i0Var, this.f301984c, this.f301985d, this.f301983b);
        i0Var.d(aVar);
        this.f301291a.a(aVar);
    }
}
