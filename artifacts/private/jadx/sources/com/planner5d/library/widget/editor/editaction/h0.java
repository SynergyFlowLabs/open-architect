package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.services.utility.y1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class h0 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, BigDecimal> f254773b;

    public h0(ItemRoom itemRoom, BigDecimal bigDecimal) {
        super(itemRoom.getUid());
        this.f254773b = new HashMap();
        d(itemRoom, bigDecimal == null ? BigDecimal.valueOf(itemRoom.getWallsThickness()) : bigDecimal);
        for (ItemWall itemWall : itemRoom.getChildren()) {
            d(itemWall, bigDecimal == null ? BigDecimal.valueOf(itemWall.thickness) : bigDecimal);
        }
    }

    private void d(Item item, BigDecimal bigDecimal) {
        this.f254773b.put(item.getUid(), y1.b(bigDecimal, new BigDecimal(5), new BigDecimal(1000)).setScale(2, 4));
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        for (String str : this.f254773b.keySet()) {
            float fFloatValue = this.f254773b.get(str).floatValue();
            Item itemA = hVar.a(str);
            if (itemA instanceof ItemWall) {
                ((ItemWall) itemA).thickness = fFloatValue;
            } else if (itemA instanceof ItemRoom) {
                ((ItemRoom) itemA).setWallsThickness(fFloatValue);
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f254773b.keySet().iterator();
        while (it.hasNext()) {
            Item itemA = hVar.a(it.next());
            if (itemA instanceof ItemWall) {
                itemA = itemA.getParentItem();
            }
            if ((itemA instanceof ItemRoom) && !arrayList.contains(itemA)) {
                ItemRoom itemRoom = (ItemRoom) itemA;
                arrayList.add(itemRoom);
                itemRoom.resetWalls();
            }
        }
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = hVar.f254765c;
        if (jVar != null) {
            jVar.Q(true, "item_wall_thickness_" + this.f254756a);
        }
    }

    public h0(ItemWall itemWall, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        super(itemWall.getUid());
        this.f254773b = new HashMap();
        d(itemWall, bigDecimal);
        d(itemWall.getParentWalls(), bigDecimal2);
    }
}
