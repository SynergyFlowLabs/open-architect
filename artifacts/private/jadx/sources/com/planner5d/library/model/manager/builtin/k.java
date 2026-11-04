package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.item.builder.ItemBuilder;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class k implements fg.g<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<n1> f181068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f181069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p0> f181070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<y> f181071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<u> f181072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<r> f181073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f181074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<ItemBuilder> f181075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.to.o> f181076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<p> f181077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<v0> f181078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.managedfiles.a0> f181079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f181080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<l0> f181081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<t1> f181082o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ij.c<g0> f181083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.z> f181084t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ij.c<le.f> f181085v;

    public k(ij.c<n1> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<p0> cVar3, ij.c<y> cVar4, ij.c<u> cVar5, ij.c<r> cVar6, ij.c<com.planner5d.library.application.b> cVar7, ij.c<ItemBuilder> cVar8, ij.c<com.planner5d.library.model.converter.json.to.o> cVar9, ij.c<p> cVar10, ij.c<v0> cVar11, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar12, ij.c<com.planner5d.library.modules.user.user.t0> cVar13, ij.c<l0> cVar14, ij.c<t1> cVar15, ij.c<g0> cVar16, ij.c<com.planner5d.library.services.z> cVar17, ij.c<le.f> cVar18) {
        this.f181068a = cVar;
        this.f181069b = cVar2;
        this.f181070c = cVar3;
        this.f181071d = cVar4;
        this.f181072e = cVar5;
        this.f181073f = cVar6;
        this.f181074g = cVar7;
        this.f181075h = cVar8;
        this.f181076i = cVar9;
        this.f181077j = cVar10;
        this.f181078k = cVar11;
        this.f181079l = cVar12;
        this.f181080m = cVar13;
        this.f181081n = cVar14;
        this.f181082o = cVar15;
        this.f181083s = cVar16;
        this.f181084t = cVar17;
        this.f181085v = cVar18;
    }

    public static fg.g<i> a(ij.c<n1> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<p0> cVar3, ij.c<y> cVar4, ij.c<u> cVar5, ij.c<r> cVar6, ij.c<com.planner5d.library.application.b> cVar7, ij.c<ItemBuilder> cVar8, ij.c<com.planner5d.library.model.converter.json.to.o> cVar9, ij.c<p> cVar10, ij.c<v0> cVar11, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar12, ij.c<com.planner5d.library.modules.user.user.t0> cVar13, ij.c<l0> cVar14, ij.c<t1> cVar15, ij.c<g0> cVar16, ij.c<com.planner5d.library.services.z> cVar17, ij.c<le.f> cVar18) {
        return new k(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18);
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.application")
    public static void b(i iVar, com.planner5d.library.application.b bVar) {
        iVar.f181006i = bVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.converterProject")
    public static void c(i iVar, fg.e<com.planner5d.library.model.converter.json.to.o> eVar) {
        iVar.f181008k = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.datafileManager")
    public static void d(i iVar, fg.e<p> eVar) {
        iVar.f181009l = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.helperCache")
    public static void e(i iVar, Object obj) {
        iVar.f181005h = (r) obj;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.helperCatalog")
    public static void f(i iVar, Object obj) {
        iVar.f181004g = (u) obj;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.helperCategory")
    public static void g(i iVar, Object obj) {
        iVar.f181003f = (y) obj;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.helperDataUpdate")
    public static void h(i iVar, g0 g0Var) {
        iVar.f181015r = g0Var;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.helperDemoProjects")
    public static void i(i iVar, fg.e<l0> eVar) {
        iVar.f181013p = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.helperItem")
    public static void j(i iVar, Object obj) {
        iVar.f181002e = (p0) obj;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.helperMaterials")
    public static void k(i iVar, fg.e<v0> eVar) {
        iVar.f181010m = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.initializeFileManagerUseCase")
    public static void l(i iVar, le.f fVar) {
        iVar.f181017t = fVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.itemBuilder")
    public static void m(i iVar, fg.e<ItemBuilder> eVar) {
        iVar.f181007j = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.languageManager")
    public static void n(i iVar, n1 n1Var) {
        iVar.f181000c = n1Var;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.logRecordManager")
    public static void o(i iVar, fg.e<t1> eVar) {
        iVar.f181014q = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.managedFileManager")
    public static void p(i iVar, fg.e<com.planner5d.library.model.manager.managedfiles.a0> eVar) {
        iVar.f181011n = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.preferences")
    public static void r(i iVar, com.planner5d.library.model.manager.config.p pVar) {
        iVar.f181001d = pVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.privateFiles")
    public static void s(i iVar, com.planner5d.library.services.z zVar) {
        iVar.f181016s = zVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.BuiltInDataManager.userPurchases")
    public static void t(i iVar, fg.e<com.planner5d.library.modules.user.user.t0> eVar) {
        iVar.f181012o = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void injectMembers(i iVar) {
        n(iVar, this.f181068a.get());
        r(iVar, this.f181069b.get());
        j(iVar, this.f181070c.get());
        g(iVar, this.f181071d.get());
        f(iVar, this.f181072e.get());
        e(iVar, this.f181073f.get());
        b(iVar, this.f181074g.get());
        m(iVar, dagger.internal.g.a(this.f181075h));
        c(iVar, dagger.internal.g.a(this.f181076i));
        d(iVar, dagger.internal.g.a(this.f181077j));
        k(iVar, dagger.internal.g.a(this.f181078k));
        p(iVar, dagger.internal.g.a(this.f181079l));
        t(iVar, dagger.internal.g.a(this.f181080m));
        i(iVar, dagger.internal.g.a(this.f181081n));
        o(iVar, dagger.internal.g.a(this.f181082o));
        h(iVar, this.f181083s.get());
        s(iVar, this.f181084t.get());
        l(iVar, this.f181085v.get());
    }
}
