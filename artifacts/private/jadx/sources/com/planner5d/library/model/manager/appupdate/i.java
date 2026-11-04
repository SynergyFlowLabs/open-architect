package com.planner5d.library.model.manager.appupdate;

import com.planner5d.library.model.manager.config.j;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.services.utility.f1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<j> f180841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p> f180842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f1> f180843c;

    public i(ij.c<j> cVar, ij.c<p> cVar2, ij.c<f1> cVar3) {
        this.f180841a = cVar;
        this.f180842b = cVar2;
        this.f180843c = cVar3;
    }

    public static i a(ij.c<j> cVar, ij.c<p> cVar2, ij.c<f1> cVar3) {
        return new i(cVar, cVar2, cVar3);
    }

    public static h c(j jVar, p pVar, f1 f1Var) {
        return new h(jVar, pVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f180841a.get(), this.f180842b.get(), this.f180843c.get());
    }
}
