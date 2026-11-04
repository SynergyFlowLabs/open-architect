package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class e implements dagger.internal.h<com.planner5d.library.contest.helper.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148428a;

    public e(b bVar) {
        this.f148428a = bVar;
    }

    public static e a(b bVar) {
        return new e(bVar);
    }

    public static com.planner5d.library.contest.helper.b c(b bVar) {
        return (com.planner5d.library.contest.helper.b) dagger.internal.p.f(bVar.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.contest.helper.b get() {
        return c(this.f148428a);
    }
}
