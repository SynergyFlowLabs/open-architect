package com.planner5d.library.help.application;

import android.app.Application;
import androidx.lifecycle.f2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.about.About;
import com.planner5d.library.activity.fragment.dialog.support.SupportDialog;
import com.planner5d.library.activity.fragment.profile.about.AboutFragment;
import com.planner5d.library.interactor.l0;
import com.planner5d.library.interactor.m0;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.h1;
import com.planner5d.library.model.manager.h2;
import com.planner5d.library.model.manager.j1;
import com.planner5d.library.model.manager.o4;
import com.planner5d.library.model.manager.p5;
import com.planner5d.library.model.manager.q4;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.statistics.events.v3;
import com.planner5d.library.model.manager.t2;
import com.planner5d.library.model.manager.t4;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.e
public final class a {

    /* JADX INFO: renamed from: com.planner5d.library.help.application.a$a, reason: collision with other inner class name */
    private static final class C1557a implements h.b {
        @Override // com.planner5d.library.help.application.h.b
        public h a(i iVar) {
            dagger.internal.p.b(iVar);
            return new b(iVar);
        }

        private C1557a() {
        }
    }

    private static final class b extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final i f179946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f179947e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.w> f179948f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.p> f179949g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<v3> f179950h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.onboarding.j> f179951i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<e1> f179952j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<t2> f179953k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.w> f179954l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.profile.about.e> f179955m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<Application> f179956n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ij.c<u1> f179957o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<f1> f179958p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<h1> f179959q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<c2> f179960r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<q4> f179961s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<p5> f179962t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<o4> f179963u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<r3> f179964v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<l0> f179965w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ij.c<le.n> f179966x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.support.k> f179967y;

        private AboutFragment A(AboutFragment aboutFragment) {
            com.planner5d.library.activity.fragment.profile.about.d.e(aboutFragment, v.c(this.f179946d));
            com.planner5d.library.activity.fragment.profile.about.d.b(aboutFragment, n.c(this.f179946d));
            com.planner5d.library.activity.fragment.profile.about.d.f(aboutFragment, s());
            com.planner5d.library.activity.fragment.profile.about.d.c(aboutFragment, s.c(this.f179946d));
            return aboutFragment;
        }

        private SupportDialog B(SupportDialog supportDialog) {
            com.planner5d.library.activity.fragment.dialog.support.j.d(supportDialog, v.c(this.f179946d));
            com.planner5d.library.activity.fragment.dialog.support.j.b(supportDialog, s.c(this.f179946d));
            return supportDialog;
        }

        private void y(i iVar) {
            this.f179948f = o.a(iVar);
            this.f179949g = b0.a(iVar);
            d0 d0VarA = d0.a(iVar);
            this.f179950h = d0VarA;
            this.f179951i = com.planner5d.library.activity.fragment.dialog.onboarding.k.a(this.f179948f, this.f179949g, d0VarA);
            this.f179952j = r.a(iVar);
            this.f179953k = z.a(iVar);
            h0 h0VarA = h0.a(iVar);
            this.f179954l = h0VarA;
            this.f179955m = com.planner5d.library.activity.fragment.profile.about.f.a(this.f179952j, this.f179953k, h0VarA);
            this.f179956n = j.a(iVar);
            this.f179957o = t.a(iVar);
            q qVarA = q.a(iVar);
            this.f179958p = qVarA;
            this.f179959q = dagger.internal.g.b(j1.a(this.f179948f, this.f179956n, this.f179952j, this.f179954l, this.f179957o, qVarA));
            this.f179960r = y.a(iVar);
            this.f179961s = e0.a(iVar);
            g0 g0VarA = g0.a(iVar);
            this.f179962t = g0VarA;
            this.f179963u = t4.a(this.f179956n, this.f179959q, this.f179960r, this.f179961s, g0VarA);
            c0 c0VarA = c0.a(iVar);
            this.f179964v = c0VarA;
            ij.c<l0> cVarB = dagger.internal.g.b(m0.a(this.f179963u, this.f179952j, c0VarA));
            this.f179965w = cVarB;
            a0 a0VarA = a0.a(iVar, cVarB);
            this.f179966x = a0VarA;
            this.f179967y = com.planner5d.library.activity.fragment.dialog.support.l.a(this.f179963u, this.f179961s, a0VarA);
        }

        private About z(About about) {
            com.planner5d.library.activity.fragment.dialog.about.a.i(about, e0.c(this.f179946d));
            com.planner5d.library.activity.fragment.dialog.about.a.b(about, r.c(this.f179946d));
            com.planner5d.library.activity.fragment.dialog.about.a.h(about, s());
            com.planner5d.library.activity.fragment.dialog.about.a.d(about, t.c(this.f179946d));
            com.planner5d.library.activity.fragment.dialog.about.a.f(about, z.c(this.f179946d));
            com.planner5d.library.activity.fragment.dialog.about.a.k(about, h0.c(this.f179946d));
            com.planner5d.library.activity.fragment.dialog.about.a.g(about, c0.c(this.f179946d));
            com.planner5d.library.activity.fragment.dialog.about.a.j(about, f0.c(this.f179946d));
            com.planner5d.library.activity.fragment.dialog.about.a.c(about, s.c(this.f179946d));
            return about;
        }

        @Override // com.planner5d.library.view.b
        public Map<Class<? extends f2>, ij.c<f2>> d() {
            return dagger.internal.l.b(4).c(j0.a.class, k0.a()).c(com.planner5d.library.activity.fragment.dialog.onboarding.j.class, this.f179951i).c(com.planner5d.library.activity.fragment.profile.about.e.class, this.f179955m).c(com.planner5d.library.activity.fragment.dialog.support.k.class, this.f179967y).a();
        }

        @Override // com.planner5d.library.help.application.h
        public Application f() {
            return j.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public com.planner5d.library.model.manager.h g() {
            return k.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public int h() {
            return this.f179946d.c();
        }

        @Override // com.planner5d.library.help.application.h
        public Class<? extends FragmentController> i() {
            return m.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public com.planner5d.library.activity.fragment.dialog.k j() {
            return n.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public com.planner5d.library.activity.fragment.x k() {
            return p.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public h1 m() {
            return this.f179959q.get();
        }

        @Override // com.planner5d.library.help.application.h
        public u1 n() {
            return t.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public y1 o() {
            return u.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public h2 p() {
            return w.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public com.planner5d.library.model.manager.config.p q() {
            return b0.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public v3 r() {
            return d0.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public o4 s() {
            return new o4(j.c(this.f179946d), this.f179959q.get(), y.c(this.f179946d), e0.c(this.f179946d), g0.c(this.f179946d));
        }

        @Override // com.planner5d.library.help.application.h
        public p5 t() {
            return g0.c(this.f179946d);
        }

        @Override // com.planner5d.library.help.application.h
        public void u(About about) {
            z(about);
        }

        @Override // com.planner5d.library.help.application.h
        public void v(SupportDialog supportDialog) {
            B(supportDialog);
        }

        @Override // com.planner5d.library.help.application.h
        public void w(AboutFragment aboutFragment) {
            A(aboutFragment);
        }

        private b(i iVar) {
            this.f179947e = this;
            this.f179946d = iVar;
            y(iVar);
        }
    }

    private a() {
    }

    public static h.b a() {
        return new C1557a();
    }
}
