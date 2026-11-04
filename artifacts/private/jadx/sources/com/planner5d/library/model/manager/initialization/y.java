package com.planner5d.library.model.manager.initialization;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s("javax.inject.Singleton")
public final class y implements dagger.internal.h<x> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final y f191736a = new y();

        private a() {
        }
    }

    public static y a() {
        return a.f191736a;
    }

    public static x c() {
        return new x();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c();
    }
}
