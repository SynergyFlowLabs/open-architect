package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class e0 implements fg.g<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f180582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<z> f180583b;

    public e0(ij.c<p0> cVar, ij.c<z> cVar2) {
        this.f180582a = cVar;
        this.f180583b = cVar2;
    }

    public static fg.g<c0> a(ij.c<p0> cVar, ij.c<z> cVar2) {
        return new e0(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.from.ToModel2D.converter")
    public static void b(c0 c0Var, z zVar) {
        c0Var.f180578b = zVar;
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.from.ToModel2D.formatter")
    public static void c(c0 c0Var, p0 p0Var) {
        c0Var.f180577a = p0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(c0 c0Var) {
        c(c0Var, this.f180582a.get());
        b(c0Var, this.f180583b.get());
    }
}
