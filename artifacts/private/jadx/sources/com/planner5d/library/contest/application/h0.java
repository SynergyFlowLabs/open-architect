package com.planner5d.library.contest.application;

import android.app.Application;
import androidx.lifecycle.f2;
import com.planner5d.library.contest.view.ContestDetailFragment;
import com.planner5d.library.contest.view.ContestFragment;
import com.planner5d.library.contest.view.MainContestPage;
import com.planner5d.library.contest.view.archive.ContestArchive;
import com.planner5d.library.contest.view.archive.ContestArchiveList;
import com.planner5d.library.contest.view.detail.ContestDetailsFragment;
import com.planner5d.library.contest.view.dialog.ContestRulesAgreement;
import com.planner5d.library.contest.view.dialog.prize.ContestPrizeDialog;
import com.planner5d.library.contest.view.voting.ContestVotingFragment;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.p0;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.e
public final class h0 {

    private static final class a extends com.planner5d.library.contest.application.a {
        private ij.c<p0> A;
        private ij.c<com.planner5d.library.model.manager.w> B;
        private ij.c<com.planner5d.library.contest.data.k> C;
        private ij.c<com.planner5d.library.contest.view.dialog.prize.m> D;
        private ij.c<com.planner5d.library.contest.view.dialog.e> E;
        private ij.c<com.planner5d.library.contest.view.dialog.l> F;
        private ij.c<com.planner5d.library.contest.view.dialog.s> G;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.planner5d.library.contest.application.b f148433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f148434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.data.i> f148435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.synchronization.k> f148436h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<y1> f148437i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<c2> f148438j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.x> f148439k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.w> f148440l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<l3> f148441m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.data.f> f148442n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.p> f148443o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.c2> f148444p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.d> f148445q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<ErrorMessageParser> f148446r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.t> f148447s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.helper.b> f148448t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.view.z> f148449u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.view.rules.m> f148450v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.q> f148451w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.view.voting.m> f148452x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.view.archive.n> f148453y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ij.c<Application> f148454z;

        private ContestRulesAgreement A(ContestRulesAgreement contestRulesAgreement) {
            com.planner5d.library.contest.view.dialog.g.c(contestRulesAgreement, d0.c(this.f148433e));
            return contestRulesAgreement;
        }

        private com.planner5d.library.contest.helper.c B(com.planner5d.library.contest.helper.c cVar) {
            com.planner5d.library.contest.helper.d.b(cVar, d.c(this.f148433e));
            com.planner5d.library.contest.helper.d.e(cVar, n.c(this.f148433e));
            com.planner5d.library.contest.helper.d.d(cVar, j.c(this.f148433e));
            com.planner5d.library.contest.helper.d.h(cVar, v.c(this.f148433e));
            com.planner5d.library.contest.helper.d.c(cVar, i.c(this.f148433e));
            com.planner5d.library.contest.helper.d.f(cVar, o.c(this.f148433e));
            return cVar;
        }

        private ContestVotingFragment C(ContestVotingFragment contestVotingFragment) {
            com.planner5d.library.contest.view.voting.l.d(contestVotingFragment, t.c(this.f148433e));
            com.planner5d.library.contest.view.voting.l.e(contestVotingFragment, u.c(this.f148433e));
            com.planner5d.library.contest.view.voting.l.b(contestVotingFragment, q.c(this.f148433e));
            com.planner5d.library.contest.view.voting.l.f(contestVotingFragment, a0.c(this.f148433e));
            return contestVotingFragment;
        }

        private MainContestPage D(MainContestPage mainContestPage) {
            com.planner5d.library.contest.view.i0.c(mainContestPage, a0.c(this.f148433e));
            com.planner5d.library.contest.view.i0.d(mainContestPage, b0.c(this.f148433e));
            return mainContestPage;
        }

