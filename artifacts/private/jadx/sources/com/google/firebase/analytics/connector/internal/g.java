package com.google.firebase.analytics.connector.internal;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.analytics.connector.a.b f120728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n6.a f120729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f120730c;

    public g(n6.a aVar, com.google.firebase.analytics.connector.a.b bVar) {
        this.f120728a = bVar;
        this.f120729b = aVar;
        f fVar = new f(this);
        this.f120730c = fVar;
        aVar.s(fVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final com.google.firebase.analytics.connector.a.b a() {
        return this.f120728a;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void b(Set set) {
    }

    final /* synthetic */ com.google.firebase.analytics.connector.a.b c() {
        return this.f120728a;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void h() {
    }
}
