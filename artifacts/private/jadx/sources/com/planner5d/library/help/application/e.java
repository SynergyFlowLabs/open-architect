package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.i1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e implements dagger.internal.h<i1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f179975a;

    public e(c cVar) {
        this.f179975a = cVar;
    }

    public static e a(c cVar) {
        return new e(cVar);
    }

    public static i1 c(c cVar) {
        return (i1) dagger.internal.p.f(cVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i1 get() {
        return c(this.f179975a);
    }
}
