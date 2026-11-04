package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.RateLimit"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class p3 implements com.google.firebase.inappmessaging.dagger.internal.c<o3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y2> f122905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.time.a> f122906b;

    public p3(ij.c<y2> cVar, ij.c<com.google.firebase.inappmessaging.internal.time.a> cVar2) {
        this.f122905a = cVar;
        this.f122906b = cVar2;
    }

    public static p3 a(ij.c<y2> cVar, ij.c<com.google.firebase.inappmessaging.internal.time.a> cVar2) {
        return new p3(cVar, cVar2);
    }

    public static o3 c(y2 y2Var, com.google.firebase.inappmessaging.internal.time.a aVar) {
        return new o3(y2Var, aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o3 get() {
        return c(this.f122905a.get(), this.f122906b.get());
    }
}
