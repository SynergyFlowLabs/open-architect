package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class v3 implements com.google.firebase.inappmessaging.dagger.internal.c<u3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<s3> f122974a;

    public v3(ij.c<s3> cVar) {
        this.f122974a = cVar;
    }

    public static v3 a(ij.c<s3> cVar) {
        return new v3(cVar);
    }

    public static u3 c(s3 s3Var) {
        return new u3(s3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u3 get() {
        return c(this.f122974a.get());
    }
}
