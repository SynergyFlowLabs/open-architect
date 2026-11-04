package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemRoom;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class b0 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f254740b;

    public b0(String str, float f10) {
        super(str);
        this.f254740b = f10;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        Item itemA = hVar.a(this.f254756a);
        if (itemA != null) {
            if (itemA instanceof ItemRoom) {
                ItemRoom itemRoom = (ItemRoom) itemA;
                itemRoom.height = com.planner5d.library.model.converter.json.to.a.f(this.f254740b, 270.0f);
                ((ItemFloor) itemRoom.getParentItem()).resetHeight();
                itemRoom.resetWalls();
                return;
            }
            throw new RuntimeException("Expected ItemRoom but got " + itemA.getClass().getName() + " with uid " + this.f254756a);
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        if (hVar.f254765c != null) {
            hVar.f254769g.m().subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new com.planner5d.library.services.rx.e());
        }
    }
}
