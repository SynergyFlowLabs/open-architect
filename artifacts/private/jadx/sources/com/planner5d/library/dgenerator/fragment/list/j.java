package com.planner5d.library.dgenerator.fragment.list;

import com.planner5d.library.model.manager.y0;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
public final class j implements fg.g<AutoStyleListFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.imagechooser.j> f160325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f160326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<y0> f160327c;

    public j(ij.c<com.planner5d.library.activity.helper.imagechooser.j> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<y0> cVar3) {
        this.f160325a = cVar;
        this.f160326b = cVar2;
        this.f160327c = cVar3;
    }

    public static fg.g<AutoStyleListFragment> a(ij.c<com.planner5d.library.activity.helper.imagechooser.j> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<y0> cVar3) {
        return new j(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.dgenerator.fragment.list.AutoStyleListFragment.builtInDataManager")
    public static void b(AutoStyleListFragment autoStyleListFragment, com.planner5d.library.model.manager.builtin.i iVar) {
        autoStyleListFragment.builtInDataManager = iVar;
    }

    @dagger.internal.j("com.planner5d.library.dgenerator.fragment.list.AutoStyleListFragment.helperImageChooser")
    public static void c(AutoStyleListFragment autoStyleListFragment, com.planner5d.library.activity.helper.imagechooser.j jVar) {
        autoStyleListFragment.helperImageChooser = jVar;
    }

    @dagger.internal.j("com.planner5d.library.dgenerator.fragment.list.AutoStyleListFragment.imageManager")
    public static void d(AutoStyleListFragment autoStyleListFragment, y0 y0Var) {
        autoStyleListFragment.imageManager = y0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(AutoStyleListFragment autoStyleListFragment) {
        c(autoStyleListFragment, this.f160325a.get());
        b(autoStyleListFragment, this.f160326b.get());
        d(autoStyleListFragment, this.f160327c.get());
    }
}
