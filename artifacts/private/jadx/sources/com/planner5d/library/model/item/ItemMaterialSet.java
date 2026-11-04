package com.planner5d.library.model.item;

/* JADX INFO: loaded from: classes7.dex */
public class ItemMaterialSet {
    public final String info;
    public final ItemMaterial[] materials;
    public final String price;
    public final String priceCurrency;
    public final String sku;
    public final String title;
    public final String url;
    private final String urlImage;

    public ItemMaterialSet(String str, String str2, String str3, String str4, String str5, String str6, String str7, ItemMaterial[] itemMaterialArr) {
        this.sku = str;
        this.url = str2;
        this.urlImage = str3;
        this.info = str4;
        this.title = str5;
        this.price = str6;
        this.priceCurrency = str7;
        this.materials = itemMaterialArr;
    }

    public String getInfo(ItemMaterialSet itemMaterialSet) {
        String str;
        String str2 = this.info;
        if (str2 != null && !str2.isEmpty()) {
            return this.info;
        }
        if (itemMaterialSet == null || (str = itemMaterialSet.info) == null || str.isEmpty()) {
            return null;
        }
        return itemMaterialSet.info;
    }

    public String getPrice(ItemMaterialSet itemMaterialSet) {
        String str;
        String str2 = this.price;
        if (str2 != null && !str2.isEmpty()) {
            return this.price;
        }
        if (itemMaterialSet == null || (str = itemMaterialSet.price) == null || str.isEmpty()) {
            return null;
        }
        return itemMaterialSet.price;
    }

    public String getPriceCurrency(ItemMaterialSet itemMaterialSet) {
        String str;
        String str2 = this.priceCurrency;
        if (str2 != null && !str2.isEmpty()) {
            return this.priceCurrency;
        }
        if (itemMaterialSet == null || (str = itemMaterialSet.priceCurrency) == null || str.isEmpty()) {
            return null;
        }
        return itemMaterialSet.priceCurrency;
    }

    public String getTitle(ItemMaterialSet itemMaterialSet) {
        String str;
        String str2 = this.title;
        if (str2 != null && !str2.isEmpty()) {
            return this.title;
        }
        if (itemMaterialSet != null && (str = itemMaterialSet.title) != null && !str.isEmpty()) {
            return itemMaterialSet.title;
        }
        return null;
    }

    public String getUrl(ItemMaterialSet itemMaterialSet) {
        String str = this.url;
        if (str != null) {
            return str;
        }
        if (itemMaterialSet == null) {
            return null;
        }
        return itemMaterialSet.url;
    }

    public String getUrlImage(ItemMaterialSet itemMaterialSet) {
        String str = this.urlImage;
        if (str != null) {
            return str;
        }
        if (itemMaterialSet == null) {
            return null;
        }
        return itemMaterialSet.urlImage;
    }

    public ItemMaterialSet(ItemMaterialSet itemMaterialSet) {
        this.sku = itemMaterialSet.sku;
        this.url = itemMaterialSet.url;
        this.urlImage = itemMaterialSet.urlImage;
        this.info = itemMaterialSet.info;
        this.title = itemMaterialSet.title;
        this.price = itemMaterialSet.price;
        this.priceCurrency = itemMaterialSet.priceCurrency;
        ItemMaterial[] itemMaterialArr = itemMaterialSet.materials;
        if (itemMaterialArr == null) {
            this.materials = null;
            return;
        }
        this.materials = new ItemMaterial[itemMaterialArr.length];
        int i10 = 0;
        while (true) {
            ItemMaterial[] itemMaterialArr2 = this.materials;
            if (i10 >= itemMaterialArr2.length) {
                return;
            }
            itemMaterialArr2[i10] = new ItemMaterial(itemMaterialSet.materials[i10]);
            i10++;
        }
    }
}
