package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.math.k f256712a = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.math.k f256713b = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.math.k f256714c = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.math.k f256715d = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.math.k f256716e = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.math.k f256717f = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.math.k f256718g = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.engine.util.math.h f256719h = new com.planner5d.library.engine.util.math.h();

    private boolean b(ItemWindow itemWindow, com.planner5d.library.engine.util.math.h hVar) {
        return c(itemWindow.getPolygon(this.f256719h), hVar);
    }

    private boolean c(com.planner5d.library.engine.util.math.h hVar, com.planner5d.library.engine.util.math.h hVar2) {
        return (hVar == null || hVar2 == null || !com.planner5d.library.engine.util.math.d.i(hVar, hVar2)) ? false : true;
    }

    public List<ItemWindow> a(WallsInfoWall wallsInfoWall, ItemWindow[] itemWindowArr) {
        LinkedList linkedList = new LinkedList();
        boolean z10 = !true;
        com.planner5d.library.engine.util.math.h hVar = new com.planner5d.library.engine.util.math.h(wallsInfoWall.getPolygonPoints(true));
        for (ItemWindow itemWindow : itemWindowArr) {
            if (b(itemWindow, hVar)) {
                linkedList.add(itemWindow);
                if (wallsInfoWall.getWall() instanceof ItemWall) {
                    itemWindow.updateIntersections(((ItemWall) wallsInfoWall.getWall()).getUid());
                }
            }
        }
        return linkedList;
    }

    public com.planner5d.library.math.k d(com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, com.planner5d.library.math.k kVar, com.planner5d.library.math.c cVar) {
        if (bVar.f258079j) {
            this.f256713b.U(f(bVar, kVar.f180480a), kVar.f180481b);
            this.f256714c.U(this.f256713b.f180480a, 0.0f);
            com.planner5d.library.math.b bVar2 = com.planner5d.library.math.b.f180462a;
            bVar2.c(cVar.e(), cVar.c(), this.f256713b, this.f256714c, this.f256718g);
            this.f256713b.U(kVar.f180480a, f(bVar, kVar.f180481b));
            this.f256714c.U(0.0f, this.f256713b.f180481b);
            bVar2.c(cVar.e(), cVar.c(), this.f256713b, this.f256714c, this.f256717f);
            kVar.V(this.f256712a.V(kVar).c0(this.f256717f).F() < this.f256712a.V(kVar).c0(this.f256718g).F() ? this.f256717f : this.f256718g);
        }
        return kVar;
    }

    public com.planner5d.library.math.k e(com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, com.planner5d.library.math.k kVar) {
        if (bVar.f258079j) {
            kVar.U(f(bVar, kVar.f180480a), f(bVar, kVar.f180481b));
        }
        return kVar;
    }

    public float f(com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, float f10) {
        return bVar.f258079j ? Math.round(f10 / bVar.f258080k) * bVar.f258080k : f10;
    }

    public void g(com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, com.planner5d.library.services.c0 c0Var) {
        if (bVar.f258079j) {
            c0Var.j(com.planner5d.library.services.c0.b.Top, this.f256713b);
            c0Var.h(com.planner5d.library.services.c0.b.Bottom, this.f256714c);
            e(bVar, this.f256712a.V(this.f256714c));
            com.planner5d.library.math.b bVar2 = com.planner5d.library.math.b.f180462a;
            com.planner5d.library.math.k kVar = this.f256713b;
            float f10 = kVar.f180480a;
            float f11 = kVar.f180481b;
            com.planner5d.library.math.k kVar2 = this.f256714c;
            float f12 = kVar2.f180480a;
            float f13 = kVar2.f180481b;
            com.planner5d.library.math.k kVar3 = this.f256712a;
            float f14 = kVar3.f180480a;
            float f15 = kVar3.f180481b;
            float F = bVar2.b(f10, f11, f12, f13, f14, f15, f14, f15 + 1.0f, this.f256717f) ? this.f256717f.c0(this.f256713b).F() : 0.0f;
            com.planner5d.library.math.k kVar4 = this.f256713b;
            float f16 = kVar4.f180480a;
            float f17 = kVar4.f180481b;
            com.planner5d.library.math.k kVar5 = this.f256714c;
            float f18 = kVar5.f180480a;
            float f19 = kVar5.f180481b;
            com.planner5d.library.math.k kVar6 = this.f256712a;
            float f20 = kVar6.f180480a;
            float f21 = kVar6.f180481b;
            if (bVar2.b(f16, f17, f18, f19, f20, f21, f20 + 1.0f, f21, this.f256717f)) {
                F = Math.max(F, this.f256717f.c0(this.f256713b).F());
            }
            if (F > 0.0f) {
                c0Var.s(F);
            }
        }
    }

    public void h(com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, com.planner5d.library.services.c0 c0Var, com.planner5d.library.services.c0.b bVar2) {
        if (bVar.f258079j) {
            e(bVar, c0Var.j(com.planner5d.library.services.c0.i(bVar2), this.f256712a));
            float f10 = c0Var.f(bVar2, this.f256712a, new pj.q() { // from class: com.planner5d.library.widget.editor.helper.q3
                @Override // pj.q
                public final Object H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    return Float.valueOf(com.planner5d.library.engine.util.math.d.a(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((Float) obj6).floatValue()));
                }
            });
            if (f10 > 0.0f) {
                c0Var.t(bVar2, f10);
            }
        }
    }
}
