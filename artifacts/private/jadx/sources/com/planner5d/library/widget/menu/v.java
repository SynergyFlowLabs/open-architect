package com.planner5d.library.widget.menu;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ue.b[]> f258391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Function1<? super ue.b, Unit>> f258392b;

    public v(ij.c<ue.b[]> cVar, ij.c<Function1<? super ue.b, Unit>> cVar2) {
        this.f258391a = cVar;
        this.f258392b = cVar2;
    }

    public static v a(ij.c<ue.b[]> cVar, ij.c<Function1<? super ue.b, Unit>> cVar2) {
        return new v(cVar, cVar2);
    }

    public static u c(ue.b[] bVarArr, Function1<? super ue.b, Unit> function1) {
        return new u(bVarArr, function1);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f258391a.get(), this.f258392b.get());
    }
}
