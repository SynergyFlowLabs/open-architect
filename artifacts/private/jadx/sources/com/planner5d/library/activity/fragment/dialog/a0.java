package com.planner5d.library.activity.fragment.dialog;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a0 implements dagger.internal.h<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k> f131654a;

    public a0(ij.c<k> cVar) {
        this.f131654a = cVar;
    }

    public static a0 a(ij.c<k> cVar) {
        return new a0(cVar);
    }

    public static y c(k kVar) {
        return new y(kVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f131654a.get());
    }
}
