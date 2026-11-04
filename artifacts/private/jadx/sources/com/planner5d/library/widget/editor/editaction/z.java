package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemRuler;

/* JADX INFO: loaded from: classes12.dex */
public class z extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ItemRuler f254812b;

    public z(ItemRuler itemRuler) {
        super(null);
        this.f254812b = itemRuler;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        this.f254812b.reset();
    }
}
