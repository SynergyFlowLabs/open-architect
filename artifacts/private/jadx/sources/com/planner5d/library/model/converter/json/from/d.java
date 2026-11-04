package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d implements dagger.internal.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f180579a;

    public d(ij.c<p0> cVar) {
        this.f180579a = cVar;
    }

    public static d a(ij.c<p0> cVar) {
        return new d(cVar);
    }

    public static c c(p0 p0Var) {
        return new c(p0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f180579a.get());
    }
}
