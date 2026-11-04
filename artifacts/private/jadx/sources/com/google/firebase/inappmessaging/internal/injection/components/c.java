package com.google.firebase.inappmessaging.internal.injection.components;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.e;
import com.google.firebase.inappmessaging.internal.a1;
import com.google.firebase.inappmessaging.internal.a3;
import com.google.firebase.inappmessaging.internal.b1;
import com.google.firebase.inappmessaging.internal.injection.modules.e0;
import com.google.firebase.inappmessaging.internal.injection.modules.f0;
import com.google.firebase.inappmessaging.internal.injection.modules.g0;
import com.google.firebase.inappmessaging.internal.injection.modules.h0;
import com.google.firebase.inappmessaging.internal.injection.modules.i0;
import com.google.firebase.inappmessaging.internal.injection.modules.k;
import com.google.firebase.inappmessaging.internal.injection.modules.k0;
import com.google.firebase.inappmessaging.internal.injection.modules.l;
import com.google.firebase.inappmessaging.internal.injection.modules.l0;
import com.google.firebase.inappmessaging.internal.injection.modules.m;
import com.google.firebase.inappmessaging.internal.injection.modules.m0;
import com.google.firebase.inappmessaging.internal.injection.modules.n;
import com.google.firebase.inappmessaging.internal.injection.modules.n0;
import com.google.firebase.inappmessaging.internal.injection.modules.o0;
import com.google.firebase.inappmessaging.internal.injection.modules.p;
import com.google.firebase.inappmessaging.internal.injection.modules.p0;
import com.google.firebase.inappmessaging.internal.injection.modules.q;
import com.google.firebase.inappmessaging.internal.injection.modules.q0;
import com.google.firebase.inappmessaging.internal.injection.modules.r;
import com.google.firebase.inappmessaging.internal.injection.modules.r0;
import com.google.firebase.inappmessaging.internal.injection.modules.s;
import com.google.firebase.inappmessaging.internal.injection.modules.s0;
import com.google.firebase.inappmessaging.internal.injection.modules.t;
import com.google.firebase.inappmessaging.internal.injection.modules.u;
import com.google.firebase.inappmessaging.internal.injection.modules.v;
import com.google.firebase.inappmessaging.internal.injection.modules.w;
import com.google.firebase.inappmessaging.internal.injection.modules.x;
import com.google.firebase.inappmessaging.internal.injection.modules.y;
import com.google.firebase.inappmessaging.internal.o;
import com.google.firebase.inappmessaging.internal.o3;
import com.google.firebase.inappmessaging.internal.p3;
import com.google.firebase.inappmessaging.internal.q3;
import com.google.firebase.inappmessaging.internal.r3;
import com.google.firebase.inappmessaging.internal.v2;
import com.google.firebase.inappmessaging.internal.y2;
import com.google.firebase.inappmessaging.internal.z2;
import io.grpc.f;
import io.reactivex.j0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.a
public final class c {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w f122705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n0 f122706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f122707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u f122708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e0 f122709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.firebase.inappmessaging.internal.injection.modules.a f122710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private h0 f122711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r0 f122712h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private l0 f122713i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private k f122714j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private q f122715k;

        public b a(com.google.firebase.inappmessaging.internal.injection.modules.a aVar) {
            this.f122710f = (com.google.firebase.inappmessaging.internal.injection.modules.a) e.b(aVar);
            return this;
        }

        public b b(k kVar) {
            this.f122714j = (k) e.b(kVar);
            return this;
        }

        public b c(n nVar) {
            this.f122707c = (n) e.b(nVar);
            return this;
        }

        public d d() {
            if (this.f122705a == null) {
                this.f122705a = new w();
            }
            if (this.f122706b == null) {
                this.f122706b = new n0();
            }
            e.a(this.f122707c, n.class);
            if (this.f122708d == null) {
                this.f122708d = new u();
            }
            e.a(this.f122709e, e0.class);
            if (this.f122710f == null) {
                this.f122710f = new com.google.firebase.inappmessaging.internal.injection.modules.a();
            }
            if (this.f122711g == null) {
                this.f122711g = new h0();
            }
            if (this.f122712h == null) {
                this.f122712h = new r0();
            }
            if (this.f122713i == null) {
                this.f122713i = new l0();
            }
            e.a(this.f122714j, k.class);
            e.a(this.f122715k, q.class);
            return new C1164c(this.f122705a, this.f122706b, this.f122707c, this.f122708d, this.f122709e, this.f122710f, this.f122711g, this.f122712h, this.f122713i, this.f122714j, this.f122715k);
        }

