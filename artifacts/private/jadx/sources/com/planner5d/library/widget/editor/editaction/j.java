package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class j extends e {
    public j(@NonNull String str) {
        super(str);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        Item itemA = hVar.a(this.f254756a);
        if (itemA instanceof ItemFloor) {
            hVar.f254763a.setActiveFloor((ItemFloor) itemA);
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        hVar.f254769g.m().subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new com.planner5d.library.services.rx.e());
    }
}
