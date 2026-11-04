package com.planner5d.library.widget.editor.editor3d.controller;

import androidx.annotation.m1;
import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemUnknown;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.services.utility.y1;
import com.planner5d.library.widget.editor.editor3d.model.n;
import com.planner5d.library.widget.editor.helper.r3;

/* JADX INFO: loaded from: classes12.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.scene3d.j f255447a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.engine.g f255448b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n[] f255449c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Item f255450d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ItemFloor f255451e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.planner5d.library.widget.editor.helper.g f255452f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f255453g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f255454h = new m();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f255455i = new k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f255456j = new m();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k f255457k = new k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m f255458l = new m();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ItemLayout f255459m = new ItemLayout();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f255460n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f255461o = new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.controller.i
        @Override // java.lang.Runnable
        public final void run() {
            this.f255446a.d();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.helper.k f255462p = new com.planner5d.library.widget.editor.helper.k();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final r3 f255463q = new r3();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.planner5d.library.widget.editor.projectresources.viewoptions.b f255464r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.planner5d.library.engine.util.math.g f255465s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final k f255466t = new k();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final k f255467u = new k();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final k f255468v = new k();

    j() {
    }

    private boolean b(com.planner5d.library.engine.k kVar, double d10, double d11, m mVar) {
        return c(kVar, d10, d11, mVar);
    }

    private boolean c(com.planner5d.library.engine.k kVar, double d10, double d11, m mVar) {
        return com.planner5d.library.engine.util.math.d.f(this.f255448b.S1(kVar, (float) d10, (float) d11), this.f255465s, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255447a;
        if (jVar != null) {
            n[] nVarArr = this.f255449c;
            n nVarZ = jVar.z();
            n[] nVarArrX = jVar.x();
            if (nVarArr != null && nVarArr.length != 0 && nVarZ != null && nVarArrX.length == nVarArr.length) {
                for (int i10 = 0; i10 < nVarArr.length; i10++) {
                    if (nVarArrX[i10] == nVarArr[i10]) {
                    }
                }
                nVarZ.n(this.f255459m);
                for (n nVar : nVarArr) {
                    nVar.n(this.f255459m);
                }
                if (this.f255450d instanceof ItemWindow) {
                    jVar.R();
                }
                jVar.C();
            }
        }
    }

    void e(com.planner5d.library.engine.k kVar, double d10, double d11) {
        j jVar;
        n[] nVarArr = this.f255449c;
        if (nVarArr == null || nVarArr.length == 0) {
            return;
        }
        if (this.f255460n) {
            jVar = this;
            if (!jVar.b(kVar, d10, d11, this.f255454h)) {
                return;
            } else {
                jVar.f255459m.setPosition(gc.d.b(jVar.f255454h.f180482a + jVar.f255466t.f180480a), gc.d.b(jVar.f255454h.f180484c + jVar.f255466t.f180481b));
            }
        } else {
            jVar = this;
            float f10 = (float) d10;
            float f11 = (float) d11;
            jVar.f255457k.U(f10, f11).c0(jVar.f255455i).R(0.5f);
            jVar.f255468v.U(jVar.f255448b.Q1().f180482a, jVar.f255448b.Q1().f180484c).M();
            jVar.f255467u.V(jVar.f255468v).O(1).R(jVar.f255457k.f180480a);
            jVar.f255468v.R(-jVar.f255457k.f180481b);
            ItemLayout itemLayout = jVar.f255459m;
            m mVar = jVar.f255456j;
            float f12 = mVar.f180482a;
            k kVar2 = jVar.f255467u;
            float f13 = f12 + kVar2.f180480a;
            k kVar3 = jVar.f255468v;
            itemLayout.setPosition(f13 + kVar3.f180480a, mVar.f180483b + kVar2.f180481b + kVar3.f180481b, mVar.f180484c);
            jVar.f255455i.U(f10, f11);
            jVar.f255459m.getPosition(jVar.f255456j);
        }
        Item item = jVar.f255450d;
        if (item instanceof ItemWindow) {
            item.setLayout(jVar.f255459m);
            jVar.f255462p.b(jVar.f255451e, (ItemWindow) jVar.f255450d, jVar.f255464r);
            jVar.f255450d.getLayout(jVar.f255459m);
        } else {
            com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar = jVar.f255464r;
            if (bVar.f258079j) {
                ItemLayout itemLayout2 = jVar.f255459m;
                itemLayout2.setPosition(jVar.f255463q.e(bVar, itemLayout2.getPosition(jVar.f255457k)));
            }
        }
        jVar.f255447a.I(jVar.f255461o);
    }

    @m1
    void f(com.planner5d.library.widget.editor.facade.f fVar, com.planner5d.library.widget.editor.helper.g gVar, com.planner5d.library.engine.k kVar, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, com.planner5d.library.engine.g gVar2, double d10, double d11) {
        if (jVar == null || this.f255453g) {
            return;
        }
        n[] nVarArrX = jVar.x();
        this.f255449c = nVarArrX;
        Item item = nVarArrX == null ? null : nVarArrX[0].f255766b;
        this.f255450d = item;
        if (nVarArrX == null || (!((item instanceof ItemNs) || (item instanceof ItemPr) || (item instanceof ItemUnknown)) || ((item instanceof ItemNs) && !gVar.c(item)))) {
            this.f255449c = null;
            return;
        }
        if (jVar.z() == null) {
            return;
        }
        this.f255451e = null;
        if (this.f255450d instanceof ItemWindow) {
            this.f255451e = jVar.r().getItemFloor(this.f255450d);
        }
        this.f255447a = jVar;
        this.f255452f = gVar;
        this.f255448b = gVar2;
        this.f255450d.getLayout(this.f255459m).getPosition(this.f255456j);
        this.f255455i.U((float) d10, (float) d11);
        boolean z10 = y1.f229856a.a(gVar2.Q1(), new m(gVar2.Q1().f180482a, 0.0f, gVar2.Q1().f180484c)) > 30.0f;
        this.f255460n = z10;
        if (z10) {
            this.f255465s = new com.planner5d.library.engine.util.math.g(y1.f229859d, -gc.d.d(this.f255456j.f180484c));
            if (b(kVar, d10, d11, this.f255458l)) {
                this.f255454h.A0(this.f255449c[0].f255767c.j().H0(this.f255458l));
                k kVar2 = this.f255466t;
                m mVar = this.f255454h;
                kVar2.U(mVar.f180482a, mVar.f180484c);
            }
        }
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = fVar.G1();
        this.f255464r = bVarG1;
        if (bVarG1 != null && bVarG1.g()) {
            Item item2 = this.f255450d;
            if ((item2 instanceof ItemWindow) || (item2 instanceof ItemPr)) {
                return;
            }
        }
        gVar.b();
        this.f255453g = true;
    }

    void g() {
        if (this.f255449c != null) {
            this.f255452f.i();
        }
        this.f255447a = null;
        this.f255448b = null;
        this.f255449c = null;
        this.f255453g = false;
    }
}
