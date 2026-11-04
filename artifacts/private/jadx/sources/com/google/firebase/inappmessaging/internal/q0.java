package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g("com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class q0 implements com.google.firebase.inappmessaging.dagger.internal.c<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e> f122911a;

    public q0(ij.c<com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e> cVar) {
        this.f122911a = cVar;
    }

    public static q0 a(ij.c<com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e> cVar) {
        return new q0(cVar);
    }

    public static p0 c(com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e eVar) {
        return new p0(eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return c(this.f122911a.get());
    }
}
