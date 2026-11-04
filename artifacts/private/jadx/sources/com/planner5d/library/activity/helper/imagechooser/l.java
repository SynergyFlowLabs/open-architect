package com.planner5d.library.activity.helper.imagechooser;

import com.planner5d.library.model.manager.t1;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class l implements fg.g<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f136966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t1> f136967b;

    public l(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<t1> cVar2) {
        this.f136966a = cVar;
        this.f136967b = cVar2;
    }

    public static fg.g<j> a(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<t1> cVar2) {
        return new l(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.imagechooser.HelperImageChooser.dialogLauncher")
    public static void b(j jVar, com.planner5d.library.activity.fragment.dialog.k kVar) {
        jVar.f136962i = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.imagechooser.HelperImageChooser.logRecordManager")
    public static void c(j jVar, t1 t1Var) {
        jVar.f136963j = t1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(j jVar) {
        b(jVar, this.f136966a.get());
        c(jVar, this.f136967b.get());
    }
}
