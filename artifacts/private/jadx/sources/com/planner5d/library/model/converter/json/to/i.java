package com.planner5d.library.model.converter.json.to;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f180656b;

    public i(ij.c<z> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2) {
        this.f180655a = cVar;
        this.f180656b = cVar2;
    }

    public static i a(ij.c<z> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2) {
        return new i(cVar, cVar2);
    }

    public static h c() {
        return new h();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        h hVarC = c();
        j.c(hVarC, this.f180655a.get());
        j.b(hVarC, this.f180656b.get());
        return hVarC;
    }
}
