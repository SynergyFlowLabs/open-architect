package com.planner5d.library.widget.editor.editor3d.controller.navigation;

import androidx.annotation.NonNull;
import com.planner5d.library.math.m;
import com.planner5d.library.widget.editor.editor3d.scene3d.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class d extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.planner5d.library.math.k[] f255489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.math.k f255490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f255491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.editor3d.scene3d.j> f255492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f255493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f255494j;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f255495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l.a[] f255496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l.a[] f255497c;

        private a(float f10, l.a[] aVarArr, l.a[] aVarArr2) {
            this.f255495a = f10;
            this.f255496b = aVarArr2;
            this.f255497c = aVarArr;
        }
    }

    public d(j jVar, ij.c<com.planner5d.library.widget.editor.editor3d.scene3d.j> cVar) {
        super(jVar);
        this.f255489e = new com.planner5d.library.math.k[]{new com.planner5d.library.math.k(), new com.planner5d.library.math.k()};
        this.f255490f = new com.planner5d.library.math.k();
        this.f255491g = new m();
        this.f255493i = null;
        this.f255494j = new i();
        this.f255492h = cVar;
    }

    private l.a[] n(com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, float f10) {
        if (jVar == null) {
            return null;
        }
        float f11 = f10 + this.f255482b.h(this.f255491g).f180483b;
        l.a[] aVarArrT = jVar.t();
        a aVar = this.f255493i;
        if (aVar == null || aVar.f255495a != f11 || this.f255493i.f255497c != aVarArrT) {
            ArrayList arrayList = new ArrayList();
            gc.d.e(this.f255490f.U(f11 - 170.0f, 60.0f + f11));
            for (l.a aVar2 : aVarArrT) {
                if (this.f255490f.f180480a <= aVar2.f255866b.x(this.f255491g).f180483b && this.f255490f.f180481b >= aVar2.f255866b.y(this.f255491g).f180483b) {
                    arrayList.add(aVar2);
                }
            }
            this.f255493i = new a(f11, aVarArrT, (l.a[]) arrayList.toArray(new l.a[0]));
        }
        return this.f255493i.f255496b;
    }

    private com.planner5d.library.math.k o(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, com.planner5d.library.math.k kVar3, com.planner5d.library.math.k kVar4, com.planner5d.library.math.k kVar5) {
        com.planner5d.library.math.k kVarR = new com.planner5d.library.math.k(kVar3.f180480a + kVar4.f180480a, kVar.f180480a + kVar2.f180480a).R(0.5f);
        kVar5.f180480a = kVarR.f180480a - kVarR.f180481b;
        kVarR.U(kVar3.f180481b + kVar4.f180481b, kVar.f180481b + kVar2.f180481b).R(0.5f);
        kVar5.f180481b = kVarR.f180480a - kVarR.f180481b;
        return kVar5;
    }

    private void p(com.planner5d.library.math.k kVar) {
        this.f255482b.t((-kVar.f180480a) * 0.5f, this.f255491g.y0(0.0f, 1.0f, 0.0f));
        j jVar = this.f255482b;
        jVar.t(kVar.f180481b * 0.5f, jVar.j(this.f255491g));
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void d(boolean z10, int i10) {
        this.f255489e = null;
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void f(float f10, int i10) {
        j jVar = new j(this.f255482b);
        jVar.A(90.0f);
        jVar.h(this.f255491g);
        m mVar = this.f255491g;
        mVar.f180483b = 180.0f;
        jVar.B(mVar);
        this.f255483c.b(this.f255482b, jVar, i10);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void g(float f10, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        if (!kVar.D() && !kVar2.D()) {
            this.f255483c.a();
        }
        if (!kVar.D()) {
            this.f255494j.f(this.f255482b, n(this.f255492h.get(), f10), true, gc.d.e(kVar.S(-1.0f, 1.0f).R(500.0f)).f180480a, kVar.f180481b);
        }
        p(kVar2.R(3.5f));
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void i(float f10, double d10, double d11) {
        this.f255483c.a();
        this.f255494j.f(this.f255482b, n(this.f255492h.get(), f10), false, d10, d11);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void j(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, com.planner5d.library.math.k kVar3, com.planner5d.library.math.k kVar4) {
        this.f255483c.a();
        if (this.f255489e == null) {
            this.f255489e = new com.planner5d.library.math.k[]{new com.planner5d.library.math.k(kVar3), new com.planner5d.library.math.k(kVar4)};
        }
        com.planner5d.library.math.k[] kVarArr = this.f255489e;
        o(kVarArr[0], kVarArr[1], kVar3, kVar4, this.f255490f);
        p(this.f255490f);
        this.f255489e[0].V(kVar3);
        this.f255489e[1].V(kVar4);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void k(float f10, @NonNull com.planner5d.library.engine.g gVar) {
        this.f255482b.F(gVar, f10);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void l(float f10, float f11) {
        this.f255483c.a();
        this.f255482b.D(f10, f11);
        j jVar = this.f255482b;
        jVar.B(jVar.l(this.f255491g));
    }
}
