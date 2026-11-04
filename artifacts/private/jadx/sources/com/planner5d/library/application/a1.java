package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class a1 implements dagger.internal.h<com.planner5d.library.api.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.support.b> f142448b;

    public a1(i iVar, ij.c<com.planner5d.library.api.support.b> cVar) {
        this.f142447a = iVar;
        this.f142448b = cVar;
    }

    public static a1 a(i iVar, ij.c<com.planner5d.library.api.support.b> cVar) {
        return new a1(iVar, cVar);
    }

    public static com.planner5d.library.api.b c(i iVar, com.planner5d.library.api.support.b bVar) {
        return (com.planner5d.library.api.b) dagger.internal.p.f(iVar.V(bVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.api.b get() {
        return c(this.f142447a, this.f142448b.get());
    }
}
