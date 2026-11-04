package com.planner5d.library.activity.fragment.dialog;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t implements dagger.internal.h<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k> f133047a;

    public t(ij.c<k> cVar) {
        this.f133047a = cVar;
    }

    public static t a(ij.c<k> cVar) {
        return new t(cVar);
    }

    public static s c(k kVar) {
        return new s(kVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f133047a.get());
    }
}
