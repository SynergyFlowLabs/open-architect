package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemMaterialSets;
import com.planner5d.library.model.item.catalog.CatalogItemMetadata;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class c implements ib.a<JSONObject, CatalogItemMetadata> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f180576a;

    @ij.a
    public c(p0 p0Var) {
        this.f180576a = p0Var;
    }

    private ItemMaterialSet b(JSONObject jSONObject, ItemMaterialSet itemMaterialSet) throws JSONException {
        ItemMaterial[] itemMaterialArr;
        ItemMaterial itemMaterial;
        ItemMaterial[] itemMaterialArr2;
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.materials;
        if (!jSONObject.has(rVar.f224891a) || jSONObject.isNull(rVar.f224891a)) {
            itemMaterialArr = null;
        } else {
            String[] strArrD = d(jSONObject.getJSONArray(rVar.f224891a));
            ItemMaterial[] itemMaterialArr3 = new ItemMaterial[strArrD.length];
            int i10 = 0;
            while (i10 < strArrD.length) {
                String str = strArrD[i10];
                if (str == null) {
                    itemMaterial = (itemMaterialSet == null || (itemMaterialArr2 = itemMaterialSet.materials) == null || i10 >= itemMaterialArr2.length) ? null : itemMaterialArr2[i10];
                } else {
                    itemMaterial = str.startsWith("#") ? new ItemMaterial(null, Integer.valueOf(this.f180576a.c(str, 1.0d)), null, null, i10, true) : new ItemMaterial(null, null, null, k5.B().q(str), i10);
                }
                itemMaterialArr3[i10] = itemMaterial;
                i10++;
            }
            itemMaterialArr = itemMaterialArr3;
        }
        return new ItemMaterialSet(jSONObject.getString(com.planner5d.library.services.r.sku.f224891a), k1.w(jSONObject, com.planner5d.library.services.r.url, null), k1.w(jSONObject, com.planner5d.library.services.r.image, null), k1.w(jSONObject, com.planner5d.library.services.r.info, null), k1.w(jSONObject, com.planner5d.library.services.r.titleSku, null), k1.w(jSONObject, com.planner5d.library.services.r.price, null), k1.w(jSONObject, com.planner5d.library.services.r.priceCurrency, null), itemMaterialArr);
    }

    private ItemMaterialSets c(JSONObject jSONObject) throws JSONException {
        ItemMaterialSet[] itemMaterialSetArr = null;
        ItemMaterialSet itemMaterialSetB = b(jSONObject, null);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.list;
        if (jSONObject.has(rVar.f224891a)) {
            JSONArray jSONArray = jSONObject.getJSONArray(rVar.f224891a);
            int length = jSONArray.length();
            ItemMaterialSet[] itemMaterialSetArr2 = new ItemMaterialSet[length];
            for (int i10 = 0; i10 < length; i10++) {
                itemMaterialSetArr2[i10] = b(jSONArray.getJSONObject(i10), itemMaterialSetB);
            }
            itemMaterialSetArr = itemMaterialSetArr2;
        }
        return new ItemMaterialSets(itemMaterialSetArr, itemMaterialSetB);
    }

    private String[] d(JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = (jSONArray.isNull(i10) || com.facebook.appevents.p.f99189d0.equals(jSONArray.getString(i10))) ? null : jSONArray.getString(i10);
        }
        return strArr;
    }

    @Override // ib.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CatalogItemMetadata convert(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.articles;
                if (jSONObject.has(rVar.f224891a) && (jSONObject.get(rVar.f224891a) instanceof JSONObject)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(rVar.f224891a);
                    return new CatalogItemMetadata(k1.w(jSONObject2, com.planner5d.library.services.r.title, null), k1.w(jSONObject2, com.planner5d.library.services.r.category, null), c(jSONObject2));
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
