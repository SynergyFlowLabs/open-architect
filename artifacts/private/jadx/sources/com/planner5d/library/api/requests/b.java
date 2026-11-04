package com.planner5d.library.api.requests;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@e
@r
@s("javax.inject.Singleton")
public final class b implements h<com.planner5d.library.api.requests.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f142310a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.f142310a;
    }

    public static com.planner5d.library.api.requests.a c() {
        return new com.planner5d.library.api.requests.a();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.api.requests.a get() {
        return c();
    }
}
