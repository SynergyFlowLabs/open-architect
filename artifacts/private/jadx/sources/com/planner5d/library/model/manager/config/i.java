package com.planner5d.library.model.manager.config;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s("javax.inject.Singleton")
public final class i implements dagger.internal.h<h> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f181544a = new i();

        private a() {
        }
    }

    public static i a() {
        return a.f181544a;
    }

    public static h c() {
        return new h();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c();
    }
}
