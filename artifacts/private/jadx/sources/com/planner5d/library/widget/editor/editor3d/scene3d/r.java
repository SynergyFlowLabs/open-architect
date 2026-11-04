package com.planner5d.library.widget.editor.editor3d.scene3d;

import android.graphics.PointF;
import androidx.annotation.m1;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGrid;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.widget.editor.editor3d.model.builder.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
class r implements gc.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.helper.selector.a> f255875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.facade.f> f255876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t1 f255877e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dc.d<cc.a> f255879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final cc.f f255880h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.model.n[] f255873a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.model.n f255874b = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.model.n f255878f = null;

    r(ij.c<com.planner5d.library.widget.editor.helper.selector.a> cVar, ij.c<com.planner5d.library.widget.editor.facade.f> cVar2, t1 t1Var, dc.d<cc.a> dVar, cc.f fVar) {
        this.f255875c = cVar;
        this.f255876d = cVar2;
        this.f255877e = t1Var;
        this.f255879g = dVar;
        this.f255880h = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(final com.planner5d.library.widget.editor.editor3d.model.n nVar) {
        this.f255877e.v(new ij.c() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.q
            @Override // ij.c
            public final Object get() {
                return r.a(nVar);
            }
        });
    }

    private void C(com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr, com.planner5d.library.widget.editor.editor3d.model.n nVar, com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr2) {
        com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr3 = this.f255873a;
        if (nVarArr3 != null) {
            Item item = nVarArr3[0].f255766b;
            if (item instanceof ItemWall) {
                G(x(new ItemWall[]{(ItemWall) item}, nVarArr2), false);
            } else if (item instanceof ItemRoom) {
                G(x(((ItemRoom) item).getChildren(), nVarArr2), false);
            }
        }
        this.f255873a = nVarArr;
        this.f255874b = nVar;
    }

    private boolean E(com.planner5d.library.engine.a aVar, com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr, com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr2) {
        com.planner5d.library.widget.editor.editor3d.model.n nVarU = null;
        C(null, null, nVarArr2);
        Item item = nVarArr == null ? null : nVarArr[0].f255766b;
        if (item == null || (item instanceof ItemGrid)) {
            return false;
        }
        if (item instanceof ItemWall) {
            G(x(new ItemWall[]{(ItemWall) item}, nVarArr2), true);
        } else if (item instanceof ItemRoom) {
            G(x(((ItemRoom) item).getChildren(), nVarArr2), true);
        } else {
            nVarU = u(aVar, item, nVarArr);
        }
        C(nVarArr, nVarU, nVarArr2);
        return true;
    }

    private void F(com.planner5d.library.widget.editor.editor3d.model.n nVar, boolean z10) {
        if (nVar != null) {
            (z10 ? y.f255711j : ItemWall.MATERIAL_CLOSE).setToMaterial(true, nVar.f255767c.d("side"), null);
        }
    }

    private void G(com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr, boolean z10) {
        for (com.planner5d.library.widget.editor.editor3d.model.n nVar : nVarArr) {
            F(nVar, z10);
        }
    }

    public static /* synthetic */ LogRecord a(com.planner5d.library.widget.editor.editor3d.model.n nVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid vertex count for ");
        Item item = nVar.f255766b;
        sb2.append(item instanceof ItemNs ? ((ItemNs) item).getModelId() : item.getClass().getName());
        return new LogRecord("3d_get_distance", sb2.toString());
    }

    public static /* synthetic */ Item[] b(int i10) {
        return new Item[i10];
    }

    private Item[] g(com.planner5d.library.engine.util.math.k kVar, l lVar) {
        if (y()) {
            return new Item[0];
        }
        HashMap map = new HashMap();
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m();
        for (Item item : lVar.f255855c) {
            if ((item instanceof ItemWalls) && !map.containsValue(item) && com.planner5d.library.engine.util.math.d.d(kVar, lVar.f255857e.get(item))) {
                map.put(i(kVar, mVar, lVar.f255857e.get(item)), item);
            }
        }
        for (Item item2 : lVar.f255855c) {
            if (((((item2 instanceof ItemNs) || (item2 instanceof ItemPr)) && this.f255875c.get().B(item2)) || ((item2 instanceof ItemWall) && !z(item2, lVar))) && !map.containsValue(item2) && com.planner5d.library.engine.util.math.d.d(kVar, lVar.f255857e.get(item2))) {
                map.put(i(kVar, mVar, lVar.f255857e.get(item2)), item2);
            }
        }
        return (Item[]) map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(new Function() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Item) ((Map.Entry) obj).getValue();
            }
        }).toArray(new IntFunction() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.o
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return r.b(i10);
            }
        });
    }

    private Item h(com.planner5d.library.engine.util.math.k kVar, l lVar) {
        Item item = null;
        if (y()) {
            return null;
        }
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m();
        Float f10 = null;
        Item item2 = null;
        for (Item item3 : lVar.f255855c) {
            if ((item3 instanceof ItemWalls) && com.planner5d.library.engine.util.math.d.d(kVar, lVar.f255857e.get(item3))) {
                Float fJ = j(kVar, mVar, lVar.f255856d.get(item3));
                if (f10 == null || (fJ != null && fJ.floatValue() <= f10.floatValue())) {
                    item2 = item3;
                    f10 = fJ;
                }
            }
        }
        Float f11 = null;
        for (Item item4 : lVar.f255855c) {
            if (((((item4 instanceof ItemNs) || (item4 instanceof ItemPr)) && this.f255875c.get().B(item4)) || ((item4 instanceof ItemWall) && !z(item4, lVar))) && com.planner5d.library.engine.util.math.d.d(kVar, lVar.f255857e.get(item4))) {
                Float fJ2 = j(kVar, mVar, lVar.f255856d.get(item4));
                if ((f11 == null || (fJ2 != null && fJ2.floatValue() <= f11.floatValue())) && (!(item4 instanceof ItemWall) || item2 == null || fJ2 != null)) {
                    item = item4;
                    f11 = fJ2;
                }
            }
        }
        if (item != null) {
            item2 = item;
        }
        if (item2 == null) {
            for (Item item5 : lVar.f255855c) {
                if (z(item5, lVar) && com.planner5d.library.engine.util.math.d.d(kVar, lVar.f255857e.get(item5))) {
                    Float fJ3 = j(kVar, mVar, lVar.f255856d.get(item5));
                    if (f11 == null || (fJ3 != null && fJ3.floatValue() < f11.floatValue())) {
                        item2 = item5;
                        f11 = fJ3;
                    }
                }
            }
        }
        return item2;
    }

    private Float i(com.planner5d.library.engine.util.math.k kVar, com.planner5d.library.math.m mVar, com.planner5d.library.engine.util.math.b bVar) {
        return Float.valueOf(kVar.f165515a.Z(bVar.i(mVar)));
    }

    private Float j(com.planner5d.library.engine.util.math.k kVar, com.planner5d.library.math.m mVar, com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr) {
        Float fValueOf = null;
        for (final com.planner5d.library.widget.editor.editor3d.model.n nVar : nVarArr) {
            Float fG = nVar.f255767c.g(nVar.f255766b instanceof ItemRoom ? "ceil" : null, kVar, mVar, new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f255870a.A(nVar);
                }
            });
            if (fValueOf == null || (fG != null && fG.floatValue() < fValueOf.floatValue())) {
                fValueOf = fG;
            }
            if (fValueOf == null && nVar.f255773i) {
                com.planner5d.library.engine.util.math.d.c(kVar, nVar.f255769e, mVar);
                fValueOf = Float.valueOf(mVar.H0(kVar.f165515a).w());
            }
        }
        return fValueOf;
    }

    @m1
    private com.planner5d.library.widget.editor.editor3d.model.n u(com.planner5d.library.engine.a aVar, Item item, com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr) {
        com.planner5d.library.widget.editor.editor3d.model.n nVar = this.f255878f;
        if (nVar != null) {
            if (nVar.f255766b == item) {
                return nVar;
            }
            nVar.f255768d.dispose();
        }
        com.planner5d.library.widget.editor.editor3d.model.builder.r rVar = new com.planner5d.library.widget.editor.editor3d.model.builder.r(nVarArr, this.f255879g);
        com.planner5d.library.widget.editor.editor3d.model.n nVar2 = new com.planner5d.library.widget.editor.editor3d.model.n(aVar, rVar, item, rVar.a(aVar, null), nVarArr[0].f255765a, null, true, this.f255880h);
        this.f255878f = nVar2;
        return nVar2;
    }

    private com.planner5d.library.widget.editor.editor3d.model.n[] x(ItemWall[] itemWallArr, com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr) {
        if (nVarArr == null) {
            return new com.planner5d.library.widget.editor.editor3d.model.n[0];
        }
        com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr2 = new com.planner5d.library.widget.editor.editor3d.model.n[itemWallArr.length];
        int i10 = 0;
        for (ItemWall itemWall : itemWallArr) {
            for (com.planner5d.library.widget.editor.editor3d.model.n nVar : nVarArr) {
                if (nVar.f255766b == itemWall) {
                    nVarArr2[i10] = nVar;
                    i10++;
                    break;
                }
            }
        }
        return nVarArr2;
    }

    private boolean y() {
        return this.f255876d.get().z1();
    }

    private boolean z(Item item, l lVar) {
        if ((item instanceof ItemWall) && !((ItemWall) item).hidden) {
            for (ac.d<cc.e> dVar : lVar.a()) {
                if (dVar.getItem() == item && dVar.k().a().iterator().hasNext() && ((bc.b) dVar.k().a().iterator().next()).z1()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean B(PointF pointF, com.planner5d.library.engine.util.math.k kVar, l lVar) {
        Item[] itemArr;
        com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr = this.f255873a;
        Item item = nVarArr == null ? null : nVarArr[0].f255766b;
        if (item != null) {
            Item[] itemArrG = g(kVar, lVar);
            int length = itemArrG.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    itemArr = new Item[]{h(kVar, lVar)};
                    break;
                }
                if (itemArrG[i10] == item) {
                    itemArr = itemArrG;
                    break;
                }
                i10++;
            }
        } else {
            itemArr = new Item[]{h(kVar, lVar)};
        }
        this.f255875c.get().M(pointF, itemArr).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        return itemArr.length > 0;
    }

    public boolean D(com.planner5d.library.engine.a aVar, Item item, com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr) {
        if (y()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (com.planner5d.library.widget.editor.editor3d.model.n nVar : nVarArr) {
            if (nVar.f255766b == item) {
                arrayList.add(nVar);
                break;
            }
        }
        return E(aVar, arrayList.isEmpty() ? null : (com.planner5d.library.widget.editor.editor3d.model.n[]) arrayList.toArray(new com.planner5d.library.widget.editor.editor3d.model.n[0]), nVarArr);
    }

    @Override // gc.e
    public void dispose() {
        com.planner5d.library.widget.editor.editor3d.model.n nVar = this.f255878f;
        if (nVar != null) {
            nVar.f255768d.dispose();
            this.f255878f = null;
        }
    }

    void f(com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr) {
        C(null, null, nVarArr);
    }

    public boolean m(com.planner5d.library.engine.util.math.k kVar) {
        com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr = this.f255873a;
        if (nVarArr == null) {
            return false;
        }
        for (com.planner5d.library.widget.editor.editor3d.model.n nVar : nVarArr) {
            if (!com.planner5d.library.engine.util.math.d.d(kVar, nVar.f255769e)) {
                return false;
            }
        }
        return true;
    }

    com.planner5d.library.widget.editor.editor3d.model.n[] o() {
        return this.f255873a;
    }

    com.planner5d.library.widget.editor.editor3d.model.n q() {
        return this.f255874b;
    }
}
