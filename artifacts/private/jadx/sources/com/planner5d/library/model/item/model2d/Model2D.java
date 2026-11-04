package com.planner5d.library.model.item.model2d;

import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemMaterialSets;

/* JADX INFO: loaded from: classes7.dex */
public class Model2D {
    public final int[] bounds;
    public final int[] boundsClosed;
    public final boolean doubleSided;
    public final int level;
    public final ItemMaterialSets materialSets;
    public final ItemMaterial[] materials;
    public final float overTheFloor;
    public final Model2DPart[] parts;
    public final int[] size2DHalf;

    public Model2D(Model2DPart[] model2DPartArr, int i10, ItemMaterial[] itemMaterialArr, ItemMaterialSets itemMaterialSets, float f10, boolean z10, int[] iArr, int[] iArr2, int[] iArr3) {
        this.overTheFloor = f10;
        this.materials = itemMaterialArr;
        this.materialSets = itemMaterialSets;
        this.level = i10;
        this.parts = model2DPartArr;
        this.bounds = iArr;
        this.boundsClosed = iArr2;
        this.doubleSided = z10;
        int[] iArr4 = new int[2];
        this.size2DHalf = iArr4;
        if (iArr3 == null) {
            iArr4[0] = iArr[0];
            iArr4[1] = iArr[1];
        } else {
            iArr4[0] = iArr3[0];
            iArr4[1] = iArr3[1];
        }
        iArr4[0] = (int) Math.ceil(iArr4[0] / 2.0f);
        iArr4[1] = (int) Math.ceil(iArr4[1] / 2.0f);
    }

    public Model2D(Model2D model2D, Model2DPart... model2DPartArr) {
        this.overTheFloor = model2D.overTheFloor;
        this.materials = model2D.materials;
        this.materialSets = model2D.materialSets;
        this.level = model2D.level;
        this.parts = model2DPartArr;
        this.bounds = model2D.bounds;
        this.boundsClosed = model2D.boundsClosed;
        this.doubleSided = model2D.doubleSided;
        this.size2DHalf = model2D.size2DHalf;
    }
}
