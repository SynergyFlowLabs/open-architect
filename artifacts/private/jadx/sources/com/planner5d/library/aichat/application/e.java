package com.planner5d.library.aichat.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class e implements dagger.internal.h<va.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141914a;

    public e(b bVar) {
        this.f141914a = bVar;
    }

    public static e a(b bVar) {
        return new e(bVar);
    }

    public static va.b c(b bVar) {
        return (va.b) dagger.internal.p.f(bVar.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public va.b get() {
        return c(this.f141914a);
    }
}
