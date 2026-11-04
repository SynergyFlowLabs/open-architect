package com.planner5d.library.uploadplan.application;

import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.activity.helper.z0;
import com.planner5d.library.interactor.k0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.c0;
import com.planner5d.library.model.manager.f2;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.payments.b0;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.uploadplan.view.UploadPlanCreateFragment;
import com.planner5d.library.uploadplan.view.UploadPlanScaleRulerFragment;
import com.planner5d.library.uploadplan.view.UploadPlanUploadFragment;
import com.planner5d.library.uploadplan.view.a1;
import com.planner5d.library.uploadplan.view.g0;
import com.planner5d.library.uploadplan.view.h0;
import com.planner5d.library.uploadplan.view.i0;
import com.planner5d.library.uploadplan.view.s0;
import com.planner5d.library.uploadplan.view.x0;
import com.planner5d.library.uploadplan.view.y0;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.e
public final class a {

    /* JADX INFO: renamed from: com.planner5d.library.uploadplan.application.a$a, reason: collision with other inner class name */
    private static final class C1703a implements g.b {
        @Override // com.planner5d.library.uploadplan.application.g.b
        public g a(com.planner5d.library.application.c cVar) {
            dagger.internal.p.b(cVar);
            return new b(new h(), cVar);
        }

        private C1703a() {
        }
    }

    private static final class b extends com.planner5d.library.uploadplan.application.g {
        private ij.c<c0> A;
        private ij.c<com.planner5d.library.activity.fragment.n> B;
        private ij.c<com.planner5d.library.uploadplan.view.l> C;
        private ij.c<com.planner5d.library.activity.helper.imagechooser.j> D;
        private ij.c<le.m> E;
        private ij.c<com.planner5d.library.uploadplan.interactor.e> F;
        private ij.c<ke.b> G;
        private ij.c<t1> H;
        private ij.c<u1> I;
        private ij.c<com.planner5d.library.uploadplan.interactor.l> J;
        private ij.c<ke.e> K;
        private ij.c<y0> L;
        private ij.c<com.planner5d.library.uploadplan.interactor.h> M;
        private ij.c<ke.c> N;
        private ij.c<com.planner5d.library.model.manager.config.source.l> O;
        private ij.c<n1> P;
        private ij.c<m2> Q;
        private ij.c<com.planner5d.library.uploadplan.view.dialog.l> R;
        private ij.c<com.planner5d.library.uploadplan.view.w> S;
        private ij.c<com.planner5d.library.uploadplan.interactor.p> T;
        private ij.c<ke.f> U;
        private ij.c<h0> V;
        private ij.c<f2> W;
        private ij.c<p0> X;
        private ij.c<com.planner5d.library.uploadplan.interactor.r> Y;
        private ij.c<ke.h> Z;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private ij.c<s0> f230656a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private ij.c<com.planner5d.library.uploadplan.interactor.j> f230657b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private ij.c<ke.d> f230658c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.planner5d.library.application.c f230659d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private ij.c<com.planner5d.library.uploadplan.view.t> f230660d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f230661e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.uploadplan.g> f230662e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.k> f230663f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        private ij.c<com.planner5d.library.interactor.a> f230664f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.p> f230665g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        private ij.c<le.a> f230666g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<e4> f230667h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        private ij.c<StatisticsEventAiDesigner> f230668h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<com.planner5d.library.application.b> f230669i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        private ij.c<com.planner5d.library.uploadplan.view.dialog.v> f230670i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<c2> f230671j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.requests.c> f230672k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.t> f230673l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<com.planner5d.library.uploadplan.interactor.a> f230674m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<ke.a> f230675n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ij.c<b2> f230676o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<ErrorMessageParser> f230677p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<com.planner5d.library.uploadplan.view.dialog.a> f230678q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.j> f230679r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<y1> f230680s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<d0> f230681t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.x> f230682u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<t0> f230683v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<com.planner5d.library.application.d> f230684w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ij.c<z0> f230685x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.projects.h> f230686y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ij.c<le.e> f230687z;

        /* JADX INFO: renamed from: com.planner5d.library.uploadplan.application.a$b$a, reason: collision with other inner class name */
        private static final class C1704a implements ij.c<com.planner5d.library.application.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230688a;

