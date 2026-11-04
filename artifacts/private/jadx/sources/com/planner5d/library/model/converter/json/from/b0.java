package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class b0 implements fg.g<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<x> f180574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p0> f180575b;

    public b0(ij.c<x> cVar, ij.c<p0> cVar2) {
        this.f180574a = cVar;
        this.f180575b = cVar2;
    }

    public static fg.g<z> a(ij.c<x> cVar, ij.c<p0> cVar2) {
        return new b0(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.from.ToMaterials.converter")
    public static void b(z zVar, x xVar) {
        zVar.f180639a = xVar;
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.from.ToMaterials.formatter")
    public static void c(z zVar, p0 p0Var) {
        zVar.f180640b = p0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(z zVar) {
        b(zVar, this.f180574a.get());
        c(zVar, this.f180575b.get());
    }
}
