package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class g implements dagger.internal.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f191456a;

    public g(ij.c<com.planner5d.library.modules.user.user.t> cVar) {
        this.f191456a = cVar;
    }

    public static g a(ij.c<com.planner5d.library.modules.user.user.t> cVar) {
        return new g(cVar);
    }

    public static f c(com.planner5d.library.modules.user.user.t tVar) {
        return new f(tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f191456a.get());
    }
}
