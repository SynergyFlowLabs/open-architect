package com.planner5d.library.activity.fragment.gallery;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class w implements dagger.internal.h<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f133908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f133909b;

    public w(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.application.b> cVar2) {
        this.f133908a = cVar;
        this.f133909b = cVar2;
    }

    public static w a(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.application.b> cVar2) {
        return new w(cVar, cVar2);
    }

    public static v c(com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.application.b bVar) {
        return new v(tVar, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f133908a.get(), this.f133909b.get());
    }
}
