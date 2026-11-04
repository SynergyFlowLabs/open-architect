package com.planner5d.library.activity.fragment.dialog.authentication;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z implements dagger.internal.h<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.auth.m> f132039a;

    public z(ij.c<com.planner5d.library.modules.user.auth.m> cVar) {
        this.f132039a = cVar;
    }

    public static z a(ij.c<com.planner5d.library.modules.user.auth.m> cVar) {
        return new z(cVar);
    }

    public static y c(com.planner5d.library.modules.user.auth.m mVar) {
        return new y(mVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f132039a.get());
    }
}
