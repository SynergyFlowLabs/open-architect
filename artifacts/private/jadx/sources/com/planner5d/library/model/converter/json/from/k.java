package com.planner5d.library.model.converter.json.from;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class k implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f180607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.userimporteddata.n> f180608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f180609d;

    public k(ij.c<z> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<com.planner5d.library.userimporteddata.n> cVar3, ij.c<com.planner5d.library.application.d> cVar4) {
        this.f180606a = cVar;
        this.f180607b = cVar2;
        this.f180608c = cVar3;
        this.f180609d = cVar4;
    }

    public static k a(ij.c<z> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<com.planner5d.library.userimporteddata.n> cVar3, ij.c<com.planner5d.library.application.d> cVar4) {
        return new k(cVar, cVar2, cVar3, cVar4);
    }

    public static j c() {
        return new j();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        j jVarC = c();
        l.d(jVarC, this.f180606a.get());
        l.b(jVarC, this.f180607b.get());
        l.f(jVarC, this.f180608c.get());
        l.c(jVarC, this.f180609d.get());
        return jVarC;
    }
}
