package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.manager.n1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class b1 implements fg.g<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f180948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n1> f180949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f180950c;

    public b1(ij.c<i> cVar, ij.c<n1> cVar2, ij.c<com.planner5d.library.application.b> cVar3) {
        this.f180948a = cVar;
        this.f180949b = cVar2;
        this.f180950c = cVar3;
    }

    public static fg.g<y0> a(ij.c<i> cVar, ij.c<n1> cVar2, ij.c<com.planner5d.library.application.b> cVar3) {
        return new b1(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperSearch.application")
    public static void b(y0 y0Var, com.planner5d.library.application.b bVar) {
        y0Var.f181288d = bVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperSearch.builtInDataManager")
    public static void c(y0 y0Var, i iVar) {
        y0Var.f181286b = iVar;
    }

    @dagger.internal.j("com.planner5d.library.model.manager.builtin.HelperSearch.languageManager")
    public static void d(y0 y0Var, n1 n1Var) {
        y0Var.f181287c = n1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(y0 y0Var) {
        c(y0Var, this.f180948a.get());
        d(y0Var, this.f180949b.get());
        b(y0Var, this.f180950c.get());
    }
}
