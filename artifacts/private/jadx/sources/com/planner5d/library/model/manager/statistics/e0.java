package com.planner5d.library.model.manager.statistics;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e0 implements dagger.internal.h<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<f> f216626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<i> f216627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f216628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<g> f216629d;

    public e0(ij.c<f> cVar, ij.c<i> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<g> cVar4) {
        this.f216626a = cVar;
        this.f216627b = cVar2;
        this.f216628c = cVar3;
        this.f216629d = cVar4;
    }

    public static e0 a(ij.c<f> cVar, ij.c<i> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<g> cVar4) {
        return new e0(cVar, cVar2, cVar3, cVar4);
    }

    public static b0 c(fg.e<f> eVar, fg.e<i> eVar2, fg.e<com.planner5d.library.modules.user.user.t> eVar3, fg.e<g> eVar4) {
        return new b0(eVar, eVar2, eVar3, eVar4);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(dagger.internal.g.a(this.f216626a), dagger.internal.g.a(this.f216627b), dagger.internal.g.a(this.f216628c), dagger.internal.g.a(this.f216629d));
    }
}
