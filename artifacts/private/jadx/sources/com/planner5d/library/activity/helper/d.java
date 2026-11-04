package com.planner5d.library.activity.helper;

import androidx.appcompat.app.d;
import com.planner5d.library.model.manager.v4;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class d<T extends androidx.appcompat.app.d> implements fg.g<a<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<u> f136722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<i0> f136723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<v4> f136724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.t1> f136725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f136726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.y0> f136727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.b0> f136728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f136729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.n> f136730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f136731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.g1> f136732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.c2> f136733l;

    public d(ij.c<u> cVar, ij.c<i0> cVar2, ij.c<v4> cVar3, ij.c<com.planner5d.library.model.manager.t1> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<com.planner5d.library.modules.user.user.y0> cVar6, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar7, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar8, ij.c<com.planner5d.library.model.manager.builtin.n> cVar9, ij.c<com.planner5d.library.model.manager.config.j> cVar10, ij.c<com.planner5d.library.modules.user.user.g1> cVar11, ij.c<com.planner5d.library.services.utility.c2> cVar12) {
        this.f136722a = cVar;
        this.f136723b = cVar2;
        this.f136724c = cVar3;
        this.f136725d = cVar4;
        this.f136726e = cVar5;
        this.f136727f = cVar6;
        this.f136728g = cVar7;
        this.f136729h = cVar8;
        this.f136730i = cVar9;
        this.f136731j = cVar10;
        this.f136732k = cVar11;
        this.f136733l = cVar12;
    }

    public static <T extends androidx.appcompat.app.d> fg.g<a<T>> a(ij.c<u> cVar, ij.c<i0> cVar2, ij.c<v4> cVar3, ij.c<com.planner5d.library.model.manager.t1> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<com.planner5d.library.modules.user.user.y0> cVar6, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar7, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar8, ij.c<com.planner5d.library.model.manager.builtin.n> cVar9, ij.c<com.planner5d.library.model.manager.config.j> cVar10, ij.c<com.planner5d.library.modules.user.user.g1> cVar11, ij.c<com.planner5d.library.services.utility.c2> cVar12) {
        return new d(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12);
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.dataManager")
    public static <T extends androidx.appcompat.app.d> void b(a<T> aVar, com.planner5d.library.model.manager.builtin.n nVar) {
        aVar.f136670i = nVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.featureConfigManager")
    public static <T extends androidx.appcompat.app.d> void c(a<T> aVar, com.planner5d.library.model.manager.config.j jVar) {
        aVar.f136671j = jVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.helperActivity")
    public static <T extends androidx.appcompat.app.d> void d(a<T> aVar, u uVar) {
        aVar.f136662a = uVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.helperLicensing")
    public static <T extends androidx.appcompat.app.d> void e(a<T> aVar, i0 i0Var) {
        aVar.f136663b = i0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.logRecordManager")
    public static <T extends androidx.appcompat.app.d> void f(a<T> aVar, fg.e<com.planner5d.library.model.manager.t1> eVar) {
        aVar.f136665d = eVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.networkStateUtility")
    public static <T extends androidx.appcompat.app.d> void h(a<T> aVar, com.planner5d.library.services.utility.c2 c2Var) {
        aVar.f136673l = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.statisticsManager")
    public static <T extends androidx.appcompat.app.d> void i(a<T> aVar, com.planner5d.library.model.manager.statistics.b0 b0Var) {
        aVar.f136668g = b0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.supportRepository")
    public static <T extends androidx.appcompat.app.d> void j(a<T> aVar, v4 v4Var) {
        aVar.f136664c = v4Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.synchronizationManager")
    public static <T extends androidx.appcompat.app.d> void k(a<T> aVar, com.planner5d.library.model.manager.synchronization.i iVar) {
        aVar.f136669h = iVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.userAuthorization")
    public static <T extends androidx.appcompat.app.d> void l(a<T> aVar, com.planner5d.library.modules.user.user.t tVar) {
        aVar.f136666e = tVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.userRemember")
    public static <T extends androidx.appcompat.app.d> void m(a<T> aVar, com.planner5d.library.modules.user.user.y0 y0Var) {
        aVar.f136667f = y0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.BaseContent.userSocial")
    public static <T extends androidx.appcompat.app.d> void n(a<T> aVar, com.planner5d.library.modules.user.user.g1 g1Var) {
        aVar.f136672k = g1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void injectMembers(a<T> aVar) {
        d(aVar, this.f136722a.get());
        e(aVar, this.f136723b.get());
        j(aVar, this.f136724c.get());
        f(aVar, dagger.internal.g.a(this.f136725d));
        l(aVar, this.f136726e.get());
        m(aVar, this.f136727f.get());
        i(aVar, this.f136728g.get());
        k(aVar, this.f136729h.get());
        b(aVar, this.f136730i.get());
        c(aVar, this.f136731j.get());
        n(aVar, this.f136732k.get());
        h(aVar, this.f136733l.get());
    }
}
