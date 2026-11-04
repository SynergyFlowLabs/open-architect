package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.builder.ItemCloner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f254726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Item[] f254727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f254728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f254729i;

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.editaction.a$a, reason: collision with other inner class name */
    class C1724a extends com.planner5d.library.services.rx.e<com.planner5d.library.widget.editor.editor3d.model.n[]> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f254730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f254731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Item f254732f;

        C1724a(List list, h hVar, Item item) {
            this.f254730d = list;
            this.f254731e = hVar;
            this.f254732f = item;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr) {
            for (Item item : this.f254730d) {
                if ((item instanceof ItemWindow) || (item instanceof ItemWalls)) {
                    this.f254731e.f254765c.Q(false, null);
                    break;
                }
            }
            this.f254731e.f254765c.C();
            a aVar = a.this;
            if (aVar.f254739d) {
                return;
            }
            aVar.e(this.f254731e, this.f254732f);
        }
    }

    public a(Item[] itemArr, ItemFloor itemFloor) {
        this(itemArr, new int[0], itemFloor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(h hVar, Item item) {
        com.planner5d.library.widget.editor.helper.selector.a aVar;
        if (!this.f254729i || (aVar = hVar.f254768f) == null) {
            return;
        }
        aVar.d(item);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        ItemFloor itemFloor = (ItemFloor) hVar.a(this.f254728h);
        ItemFloor activeFloor = itemFloor;
        if (itemFloor == null) {
            activeFloor = hVar.f254763a.getActiveFloor();
        }
        float height = activeFloor.getHeight();
        com.planner5d.library.widget.editor.helper.k kVar = new com.planner5d.library.widget.editor.helper.k();
        com.planner5d.library.widget.editor.helper.j jVar = new com.planner5d.library.widget.editor.helper.j();
        int i10 = 0;
        while (true) {
            Item[] itemArr = this.f254727g;
            if (i10 >= itemArr.length) {
                break;
            }
            Item itemClone = ItemCloner.clone(itemArr[i10], null, null);
            int[] iArr = this.f254726f;
            if (iArr.length > 0) {
                activeFloor.addItem(itemClone, Integer.valueOf(iArr[i10]));
            } else {
                activeFloor.addItem(itemClone, null);
            }
            if (itemClone instanceof ItemWalls) {
                itemClone.setParentItem(activeFloor);
            } else if (itemClone instanceof ItemNs) {
                if (itemClone instanceof ItemWindow) {
                    kVar.b(activeFloor, (ItemWindow) itemClone, null);
                } else {
                    jVar.a(activeFloor, (ItemNs) itemClone);
                }
            }
            i10++;
        }
        this.f254737b = height != activeFloor.getHeight();
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        e(hVar, null);
        ArrayList arrayList = new ArrayList();
        for (Item item : this.f254727g) {
            Item itemA = hVar.a(item.getUid());
            if (this.f254729i) {
                b(hVar, itemA);
            }
            arrayList.add(itemA);
        }
        Item item2 = arrayList.isEmpty() ? null : (Item) arrayList.get(arrayList.size() - 1);
        if (hVar.f254764b != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hVar.f254764b.b((Item) it.next());
            }
            e(hVar, item2);
        }
        if (hVar.f254765c != null) {
            if (!this.f254737b) {
                com.planner5d.library.widget.editor.editor3d.model.p.e((Item[]) arrayList.toArray(new Item[0]), hVar.f254766d, hVar.f254765c, this.f254729i).subscribe((Subscriber<? super com.planner5d.library.widget.editor.editor3d.model.n[]>) new C1724a(arrayList, hVar, item2));
            } else {
                if (this.f254738c) {
                    return;
                }
                hVar.f254769g.m().subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new com.planner5d.library.services.rx.e());
            }
        }
    }

    public a(Item[] itemArr, int[] iArr, ItemFloor itemFloor) {
        super(null);
        this.f254729i = false;
        this.f254728h = itemFloor.getUid();
        this.f254726f = iArr;
        this.f254727g = new Item[itemArr.length];
        for (int i10 = 0; i10 < itemArr.length; i10++) {
            this.f254727g[i10] = ItemCloner.clone(itemArr[i10], null, null);
        }
    }

    public a(Item item, ItemFloor itemFloor) {
        this(item, itemFloor, true);
    }

    public a(Item item, ItemFloor itemFloor, boolean z10) {
        this(item, itemFloor, itemFloor.getChildren().length, z10);
    }

    public a(Item item, ItemFloor itemFloor, int i10) {
        this(item, itemFloor, i10, true);
    }

    public a(Item item, ItemFloor itemFloor, int i10, boolean z10) {
        super(item.getUid());
        this.f254727g = new Item[]{ItemCloner.clone(item, null, null)};
        this.f254726f = new int[]{i10};
        this.f254728h = itemFloor.getUid();
        this.f254729i = z10;
    }
}
