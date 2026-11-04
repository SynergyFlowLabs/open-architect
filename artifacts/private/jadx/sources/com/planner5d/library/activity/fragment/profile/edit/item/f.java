package com.planner5d.library.activity.fragment.profile.edit.item;

import com.planner5d.library.model.manager.b2;
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
    private final ij.c<t> f134609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b2> f134610b;

    public f(ij.c<t> cVar, ij.c<b2> cVar2) {
        this.f134609a = cVar;
        this.f134610b = cVar2;
    }

    public static f a(ij.c<t> cVar, ij.c<b2> cVar2) {
        return new f(cVar, cVar2);
    }

    public static e c(t tVar, b2 b2Var) {
        return new e(tVar, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f134609a.get(), this.f134610b.get());
    }
}
