package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class r0 implements fg.g<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f181209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.a> f181210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.c0> f181211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.f> f181212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t1> f181213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f181214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<u> f181215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.c> f181216h;

    public r0(ij.c<i> cVar, ij.c<com.planner5d.library.model.converter.json.from.a> cVar2, ij.c<com.planner5d.library.model.converter.json.from.c0> cVar3, ij.c<com.planner5d.library.model.converter.json.from.f> cVar4, ij.c<t1> cVar5, ij.c<com.planner5d.library.services.utility.p0> cVar6, ij.c<u> cVar7, ij.c<com.planner5d.library.model.converter.json.from.c> cVar8) {
        this.f181209a = cVar;
        this.f181210b = cVar2;
        this.f181211c = cVar3;
        this.f181212d = cVar4;
        this.f181213e = cVar5;
        this.f181214f = cVar6;
        this.f181215g = cVar7;
        this.f181216h = cVar8;
    }

    public static fg.g<p0> a(ij.c<i> cVar, ij.c<com.planner5d.library.model.converter.json.from.a> cVar2, ij.c<com.planner5d.library.model.converter.json.from.c0> cVar3, ij.c<com.planner5d.library.model.converter.json.from.f> cVar4, ij.c<t1> cVar5, ij.c<com.planner5d.library.services.utility.p0> cVar6, ij.c<u> cVar7, ij.c<com.planner5d.library.model.converter.json.from.c> cVar8) {
        return new r0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperItem.builtInDataManager")
    public static void b(Object obj, fg.e<i> eVar) {
        ((p0) obj).f181183a = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperItem.converterCatalogItemMetadata")
    public static void c(Object obj, com.planner5d.library.model.converter.json.from.c cVar) {
        ((p0) obj).f181190h = cVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperItem.converterItem")
    public static void d(Object obj, fg.e<com.planner5d.library.model.converter.json.from.f> eVar) {
        ((p0) obj).f181186d = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperItem.converterModel2D")
    public static void e(Object obj, fg.e<com.planner5d.library.model.converter.json.from.c0> eVar) {
        ((p0) obj).f181185c = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperItem.formatter")
    public static void f(Object obj, com.planner5d.library.services.utility.p0 p0Var) {
        ((p0) obj).f181188f = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperItem.helperCatalog")
    public static void g(Object obj, Object obj2) {
        ((p0) obj).f181189g = (u) obj2;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperItem.logRecordManager")
    public static void h(Object obj, fg.e<t1> eVar) {
        ((p0) obj).f181187e = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperItem.providerModel")
    public static void j(Object obj, ij.c<com.planner5d.library.model.converter.json.from.a> cVar) {
        ((p0) obj).f181184b = cVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void injectMembers(p0 p0Var) {
        b(p0Var, dagger.internal.g.a(this.f181209a));
        j(p0Var, this.f181210b);
        e(p0Var, dagger.internal.g.a(this.f181211c));
        d(p0Var, dagger.internal.g.a(this.f181212d));
        h(p0Var, dagger.internal.g.a(this.f181213e));
        f(p0Var, this.f181214f.get());
        g(p0Var, this.f181215g.get());
        c(p0Var, this.f181216h.get());
    }
}
