package com.planner5d.library.widget.editor.editor2d;

import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.widget.editor.editor2d.drawable.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p<Item> f255371a = new p<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f255372b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ItemProject f255373c;

    q(ItemProject itemProject) {
        this.f255373c = itemProject;
    }

    void a(Item item) {
        if (item != null && this.f255373c != null) {
            w drawableInstances = item.getDrawableInstances();
            if (drawableInstances != null) {
                for (com.planner5d.library.widget.editor.editor2d.drawable.c cVar : drawableInstances.f255098a) {
                    synchronized (this.f255372b) {
                        try {
                            List<Item> listC = this.f255371a.c(cVar.g());
                            if (!listC.contains(item)) {
                                listC.add(item);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            Item[] children = item.getChildren();
            if (children != null) {
                for (Item item2 : children) {
                    a(item2);
                }
            }
        }
    }

    List<com.planner5d.library.widget.editor.editor2d.drawable.c> b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f255372b) {
            try {
                int i10 = this.f255371a.f255146b.x;
                while (true) {
                    p<Item> pVar = this.f255371a;
                    if (i10 <= pVar.f255146b.y) {
                        Iterator<Item> it = pVar.c(i10).iterator();
                        while (it.hasNext()) {
                            w drawableInstances = it.next().getDrawableInstances();
                            if (drawableInstances != null) {
                                for (com.planner5d.library.widget.editor.editor2d.drawable.c cVar : drawableInstances.f255098a) {
                                    if (cVar.g() == i10) {
                                        arrayList.add(cVar);
                                    }
                                }
                            }
                        }
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    List<Item> c() {
        List<Item> listB;
        synchronized (this.f255372b) {
            try {
                listB = this.f255371a.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listB;
    }

    List<List<Item>> d() {
        List<List<Item>> listD;
        synchronized (this.f255372b) {
            listD = this.f255371a.d();
        }
        return listD;
    }

    void e(Item item) {
        if (item != null) {
            List<Item> treeList = item.getTreeList();
            synchronized (this.f255372b) {
                try {
                    this.f255371a.e(treeList);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    void f(List<Item> list) {
        synchronized (this.f255372b) {
            try {
                int i10 = this.f255371a.f255146b.y;
                while (true) {
                    p<Item> pVar = this.f255371a;
                    if (i10 >= pVar.f255146b.x) {
                        List<Item> listC = pVar.c(i10);
                        ArrayList arrayList = new ArrayList();
                        for (Item item : listC) {
                            if (list.contains(item)) {
                                arrayList.add(item);
                            }
                        }
                        listC.removeAll(arrayList);
                        listC.addAll(arrayList);
                        i10--;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
