package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class k2 implements dagger.internal.h<j2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f191803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.download.a> f191804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.render.a> f191805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.upload.a> f191806d;

    public k2(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.services.download.a> cVar2, ij.c<com.planner5d.library.services.render.a> cVar3, ij.c<com.planner5d.library.services.upload.a> cVar4) {
        this.f191803a = cVar;
        this.f191804b = cVar2;
        this.f191805c = cVar3;
        this.f191806d = cVar4;
    }

    public static k2 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.services.download.a> cVar2, ij.c<com.planner5d.library.services.render.a> cVar3, ij.c<com.planner5d.library.services.upload.a> cVar4) {
        return new k2(cVar, cVar2, cVar3, cVar4);
    }

    public static j2 c(com.planner5d.library.application.b bVar, fg.e<com.planner5d.library.services.download.a> eVar, fg.e<com.planner5d.library.services.render.a> eVar2, fg.e<com.planner5d.library.services.upload.a> eVar3) {
        return new j2(bVar, eVar, eVar2, eVar3);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j2 get() {
        return c(this.f191803a.get(), dagger.internal.g.a(this.f191804b), dagger.internal.g.a(this.f191805c), dagger.internal.g.a(this.f191806d));
    }
}
