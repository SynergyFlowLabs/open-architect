package com.planner5d.library.activity.fragment.spaces.dashboard;

import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.z;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class k implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f136139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f136140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<z> f136141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<ia.b> f136142d;

    public k(ij.c<com.planner5d.library.model.manager.config.j> cVar, ij.c<t> cVar2, ij.c<z> cVar3, ij.c<ia.b> cVar4) {
        this.f136139a = cVar;
        this.f136140b = cVar2;
        this.f136141c = cVar3;
        this.f136142d = cVar4;
    }

    public static k a(ij.c<com.planner5d.library.model.manager.config.j> cVar, ij.c<t> cVar2, ij.c<z> cVar3, ij.c<ia.b> cVar4) {
        return new k(cVar, cVar2, cVar3, cVar4);
    }

    public static j c(com.planner5d.library.model.manager.config.j jVar, t tVar, z zVar, ia.b bVar) {
        return new j(jVar, tVar, zVar, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f136139a.get(), this.f136140b.get(), this.f136141c.get(), this.f136142d.get());
    }
}
