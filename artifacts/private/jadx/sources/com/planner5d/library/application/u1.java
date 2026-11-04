package com.planner5d.library.application;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class u1 implements dagger.internal.h<SharedPreferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b> f148285b;

    public u1(i iVar, ij.c<b> cVar) {
        this.f148284a = iVar;
        this.f148285b = cVar;
    }

    public static u1 a(i iVar, ij.c<b> cVar) {
        return new u1(iVar, cVar);
    }

    public static SharedPreferences c(i iVar, b bVar) {
        return (SharedPreferences) dagger.internal.p.f(iVar.r0(bVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences get() {
        return c(this.f148284a, this.f148285b.get());
    }
}
