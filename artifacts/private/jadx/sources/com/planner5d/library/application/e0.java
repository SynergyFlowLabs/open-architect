package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class e0 implements dagger.internal.h<com.planner5d.library.widget.editor.helper.o3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.helper.n3> f142524b;

    public e0(i iVar, ij.c<com.planner5d.library.widget.editor.helper.n3> cVar) {
        this.f142523a = iVar;
        this.f142524b = cVar;
    }

    public static e0 a(i iVar, ij.c<com.planner5d.library.widget.editor.helper.n3> cVar) {
        return new e0(iVar, cVar);
    }

    public static com.planner5d.library.widget.editor.helper.o3 c(i iVar, com.planner5d.library.widget.editor.helper.n3 n3Var) {
        return (com.planner5d.library.widget.editor.helper.o3) dagger.internal.p.f(iVar.z(n3Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.widget.editor.helper.o3 get() {
        return c(this.f142523a, this.f142524b.get());
    }
}
