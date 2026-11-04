package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.manager.n1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class w implements fg.g<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f181256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n1> f181257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f181258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<r> f181259d;

    public w(ij.c<i> cVar, ij.c<n1> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<r> cVar4) {
        this.f181256a = cVar;
        this.f181257b = cVar2;
        this.f181258c = cVar3;
        this.f181259d = cVar4;
    }

    public static fg.g<u> a(ij.c<i> cVar, ij.c<n1> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<r> cVar4) {
        return new w(cVar, cVar2, cVar3, cVar4);
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperCatalog.application")
    public static void b(Object obj, fg.e<com.planner5d.library.application.b> eVar) {
        ((u) obj).f181223c = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperCatalog.builtInDataManager")
    public static void c(Object obj, fg.e<i> eVar) {
        ((u) obj).f181221a = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperCatalog.helperCache")
    public static void d(Object obj, Object obj2) {
        ((u) obj).f181224d = (r) obj2;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperCatalog.languageManager")
    public static void e(Object obj, fg.e<n1> eVar) {
        ((u) obj).f181222b = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void injectMembers(u uVar) {
        c(uVar, dagger.internal.g.a(this.f181256a));
        e(uVar, dagger.internal.g.a(this.f181257b));
        b(uVar, dagger.internal.g.a(this.f181258c));
        d(uVar, this.f181259d.get());
    }
}
