package com.planner5d.library.widget.editor.projectresources;

import dagger.internal.r;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
public final class g implements fg.g<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d> f258062a;

    public g(ij.c<d> cVar) {
        this.f258062a = cVar;
    }

    public static fg.g<e> a(ij.c<d> cVar) {
        return new g(cVar);
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.projectresources.ProjectResourcesProvider.provider")
    public static void c(e eVar, ij.c<d> cVar) {
        eVar.f258057a = cVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(e eVar) {
        c(eVar, this.f258062a);
    }
}
