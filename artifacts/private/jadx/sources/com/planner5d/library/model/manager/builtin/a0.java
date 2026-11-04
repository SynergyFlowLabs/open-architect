package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.manager.n1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class a0 implements dagger.internal.h<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f180937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<u> f180938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f180939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<n1> f180940d;

    public a0(ij.c<i> cVar, ij.c<u> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<n1> cVar4) {
        this.f180937a = cVar;
        this.f180938b = cVar2;
        this.f180939c = cVar3;
        this.f180940d = cVar4;
    }

    public static a0 a(ij.c<i> cVar, ij.c<u> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<n1> cVar4) {
        return new a0(cVar, cVar2, cVar3, cVar4);
    }

    public static y c() {
        return new y();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        y yVarC = c();
        b0.c(yVarC, dagger.internal.g.a(this.f180937a));
        b0.d(yVarC, this.f180938b.get());
        b0.b(yVarC, this.f180939c.get());
        b0.e(yVarC, this.f180940d.get());
        return yVarC;
    }
}
