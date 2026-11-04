package com.planner5d.library.widget.editor.projectresources;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d> f258061a;

    public f(ij.c<d> cVar) {
        this.f258061a = cVar;
    }

    public static f a(ij.c<d> cVar) {
        return new f(cVar);
    }

    public static e c() {
        return new e();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        e eVarC = c();
        g.c(eVarC, this.f258061a);
        return eVarC;
    }
}
