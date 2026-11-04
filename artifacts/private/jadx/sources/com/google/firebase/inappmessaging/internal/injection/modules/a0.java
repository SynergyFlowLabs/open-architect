package com.google.firebase.inappmessaging.internal.injection.modules;

import io.grpc.v1;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class a0 implements com.google.firebase.inappmessaging.dagger.internal.c<v1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f122742a;

    public a0(z zVar) {
        this.f122742a = zVar;
    }

    public static a0 a(z zVar) {
        return new a0(zVar);
    }

    public static v1 c(z zVar) {
        return (v1) com.google.firebase.inappmessaging.dagger.internal.e.f(zVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v1 get() {
        return c(this.f122742a);
    }
}
