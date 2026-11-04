package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.PointF;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEditability;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPartition;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.helper.PointsHelper;
import com.planner5d.library.widget.editor.helper.r3;
import com.planner5d.library.widget.editor.helper.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Item f255227a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ItemPoint> f255228b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ItemPoint[] f255229c = new ItemPoint[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ItemPoint[] f255230d = new ItemPoint[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.planner5d.library.math.k f255231e = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.planner5d.library.math.k f255232f = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Item[] f255233g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.planner5d.library.math.k f255234h = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ItemLayout f255235i = new ItemLayout();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f255236j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final m f255237k = new m();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.helper.k f255238l = new com.planner5d.library.widget.editor.helper.k();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z2 f255239m = new z2();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s f255240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t f255241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final l f255242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final PointsHelper f255243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final r3 f255244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f255245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.planner5d.library.widget.editor.projectresources.viewoptions.b f255246t;

    k() {
        s sVar = new s();
        this.f255240n = sVar;
        this.f255241o = new t(sVar);
        this.f255242p = new l(sVar);
        this.f255243q = new PointsHelper();
        this.f255244r = new r3();
        this.f255245s = false;
        this.f255246t = null;
    }

    private ItemRuler[] c(com.planner5d.library.widget.editor.editor2d.o oVar, Item item) {
        ItemRuler itemRuler = item instanceof ItemRuler ? (ItemRuler) item : ((item instanceof ItemPoint) && (item.getParentItem() instanceof ItemRuler)) ? (ItemRuler) item.getParentItem() : null;
        ArrayList arrayList = new ArrayList();
        for (ItemRuler itemRuler2 : oVar.k()) {
            if (itemRuler2 != itemRuler) {
                arrayList.add(itemRuler2);
            }
        }
        return (ItemRuler[]) arrayList.toArray(new ItemRuler[0]);
    }

    private void d(ItemWalls itemWalls) {
        com.planner5d.library.widget.editor.editor2d.drawable.w drawableInstances = itemWalls.getDrawableInstances();
        if (drawableInstances != null || (itemWalls instanceof ItemPartition)) {
            itemWalls.resetWalls();
            if (itemWalls instanceof ItemRoom) {
                ((ItemRoom) itemWalls).setTitlePosition(((com.planner5d.library.widget.editor.editor2d.drawable.i) drawableInstances.f255098a[0]).o(this.f255234h));
            }
        }
    }

    private void e(Item[] itemArr) {
        Item item = this.f255227a;
        if (!(item instanceof ItemRuler) && (!(item instanceof ItemPoint) || !(item.getParentItem() instanceof ItemRuler))) {
            for (Item item2 : itemArr) {
                if (item2 instanceof ItemWalls) {
                    d((ItemWalls) item2);
                }
            }
            return;
        }
        Item parentItem = this.f255227a;
        if (parentItem instanceof ItemPoint) {
            parentItem = parentItem.getParentItem();
        }
        ((ItemRuler) parentItem).reset();
    }

    public void a(PointF pointF) {
        if (this.f255227a == null) {
            return;
        }
        this.f255231e.U(pointF.x, pointF.y);
        if (this.f255228b.isEmpty()) {
            if (this.f255227a instanceof ItemWalls) {
                this.f255242p.b(this.f255231e);
            }
            if (this.f255238l.j(this.f255231e, this.f255246t)) {
                return;
            }
            com.planner5d.library.math.k kVarR = this.f255234h.V(this.f255232f).N(this.f255235i.getRotationY() - this.f255236j).R(-1.0f);
            com.planner5d.library.math.k kVar = this.f255231e;
            kVarR.a(kVar.f180480a, kVar.f180481b);
            if (!(this.f255227a instanceof ItemWalls)) {
                this.f255244r.e(this.f255246t, this.f255234h);
                this.f255240n.a(this.f255234h);
            }
            Item item = this.f255227a;
            item.setLayout(item.getLayout(this.f255235i).setPosition(this.f255234h));
            return;
        }
        Item item2 = this.f255227a;
        if ((item2 instanceof ItemWall) || (item2 instanceof ItemPoint)) {
            if (item2 instanceof ItemWall) {
                this.f255241o.a(this.f255231e, this.f255228b);
            } else {
                this.f255244r.e(this.f255246t, this.f255231e);
                this.f255240n.a(this.f255231e);
                if (this.f255227a instanceof ItemPoint) {
                    this.f255237k.a(this.f255231e, this.f255228b, this.f255246t.f258074e ? this.f255230d : null);
                }
            }
            this.f255239m.d();
            e(this.f255233g);
        }
    }

    public boolean b() {
        return this.f255245s;
    }

    public Item[] f(com.planner5d.library.widget.editor.editor2d.o oVar, @fj.h Item item, PointF pointF, @fj.h ItemEditability itemEditability) {
        if (itemEditability == null || item == null || !itemEditability.canMove(item)) {
            return null;
        }
        this.f255246t = itemEditability.getViewOptions();
        this.f255227a = item;
        ItemProject itemProjectH = oVar.h();
        if (itemProjectH == null) {
            return null;
        }
        this.f255245s = true;
        this.f255228b.clear();
        ItemRuler[] itemRulerArrC = c(oVar, item);
        this.f255240n.b(this.f255246t, itemRulerArrC);
        PointsHelper pointsHelper = this.f255243q;
        ItemPoint[] pointsOnSameFloor = pointsHelper.getPointsOnSameFloor(item, pointsHelper.getItemWalls(item) instanceof ItemRoom);
        this.f255229c = pointsOnSameFloor;
        this.f255230d = pointsOnSameFloor;
        boolean z10 = item instanceof ItemPoint;
        if (z10 && (item.getParentItem() instanceof ItemRuler)) {
            this.f255228b.add((ItemPoint) item);
        } else if (item instanceof ItemRuler) {
            Collections.addAll(this.f255228b, ((ItemRuler) item).getPoints());
        } else {
            this.f255243q.getRelated(item, this.f255229c, this.f255228b);
        }
        boolean z11 = item instanceof ItemRuler;
        if (z11 || (z10 && (item.getParentItem() instanceof ItemRuler))) {
            this.f255230d = this.f255243q.getPointsRulers(itemRulerArrC);
        } else if ((item instanceof ItemWalls) || z10) {
            ItemWalls itemWalls = z10 ? (ItemWalls) item.getParentItem().getParentItem() : (ItemWalls) item;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, this.f255229c);
            Collections.addAll(arrayList, this.f255243q.getPointsOnFloorBelow(itemProjectH, item, itemWalls instanceof ItemRoom));
            this.f255230d = (ItemPoint[]) arrayList.toArray(new ItemPoint[0]);
        }
        if (item instanceof ItemWall) {
            this.f255241o.d((ItemWall) item, pointF, this.f255228b, this.f255230d, this.f255246t);
        }
        this.f255236j = item.getLayout(this.f255235i).getRotationY();
        if (item instanceof ItemWalls) {
            return this.f255242p.e((ItemWalls) item, pointF, this.f255232f, this.f255230d, this.f255246t);
        }
        this.f255232f.U(pointF.x, pointF.y).c0(this.f255235i.getPosition(this.f255234h));
        if (item instanceof ItemWindow) {
            this.f255238l.l(oVar.h().getActiveFloor(), (ItemWindow) item, this.f255234h.U(pointF.x, pointF.y), this.f255246t);
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.f255228b.isEmpty() || z11) {
            arrayList2.add(item);
        } else if (z10 && (item.getParentItem() instanceof ItemRuler)) {
            arrayList2.add(item.getParentItem());
        } else {
            this.f255243q.getGroundsRelatedToPoints(this.f255228b, arrayList2);
            Map<String, ItemWall> wallsRelatedToPoints = this.f255243q.getWallsRelatedToPoints(this.f255228b);
            List<ItemWindow> windowsRelatedToPoints = this.f255243q.getWindowsRelatedToPoints(this.f255228b, wallsRelatedToPoints, new LinkedList());
            arrayList2.addAll(windowsRelatedToPoints);
            this.f255239m.e(wallsRelatedToPoints, windowsRelatedToPoints);
        }
        Item[] itemArr = (Item[]) arrayList2.toArray(new Item[0]);
        this.f255233g = itemArr;
        return itemArr;
    }

    public void g() {
        this.f255229c = new ItemPoint[0];
        this.f255240n.c();
        this.f255242p.f();
        this.f255241o.e();
        this.f255238l.m();
        this.f255239m.f();
        this.f255245s = false;
        this.f255227a = null;
    }
}
