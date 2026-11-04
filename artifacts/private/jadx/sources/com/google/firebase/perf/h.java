package com.google.firebase.perf;

import com.google.android.datatransport.m;
import com.google.firebase.installations.k;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.d0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class h implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.firebase.h> f123930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<z8.b<d0>> f123931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<k> f123932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<z8.b<m>> f123933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<RemoteConfigManager> f123934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.google.firebase.perf.config.a> f123935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<SessionManager> f123936g;

    public h(ij.c<com.google.firebase.h> cVar, ij.c<z8.b<d0>> cVar2, ij.c<k> cVar3, ij.c<z8.b<m>> cVar4, ij.c<RemoteConfigManager> cVar5, ij.c<com.google.firebase.perf.config.a> cVar6, ij.c<SessionManager> cVar7) {
        this.f123930a = cVar;
        this.f123931b = cVar2;
        this.f123932c = cVar3;
        this.f123933d = cVar4;
        this.f123934e = cVar5;
        this.f123935f = cVar6;
        this.f123936g = cVar7;
    }

    public static h a(ij.c<com.google.firebase.h> cVar, ij.c<z8.b<d0>> cVar2, ij.c<k> cVar3, ij.c<z8.b<m>> cVar4, ij.c<RemoteConfigManager> cVar5, ij.c<com.google.firebase.perf.config.a> cVar6, ij.c<SessionManager> cVar7) {
        return new h(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static e c(com.google.firebase.h hVar, z8.b<d0> bVar, k kVar, z8.b<m> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        return new e(hVar, bVar, kVar, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f123930a.get(), this.f123931b.get(), this.f123932c.get(), this.f123933d.get(), this.f123934e.get(), this.f123935f.get(), this.f123936g.get());
    }
}
