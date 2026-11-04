package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.d1;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class g implements com.google.firebase.sessions.dagger.internal.c<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d1> f125122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.firebase.installations.k> f125123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.firebase.sessions.b> f125124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<a> f125125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<k> f125126e;

    public g(ij.c<d1> cVar, ij.c<com.google.firebase.installations.k> cVar2, ij.c<com.google.firebase.sessions.b> cVar3, ij.c<a> cVar4, ij.c<k> cVar5) {
        this.f125122a = cVar;
        this.f125123b = cVar2;
        this.f125124c = cVar3;
        this.f125125d = cVar4;
        this.f125126e = cVar5;
    }

    public static g a(ij.c<d1> cVar, ij.c<com.google.firebase.installations.k> cVar2, ij.c<com.google.firebase.sessions.b> cVar3, ij.c<a> cVar4, ij.c<k> cVar5) {
        return new g(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static d c(d1 d1Var, com.google.firebase.installations.k kVar, com.google.firebase.sessions.b bVar, a aVar, k kVar2) {
        return new d(d1Var, kVar, bVar, aVar, kVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f125122a.get(), this.f125123b.get(), this.f125124c.get(), this.f125125d.get(), this.f125126e.get());
    }
}
