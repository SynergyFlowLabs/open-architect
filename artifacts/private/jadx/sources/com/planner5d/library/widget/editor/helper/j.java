package com.planner5d.library.widget.editor.helper;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWindow;

/* JADX INFO: loaded from: classes8.dex */
public class j {
    @androidx.annotation.m1
    public void a(ItemFloor itemFloor, ItemNs itemNs) {
        com.planner5d.library.widget.editor.editor2d.drawable.w drawableInstances;
        int iP;
        if (itemNs instanceof ItemWindow) {
            return;
        }
        Item[] children = itemFloor.getChildren();
        com.planner5d.library.widget.editor.editor2d.drawable.w drawableInstances2 = itemNs.getDrawableInstances();
        if (drawableInstances2 != null) {
            RectF rectFD = drawableInstances2.f255098a[0].d(new RectF());
            ItemRoom itemRoom = null;
            int i10 = 0;
            for (Item item : children) {
                if ((item instanceof ItemRoom) && (drawableInstances = item.getDrawableInstances()) != null && (iP = ((com.planner5d.library.widget.editor.editor2d.drawable.n) drawableInstances.f255098a[0]).p(drawableInstances2.f255098a[0].d(rectFD))) > i10) {
                    itemRoom = (ItemRoom) item;
                    i10 = iP;
                }
            }
            if (itemRoom != null) {
                itemNs.setAttachedTo(itemRoom.getUid());
                return;
            }
        }
        itemNs.setAttachedTo(null);
    }

    @androidx.annotation.m1
    public void b(@NonNull ItemProject itemProject) {
        for (ItemFloor itemFloor : itemProject.getFloorArray()) {
            if (itemFloor != null) {
                for (Item item : itemFloor.getChildren()) {
                    if (item instanceof ItemNs) {
                        a(itemFloor, (ItemNs) item);
                    }
                }
            }
        }
    }
}
