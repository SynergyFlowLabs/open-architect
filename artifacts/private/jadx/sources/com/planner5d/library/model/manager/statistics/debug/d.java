package com.planner5d.library.model.manager.statistics.debug;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@e
@r
@s("javax.inject.Singleton")
public final class d implements h<c> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f211855a = new d();

        private a() {
        }
    }

    public static d a() {
        return a.f211855a;
    }

    public static c c() {
        return new c();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c();
    }
}
