package com.planner5d.library.widget.editor.editor3d;

import com.planner5d.library.widget.editor.helper.a2;
import com.planner5d.library.widget.editor.helper.g1;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r implements dagger.internal.h<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<l> f255813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<g1> f255814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<a2> f255815c;

    public r(ij.c<l> cVar, ij.c<g1> cVar2, ij.c<a2> cVar3) {
        this.f255813a = cVar;
        this.f255814b = cVar2;
        this.f255815c = cVar3;
    }

    public static r a(ij.c<l> cVar, ij.c<g1> cVar2, ij.c<a2> cVar3) {
        return new r(cVar, cVar2, cVar3);
    }

    public static q c(l lVar, g1 g1Var, a2 a2Var) {
        return new q(lVar, g1Var, a2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.f255813a.get(), this.f255814b.get(), this.f255815c.get());
    }
}
