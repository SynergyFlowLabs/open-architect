package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemOpenClose;
import com.planner5d.library.model.item.ItemWindow;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class h extends a<ItemNs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected z f180653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.builtin.i f180654b;

    @ij.a
    public h() {
    }

    @Override // com.planner5d.library.model.converter.json.to.a, ib.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public JSONObject convert(ItemNs itemNs) throws JSONException {
        throw new RuntimeException("You should not call this method");
    }

    public JSONObject h(ItemNs itemNs, boolean z10) throws JSONException {
        Object stored;
        Object attachedTo;
        JSONObject jSONObjectPut = d(itemNs).put("id", itemNs.getModelId());
        JSONArray jSONArrayConvert = this.f180653a.convert(itemNs.getMaterials());
        if (jSONArrayConvert.length() > 0) {
            jSONObjectPut.put("materials", jSONArrayConvert);
        }
        jSONObjectPut.put("aframe", itemNs.getClosed() ? 1 : 0);
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m();
        ItemLayout layout = itemNs.getLayout(new ItemLayout());
        jSONObjectPut.put(androidx.media3.exoplayer.upstream.h.f65998l, layout.getRotation(mVar).f180483b).put("x", layout.getPosition(mVar).f180482a).put("y", mVar.f180483b).put("z", mVar.f180484c).put("sX", layout.getScale(mVar).f180482a * 100.0f).put("sY", mVar.f180483b * 100.0f).put("sZ", mVar.f180484c * 100.0f);
        jSONObjectPut.put("fX", layout.isFlippedVertically() ? 1 : 0);
        jSONObjectPut.put("fY", layout.isFlippedHorizontally() ? 1 : 0);
        jSONObjectPut.put("otf", 1);
        if ((itemNs instanceof ItemWindow) && (attachedTo = itemNs.getAttachedTo()) != null) {
            jSONObjectPut.put("wall", attachedTo);
        }
        if (itemNs instanceof ItemOpenClose) {
            jSONObjectPut.put("isOpenClose", 1);
        }
        if (!z10 && (stored = itemNs.getStored()) != null) {
            jSONObjectPut.put("stored", stored);
        }
        return jSONObjectPut;
    }
}
