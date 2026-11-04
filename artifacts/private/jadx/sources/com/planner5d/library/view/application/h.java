package com.planner5d.library.view.application;

import com.planner5d.library.activity.fragment.FragmentController;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes12.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<Class<? extends FragmentController>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f244842a;

    public h(d dVar) {
        this.f244842a = dVar;
    }

    public static h a(d dVar) {
        return new h(dVar);
    }

    public static Class<? extends FragmentController> c(d dVar) {
        return (Class) p.f(dVar.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Class<? extends FragmentController> get() {
        return c(this.f244842a);
    }
}
