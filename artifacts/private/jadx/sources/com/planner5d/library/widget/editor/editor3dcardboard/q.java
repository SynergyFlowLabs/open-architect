package com.planner5d.library.widget.editor.editor3dcardboard;

import com.planner5d.library.model.manager.statistics.b0;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
public final class q implements fg.g<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b0> f256030a;

    public q(ij.c<b0> cVar) {
        this.f256030a = cVar;
    }

    public static fg.g<p> a(ij.c<b0> cVar) {
        return new q(cVar);
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboardController.statisticsManager")
    public static void c(p pVar, b0 b0Var) {
        pVar.f256026c = b0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(p pVar) {
        c(pVar, this.f256030a.get());
    }
}
