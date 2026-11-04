package io.reactivex.internal.operators.flowable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class q<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f299989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f299990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.j0 f299991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Callable<U> f299992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f299993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f299994i;

    static final class a<T, U extends Collection<? super T>> extends io.reactivex.internal.subscribers.n<T, U, U> implements org.reactivestreams.w, Runnable, io.reactivex.disposables.c {
        final Callable<U> G3;
        final long H3;
        final TimeUnit I3;
        final int J3;
        final boolean K3;
        final io.reactivex.j0.c L3;
        U M3;
        io.reactivex.disposables.c N3;
        org.reactivestreams.w O3;
        long P3;
        long Q3;

        a(org.reactivestreams.v<? super U> vVar, Callable<U> callable, long j10, TimeUnit timeUnit, int i10, boolean z10, io.reactivex.j0.c cVar) {
            super(vVar, new io.reactivex.internal.queue.a());
            this.G3 = callable;
            this.H3 = j10;
            this.I3 = timeUnit;
            this.J3 = i10;
            this.K3 = z10;
            this.L3 = cVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.D3) {
                return;
            }
            this.D3 = true;
            dispose();
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            synchronized (this) {
                this.M3 = null;
            }
            this.O3.cancel();
            this.L3.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.L3.k();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.O3, wVar)) {
                this.O3 = wVar;
                try {
                    this.M3 = (U) io.reactivex.internal.functions.b.g(this.G3.call(), "The supplied buffer is null");
                    this.B3.l(this);
                    io.reactivex.j0.c cVar = this.L3;
                    long j10 = this.H3;
                    this.N3 = cVar.d(this, j10, j10, this.I3);
                    wVar.request(Long.MAX_VALUE);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.L3.dispose();
                    wVar.cancel();
                    io.reactivex.internal.subscriptions.g.c(th2, this.B3);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.subscribers.n, io.reactivex.internal.util.u
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean f(org.reactivestreams.v<? super U> vVar, U u10) {
            vVar.onNext(u10);
            return true;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            U u10;
            synchronized (this) {
                u10 = this.M3;
                this.M3 = null;
            }
            this.C3.offer(u10);
            this.E3 = true;
            if (b()) {
                io.reactivex.internal.util.v.e(this.C3, this.B3, false, this, this);
            }
            this.L3.dispose();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            synchronized (this) {
                this.M3 = null;
            }
            this.B3.onError(th2);
            this.L3.dispose();
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x006f */
        /* JADX WARN: Can't wrap try/catch for region: R(9:50|3|4|52|(2:6|7)(3:10|11|(2:13|14)(11:15|16|17|18|(1:20)|21|48|22|4a|26|(2:28|29)(1:60)))|53|43|44|45) */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x008a -> B:42:0x0085). Please report as a decompilation issue!!! */
        @Override // org.reactivestreams.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onNext(T r9) throws java.lang.Throwable {
            /*
                r8 = this;
                monitor-enter(r8)
                U extends java.util.Collection<? super T> r0 = r8.M3     // Catch: java.lang.Throwable -> L83
                r7 = 7
                if (r0 != 0) goto Le
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r0 = move-exception
                r9 = r0
                r1 = r8
                r7 = 1
                goto L86
            Le:
                r0.add(r9)     // Catch: java.lang.Throwable -> L83
                r7 = 2
                int r9 = r0.size()     // Catch: java.lang.Throwable -> L83
                r7 = 2
                int r1 = r8.J3     // Catch: java.lang.Throwable -> L83
                r7 = 4
                if (r9 >= r1) goto L1e
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L8
                return
            L1e:
                r9 = 0
                r9 = 0
                r8.M3 = r9     // Catch: java.lang.Throwable -> L83
                long r1 = r8.P3     // Catch: java.lang.Throwable -> L83
                r3 = 1
                r3 = 1
                long r1 = r1 + r3
                r8.P3 = r1     // Catch: java.lang.Throwable -> L83
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L83
                boolean r9 = r8.K3
                r7 = 2
                if (r9 == 0) goto L37
                io.reactivex.disposables.c r9 = r8.N3
                r7 = 4
                r9.dispose()
            L37:
                r9 = 0
                r8.i(r0, r9, r8)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r9 = r8.G3     // Catch: java.lang.Throwable -> L71
                java.lang.Object r9 = r9.call()     // Catch: java.lang.Throwable -> L71
                java.lang.String r0 = "The supplied buffer is null"
                java.lang.Object r9 = io.reactivex.internal.functions.b.g(r9, r0)     // Catch: java.lang.Throwable -> L71
                r7 = 5
                java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Throwable -> L71
                monitor-enter(r8)
                r8.M3 = r9     // Catch: java.lang.Throwable -> L69
                long r0 = r8.Q3     // Catch: java.lang.Throwable -> L69
                long r0 = r0 + r3
                r8.Q3 = r0     // Catch: java.lang.Throwable -> L69
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L69
                r7 = 4
                boolean r9 = r8.K3
                if (r9 == 0) goto L68
                io.reactivex.j0$c r0 = r8.L3
                long r2 = r8.H3
                java.util.concurrent.TimeUnit r6 = r8.I3
                r4 = r2
                r1 = r8
                r1 = r8
                io.reactivex.disposables.c r8 = r0.d(r1, r2, r4, r6)
                r7 = 4
                r1.N3 = r8
            L68:
                return
            L69:
                r0 = move-exception
                r1 = r8
                r1 = r8
            L6c:
                r8 = r0
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6f
                throw r8
            L6f:
                r0 = move-exception
                goto L6c
            L71:
                r0 = move-exception
                r1 = r8
                r8 = r0
                r7 = 0
                io.reactivex.exceptions.b.b(r8)
                r1.cancel()
                r7 = 0
                org.reactivestreams.v<? super V> r9 = r1.B3
                r7 = 4
                r9.onError(r8)
                return
            L83:
                r0 = move-exception
                r1 = r8
            L85:
                r9 = r0
            L86:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L89
                r7 = 5
                throw r9
            L89:
                r0 = move-exception
                r7 = 5
                goto L85
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.q.a.onNext(java.lang.Object):void");
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            j(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u10 = (U) io.reactivex.internal.functions.b.g(this.G3.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        U u11 = this.M3;
                        if (u11 != null && this.P3 == this.Q3) {
                            this.M3 = u10;
                            i(u11, false, this);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                cancel();
                this.B3.onError(th3);
            }
        }
    }

    static final class b<T, U extends Collection<? super T>> extends io.reactivex.internal.subscribers.n<T, U, U> implements org.reactivestreams.w, Runnable, io.reactivex.disposables.c {
        final Callable<U> G3;
        final long H3;
        final TimeUnit I3;
        final io.reactivex.j0 J3;
        org.reactivestreams.w K3;
        U L3;
        final AtomicReference<io.reactivex.disposables.c> M3;

        b(org.reactivestreams.v<? super U> vVar, Callable<U> callable, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            super(vVar, new io.reactivex.internal.queue.a());
            this.M3 = new AtomicReference<>();
            this.G3 = callable;
            this.H3 = j10;
            this.I3 = timeUnit;
            this.J3 = j0Var;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.D3 = true;
            this.K3.cancel();
            io.reactivex.internal.disposables.d.b(this.M3);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.M3.get() == io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.K3, wVar)) {
                this.K3 = wVar;
                try {
                    this.L3 = (U) io.reactivex.internal.functions.b.g(this.G3.call(), "The supplied buffer is null");
                    this.B3.l(this);
                    if (this.D3) {
                        return;
                    }
                    wVar.request(Long.MAX_VALUE);
                    io.reactivex.j0 j0Var = this.J3;
                    long j10 = this.H3;
                    io.reactivex.disposables.c cVarG = j0Var.g(this, j10, j10, this.I3);
                    if (androidx.compose.animation.core.z1.a(this.M3, null, cVarG)) {
                        return;
                    }
                    cVarG.dispose();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cancel();
                    io.reactivex.internal.subscriptions.g.c(th2, this.B3);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.n, io.reactivex.internal.util.u
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean f(org.reactivestreams.v<? super U> vVar, U u10) {
            this.B3.onNext((Object) u10);
            return true;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            io.reactivex.internal.disposables.d.b(this.M3);
            synchronized (this) {
                try {
                    U u10 = this.L3;
                    if (u10 == null) {
                        return;
                    }
                    this.L3 = null;
                    this.C3.offer(u10);
                    this.E3 = true;
                    if (b()) {
                        io.reactivex.internal.util.v.e(this.C3, this.B3, false, null, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.M3);
            synchronized (this) {
                this.L3 = null;
            }
            this.B3.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    U u10 = this.L3;
                    if (u10 != null) {
                        u10.add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            j(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u10 = (U) io.reactivex.internal.functions.b.g(this.G3.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        U u11 = this.L3;
                        if (u11 == null) {
                            return;
                        }
                        this.L3 = u10;
                        h(u11, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                cancel();
                this.B3.onError(th3);
            }
        }
    }

    static final class c<T, U extends Collection<? super T>> extends io.reactivex.internal.subscribers.n<T, U, U> implements org.reactivestreams.w, Runnable {
        final Callable<U> G3;
        final long H3;
        final long I3;
        final TimeUnit J3;
        final io.reactivex.j0.c K3;
        final List<U> L3;
        org.reactivestreams.w M3;

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final U f299995a;

            a(U u10) {
                this.f299995a = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.L3.remove(this.f299995a);
                }
                c cVar = c.this;
                cVar.i(this.f299995a, false, cVar.K3);
            }
        }

        c(org.reactivestreams.v<? super U> vVar, Callable<U> callable, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0.c cVar) {
            super(vVar, new io.reactivex.internal.queue.a());
            this.G3 = callable;
            this.H3 = j10;
            this.I3 = j11;
            this.J3 = timeUnit;
            this.K3 = cVar;
            this.L3 = new LinkedList();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.D3 = true;
            this.M3.cancel();
            this.K3.dispose();
            o();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.M3, wVar)) {
                this.M3 = wVar;
                try {
                    Collection collection = (Collection) io.reactivex.internal.functions.b.g(this.G3.call(), "The supplied buffer is null");
                    this.L3.add((U) collection);
                    this.B3.l(this);
                    wVar.request(Long.MAX_VALUE);
                    io.reactivex.j0.c cVar = this.K3;
                    long j10 = this.I3;
                    cVar.d(this, j10, j10, this.J3);
                    this.K3.c(new a(collection), this.H3, this.J3);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.K3.dispose();
                    wVar.cancel();
                    io.reactivex.internal.subscriptions.g.c(th2, this.B3);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.subscribers.n, io.reactivex.internal.util.u
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean f(org.reactivestreams.v<? super U> vVar, U u10) {
            vVar.onNext(u10);
            return true;
        }

        void o() {
            synchronized (this) {
                this.L3.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.L3);
                this.L3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.C3.offer((U) ((Collection) it.next()));
            }
            this.E3 = true;
            if (b()) {
                io.reactivex.internal.util.v.e(this.C3, this.B3, false, this.K3, this);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.E3 = true;
            this.K3.dispose();
            o();
            this.B3.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.L3.iterator();
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
            j(j10);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.D3) {
                return;
            }
            try {
                Collection collection = (Collection) io.reactivex.internal.functions.b.g(this.G3.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        if (this.D3) {
                            return;
                        }
                        this.L3.add((U) collection);
                        this.K3.c(new a(collection), this.H3, this.J3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                cancel();
                this.B3.onError(th3);
            }
        }
    }

    public q(io.reactivex.l<T> lVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0 j0Var, Callable<U> callable, int i10, boolean z10) {
        super(lVar);
        this.f299988c = j10;
        this.f299989d = j11;
        this.f299990e = timeUnit;
        this.f299991f = j0Var;
        this.f299992g = callable;
        this.f299993h = i10;
        this.f299994i = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super U> vVar) {
        if (this.f299988c == this.f299989d && this.f299993h == Integer.MAX_VALUE) {
            this.f299043b.j6(new b(new io.reactivex.subscribers.e(vVar), this.f299992g, this.f299988c, this.f299990e, this.f299991f));
            return;
        }
        io.reactivex.j0.c cVarC = this.f299991f.c();
        if (this.f299988c == this.f299989d) {
            this.f299043b.j6(new a(new io.reactivex.subscribers.e(vVar), this.f299992g, this.f299988c, this.f299990e, this.f299993h, this.f299994i, cVarC));
        } else {
            this.f299043b.j6(new c(new io.reactivex.subscribers.e(vVar), this.f299992g, this.f299988c, this.f299989d, this.f299990e, cVarC));
        }
    }
}
