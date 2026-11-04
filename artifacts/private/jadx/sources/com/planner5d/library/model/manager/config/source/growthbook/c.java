package com.planner5d.library.model.manager.config.source.growthbook;

import com.planner5d.library.model.manager.config.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p> f181703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.h> f181704b;

    public c(ij.c<p> cVar, ij.c<com.planner5d.library.model.manager.config.h> cVar2) {
        this.f181703a = cVar;
        this.f181704b = cVar2;
    }

    public static c a(ij.c<p> cVar, ij.c<com.planner5d.library.model.manager.config.h> cVar2) {
        return new c(cVar, cVar2);
    }

    public static b c(p pVar, com.planner5d.library.model.manager.config.h hVar) {
        return new b(pVar, hVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f181703a.get(), this.f181704b.get());
    }
}
