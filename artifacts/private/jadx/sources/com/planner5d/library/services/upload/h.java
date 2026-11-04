package com.planner5d.library.services.upload;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.e
@r
@s("javax.inject.Singleton")
public final class h implements dagger.internal.h<g> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f225037a = new h();

        private a() {
        }
    }

    public static h a() {
        return a.f225037a;
    }

    public static g c() {
        return new g();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c();
    }
}
