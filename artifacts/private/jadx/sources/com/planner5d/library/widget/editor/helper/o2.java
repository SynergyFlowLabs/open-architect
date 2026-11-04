package com.planner5d.library.widget.editor.helper;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o2 implements dagger.internal.h<n2.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.b2> f256641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<cf.a> f256642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<le.k> f256643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f256644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f256645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f256646f;

    public o2(ij.c<com.planner5d.library.model.manager.b2> cVar, ij.c<cf.a> cVar2, ij.c<le.k> cVar3, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar4, ij.c<com.planner5d.library.activity.fragment.x> cVar5, ij.c<com.planner5d.library.services.utility.t> cVar6) {
        this.f256641a = cVar;
        this.f256642b = cVar2;
        this.f256643c = cVar3;
        this.f256644d = cVar4;
        this.f256645e = cVar5;
        this.f256646f = cVar6;
    }

    public static o2 a(ij.c<com.planner5d.library.model.manager.b2> cVar, ij.c<cf.a> cVar2, ij.c<le.k> cVar3, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar4, ij.c<com.planner5d.library.activity.fragment.x> cVar5, ij.c<com.planner5d.library.services.utility.t> cVar6) {
        return new o2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static n2.a c(com.planner5d.library.model.manager.b2 b2Var, cf.a aVar, le.k kVar, com.planner5d.library.activity.fragment.dialog.k kVar2, com.planner5d.library.activity.fragment.x xVar, com.planner5d.library.services.utility.t tVar) {
        return new n2.a(b2Var, aVar, kVar, kVar2, xVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n2.a get() {
        return c(this.f256641a.get(), this.f256642b.get(), this.f256643c.get(), this.f256644d.get(), this.f256645e.get(), this.f256646f.get());
    }
}
