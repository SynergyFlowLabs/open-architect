package com.planner5d.library.activity.fragment.dialog.about;

import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.o4;
import com.planner5d.library.model.manager.q4;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.t2;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.z4;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.u;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class a implements g<About> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<q4> f131664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<e1> f131665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<o4> f131666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<u1> f131667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t2> f131668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<w> f131669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<r3> f131670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<z4> f131671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<u> f131672i;

    public a(ij.c<q4> cVar, ij.c<e1> cVar2, ij.c<o4> cVar3, ij.c<u1> cVar4, ij.c<t2> cVar5, ij.c<w> cVar6, ij.c<r3> cVar7, ij.c<z4> cVar8, ij.c<u> cVar9) {
        this.f131664a = cVar;
        this.f131665b = cVar2;
        this.f131666c = cVar3;
        this.f131667d = cVar4;
        this.f131668e = cVar5;
        this.f131669f = cVar6;
        this.f131670g = cVar7;
        this.f131671h = cVar8;
        this.f131672i = cVar9;
    }

    public static g<About> a(ij.c<q4> cVar, ij.c<e1> cVar2, ij.c<o4> cVar3, ij.c<u1> cVar4, ij.c<t2> cVar5, ij.c<w> cVar6, ij.c<r3> cVar7, ij.c<z4> cVar8, ij.c<u> cVar9) {
        return new a(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    @j("com.planner5d.library.activity.fragment.dialog.about.About.installationManager")
    public static void b(About about, e1 e1Var) {
        about.f131656p3 = e1Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.about.About.libraryDialogFactory")
    public static void c(About about, u uVar) {
        about.f131663w3 = uVar;
    }

    @j("com.planner5d.library.activity.fragment.dialog.about.About.logRecordManager")
    public static void d(About about, u1 u1Var) {
        about.f131658r3 = u1Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.about.About.paymentsManager")
    public static void f(About about, t2 t2Var) {
        about.f131659s3 = t2Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.about.About.statisticsEventGeneric")
    public static void g(About about, r3 r3Var) {
        about.f131661u3 = r3Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.about.About.supportManager")
    public static void h(About about, o4 o4Var) {
        about.f131657q3 = o4Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.about.About.supportManagerData")
    public static void i(About about, q4 q4Var) {
        about.f131655o3 = q4Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.about.About.supportUrlProvider")
    public static void j(About about, z4 z4Var) {
        about.f131662v3 = z4Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.about.About.userAuthorizationService")
    public static void k(About about, w wVar) {
        about.f131660t3 = wVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(About about) {
        i(about, this.f131664a.get());
        b(about, this.f131665b.get());
        h(about, this.f131666c.get());
        d(about, this.f131667d.get());
        f(about, this.f131668e.get());
        k(about, this.f131669f.get());
        g(about, this.f131670g.get());
        j(about, this.f131671h.get());
        c(about, this.f131672i.get());
    }
}
