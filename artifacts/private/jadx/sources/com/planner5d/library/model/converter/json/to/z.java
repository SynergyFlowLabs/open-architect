package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.model.item.ItemMaterial;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class z implements ib.a<ItemMaterial[], JSONArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected w f180676a;

    @ij.a
    public z() {
    }

    @Override // ib.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JSONArray convert(ItemMaterial[] itemMaterialArr) throws JSONException {
        if (itemMaterialArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (ItemMaterial itemMaterial : itemMaterialArr) {
            jSONArray.put(this.f180676a.convert(itemMaterial));
        }
        return jSONArray;
    }

    public JSONObject b(Map<String, ItemMaterial> map, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = null;
        for (String str : map.keySet()) {
            ItemMaterial itemMaterial = map.get(str);
            if (itemMaterial != null) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject2.put(str, this.f180676a.b(itemMaterial, null, null));
            }
        }
        if (jSONObject2 != null) {
            jSONObject.put("materials", jSONObject2);
        }
        return jSONObject;
    }
}
