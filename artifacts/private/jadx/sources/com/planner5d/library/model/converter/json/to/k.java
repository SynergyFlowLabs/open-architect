package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.model.item.ItemPartition;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class k extends v<ItemPartition> {
    @ij.a
    public k(z zVar) {
        super(zVar);
    }

    @Override // com.planner5d.library.model.converter.json.to.v
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public JSONObject convert(ItemPartition itemPartition) throws JSONException {
        return this.f180672a.b(k(itemPartition), super.convert(itemPartition).put(androidx.media3.exoplayer.upstream.h.f65993g, a.e(itemPartition.height, 270.0d)).put("w", a.e(itemPartition.getWallsThickness(), 10.0d)));
    }
}
