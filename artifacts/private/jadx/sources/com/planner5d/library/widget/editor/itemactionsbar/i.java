package com.planner5d.library.widget.editor.itemactionsbar;

import com.planner5d.library.services.utility.f1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f256967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f256968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f256969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<f1> f256970d;

    public i(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.model.manager.config.j> cVar3, ij.c<f1> cVar4) {
        this.f256967a = cVar;
        this.f256968b = cVar2;
        this.f256969c = cVar3;
        this.f256970d = cVar4;
    }

    public static i a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.model.manager.config.j> cVar3, ij.c<f1> cVar4) {
        return new i(cVar, cVar2, cVar3, cVar4);
    }

    public static h c(com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.activity.fragment.dialog.k kVar, com.planner5d.library.model.manager.config.j jVar, f1 f1Var) {
        return new h(iVar, kVar, jVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f256967a.get(), this.f256968b.get(), this.f256969c.get(), this.f256970d.get());
    }
}
