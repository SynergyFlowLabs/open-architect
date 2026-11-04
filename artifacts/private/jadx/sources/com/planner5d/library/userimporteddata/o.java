package com.planner5d.library.userimporteddata;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.e
@r
@s("javax.inject.Singleton")
public final class o implements dagger.internal.h<n> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final o f235834a = new o();

        private a() {
        }
    }

    public static o a() {
        return a.f235834a;
    }

    public static n c() {
        return new n();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c();
    }
}
