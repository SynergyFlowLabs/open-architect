package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class y implements fg.g<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f180675a;

    public y(ij.c<p0> cVar) {
        this.f180675a = cVar;
    }

    public static fg.g<w> a(ij.c<p0> cVar) {
        return new y(cVar);
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.to.FromMaterial.formatter")
    public static void b(w wVar, p0 p0Var) {
        wVar.f180673a = p0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(w wVar) {
        b(wVar, this.f180675a.get());
    }
}
