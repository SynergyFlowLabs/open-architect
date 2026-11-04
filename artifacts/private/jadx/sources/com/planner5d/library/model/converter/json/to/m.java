package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPr;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class m extends a<ItemPr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f180660a;

    @ij.a
    public m(z zVar) {
        this.f180660a = zVar;
    }

    @Override // com.planner5d.library.model.converter.json.to.a, ib.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public JSONObject convert(ItemPr itemPr) throws JSONException {
        JSONArray jSONArrayConvert = this.f180660a.convert(itemPr.getMaterials());
        if (jSONArrayConvert == null) {
            return null;
        }
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m();
        ItemLayout layout = itemPr.getLayout(new ItemLayout());
        return d(itemPr).put("aX", layout.getRotation(mVar).f180482a).put("aY", mVar.f180483b).put("aZ", mVar.f180484c).put("x", layout.getPosition(mVar).f180482a).put("y", mVar.f180483b).put("z", mVar.f180484c).put("sX", layout.getScale(mVar).f180482a * 100.0f).put("sY", mVar.f180483b * 100.0f).put("sZ", mVar.f180484c * 100.0f).put("materials", jSONArrayConvert).put("t", itemPr.type.name()).put("tm", itemPr.textureMapping);
    }
}
