package com.planner5d.library.project.application;

import android.app.Application;
import androidx.lifecycle.f2;
import com.planner5d.library.activity.fragment.dialog.purchase.s;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.manager.payments.b0;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.project.fragment.aidesigner.AiFlowFragment;
import com.planner5d.library.project.fragment.roomstyle.RoomStyleFragment;
import com.planner5d.library.project.fragment.roomtype.RoomTypeFragment;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.utility.c2;
import dagger.internal.p;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.e
public final class a {

    /* JADX INFO: renamed from: com.planner5d.library.project.application.a$a, reason: collision with other inner class name */
    private static final class C1653a implements c.b {
        @Override // com.planner5d.library.project.application.c.b
        public c a(com.planner5d.library.application.c cVar) {
            p.b(cVar);
            return new b(new d(), new k(), cVar);
        }

        private C1653a() {
        }
    }

    private static final class b extends com.planner5d.library.project.application.c {
        private ij.c<com.planner5d.library.smartwizard.data.c> A;
        private ij.c<o1> B;
        private ij.c<com.planner5d.library.smartwizard.interactor.g> C;
        private ij.c<ce.c> D;
        private ij.c<com.planner5d.library.smartwizard.interactor.c> E;
        private ij.c<le.c> F;
        private ij.c<com.planner5d.library.model.manager.config.j> G;
        private ij.c<com.planner5d.library.project.fragment.roomstyle.l> H;
        private ij.c<c2> I;
        private ij.c<com.planner5d.library.project.fragment.aidesigner.m> J;
        private ij.c<com.planner5d.library.project.fragment.aidesigner.f> K;
        private ij.c<NetworkErrorUtility> L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.planner5d.library.application.c f223620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.planner5d.library.project.application.d f223621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f223622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<n1> f223623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<com.planner5d.library.project.interactor.a> f223624h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<pd.a> f223625i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<com.planner5d.library.project.interactor.g> f223626j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<pd.e> f223627k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<Application> f223628l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.requests.c> f223629m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<t> f223630n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ij.c<com.planner5d.library.project.interactor.c> f223631o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<pd.b> f223632p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<j3> f223633q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<b2> f223634r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<StatisticsEventAiDesigner> f223635s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<com.planner5d.library.project.fragment.roomtype.m> f223636t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<s> f223637u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.k> f223638v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.payments.j> f223639w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ij.c<com.planner5d.library.project.interactor.e> f223640x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ij.c<pd.c> f223641y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ij.c<w> f223642z;

        /* JADX INFO: renamed from: com.planner5d.library.project.application.a$b$a, reason: collision with other inner class name */
        private static final class C1654a implements ij.c<Application> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223643a;

