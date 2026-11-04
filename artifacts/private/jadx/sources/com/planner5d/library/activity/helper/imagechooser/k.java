package com.planner5d.library.activity.helper.imagechooser;

import com.planner5d.library.model.manager.t1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class k implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f136964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t1> f136965b;

    public k(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<t1> cVar2) {
        this.f136964a = cVar;
        this.f136965b = cVar2;
    }

    public static k a(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<t1> cVar2) {
        return new k(cVar, cVar2);
    }

    public static j c() {
        return new j();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        j jVarC = c();
        l.b(jVarC, this.f136964a.get());
        l.c(jVarC, this.f136965b.get());
        return jVarC;
    }
}
