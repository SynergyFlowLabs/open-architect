package com.planner5d.library.services.utility;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s("javax.inject.Singleton")
public final class d2 implements dagger.internal.h<c2> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d2 f225179a = new d2();

        private a() {
        }
    }

    public static d2 a() {
        return a.f225179a;
    }

    public static c2 c() {
        return new c2();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c2 get() {
        return c();
    }
}
