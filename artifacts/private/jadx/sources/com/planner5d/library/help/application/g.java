package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.a5;
import com.planner5d.library.model.manager.b5;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class g implements dagger.internal.h<b5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f179979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<a5> f179980b;

    public g(c cVar, ij.c<a5> cVar2) {
        this.f179979a = cVar;
        this.f179980b = cVar2;
    }

    public static g a(c cVar, ij.c<a5> cVar2) {
        return new g(cVar, cVar2);
    }

    public static b5 c(c cVar, a5 a5Var) {
        return (b5) dagger.internal.p.f(cVar.d(a5Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b5 get() {
        return c(this.f179979a, this.f179980b.get());
    }
}
