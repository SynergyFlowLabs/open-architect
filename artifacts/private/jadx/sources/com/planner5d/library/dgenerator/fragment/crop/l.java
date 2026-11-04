package com.planner5d.library.dgenerator.fragment.crop;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s
public final class l implements dagger.internal.h<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<pd.a> f160137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<pd.e> f160138b;

    public l(ij.c<pd.a> cVar, ij.c<pd.e> cVar2) {
        this.f160137a = cVar;
        this.f160138b = cVar2;
    }

    public static l a(ij.c<pd.a> cVar, ij.c<pd.e> cVar2) {
        return new l(cVar, cVar2);
    }

    public static k c(pd.a aVar, pd.e eVar) {
        return new k(aVar, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f160137a.get(), this.f160138b.get());
    }
}
