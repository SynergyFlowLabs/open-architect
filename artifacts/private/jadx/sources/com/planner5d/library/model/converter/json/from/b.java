package com.planner5d.library.model.converter.json.from;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f180572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<dd.a> f180573b;

    public b(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<dd.a> cVar2) {
        this.f180572a = cVar;
        this.f180573b = cVar2;
    }

    public static b a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<dd.a> cVar2) {
        return new b(cVar, cVar2);
    }

    public static a c(com.planner5d.library.model.manager.builtin.i iVar, dd.a aVar) {
        return new a(iVar, aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f180572a.get(), this.f180573b.get());
    }
}
