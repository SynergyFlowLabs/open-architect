package com.planner5d.planner5d;

import android.os.Bundle;
import com.planner5d.library.activity.tutorial.TutorialFragment;
import com.planner5d.library.application.f6;
import com.planner5d.library.application.o3;
import com.planner5d.library.application.x5;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.statistics.events.j1;
import com.planner5d.library.model.manager.statistics.events.t1;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.model.manager.y2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/* JADX INFO: loaded from: classes12.dex */
public final class Application extends com.planner5d.library.application.b implements TutorialFragment.a {

    public static final class a implements com.planner5d.library.model.manager.synchronization.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.planner5d.library.model.manager.synchronization.i f258900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.application.c f258901b;

        a(com.planner5d.library.application.c cVar) {
            this.f258901b = cVar;
            this.f258900a = cVar.Q1();
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public void a() {
            this.f258900a.f(this.f258901b.A1());
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public com.planner5d.library.model.manager.synchronization.m b() {
            com.planner5d.library.model.manager.synchronization.m mVarI = this.f258900a.i(this.f258901b.A1());
            Intrinsics.checkNotNullExpressionValue(mVarI, "getSynchronizationState(...)");
            return mVarI;
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public Observable<Void> c(boolean z10) {
            Observable<Void> observableS = this.f258900a.s(null, z10);
            Intrinsics.checkNotNullExpressionValue(observableS, "synchronize(...)");
            return observableS;
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public void d() {
            this.f258900a.w();
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public void e() throws Throwable {
            this.f258900a.v();
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public androidx.lifecycle.w0<Boolean> f() {
            androidx.lifecycle.w0<Boolean> w0VarJ = this.f258900a.j();
            Intrinsics.checkNotNullExpressionValue(w0VarJ, "inProgress(...)");
            return w0VarJ;
        }

        public final com.planner5d.library.model.manager.synchronization.i g() {
            return this.f258900a;
        }
    }

    public static final class b implements com.planner5d.library.contest.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.application.c f258902a;

        b(com.planner5d.library.application.c cVar) {
            this.f258902a = cVar;
        }

        @Override // com.planner5d.library.contest.d
        public void a(long j10) {
            this.f258902a.o().d(this.f258902a.A1(), j10);
        }
    }

    public static final class c implements y2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.application.c f258903a;

        c(com.planner5d.library.application.c cVar) {
            this.f258903a = cVar;
        }

        @Override // com.planner5d.library.model.manager.y2
        public void a(com.planner5d.library.widget.rate.c condition) {
            Intrinsics.checkNotNullParameter(condition, "condition");
            this.f258903a.Y0().j(condition, t3.c.contest_prize_dialog);
        }
    }

    public static final class d implements com.planner5d.library.contest.helper.g {
        d() {
        }

        @Override // com.planner5d.library.contest.helper.g
        public com.planner5d.library.activity.helper.event.content.c a(Project project, boolean z10, Bundle bundle, boolean z11, com.planner5d.library.activity.helper.event.content.a aVar) {
            Intrinsics.checkNotNullParameter(project, "project");
            return new com.planner5d.library.activity.helper.event.content.d(project, z10, bundle, z11, aVar);
        }
    }

    @Override // com.planner5d.library.activity.tutorial.TutorialFragment.a
    @NotNull
    public f6 g() {
        com.planner5d.library.application.c cVarA = com.planner5d.library.application.b.f142455c.a();
        if (cVarA instanceof h0) {
            return ((h0) cVarA).g();
        }
        throw new kotlin.l0("Tutorial component is not supported");
    }

    @Override // com.planner5d.library.application.b
    @NotNull
    protected com.planner5d.library.application.c.a o() {
        h0.a aVarA = q.a();
        Intrinsics.checkNotNullExpressionValue(aVarA, "builder(...)");
        return aVarA;
    }

    @Override // com.planner5d.library.application.b
    @NotNull
    public com.planner5d.library.application.d p() {
        return new l(this);
    }

    @Override // com.planner5d.library.application.b
    protected void x() {
        super.x();
        com.planner5d.library.application.c cVarA = com.planner5d.library.application.b.f142455c.a();
        com.planner5d.library.view.application.c.f244830b.c(com.planner5d.library.view.application.a.a().a(new com.planner5d.library.view.application.d(cVarA.k(), cVarA.D0(), cVarA.C(), m0.j.C8, cVarA.S0(), cVarA.d(), cVarA.L0())));
        com.planner5d.library.help.application.h.f179982b.c(com.planner5d.library.help.application.a.a().a(new com.planner5d.library.help.application.i(cVarA.k(), cVarA.D0(), cVarA.C(), m0.j.C8, cVarA.S0(), cVarA.d(), cVarA.w(), cVarA.C1(), cVarA.getConfigManager(), cVarA.J1(), cVarA.B0(), cVarA.n2(), t1.f217463b, cVarA.L0(), cVarA.a2(), cVarA.F1(), cVarA.b2(), cVarA.a0(), cVarA.B1(), cVarA.u(), cVarA.R1(), j1.f216988b, cVarA.m1())));
        com.planner5d.library.legal.application.e.f180321b.c(com.planner5d.library.legal.application.a.a().a(new com.planner5d.library.legal.application.f(cVarA.w(), cVarA.getConfigManager(), cVarA.C1(), cVarA.n2(), cVarA.getUserProperties(), cVarA.R1(), cVarA.W1(), cVarA.a2(), cVarA.d(), cVarA.m1())));
        com.planner5d.library.feed.application.c.f170894b.b(com.planner5d.library.feed.application.a.a().a(new com.planner5d.library.feed.application.d()));
        com.planner5d.library.aichat.application.a.f141896b.b(com.planner5d.library.aichat.application.t.a().a(new com.planner5d.library.aichat.application.b(cVarA.S0(), cVarA.k2(), cVarA.getConfigManager(), cVarA.J1(), cVarA.G0(), cVarA.R1(), cVarA.Z1(), cVarA.x1(), cVarA.Z(), cVarA.F1(), cVarA.i2(), cVarA.f(), cVarA.d())));
        com.planner5d.library.contest.application.a.f148393b.b(com.planner5d.library.contest.application.h0.a().a(new com.planner5d.library.contest.application.b(cVarA.S0(), cVarA.C(), cVarA.w1(), cVarA.D0(), cVarA.g2(), cVarA.x(), cVarA.F1(), cVarA.o1(), cVarA.a2(), cVarA.O1(), cVarA.L0(), new a(cVarA), new b(cVarA), cVarA.R1(), cVarA.n2(), cVarA.U1(), cVarA.k1(), new c(cVarA), cVarA.w(), new d(), cVarA.I(), cVarA.A1(), cVarA.v2(), cVarA.n(), cVarA.m1(), cVarA.Q0(), cVarA.l1(), cVarA.J1(), cVarA.H0())));
        com.planner5d.library.spaces.application.e.f229982b.b(com.planner5d.library.spaces.application.a.a().a(new com.planner5d.library.spaces.application.f(cVarA.S0(), cVarA.getConfigManager(), cVarA.J1(), cVarA.e1(), cVarA.I(), cVarA.m0(), cVarA.n2(), cVarA.p(), cVarA.u2(), cVarA.k2(), cVarA.m1(), cVarA.R1())));
    }

    @Override // com.planner5d.library.application.b
    protected void z(@NotNull com.planner5d.library.application.c.a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        super.z(builder);
        if (builder instanceof h0.a) {
            ((h0.a) builder).b(o3.a().a(new x5(this, com.planner5d.library.widget.drawable.c.f254258a)).build());
        }
    }
}
