package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.manager.n1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a1 implements dagger.internal.h<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f180941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n1> f180942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f180943c;

    public a1(ij.c<i> cVar, ij.c<n1> cVar2, ij.c<com.planner5d.library.application.b> cVar3) {
        this.f180941a = cVar;
        this.f180942b = cVar2;
        this.f180943c = cVar3;
    }

    public static a1 a(ij.c<i> cVar, ij.c<n1> cVar2, ij.c<com.planner5d.library.application.b> cVar3) {
        return new a1(cVar, cVar2, cVar3);
    }

    public static y0 c() {
        return new y0();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y0 get() {
        y0 y0VarC = c();
        b1.c(y0VarC, this.f180941a.get());
        b1.d(y0VarC, this.f180942b.get());
        b1.b(y0VarC, this.f180943c.get());
        return y0VarC;
    }
}
