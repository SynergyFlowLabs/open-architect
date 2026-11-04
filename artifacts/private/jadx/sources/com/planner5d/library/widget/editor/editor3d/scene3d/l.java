package com.planner5d.library.widget.editor.editor3d.scene3d;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemGrid;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.walls.Wall;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class l implements ac.c<cc.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.planner5d.library.widget.editor.editor3d.model.n[] f255853a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Item[] f255855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map<Item, com.planner5d.library.widget.editor.editor3d.model.n[]> f255856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<Item, com.planner5d.library.engine.util.math.b> f255857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.planner5d.library.widget.editor.editor3d.model.n[] f255858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.planner5d.library.widget.editor.editor3d.model.n[][] f255859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final com.planner5d.library.widget.editor.editor3d.model.n[][] f255860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final ItemProject f255861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a[] f255862j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f255863k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[][] f255864l = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Item[] f255854b = l();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Item f255865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.planner5d.library.engine.util.math.b f255866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WallsInfoWall f255867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.planner5d.library.math.k f255868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.planner5d.library.math.k f255869e;

        public float a(com.planner5d.library.math.m mVar) {
            if (b(mVar)) {
                return 5.0f;
            }
            return this.f255867c.getWall().getWidth() - 5.0f;
        }

        public boolean b(com.planner5d.library.math.m mVar) {
            return this.f255868d.j((mVar.f180482a - this.f255869e.f180480a) - this.f255867c.getMiddle().e().f180480a, (mVar.f180484c - this.f255869e.f180481b) - this.f255867c.getMiddle().e().f180481b) < 0.0f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private a(Item item, com.planner5d.library.engine.util.math.b bVar) {
            this.f255865a = item;
            this.f255866b = bVar;
            if (!(item instanceof ItemWall)) {
                this.f255867c = null;
                this.f255868d = null;
                this.f255869e = null;
                return;
            }
            WallsInfo wallsInfo = ((ItemWall) item).getParentWalls().getWallsInfo();
            WallsInfoWall wallsInfoWall = wallsInfo.get((Wall) item);
            this.f255867c = wallsInfoWall;
            if (wallsInfoWall != null) {
                this.f255868d = new com.planner5d.library.math.k(wallsInfoWall.getMiddle().b()).O(1);
                this.f255869e = new com.planner5d.library.math.k(wallsInfo.getOrigin());
            } else {
                this.f255868d = null;
                this.f255869e = null;
            }
        }
    }

    l(ItemProject itemProject, com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr, cc.f fVar) {
        this.f255861i = itemProject;
        this.f255855c = m(nVarArr);
        com.planner5d.library.widget.editor.editor3d.model.n[] nVarArrS = s(nVarArr);
        this.f255853a = nVarArrS;
        this.f255857e = i();
        this.f255856d = n();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        for (com.planner5d.library.widget.editor.editor3d.model.n nVar : nVarArrS) {
            com.planner5d.library.engine.rendering.util.a aVarA0 = nVar.f255768d.a0();
            if (aVarA0 == null || aVarA0.a() == 6) {
                arrayList.add(nVar);
            } else {
                if (!map.containsKey(aVarA0)) {
                    map.put(aVarA0, new ArrayList());
                }
                ((List) map.get(aVarA0)).add(nVar);
            }
        }
        if (!map.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            Set<com.planner5d.library.engine.rendering.util.a> setKeySet = map.keySet();
            ArrayList arrayList7 = new ArrayList();
            for (com.planner5d.library.engine.rendering.util.a aVar : setKeySet) {
                List<com.planner5d.library.widget.editor.editor3d.model.n> list = (List) map.get(aVar);
                Iterator<com.planner5d.library.widget.editor.editor3d.model.n> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().f255766b instanceof ItemGrid) {
                        arrayList7.add(aVar);
                        h(arrayList2, arrayList3, list, arrayList4, arrayList5, arrayList6, fVar);
                        break;
                    }
                }
            }
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                map.remove((com.planner5d.library.engine.rendering.util.a) it2.next());
            }
            Iterator it3 = map.keySet().iterator();
            while (it3.hasNext()) {
                h(arrayList2, arrayList3, (List) map.get((com.planner5d.library.engine.rendering.util.a) it3.next()), arrayList4, arrayList5, arrayList6, fVar);
            }
        }
        this.f255858f = (com.planner5d.library.widget.editor.editor3d.model.n[]) arrayList.toArray(new com.planner5d.library.widget.editor.editor3d.model.n[0]);
        this.f255859g = (com.planner5d.library.widget.editor.editor3d.model.n[][]) arrayList2.toArray(new com.planner5d.library.widget.editor.editor3d.model.n[0][]);
        this.f255860h = (com.planner5d.library.widget.editor.editor3d.model.n[][]) arrayList3.toArray(new com.planner5d.library.widget.editor.editor3d.model.n[arrayList3.size()][]);
    }

    private void h(List<com.planner5d.library.widget.editor.editor3d.model.n[]> list, List<com.planner5d.library.widget.editor.editor3d.model.n[]> list2, List<com.planner5d.library.widget.editor.editor3d.model.n> list3, List<com.planner5d.library.widget.editor.editor3d.model.n> list4, List<com.planner5d.library.widget.editor.editor3d.model.n> list5, List<com.planner5d.library.widget.editor.editor3d.model.n> list6, cc.f fVar) {
        if (!list3.isEmpty()) {
            list4.clear();
            list5.clear();
            list6.clear();
            Iterator<com.planner5d.library.widget.editor.editor3d.model.n> it = list3.iterator();
            while (true) {
                int i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                com.planner5d.library.widget.editor.editor3d.model.n next = it.next();
                Iterator<com.planner5d.library.widget.editor.editor3d.model.n> it2 = list4.iterator();
                while (it2.hasNext()) {
                    try {
                        if (it2.next().f255768d.a0().a() > next.f255768d.a0().a()) {
                            break;
                        } else {
                            i10++;
                        }
                    } catch (NullPointerException unused) {
                    }
                }
                list4.add(i10, next);
            }
            for (com.planner5d.library.widget.editor.editor3d.model.n nVar : list4) {
                list5.add(j(nVar, fVar));
                list6.add(k(nVar, fVar));
            }
            list.add((com.planner5d.library.widget.editor.editor3d.model.n[]) list6.toArray(new com.planner5d.library.widget.editor.editor3d.model.n[0]));
            list2.add((com.planner5d.library.widget.editor.editor3d.model.n[]) list5.toArray(new com.planner5d.library.widget.editor.editor3d.model.n[0]));
        }
    }

    private Map<Item, com.planner5d.library.engine.util.math.b> i() {
        HashMap map = new HashMap();
        for (com.planner5d.library.widget.editor.editor3d.model.n nVar : this.f255853a) {
            if (map.containsKey(nVar.f255766b)) {
                ((com.planner5d.library.engine.util.math.b) map.get(nVar.f255766b)).e(nVar.f255769e);
            } else {
                map.put(nVar.f255766b, new com.planner5d.library.engine.util.math.b(nVar.f255769e));
            }
        }
        return map;
    }

    private com.planner5d.library.widget.editor.editor3d.model.n j(com.planner5d.library.widget.editor.editor3d.model.n nVar, cc.f fVar) {
        com.planner5d.library.widget.editor.editor3d.model.n nVar2 = new com.planner5d.library.widget.editor.editor3d.model.n(nVar, nVar.f255767c.b(), fVar);
        for (bc.b bVar : nVar2.f255767c.a()) {
            if (bVar != null) {
                bVar.H1(Boolean.FALSE);
            }
        }
        return nVar2;
    }

    private com.planner5d.library.widget.editor.editor3d.model.n k(com.planner5d.library.widget.editor.editor3d.model.n nVar, cc.f fVar) {
        com.planner5d.library.widget.editor.editor3d.model.n nVar2 = new com.planner5d.library.widget.editor.editor3d.model.n(nVar, nVar.f255767c.b(), fVar);
        int i10 = 0;
        for (bc.b bVar : nVar2.f255767c.a()) {
            nVar2.f255767c.h(i10);
            i10++;
        }
        return nVar2;
    }

    private Item[] l() {
        ArrayList arrayList = new ArrayList();
        ItemProject itemProject = this.f255861i;
        if (itemProject != null) {
            ItemFloor[] floorArray = itemProject.getFloorArray();
            int iMin = Math.min(this.f255861i.getActiveFloorNumber(), floorArray.length - 1);
            for (int i10 = 0; i10 <= iMin; i10++) {
                ItemFloor itemFloor = floorArray[i10];
                if (itemFloor != null) {
                    arrayList.addAll(itemFloor.getTreeList());
                }
            }
        }
        return (Item[]) arrayList.toArray(new Item[0]);
    }

    private Item[] m(com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr) {
        ItemProject itemProject = this.f255861i;
        if (itemProject == null) {
            return new Item[0];
        }
        List<Item> treeList = itemProject.getTreeList();
        Iterator<Item> it = treeList.iterator();
        while (it.hasNext()) {
            Item next = it.next();
            int length = nVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    it.remove();
                    break;
                }
                if (nVarArr[i10].f255766b == next) {
                    break;
                }
                i10++;
            }
        }
        return (Item[]) treeList.toArray(new Item[0]);
    }

    private Map<Item, com.planner5d.library.widget.editor.editor3d.model.n[]> n() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (com.planner5d.library.widget.editor.editor3d.model.n nVar : this.f255853a) {
            if (!map.containsKey(nVar.f255766b)) {
                map.put(nVar.f255766b, new ArrayList());
            }
            ((List) map.get(nVar.f255766b)).add(nVar);
        }
        for (Item item : map.keySet()) {
            map2.put(item, (com.planner5d.library.widget.editor.editor3d.model.n[]) ((List) map.get(item)).toArray(new com.planner5d.library.widget.editor.editor3d.model.n[0]));
        }
        return map2;
    }

    private a[] o() {
        ArrayList<Item> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.planner5d.library.widget.editor.editor3d.model.n nVar : this.f255853a) {
            if (!arrayList.contains(nVar.f255766b)) {
                Item item = nVar.f255766b;
                if ((item instanceof ItemDoor) || ((item instanceof ItemWall) && !((ItemWall) item).hidden)) {
                    arrayList.add(item);
                }
            }
        }
        for (Item item2 : arrayList) {
            com.planner5d.library.engine.util.math.b bVar = null;
            for (com.planner5d.library.widget.editor.editor3d.model.n nVar2 : this.f255853a) {
                if (nVar2.f255766b == item2) {
                    if (bVar == null) {
                        bVar = new com.planner5d.library.engine.util.math.b(nVar2.f255769e);
                    } else {
                        bVar.e(nVar2.f255769e);
                    }
                }
            }
            if (bVar != null) {
                arrayList2.add(new a(item2, bVar));
            }
        }
        return (a[]) arrayList2.toArray(new a[0]);
    }

    private boolean q(int i10) {
        for (com.planner5d.library.widget.editor.editor3d.model.n nVar : this.f255860h[i10]) {
            if (nVar.f255766b instanceof ItemWall) {
                Iterator it = nVar.f255767c.a().iterator();
                while (it.hasNext()) {
                    if (((bc.b) it.next()).z1()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private com.planner5d.library.widget.editor.editor3d.model.n[] s(com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr) {
        ArrayList arrayList = new ArrayList();
        for (com.planner5d.library.widget.editor.editor3d.model.n nVar : nVarArr) {
            if (nVar.f255766b instanceof ItemGrid) {
                arrayList.add(nVar);
            }
        }
        for (Item item : this.f255855c) {
            if (!(item instanceof ItemGrid)) {
                for (com.planner5d.library.widget.editor.editor3d.model.n nVar2 : nVarArr) {
                    if (nVar2.f255766b == item) {
                        arrayList.add(nVar2);
                    }
                }
            }
        }
        return (com.planner5d.library.widget.editor.editor3d.model.n[]) arrayList.toArray(new com.planner5d.library.widget.editor.editor3d.model.n[0]);
    }

    @Override // ac.c
    @NonNull
    public ac.d<cc.e>[] a() {
        return this.f255853a;
    }

    @Override // ac.c
    @NonNull
    public int[][] b() {
        int[][] iArr;
        synchronized (this.f255863k) {
            try {
                if (this.f255864l == null) {
                    LinkedList linkedList = new LinkedList();
                    LinkedList linkedList2 = new LinkedList();
                    for (int i10 = 0; i10 < this.f255860h.length; i10++) {
                        if (q(i10)) {
                            linkedList2.add(Integer.valueOf(i10));
                        } else {
                            linkedList.add(Integer.valueOf(i10));
                        }
                    }
                    this.f255864l = new int[][]{com.google.common.primitives.l.E(linkedList), com.google.common.primitives.l.E(linkedList2)};
                }
                iArr = this.f255864l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iArr;
    }

    @Override // ac.c
    @NonNull
    public ac.k c(@NonNull List<? extends ac.d<cc.e>> list) {
        return new s((ac.d[]) list.toArray(new ac.d[0]));
    }

    @Override // ac.c
    @NonNull
    public ac.d<cc.e>[] d() {
        return this.f255858f;
    }

    @Override // ac.c
    @NonNull
    public ac.d<cc.e>[][] e() {
        return this.f255859g;
    }

    @Override // ac.c
    @NonNull
    public ac.d<cc.e>[][] f() {
        return this.f255860h;
    }

    @Override // ac.c
    public void g() {
        synchronized (this.f255863k) {
            this.f255864l = null;
        }
    }

    a[] p() {
        a[] aVarArr;
        synchronized (this.f255863k) {
            try {
                if (this.f255862j == null) {
                    this.f255862j = o();
                }
                aVarArr = this.f255862j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarArr;
    }

    void r(Item item) {
        if (this.f255857e.containsKey(item)) {
            com.planner5d.library.engine.util.math.b bVarG = null;
            for (com.planner5d.library.widget.editor.editor3d.model.n nVar : this.f255853a) {
                if (nVar.f255766b == item) {
                    if (bVarG == null) {
                        bVarG = this.f255857e.get(item).G(nVar.f255769e);
                    } else {
                        bVarG.e(nVar.f255769e);
                    }
                }
            }
        }
    }
}
