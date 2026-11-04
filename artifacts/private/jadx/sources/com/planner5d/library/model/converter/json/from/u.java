package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemUnknown;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.services.utility.k1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class u extends e<ItemUnknown> {
    @ij.a
    public u() {
    }

    @Override // com.planner5d.library.model.converter.json.from.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ItemUnknown b(JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        ItemUnknown itemUnknown = new ItemUnknown(c(jSONObject, providerUid), jSONObject);
        ItemLayout itemLayout = new ItemLayout();
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.aY;
        if (!jSONObject.has(rVar.f224891a)) {
            rVar = com.planner5d.library.services.r.a;
        }
        itemUnknown.setLayout(itemLayout.setRotation(0.0f, k1.h(jSONObject, rVar, 0.0f), 0.0f).setPosition(k1.h(jSONObject, com.planner5d.library.services.r.x, 0.0f), k1.h(jSONObject, com.planner5d.library.services.r.y, 0.0f), k1.h(jSONObject, com.planner5d.library.services.r.z, 0.0f)));
        return itemUnknown;
    }
}
