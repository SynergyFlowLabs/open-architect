package com.planner5d.library.widget.editor.catalog;

import com.planner5d.library.model.manager.c3;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f0 implements dagger.internal.h<v.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c3> f254614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<g> f254615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<le.h> f254616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.d> f254617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f254618e;

    public f0(ij.c<c3> cVar, ij.c<g> cVar2, ij.c<le.h> cVar3, ij.c<com.planner5d.library.model.manager.config.d> cVar4, ij.c<com.planner5d.library.model.manager.config.j> cVar5) {
        this.f254614a = cVar;
        this.f254615b = cVar2;
        this.f254616c = cVar3;
        this.f254617d = cVar4;
        this.f254618e = cVar5;
    }

    public static f0 a(ij.c<c3> cVar, ij.c<g> cVar2, ij.c<le.h> cVar3, ij.c<com.planner5d.library.model.manager.config.d> cVar4, ij.c<com.planner5d.library.model.manager.config.j> cVar5) {
        return new f0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static v.c c(c3 c3Var, g gVar, le.h hVar, com.planner5d.library.model.manager.config.d dVar, com.planner5d.library.model.manager.config.j jVar) {
        return new v.c(c3Var, gVar, hVar, dVar, jVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v.c get() {
        return c(this.f254614a.get(), this.f254615b.get(), this.f254616c.get(), this.f254617d.get(), this.f254618e.get());
    }
}
