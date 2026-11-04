package com.planner5d.library.interactor;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s
public final class k0 implements dagger.internal.h<j0> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k0 f180195a = new k0();

        private a() {
        }
    }

    public static k0 a() {
        return a.f180195a;
    }

    public static j0 c() {
        return new j0();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j0 get() {
        return c();
    }
}
