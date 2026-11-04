package com.planner5d.library.services.utility;

import android.app.Application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d implements dagger.internal.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f225175a;

    public d(ij.c<Application> cVar) {
        this.f225175a = cVar;
    }

    public static d a(ij.c<Application> cVar) {
        return new d(cVar);
    }

    public static c c(Application application) {
        return new c(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f225175a.get());
    }
}
