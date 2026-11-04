package com.planner5d.library.widget.editor.editor3d.scene3d;

import androidx.annotation.p0;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
class s implements ac.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ac.d<cc.e>[] f255882b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.engine.util.math.h f255881a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.math.k[] f255883c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.planner5d.library.math.k[] f255884d = null;

    s(ac.d<cc.e>[] dVarArr) {
        this.f255882b = dVarArr;
    }

    @Override // ac.k
    public com.planner5d.library.math.k[] a() {
        if (this.f255883c == null) {
            this.f255883c = new com.planner5d.library.math.k[]{new com.planner5d.library.math.k(), new com.planner5d.library.math.k()};
            ItemWall itemWall = (ItemWall) this.f255882b[0].getItem();
            if (itemWall != null) {
                itemWall.getPoint(this.f255883c[0], true, true);
                itemWall.getPoint(this.f255883c[1], true, false);
            }
            gc.d.e(this.f255883c[0]);
            gc.d.e(this.f255883c[1]);
        }
        return this.f255883c;
    }

    @Override // ac.k
    @p0
    public com.planner5d.library.engine.util.math.h b() {
        ItemWalls itemWalls;
        WallsInfoWall wallInfo;
        if (this.f255881a == null) {
            ItemWall itemWall = (ItemWall) this.f255882b[0].getItem();
            if (itemWall != null && (itemWalls = (ItemWalls) itemWall.getParentItem()) != null && (wallInfo = itemWalls.getWallInfo(itemWall)) != null) {
                float[] polygonPoints = wallInfo.getPolygonPoints(true);
                for (int i10 = 0; i10 < polygonPoints.length; i10++) {
                    polygonPoints[i10] = gc.d.d(polygonPoints[i10]);
                }
                this.f255881a = new com.planner5d.library.engine.util.math.h(polygonPoints);
            }
        }
        return this.f255881a;
    }

    @Override // ac.k
    public ac.l c(boolean z10) {
        com.planner5d.library.engine.util.math.b bounds;
        int i10 = 0;
        if (z10) {
            bounds = this.f255882b[0].getBounds();
            for (ac.d<cc.e> dVar : this.f255882b) {
                bounds.e(dVar.getBounds());
            }
        } else {
            bounds = null;
        }
        cc.c[] cVarArr = new cc.c[this.f255882b.length];
        while (true) {
            ac.d<cc.e>[] dVarArr = this.f255882b;
            if (i10 >= dVarArr.length) {
                return new v(cVarArr, z10);
            }
            cc.c cVarK = dVarArr[i10].k();
            cVarArr[i10] = cVarK;
            cVarK.e(bounds == null ? null : bounds.h());
            i10++;
        }
    }

    @Override // ac.k
    public com.planner5d.library.math.k[] e() {
        a();
        if (this.f255884d == null) {
            this.f255884d = new com.planner5d.library.math.k[]{new com.planner5d.library.math.k(this.f255883c[1]).c0(this.f255883c[0]).R(0.05f).b(this.f255883c[0]), new com.planner5d.library.math.k(this.f255883c[1]).c0(this.f255883c[0]).R(0.5f).b(this.f255883c[0]), new com.planner5d.library.math.k(this.f255883c[1]).c0(this.f255883c[0]).R(0.95f).b(this.f255883c[0])};
        }
        return this.f255884d;
    }

    @Override // ac.k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ItemFloor d() {
        Object item = this.f255882b[0].getItem();
        Objects.requireNonNull(item);
        return (ItemFloor) ((ItemWall) item).getParentItem().getParentItem();
    }
}