        private void t(com.planner5d.library.contest.application.b bVar) {
            this.f148435g = d.a(bVar);
            this.f148436h = h.a(bVar);
            this.f148437i = s.a(bVar);
            this.f148438j = t.a(bVar);
            this.f148439k = n.a(bVar);
            this.f148440l = e0.a(bVar);
            a0 a0VarA = a0.a(bVar);
            this.f148441m = a0VarA;
            this.f148442n = com.planner5d.library.contest.data.g.a(this.f148440l, this.f148439k, a0VarA);
            this.f148443o = z.a(bVar);
            this.f148444p = u.a(bVar);
            this.f148445q = g.a(bVar);
            this.f148446r = k.a(bVar);
            this.f148447s = i.a(bVar);
            e eVarA = e.a(bVar);
            this.f148448t = eVarA;
            this.f148449u = com.planner5d.library.contest.view.a0.a(this.f148435g, this.f148436h, this.f148437i, this.f148438j, this.f148439k, this.f148442n, this.f148443o, this.f148444p, this.f148440l, this.f148445q, this.f148446r, this.f148441m, this.f148447s, eVarA);
            this.f148450v = com.planner5d.library.contest.view.rules.n.a(this.f148435g);
            p pVarA = p.a(bVar);
            this.f148451w = pVarA;
            this.f148452x = com.planner5d.library.contest.view.voting.n.a(this.f148435g, this.f148437i, this.f148439k, this.f148446r, this.f148441m, pVarA);
            this.f148453y = com.planner5d.library.contest.view.archive.o.a(this.f148435g, this.f148446r);
            this.f148454z = c.a(bVar);
            this.A = m.a(bVar);
            this.B = l.a(bVar);
            w wVarA = w.a(bVar);
            this.C = wVarA;
            this.D = com.planner5d.library.contest.view.dialog.prize.n.a(this.f148454z, this.f148435g, this.f148436h, this.A, this.f148444p, this.B, wVarA, this.f148440l, this.f148438j, this.f148448t);
            this.E = com.planner5d.library.contest.view.dialog.f.a(this.f148441m);
            this.F = com.planner5d.library.contest.view.dialog.m.a(this.f148435g);
            this.G = com.planner5d.library.contest.view.dialog.t.a(this.f148435g);
        }

        private ContestArchive u(ContestArchive contestArchive) {
            com.planner5d.library.contest.view.archive.p.b(contestArchive, m.c(this.f148433e));
            com.planner5d.library.contest.view.archive.p.d(contestArchive, q.c(this.f148433e));
            com.planner5d.library.contest.view.archive.p.c(contestArchive, p.c(this.f148433e));
            com.planner5d.library.contest.view.archive.p.f(contestArchive, t.c(this.f148433e));
            com.planner5d.library.contest.view.archive.p.g(contestArchive, e0.c(this.f148433e));
            return contestArchive;
        }

        private ContestArchiveList v(ContestArchiveList contestArchiveList) {
            com.planner5d.library.contest.view.archive.k.c(contestArchiveList, m.c(this.f148433e));
            com.planner5d.library.contest.view.archive.k.b(contestArchiveList, j.c(this.f148433e));
            com.planner5d.library.contest.view.archive.k.e(contestArchiveList, q.c(this.f148433e));
            com.planner5d.library.contest.view.archive.k.d(contestArchiveList, p.c(this.f148433e));
            com.planner5d.library.contest.view.archive.k.h(contestArchiveList, e0.c(this.f148433e));
            com.planner5d.library.contest.view.archive.k.g(contestArchiveList, t.c(this.f148433e));
            return contestArchiveList;
        }

        private ContestDetailFragment w(ContestDetailFragment contestDetailFragment) {
            com.planner5d.library.contest.view.e.d(contestDetailFragment, m.c(this.f148433e));
            com.planner5d.library.contest.view.e.f(contestDetailFragment, q.c(this.f148433e));
            com.planner5d.library.contest.view.e.e(contestDetailFragment, p.c(this.f148433e));
            com.planner5d.library.contest.view.e.h(contestDetailFragment, t.c(this.f148433e));
            com.planner5d.library.contest.view.e.b(contestDetailFragment, x.c(this.f148433e));
            com.planner5d.library.contest.view.e.c(contestDetailFragment, l.c(this.f148433e));
            return contestDetailFragment;
        }

        private ContestDetailsFragment x(ContestDetailsFragment contestDetailsFragment) {
            com.planner5d.library.contest.view.detail.e.d(contestDetailsFragment, m.c(this.f148433e));
            com.planner5d.library.contest.view.detail.e.f(contestDetailsFragment, q.c(this.f148433e));
            com.planner5d.library.contest.view.detail.e.e(contestDetailsFragment, p.c(this.f148433e));
            com.planner5d.library.contest.view.detail.e.h(contestDetailsFragment, t.c(this.f148433e));
            com.planner5d.library.contest.view.detail.e.b(contestDetailsFragment, x.c(this.f148433e));
            com.planner5d.library.contest.view.detail.e.c(contestDetailsFragment, l.c(this.f148433e));
            return contestDetailsFragment;
        }

