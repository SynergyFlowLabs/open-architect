package com.planner5d.library.model.manager;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class e5 implements dagger.internal.h<d5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<SharedPreferences> f191303a;

    public e5(ij.c<SharedPreferences> cVar) {
        this.f191303a = cVar;
    }

    public static e5 a(ij.c<SharedPreferences> cVar) {
        return new e5(cVar);
    }

    public static d5 c(SharedPreferences sharedPreferences) {
        return new d5(sharedPreferences);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d5 get() {
        return c(this.f191303a.get());
    }
}
