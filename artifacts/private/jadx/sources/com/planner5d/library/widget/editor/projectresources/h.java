package com.planner5d.library.widget.editor.projectresources;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<a> f258063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<j> f258064b;

    public h(ij.c<a> cVar, ij.c<j> cVar2) {
        this.f258063a = cVar;
        this.f258064b = cVar2;
    }

    public static h a(ij.c<a> cVar, ij.c<j> cVar2) {
        return new h(cVar, cVar2);
    }

    public static d c() {
        return new d();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        d dVarC = c();
        i.b(dVarC, this.f258063a.get());
        i.d(dVarC, this.f258064b.get());
        return dVarC;
    }
}
