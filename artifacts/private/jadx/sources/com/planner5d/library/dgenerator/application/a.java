package com.planner5d.library.dgenerator.application;

import android.app.Application;
import androidx.lifecycle.f2;
import com.planner5d.library.activity.helper.b0;
import com.planner5d.library.activity.helper.x;
import com.planner5d.library.dgenerator.fragment.gallery.GalleryFragment;
import com.planner5d.library.dgenerator.fragment.gallery.pager.GalleryPagerFragment;
import com.planner5d.library.dgenerator.fragment.gallery.u;
import com.planner5d.library.dgenerator.fragment.gallery.v;
import com.planner5d.library.dgenerator.fragment.list.AutoStyleListFragment;
import com.planner5d.library.interactor.k0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.a3;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.e
public final class a {

    /* JADX INFO: renamed from: com.planner5d.library.dgenerator.application.a$a, reason: collision with other inner class name */
    private static final class C1538a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private pd.e f160031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private pd.a f160032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.planner5d.library.application.c f160033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f160034d;

        @Override // com.planner5d.library.dgenerator.application.c.a
        public c build() {
            dagger.internal.p.a(this.f160031a, pd.e.class);
            dagger.internal.p.a(this.f160032b, pd.a.class);
            dagger.internal.p.a(this.f160033c, com.planner5d.library.application.c.class);
            if (this.f160034d == null) {
                this.f160034d = new d();
            }
            return new b(this.f160034d, this.f160033c, this.f160031a, this.f160032b);
        }

