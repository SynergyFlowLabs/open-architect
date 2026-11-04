package com.planner5d.library.contest.view.dialog;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.data.i> f153582a;

    public m(ij.c<com.planner5d.library.contest.data.i> cVar) {
        this.f153582a = cVar;
    }

    public static m a(ij.c<com.planner5d.library.contest.data.i> cVar) {
        return new m(cVar);
    }

    public static l c(com.planner5d.library.contest.data.i iVar) {
        return new l(iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f153582a.get());
    }
}
