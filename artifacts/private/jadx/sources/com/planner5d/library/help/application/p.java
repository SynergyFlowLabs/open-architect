package com.planner5d.library.help.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p implements dagger.internal.h<com.planner5d.library.activity.fragment.x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180015a;

    public p(i iVar) {
        this.f180015a = iVar;
    }

    public static p a(i iVar) {
        return new p(iVar);
    }

    public static com.planner5d.library.activity.fragment.x c(i iVar) {
        return (com.planner5d.library.activity.fragment.x) dagger.internal.p.f(iVar.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.x get() {
        return c(this.f180015a);
    }
}
