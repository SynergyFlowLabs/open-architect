package com.planner5d.library.model.manager;

import com.planner5d.library.database.ApplicationDatabase;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ApplicationDatabase> f191871a;

    public m(ij.c<ApplicationDatabase> cVar) {
        this.f191871a = cVar;
    }

    public static m a(ij.c<ApplicationDatabase> cVar) {
        return new m(cVar);
    }

    public static l c(fg.e<ApplicationDatabase> eVar) {
        return new l(eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(dagger.internal.g.a(this.f191871a));
    }
}
