package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class q implements fg.g<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f180666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b> f180667b;

    public q(ij.c<p0> cVar, ij.c<b> cVar2) {
        this.f180666a = cVar;
        this.f180667b = cVar2;
    }

    public static fg.g<o> a(ij.c<p0> cVar, ij.c<b> cVar2) {
        return new q(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.to.FromItemProject.converter")
    public static void b(o oVar, b bVar) {
        oVar.f180663b = bVar;
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.to.FromItemProject.formatter")
    public static void c(o oVar, p0 p0Var) {
        oVar.f180662a = p0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(o oVar) {
        c(oVar, this.f180666a.get());
        b(oVar, this.f180667b.get());
    }
}
