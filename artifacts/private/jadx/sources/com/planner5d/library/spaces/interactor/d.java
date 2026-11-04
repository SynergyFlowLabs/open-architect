package com.planner5d.library.spaces.interactor;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@e
@s
public final class d implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.rabbitmq.h> f230224a;

    public d(ij.c<com.planner5d.library.rabbitmq.h> uriProvider) {
        this.f230224a = uriProvider;
    }

    public static d a(ij.c<com.planner5d.library.rabbitmq.h> uriProvider) {
        return new d(uriProvider);
    }

    public static c c(com.planner5d.library.rabbitmq.h uriProvider) {
        return new c(uriProvider);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f230224a.get());
    }
}
