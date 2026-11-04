package com.planner5d.library.aichat.view.fragment;

import com.planner5d.library.model.manager.statistics.events.i3;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class n implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ya.a> f142205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.h> f142206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<i3> f142207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<ya.b> f142208d;

    public n(ij.c<ya.a> cVar, ij.c<com.planner5d.library.model.manager.h> cVar2, ij.c<i3> cVar3, ij.c<ya.b> cVar4) {
        this.f142205a = cVar;
        this.f142206b = cVar2;
        this.f142207c = cVar3;
        this.f142208d = cVar4;
    }

    public static n a(ij.c<ya.a> cVar, ij.c<com.planner5d.library.model.manager.h> cVar2, ij.c<i3> cVar3, ij.c<ya.b> cVar4) {
        return new n(cVar, cVar2, cVar3, cVar4);
    }

    public static m c(ya.a aVar, com.planner5d.library.model.manager.h hVar, i3 i3Var, ya.b bVar) {
        return new m(aVar, hVar, i3Var, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f142205a.get(), this.f142206b.get(), this.f142207c.get(), this.f142208d.get());
    }
}
