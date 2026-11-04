package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class l4<T, U, V> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<U> f299702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super T, ? extends org.reactivestreams.u<V>> f299703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f299704e;

    static final class a extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f299705c = 8708641127342403073L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f299706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299707b;

        a(long j10, c cVar) {
            this.f299707b = j10;
            this.f299706a = cVar;
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
            Object obj = get();
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (obj != jVar) {
                lazySet(jVar);
                this.f299706a.b(this.f299707b);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            Object obj = get();
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (obj == jVar) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                lazySet(jVar);
                this.f299706a.a(this.f299707b, th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            org.reactivestreams.w wVar = (org.reactivestreams.w) get();
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar != jVar) {
                wVar.cancel();
                lazySet(jVar);
                this.f299706a.b(this.f299707b);
            }
        }
    }

    static final class b<T> extends io.reactivex.internal.subscriptions.i implements io.reactivex.q<T>, c {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final long f299708t = 3764492702657003550L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299709j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final dj.o<? super T, ? extends org.reactivestreams.u<?>> f299710k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f299711l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299712m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AtomicLong f299713n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        org.reactivestreams.u<? extends T> f299714o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        long f299715s;

        b(org.reactivestreams.v<? super T> vVar, dj.o<? super T, ? extends org.reactivestreams.u<?>> oVar, org.reactivestreams.u<? extends T> uVar) {
            super(true);
            this.f299709j = vVar;
            this.f299710k = oVar;
            this.f299711l = new io.reactivex.internal.disposables.h();
            this.f299712m = new AtomicReference<>();
            this.f299714o = uVar;
            this.f299713n = new AtomicLong();
        }

        @Override // io.reactivex.internal.operators.flowable.l4.c
        public void a(long j10, Throwable th2) {
            if (!this.f299713n.compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.subscriptions.j.b(this.f299712m);
                this.f299709j.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.m4.d
        public void b(long j10) {
            if (this.f299713n.compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.j.b(this.f299712m);
                org.reactivestreams.u<? extends T> uVar = this.f299714o;
                this.f299714o = null;
                long j11 = this.f299715s;
                if (j11 != 0) {
                    g(j11);
                }
                uVar.e(new m4.a(this.f299709j, this));
            }
        }

        @Override // io.reactivex.internal.subscriptions.i, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f299711l.dispose();
        }

        void i(org.reactivestreams.u<?> uVar) {
            if (uVar != null) {
                a aVar = new a(0L, this);
                if (this.f299711l.a(aVar)) {
                    uVar.e(aVar);
                }
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this.f299712m, wVar)) {
                h(wVar);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299713n.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f299711l.dispose();
                this.f299709j.onComplete();
                this.f299711l.dispose();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299713n.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299711l.dispose();
            this.f299709j.onError(th2);
            this.f299711l.dispose();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            long j10 = this.f299713n.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = j10 + 1;
                if (this.f299713n.compareAndSet(j10, j11)) {
                    io.reactivex.disposables.c cVar = this.f299711l.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f299715s++;
                    this.f299709j.onNext(t10);
                    try {
                        org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299710k.apply(t10), "The itemTimeoutIndicator returned a null Publisher.");
                        a aVar = new a(j11, this);
                        if (this.f299711l.a(aVar)) {
                            uVar.e(aVar);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f299712m.get().cancel();
                        this.f299713n.getAndSet(Long.MAX_VALUE);
                        this.f299709j.onError(th2);
                    }
                }
            }
        }
    }

    interface c extends m4.d {
        void a(long j10, Throwable th2);
    }

    static final class d<T> extends AtomicLong implements io.reactivex.q<T>, org.reactivestreams.w, c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f299716f = 3764492702657003550L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends org.reactivestreams.u<?>> f299718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f299719c = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299720d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f299721e = new AtomicLong();

        d(org.reactivestreams.v<? super T> vVar, dj.o<? super T, ? extends org.reactivestreams.u<?>> oVar) {
            this.f299717a = vVar;
            this.f299718b = oVar;
        }

        @Override // io.reactivex.internal.operators.flowable.l4.c
        public void a(long j10, Throwable th2) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.subscriptions.j.b(this.f299720d);
                this.f299717a.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.m4.d
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.j.b(this.f299720d);
                this.f299717a.onError(new TimeoutException());
            }
        }

        void c(org.reactivestreams.u<?> uVar) {
            if (uVar != null) {
                a aVar = new a(0L, this);
                if (this.f299719c.a(aVar)) {
                    uVar.e(aVar);
                }
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f299720d);
            this.f299719c.dispose();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this.f299720d, this.f299721e, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f299719c.dispose();
                this.f299717a.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299719c.dispose();
                this.f299717a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    io.reactivex.disposables.c cVar = this.f299719c.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f299717a.onNext(t10);
                    try {
                        org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299718b.apply(t10), "The itemTimeoutIndicator returned a null Publisher.");
                        a aVar = new a(j11, this);
                        if (this.f299719c.a(aVar)) {
                            uVar.e(aVar);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f299720d.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.f299717a.onError(th2);
                    }
                }
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this.f299720d, this.f299721e, j10);
        }
    }

    public l4(io.reactivex.l<T> lVar, org.reactivestreams.u<U> uVar, dj.o<? super T, ? extends org.reactivestreams.u<V>> oVar, org.reactivestreams.u<? extends T> uVar2) {
        super(lVar);
        this.f299702c = uVar;
        this.f299703d = oVar;
        this.f299704e = uVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        if (this.f299704e == null) {
            d dVar = new d(vVar, this.f299703d);
            vVar.l(dVar);
            dVar.c(this.f299702c);
            this.f299043b.j6(dVar);
            return;
        }
        b bVar = new b(vVar, this.f299703d, this.f299704e);
        vVar.l(bVar);
        bVar.i(this.f299702c);
        this.f299043b.j6(bVar);
    }
}
