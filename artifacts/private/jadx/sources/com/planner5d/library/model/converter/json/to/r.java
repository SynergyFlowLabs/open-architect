package com.planner5d.library.model.converter.json.to;

import android.graphics.PointF;
import com.planner5d.library.model.item.ItemRoom;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class r extends v<ItemRoom> {
    @ij.a
    public r(z zVar) {
        super(zVar);
    }

    @Override // com.planner5d.library.model.converter.json.to.v
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public JSONObject convert(ItemRoom itemRoom) throws JSONException {
        if (itemRoom.isCollapsed()) {
            return null;
        }
        JSONObject jSONObjectConvert = super.convert(itemRoom);
        PointF titlePosition = itemRoom.getTitlePosition(new PointF());
        jSONObjectConvert.put("sX", a.e(titlePosition.x, 0.0d)).put("sY", a.e(titlePosition.y, 0.0d)).put(androidx.media3.exoplayer.upstream.h.f65993g, a.e(itemRoom.height, 270.0d)).put("w", a.e(itemRoom.getWallsThickness(), 10.0d)).put("fheight", itemRoom.getFlooringHeight());
        if (itemRoom.getFloorHidden()) {
            jSONObjectConvert.put("fhidden", true);
        }
        if (itemRoom.getCeilingHidden()) {
            jSONObjectConvert.put("rhidden", true);
        }
        jSONObjectConvert.put("rtype", itemRoom.getType());
        String title = itemRoom.getTitle();
        if (title != null) {
            jSONObjectConvert.put("title", title);
        }
        return this.f180672a.b(itemRoom.getMaterialMap(), jSONObjectConvert);
    }
}
