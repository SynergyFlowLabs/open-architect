package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.PointF;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.widget.editor.helper.r3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.math.k f255306a = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.math.k f255307b = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.math.k f255308c = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<com.planner5d.library.math.k> f255309d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.planner5d.library.widget.editor.projectresources.viewoptions.b f255310e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r3 f255311f = new r3();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.math.k f255312g = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.math.k f255313h = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.math.k f255314i = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.planner5d.library.math.k f255315j = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ItemLayout f255316k = new ItemLayout();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f255317l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ItemPoint[] f255318m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s f255319n;

    t(s sVar) {
        this.f255319n = sVar;
    }

    private void b(List<ItemPoint> list) {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar = this.f255310e;
        if (bVar.f258079j || bVar.f258075f) {
            this.f255308c.V(this.f255313h).b(this.f255307b);
            this.f255311f.e(this.f255310e, this.f255308c);
            if (this.f255310e.f258075f && !this.f255319n.a(this.f255308c)) {
                this.f255319n.a(this.f255308c.b(this.f255314i));
                this.f255308c.c0(this.f255314i);
            }
            this.f255307b.V(this.f255308c).c0(this.f255313h);
        }
        c(list, this.f255307b);
        for (int i10 = 0; i10 < this.f255309d.size(); i10++) {
            com.planner5d.library.math.k kVar = this.f255309d.get(i10);
            ItemPoint itemPoint = list.get(i10);
            float f10 = kVar.f180480a;
            com.planner5d.library.math.k kVar2 = this.f255307b;
            itemPoint.setPoint(f10 + kVar2.f180480a, kVar.f180481b + kVar2.f180481b);
        }
    }

    private void c(List<ItemPoint> list, com.planner5d.library.math.k kVar) {
        ItemPoint[] itemPointArr = this.f255318m;
        if (itemPointArr == null || !this.f255310e.f258074e) {
            return;
        }
        for (ItemPoint itemPoint : itemPointArr) {
            if (!list.contains(itemPoint)) {
                itemPoint.getPoint(this.f255308c, true);
                for (int i10 = 0; i10 < this.f255309d.size(); i10++) {
                    if (this.f255308c.o(this.f255312g.V(this.f255309d.get(i10)).b(kVar).b(this.f255315j)) <= 225.0f) {
                        kVar.b(this.f255308c.c0(this.f255312g));
                        return;
                    }
                }
            }
        }
    }

    void a(com.planner5d.library.math.k kVar, List<ItemPoint> list) {
        if (!this.f255310e.f258076g || this.f255317l) {
            com.planner5d.library.math.k kVar2 = this.f255307b;
            float f10 = kVar.f180480a;
            com.planner5d.library.math.k kVar3 = this.f255306a;
            kVar2.U(f10 - kVar3.f180480a, kVar.f180481b - kVar3.f180481b);
        } else {
            this.f255307b.V(this.f255306a).b0(kVar.f180480a, kVar.f180481b);
            float f11 = this.f255307b.f180480a;
            int i10 = 6 & 0;
            if (f11 == 0.0f || Math.abs(f11) < Math.abs(this.f255307b.f180481b)) {
                com.planner5d.library.math.k kVar4 = this.f255307b;
                if (kVar4.f180481b == 0.0f) {
                    return;
                } else {
                    kVar4.U(0.0f, kVar.f180481b - this.f255306a.f180481b);
                }
            } else {
                this.f255307b.U(kVar.f180480a - this.f255306a.f180480a, 0.0f);
            }
        }
        b(list);
    }

    void d(ItemWall itemWall, PointF pointF, List<ItemPoint> list, ItemPoint[] itemPointArr, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        boolean z10 = itemWall instanceof ItemRuler;
        this.f255317l = z10;
        if (!z10) {
            itemPointArr = null;
        }
        this.f255318m = itemPointArr;
        this.f255310e = bVar;
        this.f255306a.U(pointF.x, pointF.y);
        itemWall.getPoint(this.f255313h, true, true);
        itemWall.getPoint(this.f255314i, true, false).c0(this.f255313h);
        itemWall.getLayout(this.f255316k).getPosition(this.f255315j);
        Iterator<ItemPoint> it = list.iterator();
        while (it.hasNext()) {
            this.f255309d.add(it.next().getPoint(new com.planner5d.library.math.k(), false));
        }
    }

    void e() {
        this.f255309d.clear();
    }
}
