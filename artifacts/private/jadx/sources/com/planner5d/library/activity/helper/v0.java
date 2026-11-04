package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class v0 implements dagger.internal.h<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f137183a;

    public v0(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar) {
        this.f137183a = cVar;
    }

    public static v0 a(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar) {
        return new v0(cVar);
    }

    public static t0 c() {
        return new t0();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        t0 t0VarC = c();
        w0.b(t0VarC, this.f137183a.get());
        return t0VarC;
    }
}
