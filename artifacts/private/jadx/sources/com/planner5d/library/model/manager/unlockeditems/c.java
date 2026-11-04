package com.planner5d.library.model.manager.unlockeditems;

import com.planner5d.library.model.manager.config.j;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.services.utility.f1;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class c implements h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p> f222285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<j> f222286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f1> f222287c;

    public c(ij.c<p> cVar, ij.c<j> cVar2, ij.c<f1> cVar3) {
        this.f222285a = cVar;
        this.f222286b = cVar2;
        this.f222287c = cVar3;
    }

    public static c a(ij.c<p> cVar, ij.c<j> cVar2, ij.c<f1> cVar3) {
        return new c(cVar, cVar2, cVar3);
    }

    public static b c(p pVar, j jVar, f1 f1Var) {
        return new b(pVar, jVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f222285a.get(), this.f222286b.get(), this.f222287c.get());
    }
}
