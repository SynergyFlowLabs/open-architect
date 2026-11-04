package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class s implements dagger.internal.h<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.z> f137111a;

    public s(ij.c<com.planner5d.library.services.z> cVar) {
        this.f137111a = cVar;
    }

    public static s a(ij.c<com.planner5d.library.services.z> cVar) {
        return new s(cVar);
    }

    public static r c(com.planner5d.library.services.z zVar) {
        return new r(zVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f137111a.get());
    }
}
