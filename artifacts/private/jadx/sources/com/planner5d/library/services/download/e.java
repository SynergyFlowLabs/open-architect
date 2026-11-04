package com.planner5d.library.services.download;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.e
@r
@s("javax.inject.Singleton")
public final class e implements dagger.internal.h<d> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f224277a = new e();

        private a() {
        }
    }

    public static e a() {
        return a.f224277a;
    }

    public static d c() {
        return new d();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c();
    }
}
