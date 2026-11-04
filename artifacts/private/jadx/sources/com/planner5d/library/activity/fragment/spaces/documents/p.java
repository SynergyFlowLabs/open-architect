package com.planner5d.library.activity.fragment.spaces.documents;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.statistics.events.n3;
import com.planner5d.library.model.manager.y1;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class p implements dagger.internal.h<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.spaces.documents.c> f136227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y1> f136228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<x> f136229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.r> f136230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f136231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<n3> f136232f;

    public p(ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar, ij.c<y1> cVar2, ij.c<x> cVar3, ij.c<com.planner5d.library.activity.helper.r> cVar4, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar5, ij.c<n3> cVar6) {
        this.f136227a = cVar;
        this.f136228b = cVar2;
        this.f136229c = cVar3;
        this.f136230d = cVar4;
        this.f136231e = cVar5;
        this.f136232f = cVar6;
    }

    public static p a(ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar, ij.c<y1> cVar2, ij.c<x> cVar3, ij.c<com.planner5d.library.activity.helper.r> cVar4, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar5, ij.c<n3> cVar6) {
        return new p(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static o c(com.planner5d.library.model.manager.spaces.documents.c cVar, y1 y1Var, x xVar, com.planner5d.library.activity.helper.r rVar, com.planner5d.library.activity.fragment.dialog.k kVar, n3 n3Var) {
        return new o(cVar, y1Var, xVar, rVar, kVar, n3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c(this.f136227a.get(), this.f136228b.get(), this.f136229c.get(), this.f136230d.get(), this.f136231e.get(), this.f136232f.get());
    }
}
