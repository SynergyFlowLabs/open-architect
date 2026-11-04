package com.planner5d.library.spaces.application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j implements dagger.internal.h<fe.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.spaces.interactor.a> f230003b;

    public j(f module, ij.c<com.planner5d.library.spaces.interactor.a> interactorProvider) {
        this.f230002a = module;
        this.f230003b = interactorProvider;
    }

    public static j a(f module, ij.c<com.planner5d.library.spaces.interactor.a> interactorProvider) {
        return new j(module, interactorProvider);
    }

    public static fe.a c(f instance, com.planner5d.library.spaces.interactor.a interactor) {
        return (fe.a) dagger.internal.p.f(instance.e(interactor));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public fe.a get() {
        return c(this.f230002a, this.f230003b.get());
    }
}
