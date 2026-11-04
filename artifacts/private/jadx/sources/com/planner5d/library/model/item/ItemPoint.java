package com.planner5d.library.model.item;

import com.planner5d.library.math.k;
import com.planner5d.library.widget.editor.editor2d.drawable.l;
import com.planner5d.library.widget.editor.editor2d.drawable.w;

/* JADX INFO: loaded from: classes7.dex */
public class ItemPoint extends Item {
    private final k point;

    public ItemPoint(String str, k kVar) {
        super(str);
        k kVar2 = new k();
        this.point = kVar2;
        kVar2.V(kVar);
    }

    @Override // com.planner5d.library.model.item.Item
    protected w createDrawables() {
        ItemWall itemWall = (ItemWall) getParentItem();
        Item parentItem = itemWall == null ? null : itemWall.getParentItem();
        return w.g(((parentItem instanceof ItemRoom) || (parentItem instanceof ItemPartition)) ? new l(this) : new com.planner5d.library.widget.editor.editor2d.drawable.k(this));
    }

    @Override // com.planner5d.library.model.item.Item
    public ItemMaterial[] getMaterials() {
        return null;
    }

    public ItemWalls getParentWalls() {
        Item parentItem = getParentItem();
        if (parentItem instanceof ItemWall) {
            return ((ItemWall) parentItem).getParentWalls();
        }
        return null;
    }

    public k getPoint(k kVar, boolean z10) {
        if (z10) {
            getLayoutPosition(kVar).b(this.point);
            return kVar;
        }
        kVar.V(this.point);
        return kVar;
    }

    public void setPoint(float f10, float f11) {
        setPoint(f10, f11, false);
    }

    public void setPoint(k kVar) {
        setPoint(kVar.f180480a, kVar.f180481b, false);
    }

    public k getPoint() {
        return this.point;
    }

    public void setPoint(float f10, float f11, boolean z10) {
        if (z10) {
            getLayoutPosition(this.point).R(-1.0f).a(f10, f11);
        } else {
            this.point.U(f10, f11);
        }
    }

    public ItemPoint(String str, float f10, float f11) {
        super(str);
        this.point = new k();
        setPoint(f10, f11);
    }

    public ItemPoint(ItemPoint itemPoint, ProviderUid providerUid) {
        super(itemPoint, providerUid);
        k kVar = new k();
        this.point = kVar;
        kVar.V(itemPoint.point);
    }
}
