package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"javax.inject.Named"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class x implements com.google.firebase.inappmessaging.dagger.internal.c<io.grpc.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f122810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<String> f122811b;

    public x(w wVar, ij.c<String> cVar) {
        this.f122810a = wVar;
        this.f122811b = cVar;
    }

    public static x a(w wVar, ij.c<String> cVar) {
        return new x(wVar, cVar);
    }

    public static io.grpc.f c(w wVar, String str) {
        return (io.grpc.f) com.google.firebase.inappmessaging.dagger.internal.e.f(wVar.a(str));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public io.grpc.f get() {
        return c(this.f122810a, this.f122811b.get());
    }
}
