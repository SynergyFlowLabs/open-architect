package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemNs;

/* JADX INFO: loaded from: classes12.dex */
public class r extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ItemMaterialSet f254787b;

    public r(ItemNs itemNs, ItemMaterialSet itemMaterialSet) {
        super(itemNs.getUid());
        this.f254787b = itemMaterialSet == null ? null : new ItemMaterialSet(itemMaterialSet);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        ItemNs itemNs = (ItemNs) hVar.a(this.f254756a);
        b(hVar, itemNs);
        itemNs.setMaterialSet(this.f254787b);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        if (hVar.f254765c != null) {
            com.planner5d.library.widget.editor.editor3d.model.p.h(hVar.a(this.f254756a), hVar, null);
        }
    }
}
