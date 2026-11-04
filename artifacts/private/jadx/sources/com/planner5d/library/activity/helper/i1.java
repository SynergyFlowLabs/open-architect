package com.planner5d.library.activity.helper;

import com.planner5d.library.model.manager.b4;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i1 implements dagger.internal.h<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b4> f136909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f136910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f136911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.b2> f136912d;

    public i1(ij.c<b4> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<com.planner5d.library.modules.user.user.t0> cVar3, ij.c<com.planner5d.library.model.manager.b2> cVar4) {
        this.f136909a = cVar;
        this.f136910b = cVar2;
        this.f136911c = cVar3;
        this.f136912d = cVar4;
    }

    public static i1 a(ij.c<b4> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<com.planner5d.library.modules.user.user.t0> cVar3, ij.c<com.planner5d.library.model.manager.b2> cVar4) {
        return new i1(cVar, cVar2, cVar3, cVar4);
    }

    public static f1 c() {
        return new f1();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 get() {
        f1 f1VarC = c();
        j1.d(f1VarC, this.f136909a.get());
        j1.e(f1VarC, this.f136910b.get());
        j1.f(f1VarC, this.f136911c.get());
        j1.c(f1VarC, this.f136912d.get());
        return f1VarC;
    }
}
