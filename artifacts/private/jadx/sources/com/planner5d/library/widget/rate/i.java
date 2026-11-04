package com.planner5d.library.widget.rate;

import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.services.utility.f1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class i implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p> f258705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<e> f258706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<a> f258707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<f1> f258708d;

    public i(ij.c<p> cVar, ij.c<e> cVar2, ij.c<a> cVar3, ij.c<f1> cVar4) {
        this.f258705a = cVar;
        this.f258706b = cVar2;
        this.f258707c = cVar3;
        this.f258708d = cVar4;
    }

    public static i a(ij.c<p> cVar, ij.c<e> cVar2, ij.c<a> cVar3, ij.c<f1> cVar4) {
        return new i(cVar, cVar2, cVar3, cVar4);
    }

    public static g c(p pVar, e eVar, a aVar, f1 f1Var) {
        return new g(pVar, eVar, aVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f258705a.get(), this.f258706b.get(), this.f258707c.get(), this.f258708d.get());
    }
}
