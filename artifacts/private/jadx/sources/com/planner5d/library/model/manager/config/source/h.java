package com.planner5d.library.model.manager.config.source;

import com.planner5d.library.model.manager.t1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t1> f186183a;

    public h(ij.c<t1> cVar) {
        this.f186183a = cVar;
    }

    public static h a(ij.c<t1> cVar) {
        return new h(cVar);
    }

    public static g c(fg.e<t1> eVar) {
        return new g(eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(dagger.internal.g.a(this.f186183a));
    }
}
