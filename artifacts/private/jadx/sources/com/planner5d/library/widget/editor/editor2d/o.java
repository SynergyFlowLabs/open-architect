package com.planner5d.library.widget.editor.editor2d;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemGrid;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.services.r;
import com.planner5d.library.widget.editor.editor2d.drawable.w;
import com.planner5d.library.widget.editor.editor2d.painter.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q f255136a = new q(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f255137b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.widget.editor.projectresources.j f255138c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Item f255139d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f255140e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f255141f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c f255142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor2d.drawable.f[] f255143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor2d.drawable.f[] f255144i;

    public o() {
        com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c cVar = new com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c();
        this.f255142g = cVar;
        this.f255143h = new com.planner5d.library.widget.editor.editor2d.drawable.f[]{new com.planner5d.library.widget.editor.editor2d.drawable.p(), cVar};
        this.f255144i = new com.planner5d.library.widget.editor.editor2d.drawable.f[]{new com.planner5d.library.widget.editor.editor2d.drawable.gizmo.d()};
    }

    private q m() {
        q qVar;
        synchronized (this.f255137b) {
            try {
                qVar = this.f255136a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    private List<Item> o(Item item, List<Item> list) {
        if (item != null) {
            list.add(item);
            Item[] children = item.getChildren();
            if (children != null) {
                for (Item item2 : children) {
                    o(item2, list);
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(ItemProject itemProject, boolean z10, Subscriber subscriber) {
        q qVar;
        Item[] children;
        if (itemProject != null) {
            if (z10) {
                a0.f255148d.d();
            }
            synchronized (this.f255140e) {
                try {
                    ItemEarth earth = itemProject.getEarth();
                    ItemFloor activeFloor = itemProject.getActiveFloor();
                    if (z10) {
                        earth.resetDrawable();
                    }
                    qVar = new q(itemProject);
                    qVar.a(earth.setFloorBefore(itemProject.getFloor(itemProject.getActiveFloorNumber() - 1)));
                    qVar.a(new ItemGrid(earth));
                    if (activeFloor != null && (children = activeFloor.getChildren()) != null) {
                        for (Item item : children) {
                            if (z10 && (item instanceof ItemWalls)) {
                                item.resetDrawable();
                                ((ItemWalls) item).resetWalls();
                            }
                            qVar.a(item);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            synchronized (this.f255137b) {
                this.f255136a = qVar;
            }
            subscriber.onNext(null);
        }
        subscriber.onCompleted();
    }

    public void b(Item item) {
        m().a(item);
    }

    public RectF c() {
        RectF rectF = new RectF();
        ItemEarth earth = m().f255373c.getEarth();
        if (earth != null) {
            PointF size = earth.getSize();
            rectF.right = size.x;
            rectF.bottom = size.y;
        }
        return rectF;
    }

    public List<com.planner5d.library.widget.editor.editor2d.drawable.c> d() {
        List<com.planner5d.library.widget.editor.editor2d.drawable.c> listB = m().b();
        for (ItemRuler itemRuler : k()) {
            w drawableInstances = itemRuler.getDrawableInstances();
            if (drawableInstances != null) {
                Collections.addAll(listB, drawableInstances.f255098a);
            }
            Item[] children = itemRuler.getChildren();
            if (children != null) {
                for (Item item : children) {
                    w drawableInstances2 = item.getDrawableInstances();
                    if (drawableInstances2 != null) {
                        Collections.addAll(listB, drawableInstances2.f255098a);
                    }
                }
            }
        }
        return listB;
    }

    public com.planner5d.library.widget.editor.editor2d.drawable.f[] e() {
        return this.f255143h;
    }

    public com.planner5d.library.widget.editor.editor2d.drawable.f[] f() {
        return this.f255144i;
    }

    public com.planner5d.library.widget.editor.editor2d.drawable.f g() {
        return this.f255142g;
    }

    public ItemProject h() {
        return m().f255373c;
    }

    public List<Item> i() {
        List<Item> listC = m().c();
        for (ItemRuler itemRuler : k()) {
            listC.add(itemRuler);
            Item[] children = itemRuler.getChildren();
            if (children != null) {
                Collections.addAll(listC, children);
            }
        }
        return listC;
    }

    public Item[] j(PointF pointF, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        w drawableInstances;
        LinkedList linkedList = new LinkedList();
        ItemRuler[] itemRulerArrK = k();
        int length = itemRulerArrK.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            ItemRuler itemRuler = itemRulerArrK[length];
            Item[] children = itemRuler.getChildren();
            if (children != null) {
                for (Item item : children) {
                    w drawableInstances2 = item.getDrawableInstances();
                    if (drawableInstances2 != null && drawableInstances2.a(pointF) && !linkedList.contains(item)) {
                        linkedList.add(item);
                    }
                }
            }
            w drawableInstances3 = itemRuler.getDrawableInstances();
            if (drawableInstances3 != null && drawableInstances3.a(pointF) && !linkedList.contains(itemRuler)) {
                linkedList.add(itemRuler);
            }
        }
        for (List<Item> list : m().d()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Item item2 = list.get(size);
                if (!(item2 instanceof ItemEarth) && (drawableInstances = item2.getDrawableInstances()) != null && ((bVar.f258070a || (!(item2 instanceof ItemNs) && !(item2 instanceof ItemPr))) && drawableInstances.a(pointF) && !linkedList.contains(item2))) {
                    linkedList.add(item2);
                }
            }
        }
        return (Item[]) linkedList.toArray(new Item[0]);
    }

    public ItemRuler[] k() {
        com.planner5d.library.widget.editor.projectresources.j jVar = this.f255138c;
        return jVar == null ? new ItemRuler[0] : jVar.c(m().f255373c);
    }

    public Item l() {
        return this.f255139d;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb  */
    public Item n(com.planner5d.library.widget.editor.helper.selector.a aVar, PointF pointF, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        w drawableInstances;
        Item item = this.f255139d;
        if ((item instanceof ItemWall) || (item instanceof ItemPoint)) {
            w drawableInstances2 = item.getDrawableInstances();
            if (drawableInstances2 != null && drawableInstances2.a(pointF)) {
                return item;
            }
            if (item instanceof ItemWall) {
                for (Item item2 : ((ItemWall) item).getPoints()) {
                    if (item2 != null && (drawableInstances = item2.getDrawableInstances()) != null && drawableInstances.a(pointF) && aVar.B(item2)) {
                        return item2;
                    }
                }
            }
        }
        Item[] itemArrK = k();
        int length = itemArrK.length;
        while (true) {
            length--;
            if (length < 0) {
                Item item3 = null;
                for (List<Item> list : m().d()) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        Item item4 = list.get(size);
                        w drawableInstances3 = item4.getDrawableInstances();
                        if (drawableInstances3 != null && ((bVar.f258070a || (!(item4 instanceof ItemNs) && !(item4 instanceof ItemPr))) && drawableInstances3.a(pointF))) {
                            if (item3 != null) {
                                if ((item4 instanceof ItemWall) && !((ItemWall) item4).hidden && aVar.B(item4)) {
                                    return item4;
                                }
                            } else if (item4 instanceof ItemWall) {
                                ItemWall itemWall = (ItemWall) item4;
                                if (itemWall.hidden) {
                                    item3 = itemWall;
                                } else if (aVar.B(item4)) {
                                    return item4;
                                }
                            } else if (aVar.B(item4)) {
                                return item4;
                            }
                        }
                    }
                    if (item3 != null && aVar.B(item3)) {
                        return item3;
                    }
                }
                return null;
            }
            Item item5 = itemArrK[length];
            Item[] children = item5.getChildren();
            if (children != null) {
                for (Item item6 : children) {
                    w drawableInstances4 = item6.getDrawableInstances();
                    if (drawableInstances4 != null && drawableInstances4.a(pointF) && aVar.B(item6)) {
                        return item6;
                    }
                }
            }
            w drawableInstances5 = item5.getDrawableInstances();
            if (drawableInstances5 != null && drawableInstances5.a(pointF) && aVar.B(item5)) {
                return item5;
            }
        }
    }

    public boolean p(Item item, PointF pointF) {
        w drawableInstances = item == null ? null : item.getDrawableInstances();
        return drawableInstances != null && drawableInstances.a(pointF);
    }

    public void r(Item item) {
        m().e(item);
    }

    public void s(Item[] itemArr) {
        q qVarM = m();
        for (Item item : itemArr) {
            qVarM.e(item);
        }
    }

    public void t(Bundle bundle) {
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(new com.planner5d.library.services.utility.j(bundle).h(r.scene2D, null));
        r rVar = r.selected;
        r rVar2 = r.order;
        if (jVar.a(rVar, rVar2)) {
            String strT = jVar.t(rVar, null);
            if (strT != null) {
                w(h().getChild(strT));
            }
            String[] strArrV = jVar.v(rVar2, null);
            if (strArrV == null) {
                return;
            }
            q qVarM = m();
            List<Item> listC = qVarM.c();
            HashMap map = new HashMap();
            for (Item item : listC) {
                map.put(item.getUid(), item);
            }
            q qVar = new q(qVarM.f255373c);
            for (String str : strArrV) {
                qVar.a((Item) map.remove(str));
            }
            for (String str2 : (String[]) map.keySet().toArray(new String[0])) {
                qVar.a((Item) map.remove(str2));
            }
            synchronized (this.f255137b) {
                try {
                    this.f255136a = qVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void u(Bundle bundle) {
        LinkedList linkedList = new LinkedList();
        Iterator<Item> it = m().c().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().getUid());
        }
        String str = r.scene2D.f224891a;
        com.planner5d.library.services.utility.i iVarL = new com.planner5d.library.services.utility.i().l(r.order, linkedList);
        r rVar = r.selected;
        Item item = this.f255139d;
        bundle.putBundle(str, iVarL.j(rVar, item == null ? null : item.getUid()).a());
    }

    public Observable<Void> v(final ItemProject itemProject, com.planner5d.library.widget.editor.projectresources.j jVar, boolean z10, final boolean z11) {
        this.f255141f = z10;
        this.f255138c = jVar;
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor2d.n
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f255133a.q(itemProject, z11, (Subscriber) obj);
            }
        });
    }

    public boolean w(Item item) {
        Item item2;
        if (!this.f255141f && item != (item2 = this.f255139d)) {
            if ((item2 instanceof ItemRoom) && ((ItemRoom) item2).isInRotation()) {
                ((ItemRoom) this.f255139d).endRotation();
                com.planner5d.library.services.l.f224380f.o((ItemRoom) this.f255139d);
            }
            q qVarM = m();
            this.f255139d = item;
            qVarM.f(o(item, new ArrayList()));
            return true;
        }
        return false;
    }
}
