package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class z implements ib.a<JSONObject, ItemMaterial[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected x f180639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected p0 f180640b;

    @ij.a
    public z() {
    }

    private void c(JSONObject jSONObject, Map<String, ItemMaterial> map, String str) throws JSONException {
        Integer numF = x.f(jSONObject, com.planner5d.library.services.r.color.f224891a, this.f180640b);
        map.put(str, new ItemMaterial(str, numF, numF, x.h(jSONObject, com.planner5d.library.services.r.texture.f224891a, null), 0));
    }

    @Override // ib.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ItemMaterial[] convert(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(com.planner5d.library.services.r.materials.f224891a);
        ItemMaterial[] itemMaterialArr = new ItemMaterial[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            itemMaterialArr[i10] = this.f180639a.b(jSONArray.getJSONObject(i10), i10);
        }
        return itemMaterialArr;
    }

    public Map<String, ItemMaterial> b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        String strW;
        HashMap map = new HashMap();
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.materials;
        if (jSONObject.has(rVar.f224891a)) {
            Object obj = jSONObject.get(rVar.f224891a);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) obj;
                Iterator<String> itKeys = jSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj2 = jSONObject3.get(next);
                    if (obj2 instanceof JSONObject) {
                        c((JSONObject) obj2, map, next);
                    }
                }
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    Object obj3 = jSONArray.get(i10);
                    if ((obj3 instanceof JSONObject) && (strW = k1.w((jSONObject2 = (JSONObject) obj3), com.planner5d.library.services.r.itemMaterialName, null)) != null) {
                        c(jSONObject2, map, strW);
                    }
                }
            }
        }
        return map;
    }
}
