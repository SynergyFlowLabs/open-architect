package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class x implements dagger.internal.h<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f180674a;

    public x(ij.c<p0> cVar) {
        this.f180674a = cVar;
    }

    public static x a(ij.c<p0> cVar) {
        return new x(cVar);
    }

    public static w c() {
        return new w();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        w wVarC = c();
        y.b(wVarC, this.f180674a.get());
        return wVarC;
    }
}
