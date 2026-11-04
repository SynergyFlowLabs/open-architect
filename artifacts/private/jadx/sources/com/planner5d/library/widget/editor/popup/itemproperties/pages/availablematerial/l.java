package com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial;

import com.planner5d.library.model.manager.k5;
import com.planner5d.library.services.utility.p0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class l implements dagger.internal.h<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f257358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p0> f257359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f257360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<k5> f257361d;

    public l(ij.c<com.planner5d.library.application.b> cVar, ij.c<p0> cVar2, ij.c<com.planner5d.library.model.manager.builtin.i> cVar3, ij.c<k5> cVar4) {
        this.f257358a = cVar;
        this.f257359b = cVar2;
        this.f257360c = cVar3;
        this.f257361d = cVar4;
    }

    public static l a(ij.c<com.planner5d.library.application.b> cVar, ij.c<p0> cVar2, ij.c<com.planner5d.library.model.manager.builtin.i> cVar3, ij.c<k5> cVar4) {
        return new l(cVar, cVar2, cVar3, cVar4);
    }

    public static k c(com.planner5d.library.application.b bVar, p0 p0Var, com.planner5d.library.model.manager.builtin.i iVar, k5 k5Var) {
        return new k(bVar, p0Var, iVar, k5Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f257358a.get(), this.f257359b.get(), this.f257360c.get(), this.f257361d.get());
    }
}
