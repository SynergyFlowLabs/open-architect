package com.planner5d.library.application.designoftheday;

import com.planner5d.library.activity.fragment.x;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class e implements h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f142518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x> f142519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<ka.b> f142520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.feed.usecase.b> f142521d;

    public e(ij.c<com.planner5d.library.application.b> cVar, ij.c<x> cVar2, ij.c<ka.b> cVar3, ij.c<com.planner5d.library.feed.usecase.b> cVar4) {
        this.f142518a = cVar;
        this.f142519b = cVar2;
        this.f142520c = cVar3;
        this.f142521d = cVar4;
    }

    public static e a(ij.c<com.planner5d.library.application.b> cVar, ij.c<x> cVar2, ij.c<ka.b> cVar3, ij.c<com.planner5d.library.feed.usecase.b> cVar4) {
        return new e(cVar, cVar2, cVar3, cVar4);
    }

    public static d c(com.planner5d.library.application.b bVar, x xVar, ka.b bVar2, com.planner5d.library.feed.usecase.b bVar3) {
        return new d(bVar, xVar, bVar2, bVar3);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f142518a.get(), this.f142519b.get(), this.f142520c.get(), this.f142521d.get());
    }
}
