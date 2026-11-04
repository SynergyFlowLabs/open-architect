package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;

/* JADX INFO: loaded from: classes12.dex */
public class i0 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f254776b;

    public i0(String str, boolean z10) {
        super(str);
        this.f254776b = z10;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        ItemWall itemWall = (ItemWall) hVar.a(this.f254756a);
        if (itemWall != null) {
            itemWall.hidden = !this.f254776b;
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        ItemWall itemWall = (ItemWall) hVar.a(this.f254756a);
        if (itemWall != null) {
            Item parentItem = itemWall.getParentItem();
            if (parentItem instanceof ItemRoom) {
                ((ItemRoom) parentItem).resetWalls();
                com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = hVar.f254765c;
                if (jVar != null) {
                    jVar.Q(true, "item_wall_visibility_" + this.f254756a);
                    if (!this.f254776b) {
                        hVar.f254765c.k();
                    }
                }
            }
        }
    }
}
