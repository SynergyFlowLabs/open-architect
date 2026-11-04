package com.planner5d.library.model.converter.json.from;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.services.utility.k1;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class s extends w<ItemRoom> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f180628d = "laminate_1_2";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f180629e = "linen_1_4";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.i f180630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f180631c;

    @ij.a
    public s(z zVar, x xVar, com.planner5d.library.model.manager.builtin.i iVar) {
        super(zVar);
        this.f180631c = xVar;
        this.f180630b = iVar;
    }

    private Map<String, ItemMaterial> m(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        Map<String, ItemMaterial> mapB = this.f180636a.b(jSONObject);
        Map<String, ItemMaterial> mapF = f(jSONObject, null);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.floor;
        if (mapB.containsKey(rVar.f224891a)) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = jSONObject;
            mapB.put(rVar.f224891a, this.f180631c.d(jSONObject2, 0, com.planner5d.library.services.r.texture.f224891a, com.planner5d.library.services.r.fcolor.f224891a, f180628d));
        }
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.ceil;
        if (!mapB.containsKey(rVar2.f224891a)) {
            mapB.put(rVar2.f224891a, this.f180631c.d(jSONObject2, 0, com.planner5d.library.services.r.rtexture.f224891a, com.planner5d.library.services.r.rcolor.f224891a, f180629e));
        }
        String str = com.planner5d.library.services.r.indoor.f224891a;
        mapB.put(str, mapF.get(str));
        String str2 = com.planner5d.library.services.r.outdoor.f224891a;
        mapB.put(str2, mapF.get(str2));
        return mapB;
    }

    @Override // com.planner5d.library.model.converter.json.from.w
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ItemRoom b(JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        throw new JSONException("Cannot convert without floor");
    }

    @Override // com.planner5d.library.model.converter.json.from.w
    @m1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ItemRoom e(JSONObject jSONObject, ProviderUid providerUid, @NonNull ItemFloor itemFloor) throws JSONException {
        ItemRoom itemRoom = (ItemRoom) super.e(jSONObject, providerUid, itemFloor);
        if (itemRoom == null) {
            return null;
        }
        itemRoom.height = com.planner5d.library.model.converter.json.to.a.f(k1.h(jSONObject, com.planner5d.library.services.r.h, itemRoom.height), 270.0f);
        itemRoom.setWallsThickness(k1.h(jSONObject, com.planner5d.library.services.r.w, 10.0f));
        itemRoom.setMaterials(m(jSONObject));
        itemRoom.setFlooringHeight(k1.h(jSONObject, com.planner5d.library.services.r.fheight, 0.0f));
        itemRoom.setFloorHidden(k1.a(jSONObject, com.planner5d.library.services.r.fhidden));
        itemRoom.setCeilingHidden(k1.a(jSONObject, com.planner5d.library.services.r.rhidden));
        int iM = k1.m(jSONObject, com.planner5d.library.services.r.rtype, 13);
        itemRoom.setType(iM, this.f180630b.b0(iM));
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.title;
        if (jSONObject.has(rVar.f224891a)) {
            itemRoom.setTitle(jSONObject.getString(rVar.f224891a));
        }
        PointF pointF = new PointF(180.0f, 180.0f);
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.sX;
        if (jSONObject.has(rVar2.f224891a)) {
            com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.sY;
            if (jSONObject.has(rVar3.f224891a)) {
                pointF.set(k1.h(jSONObject, rVar2, 0.0f), k1.h(jSONObject, rVar3, 0.0f));
            }
        }
        itemRoom.setTitlePosition(pointF);
        return itemRoom;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.model.converter.json.from.w
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ItemRoom g(String str, ItemWall[] itemWallArr, ItemFloor itemFloor, ProviderUid providerUid) {
        return new ItemRoom(str, itemWallArr, itemFloor, providerUid);
    }
}
