package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemRoom;

/* JADX INFO: loaded from: classes12.dex */
public class p extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f254783b;

    public p(@NonNull String str, float f10) {
        super(str);
        this.f254783b = f10;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        Item itemA = hVar.a(this.f254756a);
        if (itemA instanceof ItemRoom) {
            ((ItemRoom) itemA).setFlooringHeight(this.f254783b);
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = hVar.f254765c;
        if (jVar != null) {
            jVar.S(this.f254756a);
        }
    }
}
