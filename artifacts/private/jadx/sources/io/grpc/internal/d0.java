package io.grpc.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
final class d0 implements r1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f288977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.grpc.c3 f288978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f288979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f288980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f288981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r1.a f288982h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private io.grpc.y2 f288984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @fj.h
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private io.grpc.o1.k f288985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private long f288986l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.c1 f288975a = io.grpc.c1.a(d0.class, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f288976b = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.g
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private Collection<e> f288983i = new LinkedHashSet();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r1.a f288987a;

        a(r1.a aVar) {
            this.f288987a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f288987a.d(true);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r1.a f288989a;

        b(r1.a aVar) {
            this.f288989a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f288989a.d(false);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r1.a f288991a;

        c(r1.a aVar) {
            this.f288991a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f288991a.a();
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.y2 f288993a;

        d(io.grpc.y2 y2Var) {
            this.f288993a = y2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f288982h.b(this.f288993a);
        }
    }

    private class e extends e0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final io.grpc.o1.h f288995k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final io.grpc.w f288996l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final io.grpc.n[] f288997m;

        /* synthetic */ e(d0 d0Var, io.grpc.o1.h hVar, io.grpc.n[] nVarArr, a aVar) {
            this(hVar, nVarArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable I(u uVar) {
            io.grpc.w wVarB = this.f288996l.b();
            try {
                s sVarE = uVar.e(this.f288995k.c(), this.f288995k.b(), this.f288995k.a(), this.f288997m);
                this.f288996l.j(wVarB);
                return E(sVarE);
            } catch (Throwable th2) {
                this.f288996l.j(wVarB);
                throw th2;
            }
        }

        @Override // io.grpc.internal.e0
        protected void C(io.grpc.y2 y2Var) {
            for (io.grpc.n nVar : this.f288997m) {
                nVar.i(y2Var);
            }
        }

        @Override // io.grpc.internal.e0, io.grpc.internal.s
        public void a(io.grpc.y2 y2Var) {
            super.a(y2Var);
            synchronized (d0.this.f288976b) {
                try {
                    if (d0.this.f288981g != null) {
                        boolean zRemove = d0.this.f288983i.remove(this);
                        if (!d0.this.r() && zRemove) {
                            d0.this.f288978d.b(d0.this.f288980f);
                            if (d0.this.f288984j != null) {
                                d0.this.f288978d.b(d0.this.f288981g);
                                d0.this.f288981g = null;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            d0.this.f288978d.a();
        }

        @Override // io.grpc.internal.e0, io.grpc.internal.s
        public void t(b1 b1Var) {
            if (this.f288995k.a().k()) {
                b1Var.a("wait_for_ready");
            }
            super.t(b1Var);
        }

        private e(io.grpc.o1.h hVar, io.grpc.n[] nVarArr) {
            this.f288996l = io.grpc.w.g();
            this.f288995k = hVar;
            this.f288997m = nVarArr;
        }
    }

    d0(Executor executor, io.grpc.c3 c3Var) {
        this.f288977c = executor;
        this.f288978d = c3Var;
    }

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private e p(io.grpc.o1.h hVar, io.grpc.n[] nVarArr) {
        e eVar = new e(this, hVar, nVarArr, null);
        this.f288983i.add(eVar);
        if (q() == 1) {
            this.f288978d.b(this.f288979e);
        }
        for (io.grpc.n nVar : nVarArr) {
            nVar.j();
        }
        return eVar;
    }

    @Override // io.grpc.internal.r1
    public final void a(io.grpc.y2 y2Var) {
        Collection<e> collection;
        Runnable runnable;
        h(y2Var);
        synchronized (this.f288976b) {
            try {
                collection = this.f288983i;
                runnable = this.f288981g;
                this.f288981g = null;
                if (!collection.isEmpty()) {
                    this.f288983i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable runnableE = eVar.E(new i0(y2Var, t.a.REFUSED, eVar.f288997m));
                if (runnableE != null) {
                    runnableE.run();
                }
            }
            this.f288978d.execute(runnable);
        }
    }

    @Override // io.grpc.m1
    public io.grpc.c1 c() {
        return this.f288975a;
    }

    @Override // io.grpc.internal.u
    public final void d(u.a aVar, Executor executor) {
        throw new UnsupportedOperationException("This method is not expected to be called");
    }

    @Override // io.grpc.internal.u
    public final s e(io.grpc.w1<?, ?> w1Var, io.grpc.v1 v1Var, io.grpc.e eVar, io.grpc.n[] nVarArr) {
        s i0Var;
        try {
            g2 g2Var = new g2(w1Var, v1Var, eVar);
            io.grpc.o1.k kVar = null;
            long j10 = -1;
            while (true) {
                synchronized (this.f288976b) {
                    if (this.f288984j == null) {
                        io.grpc.o1.k kVar2 = this.f288985k;
                        if (kVar2 != null) {
                            if (kVar != null && j10 == this.f288986l) {
                                i0Var = p(g2Var, nVarArr);
                                break;
                            }
                            j10 = this.f288986l;
                            u uVarN = v0.n(kVar2.a(g2Var), eVar.k());
                            if (uVarN != null) {
                                i0Var = uVarN.e(g2Var.c(), g2Var.b(), g2Var.a(), nVarArr);
                                break;
                            }
                            kVar = kVar2;
                        } else {
                            i0Var = p(g2Var, nVarArr);
                            break;
                        }
                    } else {
                        i0Var = new i0(this.f288984j, nVarArr);
                        break;
                    }
                }
            }
            this.f288978d.a();
            return i0Var;
        } catch (Throwable th2) {
            this.f288978d.a();
            throw th2;
        }
    }

    @Override // io.grpc.internal.r1
    public final Runnable f(r1.a aVar) {
        this.f288982h = aVar;
        this.f288979e = new a(aVar);
        this.f288980f = new b(aVar);
        this.f288981g = new c(aVar);
        return null;
    }

    @Override // io.grpc.internal.r1
    public final void h(io.grpc.y2 y2Var) {
        Runnable runnable;
        synchronized (this.f288976b) {
            try {
                if (this.f288984j != null) {
                    return;
                }
                this.f288984j = y2Var;
                this.f288978d.b(new d(y2Var));
                if (!r() && (runnable = this.f288981g) != null) {
                    this.f288978d.b(runnable);
                    this.f288981g = null;
                }
                this.f288978d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.a1
    public com.google.common.util.concurrent.t1<io.grpc.v0.l> i() {
        com.google.common.util.concurrent.m2 m2VarF = com.google.common.util.concurrent.m2.F();
        m2VarF.B(null);
        return m2VarF;
    }

    @com.google.common.annotations.e
    final int q() {
        int size;
        synchronized (this.f288976b) {
            try {
                size = this.f288983i.size();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return size;
    }

    public final boolean r() {
        boolean z10;
        synchronized (this.f288976b) {
            z10 = !this.f288983i.isEmpty();
        }
        return z10;
    }

    final void s(@fj.h io.grpc.o1.k kVar) {
        Runnable runnable;
        synchronized (this.f288976b) {
            try {
                this.f288985k = kVar;
                this.f288986l++;
                if (kVar != null && r()) {
                    ArrayList<e> arrayList = new ArrayList(this.f288983i);
                    ArrayList arrayList2 = new ArrayList();
                    for (e eVar : arrayList) {
                        io.grpc.o1.g gVarA = kVar.a(eVar.f288995k);
                        io.grpc.e eVarA = eVar.f288995k.a();
                        u uVarN = v0.n(gVarA, eVarA.k());
                        if (uVarN != null) {
                            Executor executorE = this.f288977c;
                            if (eVarA.e() != null) {
                                executorE = eVarA.e();
                            }
                            Runnable runnableI = eVar.I(uVarN);
                            if (runnableI != null) {
                                executorE.execute(runnableI);
                            }
                            arrayList2.add(eVar);
                        }
                    }
                    synchronized (this.f288976b) {
                        try {
                            if (r()) {
                                this.f288983i.removeAll(arrayList2);
                                if (this.f288983i.isEmpty()) {
                                    this.f288983i = new LinkedHashSet();
                                }
                                if (!r()) {
                                    this.f288978d.b(this.f288980f);
                                    if (this.f288984j != null && (runnable = this.f288981g) != null) {
                                        this.f288978d.b(runnable);
                                        this.f288981g = null;
                                    }
                                }
                                this.f288978d.a();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
