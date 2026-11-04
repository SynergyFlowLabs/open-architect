package com.planner5d.library.aichat.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l implements dagger.internal.h<va.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141922a;

    public l(b bVar) {
        this.f141922a = bVar;
    }

    public static l a(b bVar) {
        return new l(bVar);
    }

    public static va.c c(b bVar) {
        return (va.c) dagger.internal.p.f(bVar.j());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public va.c get() {
        return c(this.f141922a);
    }
}
