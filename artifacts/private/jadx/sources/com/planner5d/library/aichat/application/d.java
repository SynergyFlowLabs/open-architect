package com.planner5d.library.aichat.application;

import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d implements dagger.internal.h<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141913a;

    public d(b bVar) {
        this.f141913a = bVar;
    }

    public static d a(b bVar) {
        return new d(bVar);
    }

    public static Application c(b bVar) {
        return (Application) dagger.internal.p.f(bVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return c(this.f141913a);
    }
}
