package com.planner5d.library.widget.editor.editor3dcardboard;

import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.widget.editor.helper.n3;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<f1> f255965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n3> f255966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t1> f255967c;

    public h(ij.c<f1> cVar, ij.c<n3> cVar2, ij.c<t1> cVar3) {
        this.f255965a = cVar;
        this.f255966b = cVar2;
        this.f255967c = cVar3;
    }

    public static h a(ij.c<f1> cVar, ij.c<n3> cVar2, ij.c<t1> cVar3) {
        return new h(cVar, cVar2, cVar3);
    }

    public static g c(f1 f1Var, n3 n3Var, t1 t1Var) {
        return new g(f1Var, n3Var, t1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f255965a.get(), this.f255966b.get(), this.f255967c.get());
    }
}
