package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.manager.n1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class b0 implements fg.g<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f180944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<u> f180945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f180946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<n1> f180947d;

    public b0(ij.c<i> cVar, ij.c<u> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<n1> cVar4) {
        this.f180944a = cVar;
        this.f180945b = cVar2;
        this.f180946c = cVar3;
        this.f180947d = cVar4;
    }

    public static fg.g<y> a(ij.c<i> cVar, ij.c<u> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<n1> cVar4) {
        return new b0(cVar, cVar2, cVar3, cVar4);
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperCategory.application")
    public static void b(Object obj, com.planner5d.library.application.b bVar) {
        ((y) obj).f181273c = bVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperCategory.builtInDataManager")
    public static void c(Object obj, fg.e<i> eVar) {
        ((y) obj).f181271a = eVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperCategory.helperCatalog")
    public static void d(Object obj, Object obj2) {
        ((y) obj).f181272b = (u) obj2;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperCategory.languageManager")
    public static void e(Object obj, n1 n1Var) {
        ((y) obj).f181274d = n1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void injectMembers(y yVar) {
        c(yVar, dagger.internal.g.a(this.f180944a));
        d(yVar, this.f180945b.get());
        b(yVar, this.f180946c.get());
        e(yVar, this.f180947d.get());
    }
}
