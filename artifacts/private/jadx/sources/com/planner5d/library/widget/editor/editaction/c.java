package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.builder.ItemCloner;

/* JADX INFO: loaded from: classes12.dex */
public class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ItemWall[] f254741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ItemWall[] f254742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f254743d;

    public c(String str, ItemWall[] itemWallArr, String str2) {
        super(str);
        this.f254742c = null;
        this.f254741b = (ItemWall[]) ItemCloner.clone(ItemWall.class, itemWallArr, null, null);
        this.f254743d = str2;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        ItemWalls itemWalls = (ItemWalls) hVar.a(this.f254756a);
        if (itemWalls != null) {
            this.f254742c = itemWalls.getChildren();
            itemWalls.setWalls((ItemWall[]) ItemCloner.clone(ItemWall.class, this.f254741b, null, null));
            if (itemWalls instanceof ItemRoom) {
                new com.planner5d.library.widget.editor.helper.k().e((ItemRoom) itemWalls);
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        ItemWalls itemWalls = (ItemWalls) hVar.a(this.f254756a);
        if (itemWalls != null) {
            com.planner5d.library.widget.editor.editor2d.o oVar = hVar.f254764b;
            if (oVar != null) {
                oVar.s(this.f254742c);
                hVar.f254764b.r(itemWalls);
                hVar.f254764b.b(itemWalls);
                hVar.f254764b.w(null);
                hVar.f254764b.w(hVar.a(this.f254743d));
                return;
            }
            com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = hVar.f254765c;
            if (jVar != null) {
                long jW = jVar.w();
                hVar.f254765c.k();
                hVar.f254765c.U(this.f254742c, jW);
                com.planner5d.library.widget.editor.editor3d.model.p.h(itemWalls, hVar, null);
            }
        }
    }
}
