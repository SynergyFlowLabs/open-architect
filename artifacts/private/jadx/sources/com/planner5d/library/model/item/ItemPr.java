package com.planner5d.library.model.item;

import com.planner5d.library.math.k;
import com.planner5d.library.widget.editor.editor2d.drawable.m;
import com.planner5d.library.widget.editor.editor2d.drawable.w;

/* JADX INFO: loaded from: classes7.dex */
public class ItemPr extends Item {
    private ItemMaterial[] materials;
    public int textureMapping;
    public Type type;

    public enum Type {
        box
    }

    public ItemPr(String str) {
        super(str);
        this.type = Type.box;
        this.textureMapping = 100;
        this.materials = null;
    }

    @Override // com.planner5d.library.model.item.Item
    protected w createDrawables() {
        ItemMaterial[] itemMaterialArr = this.materials;
        if (itemMaterialArr == null || itemMaterialArr.length == 0) {
            return null;
        }
        return w.g(new m(itemMaterialArr[0]));
    }

    @Override // com.planner5d.library.model.item.Item
    public ItemMaterial[] getMaterials() {
        return this.materials;
    }

    @Override // com.planner5d.library.model.item.Item
    public k getSize(k kVar, boolean z10) {
        return super.getSize(kVar, z10).S(100.0f, 100.0f);
    }

    public void setMaterial(ItemMaterial itemMaterial) {
        if (this.materials == null) {
            return;
        }
        int i10 = 0;
        if ("all".equals(itemMaterial.name)) {
            while (true) {
                ItemMaterial[] itemMaterialArr = this.materials;
                if (i10 >= itemMaterialArr.length) {
                    break;
                }
                itemMaterialArr[i10] = new ItemMaterial(itemMaterial, itemMaterialArr[i10].name);
                i10++;
            }
        } else {
            while (true) {
                ItemMaterial[] itemMaterialArr2 = this.materials;
                if (i10 >= itemMaterialArr2.length) {
                    break;
                }
                if (itemMaterialArr2[i10].name.equals(itemMaterial.name)) {
                    ItemMaterial[] itemMaterialArr3 = this.materials;
                    itemMaterialArr3[i10] = new ItemMaterial(itemMaterial, itemMaterialArr3[i10].name);
                    break;
                }
                i10++;
            }
        }
        setMaterials(this.materials);
    }

    public void setMaterials(ItemMaterial[] itemMaterialArr) {
        this.materials = itemMaterialArr;
        w drawables = getDrawables();
        if (drawables != null && itemMaterialArr.length > 0) {
            ((m) drawables.f255098a[0]).h(this.materials[0]);
        }
    }

    public ItemPr(ItemPr itemPr, ProviderUid providerUid) {
        super(itemPr, providerUid);
        this.type = Type.box;
        this.textureMapping = 100;
        this.materials = null;
        setMaterials(ItemMaterial.clone(itemPr.getMaterials()));
    }
}
