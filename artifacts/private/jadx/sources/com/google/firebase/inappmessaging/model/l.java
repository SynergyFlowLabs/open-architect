package com.google.firebase.inappmessaging.model;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class l implements com.google.firebase.inappmessaging.dagger.internal.c<k> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final l f123108a = new l();

        private a() {
        }
    }

    public static l a() {
        return a.f123108a;
    }

    public static k c() {
        return new k();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c();
    }
}
