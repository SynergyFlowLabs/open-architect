package com.planner5d.library.services.utility;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
public final class c1 implements fg.g<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<w1> f225167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p0.a> f225168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.u1> f225169c;

    public c1(ij.c<w1> cVar, ij.c<p0.a> cVar2, ij.c<com.planner5d.library.model.manager.u1> cVar3) {
        this.f225167a = cVar;
        this.f225168b = cVar2;
        this.f225169c = cVar3;
    }

    public static fg.g<p0> a(ij.c<w1> cVar, ij.c<p0.a> cVar2, ij.c<com.planner5d.library.model.manager.u1> cVar3) {
        return new c1(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.services.utility.Formatter.localeProvider")
    public static void b(p0 p0Var, w1 w1Var) {
        p0Var.f229696a = w1Var;
    }

    @dagger.internal.j("com.planner5d.library.services.utility.Formatter.logRecordManager")
    public static void c(p0 p0Var, fg.e<com.planner5d.library.model.manager.u1> eVar) {
        p0Var.f229698c = eVar;
    }

    @dagger.internal.j("com.planner5d.library.services.utility.Formatter.unknownColorFormatHandler")
    public static void e(p0 p0Var, fg.e<p0.a> eVar) {
        p0Var.f229697b = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(p0 p0Var) {
        b(p0Var, this.f225167a.get());
        e(p0Var, dagger.internal.g.a(this.f225168b));
        c(p0Var, dagger.internal.g.a(this.f225169c));
    }
}
