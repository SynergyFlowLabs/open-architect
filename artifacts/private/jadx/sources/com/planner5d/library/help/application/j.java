package com.planner5d.library.help.application;

import android.app.Application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j implements dagger.internal.h<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180008a;

    public j(i iVar) {
        this.f180008a = iVar;
    }

    public static j a(i iVar) {
        return new j(iVar);
    }

    public static Application c(i iVar) {
        return (Application) dagger.internal.p.f(iVar.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return c(this.f180008a);
    }
}
