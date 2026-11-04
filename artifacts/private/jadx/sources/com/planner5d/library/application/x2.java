package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x2 implements dagger.internal.h<com.planner5d.library.model.manager.config.attributes.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.attributes.a> f148319b;

    public x2(i iVar, ij.c<com.planner5d.library.model.manager.config.attributes.a> cVar) {
        this.f148318a = iVar;
        this.f148319b = cVar;
    }

    public static x2 a(i iVar, ij.c<com.planner5d.library.model.manager.config.attributes.a> cVar) {
        return new x2(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.config.attributes.c c(i iVar, com.planner5d.library.model.manager.config.attributes.a aVar) {
        return (com.planner5d.library.model.manager.config.attributes.c) dagger.internal.p.f(iVar.W0(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.config.attributes.c get() {
        return c(this.f148318a, this.f148319b.get());
    }
}
