package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class p implements dagger.internal.h<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f180664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b> f180665b;

    public p(ij.c<p0> cVar, ij.c<b> cVar2) {
        this.f180664a = cVar;
        this.f180665b = cVar2;
    }

    public static p a(ij.c<p0> cVar, ij.c<b> cVar2) {
        return new p(cVar, cVar2);
    }

    public static o c() {
        return new o();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        o oVarC = c();
        q.c(oVarC, this.f180664a.get());
        q.b(oVarC, this.f180665b.get());
        return oVarC;
    }
}
