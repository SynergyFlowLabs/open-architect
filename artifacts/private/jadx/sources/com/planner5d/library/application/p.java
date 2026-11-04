package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class p implements dagger.internal.h<com.planner5d.library.activity.fragment.j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142891a;

    public p(i iVar) {
        this.f142891a = iVar;
    }

    public static p a(i iVar) {
        return new p(iVar);
    }

    public static com.planner5d.library.activity.fragment.j c(i iVar) {
        return (com.planner5d.library.activity.fragment.j) dagger.internal.p.f(iVar.k());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.j get() {
        return c(this.f142891a);
    }
}