            C1704a(com.planner5d.library.application.c cVar) {
                this.f230688a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.application.d get() {
                return (com.planner5d.library.application.d) dagger.internal.p.e(this.f230688a.U1());
            }
        }

        private static final class a0 implements ij.c<t0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230689a;

            a0(com.planner5d.library.application.c cVar) {
                this.f230689a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public t0 get() {
                return (t0) dagger.internal.p.e(this.f230689a.i2());
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.uploadplan.application.a$b$b, reason: collision with other inner class name */
        private static final class C1705b implements ij.c<com.planner5d.library.application.b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230690a;

            C1705b(com.planner5d.library.application.c cVar) {
                this.f230690a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.application.b get() {
                return (com.planner5d.library.application.b) dagger.internal.p.e(this.f230690a.S0());
            }
        }

        private static final class c implements ij.c<com.planner5d.library.activity.fragment.n> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230691a;

            c(com.planner5d.library.application.c cVar) {
                this.f230691a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.activity.fragment.n get() {
                return (com.planner5d.library.activity.fragment.n) dagger.internal.p.e(this.f230691a.Y1());
            }
        }

        private static final class d implements ij.c<com.planner5d.library.activity.fragment.dialog.k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230692a;

            d(com.planner5d.library.application.c cVar) {
                this.f230692a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.activity.fragment.dialog.k get() {
                return (com.planner5d.library.activity.fragment.dialog.k) dagger.internal.p.e(this.f230692a.L0());
            }
        }

        private static final class e implements ij.c<ErrorMessageParser> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230693a;

            e(com.planner5d.library.application.c cVar) {
                this.f230693a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ErrorMessageParser get() {
                return (ErrorMessageParser) dagger.internal.p.e(this.f230693a.w1());
            }
        }

        private static final class f implements ij.c<com.planner5d.library.model.manager.config.j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230694a;

            f(com.planner5d.library.application.c cVar) {
                this.f230694a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.model.manager.config.j get() {
                return (com.planner5d.library.model.manager.config.j) dagger.internal.p.e(this.f230694a.J1());
            }
        }

        private static final class g implements ij.c<c0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230695a;

            g(com.planner5d.library.application.c cVar) {
                this.f230695a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c0 get() {
                return (c0) dagger.internal.p.e(this.f230695a.W0());
            }
        }

        private static final class h implements ij.c<p0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230696a;

            h(com.planner5d.library.application.c cVar) {
                this.f230696a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p0 get() {
                return (p0) dagger.internal.p.e(this.f230696a.O1());
            }
        }

        private static final class i implements ij.c<com.planner5d.library.activity.fragment.x> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230697a;

            i(com.planner5d.library.application.c cVar) {
                this.f230697a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.activity.fragment.x get() {
                return (com.planner5d.library.activity.fragment.x) dagger.internal.p.e(this.f230697a.C());
            }
        }

        private static final class j implements ij.c<le.e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230698a;

            j(com.planner5d.library.application.c cVar) {
                this.f230698a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public le.e get() {
                return (le.e) dagger.internal.p.e(this.f230698a.s());
            }
        }

        private static final class k implements ij.c<com.planner5d.library.activity.helper.imagechooser.j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230699a;

            k(com.planner5d.library.application.c cVar) {
                this.f230699a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.activity.helper.imagechooser.j get() {
                return (com.planner5d.library.activity.helper.imagechooser.j) dagger.internal.p.e(this.f230699a.K1());
            }
        }

        private static final class l implements ij.c<z0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230700a;

            l(com.planner5d.library.application.c cVar) {
                this.f230700a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z0 get() {
                return (z0) dagger.internal.p.e(this.f230700a.N0());
            }
        }

        private static final class m implements ij.c<n1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230701a;

            m(com.planner5d.library.application.c cVar) {
                this.f230701a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public n1 get() {
                return (n1) dagger.internal.p.e(this.f230701a.o1());
            }
        }

        private static final class n implements ij.c<t1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230702a;

            n(com.planner5d.library.application.c cVar) {
                this.f230702a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public t1 get() {
                return (t1) dagger.internal.p.e(this.f230702a.d());
            }
        }

        private static final class o implements ij.c<y1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230703a;

            o(com.planner5d.library.application.c cVar) {
                this.f230703a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public y1 get() {
                return (y1) dagger.internal.p.e(this.f230703a.D0());
            }
        }

        private static final class p implements ij.c<b2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230704a;

            p(com.planner5d.library.application.c cVar) {
                this.f230704a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b2 get() {
                return (b2) dagger.internal.p.e(this.f230704a.F1());
            }
        }

        private static final class q implements ij.c<f2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230705a;

            q(com.planner5d.library.application.c cVar) {
                this.f230705a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f2 get() {
                return (f2) dagger.internal.p.e(this.f230705a.l());
            }
        }

        private static final class r implements ij.c<c2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230706a;

            r(com.planner5d.library.application.c cVar) {
                this.f230706a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c2 get() {
                return (c2) dagger.internal.p.e(this.f230706a.a2());
            }
        }

        private static final class s implements ij.c<d0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230707a;

            s(com.planner5d.library.application.c cVar) {
                this.f230707a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d0 get() {
                return (d0) dagger.internal.p.e(this.f230707a.v2());
            }
        }

        private static final class t implements ij.c<com.planner5d.library.model.manager.config.source.l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230708a;

            t(com.planner5d.library.application.c cVar) {
                this.f230708a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.model.manager.config.source.l get() {
                return (com.planner5d.library.model.manager.config.source.l) dagger.internal.p.e(this.f230708a.l2());
            }
        }

        private static final class u implements ij.c<com.planner5d.library.model.manager.config.p> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230709a;

            u(com.planner5d.library.application.c cVar) {
                this.f230709a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.model.manager.config.p get() {
                return (com.planner5d.library.model.manager.config.p) dagger.internal.p.e(this.f230709a.n2());
            }
        }

        private static final class v implements ij.c<StatisticsEventAiDesigner> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230710a;

            v(com.planner5d.library.application.c cVar) {
                this.f230710a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public StatisticsEventAiDesigner get() {
                return (StatisticsEventAiDesigner) dagger.internal.p.e(this.f230710a.F());
            }
        }

        private static final class w implements ij.c<e4> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230711a;

            w(com.planner5d.library.application.c cVar) {
                this.f230711a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e4 get() {
                return (e4) dagger.internal.p.e(this.f230711a.p2());
            }
        }

        private static final class x implements ij.c<m2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230712a;

            x(com.planner5d.library.application.c cVar) {
                this.f230712a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public m2 get() {
                return (m2) dagger.internal.p.e(this.f230712a.w());
            }
        }

        private static final class y implements ij.c<com.planner5d.library.api.requests.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230713a;

            y(com.planner5d.library.application.c cVar) {
                this.f230713a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.api.requests.c get() {
                return (com.planner5d.library.api.requests.c) dagger.internal.p.e(this.f230713a.k2());
            }
        }

        private static final class z implements ij.c<com.planner5d.library.modules.user.user.t> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.planner5d.library.application.c f230714a;

            z(com.planner5d.library.application.c cVar) {
                this.f230714a = cVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.planner5d.library.modules.user.user.t get() {
                return (com.planner5d.library.modules.user.user.t) dagger.internal.p.e(this.f230714a.r2());
            }
        }

        private void n(com.planner5d.library.uploadplan.application.h hVar, com.planner5d.library.application.c cVar) {
            this.f230663f = new d(cVar);
            this.f230665g = new u(cVar);
            this.f230667h = new w(cVar);
            this.f230669i = new C1705b(cVar);
            this.f230671j = new r(cVar);
            this.f230672k = new y(cVar);
            z zVar = new z(cVar);
            this.f230673l = zVar;
            com.planner5d.library.uploadplan.interactor.b bVarA = com.planner5d.library.uploadplan.interactor.b.a(this.f230672k, zVar);
            this.f230674m = bVarA;
            this.f230675n = com.planner5d.library.uploadplan.application.i.a(hVar, bVarA);
            this.f230676o = new p(cVar);
            e eVar = new e(cVar);
            this.f230677p = eVar;
            this.f230678q = com.planner5d.library.uploadplan.view.dialog.b.a(this.f230669i, this.f230671j, this.f230675n, this.f230676o, eVar);
            this.f230679r = new f(cVar);
            this.f230680s = new o(cVar);
            this.f230681t = new s(cVar);
            this.f230682u = new i(cVar);
            this.f230683v = new a0(cVar);
            this.f230684w = new C1704a(cVar);
            l lVar = new l(cVar);
            this.f230685x = lVar;
            this.f230686y = com.planner5d.library.activity.fragment.projects.i.a(this.f230683v, this.f230676o, this.f230684w, lVar);
            this.f230687z = new j(cVar);
            this.A = new g(cVar);
            this.B = new c(cVar);
            this.C = com.planner5d.library.uploadplan.view.m.a(this.f230663f, this.f230665g, this.f230667h, this.f230678q, this.f230679r, this.f230680s, this.f230669i, this.f230681t, this.f230673l, this.f230682u, this.f230676o, com.planner5d.library.uploadplan.application.e.a(), this.f230686y, this.f230687z, this.A, this.f230683v, this.f230684w, this.B);
            this.D = new k(cVar);
            com.planner5d.library.uploadplan.application.r rVarA = com.planner5d.library.uploadplan.application.r.a(hVar, k0.a());
            this.E = rVarA;
            com.planner5d.library.uploadplan.interactor.f fVarA = com.planner5d.library.uploadplan.interactor.f.a(this.D, rVarA, this.f230669i);
            this.F = fVarA;
            this.G = com.planner5d.library.uploadplan.application.j.a(hVar, fVarA);
            n nVar = new n(cVar);
            this.H = nVar;
            com.planner5d.library.uploadplan.application.q qVarA = com.planner5d.library.uploadplan.application.q.a(hVar, nVar);
            this.I = qVarA;
            com.planner5d.library.uploadplan.interactor.m mVarA = com.planner5d.library.uploadplan.interactor.m.a(this.f230669i, qVarA);
            this.J = mVarA;
            com.planner5d.library.uploadplan.application.o oVarA = com.planner5d.library.uploadplan.application.o.a(hVar, mVarA);
            this.K = oVarA;
            this.L = a1.a(this.f230669i, this.f230676o, this.f230683v, this.f230673l, this.G, this.f230667h, oVarA, this.H);
            com.planner5d.library.uploadplan.interactor.i iVarA = com.planner5d.library.uploadplan.interactor.i.a(this.f230672k, this.f230673l);
            this.M = iVarA;
            this.N = com.planner5d.library.uploadplan.application.k.a(hVar, iVarA);
            this.O = new t(cVar);
            this.P = new m(cVar);
            x xVar = new x(cVar);
            this.Q = xVar;
            this.R = com.planner5d.library.uploadplan.view.dialog.m.a(this.f230663f, this.N, this.f230676o, this.f230678q, this.O, this.I, this.P, this.f230669i, this.f230671j, this.f230677p, xVar);
            this.S = com.planner5d.library.uploadplan.view.x.a(this.f230667h);
            com.planner5d.library.uploadplan.interactor.q qVarA2 = com.planner5d.library.uploadplan.interactor.q.a(this.f230669i);
            this.T = qVarA2;
            com.planner5d.library.uploadplan.application.p pVarA = com.planner5d.library.uploadplan.application.p.a(hVar, qVarA2);
            this.U = pVarA;
            this.V = i0.a(this.f230676o, pVarA, this.f230667h);
            this.W = new q(cVar);
            this.X = new h(cVar);
            com.planner5d.library.uploadplan.interactor.s sVarA = com.planner5d.library.uploadplan.interactor.s.a(this.f230669i, this.f230671j, this.f230672k, this.f230673l);
            this.Y = sVarA;
            com.planner5d.library.uploadplan.application.s sVarA2 = com.planner5d.library.uploadplan.application.s.a(hVar, sVarA);
            this.Z = sVarA2;
            this.f230656a0 = com.planner5d.library.uploadplan.view.t0.a(this.f230669i, this.f230667h, this.W, this.X, this.f230663f, this.H, sVarA2, this.U, this.f230676o);
            com.planner5d.library.uploadplan.interactor.k kVarA = com.planner5d.library.uploadplan.interactor.k.a(this.f230669i);
            this.f230657b0 = kVarA;
            com.planner5d.library.uploadplan.application.l lVarA = com.planner5d.library.uploadplan.application.l.a(hVar, kVarA);
            this.f230658c0 = lVarA;
            this.f230660d0 = com.planner5d.library.uploadplan.view.u.a(this.f230667h, lVarA, this.f230676o);
            com.planner5d.library.uploadplan.application.n nVarA = com.planner5d.library.uploadplan.application.n.a(hVar, com.planner5d.library.model.manager.uploadplan.f.a());
            this.f230662e0 = nVarA;
            com.planner5d.library.interactor.b bVarA2 = com.planner5d.library.interactor.b.a(nVarA, this.f230669i, this.f230672k, this.f230676o, this.f230671j, this.f230677p);
            this.f230664f0 = bVarA2;
            this.f230666g0 = com.planner5d.library.uploadplan.application.m.a(hVar, bVarA2);
            v vVar = new v(cVar);
            this.f230668h0 = vVar;
            this.f230670i0 = com.planner5d.library.uploadplan.view.dialog.w.a(this.f230673l, this.f230666g0, vVar);
        }

        private UploadPlanCreateFragment o(UploadPlanCreateFragment uploadPlanCreateFragment) {
            com.planner5d.library.uploadplan.view.i.c(uploadPlanCreateFragment, (b0) dagger.internal.p.e(this.f230659d.T1()));
            return uploadPlanCreateFragment;
        }

        private UploadPlanScaleRulerFragment p(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment) {
            g0.b(uploadPlanScaleRulerFragment, (com.planner5d.library.activity.fragment.dialog.k) dagger.internal.p.e(this.f230659d.L0()));
            return uploadPlanScaleRulerFragment;
        }

        private UploadPlanUploadFragment q(UploadPlanUploadFragment uploadPlanUploadFragment) {
            x0.d(uploadPlanUploadFragment, (ia.b) dagger.internal.p.e(this.f230659d.i()));
            x0.b(uploadPlanUploadFragment, (com.planner5d.library.model.manager.config.j) dagger.internal.p.e(this.f230659d.J1()));
            return uploadPlanUploadFragment;
        }

        @Override // com.planner5d.library.view.b
        public Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>> d() {
            return dagger.internal.l.b(8).c(com.planner5d.library.uploadplan.view.l.class, this.C).c(y0.class, this.L).c(com.planner5d.library.uploadplan.view.dialog.l.class, this.R).c(com.planner5d.library.uploadplan.view.w.class, this.S).c(h0.class, this.V).c(s0.class, this.f230656a0).c(com.planner5d.library.uploadplan.view.t.class, this.f230660d0).c(com.planner5d.library.uploadplan.view.dialog.v.class, this.f230670i0).a();
        }

        @Override // com.planner5d.library.uploadplan.application.g
        public com.planner5d.library.activity.fragment.dialog.k i() {
            return (com.planner5d.library.activity.fragment.dialog.k) dagger.internal.p.e(this.f230659d.L0());
        }

        @Override // com.planner5d.library.uploadplan.application.g
        public com.planner5d.library.activity.fragment.x j() {
            return (com.planner5d.library.activity.fragment.x) dagger.internal.p.e(this.f230659d.C());
        }

        @Override // com.planner5d.library.uploadplan.application.g
        public void k(UploadPlanCreateFragment uploadPlanCreateFragment) {
            o(uploadPlanCreateFragment);
        }

        @Override // com.planner5d.library.uploadplan.application.g
        public void l(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment) {
            p(uploadPlanScaleRulerFragment);
        }

        @Override // com.planner5d.library.uploadplan.application.g
        public void m(UploadPlanUploadFragment uploadPlanUploadFragment) {
            q(uploadPlanUploadFragment);
        }

        private b(com.planner5d.library.uploadplan.application.h hVar, com.planner5d.library.application.c cVar) {
            this.f230661e = this;
            this.f230659d = cVar;
            n(hVar, cVar);
        }
    }

    private a() {
    }

    public static g.b a() {
        return new C1703a();
    }
}
