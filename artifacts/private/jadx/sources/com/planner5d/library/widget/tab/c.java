package com.planner5d.library.widget.tab;

import com.planner5d.library.activity.fragment.projects.c0;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
public final class c implements g<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c0> f258784a;

    public c(ij.c<c0> cVar) {
        this.f258784a = cVar;
    }

    public static g<b> a(ij.c<c0> cVar) {
        return new c(cVar);
    }

    @j("com.planner5d.library.widget.tab.StatisticsTriggeringProjectPageListener.sourceManager")
    public static void c(b bVar, c0 c0Var) {
        bVar.f258783b = c0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(b bVar) {
        c(bVar, this.f258784a.get());
    }
}
