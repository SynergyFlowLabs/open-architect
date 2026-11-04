package com.planner5d.library.widget.editor.editaction;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g implements dagger.internal.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f254761a;

    public g(ij.c<com.planner5d.library.model.manager.builtin.i> cVar) {
        this.f254761a = cVar;
    }

    public static g a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar) {
        return new g(cVar);
    }

    public static f c(com.planner5d.library.model.manager.builtin.i iVar) {
        return new f(iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f254761a.get());
    }
}
