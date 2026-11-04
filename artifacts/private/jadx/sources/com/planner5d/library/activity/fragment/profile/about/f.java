package com.planner5d.library.activity.fragment.profile.about;

import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.t2;
import com.planner5d.library.modules.user.user.w;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class f implements h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<e1> f134552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t2> f134553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<w> f134554c;

    public f(ij.c<e1> cVar, ij.c<t2> cVar2, ij.c<w> cVar3) {
        this.f134552a = cVar;
        this.f134553b = cVar2;
        this.f134554c = cVar3;
    }

    public static f a(ij.c<e1> cVar, ij.c<t2> cVar2, ij.c<w> cVar3) {
        return new f(cVar, cVar2, cVar3);
    }

    public static e c(e1 e1Var, t2 t2Var, w wVar) {
        return new e(e1Var, t2Var, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f134552a.get(), this.f134553b.get(), this.f134554c.get());
    }
}
