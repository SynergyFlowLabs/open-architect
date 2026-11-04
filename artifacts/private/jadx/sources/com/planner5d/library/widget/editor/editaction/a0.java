package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemWindow;

/* JADX INFO: loaded from: classes12.dex */
public class a0 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.math.m f254734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.math.m f254735c;

    public a0(String str, com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        super(str);
        com.planner5d.library.math.m mVar3 = new com.planner5d.library.math.m();
        this.f254734b = mVar3;
        mVar3.A0(mVar);
        this.f254735c = mVar2 == null ? null : new com.planner5d.library.math.m(mVar2);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        Item itemA = hVar.a(this.f254756a);
        if (itemA == null) {
            if (hVar.f254763a == null) {
                hVar.f254770h.d("resize_empty_project", "uid: " + this.f254756a);
                return;
            }
            return;
        }
        ItemLayout layout = itemA.getLayout(new ItemLayout());
        com.planner5d.library.math.m mVar = this.f254734b;
        layout.setScale(mVar.f180482a, mVar.f180483b, mVar.f180484c);
        com.planner5d.library.math.m mVar2 = this.f254735c;
        if (mVar2 != null) {
            layout.setPosition(mVar2.f180482a, mVar2.f180483b, mVar2.f180484c);
        }
        itemA.setLayout(layout);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar;
        Item itemA = hVar.a(this.f254756a);
        b(hVar, itemA);
        if (itemA == null || (jVar = hVar.f254765c) == null) {
            return;
        }
        jVar.L(itemA, true);
        if (itemA instanceof ItemPr) {
            com.planner5d.library.widget.editor.editor3d.model.p.h(hVar.a(this.f254756a), hVar, "item_resize_" + this.f254756a);
            return;
        }
        if (itemA instanceof ItemWindow) {
            hVar.f254765c.Q(true, "item_resize_" + itemA.getUid());
        }
    }
}
