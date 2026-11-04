package io.reactivex.internal.operators.flowable;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class n<T, U extends Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<U> f299817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.u<? extends Open> f299818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.o<? super Open, ? extends org.reactivestreams.u<? extends Close>> f299819e;

    static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f299820o = -8466418554264089604L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super C> f299821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Callable<C> f299822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.u<? extends Open> f299823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.o<? super Open, ? extends org.reactivestreams.u<? extends Close>> f299824d;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f299829i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f299831k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f299832l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f299834n;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final io.reactivex.internal.queue.c<C> f299830j = new io.reactivex.internal.queue.c<>(io.reactivex.l.Y());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.disposables.b f299825e = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f299826f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299827g = new AtomicReference<>();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Map<Long, C> f299833m = new LinkedHashMap();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final io.reactivex.internal.util.c f299828h = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.n$a$a, reason: collision with other inner class name */
        static final class C2140a<Open> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Open>, io.reactivex.disposables.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f299835b = -8498650778633225126L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, ?, Open, ?> f299836a;

            C2140a(a<?, ?, Open, ?> aVar) {
                this.f299836a = aVar;
            }

            @Override // io.reactivex.disposables.c
            public void dispose() {
                io.reactivex.internal.subscriptions.j.b(this);
            }

            @Override // io.reactivex.disposables.c
            public boolean k() {
                if (get() != io.reactivex.internal.subscriptions.j.CANCELLED) {
                    return false;
                }
                int i10 = 0 >> 1;
                return true;
            }

            @Override // io.reactivex.q, org.reactivestreams.v
            public void l(org.reactivestreams.w wVar) {
                io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.v
            public void onComplete() {
                lazySet(io.reactivex.internal.subscriptions.j.CANCELLED);
                this.f299836a.e(this);
            }

            @Override // org.reactivestreams.v
            public void onError(Throwable th2) {
                lazySet(io.reactivex.internal.subscriptions.j.CANCELLED);
                this.f299836a.a(this, th2);
            }

            @Override // org.reactivestreams.v
            public void onNext(Open open) {
                this.f299836a.d(open);
            }
        }

        a(org.reactivestreams.v<? super C> vVar, org.reactivestreams.u<? extends Open> uVar, dj.o<? super Open, ? extends org.reactivestreams.u<? extends Close>> oVar, Callable<C> callable) {
            this.f299821a = vVar;
            this.f299822b = callable;
            this.f299823c = uVar;
            this.f299824d = oVar;
        }

        void a(io.reactivex.disposables.c cVar, Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f299827g);
            this.f299825e.b(cVar);
            onError(th2);
        }

        void b(b<T, C> bVar, long j10) {
            boolean z10;
            this.f299825e.b(bVar);
            if (this.f299825e.g() == 0) {
                io.reactivex.internal.subscriptions.j.b(this.f299827g);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f299833m;
                    if (map == null) {
                        return;
                    }
                    this.f299830j.offer(map.remove(Long.valueOf(j10)));
                    if (z10) {
                        this.f299829i = true;
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
            long j10 = this.f299834n;
            org.reactivestreams.v<? super C> vVar = this.f299821a;
            io.reactivex.internal.queue.c<C> cVar = this.f299830j;
            int iAddAndGet = 1;
            do {
                long j11 = this.f299826f.get();
                while (j10 != j11) {
                    if (this.f299831k) {
                        cVar.clear();
                        return;
                    }
                    boolean z10 = this.f299829i;
                    if (z10 && this.f299828h.get() != null) {
                        cVar.clear();
                        vVar.onError(this.f299828h.c());
                        return;
                    }
                    C cPoll = cVar.poll();
                    boolean z11 = cPoll == null;
                    if (z10 && z11) {
                        vVar.onComplete();
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        vVar.onNext(cPoll);
                        j10++;
                    }
                }
                if (j10 == j11) {
                    if (this.f299831k) {
                        cVar.clear();
                        return;
                    }
                    if (this.f299829i) {
                        if (this.f299828h.get() != null) {
                            cVar.clear();
                            vVar.onError(this.f299828h.c());
                            return;
                        } else if (cVar.isEmpty()) {
                            vVar.onComplete();
                            return;
                        }
                    }
                }
                this.f299834n = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (io.reactivex.internal.subscriptions.j.b(this.f299827g)) {
                this.f299831k = true;
                this.f299825e.dispose();
                synchronized (this) {
                    try {
                        this.f299833m = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (getAndIncrement() != 0) {
                    this.f299830j.clear();
                }
            }
        }

        void d(Open open) {
            try {
                Collection collection = (Collection) io.reactivex.internal.functions.b.g(this.f299822b.call(), "The bufferSupplier returned a null Collection");
                org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299824d.apply(open), "The bufferClose returned a null Publisher");
                long j10 = this.f299832l;
                this.f299832l = 1 + j10;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.f299833m;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j10), (C) collection);
                        b bVar = new b(this, j10);
                        this.f299825e.c(bVar);
                        uVar.e(bVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                io.reactivex.internal.subscriptions.j.b(this.f299827g);
                onError(th3);
            }
        }

        void e(C2140a<Open> c2140a) {
            this.f299825e.b(c2140a);
            if (this.f299825e.g() == 0) {
                io.reactivex.internal.subscriptions.j.b(this.f299827g);
                this.f299829i = true;
                c();
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this.f299827g, wVar)) {
                C2140a c2140a = new C2140a(this);
                this.f299825e.c(c2140a);
                this.f299823c.e(c2140a);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299825e.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f299833m;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.f299830j.offer(it.next());
                    }
                    this.f299833m = null;
                    this.f299829i = true;
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f299828h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299825e.dispose();
            synchronized (this) {
                try {
                    this.f299833m = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f299829i = true;
            c();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f299833m;
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

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.util.d.a(this.f299826f, j10);
            c();
        }
    }

    static final class b<T, C extends Collection<? super T>> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f299837c = -8498650778633225126L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T, C, ?, ?> f299838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299839b;

        b(a<T, C, ?, ?> aVar, long j10) {
            this.f299838a = aVar;
            this.f299839b = j10;
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
            org.reactivestreams.w wVar = get();
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar != jVar) {
                lazySet(jVar);
                this.f299838a.b(this, this.f299839b);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            org.reactivestreams.w wVar = get();
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar == jVar) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                lazySet(jVar);
                this.f299838a.a(this, th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            org.reactivestreams.w wVar = get();
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar != jVar) {
                lazySet(jVar);
                wVar.cancel();
                this.f299838a.b(this, this.f299839b);
            }
        }
    }

    public n(io.reactivex.l<T> lVar, org.reactivestreams.u<? extends Open> uVar, dj.o<? super Open, ? extends org.reactivestreams.u<? extends Close>> oVar, Callable<U> callable) {
        super(lVar);
        this.f299818d = uVar;
        this.f299819e = oVar;
        this.f299817c = callable;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super U> vVar) {
        a aVar = new a(vVar, this.f299818d, this.f299819e, this.f299817c);
        vVar.l(aVar);
        this.f299043b.j6(aVar);
    }
}
