package com.planner5d.library.legal.view.dialog.authentication;

import com.planner5d.library.modules.user.user.r0;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@r
@dagger.internal.e
@s
public final class f implements h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<r0> f180459a;

    public f(ij.c<r0> cVar) {
        this.f180459a = cVar;
    }

    public static f a(ij.c<r0> cVar) {
        return new f(cVar);
    }

    public static e c(r0 r0Var) {
        return new e(r0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f180459a.get());
    }
}
