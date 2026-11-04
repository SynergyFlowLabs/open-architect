package com.planner5d.library.widget.rate;

import com.planner5d.library.model.manager.config.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p> f258652a;

    public b(ij.c<p> cVar) {
        this.f258652a = cVar;
    }

    public static b a(ij.c<p> cVar) {
        return new b(cVar);
    }

    public static a c(p pVar) {
        return new a(pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f258652a.get());
    }
}
