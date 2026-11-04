package com.planner5d.library.activity.fragment.smartwizard.decorator.interactor;

import com.planner5d.library.model.manager.b2;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;
import pa.d;

/* JADX INFO: loaded from: classes6.dex */
@r
@e
@s
public final class c implements h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f135434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<d> f135435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f135436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.d> f135437d;

    public c(ij.c<com.planner5d.library.application.b> cVar, ij.c<d> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.model.manager.config.d> cVar4) {
        this.f135434a = cVar;
        this.f135435b = cVar2;
        this.f135436c = cVar3;
        this.f135437d = cVar4;
    }

    public static c a(ij.c<com.planner5d.library.application.b> cVar, ij.c<d> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.model.manager.config.d> cVar4) {
        return new c(cVar, cVar2, cVar3, cVar4);
    }

    public static b c(com.planner5d.library.application.b bVar, d dVar, b2 b2Var, com.planner5d.library.model.manager.config.d dVar2) {
        return new b(bVar, dVar, b2Var, dVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f135434a.get(), this.f135435b.get(), this.f135436c.get(), this.f135437d.get());
    }
}
