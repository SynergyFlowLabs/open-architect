package com.planner5d.library.widget.editor.helper;

import android.util.Pair;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.helper.PointsHelper;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsResizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f256186a = new y2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointsHelper f256187b = new PointsHelper();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z2 f256188c = new z2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.math.k f256189d = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.math.k f256190e = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.math.k f256191f = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.math.k f256192g = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.math.k f256193h = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f256194i = new Object();

    public enum a {
        Left,
        Center,
        Right
    }

    public Pair<? extends com.planner5d.library.widget.editor.editaction.e, ? extends com.planner5d.library.widget.editor.editaction.e> a(ItemWall itemWall, a aVar, float f10, boolean z10) {
        Pair<? extends com.planner5d.library.widget.editor.editaction.e, ? extends com.planner5d.library.widget.editor.editaction.e> pairA;
        WallsInfo wallsInfo;
        Float fCalcSizeAdjustment;
        synchronized (this.f256194i) {
            try {
                Item parentItem = itemWall.getParentItem();
                if (z10 && (parentItem instanceof ItemGround) && !(itemWall instanceof ItemRuler) && (wallsInfo = ((ItemGround) parentItem).getWallsInfo()) != null && (fCalcSizeAdjustment = new WallsResizer().calcSizeAdjustment(itemWall, wallsInfo, f10, aVar.ordinal())) != null) {
                    f10 = itemWall.getLength() + fCalcSizeAdjustment.floatValue();
                }
                this.f256186a.e(itemWall);
                ItemPoint[] points = itemWall.getPoints();
                points[0].getPoint(this.f256192g, true);
                points[1].getPoint(this.f256193h, true);
                ArrayList<ItemPoint> arrayList = new ArrayList();
                ArrayList<ItemPoint> arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ItemPoint[] pointsOnSameFloor = itemWall instanceof ItemRuler ? new ItemPoint[0] : this.f256187b.getPointsOnSameFloor(itemWall, parentItem instanceof ItemRoom);
                this.f256187b.getRelated((Item) points[0], pointsOnSameFloor, (List<ItemPoint>) arrayList);
                this.f256187b.getRelated((Item) points[1], pointsOnSameFloor, (List<ItemPoint>) arrayList2);
                arrayList3.addAll(arrayList);
                arrayList3.addAll(arrayList2);
                arrayList.remove(points[0]);
                arrayList.remove(points[1]);
                arrayList2.remove(points[0]);
                arrayList2.remove(points[1]);
                this.f256188c.e(this.f256187b.getWallsRelatedToPoints(arrayList3), this.f256187b.getWindowsRelatedToPoints(arrayList3, new ArrayList()));
                this.f256189d.V(this.f256193h).c0(this.f256192g).M().R(f10);
                if (aVar == a.Left) {
                    points[1].setPoint(this.f256189d.b(this.f256192g).f180480a, this.f256189d.f180481b, true);
                    for (ItemPoint itemPoint : arrayList2) {
                        com.planner5d.library.math.k kVar = this.f256189d;
                        itemPoint.setPoint(kVar.f180480a, kVar.f180481b, true);
                    }
                } else if (aVar == a.Right) {
                    ItemPoint itemPoint2 = points[0];
                    com.planner5d.library.math.k kVar2 = this.f256189d;
                    com.planner5d.library.math.k kVar3 = this.f256193h;
                    itemPoint2.setPoint(kVar2.U(kVar3.f180480a - kVar2.f180480a, kVar3.f180481b - kVar2.f180481b).f180480a, this.f256189d.f180481b, true);
                    for (ItemPoint itemPoint3 : arrayList) {
                        com.planner5d.library.math.k kVar4 = this.f256189d;
                        itemPoint3.setPoint(kVar4.f180480a, kVar4.f180481b, true);
                    }
                } else if (aVar == a.Center) {
                    this.f256191f.V(this.f256193h).c0(this.f256192g).R(0.5f).b(this.f256192g);
                    this.f256189d.R(0.5f);
                    points[0].setPoint(this.f256190e.V(this.f256191f).c0(this.f256189d).f180480a, this.f256190e.f180481b, true);
                    for (ItemPoint itemPoint4 : arrayList) {
                        com.planner5d.library.math.k kVar5 = this.f256190e;
                        itemPoint4.setPoint(kVar5.f180480a, kVar5.f180481b, true);
                    }
                    points[1].setPoint(this.f256190e.V(this.f256191f).b(this.f256189d).f180480a, this.f256190e.f180481b, true);
                    for (ItemPoint itemPoint5 : arrayList2) {
                        com.planner5d.library.math.k kVar6 = this.f256190e;
                        itemPoint5.setPoint(kVar6.f180480a, kVar6.f180481b, true);
                    }
                }
                this.f256188c.d();
                this.f256188c.f();
                pairA = this.f256186a.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pairA;
    }

    public Pair<? extends com.planner5d.library.widget.editor.editaction.e, ? extends com.planner5d.library.widget.editor.editaction.e> b(ItemPoint itemPoint, com.planner5d.library.math.k kVar) {
        Pair<? extends com.planner5d.library.widget.editor.editaction.e, ? extends com.planner5d.library.widget.editor.editaction.e> pairA;
        boolean z10 = itemPoint.getParentItem() instanceof ItemRuler;
        synchronized (this.f256194i) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(itemPoint);
                this.f256186a.e(itemPoint);
                if (!z10) {
                    PointsHelper pointsHelper = this.f256187b;
                    pointsHelper.getRelated((Item) itemPoint, pointsHelper.getPointsOnSameFloor(itemPoint, itemPoint.getParentItem().getParentItem() instanceof ItemRoom), (List<ItemPoint>) arrayList);
                    this.f256188c.e(this.f256187b.getWallsRelatedToPoints(arrayList), this.f256187b.getWindowsRelatedToPoints(arrayList, new ArrayList()));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ItemPoint) it.next()).setPoint(kVar.f180480a, kVar.f180481b, true);
                }
                if (!z10) {
                    this.f256188c.d();
                    this.f256188c.f();
                }
                pairA = this.f256186a.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pairA;
    }
}
