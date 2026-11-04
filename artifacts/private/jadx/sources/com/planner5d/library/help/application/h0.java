package com.planner5d.library.help.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h0 implements dagger.internal.h<com.planner5d.library.modules.user.user.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f179984a;

    public h0(i iVar) {
        this.f179984a = iVar;
    }

    public static h0 a(i iVar) {
        return new h0(iVar);
    }

    public static com.planner5d.library.modules.user.user.w c(i iVar) {
        return (com.planner5d.library.modules.user.user.w) dagger.internal.p.f(iVar.y());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.modules.user.user.w get() {
        return c(this.f179984a);
    }
}
