package com.planner5d.library.model.manager.config.source;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class i implements dagger.internal.h<g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<sd.b> f186184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<g> f186185b;

    public i(ij.c<sd.b> cVar, ij.c<g> cVar2) {
        this.f186184a = cVar;
        this.f186185b = cVar2;
    }

    public static i a(ij.c<sd.b> cVar, ij.c<g> cVar2) {
        return new i(cVar, cVar2);
    }

    public static g.a c(sd.b bVar, fg.e<g> eVar) {
        return new g.a(bVar, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.a get() {
        return c(this.f186184a.get(), dagger.internal.g.a(this.f186185b));
    }
}
