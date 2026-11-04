package com.planner5d.library.widget.editor.popup.itemproperties;

import com.planner5d.library.model.manager.k5;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w implements dagger.internal.h<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f257883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f257884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<k5> f257885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<y> f257886d;

    public w(ij.c<p0> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<k5> cVar3, ij.c<y> cVar4) {
        this.f257883a = cVar;
        this.f257884b = cVar2;
        this.f257885c = cVar3;
        this.f257886d = cVar4;
    }

    public static w a(ij.c<p0> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<k5> cVar3, ij.c<y> cVar4) {
        return new w(cVar, cVar2, cVar3, cVar4);
    }

    public static v c(p0 p0Var, com.planner5d.library.model.manager.builtin.i iVar, k5 k5Var, y yVar) {
        return new v(p0Var, iVar, k5Var, yVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f257883a.get(), this.f257884b.get(), this.f257885c.get(), this.f257886d.get());
    }
}
