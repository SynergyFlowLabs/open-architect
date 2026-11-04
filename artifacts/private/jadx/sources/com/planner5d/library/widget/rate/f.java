package com.planner5d.library.widget.rate;

import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.model.manager.statistics.b0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b0> f258670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<k> f258671b;

    public f(ij.c<b0> cVar, ij.c<k> cVar2) {
        this.f258670a = cVar;
        this.f258671b = cVar2;
    }

    public static f a(ij.c<b0> cVar, ij.c<k> cVar2) {
        return new f(cVar, cVar2);
    }

    public static e c(b0 b0Var, k kVar) {
        return new e(b0Var, kVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f258670a.get(), this.f258671b.get());
    }
}
