package com.planner5d.library.services.utility;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s
public final class a3 implements dagger.internal.h<z2> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a3 f225043a = new a3();

        private a() {
        }
    }

    public static a3 a() {
        return a.f225043a;
    }

    public static z2 c() {
        return new z2();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z2 get() {
        return c();
    }
}
