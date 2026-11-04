package com.planner5d.library.database.manager;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@e
@r
@s
public final class b implements h<com.planner5d.library.database.manager.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f154075a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.f154075a;
    }

    public static com.planner5d.library.database.manager.a c() {
        return new com.planner5d.library.database.manager.a();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.database.manager.a get() {
        return c();
    }
}
