package com.planner5d.library.widget.editor.popup.itemproperties.pages.size;

import com.planner5d.library.model.manager.f2;
import com.planner5d.library.model.manager.k5;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r implements dagger.internal.h<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k5> f257727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f2> f257728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f257729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.interactor.e> f257730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f257731e;

    public r(ij.c<k5> cVar, ij.c<f2> cVar2, ij.c<com.planner5d.library.model.manager.builtin.i> cVar3, ij.c<com.planner5d.library.widget.editor.interactor.e> cVar4, ij.c<com.planner5d.library.model.manager.config.j> cVar5) {
        this.f257727a = cVar;
        this.f257728b = cVar2;
        this.f257729c = cVar3;
        this.f257730d = cVar4;
        this.f257731e = cVar5;
    }

    public static r a(ij.c<k5> cVar, ij.c<f2> cVar2, ij.c<com.planner5d.library.model.manager.builtin.i> cVar3, ij.c<com.planner5d.library.widget.editor.interactor.e> cVar4, ij.c<com.planner5d.library.model.manager.config.j> cVar5) {
        return new r(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static q c(k5 k5Var, f2 f2Var, com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.widget.editor.interactor.e eVar, com.planner5d.library.model.manager.config.j jVar) {
        return new q(k5Var, f2Var, iVar, eVar, jVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.f257727a.get(), this.f257728b.get(), this.f257729c.get(), this.f257730d.get(), this.f257731e.get());
    }
}
