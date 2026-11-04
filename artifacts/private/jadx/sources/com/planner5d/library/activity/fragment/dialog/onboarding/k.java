package com.planner5d.library.activity.fragment.dialog.onboarding;

import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.statistics.events.v3;
import com.planner5d.library.model.manager.w;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class k implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<w> f132219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p> f132220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<v3> f132221c;

    public k(ij.c<w> cVar, ij.c<p> cVar2, ij.c<v3> cVar3) {
        this.f132219a = cVar;
        this.f132220b = cVar2;
        this.f132221c = cVar3;
    }

    public static k a(ij.c<w> cVar, ij.c<p> cVar2, ij.c<v3> cVar3) {
        return new k(cVar, cVar2, cVar3);
    }

    public static j c(w wVar, p pVar, v3 v3Var) {
        return new j(wVar, pVar, v3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f132219a.get(), this.f132220b.get(), this.f132221c.get());
    }
}