        private ContestFragment y(ContestFragment contestFragment) {
            com.planner5d.library.contest.view.m.e(contestFragment, m.c(this.f148433e));
            com.planner5d.library.contest.view.m.g(contestFragment, q.c(this.f148433e));
            com.planner5d.library.contest.view.m.f(contestFragment, p.c(this.f148433e));
            com.planner5d.library.contest.view.m.i(contestFragment, t.c(this.f148433e));
            com.planner5d.library.contest.view.m.c(contestFragment, j.c(this.f148433e));
            com.planner5d.library.contest.view.m.b(contestFragment, c0.c(this.f148433e));
            com.planner5d.library.contest.view.m.d(contestFragment, l.c(this.f148433e));
            return contestFragment;
        }

        private ContestPrizeDialog z(ContestPrizeDialog contestPrizeDialog) {
            com.planner5d.library.contest.view.dialog.prize.i.e(contestPrizeDialog, t.c(this.f148433e));
            com.planner5d.library.contest.view.dialog.prize.i.b(contestPrizeDialog, x.c(this.f148433e));
            com.planner5d.library.contest.view.dialog.prize.i.c(contestPrizeDialog, j.c(this.f148433e));
            com.planner5d.library.contest.view.dialog.prize.i.f(contestPrizeDialog, y.c(this.f148433e));
            return contestPrizeDialog;
        }

        @Override // com.planner5d.library.view.b
        public Map<Class<? extends f2>, ij.c<f2>> d() {
            return dagger.internal.l.b(8).c(com.planner5d.library.contest.view.z.class, this.f148449u).c(com.planner5d.library.contest.view.rules.m.class, this.f148450v).c(com.planner5d.library.contest.view.voting.m.class, this.f148452x).c(com.planner5d.library.contest.view.archive.n.class, this.f148453y).c(com.planner5d.library.contest.view.dialog.prize.m.class, this.D).c(com.planner5d.library.contest.view.dialog.e.class, this.E).c(com.planner5d.library.contest.view.dialog.l.class, this.F).c(com.planner5d.library.contest.view.dialog.s.class, this.G).a();
        }

        @Override // com.planner5d.library.contest.application.a
        public com.planner5d.library.contest.data.i f() {
            return d.c(this.f148433e);
        }

        @Override // com.planner5d.library.contest.application.a
        public com.planner5d.library.model.manager.synchronization.k g() {
            return h.c(this.f148433e);
        }

        @Override // com.planner5d.library.contest.application.a
        public com.planner5d.library.contest.helper.g h() {
            return v.c(this.f148433e);
        }

        @Override // com.planner5d.library.contest.application.a
        public com.planner5d.library.contest.data.k i() {
            return w.c(this.f148433e);
        }

        @Override // com.planner5d.library.contest.application.a
        public void j(com.planner5d.library.contest.helper.c cVar) {
            B(cVar);
        }

        @Override // com.planner5d.library.contest.application.a
        public void k(ContestDetailFragment contestDetailFragment) {
            w(contestDetailFragment);
        }

        @Override // com.planner5d.library.contest.application.a
        public void l(ContestFragment contestFragment) {
            y(contestFragment);
        }

        @Override // com.planner5d.library.contest.application.a
        public void m(MainContestPage mainContestPage) {
            D(mainContestPage);
        }

        @Override // com.planner5d.library.contest.application.a
        public void n(ContestArchive contestArchive) {
            u(contestArchive);
        }

        @Override // com.planner5d.library.contest.application.a
        public void o(ContestArchiveList contestArchiveList) {
            v(contestArchiveList);
        }

        @Override // com.planner5d.library.contest.application.a
        public void p(ContestDetailsFragment contestDetailsFragment) {
            x(contestDetailsFragment);
        }

        @Override // com.planner5d.library.contest.application.a
        public void q(ContestRulesAgreement contestRulesAgreement) {
            A(contestRulesAgreement);
        }

        @Override // com.planner5d.library.contest.application.a
        public void r(ContestPrizeDialog contestPrizeDialog) {
            z(contestPrizeDialog);
        }

        @Override // com.planner5d.library.contest.application.a
        public void s(ContestVotingFragment contestVotingFragment) {
            C(contestVotingFragment);
        }

        private a(com.planner5d.library.contest.application.b bVar) {
            this.f148434f = this;
            this.f148433e = bVar;
            t(bVar);
        }
    }

    private static final class b implements com.planner5d.library.contest.application.a.b {
        @Override // com.planner5d.library.contest.application.a.b
        public com.planner5d.library.contest.application.a a(com.planner5d.library.contest.application.b bVar) {
            dagger.internal.p.b(bVar);
            return new a(bVar);
        }

        private b() {
        }
    }

    private h0() {
    }

    public static com.planner5d.library.contest.application.a.b a() {
        return new b();
    }
}
