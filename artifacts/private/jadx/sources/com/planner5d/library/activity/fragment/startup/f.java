package com.planner5d.library.activity.fragment.startup;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f136483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.b> f136484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f136485c;

    public f(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.modules.user.user.b> cVar2, ij.c<com.planner5d.library.model.manager.config.p> cVar3) {
        this.f136483a = cVar;
        this.f136484b = cVar2;
        this.f136485c = cVar3;
    }

    public static f a(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.modules.user.user.b> cVar2, ij.c<com.planner5d.library.model.manager.config.p> cVar3) {
        return new f(cVar, cVar2, cVar3);
    }

    public static e c(fg.e<com.planner5d.library.modules.user.user.t> eVar, com.planner5d.library.modules.user.user.b bVar, com.planner5d.library.model.manager.config.p pVar) {
        return new e(eVar, bVar, pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(dagger.internal.g.a(this.f136483a), this.f136484b.get(), this.f136485c.get());
    }
}
