package com.google.firebase.inappmessaging.internal.injection.components;

import android.app.Application;
import com.google.android.datatransport.m;
import com.google.firebase.inappmessaging.dagger.internal.e;
import com.google.firebase.inappmessaging.internal.a1;
import com.google.firebase.inappmessaging.internal.injection.modules.a0;
import com.google.firebase.inappmessaging.internal.injection.modules.b0;
import com.google.firebase.inappmessaging.internal.injection.modules.w0;
import com.google.firebase.inappmessaging.internal.injection.modules.z;
import com.google.firebase.inappmessaging.internal.m2;
import com.google.firebase.inappmessaging.internal.n2;
import com.google.firebase.inappmessaging.internal.o3;
import com.google.firebase.inappmessaging.internal.p0;
import com.google.firebase.inappmessaging.internal.q0;
import com.google.firebase.inappmessaging.internal.q3;
import com.google.firebase.inappmessaging.internal.s3;
import com.google.firebase.inappmessaging.internal.u2;
import com.google.firebase.inappmessaging.internal.u3;
import com.google.firebase.inappmessaging.internal.v2;
import com.google.firebase.inappmessaging.internal.w;
import com.google.firebase.inappmessaging.internal.x;
import com.google.firebase.inappmessaging.internal.y;
import com.google.firebase.inappmessaging.internal.z2;
import com.google.firebase.inappmessaging.v;
import io.grpc.v1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.a
public final class b {

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b, reason: collision with other inner class name */
    private static final class C1162b implements com.google.firebase.inappmessaging.internal.injection.components.a {
        private ij.c<m2> A;
        private ij.c<v2> B;
        private ij.c<com.google.firebase.h> C;
        private ij.c<com.google.android.datatransport.m> D;
        private ij.c<com.google.firebase.analytics.connector.a> E;
        private ij.c<w> F;
        private ij.c<u2> G;
        private ij.c<x> H;
        private ij.c<Executor> I;
        private ij.c<com.google.firebase.inappmessaging.m> J;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.firebase.inappmessaging.internal.injection.components.d f122656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.firebase.inappmessaging.internal.injection.modules.d f122657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C1162b f122658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ij.c<io.reactivex.flowables.a<String>> f122659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ij.c<io.reactivex.flowables.a<String>> f122660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.internal.n> f122661f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.internal.time.a> f122662g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<io.grpc.f> f122663h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<v1> f122664i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e> f122665j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<p0> f122666k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<Application> f122667l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<z2> f122668m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.internal.g> f122669n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.internal.f> f122670o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<q3> f122671p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<a1> f122672q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<o3> f122673r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.model.m> f122674s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<s3> f122675t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<u3> f122676u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<com.google.firebase.installations.k> f122677v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<m8.d> f122678w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.internal.q> f122679x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.internal.c> f122680y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ij.c<Executor> f122681z;

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$a */
        private static final class a implements ij.c<com.google.firebase.analytics.connector.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122682a;

