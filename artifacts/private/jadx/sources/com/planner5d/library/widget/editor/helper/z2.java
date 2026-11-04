package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWindow;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a[] f256879a = new a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ItemLayout f256880b = new ItemLayout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.math.k f256881c = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.math.k f256882d = new com.planner5d.library.math.k();

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ItemWall f256883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ItemWindow f256884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f256885c;

        a(ItemWall itemWall, ItemWindow itemWindow) {
            this.f256883a = itemWall;
            this.f256884b = itemWindow;
            this.f256885c = com.planner5d.library.math.c.f180466e.f(itemWindow.getLayout(z2.this.f256880b).getPosition(z2.this.f256881c).c0(itemWall.getPoint(z2.this.f256882d, true, true)), itemWall.getVector(z2.this.f256882d));
        }

        void a() {
            ItemWindow itemWindow = this.f256884b;
            itemWindow.setLayout(itemWindow.getLayout(z2.this.f256880b).setRotationY(this.f256883a.getVector(z2.this.f256882d).c() - 90.0f).setPosition(z2.this.f256881c.V(z2.this.f256882d).M().R(Math.min(z2.this.f256882d.F(), this.f256885c)).b(this.f256883a.getPoint(z2.this.f256882d, true, true))));
        }
    }

    public void d() {
        for (a aVar : this.f256879a) {
            aVar.a();
        }
    }

    public void e(Map<String, ItemWall> map, List<ItemWindow> list) {
        LinkedList linkedList = new LinkedList();
        for (ItemWindow itemWindow : list) {
            linkedList.add(new a(map.get(itemWindow.getAttachedTo()), itemWindow));
        }
        this.f256879a = (a[]) linkedList.toArray(new a[0]);
    }

    public void f() {
        this.f256879a = new a[0];
    }
}
