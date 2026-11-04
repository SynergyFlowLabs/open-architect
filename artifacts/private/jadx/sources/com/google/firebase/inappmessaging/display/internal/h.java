package com.google.firebase.inappmessaging.display.internal;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("javax.inject.Singleton")
public final class h implements com.google.firebase.inappmessaging.display.dagger.internal.d<g> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f122329a = new h();

        private a() {
        }
    }

    public static h a() {
        return a.f122329a;
    }

    public static g c() {
        return new g();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c();
    }
}
