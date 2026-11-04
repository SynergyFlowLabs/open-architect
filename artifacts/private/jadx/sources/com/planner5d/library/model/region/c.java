package com.planner5d.library.model.region;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.e
@r
@s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f222777a = new c();

        private a() {
        }
    }

    public static c a() {
        return a.f222777a;
    }

    public static b c() {
        return new b();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c();
    }
}
