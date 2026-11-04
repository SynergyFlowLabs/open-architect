package com.planner5d.library.widget.editor.helper;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class l2 implements dagger.internal.h<k2.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.itemactionsbar.h> f256527a;

    public l2(ij.c<com.planner5d.library.widget.editor.itemactionsbar.h> cVar) {
        this.f256527a = cVar;
    }

    public static l2 a(ij.c<com.planner5d.library.widget.editor.itemactionsbar.h> cVar) {
        return new l2(cVar);
    }

    public static k2.a c(com.planner5d.library.widget.editor.itemactionsbar.h hVar) {
        return new k2.a(hVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k2.a get() {
        return c(this.f256527a.get());
    }
}
