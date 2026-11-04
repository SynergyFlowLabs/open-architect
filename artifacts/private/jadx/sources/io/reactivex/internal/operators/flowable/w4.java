package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class w4<T> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.l<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f300466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f300467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f300468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.j0 f300469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f300470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f300471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f300472i;

    static final class a<T> extends io.reactivex.internal.subscribers.n<T, Object, io.reactivex.l<T>> implements org.reactivestreams.w {
        final long G3;
        final TimeUnit H3;
        final io.reactivex.j0 I3;
        final int J3;
        final boolean K3;
        final long L3;
        final io.reactivex.j0.c M3;
        long N3;
        long O3;
        org.reactivestreams.w P3;
        io.reactivex.processors.h<T> Q3;
        volatile boolean R3;
        final io.reactivex.internal.disposables.h S3;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.w4$a$a, reason: collision with other inner class name */
        static final class RunnableC2143a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final long f300473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final a<?> f300474b;

            RunnableC2143a(long j10, a<?> aVar) {
                this.f300473a = j10;
                this.f300474b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a<?> aVar = this.f300474b;
                if (((io.reactivex.internal.subscribers.n) aVar).D3) {
                    aVar.R3 = true;
                    aVar.dispose();
                } else {
                    ((io.reactivex.internal.subscribers.n) aVar).C3.offer(this);
                }
                if (aVar.b()) {
                    aVar.o();
                }
            }
        }

        a(org.reactivestreams.v<? super io.reactivex.l<T>> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10, long j11, boolean z10) {
            super(vVar, new io.reactivex.internal.queue.a());
            this.S3 = new io.reactivex.internal.disposables.h();
            this.G3 = j10;
            this.H3 = timeUnit;
            this.I3 = j0Var;
            this.J3 = i10;
            this.L3 = j11;
            this.K3 = z10;
            if (z10) {
                this.M3 = j0Var.c();
            } else {
                this.M3 = null;
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.D3 = true;
        }

        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.S3);
            io.reactivex.j0.c cVar = this.M3;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.disposables.c cVarG;
            if (io.reactivex.internal.subscriptions.j.q(this.P3, wVar)) {
                this.P3 = wVar;
                org.reactivestreams.v<? super V> vVar = this.B3;
                vVar.l(this);
                if (this.D3) {
                    return;
                }
                io.reactivex.processors.h<T> hVarT8 = io.reactivex.processors.h.T8(this.J3);
                this.Q3 = hVarT8;
                long jRequested = requested();
                if (jRequested == 0) {
                    this.D3 = true;
                    wVar.cancel();
                    vVar.onError(new io.reactivex.exceptions.c("Could not deliver initial window due to lack of requests."));
                    return;
                }
                vVar.onNext(hVarT8);
                if (jRequested != Long.MAX_VALUE) {
                    d(1L);
                }
                RunnableC2143a runnableC2143a = new RunnableC2143a(this.O3, this);
                if (this.K3) {
                    io.reactivex.j0.c cVar = this.M3;
                    long j10 = this.G3;
                    cVarG = cVar.d(runnableC2143a, j10, j10, this.H3);
                } else {
                    io.reactivex.j0 j0Var = this.I3;
                    long j11 = this.G3;
                    cVarG = j0Var.g(runnableC2143a, j11, j11, this.H3);
                }
                if (this.S3.a(cVarG)) {
                    wVar.request(Long.MAX_VALUE);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        void o() {
            io.reactivex.processors.h<T> hVarT8;
            ej.o oVar = this.C3;
            org.reactivestreams.v<? super V> vVar = this.B3;
            io.reactivex.processors.h<T> hVar = this.Q3;
            int iA = 1;
            while (!this.R3) {
                boolean z10 = this.E3;
                Object objPoll = oVar.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof RunnableC2143a;
                if (z10 && (z11 || z12)) {
                    this.Q3 = null;
                    oVar.clear();
                    Throwable th2 = this.F3;
                    if (th2 != null) {
                        ((io.reactivex.processors.h) hVar).onError(th2);
                    } else {
                        ((io.reactivex.processors.h) hVar).onComplete();
                    }
                    dispose();
                    return;
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else {
                    int i10 = iA;
                    if (z12) {
                        RunnableC2143a runnableC2143a = (RunnableC2143a) objPoll;
                        if (this.K3 || this.O3 == runnableC2143a.f300473a) {
                            hVar = hVar;
                            ((io.reactivex.processors.h) hVar).onComplete();
                            this.N3 = 0L;
                            hVarT8 = io.reactivex.processors.h.T8(this.J3);
                            this.Q3 = hVarT8;
                            long jRequested = requested();
                            if (jRequested == 0) {
                                this.Q3 = null;
                                this.C3.clear();
                                this.P3.cancel();
                                vVar.onError(new io.reactivex.exceptions.c("Could not deliver first window due to lack of requests."));
                                dispose();
                                return;
                            }
                            vVar.onNext(hVarT8);
                            if (jRequested != Long.MAX_VALUE) {
                                hVar = hVarT8;
                                d(1L);
                                hVar = hVarT8;
                            }
                        }
                    } else {
                        ((io.reactivex.processors.h) hVar).onNext(io.reactivex.internal.util.q.r(objPoll));
                        long j10 = this.N3 + 1;
                        if (j10 >= this.L3) {
                            this.O3++;
                            this.N3 = 0L;
                            ((io.reactivex.processors.h) hVar).onComplete();
                            long jRequested2 = requested();
                            if (jRequested2 == 0) {
                                this.Q3 = null;
                                this.P3.cancel();
                                this.B3.onError(new io.reactivex.exceptions.c("Could not deliver window due to lack of requests"));
                                dispose();
                                return;
                            }
                            io.reactivex.processors.h<T> hVarT9 = io.reactivex.processors.h.T8(this.J3);
                            this.Q3 = hVarT9;
                            this.B3.onNext(hVarT9);
                            if (jRequested2 != Long.MAX_VALUE) {
                                d(1L);
                            }
                            hVar = hVarT9;
                            if (this.K3) {
                                this.S3.get().dispose();
                                io.reactivex.j0.c cVar = this.M3;
                                RunnableC2143a runnableC2143a2 = new RunnableC2143a(this.O3, this);
                                long j11 = this.G3;
                                this.S3.a(cVar.d(runnableC2143a2, j11, j11, this.H3));
                                hVar = hVarT9;
                            }
                        } else {
                            this.N3 = j10;
                            hVar = hVar;
                        }
                    }
                    hVar = hVarT8;
                    hVar = hVar;
                    iA = i10;
                }
            }
            this.P3.cancel();
            oVar.clear();
            dispose();
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.E3 = true;
            if (b()) {
                o();
            }
            this.B3.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.F3 = th2;
            this.E3 = true;
            if (b()) {
                o();
            }
            this.B3.onError(th2);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.R3) {
                return;
            }
            if (g()) {
                io.reactivex.processors.h<T> hVar = this.Q3;
                hVar.onNext(t10);
                long j10 = this.N3 + 1;
                if (j10 >= this.L3) {
                    this.O3++;
                    this.N3 = 0L;
                    hVar.onComplete();
                    long jRequested = requested();
                    if (jRequested == 0) {
                        this.Q3 = null;
                        this.P3.cancel();
                        this.B3.onError(new io.reactivex.exceptions.c("Could not deliver window due to lack of requests"));
                        dispose();
                        return;
                    }
                    io.reactivex.processors.h<T> hVarT8 = io.reactivex.processors.h.T8(this.J3);
                    this.Q3 = hVarT8;
                    this.B3.onNext(hVarT8);
                    if (jRequested != Long.MAX_VALUE) {
                        d(1L);
                    }
                    if (this.K3) {
                        this.S3.get().dispose();
                        io.reactivex.j0.c cVar = this.M3;
                        RunnableC2143a runnableC2143a = new RunnableC2143a(this.O3, this);
                        long j11 = this.G3;
                        this.S3.a(cVar.d(runnableC2143a, j11, j11, this.H3));
                    }
                } else {
                    this.N3 = j10;
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.C3.offer((U) io.reactivex.internal.util.q.x(t10));
                if (!b()) {
                    return;
                }
            }
            o();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            j(j10);
        }
    }

    static final class b<T> extends io.reactivex.internal.subscribers.n<T, Object, io.reactivex.l<T>> implements io.reactivex.q<T>, org.reactivestreams.w, Runnable {
        static final Object O3 = new Object();
        final long G3;
        final TimeUnit H3;
        final io.reactivex.j0 I3;
        final int J3;
        org.reactivestreams.w K3;
        io.reactivex.processors.h<T> L3;
        final io.reactivex.internal.disposables.h M3;
        volatile boolean N3;

        b(org.reactivestreams.v<? super io.reactivex.l<T>> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10) {
            super(vVar, new io.reactivex.internal.queue.a());
            this.M3 = new io.reactivex.internal.disposables.h();
            this.G3 = j10;
            this.H3 = timeUnit;
            this.I3 = j0Var;
            this.J3 = i10;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.D3 = true;
        }

        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.M3);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.K3, wVar)) {
                this.K3 = wVar;
                this.L3 = io.reactivex.processors.h.T8(this.J3);
                org.reactivestreams.v<? super V> vVar = this.B3;
                vVar.l(this);
                long jRequested = requested();
                if (jRequested == 0) {
                    this.D3 = true;
                    wVar.cancel();
                    vVar.onError(new io.reactivex.exceptions.c("Could not deliver first window due to lack of requests."));
                    return;
                }
                vVar.onNext(this.L3);
                if (jRequested != Long.MAX_VALUE) {
                    d(1L);
                }
                if (this.D3) {
                    return;
                }
                io.reactivex.internal.disposables.h hVar = this.M3;
                io.reactivex.j0 j0Var = this.I3;
                long j10 = this.G3;
                if (hVar.a(j0Var.g(this, j10, j10, this.H3))) {
                    wVar.request(Long.MAX_VALUE);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.processors.h<T>] */
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
        void m() {
            ej.o oVar = this.C3;
            org.reactivestreams.v<? super V> vVar = this.B3;
            io.reactivex.processors.h<T> hVar = this.L3;
            int iA = 1;
            while (true) {
                boolean z10 = this.N3;
                boolean z11 = this.E3;
                Object objPoll = oVar.poll();
                if (z11 && (objPoll == null || objPoll == O3)) {
                    break;
                }
                if (objPoll == null) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (objPoll == O3) {
                    hVar.onComplete();
                    if (z10) {
                        this.K3.cancel();
                    } else {
                        hVar = (io.reactivex.processors.h<T>) io.reactivex.processors.h.T8(this.J3);
                        this.L3 = hVar;
                        long jRequested = requested();
                        if (jRequested == 0) {
                            this.L3 = null;
                            this.C3.clear();
                            this.K3.cancel();
                            dispose();
                            vVar.onError(new io.reactivex.exceptions.c("Could not deliver first window due to lack of requests."));
                            return;
                        }
                        vVar.onNext(hVar);
                        if (jRequested != Long.MAX_VALUE) {
                            d(1L);
                        }
                    }
                } else {
                    hVar.onNext(io.reactivex.internal.util.q.r(objPoll));
                }
            }
            this.L3 = null;
            oVar.clear();
            dispose();
            Throwable th2 = this.F3;
            if (th2 != null) {
                hVar.onError(th2);
            } else {
                hVar.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.E3 = true;
            if (b()) {
                m();
            }
            this.B3.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.F3 = th2;
            this.E3 = true;
            if (b()) {
                m();
            }
            this.B3.onError(th2);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.N3) {
                return;
            }
            if (g()) {
                this.L3.onNext(t10);
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.C3.offer((U) io.reactivex.internal.util.q.x(t10));
                if (!b()) {
                    return;
                }
            }
            m();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            j(j10);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.D3) {
                this.N3 = true;
                dispose();
            }
            this.C3.offer((U) O3);
            if (b()) {
                m();
            }
        }
    }

    static final class c<T> extends io.reactivex.internal.subscribers.n<T, Object, io.reactivex.l<T>> implements org.reactivestreams.w, Runnable {
        final long G3;
        final long H3;
        final TimeUnit I3;
        final io.reactivex.j0.c J3;
        final int K3;
        final List<io.reactivex.processors.h<T>> L3;
        org.reactivestreams.w M3;
        volatile boolean N3;

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final io.reactivex.processors.h<T> f300475a;

            a(io.reactivex.processors.h<T> hVar) {
                this.f300475a = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.m(this.f300475a);
            }
        }

        static final class b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.processors.h<T> f300477a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final boolean f300478b;

            b(io.reactivex.processors.h<T> hVar, boolean z10) {
                this.f300477a = hVar;
                this.f300478b = z10;
            }
        }

        c(org.reactivestreams.v<? super io.reactivex.l<T>> vVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0.c cVar, int i10) {
            super(vVar, new io.reactivex.internal.queue.a());
            this.G3 = j10;
            this.H3 = j11;
            this.I3 = timeUnit;
            this.J3 = cVar;
            this.K3 = i10;
            this.L3 = new LinkedList();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.D3 = true;
        }

        public void dispose() {
            this.J3.dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.M3, wVar)) {
                this.M3 = wVar;
                this.B3.l(this);
                if (this.D3) {
                    return;
                }
                long jRequested = requested();
                if (jRequested == 0) {
                    wVar.cancel();
                    this.B3.onError(new io.reactivex.exceptions.c("Could not emit the first window due to lack of requests"));
                    return;
                }
                io.reactivex.processors.h<T> hVarT8 = io.reactivex.processors.h.T8(this.K3);
                this.L3.add(hVarT8);
                this.B3.onNext(hVarT8);
                if (jRequested != Long.MAX_VALUE) {
                    d(1L);
                }
                this.J3.c(new a(hVarT8), this.G3, this.I3);
                io.reactivex.j0.c cVar = this.J3;
                long j10 = this.H3;
                cVar.d(this, j10, j10, this.I3);
                wVar.request(Long.MAX_VALUE);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void m(io.reactivex.processors.h<T> hVar) {
            this.C3.offer((U) new b(hVar, false));
            if (b()) {
                n();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void n() {
            ej.o oVar = this.C3;
            org.reactivestreams.v<? super V> vVar = this.B3;
            List<io.reactivex.processors.h<T>> list = this.L3;
            int iA = 1;
            while (!this.N3) {
                boolean z10 = this.E3;
                Object objPoll = oVar.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof b;
                if (z10 && (z11 || z12)) {
                    oVar.clear();
                    Throwable th2 = this.F3;
                    if (th2 != null) {
                        Iterator<io.reactivex.processors.h<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<io.reactivex.processors.h<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    dispose();
                    return;
                }
                if (z11) {
                    iA = a(-iA);
                    if (iA == 0) {
                        return;
                    }
                } else if (z12) {
                    b bVar = (b) objPoll;
                    if (!bVar.f300478b) {
                        list.remove(bVar.f300477a);
                        bVar.f300477a.onComplete();
                        if (list.isEmpty() && this.D3) {
                            this.N3 = true;
                        }
                    } else if (!this.D3) {
                        long jRequested = requested();
                        if (jRequested != 0) {
                            io.reactivex.processors.h<T> hVarT8 = io.reactivex.processors.h.T8(this.K3);
                            list.add(hVarT8);
                            vVar.onNext(hVarT8);
                            if (jRequested != Long.MAX_VALUE) {
                                d(1L);
                            }
                            this.J3.c(new a(hVarT8), this.G3, this.I3);
                        } else {
                            vVar.onError(new io.reactivex.exceptions.c("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<io.reactivex.processors.h<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.M3.cancel();
            dispose();
            oVar.clear();
            list.clear();
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.E3 = true;
            if (b()) {
                n();
            }
            this.B3.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.F3 = th2;
            this.E3 = true;
            if (b()) {
                n();
            }
            this.B3.onError(th2);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (g()) {
                Iterator<io.reactivex.processors.h<T>> it = this.L3.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                this.C3.offer((U) t10);
                if (!b()) {
                    return;
                }
            }
            n();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            j(j10);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object bVar = new b(io.reactivex.processors.h.T8(this.K3), true);
            if (!this.D3) {
                this.C3.offer((U) bVar);
            }
            if (b()) {
                n();
            }
        }
    }

    public w4(io.reactivex.l<T> lVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0 j0Var, long j12, int i10, boolean z10) {
        super(lVar);
        this.f300466c = j10;
        this.f300467d = j11;
        this.f300468e = timeUnit;
        this.f300469f = j0Var;
        this.f300470g = j12;
        this.f300471h = i10;
        this.f300472i = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super io.reactivex.l<T>> vVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(vVar);
        long j10 = this.f300466c;
        long j11 = this.f300467d;
        if (j10 != j11) {
            this.f299043b.j6(new c(eVar, j10, j11, this.f300468e, this.f300469f.c(), this.f300471h));
            return;
        }
        long j12 = this.f300470g;
        if (j12 == Long.MAX_VALUE) {
            this.f299043b.j6(new b(eVar, this.f300466c, this.f300468e, this.f300469f, this.f300471h));
        } else {
            this.f299043b.j6(new a(eVar, j10, this.f300468e, this.f300469f, this.f300471h, j12, this.f300472i));
        }
    }
}
