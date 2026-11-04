package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class r implements dagger.internal.h<com.planner5d.library.widget.editor.controls.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148246a;

    public r(i iVar) {
        this.f148246a = iVar;
    }

    public static r a(i iVar) {
        return new r(iVar);
    }

    public static com.planner5d.library.widget.editor.controls.a c(i iVar) {
        return (com.planner5d.library.widget.editor.controls.a) dagger.internal.p.f(iVar.m());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.widget.editor.controls.a get() {
        return c(this.f148246a);
    }
}
