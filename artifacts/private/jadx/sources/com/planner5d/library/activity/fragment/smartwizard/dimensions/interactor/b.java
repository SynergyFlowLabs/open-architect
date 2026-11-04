package com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor;

import com.planner5d.library.activity.fragment.smartwizard.v;
import com.planner5d.library.model.manager.f2;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<f2> f135527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<v> f135528b;

    public b(ij.c<f2> cVar, ij.c<v> cVar2) {
        this.f135527a = cVar;
        this.f135528b = cVar2;
    }

    public static b a(ij.c<f2> cVar, ij.c<v> cVar2) {
        return new b(cVar, cVar2);
    }

    public static a c(f2 f2Var, v vVar) {
        return new a(f2Var, vVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f135527a.get(), this.f135528b.get());
    }
}
