package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class f0<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.o<T> f299319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.b f299320c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f299321a;

        static {
            int[] iArr = new int[io.reactivex.b.values().length];
            f299321a = iArr;
            try {
                iArr[io.reactivex.b.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f299321a[io.reactivex.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f299321a[io.reactivex.b.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f299321a[io.reactivex.b.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static abstract class b<T> extends AtomicLong implements io.reactivex.n<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f299322c = 7326289992464377023L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f299324b = new io.reactivex.internal.disposables.h();

        b(org.reactivestreams.v<? super T> vVar) {
            this.f299323a = vVar;
        }

        @Override // io.reactivex.n
        public boolean a(Throwable th2) {
            return e(th2);
        }

        protected void b() {
            if (isCancelled()) {
                return;
            }
            try {
                this.f299323a.onComplete();
            } finally {
                this.f299324b.dispose();
            }
        }

        @Override // io.reactivex.n
        public final void c(dj.f fVar) {
            d(new io.reactivex.internal.disposables.b(fVar));
        }

        @Override // org.reactivestreams.w
        public final void cancel() {
            this.f299324b.dispose();
            g();
        }

        @Override // io.reactivex.n
        public final void d(io.reactivex.disposables.c cVar) {
            this.f299324b.b(cVar);
        }

        protected boolean e(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.f299323a.onError(th2);
                this.f299324b.dispose();
                return true;
            } catch (Throwable th3) {
                this.f299324b.dispose();
                throw th3;
            }
        }

        void f() {
        }

        void g() {
        }

        @Override // io.reactivex.n
        public final boolean isCancelled() {
            return this.f299324b.k();
        }

        @Override // io.reactivex.k
        public void onComplete() {
            b();
        }

        @Override // io.reactivex.k
        public final void onError(Throwable th2) {
            if (a(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // org.reactivestreams.w
        public final void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this, j10);
                f();
            }
        }

        @Override // io.reactivex.n
        public final long requested() {
            return get();
        }

        @Override // io.reactivex.n
        public final io.reactivex.n<T> serialize() {
            return new i(this);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    static final class c<T> extends b<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299325h = 2427151001689639875L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.queue.c<T> f299326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f299327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f299328f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicInteger f299329g;

        c(org.reactivestreams.v<? super T> vVar, int i10) {
            super(vVar);
            this.f299326d = new io.reactivex.internal.queue.c<>(i10);
            this.f299329g = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.f0.b, io.reactivex.n
        public boolean a(Throwable th2) {
            if (this.f299328f || isCancelled()) {
                return false;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f299327e = th2;
            this.f299328f = true;
            h();
            return true;
        }

        @Override // io.reactivex.internal.operators.flowable.f0.b
        void f() {
            h();
        }

        @Override // io.reactivex.internal.operators.flowable.f0.b
        void g() {
            if (this.f299329g.getAndIncrement() == 0) {
                this.f299326d.clear();
            }
        }

        void h() {
            if (this.f299329g.getAndIncrement() == 0) {
                org.reactivestreams.v<? super T> vVar = this.f299323a;
                io.reactivex.internal.queue.c<T> cVar = this.f299326d;
                int iAddAndGet = 1;
                do {
                    long j10 = get();
                    long j11 = 0;
                    while (j11 != j10) {
                        if (isCancelled()) {
                            cVar.clear();
                            return;
                        }
                        boolean z10 = this.f299328f;
                        T tPoll = cVar.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            Throwable th2 = this.f299327e;
                            if (th2 != null) {
                                e(th2);
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                        if (z11) {
                            break;
                        }
                        vVar.onNext(tPoll);
                        j11++;
                    }
                    if (j11 == j10) {
                        if (isCancelled()) {
                            cVar.clear();
                            return;
                        }
                        boolean z12 = this.f299328f;
                        boolean zIsEmpty = cVar.isEmpty();
                        if (z12 && zIsEmpty) {
                            Throwable th3 = this.f299327e;
                            if (th3 != null) {
                                e(th3);
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                    }
                    if (j11 != 0) {
                        io.reactivex.internal.util.d.e(this, j11);
                    }
                    iAddAndGet = this.f299329g.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.f0.b, io.reactivex.k
        public void onComplete() {
            this.f299328f = true;
            h();
        }

        @Override // io.reactivex.k
        public void onNext(T t10) {
            if (this.f299328f || isCancelled()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f299326d.offer(t10);
                h();
            }
        }
    }

    static final class d<T> extends h<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299330e = 8360058422307496563L;

        d(org.reactivestreams.v<? super T> vVar) {
            super(vVar);
        }

        @Override // io.reactivex.internal.operators.flowable.f0.h
        void h() {
        }
    }

    static final class e<T> extends h<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299331e = 338953216916120960L;

        e(org.reactivestreams.v<? super T> vVar) {
            super(vVar);
        }

        @Override // io.reactivex.internal.operators.flowable.f0.h
        void h() {
            onError(new io.reactivex.exceptions.c("create: could not emit value due to lack of requests"));
        }
    }

    static final class f<T> extends b<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299332h = 4023437720691792495L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<T> f299333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f299334e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f299335f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicInteger f299336g;

        f(org.reactivestreams.v<? super T> vVar) {
            super(vVar);
            this.f299333d = new AtomicReference<>();
            this.f299336g = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.f0.b, io.reactivex.n
        public boolean a(Throwable th2) {
            if (this.f299335f || isCancelled()) {
                return false;
            }
            if (th2 == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f299334e = th2;
            this.f299335f = true;
            h();
            return true;
        }

        @Override // io.reactivex.internal.operators.flowable.f0.b
        void f() {
            h();
        }

        @Override // io.reactivex.internal.operators.flowable.f0.b
        void g() {
            if (this.f299336g.getAndIncrement() == 0) {
                this.f299333d.lazySet(null);
            }
        }

        void h() {
            if (this.f299336g.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super T> vVar = this.f299323a;
            AtomicReference<T> atomicReference = this.f299333d;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z10 = this.f299335f;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f299334e;
                        if (th2 != null) {
                            e(th2);
                            return;
                        } else {
                            b();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    vVar.onNext(andSet);
                    j11++;
                }
                if (j11 == j10) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z12 = this.f299335f;
                    boolean z13 = atomicReference.get() == null;
                    if (z12 && z13) {
                        Throwable th3 = this.f299334e;
                        if (th3 != null) {
                            e(th3);
                            return;
                        } else {
                            b();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    io.reactivex.internal.util.d.e(this, j11);
                }
                iAddAndGet = this.f299336g.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.f0.b, io.reactivex.k
        public void onComplete() {
            this.f299335f = true;
            h();
        }

        @Override // io.reactivex.k
        public void onNext(T t10) {
            if (this.f299335f || isCancelled()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f299333d.set(t10);
                h();
            }
        }
    }

    static final class g<T> extends b<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f299337d = 3776720187248809713L;

        g(org.reactivestreams.v<? super T> vVar) {
            super(vVar);
        }

        @Override // io.reactivex.k
        public void onNext(T t10) {
            long j10;
            if (!isCancelled()) {
                if (t10 == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f299323a.onNext(t10);
                do {
                    j10 = get();
                    if (j10 == 0) {
                        break;
                    }
                } while (!compareAndSet(j10, j10 - 1));
            }
        }
    }

    static abstract class h<T> extends b<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f299338d = 4127754106204442833L;

        h(org.reactivestreams.v<? super T> vVar) {
            super(vVar);
        }

        abstract void h();

        @Override // io.reactivex.k
        public final void onNext(T t10) {
            if (isCancelled()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                h();
            } else {
                this.f299323a.onNext(t10);
                io.reactivex.internal.util.d.e(this, 1L);
            }
        }
    }

    static final class i<T> extends AtomicInteger implements io.reactivex.n<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299339e = 4883307006032401862L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T> f299340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.util.c f299341b = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ej.n<T> f299342c = new io.reactivex.internal.queue.c(16);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f299343d;

        i(b<T> bVar) {
            this.f299340a = bVar;
        }

        @Override // io.reactivex.n
        public boolean a(Throwable th2) {
            if (!this.f299340a.isCancelled() && !this.f299343d) {
                if (th2 == null) {
                    th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f299341b.a(th2)) {
                    this.f299343d = true;
                    b();
                    return true;
                }
            }
            return false;
        }

        void b() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        @Override // io.reactivex.n
        public void c(dj.f fVar) {
            this.f299340a.c(fVar);
        }

        @Override // io.reactivex.n
        public void d(io.reactivex.disposables.c cVar) {
            this.f299340a.d(cVar);
        }

        void e() {
            b<T> bVar = this.f299340a;
            ej.n<T> nVar = this.f299342c;
            io.reactivex.internal.util.c cVar = this.f299341b;
            int iAddAndGet = 1;
            while (!bVar.isCancelled()) {
                if (cVar.get() != null) {
                    nVar.clear();
                    bVar.onError(cVar.c());
                    return;
                }
                boolean z10 = this.f299343d;
                T tPoll = nVar.poll();
                boolean z11 = tPoll == null;
                if (z10 && z11) {
                    bVar.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    bVar.onNext(tPoll);
                }
            }
            nVar.clear();
        }

        @Override // io.reactivex.n
        public boolean isCancelled() {
            return this.f299340a.isCancelled();
        }

        @Override // io.reactivex.k
        public void onComplete() {
            if (this.f299340a.isCancelled() || this.f299343d) {
                return;
            }
            this.f299343d = true;
            b();
        }

        @Override // io.reactivex.k
        public void onError(Throwable th2) {
            if (a(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (decrementAndGet() == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            if (getAndIncrement() != 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        
            e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        
            return;
         */
        @Override // io.reactivex.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onNext(T r4) {
            /*
                r3 = this;
                r2 = 6
                io.reactivex.internal.operators.flowable.f0$b<T> r0 = r3.f299340a
                boolean r0 = r0.isCancelled()
                if (r0 != 0) goto L4f
                boolean r0 = r3.f299343d
                if (r0 == 0) goto Le
                goto L4f
            Le:
                r2 = 0
                if (r4 != 0) goto L1d
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r2 = 6
                r4.<init>(r0)
                r3.onError(r4)
                return
            L1d:
                int r0 = r3.get()
                if (r0 != 0) goto L39
                r0 = 0
                r1 = 1
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L39
                io.reactivex.internal.operators.flowable.f0$b<T> r0 = r3.f299340a
                r2 = 0
                r0.onNext(r4)
                int r4 = r3.decrementAndGet()
                r2 = 5
                if (r4 != 0) goto L47
                goto L4f
            L39:
                ej.n<T> r0 = r3.f299342c
                monitor-enter(r0)
                r0.offer(r4)     // Catch: java.lang.Throwable -> L4c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
                int r4 = r3.getAndIncrement()
                if (r4 == 0) goto L47
                goto L4f
            L47:
                r3.e()
                r2 = 6
                return
            L4c:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
                throw r3
            L4f:
                r2 = 4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.f0.i.onNext(java.lang.Object):void");
        }

        @Override // io.reactivex.n
        public long requested() {
            return this.f299340a.requested();
        }

        @Override // io.reactivex.n
        public io.reactivex.n<T> serialize() {
            return this;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.f299340a.toString();
        }
    }

    public f0(io.reactivex.o<T> oVar, io.reactivex.b bVar) {
        this.f299319b = oVar;
        this.f299320c = bVar;
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
    public void k6(org.reactivestreams.v<? super T> vVar) {
        b gVar;
        int i10 = a.f299321a[this.f299320c.ordinal()];
        if (i10 == 1) {
            gVar = new g(vVar);
        } else if (i10 == 2) {
            gVar = new e(vVar);
        } else if (i10 != 3) {
            gVar = i10 != 4 ? new c(vVar, io.reactivex.l.Y()) : new f(vVar);
        } else {
            gVar = new d(vVar);
        }
        vVar.l(gVar);
        try {
            this.f299319b.a(gVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            gVar.onError(th2);
        }
    }
}
