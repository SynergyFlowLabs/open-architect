package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class l implements com.google.firebase.inappmessaging.dagger.internal.c<com.google.firebase.analytics.connector.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f122781a;

    public l(k kVar) {
        this.f122781a = kVar;
    }

    public static l a(k kVar) {
        return new l(kVar);
    }

    public static com.google.firebase.analytics.connector.a c(k kVar) {
        return (com.google.firebase.analytics.connector.a) com.google.firebase.inappmessaging.dagger.internal.e.f(kVar.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.analytics.connector.a get() {
        return c(this.f122781a);
    }
}
