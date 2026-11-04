package com.planner5d.library.dgenerator.fragment.gallery.pager;

import com.planner5d.library.activity.helper.b0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.j3;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s
public final class k implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<pd.a> f160228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<nb.c> f160229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b0> f160230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b2> f160231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<j3> f160232e;

    public k(ij.c<pd.a> cVar, ij.c<nb.c> cVar2, ij.c<b0> cVar3, ij.c<b2> cVar4, ij.c<j3> cVar5) {
        this.f160228a = cVar;
        this.f160229b = cVar2;
        this.f160230c = cVar3;
        this.f160231d = cVar4;
        this.f160232e = cVar5;
    }

    public static k a(ij.c<pd.a> cVar, ij.c<nb.c> cVar2, ij.c<b0> cVar3, ij.c<b2> cVar4, ij.c<j3> cVar5) {
        return new k(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static j c(pd.a aVar, nb.c cVar, b0 b0Var, b2 b2Var, j3 j3Var) {
        return new j(aVar, cVar, b0Var, b2Var, j3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f160228a.get(), this.f160229b.get(), this.f160230c.get(), this.f160231d.get(), this.f160232e.get());
    }
}
