package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class t implements com.google.firebase.sessions.dagger.internal.c<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.firebase.h> f125159a;

    public t(ij.c<com.google.firebase.h> cVar) {
        this.f125159a = cVar;
    }

    public static b a(com.google.firebase.h hVar) {
        return (b) com.google.firebase.sessions.dagger.internal.e.f(o.b.f125065a.e(hVar));
    }

    public static t b(ij.c<com.google.firebase.h> cVar) {
        return new t(cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b get() {
        return a(this.f125159a.get());
    }
}