            C1654a(com.planner5d.library.application.c cVar) {
                this.f223643a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Application get() {
                return (Application) p.e(this.f223643a.o0());
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.project.application.a$b$b, reason: collision with other inner class name */
        private static final class C1655b implements ij.c<com.planner5d.library.activity.fragment.dialog.k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223644a;

            C1655b(com.planner5d.library.application.c cVar) {
                this.f223644a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.activity.fragment.dialog.k get() {
                return (com.planner5d.library.activity.fragment.dialog.k) p.e(this.f223644a.L0());
            }
        }

        private static final class c implements ij.c<com.planner5d.library.model.manager.config.j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223645a;

            c(com.planner5d.library.application.c cVar) {
                this.f223645a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.model.manager.config.j get() {
                return (com.planner5d.library.model.manager.config.j) p.e(this.f223645a.J1());
            }
        }

        private static final class d implements ij.c<n1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223646a;

            d(com.planner5d.library.application.c cVar) {
                this.f223646a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public n1 get() {
                return (n1) p.e(this.f223646a.o1());
            }
        }

        private static final class e implements ij.c<o1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223647a;

            e(com.planner5d.library.application.c cVar) {
                this.f223647a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o1 get() {
                return (o1) p.e(this.f223647a.s1());
            }
        }

        private static final class f implements ij.c<b2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223648a;

            f(com.planner5d.library.application.c cVar) {
                this.f223648a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b2 get() {
                return (b2) p.e(this.f223648a.F1());
            }
        }

        private static final class g implements ij.c<NetworkErrorUtility> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223649a;

            g(com.planner5d.library.application.c cVar) {
                this.f223649a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public NetworkErrorUtility get() {
                return (NetworkErrorUtility) p.e(this.f223649a.S1());
            }
        }

        private static final class h implements ij.c<c2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223650a;

            h(com.planner5d.library.application.c cVar) {
                this.f223650a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c2 get() {
                return (c2) p.e(this.f223650a.a2());
            }
        }

        private static final class i implements ij.c<com.planner5d.library.model.manager.payments.j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223651a;

            i(com.planner5d.library.application.c cVar) {
                this.f223651a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.model.manager.payments.j get() {
                return (com.planner5d.library.model.manager.payments.j) p.e(this.f223651a.i1());
            }
        }

        private static final class j implements ij.c<s> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223652a;

            j(com.planner5d.library.application.c cVar) {
                this.f223652a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public s get() {
                return (s) p.e(this.f223652a.g0());
            }
        }

        private static final class k implements ij.c<j3> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223653a;

            k(com.planner5d.library.application.c cVar) {
                this.f223653a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public j3 get() {
                return (j3) p.e(this.f223653a.F0());
            }
        }

        private static final class l implements ij.c<StatisticsEventAiDesigner> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223654a;

            l(com.planner5d.library.application.c cVar) {
                this.f223654a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public StatisticsEventAiDesigner get() {
                return (StatisticsEventAiDesigner) p.e(this.f223654a.F());
            }
        }

        private static final class m implements ij.c<com.planner5d.library.api.requests.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223655a;

            m(com.planner5d.library.application.c cVar) {
                this.f223655a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.api.requests.c get() {
                return (com.planner5d.library.api.requests.c) p.e(this.f223655a.k2());
            }
        }

        private static final class n implements ij.c<t> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223656a;

            n(com.planner5d.library.application.c cVar) {
                this.f223656a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public t get() {
                return (t) p.e(this.f223656a.r2());
            }
        }

        private static final class o implements ij.c<w> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f223657a;

            o(com.planner5d.library.application.c cVar) {
                this.f223657a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public w get() {
                return (w) p.e(this.f223657a.R1());
            }
        }

        private com.planner5d.library.project.interactor.a l() {
            return new com.planner5d.library.project.interactor.a(new com.planner5d.library.database.manager.a());
        }

        private void m(com.planner5d.library.project.application.d dVar, com.planner5d.library.project.application.k kVar, com.planner5d.library.application.c cVar) {
            this.f223623g = new d(cVar);
            com.planner5d.library.project.interactor.b bVarA = com.planner5d.library.project.interactor.b.a(com.planner5d.library.database.manager.b.a());
            this.f223624h = bVarA;
            this.f223625i = com.planner5d.library.project.application.e.a(dVar, bVarA);
            com.planner5d.library.project.interactor.h hVarA = com.planner5d.library.project.interactor.h.a(com.planner5d.library.database.manager.b.a());
            this.f223626j = hVarA;
            this.f223627k = com.planner5d.library.project.application.h.a(dVar, hVarA);
            this.f223628l = new C1654a(cVar);
            this.f223629m = new m(cVar);
            n nVar = new n(cVar);
            this.f223630n = nVar;
            com.planner5d.library.project.interactor.d dVarA = com.planner5d.library.project.interactor.d.a(this.f223628l, this.f223629m, nVar);
            this.f223631o = dVarA;
            this.f223632p = com.planner5d.library.project.application.f.a(dVar, dVarA);
            this.f223633q = new k(cVar);
            this.f223634r = new f(cVar);
            l lVar = new l(cVar);
            this.f223635s = lVar;
            this.f223636t = com.planner5d.library.project.fragment.roomtype.n.a(this.f223623g, this.f223625i, this.f223627k, this.f223632p, this.f223633q, this.f223634r, lVar);
            this.f223637u = new j(cVar);
            this.f223638v = new C1655b(cVar);
            i iVar = new i(cVar);
            this.f223639w = iVar;
            com.planner5d.library.project.interactor.f fVarA = com.planner5d.library.project.interactor.f.a(this.f223637u, this.f223638v, iVar, this.f223630n);
            this.f223640x = fVarA;
            this.f223641y = com.planner5d.library.project.application.g.a(dVar, fVarA);
            this.f223642z = new o(cVar);
            this.A = com.planner5d.library.smartwizard.data.d.a(this.f223628l, com.planner5d.library.database.manager.b.a(), this.f223629m, this.f223642z);
            e eVar = new e(cVar);
            this.B = eVar;
            com.planner5d.library.smartwizard.interactor.h hVarA2 = com.planner5d.library.smartwizard.interactor.h.a(this.f223628l, eVar);
            this.C = hVarA2;
            com.planner5d.library.project.application.m mVarA = com.planner5d.library.project.application.m.a(kVar, hVarA2);
            this.D = mVarA;
            com.planner5d.library.smartwizard.interactor.d dVarA2 = com.planner5d.library.smartwizard.interactor.d.a(this.A, mVarA);
            this.E = dVarA2;
            this.F = com.planner5d.library.project.application.l.a(kVar, dVarA2);
            c cVar2 = new c(cVar);
            this.G = cVar2;
            this.H = com.planner5d.library.project.fragment.roomstyle.n.a(this.f223625i, this.f223627k, this.f223641y, this.F, this.f223634r, this.f223633q, cVar2, this.f223630n);
            h hVar = new h(cVar);
            this.I = hVar;
            this.J = com.planner5d.library.project.fragment.aidesigner.n.a(this.f223635s, hVar, this.f223634r);
            this.K = com.planner5d.library.project.fragment.aidesigner.g.a(this.f223635s);
            this.L = new g(cVar);
        }

        private AiFlowFragment n(AiFlowFragment aiFlowFragment) {
            com.planner5d.library.project.fragment.aidesigner.l.c(aiFlowFragment, (b0) p.e(this.f223620d.T1()));
            return aiFlowFragment;
        }

        private RoomStyleFragment o(RoomStyleFragment roomStyleFragment) {
            com.planner5d.library.project.fragment.roomstyle.f.b(roomStyleFragment, (com.planner5d.library.activity.fragment.feed.b) p.e(this.f223620d.W()));
            com.planner5d.library.project.fragment.roomstyle.f.g(roomStyleFragment, dagger.internal.g.a(this.L));
            com.planner5d.library.project.fragment.roomstyle.f.e(roomStyleFragment, dagger.internal.g.a(this.f223634r));
            com.planner5d.library.project.fragment.roomstyle.f.c(roomStyleFragment, (y0) p.e(this.f223620d.I()));
            com.planner5d.library.project.fragment.roomstyle.f.f(roomStyleFragment, (x) p.e(this.f223620d.C()));
            return roomStyleFragment;
        }

        private RoomTypeFragment p(RoomTypeFragment roomTypeFragment) {
            com.planner5d.library.project.fragment.roomtype.f.b(roomTypeFragment, (y0) p.e(this.f223620d.I()));
            return roomTypeFragment;
        }

        private com.planner5d.library.project.interactor.g q() {
            return new com.planner5d.library.project.interactor.g(new com.planner5d.library.database.manager.a());
        }

        @Override // com.planner5d.library.view.b
        public Map<Class<? extends f2>, ij.c<f2>> d() {
            return dagger.internal.l.b(4).c(com.planner5d.library.project.fragment.roomtype.m.class, this.f223636t).c(com.planner5d.library.project.fragment.roomstyle.l.class, this.H).c(com.planner5d.library.project.fragment.aidesigner.m.class, this.J).c(com.planner5d.library.project.fragment.aidesigner.f.class, this.K).a();
        }

        @Override // com.planner5d.library.project.application.c
        public pd.a g() {
            return com.planner5d.library.project.application.e.c(this.f223621e, l());
        }

        @Override // com.planner5d.library.project.application.c
        public pd.e h() {
            return com.planner5d.library.project.application.h.c(this.f223621e, q());
        }

        @Override // com.planner5d.library.project.application.c
        public void i(AiFlowFragment aiFlowFragment) {
            n(aiFlowFragment);
        }

        @Override // com.planner5d.library.project.application.c
        public void j(RoomStyleFragment roomStyleFragment) {
            o(roomStyleFragment);
        }

        @Override // com.planner5d.library.project.application.c
        public void k(RoomTypeFragment roomTypeFragment) {
            p(roomTypeFragment);
        }

        private b(com.planner5d.library.project.application.d dVar, com.planner5d.library.project.application.k kVar, com.planner5d.library.application.c cVar) {
            this.f223622f = this;
            this.f223620d = cVar;
            this.f223621e = dVar;
            m(dVar, kVar, cVar);
        }
    }

    private a() {
    }

    public static c.b a() {
        return new C1653a();
    }
}
