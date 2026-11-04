package com.planner5d.library.widget.editor.popup.itemproperties.pages.material;

import com.planner5d.library.services.utility.p0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f257393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f257394b;

    public j(ij.c<p0> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2) {
        this.f257393a = cVar;
        this.f257394b = cVar2;
    }

    public static j a(ij.c<p0> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2) {
        return new j(cVar, cVar2);
    }

    public static i c(p0 p0Var, com.planner5d.library.model.manager.builtin.i iVar) {
        return new i(p0Var, iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f257393a.get(), this.f257394b.get());
    }
}
