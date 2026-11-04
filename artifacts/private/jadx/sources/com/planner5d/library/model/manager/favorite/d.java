package com.planner5d.library.model.manager.favorite;

import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.services.utility.t;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@e
@s
public final class d implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p> f191434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f191435b;

    public d(ij.c<p> cVar, ij.c<t> cVar2) {
        this.f191434a = cVar;
        this.f191435b = cVar2;
    }

    public static d a(ij.c<p> cVar, ij.c<t> cVar2) {
        return new d(cVar, cVar2);
    }

    public static c c(p pVar, t tVar) {
        return new c(pVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f191434a.get(), this.f191435b.get());
    }
}
