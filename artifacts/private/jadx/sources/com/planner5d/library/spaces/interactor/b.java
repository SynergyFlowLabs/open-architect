package com.planner5d.library.spaces.interactor;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@e
@s
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.rabbitmq.h> f230213a;

    public b(ij.c<com.planner5d.library.rabbitmq.h> uriProvider) {
        this.f230213a = uriProvider;
    }

    public static b a(ij.c<com.planner5d.library.rabbitmq.h> uriProvider) {
        return new b(uriProvider);
    }

    public static a c(com.planner5d.library.rabbitmq.h uriProvider) {
        return new a(uriProvider);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f230213a.get());
    }
}
