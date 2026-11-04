package com.planner5d.library.model.item.catalog;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemMaterialSets;

/* JADX INFO: loaded from: classes7.dex */
public class CatalogItemMetadata {
    public final String category;
    public final ItemMaterialSets materialSets;
    public final String title;

    public CatalogItemMetadata(String str, String str2, @NonNull ItemMaterialSets itemMaterialSets) {
        int i10 = 3 ^ 0;
        this.title = (str == null || str.isEmpty()) ? null : str;
        this.category = (str2 == null || str2.isEmpty()) ? null : str2;
        this.materialSets = itemMaterialSets;
    }
}
