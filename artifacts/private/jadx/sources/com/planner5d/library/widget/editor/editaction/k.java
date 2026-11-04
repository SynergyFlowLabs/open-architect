package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.builder.ItemCloner;
import java.util.ArrayList;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class k extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ItemFloor f254777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f254778c;

    public k(ItemFloor itemFloor, int i10) {
        super(itemFloor.getUid());
        this.f254778c = Integer.valueOf(i10);
        this.f254777b = (ItemFloor) ItemCloner.clone(itemFloor, null, null);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        ArrayList arrayList = new ArrayList();
        ItemFloor[] floorArray = hVar.f254763a.getFloorArray();
        for (int i10 = 0; i10 < floorArray.length; i10++) {
            if (i10 == this.f254778c.intValue()) {
                arrayList.add(this.f254777b);
            }
            arrayList.add(floorArray[i10]);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            hVar.f254763a.setFloor((ItemFloor) arrayList.get(i11), i11);
        }
        hVar.f254763a.setActiveFloor(this.f254777b);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        hVar.f254769g.m().subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new com.planner5d.library.services.rx.e());
    }
}
