package com.planner5d.library.aichat.application;

import android.app.Application;
import androidx.lifecycle.f2;
import com.planner5d.library.aichat.view.fragment.ChatFragment;
import com.planner5d.library.model.manager.statistics.events.i3;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.modules.user.user.a0;
import com.planner5d.library.modules.user.user.u0;
import com.planner5d.library.modules.user.user.w;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.e
public final class t {

    private static final class a extends com.planner5d.library.aichat.application.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.planner5d.library.aichat.application.b f141928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f141929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.requests.c> f141930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<w> f141931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<Application> f141932h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.h> f141933i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.w> f141934j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<com.planner5d.library.aichat.interactor.a> f141935k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<ya.a> f141936l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<i3> f141937m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<a0> f141938n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ij.c<com.planner5d.library.aichat.interactor.d> f141939o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<ya.b> f141940p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<com.planner5d.library.aichat.view.fragment.m> f141941q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<va.b> f141942r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<va.c> f141943s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<u0> f141944t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<u1> f141945u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<ua.a> f141946v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<com.planner5d.library.aichat.view.bottomsheet.t> f141947w;

        private com.planner5d.library.aichat.interactor.a l() {
            return new com.planner5d.library.aichat.interactor.a(n.c(this.f141928d), o.c(this.f141928d), d.c(this.f141928d), f.c(this.f141928d), g.c(this.f141928d));
        }

        private ua.a m() {
            return new ua.a(i.c(this.f141928d));
        }

        private com.planner5d.library.aichat.view.bottomsheet.t n() {
            return new com.planner5d.library.aichat.view.bottomsheet.t(f(), d.c(this.f141928d), e.c(this.f141928d), f.c(this.f141928d), m.c(this.f141928d), l.c(this.f141928d), o.c(this.f141928d), q.c(this.f141928d), m());
        }

        private com.planner5d.library.aichat.interactor.d o() {
            return new com.planner5d.library.aichat.interactor.d(p.c(this.f141928d), o.c(this.f141928d));
        }

        private void p(com.planner5d.library.aichat.application.b bVar) {
            this.f141930f = n.a(bVar);
            this.f141931g = o.a(bVar);
            this.f141932h = d.a(bVar);
            this.f141933i = f.a(bVar);
            g gVarA = g.a(bVar);
            this.f141934j = gVarA;
            com.planner5d.library.aichat.interactor.b bVarA = com.planner5d.library.aichat.interactor.b.a(this.f141930f, this.f141931g, this.f141932h, this.f141933i, gVarA);
            this.f141935k = bVarA;
            this.f141936l = c.a(bVar, bVarA);
            this.f141937m = m.a(bVar);
            p pVarA = p.a(bVar);
            this.f141938n = pVarA;
            com.planner5d.library.aichat.interactor.e eVarA = com.planner5d.library.aichat.interactor.e.a(pVarA, this.f141931g);
            this.f141939o = eVarA;
            h hVarA = h.a(bVar, eVarA);
            this.f141940p = hVarA;
            this.f141941q = com.planner5d.library.aichat.view.fragment.n.a(this.f141936l, this.f141933i, this.f141937m, hVarA);
            this.f141942r = e.a(bVar);
            this.f141943s = l.a(bVar);
            this.f141944t = q.a(bVar);
            i iVarA = i.a(bVar);
            this.f141945u = iVarA;
            ua.b bVarA2 = ua.b.a(iVarA);
            this.f141946v = bVarA2;
            this.f141947w = com.planner5d.library.aichat.view.bottomsheet.u.a(this.f141936l, this.f141932h, this.f141942r, this.f141933i, this.f141937m, this.f141943s, this.f141931g, this.f141944t, bVarA2);
        }

        private com.planner5d.library.aichat.view.bottomsheet.q q(com.planner5d.library.aichat.view.bottomsheet.q qVar) {
            com.planner5d.library.aichat.view.bottomsheet.s.e(qVar, n());
            com.planner5d.library.aichat.view.bottomsheet.s.d(qVar, k.c(this.f141928d));
            com.planner5d.library.aichat.view.bottomsheet.s.b(qVar, m.c(this.f141928d));
            return qVar;
        }

        private ChatFragment r(ChatFragment chatFragment) {
            com.planner5d.library.aichat.view.fragment.l.c(chatFragment, k.c(this.f141928d));
            return chatFragment;
        }

        @Override // com.planner5d.library.view.b
        public Map<Class<? extends f2>, ij.c<f2>> d() {
            return dagger.internal.l.b(2).c(com.planner5d.library.aichat.view.fragment.m.class, this.f141941q).c(com.planner5d.library.aichat.view.bottomsheet.t.class, this.f141947w).a();
        }

        @Override // com.planner5d.library.aichat.application.a
        public ya.a f() {
            return c.c(this.f141928d, l());
        }

        @Override // com.planner5d.library.aichat.application.a
        public va.b g() {
            return e.c(this.f141928d);
        }

        @Override // com.planner5d.library.aichat.application.a
        public ya.b h() {
            return h.c(this.f141928d, o());
        }

        @Override // com.planner5d.library.aichat.application.a
        public va.c i() {
            return l.c(this.f141928d);
        }

        @Override // com.planner5d.library.aichat.application.a
        public void j(com.planner5d.library.aichat.view.bottomsheet.q qVar) {
            q(qVar);
        }

        @Override // com.planner5d.library.aichat.application.a
        public void k(ChatFragment chatFragment) {
            r(chatFragment);
        }

        private a(com.planner5d.library.aichat.application.b bVar) {
            this.f141929e = this;
            this.f141928d = bVar;
            p(bVar);
        }
    }

    private static final class b implements com.planner5d.library.aichat.application.a.b {
        @Override // com.planner5d.library.aichat.application.a.b
        public com.planner5d.library.aichat.application.a a(com.planner5d.library.aichat.application.b bVar) {
            dagger.internal.p.b(bVar);
            return new a(bVar);
        }

        private b() {
        }
    }

    private t() {
    }

    public static com.planner5d.library.aichat.application.a.b a() {
        return new b();
    }
}
