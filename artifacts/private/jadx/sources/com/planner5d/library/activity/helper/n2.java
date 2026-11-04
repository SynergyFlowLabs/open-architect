package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n2 implements dagger.internal.h<m2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<j2> f137073a;

    public n2(ij.c<j2> cVar) {
        this.f137073a = cVar;
    }

    public static n2 a(ij.c<j2> cVar) {
        return new n2(cVar);
    }

    public static m2 c(j2 j2Var) {
        return new m2(j2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m2 get() {
        return c(this.f137073a.get());
    }
}
