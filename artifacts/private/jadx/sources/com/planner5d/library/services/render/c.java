package com.planner5d.library.services.render;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.i;
import com.planner5d.library.model.manager.j2;
import com.planner5d.library.services.utility.f1;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@e
@s("javax.inject.Singleton")
public final class c implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f224909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<j2> f224910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<x> f224911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<i> f224912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<f1> f224913e;

    public c(ij.c<com.planner5d.library.application.b> cVar, ij.c<j2> cVar2, ij.c<x> cVar3, ij.c<i> cVar4, ij.c<f1> cVar5) {
        this.f224909a = cVar;
        this.f224910b = cVar2;
        this.f224911c = cVar3;
        this.f224912d = cVar4;
        this.f224913e = cVar5;
    }

    public static c a(ij.c<com.planner5d.library.application.b> cVar, ij.c<j2> cVar2, ij.c<x> cVar3, ij.c<i> cVar4, ij.c<f1> cVar5) {
        return new c(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static a c(com.planner5d.library.application.b bVar, j2 j2Var, x xVar, fg.e<i> eVar, f1 f1Var) {
        return new a(bVar, j2Var, xVar, eVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f224909a.get(), this.f224910b.get(), this.f224911c.get(), g.a(this.f224912d), this.f224913e.get());
    }
}
