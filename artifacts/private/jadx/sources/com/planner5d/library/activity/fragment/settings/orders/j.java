package com.planner5d.library.activity.fragment.settings.orders;

import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f135344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f> f135345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<a> f135346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t> f135347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<s0> f135348e;

    public j(ij.c<com.planner5d.library.model.manager.payments.j> cVar, ij.c<f> cVar2, ij.c<a> cVar3, ij.c<t> cVar4, ij.c<s0> cVar5) {
        this.f135344a = cVar;
        this.f135345b = cVar2;
        this.f135346c = cVar3;
        this.f135347d = cVar4;
        this.f135348e = cVar5;
    }

    public static j a(ij.c<com.planner5d.library.model.manager.payments.j> cVar, ij.c<f> cVar2, ij.c<a> cVar3, ij.c<t> cVar4, ij.c<s0> cVar5) {
        return new j(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static i c() {
        return new i();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        i iVarC = c();
        k.f(iVarC, this.f135344a.get());
        k.e(iVarC, this.f135345b.get());
        k.d(iVarC, this.f135346c);
        k.g(iVarC, this.f135347d.get());
        k.b(iVarC, this.f135348e.get());
        return iVarC;
    }
}
