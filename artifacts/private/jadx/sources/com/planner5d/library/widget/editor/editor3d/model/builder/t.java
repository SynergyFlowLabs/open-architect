package com.planner5d.library.widget.editor.editor3d.model.builder;

/* JADX INFO: loaded from: classes12.dex */
public class t extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f255695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dc.k<cc.a> f255696b;

    public t(dc.d<cc.a> dVar) {
        dc.k<T> kVarD = dVar.d(1878891, b.f255633h);
        this.f255696b = kVarD;
        this.f255695a = new b(null, new com.planner5d.library.math.m(1.0f, 1.0f, 1.0f), kVarD.o());
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    public cc.a a(com.planner5d.library.engine.a aVar, ve.b bVar) {
        this.f255696b.f(aVar);
        this.f255695a.a();
        return this.f255696b.g(null);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    public void b(ve.b bVar) {
    }
}
