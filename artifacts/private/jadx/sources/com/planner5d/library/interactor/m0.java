package com.planner5d.library.interactor;

import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.o4;
import com.planner5d.library.model.manager.statistics.events.r3;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("com.planner5d.library.help.application.HelpScope")
public final class m0 implements dagger.internal.h<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<o4> f180227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<e1> f180228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<r3> f180229c;

    public m0(ij.c<o4> cVar, ij.c<e1> cVar2, ij.c<r3> cVar3) {
        this.f180227a = cVar;
        this.f180228b = cVar2;
        this.f180229c = cVar3;
    }

    public static m0 a(ij.c<o4> cVar, ij.c<e1> cVar2, ij.c<r3> cVar3) {
        return new m0(cVar, cVar2, cVar3);
    }

    public static l0 c(o4 o4Var, e1 e1Var, r3 r3Var) {
        return new l0(o4Var, e1Var, r3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f180227a.get(), this.f180228b.get(), this.f180229c.get());
    }
}
