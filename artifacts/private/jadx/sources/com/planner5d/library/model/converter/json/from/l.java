package com.planner5d.library.model.converter.json.from;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class l implements fg.g<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f180611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.userimporteddata.n> f180612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f180613d;

    public l(ij.c<z> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<com.planner5d.library.userimporteddata.n> cVar3, ij.c<com.planner5d.library.application.d> cVar4) {
        this.f180610a = cVar;
        this.f180611b = cVar2;
        this.f180612c = cVar3;
        this.f180613d = cVar4;
    }

    public static fg.g<j> a(ij.c<z> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<com.planner5d.library.userimporteddata.n> cVar3, ij.c<com.planner5d.library.application.d> cVar4) {
        return new l(cVar, cVar2, cVar3, cVar4);
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.from.ToItemNs.builtInDataManager")
    public static void b(j jVar, com.planner5d.library.model.manager.builtin.i iVar) {
        jVar.f180603b = iVar;
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.from.ToItemNs.configuration")
    public static void c(j jVar, com.planner5d.library.application.d dVar) {
        jVar.f180605d = dVar;
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.from.ToItemNs.converterMaterials")
    public static void d(j jVar, z zVar) {
        jVar.f180602a = zVar;
    }

    @dagger.internal.j("com.planner5d.library.model.converter.json.from.ToItemNs.userImportedModelNameProcessor")
    public static void f(j jVar, com.planner5d.library.userimporteddata.n nVar) {
        jVar.f180604c = nVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(j jVar) {
        d(jVar, this.f180610a.get());
        b(jVar, this.f180611b.get());
        f(jVar, this.f180612c.get());
        c(jVar, this.f180613d.get());
    }
}
