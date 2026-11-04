package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d0 implements dagger.internal.h<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f180580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<z> f180581b;

    public d0(ij.c<p0> cVar, ij.c<z> cVar2) {
        this.f180580a = cVar;
        this.f180581b = cVar2;
    }

    public static d0 a(ij.c<p0> cVar, ij.c<z> cVar2) {
        return new d0(cVar, cVar2);
    }

    public static c0 c() {
        return new c0();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 get() {
        c0 c0VarC = c();
        e0.c(c0VarC, this.f180580a.get());
        e0.b(c0VarC, this.f180581b.get());
        return c0VarC;
    }
}
