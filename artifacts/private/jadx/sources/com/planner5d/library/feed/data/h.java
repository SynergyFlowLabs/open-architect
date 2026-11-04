package com.planner5d.library.feed.data;

import com.planner5d.library.services.z;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f175283a;

    public h(ij.c<z> cVar) {
        this.f175283a = cVar;
    }

    public static h a(ij.c<z> cVar) {
        return new h(cVar);
    }

    public static g c(z zVar) {
        return new g(zVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f175283a.get());
    }
}
