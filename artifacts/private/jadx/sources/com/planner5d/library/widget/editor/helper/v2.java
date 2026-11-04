package com.planner5d.library.widget.editor.helper;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v2 implements dagger.internal.h<u2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f256808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f256809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f256810c;

    public v2(ij.c<com.planner5d.library.model.manager.config.j> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<com.planner5d.library.services.utility.f1> cVar3) {
        this.f256808a = cVar;
        this.f256809b = cVar2;
        this.f256810c = cVar3;
    }

    public static v2 a(ij.c<com.planner5d.library.model.manager.config.j> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<com.planner5d.library.services.utility.f1> cVar3) {
        return new v2(cVar, cVar2, cVar3);
    }

    public static u2 c(com.planner5d.library.model.manager.config.j jVar, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.services.utility.f1 f1Var) {
        return new u2(jVar, pVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u2 get() {
        return c(this.f256808a.get(), this.f256809b.get(), this.f256810c.get());
    }
}
