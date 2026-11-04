package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.model.item.ItemEditableWall;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.services.utility.k1;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w<T extends ItemWalls> extends e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final z f180636a;

    public w(z zVar) {
        this.f180636a = zVar;
    }

    private ItemPoint h(JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        if (org.locationtech.jts.io.gml2.a.f338492j.equals(jSONObject.getString(com.planner5d.library.services.r.className.f224891a))) {
            return new ItemPoint(c(jSONObject, providerUid), k1.h(jSONObject, com.planner5d.library.services.r.x, 0.0f), k1.h(jSONObject, com.planner5d.library.services.r.y, 0.0f));
        }
        throw new JSONException("Invalid class name for wall");
    }

    private ItemWall i(JSONObject jSONObject, Map<String, ItemMaterial> map, ProviderUid providerUid) throws JSONException {
        ItemWall itemWall;
        if (!"Wall".equals(jSONObject.getString(com.planner5d.library.services.r.className.f224891a))) {
            throw new JSONException("Invalid class name for wall");
        }
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.items;
        if (!jSONObject.has(rVar.f224891a)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(rVar.f224891a);
        if (jSONObject.has(ItemEditableWall.WALL_INDEX)) {
            ItemEditableWall itemEditableWall = new ItemEditableWall(c(jSONObject, providerUid), h(jSONArray.getJSONObject(0), providerUid), h(jSONArray.getJSONObject(1), providerUid));
            itemEditableWall.setData(k1.n(jSONObject, ItemEditableWall.WALL_INDEX, -1), k1.n(jSONObject, ItemEditableWall.WALL_COLOR, -1));
            itemWall = itemEditableWall;
        } else {
            itemWall = new ItemWall(c(jSONObject, providerUid), h(jSONArray.getJSONObject(0), providerUid), h(jSONArray.getJSONObject(1), providerUid));
        }
        itemWall.setMaterials(f(jSONObject, map));
        itemWall.thickness = k1.h(jSONObject, com.planner5d.library.services.r.w, 10.0f);
        itemWall.hidden = k1.a(jSONObject, com.planner5d.library.services.r.hidden);
        return itemWall;
    }

    @Override // com.planner5d.library.model.converter.json.from.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T b(JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        throw new JSONException("Ground must have floor");
    }

    public T e(JSONObject jSONObject, ProviderUid providerUid, ItemFloor itemFloor) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        T t10 = (T) g(c(jSONObject, providerUid), j(jSONObject, providerUid), itemFloor, providerUid);
        if (t10.getWallsInfo().get().length < 1) {
            return null;
        }
        t10.setLayout(new ItemLayout().setPosition(k1.h(jSONObject, com.planner5d.library.services.r.x, 0.0f), k1.h(jSONObject, com.planner5d.library.services.r.y, 0.0f)));
        return t10;
    }

    protected Map<String, ItemMaterial> f(JSONObject jSONObject, Map<String, ItemMaterial> map) throws JSONException {
        return this.f180636a.b(jSONObject);
    }

    protected abstract T g(String str, ItemWall[] itemWallArr, ItemFloor itemFloor, ProviderUid providerUid);

    protected ItemWall[] j(JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.items;
        if (!jSONObject.has(rVar.f224891a)) {
            return new ItemWall[0];
        }
        JSONArray jSONArray = jSONObject.getJSONArray(rVar.f224891a);
        LinkedList linkedList = new LinkedList();
        Map<String, ItemMaterial> mapF = f(jSONObject, null);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            ItemWall itemWallI = i(jSONArray.getJSONObject(i10), mapF, providerUid);
            if (itemWallI != null) {
                linkedList.add(itemWallI);
            }
        }
        return (ItemWall[]) linkedList.toArray(new ItemWall[0]);
    }
}
