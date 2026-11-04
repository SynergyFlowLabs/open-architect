package com.planner5d.library.model.manager.favorite;

import com.planner5d.library.modules.user.user.t;
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
    private final ij.c<t> f191415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.model.h> f191416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f191417c;

    public b(ij.c<t> cVar, ij.c<com.planner5d.library.database.model.h> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3) {
        this.f191415a = cVar;
        this.f191416b = cVar2;
        this.f191417c = cVar3;
    }

    public static b a(ij.c<t> cVar, ij.c<com.planner5d.library.database.model.h> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3) {
        return new b(cVar, cVar2, cVar3);
    }

    public static a c(t tVar, com.planner5d.library.database.model.h hVar, com.planner5d.library.api.requests.c cVar) {
        return new a(tVar, hVar, cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f191415a.get(), this.f191416b.get(), this.f191417c.get());
    }
}
