package com.planner5d.library.help.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b0 implements dagger.internal.h<com.planner5d.library.model.manager.config.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f179970a;

    public b0(i iVar) {
        this.f179970a = iVar;
    }

    public static b0 a(i iVar) {
        return new b0(iVar);
    }

    public static com.planner5d.library.model.manager.config.p c(i iVar) {
        return (com.planner5d.library.model.manager.config.p) dagger.internal.p.f(iVar.s());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.config.p get() {
        return c(this.f179970a);
    }
}
