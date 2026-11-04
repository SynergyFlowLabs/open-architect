package com.planner5d.library.help.application;

import com.planner5d.library.activity.fragment.FragmentController;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<Class<? extends FragmentController>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180012a;

    public m(i iVar) {
        this.f180012a = iVar;
    }

    public static m a(i iVar) {
        return new m(iVar);
    }

    public static Class<? extends FragmentController> c(i iVar) {
        return (Class) dagger.internal.p.f(iVar.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Class<? extends FragmentController> get() {
        return c(this.f180012a);
    }
}
