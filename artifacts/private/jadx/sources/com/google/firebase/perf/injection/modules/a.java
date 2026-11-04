package com.google.firebase.perf.injection.modules;

import androidx.annotation.NonNull;
import com.google.android.datatransport.m;
import com.google.firebase.installations.k;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.d0;
import fg.i;

/* JADX INFO: loaded from: classes5.dex */
@fg.h
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.h f123947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f123948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z8.b<d0> f123949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z8.b<m> f123950d;

    public a(@NonNull com.google.firebase.h hVar, @NonNull k kVar, @NonNull z8.b<d0> bVar, @NonNull z8.b<m> bVar2) {
        this.f123947a = hVar;
        this.f123948b = kVar;
        this.f123949c = bVar;
        this.f123950d = bVar2;
    }

    @i
    com.google.firebase.perf.config.a a() {
        return com.google.firebase.perf.config.a.h();
    }

    @i
    com.google.firebase.h b() {
        return this.f123947a;
    }

    @i
    k c() {
        return this.f123948b;
    }

    @i
    z8.b<d0> d() {
        return this.f123949c;
    }

    @i
    RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    @i
    SessionManager f() {
        return SessionManager.getInstance();
    }

    @i
    z8.b<m> g() {
        return this.f123950d;
    }
}
