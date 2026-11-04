package com.planner5d.library.activity.tutorial;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p> f141895a;

    public v(ij.c<p> cVar) {
        this.f141895a = cVar;
    }

    public static v a(ij.c<p> cVar) {
        return new v(cVar);
    }

    public static u c(p pVar) {
        return new u(pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f141895a.get());
    }
}
