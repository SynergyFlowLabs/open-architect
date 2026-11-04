package com.planner5d.library.activity.fragment.profile.promocode;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.user.o0;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class f implements h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<o0> f134844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f134845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f134846c;

    public f(ij.c<o0> cVar, ij.c<t> cVar2, ij.c<b2> cVar3) {
        this.f134844a = cVar;
        this.f134845b = cVar2;
        this.f134846c = cVar3;
    }

    public static f a(ij.c<o0> cVar, ij.c<t> cVar2, ij.c<b2> cVar3) {
        return new f(cVar, cVar2, cVar3);
    }

    public static e c(o0 o0Var, t tVar, b2 b2Var) {
        return new e(o0Var, tVar, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f134844a.get(), this.f134845b.get(), this.f134846c.get());
    }
}
