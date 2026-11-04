package com.planner5d.library.model.region;

import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class k implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t> f222802a;

    public k(ij.c<t> cVar) {
        this.f222802a = cVar;
    }

    public static k a(ij.c<t> cVar) {
        return new k(cVar);
    }

    public static j c(fg.e<t> eVar) {
        return new j(eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(dagger.internal.g.a(this.f222802a));
    }
}
