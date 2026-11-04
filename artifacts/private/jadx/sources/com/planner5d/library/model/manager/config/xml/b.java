package com.planner5d.library.model.manager.config.xml;

import android.content.SharedPreferences;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@e
@s("javax.inject.Singleton")
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<SharedPreferences> f190967a;

    public b(ij.c<SharedPreferences> preferencesProvider) {
        this.f190967a = preferencesProvider;
    }

    public static b a(ij.c<SharedPreferences> preferencesProvider) {
        return new b(preferencesProvider);
    }

    public static a c(SharedPreferences preferences) {
        return new a(preferences);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f190967a.get());
    }
}
