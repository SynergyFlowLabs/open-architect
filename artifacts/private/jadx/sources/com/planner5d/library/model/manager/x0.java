package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class x0 implements dagger.internal.h<w0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.n> f222385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.d> f222386b;

    public x0(ij.c<com.planner5d.library.model.manager.builtin.n> cVar, ij.c<com.planner5d.library.services.bitmaploader.d> cVar2) {
        this.f222385a = cVar;
        this.f222386b = cVar2;
    }

    public static x0 a(ij.c<com.planner5d.library.model.manager.builtin.n> cVar, ij.c<com.planner5d.library.services.bitmaploader.d> cVar2) {
        return new x0(cVar, cVar2);
    }

    public static w0 c(fg.e<com.planner5d.library.model.manager.builtin.n> eVar, fg.e<com.planner5d.library.services.bitmaploader.d> eVar2) {
        return new w0(eVar, eVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w0 get() {
        return c(dagger.internal.g.a(this.f222385a), dagger.internal.g.a(this.f222386b));
    }
}
