package com.planner5d.library.activity.fragment.messages;

import com.planner5d.library.model.manager.b2;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b2> f134496a;

    public h(ij.c<b2> cVar) {
        this.f134496a = cVar;
    }

    public static h a(ij.c<b2> cVar) {
        return new h(cVar);
    }

    public static g c(b2 b2Var) {
        return new g(b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f134496a.get());
    }
}
