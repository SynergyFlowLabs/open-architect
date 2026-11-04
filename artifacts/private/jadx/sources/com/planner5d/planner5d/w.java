package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w implements dagger.internal.h<dc.d<cc.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f264821a;

    public w(t tVar) {
        this.f264821a = tVar;
    }

    public static w a(t tVar) {
        return new w(tVar);
    }

    public static dc.d<cc.a> c(t tVar) {
        return (dc.d) dagger.internal.p.f(tVar.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dc.d<cc.a> get() {
        return c(this.f264821a);
    }
}
