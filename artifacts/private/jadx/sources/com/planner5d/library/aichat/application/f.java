package com.planner5d.library.aichat.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f implements dagger.internal.h<com.planner5d.library.model.manager.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141915a;

    public f(b bVar) {
        this.f141915a = bVar;
    }

    public static f a(b bVar) {
        return new f(bVar);
    }

    public static com.planner5d.library.model.manager.h c(b bVar) {
        return (com.planner5d.library.model.manager.h) dagger.internal.p.f(bVar.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.h get() {
        return c(this.f141915a);
    }
}
