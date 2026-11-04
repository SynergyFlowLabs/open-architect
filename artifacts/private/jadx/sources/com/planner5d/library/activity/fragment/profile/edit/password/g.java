package com.planner5d.library.activity.fragment.profile.edit.password;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class g implements h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t> f134695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b2> f134696b;

    public g(ij.c<t> cVar, ij.c<b2> cVar2) {
        this.f134695a = cVar;
        this.f134696b = cVar2;
    }

    public static g a(ij.c<t> cVar, ij.c<b2> cVar2) {
        return new g(cVar, cVar2);
    }

    public static f c(t tVar, b2 b2Var) {
        return new f(tVar, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f134695a.get(), this.f134696b.get());
    }
}
