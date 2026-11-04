package com.planner5d.library.contest.helper;

import com.planner5d.library.model.manager.synchronization.k;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k> f153308a;

    public f(ij.c<k> cVar) {
        this.f153308a = cVar;
    }

    public static f a(ij.c<k> cVar) {
        return new f(cVar);
    }

    public static e c(k kVar) {
        return new e(kVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f153308a.get());
    }
}
