package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s
public final class f implements dagger.internal.h<RemoteConfigManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f123955a;

    public f(a aVar) {
        this.f123955a = aVar;
    }

    public static f a(a aVar) {
        return new f(aVar);
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) p.f(aVar.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return c(this.f123955a);
    }
}
