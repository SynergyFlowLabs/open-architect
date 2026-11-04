package com.planner5d.library.activity.fragment.feed.interactor;

import com.planner5d.library.model.manager.u1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<u1> f133490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.i> f133491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.feed.data.g> f133492c;

    public f(ij.c<u1> cVar, ij.c<com.planner5d.library.model.i> cVar2, ij.c<com.planner5d.library.feed.data.g> cVar3) {
        this.f133490a = cVar;
        this.f133491b = cVar2;
        this.f133492c = cVar3;
    }

    public static f a(ij.c<u1> cVar, ij.c<com.planner5d.library.model.i> cVar2, ij.c<com.planner5d.library.feed.data.g> cVar3) {
        return new f(cVar, cVar2, cVar3);
    }

    public static e c(u1 u1Var, com.planner5d.library.model.i iVar, com.planner5d.library.feed.data.g gVar) {
        return new e(u1Var, iVar, gVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f133490a.get(), this.f133491b.get(), this.f133492c.get());
    }
}
