package com.planner5d.library.dgenerator.data;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@e
@r
@s("com.planner5d.library.dgenerator.application.DesignGeneratorScope")
public final class b implements h<com.planner5d.library.dgenerator.data.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f160099a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.f160099a;
    }

    public static com.planner5d.library.dgenerator.data.a c() {
        return new com.planner5d.library.dgenerator.data.a();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.dgenerator.data.a get() {
        return c();
    }
}
