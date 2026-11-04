package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class x3<T, U, V> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<U> f302584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.g0<V>> f302585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.g0<? extends T> f302586d;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302587c = 8708641127342403073L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f302588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302589b;

        a(long j10, d dVar) {
            this.f302589b = j10;
            this.f302588a = dVar;
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
            Object obj = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f302588a.b(this.f302589b);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            Object obj = get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (obj == dVar) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                lazySet(dVar);
                this.f302588a.a(this.f302589b, th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(Object obj) {
            io.reactivex.disposables.c cVar = (io.reactivex.disposables.c) get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar != dVar) {
                cVar.dispose();
                lazySet(dVar);
                this.f302588a.b(this.f302589b);
            }
        }
    }

    static final class b<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T>, io.reactivex.disposables.c, d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f302590g = -7508389464265974549L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<?>> f302592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f302593c = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f302594d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302595e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.g0<? extends T> f302596f;

        b(io.reactivex.i0<? super T> i0Var, dj.o<? super T, ? extends io.reactivex.g0<?>> oVar, io.reactivex.g0<? extends T> g0Var) {
            this.f302591a = i0Var;
            this.f302592b = oVar;
            this.f302596f = g0Var;
        }

        @Override // io.reactivex.internal.operators.observable.x3.d
        public void a(long j10, Throwable th2) {
            if (!this.f302594d.compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.disposables.d.b(this);
                this.f302591a.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.y3.d
        public void b(long j10) {
            if (this.f302594d.compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.d.b(this.f302595e);
                io.reactivex.g0<? extends T> g0Var = this.f302596f;
                this.f302596f = null;
                g0Var.a(new y3.a(this.f302591a, this));
            }
        }

        void c(io.reactivex.g0<?> g0Var) {
            if (g0Var != null) {
                a aVar = new a(0L, this);
                if (this.f302593c.a(aVar)) {
                    g0Var.a(aVar);
                }
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f302595e, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f302595e);
            io.reactivex.internal.disposables.d.b(this);
            this.f302593c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302594d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f302593c.dispose();
                this.f302591a.onComplete();
                this.f302593c.dispose();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302594d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302593c.dispose();
            this.f302591a.onError(th2);
            this.f302593c.dispose();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            long j10 = this.f302594d.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f302594d.compareAndSet(j10, j11)) {
                    io.reactivex.disposables.c cVar = this.f302593c.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f302591a.onNext(t10);
                    try {
                        io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302592b.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j11, this);
                        if (this.f302593c.a(aVar)) {
                            g0Var.a(aVar);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f302595e.get().dispose();
                        this.f302594d.getAndSet(Long.MAX_VALUE);
                        this.f302591a.onError(th2);
                    }
                }
            }
        }
    }

    static final class c<T> extends AtomicLong implements io.reactivex.i0<T>, io.reactivex.disposables.c, d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302597e = 3764492702657003550L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<?>> f302599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f302600c = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302601d = new AtomicReference<>();

        c(io.reactivex.i0<? super T> i0Var, dj.o<? super T, ? extends io.reactivex.g0<?>> oVar) {
            this.f302598a = i0Var;
            this.f302599b = oVar;
        }

        @Override // io.reactivex.internal.operators.observable.x3.d
        public void a(long j10, Throwable th2) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.disposables.d.b(this.f302601d);
                this.f302598a.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.y3.d
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.d.b(this.f302601d);
                this.f302598a.onError(new TimeoutException());
            }
        }

        void c(io.reactivex.g0<?> g0Var) {
            if (g0Var != null) {
                a aVar = new a(0L, this);
                if (this.f302600c.a(aVar)) {
                    g0Var.a(aVar);
                }
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f302601d, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f302601d);
            this.f302600c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f302601d.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f302600c.dispose();
                this.f302598a.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302600c.dispose();
                this.f302598a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    io.reactivex.disposables.c cVar = this.f302600c.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f302598a.onNext(t10);
                    try {
                        io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302599b.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j11, this);
                        if (this.f302600c.a(aVar)) {
                            g0Var.a(aVar);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f302601d.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f302598a.onError(th2);
                    }
                }
            }
        }
    }

    interface d extends y3.d {
        void a(long j10, Throwable th2);
    }

    public x3(io.reactivex.b0<T> b0Var, io.reactivex.g0<U> g0Var, dj.o<? super T, ? extends io.reactivex.g0<V>> oVar, io.reactivex.g0<? extends T> g0Var2) {
        super(b0Var);
        this.f302584b = g0Var;
        this.f302585c = oVar;
        this.f302586d = g0Var2;
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
    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        if (this.f302586d == null) {
            c cVar = new c(i0Var, this.f302585c);
            i0Var.d(cVar);
            cVar.c(this.f302584b);
            this.f301291a.a(cVar);
            return;
        }
        b bVar = new b(i0Var, this.f302585c, this.f302586d);
        i0Var.d(bVar);
        bVar.c(this.f302584b);
        this.f301291a.a(bVar);
    }
}
