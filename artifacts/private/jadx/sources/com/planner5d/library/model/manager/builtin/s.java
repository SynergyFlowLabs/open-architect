package com.planner5d.library.model.manager.builtin;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s("javax.inject.Singleton")
public final class s implements dagger.internal.h<r> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final s f181217a = new s();

        private a() {
        }
    }

    public static s a() {
        return a.f181217a;
    }

    public static r c() {
        return new r();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c();
    }
}