            a(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122682a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.firebase.analytics.connector.a get() {
                return (com.google.firebase.analytics.connector.a) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122682a.t());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$b, reason: collision with other inner class name */
        private static final class C1163b implements ij.c<com.google.firebase.inappmessaging.internal.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122683a;

            C1163b(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122683a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.firebase.inappmessaging.internal.f get() {
                return (com.google.firebase.inappmessaging.internal.f) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122683a.i());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$c */
        private static final class c implements ij.c<io.reactivex.flowables.a<String>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122684a;

            c(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122684a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public io.reactivex.flowables.a<String> get() {
                return (io.reactivex.flowables.a) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122684a.l());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$d */
        private static final class d implements ij.c<com.google.firebase.inappmessaging.model.m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122685a;

            d(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122685a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.firebase.inappmessaging.model.m get() {
                return (com.google.firebase.inappmessaging.model.m) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122685a.a());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$e */
        private static final class e implements ij.c<Application> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122686a;

            e(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122686a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Application get() {
                return (Application) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122686a.q());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$f */
        private static final class f implements ij.c<Executor> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122687a;

            f(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122687a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Executor get() {
                return (Executor) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122687a.r());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$g */
        private static final class g implements ij.c<com.google.firebase.inappmessaging.internal.n> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122688a;

            g(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122688a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.firebase.inappmessaging.internal.n get() {
                return (com.google.firebase.inappmessaging.internal.n) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122688a.g());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$h */
        private static final class h implements ij.c<com.google.firebase.inappmessaging.internal.time.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122689a;

            h(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122689a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.firebase.inappmessaging.internal.time.a get() {
                return (com.google.firebase.inappmessaging.internal.time.a) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122689a.m());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$i */
        private static final class i implements ij.c<w> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122690a;

            i(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122690a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public w get() {
                return (w) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122690a.e());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$j */
        private static final class j implements ij.c<m8.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122691a;

            j(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122691a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public m8.d get() {
                return (m8.d) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122691a.d());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$k */
        private static final class k implements ij.c<io.grpc.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122692a;

            k(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122692a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public io.grpc.f get() {
                return (io.grpc.f) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122692a.n());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$l */
        private static final class l implements ij.c<a1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122693a;

            l(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122693a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a1 get() {
                return (a1) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122693a.j());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$m */
        private static final class m implements ij.c<Executor> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122694a;

            m(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122694a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Executor get() {
                return (Executor) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122694a.h());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$n */
        private static final class n implements ij.c<io.reactivex.flowables.a<String>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122695a;

            n(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122695a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public io.reactivex.flowables.a<String> get() {
                return (io.reactivex.flowables.a) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122695a.s());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$o */
        private static final class o implements ij.c<v2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122696a;

            o(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122696a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public v2 get() {
                return (v2) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122696a.c());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$p */
        private static final class p implements ij.c<z2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122697a;

            p(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122697a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z2 get() {
                return (z2) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122697a.k());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$q */
        private static final class q implements ij.c<o3> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122698a;

            q(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122698a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o3 get() {
                return (o3) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122698a.b());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.b$b$r */
        private static final class r implements ij.c<q3> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.firebase.inappmessaging.internal.injection.components.d f122699a;

            r(com.google.firebase.inappmessaging.internal.injection.components.d dVar) {
                this.f122699a = dVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public q3 get() {
                return (q3) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122699a.f());
            }
        }

        private com.google.firebase.inappmessaging.internal.q c() {
            com.google.firebase.inappmessaging.internal.injection.modules.d dVar = this.f122657b;
            return com.google.firebase.inappmessaging.internal.injection.modules.f.c(dVar, com.google.firebase.inappmessaging.internal.injection.modules.i.c(dVar), (m8.d) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122656a.d()));
        }

        private void d(com.google.firebase.inappmessaging.internal.injection.modules.d dVar, z zVar, com.google.firebase.inappmessaging.internal.injection.components.d dVar2, com.google.firebase.inappmessaging.internal.c cVar, com.google.android.datatransport.m mVar) {
            this.f122659d = new c(dVar2);
            this.f122660e = new n(dVar2);
            this.f122661f = new g(dVar2);
            this.f122662g = new h(dVar2);
            this.f122663h = new k(dVar2);
            a0 a0VarA = a0.a(zVar);
            this.f122664i = a0VarA;
            ij.c<com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e> cVarB = com.google.firebase.inappmessaging.dagger.internal.b.b(b0.a(zVar, this.f122663h, a0VarA));
            this.f122665j = cVarB;
            this.f122666k = com.google.firebase.inappmessaging.dagger.internal.b.b(q0.a(cVarB));
            this.f122667l = new e(dVar2);
            p pVar = new p(dVar2);
            this.f122668m = pVar;
            this.f122669n = com.google.firebase.inappmessaging.dagger.internal.b.b(com.google.firebase.inappmessaging.internal.injection.modules.e.a(dVar, this.f122666k, this.f122667l, pVar));
            this.f122670o = new C1163b(dVar2);
            this.f122671p = new r(dVar2);
            this.f122672q = new l(dVar2);
            this.f122673r = new q(dVar2);
            this.f122674s = new d(dVar2);
            com.google.firebase.inappmessaging.internal.injection.modules.i iVarA = com.google.firebase.inappmessaging.internal.injection.modules.i.a(dVar);
            this.f122675t = iVarA;
            this.f122676u = com.google.firebase.inappmessaging.internal.injection.modules.j.a(dVar, iVarA);
            this.f122677v = com.google.firebase.inappmessaging.internal.injection.modules.h.a(dVar);
            j jVar = new j(dVar2);
            this.f122678w = jVar;
            this.f122679x = com.google.firebase.inappmessaging.internal.injection.modules.f.a(dVar, this.f122675t, jVar);
            this.f122680y = com.google.firebase.inappmessaging.dagger.internal.d.a(cVar);
            f fVar = new f(dVar2);
            this.f122681z = fVar;
            this.A = com.google.firebase.inappmessaging.dagger.internal.b.b(n2.a(this.f122659d, this.f122660e, this.f122661f, this.f122662g, this.f122669n, this.f122670o, this.f122671p, this.f122672q, this.f122673r, this.f122674s, this.f122676u, this.f122677v, this.f122679x, this.f122680y, fVar));
            this.B = new o(dVar2);
            this.C = com.google.firebase.inappmessaging.internal.injection.modules.g.a(dVar);
            this.D = com.google.firebase.inappmessaging.dagger.internal.d.a(mVar);
            this.E = new a(dVar2);
            i iVar = new i(dVar2);
            this.F = iVar;
            ij.c<u2> cVarB2 = com.google.firebase.inappmessaging.dagger.internal.b.b(w0.a(this.C, this.D, this.E, this.f122677v, this.f122662g, iVar, this.f122681z));
            this.G = cVarB2;
            this.H = y.a(this.f122672q, this.f122662g, this.f122671p, this.f122673r, this.f122661f, this.f122674s, cVarB2, this.f122679x);
            m mVar2 = new m(dVar2);
            this.I = mVar2;
            this.J = com.google.firebase.inappmessaging.dagger.internal.b.b(v.a(this.A, this.B, this.f122679x, this.f122677v, this.H, this.F, mVar2));
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.a
        public x a() {
            return new x((a1) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122656a.j()), (com.google.firebase.inappmessaging.internal.time.a) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122656a.m()), (q3) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122656a.f()), (o3) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122656a.b()), (com.google.firebase.inappmessaging.internal.n) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122656a.g()), (com.google.firebase.inappmessaging.model.m) com.google.firebase.inappmessaging.dagger.internal.e.e(this.f122656a.a()), this.G.get(), c());
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.a
        public com.google.firebase.inappmessaging.m b() {
            return this.J.get();
        }

        private C1162b(com.google.firebase.inappmessaging.internal.injection.modules.d dVar, z zVar, com.google.firebase.inappmessaging.internal.injection.components.d dVar2, com.google.firebase.inappmessaging.internal.c cVar, com.google.android.datatransport.m mVar) {
            this.f122658c = this;
            this.f122656a = dVar2;
            this.f122657b = dVar;
            d(dVar, zVar, dVar2, cVar, mVar);
        }
    }

    private static final class c implements com.google.firebase.inappmessaging.internal.injection.components.a.InterfaceC1161a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.firebase.inappmessaging.internal.c f122700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.firebase.inappmessaging.internal.injection.modules.d f122701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private z f122702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f122703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private m f122704e;

        private c() {
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.a.InterfaceC1161a
        public com.google.firebase.inappmessaging.internal.injection.components.a build() {
            e.a(this.f122700a, com.google.firebase.inappmessaging.internal.c.class);
            e.a(this.f122701b, com.google.firebase.inappmessaging.internal.injection.modules.d.class);
            e.a(this.f122702c, z.class);
            e.a(this.f122703d, d.class);
            e.a(this.f122704e, m.class);
            return new C1162b(this.f122701b, this.f122702c, this.f122703d, this.f122700a, this.f122704e);
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.a.InterfaceC1161a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public c e(com.google.firebase.inappmessaging.internal.c cVar) {
            this.f122700a = (com.google.firebase.inappmessaging.internal.c) e.b(cVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.a.InterfaceC1161a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public c b(com.google.firebase.inappmessaging.internal.injection.modules.d dVar) {
            this.f122701b = (com.google.firebase.inappmessaging.internal.injection.modules.d) e.b(dVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.a.InterfaceC1161a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public c d(z zVar) {
            this.f122702c = (z) e.b(zVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.a.InterfaceC1161a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c a(m mVar) {
            this.f122704e = (m) e.b(mVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.a.InterfaceC1161a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c c(d dVar) {
            this.f122703d = (d) e.b(dVar);
            return this;
        }
    }

    private b() {
    }

    public static com.google.firebase.inappmessaging.internal.injection.components.a.InterfaceC1161a a() {
        return new c();
    }
}
