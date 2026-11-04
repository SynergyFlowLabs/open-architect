package com.planner5d.library.model.manager.initialization;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class w implements dagger.internal.h<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.b0> f191715a;

    public w(ij.c<com.planner5d.library.model.manager.statistics.b0> cVar) {
        this.f191715a = cVar;
    }

    public static w a(ij.c<com.planner5d.library.model.manager.statistics.b0> cVar) {
        return new w(cVar);
    }

    public static v c(fg.e<com.planner5d.library.model.manager.statistics.b0> eVar) {
        return new v(eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(dagger.internal.g.a(this.f191715a));
    }
}
