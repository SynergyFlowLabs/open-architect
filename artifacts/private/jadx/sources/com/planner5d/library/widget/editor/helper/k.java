package com.planner5d.library.widget.editor.helper;

import android.util.Pair;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPartition;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.helper.ItemLayout3DHelper;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f256468m = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r3 f256469a = new r3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ItemLayout f256470b = new ItemLayout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.math.k f256471c = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.math.k f256472d = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.math.k f256473e = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.math.k f256474f = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.math.k f256475g = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.math.k f256476h = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.math.m f256477i = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a[] f256478j = new a[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ItemWindow f256479k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f256480l = 0.0f;

    private static class a extends WallsInfoWall {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.planner5d.library.engine.util.math.h f256481a;

        private static com.planner5d.library.math.c b(com.planner5d.library.math.c cVar, com.planner5d.library.math.k kVar) {
            return new com.planner5d.library.math.c(new com.planner5d.library.math.k(cVar.e()).a(kVar.f180480a, kVar.f180481b), new com.planner5d.library.math.k(cVar.c()).a(kVar.f180480a, kVar.f180481b));
        }

        private static com.planner5d.library.math.c[] c(com.planner5d.library.math.c[] cVarArr, com.planner5d.library.math.k kVar) {
            if (cVarArr == null) {
                return null;
            }
            com.planner5d.library.math.c[] cVarArr2 = new com.planner5d.library.math.c[cVarArr.length];
            for (int i10 = 0; i10 < cVarArr.length; i10++) {
                cVarArr2[i10] = b(cVarArr[i10], kVar);
            }
            return cVarArr2;
        }

        private a(WallsInfoWall wallsInfoWall, com.planner5d.library.math.k kVar) {
            super(wallsInfoWall.getWall(), b(wallsInfoWall.getTop(), kVar), b(wallsInfoWall.getMiddle(), kVar), b(wallsInfoWall.getBottom(), kVar), c(wallsInfoWall.getStart(), kVar), c(wallsInfoWall.getEnd(), kVar));
            this.f256481a = new com.planner5d.library.engine.util.math.h(getPolygonPoints(false));
        }
    }

    private boolean c(ItemFloor itemFloor, ItemWindow[] itemWindowArr, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        return itemFloor != null && f(itemFloor.getChildren(), itemWindowArr, bVar);
    }

    private boolean f(Item[] itemArr, ItemWindow[] itemWindowArr, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        i(itemArr);
        boolean z10 = false;
        for (ItemWindow itemWindow : itemWindowArr) {
            h(itemWindow, null);
            String attachedTo = itemWindow.getAttachedTo();
            j(ItemLayout3DHelper.item(itemWindow, this.f256470b).getPosition(this.f256476h), bVar);
            if (!z10) {
                String attachedTo2 = itemWindow.getAttachedTo();
                z10 = attachedTo2 != null && (attachedTo == null || !attachedTo.equals(attachedTo2));
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0079 A[PHI: r7
      0x0079: PHI (r7v4 float) = (r7v3 float), (r7v5 float) binds: [B:7:0x003e, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    private a g(com.planner5d.library.math.k kVar) {
        a aVar = null;
        Float fValueOf = null;
        for (a aVar2 : this.f256478j) {
            float fMin = 0.0f;
            if (!aVar2.f256481a.b(kVar.f180480a, kVar.f180481b)) {
                com.planner5d.library.math.b bVar = com.planner5d.library.math.b.f180462a;
                float fA = bVar.a(aVar2.getMiddle().e(), aVar2.getMiddle().c(), kVar);
                if (fA > 0.0f) {
                    fA = Math.min(fA, bVar.a(aVar2.getBottom().e(), aVar2.getBottom().c(), kVar));
                    if (fA > 0.0f) {
                        fMin = Math.min(fA, bVar.a(aVar2.getTop().e(), aVar2.getTop().c(), kVar));
                    } else {
                        fMin = fA;
                    }
                } else {
                    fMin = fA;
                }
            }
            if (fMin < 50.0f && (fValueOf == null || fMin < fValueOf.floatValue())) {
                fValueOf = Float.valueOf(fMin);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    private void h(ItemWindow itemWindow, com.planner5d.library.math.k kVar) {
        this.f256479k = itemWindow;
        this.f256475g.U(0.5f, 0.0f).R(itemWindow.getSize(this.f256477i).f180482a).N(90.0f);
        this.f256480l = kVar != null ? com.planner5d.library.math.c.f180466e.f(this.f256471c.V(kVar).c0(itemWindow.getLayout(this.f256470b).getPosition(this.f256476h)), this.f256476h.V(this.f256475g).N(this.f256470b.getRotationY())) : 0.0f;
    }

    private void i(Item[] itemArr) {
        ArrayList arrayList = new ArrayList();
        for (Item item : itemArr) {
            if ((item instanceof ItemRoom) || (item instanceof ItemPartition)) {
                ItemWalls itemWalls = (ItemWalls) item;
                WallsInfoWall[] wallsInfoWallArr = itemWalls.getWallsInfo().get();
                itemWalls.getLayout(this.f256470b).getPosition(this.f256476h);
                for (WallsInfoWall wallsInfoWall : wallsInfoWallArr) {
                    arrayList.add(new a(wallsInfoWall, this.f256476h));
                }
            }
        }
        this.f256478j = (a[]) arrayList.toArray(new a[0]);
    }

    private void k(a aVar, com.planner5d.library.math.k kVar, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        float fC = this.f256471c.V(aVar.getMiddle().b()).c() - 90.0f;
        this.f256473e.V(kVar);
        this.f256472d.V(this.f256471c).M().R(com.planner5d.library.math.c.f180466e.f(this.f256473e.c0(aVar.getMiddle().e()), this.f256471c)).b(aVar.getMiddle().e());
        if (this.f256480l != 0.0f) {
            this.f256472d.c0(this.f256476h.V(this.f256475g).N(fC).M().R(this.f256480l));
        }
        if (bVar != null) {
            this.f256469a.d(bVar, this.f256472d, aVar.getMiddle());
        }
        ItemWindow itemWindow = this.f256479k;
        itemWindow.setLayout(itemWindow.getLayout(this.f256470b).setRotationY(fC).setPosition(this.f256472d));
    }

    public boolean a(ItemFloor itemFloor) {
        return itemFloor != null && c(itemFloor, itemFloor.getWindows(), null);
    }

    public boolean b(ItemFloor itemFloor, ItemWindow itemWindow, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        return c(itemFloor, new ItemWindow[]{itemWindow}, bVar);
    }

    public boolean d(ItemProject itemProject) {
        while (true) {
            boolean z10 = false;
            for (Pair<Integer, ItemFloor> pair : itemProject.getFloors(false)) {
                if (z10 || a((ItemFloor) pair.second)) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    public boolean e(ItemRoom itemRoom) {
        return itemRoom != null && f(new Item[]{itemRoom}, ((ItemFloor) itemRoom.getParentItem()).getWindows(), null);
    }

    public boolean j(com.planner5d.library.math.k kVar, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        if (this.f256479k == null) {
            return false;
        }
        a aVarG = g(this.f256474f.U(kVar.f180480a, kVar.f180481b));
        this.f256479k.setAttachedTo(aVarG == null ? null : ((ItemWall) aVarG.getWall()).getUid());
        if (aVarG == null) {
            return false;
        }
        k(aVarG, this.f256476h.U(kVar.f180480a, kVar.f180481b), bVar);
        boolean z10 = true & true;
        return true;
    }

    public void l(ItemFloor itemFloor, ItemWindow itemWindow, com.planner5d.library.math.k kVar, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        h(itemWindow, kVar);
        i(itemFloor.getChildren());
        j(kVar, bVar);
    }

    public void m() {
        this.f256479k = null;
        this.f256478j = new a[0];
    }
}
