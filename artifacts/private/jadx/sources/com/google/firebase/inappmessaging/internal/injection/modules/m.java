package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class m implements com.google.firebase.inappmessaging.dagger.internal.c<m8.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f122783a;

    public m(k kVar) {
        this.f122783a = kVar;
    }

    public static m a(k kVar) {
        return new m(kVar);
    }

    public static m8.d c(k kVar) {
        return (m8.d) com.google.firebase.inappmessaging.dagger.internal.e.f(kVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m8.d get() {
        return c(this.f122783a);
    }
}
