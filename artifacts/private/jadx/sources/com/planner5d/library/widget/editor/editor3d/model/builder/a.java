package com.planner5d.library.widget.editor.editor3d.model.builder;

import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import com.planner5d.library.widget.editor.helper.x2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1728a f255619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f255620b;

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.editor3d.model.builder.a$a, reason: collision with other inner class name */
    public static class C1728a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WallsInfo f255621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final ItemMaterial f255622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final ItemMaterial f255623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f255624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f255625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f255626f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f255627g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f255628h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f255629i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float f255630j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final boolean f255631k;

        public C1728a(ItemGround itemGround, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f255627g = z10;
            this.f255625e = z11;
            this.f255628h = z12;
            this.f255629i = z13;
            this.f255630j = z14 ? 0.1f : 0.0f;
            this.f255621a = itemGround.getWallsInfo();
            if (!(itemGround instanceof ItemRoom)) {
                this.f255622b = itemGround.getMaterialFloor();
                this.f255626f = false;
                this.f255623c = null;
                this.f255624d = 0.0f;
                this.f255631k = false;
                return;
            }
            ItemRoom itemRoom = (ItemRoom) itemGround;
            this.f255626f = true;
            this.f255623c = itemRoom.getCeilingHidden() ? null : itemRoom.getMaterials()[1];
            this.f255622b = itemRoom.getFloorHidden() ? new ItemMaterial("floor", 0) : itemGround.getMaterialFloor();
            this.f255624d = itemRoom.height;
            this.f255631k = z15;
        }
    }

    public interface b {
        default void a(ItemMaterial itemMaterial, float f10, boolean z10) {
        }

        void b(float[] fArr, ItemMaterial itemMaterial, float f10, boolean z10, boolean z11);
    }

    public a(ItemGround itemGround, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, b bVar) {
        this.f255619a = new C1728a(itemGround, z10, z11, z12, z13, z14, z15);
        this.f255620b = bVar;
    }

    private void c(float[] fArr, float[] fArr2, ItemMaterial itemMaterial) {
        a aVar;
        ItemMaterial itemMaterial2;
        if (!this.f255619a.f255626f || itemMaterial == null || this.f255619a.f255624d <= 0.0f) {
            return;
        }
        float f10 = this.f255619a.f255624d - this.f255619a.f255630j;
        if (this.f255619a.f255625e) {
            aVar = this;
            itemMaterial2 = itemMaterial;
        } else {
            aVar = this;
            itemMaterial2 = itemMaterial;
            aVar.e(fArr2, itemMaterial2, f10, false, false);
        }
        aVar.e(fArr, itemMaterial2, f10, true, false);
    }

    private void d(float[] fArr, float[] fArr2, ItemMaterial itemMaterial) {
        if (this.f255619a.f255626f && !this.f255619a.f255627g) {
            e(fArr2, itemMaterial, this.f255619a.f255630j, true, false);
        }
        e(fArr, itemMaterial, this.f255619a.f255630j, false, (this.f255619a.f255626f || this.f255619a.f255627g) ? false : true);
    }

    private void e(float[] fArr, ItemMaterial itemMaterial, float f10, boolean z10, boolean z11) {
        if (fArr == null || fArr.length <= 0 || itemMaterial == null) {
            return;
        }
        this.f255620b.b(fArr, itemMaterial, f10, z10, z11);
    }

    public void a() {
        float[] fArrK;
        if (this.f255619a.f255621a == null) {
            return;
        }
        if (this.f255619a.f255631k) {
            b bVar = this.f255620b;
            C1728a c1728a = this.f255619a;
            bVar.a(c1728a.f255622b, c1728a.f255630j, false);
            return;
        }
        float[] fArrK2 = x2.k(this.f255619a.f255621a.getPathClean(WallsInfoWall.Side.Bottom));
        if (fArrK2.length == 0) {
            return;
        }
        if (this.f255619a.f255626f) {
            com.planner5d.library.math.k kVar = new com.planner5d.library.math.k();
            ArrayList arrayList = new ArrayList();
            for (WallsInfoWall wallsInfoWall : this.f255619a.f255621a.get()) {
                if (wallsInfoWall != null) {
                    arrayList.add(new com.planner5d.library.math.k(kVar.V(wallsInfoWall.getBottom().e()).f180480a, kVar.f180481b));
                    arrayList.add(new com.planner5d.library.math.k(kVar.V(wallsInfoWall.getBottom().c()).f180480a, kVar.f180481b));
                }
            }
            fArrK = x2.k((com.planner5d.library.math.k[]) arrayList.toArray(new com.planner5d.library.math.k[0]));
        } else {
            fArrK = null;
        }
        C1728a c1728a2 = this.f255619a;
        b(fArrK2, fArrK, c1728a2.f255622b, c1728a2.f255623c);
    }

    protected void b(float[] fArr, float[] fArr2, ItemMaterial itemMaterial, ItemMaterial itemMaterial2) {
        if (this.f255619a.f255628h) {
            d(fArr, fArr2, itemMaterial);
        }
        if (this.f255619a.f255629i) {
            c(fArr, fArr2, itemMaterial2);
        }
    }

    public ItemMaterial[] f() {
        C1728a c1728a = this.f255619a;
        return new ItemMaterial[]{c1728a.f255622b, c1728a.f255623c};
    }
}
