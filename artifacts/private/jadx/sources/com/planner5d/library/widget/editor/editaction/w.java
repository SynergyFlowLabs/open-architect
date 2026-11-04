package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemMaterial;

/* JADX INFO: loaded from: classes12.dex */
public class w extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ItemMaterial f254804b;

    public w(ItemMaterial itemMaterial) {
        super("");
        this.f254804b = new ItemMaterial(itemMaterial);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        hVar.f254763a.getEarth().setMaterial(this.f254804b);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        if (hVar.f254765c != null) {
            com.planner5d.library.widget.editor.editor3d.model.p.h(hVar.f254763a.getEarth(), hVar, null);
        }
    }
}
