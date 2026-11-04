package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class a0 implements dagger.internal.h<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<x> f180570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p0> f180571b;

    public a0(ij.c<x> cVar, ij.c<p0> cVar2) {
        this.f180570a = cVar;
        this.f180571b = cVar2;
    }

    public static a0 a(ij.c<x> cVar, ij.c<p0> cVar2) {
        return new a0(cVar, cVar2);
    }

    public static z c() {
        return new z();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        z zVarC = c();
        b0.b(zVarC, this.f180570a.get());
        b0.c(zVarC, this.f180571b.get());
        return zVarC;
    }
}
