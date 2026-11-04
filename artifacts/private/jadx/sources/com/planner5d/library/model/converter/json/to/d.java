package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.model.item.ItemGround;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class d extends v<ItemGround> {
    @ij.a
    public d(z zVar) {
        super(zVar);
    }

    @Override // com.planner5d.library.model.converter.json.to.v
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public JSONObject convert(ItemGround itemGround) throws JSONException {
        return this.f180672a.b(itemGround.getMaterialMap(), super.convert(itemGround));
    }
}
