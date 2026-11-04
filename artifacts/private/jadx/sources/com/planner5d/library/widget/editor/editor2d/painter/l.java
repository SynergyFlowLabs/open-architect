package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.PointF;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.widget.editor.helper.r3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
class l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s f255259m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ItemLayout f255247a = new ItemLayout();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.math.k f255248b = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.math.k f255249c = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.planner5d.library.math.k f255250d = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ItemPoint[] f255251e = new ItemPoint[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PointF f255252f = new PointF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<ItemNs> f255253g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ItemWalls f255254h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r3 f255255i = new r3();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.planner5d.library.widget.editor.projectresources.viewoptions.b f255256j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.planner5d.library.math.k f255257k = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f255258l = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.planner5d.library.math.k[] f255260n = new com.planner5d.library.math.k[0];

    l(s sVar) {
        this.f255259m = sVar;
    }

    private com.planner5d.library.math.k[] a(com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, ItemPoint[] itemPointArr) {
        ArrayList arrayList = new ArrayList();
        if (bVar.f258074e) {
            for (ItemPoint itemPoint : itemPointArr) {
                ItemPoint[] itemPointArr2 = this.f255251e;
                int length = itemPointArr2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        arrayList.add(itemPoint.getPoint(new com.planner5d.library.math.k(), true));
                        break;
                    }
                    if (itemPointArr2[i10] == itemPoint) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return (com.planner5d.library.math.k[]) arrayList.toArray(new com.planner5d.library.math.k[0]);
    }

    private void c(com.planner5d.library.math.k kVar) {
        com.planner5d.library.math.k position = this.f255254h.getLayout(this.f255247a).getPosition(this.f255248b);
        PointF pointF = this.f255252f;
        position.a(pointF.x, pointF.y).b0(kVar.f180480a, kVar.f180481b);
        for (ItemNs itemNs : this.f255253g) {
            itemNs.setLayout(itemNs.getLayout(this.f255247a).setPosition(itemNs.getLayout(this.f255247a).getPosition(this.f255249c).c0(this.f255248b)));
        }
    }

    private void d(com.planner5d.library.math.k kVar) {
        com.planner5d.library.math.k kVarV = this.f255248b.V(kVar);
        PointF pointF = this.f255252f;
        kVarV.b0(pointF.x, pointF.y);
        int i10 = 0;
        while (true) {
            ItemPoint[] itemPointArr = this.f255251e;
            if (i10 >= itemPointArr.length) {
                return;
            }
            itemPointArr[i10].getPoint(this.f255250d, false).b(this.f255248b);
            if (this.f255256j.f258079j && i10 == 0) {
                this.f255249c.V(this.f255250d);
                this.f255255i.e(this.f255256j, this.f255250d);
                if (!this.f255249c.equals(this.f255250d)) {
                    kVar.b(this.f255250d.c0(this.f255249c));
                    com.planner5d.library.math.k kVarV2 = this.f255248b.V(kVar);
                    PointF pointF2 = this.f255252f;
                    kVarV2.b0(pointF2.x, pointF2.y);
                }
            }
            int i11 = 0;
            while (true) {
                com.planner5d.library.math.k[] kVarArr = this.f255260n;
                if (i11 < kVarArr.length) {
                    if (kVarArr[i11].o(this.f255250d) <= this.f255258l) {
                        kVar.b(this.f255249c.V(this.f255260n[i11]).c0(this.f255250d));
                        return;
                    }
                    i11++;
                }
            }
            if (this.f255256j.f258075f) {
                this.f255249c.V(this.f255250d);
                if (this.f255259m.a(this.f255250d)) {
                    kVar.b(this.f255250d.c0(this.f255249c));
                    return;
                }
            }
            i10++;
        }
    }

    void b(com.planner5d.library.math.k kVar) {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar = this.f255256j;
        if (bVar.f258074e || bVar.f258075f || bVar.f258079j) {
            d(kVar);
        }
        c(kVar);
    }

    Item[] e(ItemWalls itemWalls, PointF pointF, com.planner5d.library.math.k kVar, ItemPoint[] itemPointArr, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        this.f255254h = itemWalls;
        this.f255256j = bVar;
        this.f255258l = 225.0f;
        if (bVar.f258079j) {
            this.f255258l = Math.max(225.0f, (float) Math.pow(bVar.f258080k, 2.0d));
        }
        kVar.U(pointF.x - itemWalls.getLayout(this.f255247a).getPosition(this.f255248b).f180480a, pointF.y - this.f255248b.f180481b);
        this.f255252f.set(kVar.f180480a, kVar.f180481b);
        List<Item> treeList = itemWalls.getTreeList();
        ItemWall[] children = itemWalls.getChildren();
        this.f255251e = new ItemPoint[children.length * 2];
        for (int i10 = 0; i10 < children.length; i10++) {
            int i11 = i10 * 2;
            this.f255251e[i11] = children[i10].getPoints()[0];
            this.f255251e[i11 + 1] = children[i10].getPoints()[1];
        }
        children[0].getPoint(this.f255257k, false, true);
        if (itemWalls instanceof ItemRoom) {
            ItemNs[] itemsMovedTogether = ((ItemRoom) itemWalls).getItemsMovedTogether();
            Collections.addAll(treeList, itemsMovedTogether);
            Collections.addAll(this.f255253g, itemsMovedTogether);
        }
        this.f255260n = a(bVar, itemPointArr);
        return (Item[]) treeList.toArray(new Item[0]);
    }

    void f() {
        this.f255251e = null;
        this.f255253g.clear();
        this.f255260n = null;
        this.f255254h = null;
    }
}
