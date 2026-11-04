package com.planner5d.library.model.item;

import com.planner5d.library.math.k;
import com.planner5d.library.walls.WallsBuilder;
import com.planner5d.library.walls.WallsInfoWall;
import com.planner5d.library.widget.editor.editor2d.drawable.c;
import com.planner5d.library.widget.editor.editor2d.drawable.t;
import com.planner5d.library.widget.editor.editor2d.drawable.u;
import com.planner5d.library.widget.editor.editor2d.drawable.w;

/* JADX INFO: loaded from: classes7.dex */
public class ItemRuler extends ItemWall {
    public ItemRuler(k kVar, k kVar2, ItemFloor itemFloor) {
        super(null, new ItemPoint((String) null, kVar), new ItemPoint((String) null, kVar2));
        setParentItem(itemFloor);
        this.thickness = 20.0f;
    }

    @Override // com.planner5d.library.model.item.ItemWall, com.planner5d.library.model.item.Item
    protected w createDrawables() {
        WallsInfoWall wallsInfoWall = WallsBuilder.INSTANCE.build(this).get(this);
        if (wallsInfoWall == null) {
            return null;
        }
        return w.g(new t(wallsInfoWall), new u(wallsInfoWall));
    }

    @Override // com.planner5d.library.model.item.ItemWall, com.planner5d.library.walls.Wall
    public int getMinimumWidth() {
        return ((int) this.thickness) / 2;
    }

    public void reset() {
        w drawableInstances = getDrawableInstances();
        if (drawableInstances != null) {
            for (c cVar : drawableInstances.f255098a) {
                ((t) cVar).m(WallsBuilder.INSTANCE.build(this).get(this));
            }
        }
    }

    public ItemRuler(ItemRuler itemRuler, ProviderUid providerUid) {
        super(itemRuler, providerUid);
        setParentItem(itemRuler.getParentItem());
    }
}
