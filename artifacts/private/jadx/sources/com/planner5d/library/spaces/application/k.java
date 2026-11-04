package com.planner5d.library.spaces.application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k implements dagger.internal.h<fe.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.spaces.interactor.c> f230005b;

    public k(f module, ij.c<com.planner5d.library.spaces.interactor.c> interactorProvider) {
        this.f230004a = module;
        this.f230005b = interactorProvider;
    }

    public static k a(f module, ij.c<com.planner5d.library.spaces.interactor.c> interactorProvider) {
        return new k(module, interactorProvider);
    }

    public static fe.b c(f instance, com.planner5d.library.spaces.interactor.c interactor) {
        return (fe.b) dagger.internal.p.f(instance.f(interactor));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public fe.b get() {
        return c(this.f230004a, this.f230005b.get());
    }
}
