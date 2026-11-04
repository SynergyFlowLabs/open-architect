package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s
public final class j0 implements dagger.internal.h<com.planner5d.library.model.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j0 f258961a = new j0();

        private a() {
        }
    }

    public static j0 a() {
        return a.f258961a;
    }

    public static com.planner5d.library.model.a c() {
        return (com.planner5d.library.model.a) dagger.internal.p.f(i0.f258958a.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.a get() {
        return c();
    }
}
