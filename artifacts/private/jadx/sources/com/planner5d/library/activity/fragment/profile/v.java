package com.planner5d.library.activity.fragment.profile;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<u.b> f134860a;

    public v(ij.c<u.b> cVar) {
        this.f134860a = cVar;
    }

    public static v a(ij.c<u.b> cVar) {
        return new v(cVar);
    }

    public static u c(u.b bVar) {
        return new u(bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f134860a.get());
    }
}
