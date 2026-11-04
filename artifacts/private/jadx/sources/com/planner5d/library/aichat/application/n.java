package com.planner5d.library.aichat.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n implements dagger.internal.h<com.planner5d.library.api.requests.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141924a;

    public n(b bVar) {
        this.f141924a = bVar;
    }

    public static n a(b bVar) {
        return new n(bVar);
    }

    public static com.planner5d.library.api.requests.c c(b bVar) {
        return (com.planner5d.library.api.requests.c) dagger.internal.p.f(bVar.l());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.api.requests.c get() {
        return c(this.f141924a);
    }
}
