package com.planner5d.library.widget.editor.popup.itemproperties.pages.texture;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class p implements dagger.internal.h<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.f> f257775a;

    public p(ij.c<com.planner5d.library.model.manager.f> cVar) {
        this.f257775a = cVar;
    }

    public static p a(ij.c<com.planner5d.library.model.manager.f> cVar) {
        return new p(cVar);
    }

    public static o c(com.planner5d.library.model.manager.f fVar) {
        return new o(fVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c(this.f257775a.get());
    }
}
