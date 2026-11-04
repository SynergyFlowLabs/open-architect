package com.planner5d.library.model.manager.payments;

import com.planner5d.library.services.utility.a2;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class w implements dagger.internal.h<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<f1> f193037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f193038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<a2> f193039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f193040d;

    public w(ij.c<f1> cVar, ij.c<com.planner5d.library.services.utility.t> cVar2, ij.c<a2> cVar3, ij.c<com.planner5d.library.modules.user.user.w> cVar4) {
        this.f193037a = cVar;
        this.f193038b = cVar2;
        this.f193039c = cVar3;
        this.f193040d = cVar4;
    }

    public static w a(ij.c<f1> cVar, ij.c<com.planner5d.library.services.utility.t> cVar2, ij.c<a2> cVar3, ij.c<com.planner5d.library.modules.user.user.w> cVar4) {
        return new w(cVar, cVar2, cVar3, cVar4);
    }

    public static v c(f1 f1Var, com.planner5d.library.services.utility.t tVar, a2 a2Var, com.planner5d.library.modules.user.user.w wVar) {
        return new v(f1Var, tVar, a2Var, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f193037a.get(), this.f193038b.get(), this.f193039c.get(), this.f193040d.get());
    }
}
