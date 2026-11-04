package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class k implements com.google.firebase.sessions.dagger.internal.c<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z8.b<com.google.android.datatransport.m>> f125046a;

    public k(ij.c<z8.b<com.google.android.datatransport.m>> cVar) {
        this.f125046a = cVar;
    }

    public static k a(ij.c<z8.b<com.google.android.datatransport.m>> cVar) {
        return new k(cVar);
    }

    public static i c(z8.b<com.google.android.datatransport.m> bVar) {
        return new i(bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f125046a.get());
    }
}
