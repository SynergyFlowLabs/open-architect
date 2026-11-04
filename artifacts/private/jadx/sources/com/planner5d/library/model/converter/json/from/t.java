package com.planner5d.library.model.converter.json.from;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class t implements dagger.internal.h<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x> f180633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f180634c;

    public t(ij.c<z> cVar, ij.c<x> cVar2, ij.c<com.planner5d.library.model.manager.builtin.i> cVar3) {
        this.f180632a = cVar;
        this.f180633b = cVar2;
        this.f180634c = cVar3;
    }

    public static t a(ij.c<z> cVar, ij.c<x> cVar2, ij.c<com.planner5d.library.model.manager.builtin.i> cVar3) {
        return new t(cVar, cVar2, cVar3);
    }

    public static s c(z zVar, x xVar, com.planner5d.library.model.manager.builtin.i iVar) {
        return new s(zVar, xVar, iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f180632a.get(), this.f180633b.get(), this.f180634c.get());
    }
}