        public b e(q qVar) {
            this.f122715k = (q) e.b(qVar);
            return this;
        }

        public b f(u uVar) {
            this.f122708d = (u) e.b(uVar);
            return this;
        }

        public b g(w wVar) {
            this.f122705a = (w) e.b(wVar);
            return this;
        }

        public b h(e0 e0Var) {
            this.f122709e = (e0) e.b(e0Var);
            return this;
        }

        public b i(h0 h0Var) {
            this.f122711g = (h0) e.b(h0Var);
            return this;
        }

        public b j(l0 l0Var) {
            this.f122713i = (l0) e.b(l0Var);
            return this;
        }

        public b k(n0 n0Var) {
            this.f122706b = (n0) e.b(n0Var);
            return this;
        }

        public b l(r0 r0Var) {
            this.f122712h = (r0) e.b(r0Var);
            return this;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.c$c, reason: collision with other inner class name */
    private static final class C1164c implements d {
        private ij.c<Executor> A;
        private ij.c<com.google.firebase.inappmessaging.internal.w> B;
        private ij.c<Executor> C;
        private ij.c<Executor> D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r0 f122716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0 f122717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C1164c f122718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ij.c<Application> f122719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ij.c<z2> f122720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<String> f122721f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<f> f122722g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<j0> f122723h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<j0> f122724i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<j0> f122725j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<q3> f122726k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<io.reactivex.flowables.a<String>> f122727l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<io.reactivex.flowables.a<String>> f122728m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<v2> f122729n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ij.c<com.google.firebase.analytics.connector.a> f122730o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.internal.f> f122731p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<io.reactivex.flowables.a<String>> f122732q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<m8.d> f122733r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<y2> f122734s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.internal.time.a> f122735t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.internal.n> f122736u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<y2> f122737v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<a1> f122738w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.model.k> f122739x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ij.c<y2> f122740y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ij.c<o3> f122741z;

        private void u(w wVar, n0 n0Var, n nVar, u uVar, e0 e0Var, com.google.firebase.inappmessaging.internal.injection.modules.a aVar, h0 h0Var, r0 r0Var, l0 l0Var, k kVar, q qVar) {
            ij.c<Application> cVarB = com.google.firebase.inappmessaging.dagger.internal.b.b(p.a(nVar));
            this.f122719d = cVarB;
            this.f122720e = com.google.firebase.inappmessaging.dagger.internal.b.b(a3.a(cVarB));
            ij.c<String> cVarB2 = com.google.firebase.inappmessaging.dagger.internal.b.b(y.a(wVar));
            this.f122721f = cVarB2;
            this.f122722g = com.google.firebase.inappmessaging.dagger.internal.b.b(x.a(wVar, cVarB2));
            this.f122723h = com.google.firebase.inappmessaging.dagger.internal.b.b(p0.a(n0Var));
            this.f122724i = com.google.firebase.inappmessaging.dagger.internal.b.b(o0.a(n0Var));
            ij.c<j0> cVarB3 = com.google.firebase.inappmessaging.dagger.internal.b.b(q0.a(n0Var));
            this.f122725j = cVarB3;
            this.f122726k = com.google.firebase.inappmessaging.dagger.internal.b.b(r3.a(this.f122723h, this.f122724i, cVarB3));
            this.f122727l = com.google.firebase.inappmessaging.dagger.internal.b.b(v.a(uVar, this.f122719d));
            this.f122728m = com.google.firebase.inappmessaging.dagger.internal.b.b(f0.a(e0Var));
            this.f122729n = com.google.firebase.inappmessaging.dagger.internal.b.b(g0.a(e0Var));
            ij.c<com.google.firebase.analytics.connector.a> cVarB4 = com.google.firebase.inappmessaging.dagger.internal.b.b(l.a(kVar));
            this.f122730o = cVarB4;
            ij.c<com.google.firebase.inappmessaging.internal.f> cVarB5 = com.google.firebase.inappmessaging.dagger.internal.b.b(com.google.firebase.inappmessaging.internal.injection.modules.c.a(aVar, cVarB4));
            this.f122731p = cVarB5;
            this.f122732q = com.google.firebase.inappmessaging.dagger.internal.b.b(com.google.firebase.inappmessaging.internal.injection.modules.b.a(aVar, cVarB5));
            this.f122733r = com.google.firebase.inappmessaging.dagger.internal.b.b(m.a(kVar));
            this.f122734s = com.google.firebase.inappmessaging.dagger.internal.b.b(i0.a(h0Var, this.f122719d));
            s0 s0VarA = s0.a(r0Var);
            this.f122735t = s0VarA;
            this.f122736u = com.google.firebase.inappmessaging.dagger.internal.b.b(o.a(this.f122734s, this.f122719d, s0VarA));
            ij.c<y2> cVarB6 = com.google.firebase.inappmessaging.dagger.internal.b.b(com.google.firebase.inappmessaging.internal.injection.modules.j0.a(h0Var, this.f122719d));
            this.f122737v = cVarB6;
            this.f122738w = com.google.firebase.inappmessaging.dagger.internal.b.b(b1.a(cVarB6));
            this.f122739x = com.google.firebase.inappmessaging.dagger.internal.b.b(com.google.firebase.inappmessaging.model.l.a());
            ij.c<y2> cVarB7 = com.google.firebase.inappmessaging.dagger.internal.b.b(k0.a(h0Var, this.f122719d));
            this.f122740y = cVarB7;
            this.f122741z = com.google.firebase.inappmessaging.dagger.internal.b.b(p3.a(cVarB7, this.f122735t));
            ij.c<Executor> cVarB8 = com.google.firebase.inappmessaging.dagger.internal.b.b(r.a(qVar));
            this.A = cVarB8;
            this.B = com.google.firebase.inappmessaging.dagger.internal.b.b(com.google.firebase.inappmessaging.internal.injection.modules.o.a(nVar, cVarB8));
            this.C = com.google.firebase.inappmessaging.dagger.internal.b.b(t.a(qVar));
            this.D = com.google.firebase.inappmessaging.dagger.internal.b.b(s.a(qVar));
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public com.google.firebase.inappmessaging.model.m a() {
            return m0.c(this.f122717b);
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public o3 b() {
            return this.f122741z.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public v2 c() {
            return this.f122729n.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public m8.d d() {
            return this.f122733r.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public com.google.firebase.inappmessaging.internal.w e() {
            return this.B.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public q3 f() {
            return this.f122726k.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public com.google.firebase.inappmessaging.internal.n g() {
            return this.f122736u.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public Executor h() {
            return this.C.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public com.google.firebase.inappmessaging.internal.f i() {
            return this.f122731p.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public a1 j() {
            return this.f122738w.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public z2 k() {
            return this.f122720e.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public io.reactivex.flowables.a<String> l() {
            return this.f122727l.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public com.google.firebase.inappmessaging.internal.time.a m() {
            return s0.c(this.f122716a);
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public f n() {
            return this.f122722g.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public com.google.firebase.inappmessaging.model.k o() {
            return this.f122739x.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public io.reactivex.flowables.a<String> p() {
            return this.f122732q.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public Application q() {
            return this.f122719d.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public Executor r() {
            return this.D.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public io.reactivex.flowables.a<String> s() {
            return this.f122728m.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.d
        public com.google.firebase.analytics.connector.a t() {
            return this.f122730o.get();
        }

        private C1164c(w wVar, n0 n0Var, n nVar, u uVar, e0 e0Var, com.google.firebase.inappmessaging.internal.injection.modules.a aVar, h0 h0Var, r0 r0Var, l0 l0Var, k kVar, q qVar) {
            this.f122718c = this;
            this.f122716a = r0Var;
            this.f122717b = l0Var;
            u(wVar, n0Var, nVar, uVar, e0Var, aVar, h0Var, r0Var, l0Var, kVar, qVar);
        }
    }

    private c() {
    }

    public static b a() {
        return new b();
    }
}
