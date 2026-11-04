package com.planner5d.library.model.manager.favorite.room;

import com.planner5d.library.database.ApplicationDatabase;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;
import ij.c;

/* JADX INFO: loaded from: classes8.dex */
@r
@e
@s
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<com.planner5d.library.model.manager.favorite.c> f191454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c<ApplicationDatabase> f191455b;

    public b(c<com.planner5d.library.model.manager.favorite.c> cVar, c<ApplicationDatabase> cVar2) {
        this.f191454a = cVar;
        this.f191455b = cVar2;
    }

    public static b a(c<com.planner5d.library.model.manager.favorite.c> cVar, c<ApplicationDatabase> cVar2) {
        return new b(cVar, cVar2);
    }

    public static a c(com.planner5d.library.model.manager.favorite.c cVar, fg.e<ApplicationDatabase> eVar) {
        return new a(cVar, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f191454a.get(), g.a(this.f191455b));
    }
}
