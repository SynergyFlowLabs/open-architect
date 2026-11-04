package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f1 implements dagger.internal.h<cf.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.interactor.a> f142537b;

    public f1(i iVar, ij.c<com.planner5d.library.widget.editor.interactor.a> cVar) {
        this.f142536a = iVar;
        this.f142537b = cVar;
    }

    public static f1 a(i iVar, ij.c<com.planner5d.library.widget.editor.interactor.a> cVar) {
        return new f1(iVar, cVar);
    }

    public static cf.a c(i iVar, com.planner5d.library.widget.editor.interactor.a aVar) {
        return (cf.a) dagger.internal.p.f(iVar.b0(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public cf.a get() {
        return c(this.f142536a, this.f142537b.get());
    }
}
