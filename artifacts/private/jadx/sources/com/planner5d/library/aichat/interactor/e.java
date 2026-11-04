package com.planner5d.library.aichat.interactor;

import com.planner5d.library.modules.user.user.a0;
import com.planner5d.library.modules.user.user.w;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class e implements h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<a0> f142013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<w> f142014b;

    public e(ij.c<a0> cVar, ij.c<w> cVar2) {
        this.f142013a = cVar;
        this.f142014b = cVar2;
    }

    public static e a(ij.c<a0> cVar, ij.c<w> cVar2) {
        return new e(cVar, cVar2);
    }

    public static d c(a0 a0Var, w wVar) {
        return new d(a0Var, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f142013a.get(), this.f142014b.get());
    }
}
