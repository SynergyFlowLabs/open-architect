package com.planner5d.library.widget.editor.popup.itemproperties.pages.size;

import com.planner5d.library.model.manager.f2;
import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l0 implements dagger.internal.h<k0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<f2> f257615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f257616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.userimporteddata.n> f257617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.projectresources.e> f257618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t1> f257619e;

    public l0(ij.c<f2> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<com.planner5d.library.userimporteddata.n> cVar3, ij.c<com.planner5d.library.widget.editor.projectresources.e> cVar4, ij.c<t1> cVar5) {
        this.f257615a = cVar;
        this.f257616b = cVar2;
        this.f257617c = cVar3;
        this.f257618d = cVar4;
        this.f257619e = cVar5;
    }

    public static l0 a(ij.c<f2> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<com.planner5d.library.userimporteddata.n> cVar3, ij.c<com.planner5d.library.widget.editor.projectresources.e> cVar4, ij.c<t1> cVar5) {
        return new l0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static k0 c(f2 f2Var, com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.userimporteddata.n nVar, com.planner5d.library.widget.editor.projectresources.e eVar, t1 t1Var) {
        return new k0(f2Var, iVar, nVar, eVar, t1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k0 get() {
        return c(this.f257615a.get(), this.f257616b.get(), this.f257617c.get(), this.f257618d.get(), this.f257619e.get());
    }
}
