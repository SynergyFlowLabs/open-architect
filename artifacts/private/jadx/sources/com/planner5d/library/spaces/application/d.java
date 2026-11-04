package com.planner5d.library.spaces.application;

import com.planner5d.library.services.o0;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d implements dagger.internal.h<o0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f229980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.spaces.view.a> f229981b;

    public d(c module, ij.c<com.planner5d.library.spaces.view.a> dialogFactoryProvider) {
        this.f229980a = module;
        this.f229981b = dialogFactoryProvider;
    }

    public static d a(c module, ij.c<com.planner5d.library.spaces.view.a> dialogFactoryProvider) {
        return new d(module, dialogFactoryProvider);
    }

    public static o0 c(c instance, com.planner5d.library.spaces.view.a dialogFactory) {
        return (o0) dagger.internal.p.f(instance.a(dialogFactory));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o0 get() {
        return c(this.f229980a, this.f229981b.get());
    }
}
