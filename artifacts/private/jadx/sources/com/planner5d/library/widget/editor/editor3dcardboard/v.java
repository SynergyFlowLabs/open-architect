package com.planner5d.library.widget.editor.editor3dcardboard;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f256067a;

    public v(ij.c<com.planner5d.library.application.d> cVar) {
        this.f256067a = cVar;
    }

    public static v a(ij.c<com.planner5d.library.application.d> cVar) {
        return new v(cVar);
    }

    public static u c(com.planner5d.library.application.d dVar) {
        return new u(dVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f256067a.get());
    }
}
