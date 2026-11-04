package com.planner5d.library.application.designoftheday;

import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.e
@r
@s("javax.inject.Singleton")
public final class g implements h<f> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f142522a = new g();

        private a() {
        }
    }

    public static g a() {
        return a.f142522a;
    }

    public static f c() {
        return new f();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c();
    }
}
