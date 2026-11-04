package com.planner5d.library.engine.libgdx.rendering.model.managing;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.e
@r
@s("javax.inject.Singleton")
public final class k implements dagger.internal.h<j> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f160965a = new k();

        private a() {
        }
    }

    public static k a() {
        return a.f160965a;
    }

    public static j c() {
        return new j();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c();
    }
}
