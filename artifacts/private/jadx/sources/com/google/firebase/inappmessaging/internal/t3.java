package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class t3 implements com.google.firebase.inappmessaging.dagger.internal.c<s3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.firebase.h> f122945a;

    public t3(ij.c<com.google.firebase.h> cVar) {
        this.f122945a = cVar;
    }

    public static t3 a(ij.c<com.google.firebase.h> cVar) {
        return new t3(cVar);
    }

    public static s3 c(com.google.firebase.h hVar) {
        return new s3(hVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s3 get() {
        return c(this.f122945a.get());
    }
}
