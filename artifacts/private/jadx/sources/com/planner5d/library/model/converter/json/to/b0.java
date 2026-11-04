package com.planner5d.library.model.converter.json.to;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class b0 implements fg.g<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<w> f180643a;

    public b0(ij.c<w> cVar) {
        this.f180643a = cVar;
    }

    public static fg.g<z> a(ij.c<w> cVar) {
        return new b0(cVar);
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.to.FromMaterials.converter")
    public static void b(z zVar, w wVar) {
        zVar.f180676a = wVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(z zVar) {
        b(zVar, this.f180643a.get());
    }
}
