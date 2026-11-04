package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemPartition;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.services.utility.k1;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class m extends w<ItemPartition> {
    @ij.a
    public m(z zVar) {
        super(zVar);
    }

    private Map<String, ItemMaterial> l(JSONObject jSONObject) throws JSONException {
        Map<String, ItemMaterial> mapB = this.f180636a.b(jSONObject);
        Map<String, ItemMaterial> mapF = f(jSONObject, null);
        mapB.put(ItemWall.FIELD_MATERIAL_INDOOR, mapF.get(ItemWall.FIELD_MATERIAL_INDOOR));
        mapB.put(ItemWall.FIELD_MATERIAL_OUTDOOR, mapF.get(ItemWall.FIELD_MATERIAL_OUTDOOR));
        return mapB;
    }

    @Override // com.planner5d.library.model.converter.json.from.w
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ItemPartition e(JSONObject jSONObject, ProviderUid providerUid, ItemFloor itemFloor) throws JSONException {
        ItemPartition itemPartition = (ItemPartition) super.e(jSONObject, providerUid, itemFloor);
        if (itemPartition != null) {
            itemPartition.height = com.planner5d.library.model.converter.json.to.a.f(k1.h(jSONObject, com.planner5d.library.services.r.h, itemPartition.height), 270.0f);
            itemPartition.setWallsThickness(k1.h(jSONObject, com.planner5d.library.services.r.w, 10.0f));
            itemPartition.setMaterials(l(jSONObject));
        }
        return itemPartition;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.model.converter.json.from.w
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ItemPartition g(String str, ItemWall[] itemWallArr, ItemFloor itemFloor, ProviderUid providerUid) {
        return new ItemPartition(str, itemWallArr, itemFloor, providerUid);
    }
}
