package com.planner5d.library.model.converter.json.to;

import android.util.Pair;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemProjectScreenshot;
import com.planner5d.library.services.utility.p0;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class o extends a<ItemProject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected p0 f180662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected b f180663b;

    @ij.a
    public o() {
    }

    private JSONObject i(ItemProject itemProject, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = itemProject.externalData;
        JSONArray jSONArrayNames = jSONObject2.names();
        if (jSONArrayNames != null) {
            for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
                String string = jSONArrayNames.getString(i10);
                jSONObject.put(string, jSONObject2.get(string));
            }
        }
        return jSONObject;
    }

    private JSONObject j(ItemFloor itemFloor, boolean z10) throws JSONException {
        JSONObject jSONObjectD = d(itemFloor);
        jSONObjectD.put("name", itemFloor.title);
        jSONObjectD.put(androidx.media3.exoplayer.upstream.h.f65993g, itemFloor.getHeight());
        Item[] children = itemFloor.getChildren();
        if (children != null && children.length > 0) {
            JSONArray jSONArray = new JSONArray();
            for (Item item : children) {
                JSONObject jSONObjectG = this.f180663b.g(item, z10);
                if (jSONObjectG != null) {
                    jSONArray.put(jSONObjectG);
                }
            }
            b(jSONObjectD, "items", jSONArray);
        }
        return jSONObjectD;
    }

    private JSONArray k(List<Pair<Integer, ItemFloor>> list, boolean z10) throws JSONException {
        JSONObject jSONObjectJ;
        JSONArray jSONArray = new JSONArray();
        Iterator<Pair<Integer, ItemFloor>> it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next().second;
            if (obj != null && (jSONObjectJ = j((ItemFloor) obj, z10)) != null) {
                jSONArray.put(jSONObjectJ);
            }
        }
        return jSONArray;
    }

    private JSONObject l(ItemEarth itemEarth, JSONObject jSONObject) throws JSONException {
        String str;
        if (itemEarth == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        ItemMaterial material = itemEarth.getMaterial();
        if (material != null) {
            com.planner5d.library.model.y yVar = material.texture;
            if (yVar != null && (str = yVar.f222851c) != null) {
                jSONObject2.put("texture", str);
            }
            Integer num = material.color;
            if (num != null) {
                jSONObject2.put("color", this.f180662a.d(num.intValue()));
            }
        }
        jSONObject.put("width", (int) itemEarth.getSize().x).put("height", (int) itemEarth.getSize().y);
        return jSONObject2;
    }

    private JSONObject m(ItemProjectScreenshot itemProjectScreenshot) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.planner5d.library.services.r.id.f224891a, itemProjectScreenshot.getId());
        jSONObject.put(com.planner5d.library.services.r.url.f224891a, itemProjectScreenshot.getUrl());
        jSONObject.put(com.planner5d.library.services.r.is3d.f224891a, itemProjectScreenshot.getFrom3d());
        jSONObject.put(com.planner5d.library.services.r.taskId.f224891a, itemProjectScreenshot.getTaskId());
        return jSONObject;
    }

    private JSONArray n(ItemProject itemProject) throws JSONException {
        List<ItemProjectScreenshot> screenshots = itemProject.getScreenshots();
        JSONArray jSONArray = new JSONArray();
        Iterator<ItemProjectScreenshot> it = screenshots.iterator();
        while (it.hasNext()) {
            jSONArray.put(m(it.next()));
        }
        return jSONArray;
    }

    @Override // com.planner5d.library.model.converter.json.to.a, ib.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public JSONObject convert(ItemProject itemProject) throws JSONException {
        throw new RuntimeException("You should not call this method");
    }

    public JSONObject h(ItemProject itemProject, boolean z10) throws JSONException {
        JSONObject jSONObjectI = i(itemProject, d(itemProject));
        if (jSONObjectI.has("puid")) {
            jSONObjectI.remove("puid");
        }
        if (!jSONObjectI.has("v")) {
            jSONObjectI.put("v", 1);
        }
        jSONObjectI.put("autoinc", itemProject.getNextFreeUidNumber());
        a(jSONObjectI, "ground", l(itemProject.getEarth(), jSONObjectI));
        b(jSONObjectI, "items", k(itemProject.getFloors(z10), z10));
        b(jSONObjectI, com.planner5d.library.services.r.ss.f224891a, n(itemProject));
        jSONObjectI.put(com.planner5d.library.services.r.sscounter.f224891a, itemProject.getScreenshots().size() + 1);
        return jSONObjectI.put("currentFloor", itemProject.getActiveFloorNumber());
    }
}
