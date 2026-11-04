package com.planner5d.library.contest.application;

import android.app.Application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c implements dagger.internal.h<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148424a;

    public c(b bVar) {
        this.f148424a = bVar;
    }

    public static c a(b bVar) {
        return new c(bVar);
    }

    public static Application c(b bVar) {
        return (Application) dagger.internal.p.f(bVar.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return c(this.f148424a);
    }
}
