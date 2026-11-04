package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.model.item.ItemEditableWall;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class v<T extends ItemWalls> extends a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected z f180672a;

    public v(z zVar) {
        this.f180672a = zVar;
    }

    private JSONObject h(ItemPoint itemPoint) throws JSONException {
        JSONObject jSONObjectD = d(itemPoint);
        jSONObjectD.put("x", itemPoint.getPoint().f180480a);
        jSONObjectD.put("y", itemPoint.getPoint().f180481b);
        return jSONObjectD;
    }

    private JSONObject i(ItemWall itemWall) throws JSONException {
        JSONObject jSONObjectD = d(itemWall);
        if (itemWall instanceof ItemEditableWall) {
            jSONObjectD.put("className", "Wall");
            ItemEditableWall itemEditableWall = (ItemEditableWall) itemWall;
            jSONObjectD.put(ItemEditableWall.WALL_INDEX, itemEditableWall.getWallIndex());
            jSONObjectD.put(ItemEditableWall.WALL_COLOR, itemEditableWall.getWallColor());
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(h(itemWall.getPoints()[0]));
        jSONArray.put(h(itemWall.getPoints()[1]));
        jSONObjectD.put("w", itemWall.thickness);
        jSONObjectD.put("hidden", itemWall.hidden);
        jSONObjectD.put("items", jSONArray);
        return this.f180672a.b(itemWall.getMaterialMap(), jSONObjectD);
    }

    private JSONArray j(ItemWall[] itemWallArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (ItemWall itemWall : itemWallArr) {
            jSONArray.put(i(itemWall));
        }
        return jSONArray;
    }

    @Override // com.planner5d.library.model.converter.json.to.a, ib.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public JSONObject convert(T t10) throws JSONException {
        com.planner5d.library.math.m position = t10.getLayout(new ItemLayout()).getPosition(new com.planner5d.library.math.m());
        return d(t10).put("x", position.f180482a).put("y", position.f180483b).put("items", j(t10.getChildren()));
    }

    protected Map<String, ItemMaterial> k(ItemWalls itemWalls) {
        HashMap map = new HashMap();
        map.put(ItemWall.FIELD_MATERIAL_INDOOR, itemWalls.getMaterialWall(true));
        map.put(ItemWall.FIELD_MATERIAL_OUTDOOR, itemWalls.getMaterialWall(false));
        return map;
    }
}
