package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.SessionManager;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<SessionManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f123956a;

    public g(a aVar) {
        this.f123956a = aVar;
    }

    public static g a(a aVar) {
        return new g(aVar);
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) p.f(aVar.f());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return c(this.f123956a);
    }
}
