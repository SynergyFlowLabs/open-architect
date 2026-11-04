package com.planner5d.library.help.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s
public final class k0 implements dagger.internal.h<j0.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k0 f180010a = new k0();

        private a() {
        }
    }

    public static k0 a() {
        return a.f180010a;
    }

    public static j0.a c() {
        return new j0.a();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j0.a get() {
        return c();
    }
}
