package com.planner5d.library.widget.editor.editor3d;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
public final class v implements fg.g<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<q> f255897a;

    public v(ij.c<q> cVar) {
        this.f255897a = cVar;
    }

    public static fg.g<t> a(ij.c<q> cVar) {
        return new v(cVar);
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3d.Editor3DController.factoryApplication")
    public static void b(t tVar, ij.c<q> cVar) {
        tVar.f255891c = cVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(t tVar) {
        b(tVar, this.f255897a);
    }
}
