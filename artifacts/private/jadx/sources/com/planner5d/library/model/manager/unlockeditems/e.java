package com.planner5d.library.model.manager.unlockeditems;

import com.planner5d.library.model.manager.config.p;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class e implements h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p> f222324a;

    public e(ij.c<p> cVar) {
        this.f222324a = cVar;
    }

    public static e a(ij.c<p> cVar) {
        return new e(cVar);
    }

    public static d c(p pVar) {
        return new d(pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f222324a.get());
    }
}
