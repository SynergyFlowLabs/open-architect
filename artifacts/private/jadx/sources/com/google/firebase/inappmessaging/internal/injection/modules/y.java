package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"javax.inject.Named"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class y implements com.google.firebase.inappmessaging.dagger.internal.c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f122812a;

    public y(w wVar) {
        this.f122812a = wVar;
    }

    public static y a(w wVar) {
        return new y(wVar);
    }

    public static String c(w wVar) {
        return (String) com.google.firebase.inappmessaging.dagger.internal.e.f(wVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f122812a);
    }
}
