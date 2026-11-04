package com.planner5d.library.model.manager.crashreporting;

import com.planner5d.library.model.manager.c1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class w implements dagger.internal.h<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<sd.b> f191235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f191236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c1> f191237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f191238d;

    public w(ij.c<sd.b> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<c1> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4) {
        this.f191235a = cVar;
        this.f191236b = cVar2;
        this.f191237c = cVar3;
        this.f191238d = cVar4;
    }

    public static w a(ij.c<sd.b> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<c1> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4) {
        return new w(cVar, cVar2, cVar3, cVar4);
    }

    public static v c(sd.b bVar, com.planner5d.library.model.manager.builtin.i iVar, fg.e<c1> eVar, fg.e<com.planner5d.library.modules.user.user.t> eVar2) {
        return new v(bVar, iVar, eVar, eVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f191235a.get(), this.f191236b.get(), dagger.internal.g.a(this.f191237c), dagger.internal.g.a(this.f191238d));
    }
}
