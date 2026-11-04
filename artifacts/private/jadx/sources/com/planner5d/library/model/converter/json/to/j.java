package com.planner5d.library.model.converter.json.to;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class j implements fg.g<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f180658b;

    public j(ij.c<z> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2) {
        this.f180657a = cVar;
        this.f180658b = cVar2;
    }

    public static fg.g<h> a(ij.c<z> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2) {
        return new j(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.to.FromItemNs.builtInDataManager")
    public static void b(h hVar, com.planner5d.library.model.manager.builtin.i iVar) {
        hVar.f180654b = iVar;
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.to.FromItemNs.converter")
    public static void c(h hVar, z zVar) {
        hVar.f180653a = zVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(h hVar) {
        c(hVar, this.f180657a.get());
        b(hVar, this.f180658b.get());
    }
}
