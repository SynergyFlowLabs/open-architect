package com.planner5d.library.model.manager.config.source.growthbook;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.e
@r
@s
public final class k implements dagger.internal.h<j> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f181779a = new k();

        private a() {
        }
    }

    public static k a() {
        return a.f181779a;
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
