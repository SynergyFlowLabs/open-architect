package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class i4<T> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.b0<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f301733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f301734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f301735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f301736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f301737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f301738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f301739h;

    static final class a<T> extends io.reactivex.internal.observers.v<T, Object, io.reactivex.b0<T>> implements io.reactivex.disposables.c {
        io.reactivex.subjects.j<T> A3;
        volatile boolean B3;
        final AtomicReference<io.reactivex.disposables.c> C3;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        final long f301740q3;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        final TimeUnit f301741r3;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        final io.reactivex.j0 f301742s3;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        final int f301743t3;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        final boolean f301744u3;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        final long f301745v3;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        final io.reactivex.j0.c f301746w3;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        long f301747x3;

        /* JADX INFO: renamed from: y3, reason: collision with root package name */
        long f301748y3;

        /* JADX INFO: renamed from: z3, reason: collision with root package name */
        io.reactivex.disposables.c f301749z3;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.i4$a$a, reason: collision with other inner class name */
        static final class RunnableC2174a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final long f301750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final a<?> f301751b;

            RunnableC2174a(long j10, a<?> aVar) {
                this.f301750a = j10;
                this.f301751b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a<?> aVar = this.f301751b;
                if (((io.reactivex.internal.observers.v) aVar).f298802n3) {
                    aVar.B3 = true;
                    aVar.m();
                } else {
                    ((io.reactivex.internal.observers.v) aVar).f298801m3.offer(this);
                }
                if (aVar.b()) {
                    aVar.n();
                }
            }
        }

        a(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10, long j11, boolean z10) {
            super(i0Var, new io.reactivex.internal.queue.a());
            this.C3 = new AtomicReference<>();
            this.f301740q3 = j10;
            this.f301741r3 = timeUnit;
            this.f301742s3 = j0Var;
            this.f301743t3 = i10;
            this.f301745v3 = j11;
            this.f301744u3 = z10;
            if (z10) {
                this.f301746w3 = j0Var.c();
            } else {
                this.f301746w3 = null;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.disposables.c cVarG;
            if (io.reactivex.internal.disposables.d.q(this.f301749z3, cVar)) {
                this.f301749z3 = cVar;
                io.reactivex.i0<? super V> i0Var = this.f298800l3;
                i0Var.d(this);
                if (this.f298802n3) {
                    return;
                }
                io.reactivex.subjects.j<T> jVarN8 = io.reactivex.subjects.j.n8(this.f301743t3);
                this.A3 = jVarN8;
                i0Var.onNext(jVarN8);
                RunnableC2174a runnableC2174a = new RunnableC2174a(this.f301748y3, this);
                if (this.f301744u3) {
                    io.reactivex.j0.c cVar2 = this.f301746w3;
                    long j10 = this.f301740q3;
                    cVarG = cVar2.d(runnableC2174a, j10, j10, this.f301741r3);
                } else {
                    io.reactivex.j0 j0Var = this.f301742s3;
                    long j11 = this.f301740q3;
                    cVarG = j0Var.g(runnableC2174a, j11, j11, this.f301741r3);
                }
                io.reactivex.internal.disposables.d.d(this.C3, cVarG);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f298802n3 = true;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298802n3;
        }

        void m() {
            io.reactivex.internal.disposables.d.b(this.C3);
            io.reactivex.j0.c cVar = this.f301746w3;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.j<T>] */
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
        void n() {
            io.reactivex.internal.queue.a aVar = (io.reactivex.internal.queue.a) this.f298801m3;
            io.reactivex.i0<? super V> i0Var = this.f298800l3;
            io.reactivex.subjects.j<T> jVar = this.A3;
            int iA = 1;
            while (!this.B3) {
                boolean z10 = this.f298803o3;
                Object objPoll = aVar.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof RunnableC2174a;
                if (z10 && (z11 || z12)) {
                    this.A3 = null;
                    aVar.clear();
                    m();
                    Throwable th2 = this.f298804p3;
                    if (th2 != null) {
                        jVar.onError(th2);
                        return;
                    } else {
                        jVar.onComplete();
                        return;
                    }
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (z12) {
                    RunnableC2174a runnableC2174a = (RunnableC2174a) objPoll;
                    if (this.f301744u3 || this.f301748y3 == runnableC2174a.f301750a) {
                        jVar.onComplete();
                        this.f301747x3 = 0L;
                        jVar = (io.reactivex.subjects.j<T>) io.reactivex.subjects.j.n8(this.f301743t3);
                        this.A3 = jVar;
                        i0Var.onNext(jVar);
                    }
                } else {
                    jVar.onNext(io.reactivex.internal.util.q.r(objPoll));
                    long j10 = this.f301747x3 + 1;
                    if (j10 >= this.f301745v3) {
                        this.f301748y3++;
                        this.f301747x3 = 0L;
                        jVar.onComplete();
                        jVar = (io.reactivex.subjects.j<T>) io.reactivex.subjects.j.n8(this.f301743t3);
                        this.A3 = jVar;
                        this.f298800l3.onNext(jVar);
                        if (this.f301744u3) {
                            io.reactivex.disposables.c cVar = this.C3.get();
                            cVar.dispose();
                            io.reactivex.j0.c cVar2 = this.f301746w3;
                            RunnableC2174a runnableC2174a2 = new RunnableC2174a(this.f301748y3, this);
                            long j11 = this.f301740q3;
                            io.reactivex.disposables.c cVarD = cVar2.d(runnableC2174a2, j11, j11, this.f301741r3);
                            if (!androidx.compose.animation.core.z1.a(this.C3, cVar, cVarD)) {
                                cVarD.dispose();
                            }
                        }
                    } else {
                        this.f301747x3 = j10;
                    }
                }
            }
            this.f301749z3.dispose();
            aVar.clear();
            m();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f298803o3 = true;
            if (b()) {
                n();
            }
            this.f298800l3.onComplete();
            m();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f298804p3 = th2;
            this.f298803o3 = true;
            if (b()) {
                n();
            }
            this.f298800l3.onError(th2);
            m();
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
        
            if (b() == false) goto L18;
         */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onNext(T r9) {
            /*
                r8 = this;
                r7 = 7
                boolean r0 = r8.B3
                if (r0 == 0) goto L7
                goto L8b
            L7:
                boolean r0 = r8.g()
                r7 = 4
                if (r0 == 0) goto L7c
                r7 = 3
                io.reactivex.subjects.j<T> r0 = r8.A3
                r7 = 2
                r0.onNext(r9)
                long r1 = r8.f301747x3
                r3 = 1
                r7 = 0
                long r1 = r1 + r3
                r7 = 2
                long r5 = r8.f301745v3
                r7 = 5
                int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                r7 = 2
                if (r9 < 0) goto L70
                long r1 = r8.f301748y3
                long r1 = r1 + r3
                r8.f301748y3 = r1
                r7 = 5
                r1 = 0
                r1 = 0
                r8.f301747x3 = r1
                r7 = 7
                r0.onComplete()
                r7 = 3
                int r9 = r8.f301743t3
                r7 = 1
                io.reactivex.subjects.j r9 = io.reactivex.subjects.j.n8(r9)
                r7 = 7
                r8.A3 = r9
                io.reactivex.i0<? super V> r0 = r8.f298800l3
                r0.onNext(r9)
                boolean r9 = r8.f301744u3
                if (r9 == 0) goto L72
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.c> r9 = r8.C3
                java.lang.Object r9 = r9.get()
                io.reactivex.disposables.c r9 = (io.reactivex.disposables.c) r9
                r7 = 5
                r9.dispose()
                io.reactivex.j0$c r0 = r8.f301746w3
                io.reactivex.internal.operators.observable.i4$a$a r1 = new io.reactivex.internal.operators.observable.i4$a$a
                r7 = 4
                long r2 = r8.f301748y3
                r7 = 6
                r1.<init>(r2, r8)
                r7 = 0
                long r2 = r8.f301740q3
                java.util.concurrent.TimeUnit r6 = r8.f301741r3
                r4 = r2
                io.reactivex.disposables.c r9 = r0.d(r1, r2, r4, r6)
                r7 = 0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.c> r0 = r8.C3
                io.reactivex.internal.disposables.d.d(r0, r9)
                goto L72
            L70:
                r8.f301747x3 = r1
            L72:
                r7 = 4
                r9 = -1
                int r9 = r8.a(r9)
                if (r9 != 0) goto L8d
                r7 = 6
                goto L8b
            L7c:
                ej.n<U> r0 = r8.f298801m3
                java.lang.Object r9 = io.reactivex.internal.util.q.x(r9)
                r0.offer(r9)
                boolean r9 = r8.b()
                if (r9 != 0) goto L8d
            L8b:
                r7 = 3
                return
            L8d:
                r7 = 2
                r8.n()
                r7 = 5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.i4.a.onNext(java.lang.Object):void");
        }
    }

    static final class b<T> extends io.reactivex.internal.observers.v<T, Object, io.reactivex.b0<T>> implements io.reactivex.i0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: y3, reason: collision with root package name */
        static final Object f301752y3 = new Object();

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        final long f301753q3;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        final TimeUnit f301754r3;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        final io.reactivex.j0 f301755s3;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        final int f301756t3;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        io.reactivex.disposables.c f301757u3;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        io.reactivex.subjects.j<T> f301758v3;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301759w3;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        volatile boolean f301760x3;

        b(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10) {
            super(i0Var, new io.reactivex.internal.queue.a());
            this.f301759w3 = new AtomicReference<>();
            this.f301753q3 = j10;
            this.f301754r3 = timeUnit;
            this.f301755s3 = j0Var;
            this.f301756t3 = i10;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301757u3, cVar)) {
                this.f301757u3 = cVar;
                this.f301758v3 = io.reactivex.subjects.j.n8(this.f301756t3);
                io.reactivex.i0<? super V> i0Var = this.f298800l3;
                i0Var.d(this);
                i0Var.onNext(this.f301758v3);
                if (this.f298802n3) {
                    return;
                }
                io.reactivex.j0 j0Var = this.f301755s3;
                long j10 = this.f301753q3;
                io.reactivex.internal.disposables.d.d(this.f301759w3, j0Var.g(this, j10, j10, this.f301754r3));
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f298802n3 = true;
        }

        void j() {
            io.reactivex.internal.disposables.d.b(this.f301759w3);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298802n3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.j<T>] */
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
        void l() {
            io.reactivex.internal.queue.a aVar = (io.reactivex.internal.queue.a) this.f298801m3;
            io.reactivex.i0<? super V> i0Var = this.f298800l3;
            io.reactivex.subjects.j<T> jVar = this.f301758v3;
            int iA = 1;
            while (true) {
                boolean z10 = this.f301760x3;
                boolean z11 = this.f298803o3;
                Object objPoll = aVar.poll();
                if (z11 && (objPoll == null || objPoll == f301752y3)) {
                    break;
                }
                if (objPoll == null) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (objPoll == f301752y3) {
                    jVar.onComplete();
                    if (z10) {
                        this.f301757u3.dispose();
                    } else {
                        jVar = (io.reactivex.subjects.j<T>) io.reactivex.subjects.j.n8(this.f301756t3);
                        this.f301758v3 = jVar;
                        i0Var.onNext(jVar);
                    }
                } else {
                    jVar.onNext(io.reactivex.internal.util.q.r(objPoll));
                }
            }
            this.f301758v3 = null;
            aVar.clear();
            j();
            Throwable th2 = this.f298804p3;
            if (th2 != null) {
                jVar.onError(th2);
            } else {
                jVar.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f298803o3 = true;
            if (b()) {
                l();
            }
            j();
            this.f298800l3.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f298804p3 = th2;
            this.f298803o3 = true;
            if (b()) {
                l();
            }
            j();
            this.f298800l3.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301760x3) {
                return;
            }
            if (g()) {
                this.f301758v3.onNext(t10);
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.f298801m3.offer((U) io.reactivex.internal.util.q.x(t10));
                if (!b()) {
                    return;
                }
            }
            l();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f298802n3) {
                this.f301760x3 = true;
                j();
            }
            this.f298801m3.offer((U) f301752y3);
            if (b()) {
                l();
            }
        }
    }

    static final class c<T> extends io.reactivex.internal.observers.v<T, Object, io.reactivex.b0<T>> implements io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        final long f301761q3;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        final long f301762r3;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        final TimeUnit f301763s3;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        final io.reactivex.j0.c f301764t3;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        final int f301765u3;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        final List<io.reactivex.subjects.j<T>> f301766v3;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        io.reactivex.disposables.c f301767w3;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        volatile boolean f301768x3;

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final io.reactivex.subjects.j<T> f301769a;

            a(io.reactivex.subjects.j<T> jVar) {
                this.f301769a = jVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.j(this.f301769a);
            }
        }

        static final class b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.subjects.j<T> f301771a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final boolean f301772b;

            b(io.reactivex.subjects.j<T> jVar, boolean z10) {
                this.f301771a = jVar;
                this.f301772b = z10;
            }
        }

        c(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0.c cVar, int i10) {
            super(i0Var, new io.reactivex.internal.queue.a());
            this.f301761q3 = j10;
            this.f301762r3 = j11;
            this.f301763s3 = timeUnit;
            this.f301764t3 = cVar;
            this.f301765u3 = i10;
            this.f301766v3 = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301767w3, cVar)) {
                this.f301767w3 = cVar;
                this.f298800l3.d(this);
                if (this.f298802n3) {
                    return;
                }
                io.reactivex.subjects.j<T> jVarN8 = io.reactivex.subjects.j.n8(this.f301765u3);
                this.f301766v3.add(jVarN8);
                this.f298800l3.onNext(jVarN8);
                this.f301764t3.c(new a(jVarN8), this.f301761q3, this.f301763s3);
                io.reactivex.j0.c cVar2 = this.f301764t3;
                long j10 = this.f301762r3;
                cVar2.d(this, j10, j10, this.f301763s3);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f298802n3 = true;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void j(io.reactivex.subjects.j<T> jVar) {
            this.f298801m3.offer((U) new b(jVar, false));
            if (b()) {
                m();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298802n3;
        }

        void l() {
            this.f301764t3.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void m() {
            io.reactivex.internal.queue.a aVar = (io.reactivex.internal.queue.a) this.f298801m3;
            io.reactivex.i0<? super V> i0Var = this.f298800l3;
            List<io.reactivex.subjects.j<T>> list = this.f301766v3;
            int iA = 1;
            while (!this.f301768x3) {
                boolean z10 = this.f298803o3;
                Object objPoll = aVar.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof b;
                if (z10 && (z11 || z12)) {
                    aVar.clear();
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
                    l();
                    list.clear();
                    return;
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (z12) {
                    b bVar = (b) objPoll;
                    if (!bVar.f301772b) {
                        list.remove(bVar.f301771a);
                        bVar.f301771a.onComplete();
                        if (list.isEmpty() && this.f298802n3) {
                            this.f301768x3 = true;
                        }
                    } else if (!this.f298802n3) {
                        io.reactivex.subjects.j<T> jVarN8 = io.reactivex.subjects.j.n8(this.f301765u3);
                        list.add(jVarN8);
                        i0Var.onNext(jVarN8);
                        this.f301764t3.c(new a(jVarN8), this.f301761q3, this.f301763s3);
                    }
                } else {
                    Iterator<io.reactivex.subjects.j<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.f301767w3.dispose();
            l();
            aVar.clear();
            list.clear();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f298803o3 = true;
            if (b()) {
                m();
            }
            this.f298800l3.onComplete();
            l();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f298804p3 = th2;
            this.f298803o3 = true;
            if (b()) {
                m();
            }
            this.f298800l3.onError(th2);
            l();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (g()) {
                Iterator<io.reactivex.subjects.j<T>> it = this.f301766v3.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.f298801m3.offer((U) t10);
                if (!b()) {
                    return;
                }
            }
            m();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object bVar = new b(io.reactivex.subjects.j.n8(this.f301765u3), true);
            if (!this.f298802n3) {
                this.f298801m3.offer((U) bVar);
            }
            if (b()) {
                m();
            }
        }
    }

    public i4(io.reactivex.g0<T> g0Var, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0 j0Var, long j12, int i10, boolean z10) {
        super(g0Var);
        this.f301733b = j10;
        this.f301734c = j11;
        this.f301735d = timeUnit;
        this.f301736e = j0Var;
        this.f301737f = j12;
        this.f301738g = i10;
        this.f301739h = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var) {
        io.reactivex.observers.m mVar = new io.reactivex.observers.m(i0Var);
        long j10 = this.f301733b;
        long j11 = this.f301734c;
        if (j10 != j11) {
            this.f301291a.a(new c(mVar, j10, j11, this.f301735d, this.f301736e.c(), this.f301738g));
            return;
        }
        long j12 = this.f301737f;
        if (j12 == Long.MAX_VALUE) {
            this.f301291a.a(new b(mVar, this.f301733b, this.f301735d, this.f301736e, this.f301738g));
        } else {
            this.f301291a.a(new a(mVar, j10, this.f301735d, this.f301736e, this.f301738g, j12, this.f301739h));
        }
    }
}
