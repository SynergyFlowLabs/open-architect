package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class c implements com.google.firebase.inappmessaging.dagger.internal.c<com.google.firebase.inappmessaging.internal.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f122748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.firebase.analytics.connector.a> f122749b;

    public c(a aVar, ij.c<com.google.firebase.analytics.connector.a> cVar) {
        this.f122748a = aVar;
        this.f122749b = cVar;
    }

    public static c a(a aVar, ij.c<com.google.firebase.analytics.connector.a> cVar) {
        return new c(aVar, cVar);
    }

    public static com.google.firebase.inappmessaging.internal.f c(a aVar, com.google.firebase.analytics.connector.a aVar2) {
        return (com.google.firebase.inappmessaging.internal.f) com.google.firebase.inappmessaging.dagger.internal.e.f(aVar.b(aVar2));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.internal.f get() {
        return c(this.f122748a, this.f122749b.get());
    }
}
