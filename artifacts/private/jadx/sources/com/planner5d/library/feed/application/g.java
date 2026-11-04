package com.planner5d.library.feed.application;

import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.e
@r
@s
public final class g implements h<f.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f170896a = new g();

        private a() {
        }
    }

    public static g a() {
        return a.f170896a;
    }

    public static f.a c() {
        return new f.a();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f.a get() {
        return c();
    }
}
