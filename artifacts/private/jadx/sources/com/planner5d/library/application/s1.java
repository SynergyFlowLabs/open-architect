package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s1 implements dagger.internal.h<com.planner5d.library.feed.usecase.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ic.a> f148264b;

    public s1(i iVar, ij.c<ic.a> cVar) {
        this.f148263a = iVar;
        this.f148264b = cVar;
    }

    public static s1 a(i iVar, ij.c<ic.a> cVar) {
        return new s1(iVar, cVar);
    }

    public static com.planner5d.library.feed.usecase.b c(i iVar, ic.a aVar) {
        return (com.planner5d.library.feed.usecase.b) dagger.internal.p.f(iVar.p0(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.feed.usecase.b get() {
        return c(this.f148263a, this.f148264b.get());
    }
}
