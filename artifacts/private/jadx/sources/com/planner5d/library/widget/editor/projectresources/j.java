package com.planner5d.library.widget.editor.projectresources;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRuler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ItemRuler> f258067a = new ArrayList();

    @ij.a
    j() {
    }

    public void a(@NonNull ItemRuler itemRuler) {
        this.f258067a.add(itemRuler);
    }

    public ItemRuler[] b() {
        return (ItemRuler[]) this.f258067a.toArray(new ItemRuler[0]);
    }

    public ItemRuler[] c(ItemProject itemProject) {
        ItemFloor activeFloor = itemProject == null ? null : itemProject.getActiveFloor();
        if (activeFloor == null) {
            return new ItemRuler[0];
        }
        String uid = activeFloor.getUid();
        ArrayList arrayList = new ArrayList();
        for (ItemRuler itemRuler : this.f258067a) {
            ItemFloor itemFloor = (ItemFloor) itemRuler.getParentItem();
            if (itemFloor != null && uid.equals(itemFloor.getUid())) {
                arrayList.add(itemRuler);
            }
        }
        return (ItemRuler[]) arrayList.toArray(new ItemRuler[0]);
    }

    public void d(@NonNull ItemRuler itemRuler) {
        this.f258067a.remove(itemRuler);
    }
}
