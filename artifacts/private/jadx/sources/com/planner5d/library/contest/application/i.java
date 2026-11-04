package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i implements dagger.internal.h<com.planner5d.library.services.utility.t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148455a;

    public i(b bVar) {
        this.f148455a = bVar;
    }

    public static i a(b bVar) {
        return new i(bVar);
    }

    public static com.planner5d.library.services.utility.t c(b bVar) {
        return (com.planner5d.library.services.utility.t) dagger.internal.p.f(bVar.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.utility.t get() {
        return c(this.f148455a);
    }
}
