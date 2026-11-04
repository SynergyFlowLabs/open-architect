package com.planner5d.library.widget.editor.editor3d;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u implements dagger.internal.h<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<q> f255896a;

    public u(ij.c<q> cVar) {
        this.f255896a = cVar;
    }

    public static u a(ij.c<q> cVar) {
        return new u(cVar);
    }

    public static t c() {
        return new t();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        t tVarC = c();
        v.b(tVarC, this.f255896a);
        return tVarC;
    }
}
