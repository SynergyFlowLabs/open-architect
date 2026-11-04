package com.planner5d.library.contest.view.voting;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.q;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class n implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.data.i> f153920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y1> f153921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<x> f153922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f153923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<l3> f153924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<q> f153925f;

    public n(ij.c<com.planner5d.library.contest.data.i> cVar, ij.c<y1> cVar2, ij.c<x> cVar3, ij.c<ErrorMessageParser> cVar4, ij.c<l3> cVar5, ij.c<q> cVar6) {
        this.f153920a = cVar;
        this.f153921b = cVar2;
        this.f153922c = cVar3;
        this.f153923d = cVar4;
        this.f153924e = cVar5;
        this.f153925f = cVar6;
    }

    public static n a(ij.c<com.planner5d.library.contest.data.i> cVar, ij.c<y1> cVar2, ij.c<x> cVar3, ij.c<ErrorMessageParser> cVar4, ij.c<l3> cVar5, ij.c<q> cVar6) {
        return new n(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static m c(com.planner5d.library.contest.data.i iVar, y1 y1Var, x xVar, ErrorMessageParser errorMessageParser, l3 l3Var, q qVar) {
        return new m(iVar, y1Var, xVar, errorMessageParser, l3Var, qVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f153920a.get(), this.f153921b.get(), this.f153922c.get(), this.f153923d.get(), this.f153924e.get(), this.f153925f.get());
    }
}
