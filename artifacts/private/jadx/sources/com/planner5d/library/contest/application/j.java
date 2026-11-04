package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j implements dagger.internal.h<com.planner5d.library.activity.fragment.dialog.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148456a;

    public j(b bVar) {
        this.f148456a = bVar;
    }

    public static j a(b bVar) {
        return new j(bVar);
    }

    public static com.planner5d.library.activity.fragment.dialog.k c(b bVar) {
        return (com.planner5d.library.activity.fragment.dialog.k) dagger.internal.p.f(bVar.h());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.dialog.k get() {
        return c(this.f148456a);
    }
}
