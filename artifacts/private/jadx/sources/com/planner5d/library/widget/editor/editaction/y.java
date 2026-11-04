package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class y extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f254808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f254809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Item> f254810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f254811i;

    public y(String[] strArr) {
        super(null);
        this.f254810h = new ArrayList();
        this.f254811i = false;
        this.f254809g = strArr;
        this.f254808f = false;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        this.f254811i = false;
        this.f254737b = false;
        for (String str : this.f254809g) {
            Item itemA = hVar.a(str);
            ItemFloor itemFloor = hVar.f254763a.getItemFloor(itemA);
            if (itemFloor != null) {
                boolean z10 = itemA instanceof ItemRoom;
                float height = z10 ? itemFloor.getHeight() : 0.0f;
                itemFloor.removeItem(itemA);
                this.f254810h.add(itemA);
                if (z10 && height != itemFloor.getHeight()) {
                    this.f254737b = true;
                }
                if (itemA instanceof ItemWindow) {
                    this.f254811i = true;
                }
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        if (this.f254808f) {
            hVar.f254768f.d(null);
        }
        Iterator<Item> it = this.f254810h.iterator();
        while (it.hasNext()) {
            Item next = it.next();
            it.remove();
            if (this.f254808f) {
                b(hVar, next);
            }
            com.planner5d.library.widget.editor.editor2d.o oVar = hVar.f254764b;
            if (oVar != null) {
                oVar.r(next);
            } else {
                com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = hVar.f254765c;
                if (jVar != null && !this.f254737b) {
                    jVar.k();
                    com.planner5d.library.widget.editor.editor3d.scene3d.j jVar2 = hVar.f254765c;
                    jVar2.U(new Item[]{next}, jVar2.w());
                }
            }
        }
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar3 = hVar.f254765c;
        if (jVar3 != null) {
            if (this.f254808f) {
                jVar3.h0(null);
            }
            if (this.f254737b) {
                if (this.f254738c) {
                    return;
                }
                hVar.f254769g.m().subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new com.planner5d.library.services.rx.e());
                return;
            }
            hVar.f254765c.C();
            if (this.f254811i) {
                hVar.f254765c.Q(false, "item_remove_" + org.apache.commons.lang3.z.c1(this.f254809g, ":"));
            }
        }
    }

    public y(String str) {
        super(str);
        this.f254810h = new ArrayList();
        this.f254811i = false;
        this.f254809g = new String[]{str};
        this.f254808f = true;
    }
}
