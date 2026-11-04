package com.planner5d.library.widget.editor.helper;

import android.util.Pair;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.helper.PointsHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ItemLayout f256866a = new ItemLayout();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Item> f256867b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointsHelper f256868c = new PointsHelper();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.math.k f256869d = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.planner5d.library.math.m[] f256870e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f256871f = null;

    private com.planner5d.library.math.m b(Item item, com.planner5d.library.math.m mVar) {
        item.getLayout(this.f256866a).getPosition(mVar);
        if (item instanceof ItemPoint) {
            mVar.f180482a = ((ItemPoint) item).getPoint(this.f256869d, true).f180480a;
            mVar.f180483b = this.f256869d.f180481b;
        }
        return mVar;
    }

    private com.planner5d.library.math.m[] c(List<Item> list) {
        com.planner5d.library.math.m[] mVarArr = new com.planner5d.library.math.m[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            mVarArr[i10] = b(list.get(i10), new com.planner5d.library.math.m());
        }
        return mVarArr;
    }

    private float[] d(List<Item> list) {
        float[] fArr = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            fArr[i10] = list.get(i10).getLayout(this.f256866a).getRotationY();
        }
        return fArr;
    }

    public Pair<? extends com.planner5d.library.widget.editor.editaction.e, ? extends com.planner5d.library.widget.editor.editaction.e> a() {
        if (this.f256867b.isEmpty()) {
            return null;
        }
        Item item = this.f256867b.get(0);
        if (!(item instanceof ItemRuler) && (!(item instanceof ItemPoint) || !(item.getParentItem() instanceof ItemRuler))) {
            com.planner5d.library.math.m[] mVarArrC = c(this.f256867b);
            for (int i10 = 0; i10 < mVarArrC.length; i10++) {
                if (!mVarArrC[i10].equals(this.f256870e[i10])) {
                    LinkedList linkedList = new LinkedList();
                    Iterator<Item> it = this.f256867b.iterator();
                    while (it.hasNext()) {
                        linkedList.add(it.next().getUid());
                    }
                    return new Pair<>(new com.planner5d.library.widget.editor.editaction.t(linkedList, mVarArrC, d(this.f256867b)), new com.planner5d.library.widget.editor.editaction.t(linkedList, this.f256870e, this.f256871f));
                }
            }
        }
        return null;
    }

    public void e(Item item) {
        this.f256867b.clear();
        if (item == null) {
            return;
        }
        boolean z10 = item instanceof ItemPoint;
        if (z10 || (item instanceof ItemWall)) {
            boolean z11 = item instanceof ItemRuler;
            if (z11 || (z10 && (item.getParentItem() instanceof ItemRuler))) {
                Item[] children = ((ItemRuler) (z11 ? item : item.getParentItem())).getChildren();
                if (children != null) {
                    Collections.addAll(this.f256867b, children);
                }
                this.f256867b.add(item);
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Item parentItem = item instanceof ItemWall ? item : item.getParentItem();
                ItemWalls itemWalls = parentItem == null ? null : (ItemWalls) parentItem.getParentItem();
                List<Item> list = this.f256867b;
                PointsHelper pointsHelper = this.f256868c;
                boolean z12 = itemWalls instanceof ItemRoom;
                list.addAll(pointsHelper.getRelated(item, pointsHelper.getPointsOnSameFloor(item, z12), arrayList));
                if (z12) {
                    this.f256867b.addAll(this.f256868c.getWindowsRelatedToPoints(arrayList, arrayList2));
                }
                this.f256868c.getGroundsRelatedToPoints(arrayList, this.f256867b);
            }
        } else {
            if (item instanceof ItemRoom) {
                Collections.addAll(this.f256867b, ((ItemRoom) item).getItemsMovedTogether());
            }
            this.f256867b.add(item);
        }
        if (this.f256867b.isEmpty()) {
            return;
        }
        this.f256871f = d(this.f256867b);
        this.f256870e = c(this.f256867b);
    }
}
