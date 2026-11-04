package com.planner5d.library.model.item;

/* JADX INFO: loaded from: classes7.dex */
public class ItemMaterialSets {
    private final ItemMaterialSet defaultSet;
    private final ItemMaterialSet[] list;

    public ItemMaterialSets(ItemMaterialSet[] itemMaterialSetArr, ItemMaterialSet itemMaterialSet) {
        if (itemMaterialSetArr == null && itemMaterialSet.materials == null) {
            this.list = null;
        } else {
            ItemMaterialSet[] itemMaterialSetArr2 = new ItemMaterialSet[(itemMaterialSetArr == null ? 0 : itemMaterialSetArr.length) + 1];
            this.list = itemMaterialSetArr2;
            itemMaterialSetArr2[0] = itemMaterialSet;
            if (itemMaterialSetArr != null) {
                System.arraycopy(itemMaterialSetArr, 0, itemMaterialSetArr2, 1, itemMaterialSetArr.length);
            }
        }
        this.defaultSet = itemMaterialSet;
    }

    public ItemMaterialSet[] get() {
        return this.list;
    }

    public ItemMaterialSet getDefault() {
        return this.defaultSet;
    }

    public ItemMaterialSet get(String str) {
        ItemMaterialSet[] itemMaterialSetArr = this.list;
        if (itemMaterialSetArr != null && str != null) {
            for (ItemMaterialSet itemMaterialSet : itemMaterialSetArr) {
                if (str.equals(itemMaterialSet.sku)) {
                    return itemMaterialSet;
                }
            }
        }
        return null;
    }
}
