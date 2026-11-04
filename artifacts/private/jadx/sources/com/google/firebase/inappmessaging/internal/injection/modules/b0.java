package com.google.firebase.inappmessaging.internal.injection.modules;

import io.grpc.v1;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g("com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class b0 implements com.google.firebase.inappmessaging.dagger.internal.c<com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f122745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<io.grpc.f> f122746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<v1> f122747c;

    public b0(z zVar, ij.c<io.grpc.f> cVar, ij.c<v1> cVar2) {
        this.f122745a = zVar;
        this.f122746b = cVar;
        this.f122747c = cVar2;
    }

    public static b0 a(z zVar, ij.c<io.grpc.f> cVar, ij.c<v1> cVar2) {
        return new b0(zVar, cVar, cVar2);
    }

    public static com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e c(z zVar, io.grpc.f fVar, v1 v1Var) {
        return (com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e) com.google.firebase.inappmessaging.dagger.internal.e.f(zVar.c(fVar, v1Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e get() {
        return c(this.f122745a, this.f122746b.get(), this.f122747c.get());
    }
}
