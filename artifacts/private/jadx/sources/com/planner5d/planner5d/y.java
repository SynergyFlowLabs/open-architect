package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y implements dagger.internal.h<ec.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f264826a;

    public y(t tVar) {
        this.f264826a = tVar;
    }

    public static y a(t tVar) {
        return new y(tVar);
    }

    public static ec.e c(t tVar) {
        return (ec.e) dagger.internal.p.f(tVar.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ec.e get() {
        return c(this.f264826a);
    }
}
