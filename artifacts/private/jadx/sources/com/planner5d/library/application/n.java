package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n implements dagger.internal.h<af.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.popup.itemproperties.interactor.a> f142860b;

    public n(i iVar, ij.c<com.planner5d.library.widget.editor.popup.itemproperties.interactor.a> cVar) {
        this.f142859a = iVar;
        this.f142860b = cVar;
    }

    public static n a(i iVar, ij.c<com.planner5d.library.widget.editor.popup.itemproperties.interactor.a> cVar) {
        return new n(iVar, cVar);
    }

    public static af.a c(i iVar, com.planner5d.library.widget.editor.popup.itemproperties.interactor.a aVar) {
        return (af.a) dagger.internal.p.f(iVar.i(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public af.a get() {
        return c(this.f142859a, this.f142860b.get());
    }
}
