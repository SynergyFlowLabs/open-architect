package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;

/* JADX INFO: loaded from: classes12.dex */
public class f0 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.math.m f254760b;

    public f0(String str, com.planner5d.library.math.m mVar) {
        super(str);
        com.planner5d.library.math.m mVar2 = new com.planner5d.library.math.m();
        this.f254760b = mVar2;
        mVar2.A0(mVar);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        Item itemA = hVar.a(this.f254756a);
        if (itemA != null) {
            ItemLayout layout = itemA.getLayout(new ItemLayout());
            com.planner5d.library.math.m mVar = this.f254760b;
            itemA.setLayout(layout.setRotation(mVar.f180482a, mVar.f180483b, mVar.f180484c));
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        Item itemA = hVar.a(this.f254756a);
        b(hVar, itemA);
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = hVar.f254765c;
        if (jVar != null) {
            jVar.L(itemA, true);
        }
    }
}
