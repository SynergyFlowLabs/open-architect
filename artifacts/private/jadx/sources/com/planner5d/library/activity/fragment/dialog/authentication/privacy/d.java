package com.planner5d.library.activity.fragment.dialog.authentication.privacy;

import com.planner5d.library.modules.user.user.m0;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@e
@s
public final class d implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.b> f131990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<m0> f131991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t> f131992c;

    public d(ij.c<com.planner5d.library.modules.user.user.b> cVar, ij.c<m0> cVar2, ij.c<t> cVar3) {
        this.f131990a = cVar;
        this.f131991b = cVar2;
        this.f131992c = cVar3;
    }

    public static d a(ij.c<com.planner5d.library.modules.user.user.b> cVar, ij.c<m0> cVar2, ij.c<t> cVar3) {
        return new d(cVar, cVar2, cVar3);
    }

    public static c c(com.planner5d.library.modules.user.user.b bVar, m0 m0Var, t tVar) {
        return new c(bVar, m0Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f131990a.get(), this.f131991b.get(), this.f131992c.get());
    }
}
