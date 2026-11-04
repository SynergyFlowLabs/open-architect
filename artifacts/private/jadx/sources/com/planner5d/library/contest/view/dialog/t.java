package com.planner5d.library.contest.view.dialog;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t implements dagger.internal.h<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.data.i> f153693a;

    public t(ij.c<com.planner5d.library.contest.data.i> cVar) {
        this.f153693a = cVar;
    }

    public static t a(ij.c<com.planner5d.library.contest.data.i> cVar) {
        return new t(cVar);
    }

    public static s c(com.planner5d.library.contest.data.i iVar) {
        return new s(iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f153693a.get());
    }
}
