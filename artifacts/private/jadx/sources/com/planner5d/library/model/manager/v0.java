package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s("javax.inject.Singleton")
public final class v0 implements dagger.internal.h<u0> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final v0 f222344a = new v0();

        private a() {
        }
    }

    public static v0 a() {
        return a.f222344a;
    }

    public static u0 c() {
        return new u0();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u0 get() {
        return c();
    }
}
