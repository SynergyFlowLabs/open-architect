package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPartition;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class t extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f254790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.math.m[] f254791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f254792d;

    public t(String str, com.planner5d.library.math.m mVar, float f10) {
        super(str);
        ArrayList arrayList = new ArrayList();
        this.f254790b = arrayList;
        arrayList.add(str);
        this.f254791c = new com.planner5d.library.math.m[]{mVar};
        int i10 = 2 | 1;
        this.f254792d = new float[]{f10};
    }

    private void d(ItemLayout itemLayout, h hVar, com.planner5d.library.widget.editor.helper.j jVar, com.planner5d.library.widget.editor.helper.k kVar, boolean z10) {
        for (int i10 = 0; i10 < this.f254790b.size(); i10++) {
            e(itemLayout, hVar, jVar, kVar, z10, hVar.a(this.f254790b.get(i10)), this.f254791c[i10], this.f254792d[i10]);
        }
    }

    private void e(ItemLayout itemLayout, h hVar, com.planner5d.library.widget.editor.helper.j jVar, com.planner5d.library.widget.editor.helper.k kVar, boolean z10, Item item, com.planner5d.library.math.m mVar, float f10) {
        if (item != null) {
            if (!z10 || (item instanceof ItemNs)) {
                if (z10 || !(item instanceof ItemNs)) {
                    if (item instanceof ItemPoint) {
                        ((ItemPoint) item).setPoint(mVar.f180482a, mVar.f180483b, true);
                        return;
                    }
                    item.setLayout(item.getLayout(itemLayout).setPosition(mVar.f180482a, mVar.f180483b, mVar.f180484c).setRotationY(f10));
                    if (item instanceof ItemNs) {
                        ItemFloor itemFloor = hVar.f254763a.getItemFloor(item);
                        if (!(item instanceof ItemWindow)) {
                            jVar.a(itemFloor, (ItemNs) item);
                        } else {
                            int i10 = 5 | 0;
                            kVar.b(itemFloor, (ItemWindow) item, null);
                        }
                    }
                }
            }
        }
    }

    private void f(h hVar) {
        ItemWalls parentWalls;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f254790b.size(); i10++) {
            Item itemA = hVar.a(this.f254790b.get(i10));
            if (itemA instanceof ItemPoint) {
                parentWalls = ((ItemPoint) itemA).getParentWalls();
            } else if (itemA instanceof ItemWall) {
                parentWalls = ((ItemWall) itemA).getParentWalls();
            } else {
                parentWalls = itemA instanceof ItemWalls ? (ItemWalls) itemA : null;
            }
            if (((parentWalls instanceof ItemRoom) || (parentWalls instanceof ItemPartition)) && !arrayList.contains(parentWalls)) {
                parentWalls.resetWalls();
                arrayList.add(parentWalls);
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        ItemLayout itemLayout = new ItemLayout();
        com.planner5d.library.widget.editor.helper.j jVar = new com.planner5d.library.widget.editor.helper.j();
        com.planner5d.library.widget.editor.helper.k kVar = new com.planner5d.library.widget.editor.helper.k();
        d(itemLayout, hVar, jVar, kVar, false);
        f(hVar);
        d(itemLayout, hVar, jVar, kVar, true);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        Item parentItem;
        boolean z10 = false;
        if (hVar.f254765c == null) {
            if (hVar.f254764b != null) {
                Iterator<String> it = this.f254790b.iterator();
                while (it.hasNext()) {
                    Item itemA = hVar.a(it.next());
                    if ((itemA instanceof ItemPoint) && (parentItem = itemA.getParentItem()) != null) {
                        itemA = parentItem.getParentItem();
                    }
                    if (itemA instanceof ItemWalls) {
                        if ((itemA instanceof ItemRoom) || (itemA instanceof ItemPartition)) {
                            ItemWalls itemWalls = (ItemWalls) itemA;
                            itemWalls.setWalls(itemWalls.getChildren());
                        } else {
                            ((ItemWalls) itemA).resetWalls();
                        }
                    }
                }
                hVar.f254764b.v(hVar.f254763a, hVar.f254767e.j(), hVar.f254767e.z1(), false).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
                return;
            }
            return;
        }
        boolean z11 = this.f254790b.size() == 1;
        Iterator<String> it2 = this.f254790b.iterator();
        boolean z12 = false;
        while (it2.hasNext()) {
            Item itemA2 = hVar.a(it2.next());
            hVar.f254765c.L(itemA2, z11);
            if (!z10 && (itemA2 instanceof ItemWindow)) {
                z10 = true;
            }
            if ((itemA2 instanceof ItemPoint) || (itemA2 instanceof ItemWalls)) {
                z12 = true;
            }
        }
        if (z10 || z12) {
            hVar.f254765c.Q(z12, "items_move_" + org.apache.commons.lang3.z.K0(this.f254790b, ":"));
        }
        hVar.f254765c.C();
    }

    public t(List<String> list, com.planner5d.library.math.m[] mVarArr, float[] fArr) {
        super(list.isEmpty() ? null : list.get(0));
        ArrayList arrayList = new ArrayList();
        this.f254790b = arrayList;
        arrayList.addAll(list);
        this.f254791c = mVarArr;
        this.f254792d = fArr;
    }
}
