package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.services.utility.k1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class o extends e<ItemPr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f180615a;

    @ij.a
    public o(z zVar) {
        this.f180615a = zVar;
    }

    @Override // com.planner5d.library.model.converter.json.from.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ItemPr b(JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        ItemMaterial[] itemMaterialArrConvert = this.f180615a.convert(jSONObject);
        if (itemMaterialArrConvert.length == 0) {
            return null;
        }
        ItemPr itemPr = new ItemPr(c(jSONObject, providerUid));
        itemPr.setMaterials(itemMaterialArrConvert);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.tm;
        if (jSONObject.has(rVar.f224891a)) {
            itemPr.textureMapping = jSONObject.getInt(rVar.f224891a);
        }
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.t;
        if (jSONObject.has(rVar2.f224891a) && !ItemPr.Type.box.name().equals(jSONObject.getString(rVar2.f224891a))) {
            throw new JSONException("Unsupported primitive type: " + jSONObject.getString(rVar2.f224891a));
        }
        itemPr.setLayout(new ItemLayout().setRotation(k1.h(jSONObject, com.planner5d.library.services.r.aX, 0.0f), k1.h(jSONObject, com.planner5d.library.services.r.aY, 0.0f), k1.h(jSONObject, com.planner5d.library.services.r.aZ, 0.0f)).setPosition(k1.h(jSONObject, com.planner5d.library.services.r.x, 0.0f), k1.h(jSONObject, com.planner5d.library.services.r.y, 0.0f), k1.h(jSONObject, com.planner5d.library.services.r.z, 0.0f)).setScale(k1.h(jSONObject, com.planner5d.library.services.r.sX, 0.0f) / 100.0f, k1.h(jSONObject, com.planner5d.library.services.r.sY, 0.0f) / 100.0f, k1.h(jSONObject, com.planner5d.library.services.r.sZ, 100.0f) / 100.0f));
        return itemPr;
    }
}