        @Override // com.planner5d.library.dgenerator.application.c.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1538a b(com.planner5d.library.application.c cVar) {
            this.f160033c = (com.planner5d.library.application.c) dagger.internal.p.b(cVar);
            return this;
        }

        @Override // com.planner5d.library.dgenerator.application.c.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1538a d(d dVar) {
            this.f160034d = (d) dagger.internal.p.b(dVar);
            return this;
        }

        @Override // com.planner5d.library.dgenerator.application.c.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1538a c(pd.a aVar) {
            this.f160032b = (pd.a) dagger.internal.p.b(aVar);
            return this;
        }

        @Override // com.planner5d.library.dgenerator.application.c.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C1538a a(pd.e eVar) {
            this.f160031a = (pd.e) dagger.internal.p.b(eVar);
            return this;
        }

        private C1538a() {
        }
    }

    private static final class b extends com.planner5d.library.dgenerator.application.c {
        private ij.c<pd.e> A;
        private ij.c<com.planner5d.library.dgenerator.fragment.crop.k> B;
        private ij.c<com.planner5d.library.dgenerator.interactor.e> C;
        private ij.c<nb.c> D;
        private ij.c<com.planner5d.library.dgenerator.interactor.c> E;
        private ij.c<nb.b> F;
        private ij.c<x> G;
        private ij.c<Application> H;
        private ij.c<o1> I;
        private ij.c<com.planner5d.library.smartwizard.interactor.g> J;
        private ij.c<ce.c> K;
        private ij.c<com.planner5d.library.dgenerator.interactor.i> L;
        private ij.c<nb.e> M;
        private ij.c<u> N;
        private ij.c<b0> O;
        private ij.c<com.planner5d.library.dgenerator.fragment.gallery.pager.j> P;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.planner5d.library.application.c f160035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f160036e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<com.planner5d.library.application.b> f160037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<b2> f160038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.requests.c> f160039h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<t> f160040i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<le.m> f160041j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<com.planner5d.library.dgenerator.interactor.m> f160042k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<nb.g> f160043l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.d> f160044m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<com.planner5d.library.dgenerator.data.a> f160045n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ij.c<f1> f160046o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.t> f160047p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<com.planner5d.library.dgenerator.interactor.p> f160048q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<nb.h> f160049r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<com.planner5d.library.dgenerator.interactor.k> f160050s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<nb.f> f160051t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.builtin.i> f160052u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<j3> f160053v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<c2> f160054w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.k> f160055x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ij.c<com.planner5d.library.dgenerator.fragment.list.n> f160056y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ij.c<pd.a> f160057z;

        /* JADX INFO: renamed from: com.planner5d.library.dgenerator.application.a$b$a, reason: collision with other inner class name */
        private static final class C1539a implements ij.c<Application> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160058a;

            C1539a(com.planner5d.library.application.c cVar) {
                this.f160058a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Application get() {
                return (Application) dagger.internal.p.e(this.f160058a.o0());
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.dgenerator.application.a$b$b, reason: collision with other inner class name */
        private static final class C1540b implements ij.c<com.planner5d.library.application.b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160059a;

            C1540b(com.planner5d.library.application.c cVar) {
                this.f160059a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.application.b get() {
                return (com.planner5d.library.application.b) dagger.internal.p.e(this.f160059a.S0());
            }
        }

        private static final class c implements ij.c<com.planner5d.library.model.manager.builtin.i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160060a;

            c(com.planner5d.library.application.c cVar) {
                this.f160060a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.model.manager.builtin.i get() {
                return (com.planner5d.library.model.manager.builtin.i) dagger.internal.p.e(this.f160060a.w0());
            }
        }

        private static final class d implements ij.c<com.planner5d.library.model.manager.config.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160061a;

            d(com.planner5d.library.application.c cVar) {
                this.f160061a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.model.manager.config.d get() {
                return (com.planner5d.library.model.manager.config.d) dagger.internal.p.e(this.f160061a.getConfigManager());
            }
        }

        private static final class e implements ij.c<com.planner5d.library.services.utility.t> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160062a;

            e(com.planner5d.library.application.c cVar) {
                this.f160062a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.services.utility.t get() {
                return (com.planner5d.library.services.utility.t) dagger.internal.p.e(this.f160062a.n());
            }
        }

        private static final class f implements ij.c<com.planner5d.library.activity.fragment.dialog.k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160063a;

            f(com.planner5d.library.application.c cVar) {
                this.f160063a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.activity.fragment.dialog.k get() {
                return (com.planner5d.library.activity.fragment.dialog.k) dagger.internal.p.e(this.f160063a.L0());
            }
        }

        private static final class g implements ij.c<f1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160064a;

            g(com.planner5d.library.application.c cVar) {
                this.f160064a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f1 get() {
                return (f1) dagger.internal.p.e(this.f160064a.m1());
            }
        }

        private static final class h implements ij.c<x> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160065a;

            h(com.planner5d.library.application.c cVar) {
                this.f160065a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public x get() {
                return (x) dagger.internal.p.e(this.f160065a.y1());
            }
        }

        private static final class i implements ij.c<b0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160066a;

            i(com.planner5d.library.application.c cVar) {
                this.f160066a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b0 get() {
                return (b0) dagger.internal.p.e(this.f160066a.S());
            }
        }

        private static final class j implements ij.c<o1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160067a;

            j(com.planner5d.library.application.c cVar) {
                this.f160067a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o1 get() {
                return (o1) dagger.internal.p.e(this.f160067a.s1());
            }
        }

        private static final class k implements ij.c<b2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160068a;

            k(com.planner5d.library.application.c cVar) {
                this.f160068a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b2 get() {
                return (b2) dagger.internal.p.e(this.f160068a.F1());
            }
        }

        private static final class l implements ij.c<c2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160069a;

            l(com.planner5d.library.application.c cVar) {
                this.f160069a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c2 get() {
                return (c2) dagger.internal.p.e(this.f160069a.a2());
            }
        }

        private static final class m implements ij.c<j3> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160070a;

            m(com.planner5d.library.application.c cVar) {
                this.f160070a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public j3 get() {
                return (j3) dagger.internal.p.e(this.f160070a.F0());
            }
        }

        private static final class n implements ij.c<com.planner5d.library.api.requests.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160071a;

            n(com.planner5d.library.application.c cVar) {
                this.f160071a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.api.requests.c get() {
                return (com.planner5d.library.api.requests.c) dagger.internal.p.e(this.f160071a.k2());
            }
        }

        private static final class o implements ij.c<t> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f160072a;

            o(com.planner5d.library.application.c cVar) {
                this.f160072a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public t get() {
                return (t) dagger.internal.p.e(this.f160072a.r2());
            }
        }

        private void j(com.planner5d.library.dgenerator.application.d dVar, com.planner5d.library.application.c cVar, pd.e eVar, pd.a aVar) {
            this.f160037f = new C1540b(cVar);
            this.f160038g = new k(cVar);
            this.f160039h = new n(cVar);
            this.f160040i = new o(cVar);
            com.planner5d.library.dgenerator.application.m mVarA = com.planner5d.library.dgenerator.application.m.a(dVar, k0.a());
            this.f160041j = mVarA;
            com.planner5d.library.dgenerator.interactor.n nVarA = com.planner5d.library.dgenerator.interactor.n.a(this.f160039h, this.f160040i, mVarA, com.planner5d.library.database.manager.b.a());
            this.f160042k = nVarA;
            this.f160043l = com.planner5d.library.dgenerator.application.n.a(dVar, nVarA);
            this.f160044m = new d(cVar);
            this.f160045n = dagger.internal.g.b(com.planner5d.library.dgenerator.data.b.a());
            this.f160046o = new g(cVar);
            this.f160047p = new e(cVar);
            com.planner5d.library.dgenerator.interactor.r rVarA = com.planner5d.library.dgenerator.interactor.r.a(this.f160037f, this.f160043l, this.f160044m, com.planner5d.library.database.manager.b.a(), this.f160045n, a3.a(), this.f160046o, this.f160047p);
            this.f160048q = rVarA;
            this.f160049r = com.planner5d.library.dgenerator.application.l.a(dVar, rVarA);
            com.planner5d.library.dgenerator.interactor.l lVarA = com.planner5d.library.dgenerator.interactor.l.a(com.planner5d.library.database.manager.b.a(), this.f160049r, this.f160045n);
            this.f160050s = lVarA;
            this.f160051t = com.planner5d.library.dgenerator.application.j.a(dVar, lVarA);
            this.f160052u = new c(cVar);
            this.f160053v = new m(cVar);
            this.f160054w = new l(cVar);
            this.f160055x = new f(cVar);
            this.f160056y = com.planner5d.library.dgenerator.fragment.list.p.a(this.f160037f, this.f160038g, this.f160043l, this.f160049r, this.f160051t, com.planner5d.library.database.manager.b.a(), this.f160052u, this.f160053v, this.f160054w, this.f160055x, this.f160046o);
            this.f160057z = dagger.internal.k.a(aVar);
            dagger.internal.h hVarA = dagger.internal.k.a(eVar);
            this.A = hVarA;
            this.B = com.planner5d.library.dgenerator.fragment.crop.l.a(this.f160057z, hVarA);
            com.planner5d.library.dgenerator.interactor.f fVarA = com.planner5d.library.dgenerator.interactor.f.a(com.planner5d.library.database.manager.b.a());
            this.C = fVarA;
            this.D = com.planner5d.library.dgenerator.application.g.a(dVar, fVarA);
            com.planner5d.library.dgenerator.interactor.d dVarA = com.planner5d.library.dgenerator.interactor.d.a(com.planner5d.library.database.manager.b.a());
            this.E = dVarA;
            this.F = com.planner5d.library.dgenerator.application.f.a(dVar, dVarA);
            this.G = new h(cVar);
            this.H = new C1539a(cVar);
            j jVar = new j(cVar);
            this.I = jVar;
            com.planner5d.library.smartwizard.interactor.h hVarA2 = com.planner5d.library.smartwizard.interactor.h.a(this.H, jVar);
            this.J = hVarA2;
            this.K = com.planner5d.library.dgenerator.application.o.a(dVar, hVarA2);
            com.planner5d.library.dgenerator.interactor.j jVarA = com.planner5d.library.dgenerator.interactor.j.a(com.planner5d.library.database.manager.b.a(), this.K);
            this.L = jVarA;
            com.planner5d.library.dgenerator.application.i iVarA = com.planner5d.library.dgenerator.application.i.a(dVar, jVarA);
            this.M = iVarA;
            this.N = v.a(this.f160037f, this.f160055x, this.f160057z, this.D, this.F, this.G, iVarA, this.f160052u, this.f160053v);
            i iVar = new i(cVar);
            this.O = iVar;
            this.P = com.planner5d.library.dgenerator.fragment.gallery.pager.k.a(this.f160057z, this.D, iVar, this.f160038g, this.f160053v);
        }

        private AutoStyleListFragment k(AutoStyleListFragment autoStyleListFragment) {
            com.planner5d.library.dgenerator.fragment.list.j.c(autoStyleListFragment, (com.planner5d.library.activity.helper.imagechooser.j) dagger.internal.p.e(this.f160035d.K1()));
            com.planner5d.library.dgenerator.fragment.list.j.b(autoStyleListFragment, (com.planner5d.library.model.manager.builtin.i) dagger.internal.p.e(this.f160035d.w0()));
            com.planner5d.library.dgenerator.fragment.list.j.d(autoStyleListFragment, (y0) dagger.internal.p.e(this.f160035d.I()));
            return autoStyleListFragment;
        }

        private GalleryFragment l(GalleryFragment galleryFragment) {
            com.planner5d.library.dgenerator.fragment.gallery.j.b(galleryFragment, (y0) dagger.internal.p.e(this.f160035d.I()));
            return galleryFragment;
        }

        private GalleryPagerFragment m(GalleryPagerFragment galleryPagerFragment) {
            com.planner5d.library.dgenerator.fragment.gallery.pager.f.b(galleryPagerFragment, (y0) dagger.internal.p.e(this.f160035d.I()));
            return galleryPagerFragment;
        }

        @Override // com.planner5d.library.view.b
        public Map<Class<? extends f2>, ij.c<f2>> d() {
            return dagger.internal.l.b(4).c(com.planner5d.library.dgenerator.fragment.list.n.class, this.f160056y).c(com.planner5d.library.dgenerator.fragment.crop.k.class, this.B).c(u.class, this.N).c(com.planner5d.library.dgenerator.fragment.gallery.pager.j.class, this.P).a();
        }

        @Override // com.planner5d.library.dgenerator.application.c
        public void g(GalleryFragment galleryFragment) {
            l(galleryFragment);
        }

        @Override // com.planner5d.library.dgenerator.application.c
        public void h(GalleryPagerFragment galleryPagerFragment) {
            m(galleryPagerFragment);
        }

        @Override // com.planner5d.library.dgenerator.application.c
        public void i(AutoStyleListFragment autoStyleListFragment) {
            k(autoStyleListFragment);
        }

        private b(com.planner5d.library.dgenerator.application.d dVar, com.planner5d.library.application.c cVar, pd.e eVar, pd.a aVar) {
            this.f160036e = this;
            this.f160035d = cVar;
            j(dVar, cVar, eVar, aVar);
        }
    }

    private a() {
    }

    public static c.a a() {
        return new C1538a();
    }
}
