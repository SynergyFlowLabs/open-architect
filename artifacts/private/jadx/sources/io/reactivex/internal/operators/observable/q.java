package io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class q<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f302126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f302127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f302128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Callable<U> f302129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f302130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f302131h;

    static final class a<T, U extends Collection<? super T>> extends io.reactivex.internal.observers.v<T, U, U> implements Runnable, io.reactivex.disposables.c {
        long A3;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        final Callable<U> f302132q3;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        final long f302133r3;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        final TimeUnit f302134s3;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        final int f302135t3;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        final boolean f302136u3;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        final io.reactivex.j0.c f302137v3;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        U f302138w3;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        io.reactivex.disposables.c f302139x3;

        /* JADX INFO: renamed from: y3, reason: collision with root package name */
        io.reactivex.disposables.c f302140y3;

        /* JADX INFO: renamed from: z3, reason: collision with root package name */
        long f302141z3;

        a(io.reactivex.i0<? super U> i0Var, Callable<U> callable, long j10, TimeUnit timeUnit, int i10, boolean z10, io.reactivex.j0.c cVar) {
            super(i0Var, new io.reactivex.internal.queue.a());
            this.f302132q3 = callable;
            this.f302133r3 = j10;
            this.f302134s3 = timeUnit;
            this.f302135t3 = i10;
            this.f302136u3 = z10;
            this.f302137v3 = cVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302140y3, cVar)) {
                this.f302140y3 = cVar;
                try {
                    this.f302138w3 = (U) io.reactivex.internal.functions.b.g(this.f302132q3.call(), "The buffer supplied is null");
                    this.f298800l3.d(this);
                    io.reactivex.j0.c cVar2 = this.f302137v3;
                    long j10 = this.f302133r3;
                    this.f302139x3 = cVar2.d(this, j10, j10, this.f302134s3);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cVar.dispose();
                    io.reactivex.internal.disposables.e.l(th2, this.f298800l3);
                    this.f302137v3.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f298802n3) {
                return;
            }
            this.f298802n3 = true;
            this.f302140y3.dispose();
            this.f302137v3.dispose();
            synchronized (this) {
                this.f302138w3 = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.v, io.reactivex.internal.util.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void f(io.reactivex.i0<? super U> i0Var, U u10) {
            i0Var.onNext(u10);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298802n3;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            U u10;
            this.f302137v3.dispose();
            synchronized (this) {
                try {
                    u10 = this.f302138w3;
                    this.f302138w3 = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f298801m3.offer(u10);
            this.f298803o3 = true;
            if (b()) {
                io.reactivex.internal.util.v.d(this.f298801m3, this.f298800l3, false, this, this);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    this.f302138w3 = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f298800l3.onError(th2);
            this.f302137v3.dispose();
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x006c */
        /* JADX WARN: Can't wrap try/catch for region: R(8:48|3|4|(2:54|(2:6|7)(2:10|(2:12|13)(11:14|15|16|17|(1:19)|20|57|21|46|25|(2:27|28)(1:60))))|52|43|44|45) */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0089 -> B:42:0x0083). Please report as a decompilation issue!!! */
        @Override // io.reactivex.i0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onNext(T r9) throws java.lang.Throwable {
            /*
                r8 = this;
                monitor-enter(r8)
                U extends java.util.Collection<? super T> r0 = r8.f302138w3     // Catch: java.lang.Throwable -> L80
                r7 = 3
                if (r0 != 0) goto Lf
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r0 = move-exception
                r9 = r0
                r9 = r0
                r1 = r8
                r7 = 7
                goto L85
            Lf:
                r7 = 4
                r0.add(r9)     // Catch: java.lang.Throwable -> L80
                int r9 = r0.size()     // Catch: java.lang.Throwable -> L80
                int r1 = r8.f302135t3     // Catch: java.lang.Throwable -> L80
                if (r9 >= r1) goto L1d
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L8
                return
            L1d:
                r9 = 0
                r8.f302138w3 = r9     // Catch: java.lang.Throwable -> L80
                long r1 = r8.f302141z3     // Catch: java.lang.Throwable -> L80
                r3 = 1
                long r1 = r1 + r3
                r8.f302141z3 = r1     // Catch: java.lang.Throwable -> L80
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L80
                r7 = 1
                boolean r9 = r8.f302136u3
                if (r9 == 0) goto L32
                io.reactivex.disposables.c r9 = r8.f302139x3
                r9.dispose()
            L32:
                r9 = 0
                r8.i(r0, r9, r8)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r9 = r8.f302132q3     // Catch: java.lang.Throwable -> L6e
                java.lang.Object r9 = r9.call()     // Catch: java.lang.Throwable -> L6e
                java.lang.String r0 = "n smsTeefruliipduf lhbepu l"
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r9 = io.reactivex.internal.functions.b.g(r9, r0)     // Catch: java.lang.Throwable -> L6e
                java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Throwable -> L6e
                monitor-enter(r8)
                r8.f302138w3 = r9     // Catch: java.lang.Throwable -> L64
                long r0 = r8.A3     // Catch: java.lang.Throwable -> L64
                long r0 = r0 + r3
                r8.A3 = r0     // Catch: java.lang.Throwable -> L64
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L64
                boolean r9 = r8.f302136u3
                if (r9 == 0) goto L63
                io.reactivex.j0$c r0 = r8.f302137v3
                long r2 = r8.f302133r3
                java.util.concurrent.TimeUnit r6 = r8.f302134s3
                r4 = r2
                r1 = r8
                r7 = 3
                io.reactivex.disposables.c r8 = r0.d(r1, r2, r4, r6)
                r7 = 0
                r1.f302139x3 = r8
            L63:
                return
            L64:
                r0 = move-exception
                r1 = r8
                r1 = r8
            L67:
                r8 = r0
                r8 = r0
                r7 = 5
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
                throw r8
            L6c:
                r0 = move-exception
                goto L67
            L6e:
                r0 = move-exception
                r1 = r8
                r1 = r8
                r8 = r0
                r8 = r0
                io.reactivex.exceptions.b.b(r8)
                io.reactivex.i0<? super V> r9 = r1.f298800l3
                r9.onError(r8)
                r1.dispose()
                r7 = 4
                return
            L80:
                r0 = move-exception
                r1 = r8
                r1 = r8
            L83:
                r9 = r0
                r9 = r0
            L85:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
                r7 = 3
                throw r9
            L88:
                r0 = move-exception
                r7 = 0
                goto L83
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.q.a.onNext(java.lang.Object):void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u10 = (U) io.reactivex.internal.functions.b.g(this.f302132q3.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        U u11 = this.f302138w3;
                        if (u11 != null && this.f302141z3 == this.A3) {
                            this.f302138w3 = u10;
                            i(u11, false, this);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                dispose();
                this.f298800l3.onError(th3);
            }
        }
    }

    static final class b<T, U extends Collection<? super T>> extends io.reactivex.internal.observers.v<T, U, U> implements Runnable, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        final Callable<U> f302142q3;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        final long f302143r3;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        final TimeUnit f302144s3;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        final io.reactivex.j0 f302145t3;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        io.reactivex.disposables.c f302146u3;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        U f302147v3;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302148w3;

        b(io.reactivex.i0<? super U> i0Var, Callable<U> callable, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            super(i0Var, new io.reactivex.internal.queue.a());
            this.f302148w3 = new AtomicReference<>();
            this.f302142q3 = callable;
            this.f302143r3 = j10;
            this.f302144s3 = timeUnit;
            this.f302145t3 = j0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302146u3, cVar)) {
                this.f302146u3 = cVar;
                try {
                    this.f302147v3 = (U) io.reactivex.internal.functions.b.g(this.f302142q3.call(), "The buffer supplied is null");
                    this.f298800l3.d(this);
                    if (this.f298802n3) {
                        return;
                    }
                    io.reactivex.j0 j0Var = this.f302145t3;
                    long j10 = this.f302143r3;
                    io.reactivex.disposables.c cVarG = j0Var.g(this, j10, j10, this.f302144s3);
                    if (androidx.compose.animation.core.z1.a(this.f302148w3, null, cVarG)) {
                        return;
                    }
                    cVarG.dispose();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    dispose();
                    io.reactivex.internal.disposables.e.l(th2, this.f298800l3);
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f302148w3);
            this.f302146u3.dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.observers.v, io.reactivex.internal.util.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void f(io.reactivex.i0<? super U> i0Var, U u10) {
            this.f298800l3.onNext((Object) u10);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302148w3.get() == io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            U u10;
            synchronized (this) {
                u10 = this.f302147v3;
                this.f302147v3 = null;
            }
            if (u10 != null) {
                this.f298801m3.offer(u10);
                this.f298803o3 = true;
                if (b()) {
                    io.reactivex.internal.util.v.d(this.f298801m3, this.f298800l3, false, null, this);
                }
            }
            io.reactivex.internal.disposables.d.b(this.f302148w3);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f302147v3 = null;
            }
            this.f298800l3.onError(th2);
            io.reactivex.internal.disposables.d.b(this.f302148w3);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    U u10 = this.f302147v3;
                    if (u10 == null) {
                        return;
                    }
                    u10.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u10;
            try {
                U u11 = (U) io.reactivex.internal.functions.b.g(this.f302142q3.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        u10 = this.f302147v3;
                        if (u10 != null) {
                            this.f302147v3 = u11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (u10 == null) {
                    io.reactivex.internal.disposables.d.b(this.f302148w3);
                } else {
                    h(u10, false, this);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f298800l3.onError(th3);
                dispose();
            }
        }
    }

    static final class c<T, U extends Collection<? super T>> extends io.reactivex.internal.observers.v<T, U, U> implements Runnable, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        final Callable<U> f302149q3;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        final long f302150r3;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        final long f302151s3;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        final TimeUnit f302152t3;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        final io.reactivex.j0.c f302153u3;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        final List<U> f302154v3;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        io.reactivex.disposables.c f302155w3;

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final U f302156a;

            a(U u10) {
                this.f302156a = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.f302154v3.remove(this.f302156a);
                }
                c cVar = c.this;
                cVar.i(this.f302156a, false, cVar.f302153u3);
            }
        }

        final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final U f302158a;

            b(U u10) {
                this.f302158a = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    try {
                        c.this.f302154v3.remove(this.f302158a);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c cVar = c.this;
                cVar.i(this.f302158a, false, cVar.f302153u3);
            }
        }

        c(io.reactivex.i0<? super U> i0Var, Callable<U> callable, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0.c cVar) {
            super(i0Var, new io.reactivex.internal.queue.a());
            this.f302149q3 = callable;
            this.f302150r3 = j10;
            this.f302151s3 = j11;
            this.f302152t3 = timeUnit;
            this.f302153u3 = cVar;
            this.f302154v3 = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302155w3, cVar)) {
                this.f302155w3 = cVar;
                try {
                    Collection collection = (Collection) io.reactivex.internal.functions.b.g(this.f302149q3.call(), "The buffer supplied is null");
                    this.f302154v3.add((U) collection);
                    this.f298800l3.d(this);
                    io.reactivex.j0.c cVar2 = this.f302153u3;
                    long j10 = this.f302151s3;
                    cVar2.d(this, j10, j10, this.f302152t3);
                    this.f302153u3.c(new b(collection), this.f302150r3, this.f302152t3);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cVar.dispose();
                    io.reactivex.internal.disposables.e.l(th2, this.f298800l3);
                    this.f302153u3.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f298802n3) {
                return;
            }
            this.f298802n3 = true;
            n();
            this.f302155w3.dispose();
            this.f302153u3.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.v, io.reactivex.internal.util.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void f(io.reactivex.i0<? super U> i0Var, U u10) {
            i0Var.onNext(u10);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298802n3;
        }

        void n() {
            synchronized (this) {
                this.f302154v3.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                try {
                    arrayList = new ArrayList(this.f302154v3);
                    this.f302154v3.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f298801m3.offer((U) ((Collection) it.next()));
            }
            this.f298803o3 = true;
            if (b()) {
                io.reactivex.internal.util.v.d(this.f298801m3, this.f298800l3, false, this.f302153u3, this);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f298803o3 = true;
            n();
            this.f298800l3.onError(th2);
            this.f302153u3.dispose();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.f302154v3.iterator();
                    while (it.hasNext()) {
                        it.next().add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f298802n3) {
                return;
            }
            try {
                Collection collection = (Collection) io.reactivex.internal.functions.b.g(this.f302149q3.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        if (this.f298802n3) {
                            return;
                        }
                        this.f302154v3.add((U) collection);
                        this.f302153u3.c(new a(collection), this.f302150r3, this.f302152t3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f298800l3.onError(th3);
                dispose();
            }
        }
    }

    public q(io.reactivex.g0<T> g0Var, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0 j0Var, Callable<U> callable, int i10, boolean z10) {
        super(g0Var);
        this.f302125b = j10;
        this.f302126c = j11;
        this.f302127d = timeUnit;
        this.f302128e = j0Var;
        this.f302129f = callable;
        this.f302130g = i10;
        this.f302131h = z10;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super U> i0Var) {
        if (this.f302125b == this.f302126c && this.f302130g == Integer.MAX_VALUE) {
            this.f301291a.a(new b(new io.reactivex.observers.m(i0Var), this.f302129f, this.f302125b, this.f302127d, this.f302128e));
            return;
        }
        io.reactivex.j0.c cVarC = this.f302128e.c();
        if (this.f302125b == this.f302126c) {
            this.f301291a.a(new a(new io.reactivex.observers.m(i0Var), this.f302129f, this.f302125b, this.f302127d, this.f302130g, this.f302131h, cVarC));
        } else {
            this.f301291a.a(new c(new io.reactivex.observers.m(i0Var), this.f302129f, this.f302125b, this.f302126c, this.f302127d, cVarC));
        }
    }
}
