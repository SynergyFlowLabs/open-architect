package com.planner5d.library.application.designoftheday;

import com.planner5d.library.model.manager.y0;
import dagger.internal.h;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class b implements h<com.planner5d.library.feed.view.holders.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f142501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y0> f142502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<d> f142503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<kc.a> f142504d;

    public b(a aVar, ij.c<y0> cVar, ij.c<d> cVar2, ij.c<kc.a> cVar3) {
        this.f142501a = aVar;
        this.f142502b = cVar;
        this.f142503c = cVar2;
        this.f142504d = cVar3;
    }

    public static b a(a aVar, ij.c<y0> cVar, ij.c<d> cVar2, ij.c<kc.a> cVar3) {
        return new b(aVar, cVar, cVar2, cVar3);
    }

    public static com.planner5d.library.feed.view.holders.b c(a aVar, y0 y0Var, d dVar, kc.a aVar2) {
        return (com.planner5d.library.feed.view.holders.b) p.f(aVar.a(y0Var, dVar, aVar2));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.feed.view.holders.b get() {
        return c(this.f142501a, this.f142502b.get(), this.f142503c.get(), this.f142504d.get());
    }
}
