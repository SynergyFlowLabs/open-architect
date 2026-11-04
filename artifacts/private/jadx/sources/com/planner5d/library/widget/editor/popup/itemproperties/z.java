package com.planner5d.library.widget.editor.popup.itemproperties;

import com.planner5d.library.model.manager.k5;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z implements dagger.internal.h<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.to.w> f257899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.x> f257900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f257901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<k5> f257902d;

    public z(ij.c<com.planner5d.library.model.converter.json.to.w> cVar, ij.c<com.planner5d.library.model.converter.json.from.x> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<k5> cVar4) {
        this.f257899a = cVar;
        this.f257900b = cVar2;
        this.f257901c = cVar3;
        this.f257902d = cVar4;
    }

    public static z a(ij.c<com.planner5d.library.model.converter.json.to.w> cVar, ij.c<com.planner5d.library.model.converter.json.from.x> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<k5> cVar4) {
        return new z(cVar, cVar2, cVar3, cVar4);
    }

    public static y c(com.planner5d.library.model.converter.json.to.w wVar, com.planner5d.library.model.converter.json.from.x xVar, com.planner5d.library.application.b bVar, k5 k5Var) {
        return new y(wVar, xVar, bVar, k5Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f257899a.get(), this.f257900b.get(), this.f257901c.get(), this.f257902d.get());
    }
}
