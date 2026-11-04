package com.planner5d.library.widget.editor.projectresources;

import dagger.internal.r;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
public final class i implements fg.g<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<a> f258065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<j> f258066b;

    public i(ij.c<a> cVar, ij.c<j> cVar2) {
        this.f258065a = cVar;
        this.f258066b = cVar2;
    }

    public static fg.g<d> a(ij.c<a> cVar, ij.c<j> cVar2) {
        return new i(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.projectresources.ProjectResources.history")
    public static void b(Object obj, a aVar) {
        ((d) obj).f258053a = aVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.projectresources.ProjectResources.rulers")
    public static void d(Object obj, j jVar) {
        ((d) obj).f258054b = jVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(d dVar) {
        b(dVar, this.f258065a.get());
        d(dVar, this.f258066b.get());
    }
}
