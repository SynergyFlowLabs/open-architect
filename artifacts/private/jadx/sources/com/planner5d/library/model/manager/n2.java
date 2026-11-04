package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s("javax.inject.Singleton")
public final class n2 implements dagger.internal.h<m2> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final n2 f192204a = new n2();

        private a() {
        }
    }

    public static n2 a() {
        return a.f192204a;
    }

    public static m2 c() {
        return new m2();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m2 get() {
        return c();
    }
}
