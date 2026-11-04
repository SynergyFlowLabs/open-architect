package com.planner5d.library.model.item;

import com.planner5d.library.math.k;
import com.planner5d.library.widget.editor.editor2d.drawable.b;
import com.planner5d.library.widget.editor.editor2d.drawable.w;

/* JADX INFO: loaded from: classes7.dex */
public class ItemEarth extends ItemGrid {
    public static k DEFAULT_SIZE = new k(8000.0f, 8000.0f);
    private ItemMaterial material;

    public ItemEarth(float f10, float f11) {
        super(f10, f11);
        this.material = new ItemMaterial("__earth__", -1);
    }

    @Override // com.planner5d.library.model.item.ItemGrid, com.planner5d.library.model.item.Item
    protected w createDrawables() {
        return w.g(new b(this.material, getSize()));
    }

    @Override // com.planner5d.library.model.item.ItemGrid
    public ItemMaterial getMaterial() {
        return new ItemMaterial(this.material);
    }

    public ItemEarth setFloorBefore(ItemFloor itemFloor) {
        w drawableInstances = getDrawableInstances();
        if (drawableInstances != null) {
            ((b) drawableInstances.f255098a[0]).l(itemFloor);
        }
        return this;
    }

    public void setMaterial(ItemMaterial itemMaterial) {
        if (itemMaterial != null) {
            this.material = new ItemMaterial(itemMaterial, this.material.name);
            w drawables = getDrawables();
            if (drawables != null) {
                ((b) drawables.f255098a[0]).m(this.material);
            }
        }
    }

    public ItemEarth(ItemEarth itemEarth, ProviderUid providerUid) {
        super(itemEarth, providerUid);
        this.material = new ItemMaterial("__earth__", -1);
    }
}
