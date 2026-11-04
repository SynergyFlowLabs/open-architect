package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class c0 implements dagger.internal.h<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.w> f136703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.z> f136704b;

    public c0(ij.c<com.planner5d.library.services.utility.w> cVar, ij.c<com.planner5d.library.services.z> cVar2) {
        this.f136703a = cVar;
        this.f136704b = cVar2;
    }

    public static c0 a(ij.c<com.planner5d.library.services.utility.w> cVar, ij.c<com.planner5d.library.services.z> cVar2) {
        return new c0(cVar, cVar2);
    }

    public static b0 c(com.planner5d.library.services.utility.w wVar, com.planner5d.library.services.z zVar) {
        return new b0(wVar, zVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(this.f136703a.get(), this.f136704b.get());
    }
}
