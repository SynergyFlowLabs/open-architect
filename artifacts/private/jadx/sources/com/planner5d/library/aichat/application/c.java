package com.planner5d.library.aichat.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c implements dagger.internal.h<ya.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.aichat.interactor.a> f141912b;

    public c(b bVar, ij.c<com.planner5d.library.aichat.interactor.a> cVar) {
        this.f141911a = bVar;
        this.f141912b = cVar;
    }

    public static c a(b bVar, ij.c<com.planner5d.library.aichat.interactor.a> cVar) {
        return new c(bVar, cVar);
    }

    public static ya.a c(b bVar, com.planner5d.library.aichat.interactor.a aVar) {
        return (ya.a) dagger.internal.p.f(bVar.a(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ya.a get() {
        return c(this.f141911a, this.f141912b.get());
    }
}
