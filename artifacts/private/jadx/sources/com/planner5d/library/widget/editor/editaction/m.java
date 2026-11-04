package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class m extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f254781b;

    public m(@NonNull String str, int i10) {
        super(str);
        this.f254781b = i10;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        Item itemA = hVar.a(this.f254756a);
        if (itemA instanceof ItemFloor) {
            hVar.f254763a.moveFloorToNewPosition((ItemFloor) itemA, this.f254781b);
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        hVar.f254769g.m().subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new com.planner5d.library.services.rx.e());
    }
}
