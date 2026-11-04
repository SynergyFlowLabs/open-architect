package com.planner5d.library.model;

import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogItem f222432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ItemMaterialSet f222433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f222434c;

    public n(n nVar, int i10) {
        this.f222432a = nVar.f222432a;
        this.f222433b = nVar.f222433b;
        this.f222434c = i10;
    }

    public int a() {
        return this.f222434c;
    }

    public String b() {
        String str = this.f222432a.metadata.materialSets.getDefault().priceCurrency;
        return str != null ? str : "USD";
    }

    public String c() {
        return this.f222432a.f180761id;
    }

    public String d(p0 p0Var) {
        ItemMaterialSet itemMaterialSet = this.f222432a.metadata.materialSets.getDefault();
        String str = itemMaterialSet.price;
        if (str != null && itemMaterialSet.priceCurrency != null) {
            try {
                return p0Var.B(Float.parseFloat(str), itemMaterialSet.priceCurrency);
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public float e() {
        String str = this.f222432a.metadata.materialSets.getDefault().price;
        if (str != null) {
            try {
                return Float.parseFloat(str) * this.f222434c;
            } catch (NumberFormatException unused) {
            }
        }
        return 0.0f;
    }

    public String f(p0 p0Var) {
        return p0Var.B(e(), b());
    }

    public String g() {
        String str;
        ItemMaterialSet itemMaterialSet = this.f222433b;
        return (itemMaterialSet == null || (str = itemMaterialSet.sku) == null) ? this.f222432a.metadata.materialSets.getDefault().sku : str;
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f222432a.metadata.title;
        if (str != null && !str.isEmpty()) {
            sb2.append(this.f222432a.metadata.title);
        }
        ItemMaterialSet itemMaterialSet = this.f222433b;
        String title = itemMaterialSet != null ? itemMaterialSet.getTitle(this.f222432a.metadata.materialSets.getDefault()) : this.f222432a.metadata.materialSets.getDefault().getTitle(null);
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        if (title == null || title.isEmpty()) {
            title = g();
        }
        sb2.append(title);
        return sb2.toString();
    }

    public String i() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f222434c);
        sb2.append(" x ");
        sb2.append(h());
        if (this.f222432a.metadata.category == null) {
            str = "";
        } else {
            str = " (" + this.f222432a.metadata.category + ")";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public String j() {
        String str;
        ItemMaterialSet itemMaterialSet = this.f222433b;
        return (itemMaterialSet == null || (str = itemMaterialSet.url) == null) ? this.f222432a.metadata.materialSets.getDefault().url : str;
    }

    public n(CatalogItem catalogItem, ItemMaterialSet itemMaterialSet) {
        this.f222432a = catalogItem;
        this.f222433b = itemMaterialSet;
        this.f222434c = 0;
    }
}
