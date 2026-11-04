package com.planner5d.library.smartwizard.interactor;

import com.planner5d.library.model.manager.w;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<w> f229925a;

    public b(ij.c<w> cVar) {
        this.f229925a = cVar;
    }

    public static b a(ij.c<w> cVar) {
        return new b(cVar);
    }

    public static a c(w wVar) {
        return new a(wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f229925a.get());
    }
}
