package com.planner5d.library.activity.fragment.dialog.authentication;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f1 implements dagger.internal.h<e1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.b0> f131783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f131784b;

    public f1(ij.c<com.planner5d.library.model.manager.statistics.b0> cVar, ij.c<com.planner5d.library.model.manager.config.j> cVar2) {
        this.f131783a = cVar;
        this.f131784b = cVar2;
    }

    public static f1 a(ij.c<com.planner5d.library.model.manager.statistics.b0> cVar, ij.c<com.planner5d.library.model.manager.config.j> cVar2) {
        return new f1(cVar, cVar2);
    }

    public static e1 c(com.planner5d.library.model.manager.statistics.b0 b0Var, com.planner5d.library.model.manager.config.j jVar) {
        return new e1(b0Var, jVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e1 get() {
        return c(this.f131783a.get(), this.f131784b.get());
    }
}
