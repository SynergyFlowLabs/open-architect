package com.google.firebase.sessions.settings;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h({"com.google.firebase.sessions.LocalOverrideSettingsProvider", "com.google.firebase.sessions.RemoteSettingsProvider"})
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class j implements com.google.firebase.sessions.dagger.internal.c<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<n> f125136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n> f125137b;

    public j(ij.c<n> cVar, ij.c<n> cVar2) {
        this.f125136a = cVar;
        this.f125137b = cVar2;
    }

    public static j a(ij.c<n> cVar, ij.c<n> cVar2) {
        return new j(cVar, cVar2);
    }

    public static i c(n nVar, n nVar2) {
        return new i(nVar, nVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f125136a.get(), this.f125137b.get());
    }
}
