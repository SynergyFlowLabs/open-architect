package com.planner5d.library.model.item;

import android.graphics.PointF;
import com.planner5d.library.math.k;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.widget.editor.editor2d.drawable.g;
import com.planner5d.library.widget.editor.editor2d.drawable.w;

/* JADX INFO: loaded from: classes7.dex */
public class ItemGrid extends Item {
    private static final ItemMaterial MATERIAL = new ItemMaterial("__grid__", k5.f191814r);
    private final k size;

    public ItemGrid(ItemGrid itemGrid) {
        this(itemGrid.getSize());
    }

    @Override // com.planner5d.library.model.item.Item
    protected w createDrawables() {
        return w.g(new g());
    }

    public ItemMaterial getMaterial() {
        return MATERIAL;
    }

    @Override // com.planner5d.library.model.item.Item
    public ItemMaterial[] getMaterials() {
        return new ItemMaterial[]{getMaterial()};
    }

    public k getSize(k kVar) {
        kVar.V(this.size);
        return kVar;
    }

    public ItemGrid(float f10, float f11) {
        super(null);
        this.size = new k(f10, f11);
    }

    public PointF getSize() {
        k kVar = this.size;
        return new PointF(kVar.f180480a, kVar.f180481b);
    }

    public ItemGrid(ItemGrid itemGrid, ProviderUid providerUid) {
        this(itemGrid.getSize());
    }

    private ItemGrid(PointF pointF) {
        this(pointF.x, pointF.y);
    }
}
