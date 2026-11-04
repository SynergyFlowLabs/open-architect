package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ProviderUid;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class h extends w<ItemGround> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f180598c = "ground_1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final x f180599b;

    @ij.a
    public h(z zVar, x xVar) {
        super(zVar);
        this.f180599b = xVar;
    }

    private ItemMaterial n(JSONObject jSONObject) throws JSONException {
        Map<String, ItemMaterial> mapB = this.f180636a.b(jSONObject);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.floor;
        return mapB.containsKey(rVar.f224891a) ? mapB.get(rVar.f224891a) : this.f180599b.c(jSONObject, 0, f180598c);
    }

    @Override // com.planner5d.library.model.converter.json.from.w
    protected Map<String, ItemMaterial> f(JSONObject jSONObject, Map<String, ItemMaterial> map) throws JSONException {
        JSONObject jSONObject2;
        ItemMaterial itemMaterialD;
        Map<String, ItemMaterial> mapB = this.f180636a.b(jSONObject);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.indoor;
        if (mapB.containsKey(rVar.f224891a)) {
            jSONObject2 = jSONObject;
        } else {
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.wtexture;
            if (jSONObject.has(rVar2.f224891a) || jSONObject.has(com.planner5d.library.services.r.wcolor.f224891a) || map == null || !map.containsKey(rVar.f224891a)) {
                jSONObject2 = jSONObject;
                itemMaterialD = this.f180599b.d(jSONObject2, 0, rVar2.f224891a, com.planner5d.library.services.r.wcolor.f224891a, ItemWall.DEFAULT_TEXTURE_WALL);
            } else {
                itemMaterialD = map.get(rVar.f224891a);
                jSONObject2 = jSONObject;
            }
            mapB.put(rVar.f224891a, itemMaterialD);
        }
        com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.outdoor;
        if (!mapB.containsKey(rVar3.f224891a)) {
            com.planner5d.library.services.r rVar4 = com.planner5d.library.services.r.otexture;
            mapB.put(rVar3.f224891a, (jSONObject2.has(rVar4.f224891a) || jSONObject2.has(com.planner5d.library.services.r.wocolor.f224891a) || map == null || !map.containsKey(rVar3.f224891a)) ? this.f180599b.d(jSONObject2, 0, rVar4.f224891a, com.planner5d.library.services.r.wocolor.f224891a, ItemWall.DEFAULT_TEXTURE_WALL_OUTSIDE) : map.get(rVar3.f224891a));
        }
        return mapB;
    }

    @Override // com.planner5d.library.model.converter.json.from.w
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ItemGround b(JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        throw new JSONException("Ground must have floor");
    }

    @Override // com.planner5d.library.model.converter.json.from.w
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ItemGround e(JSONObject jSONObject, ProviderUid providerUid, ItemFloor itemFloor) throws JSONException {
        ItemGround itemGround = (ItemGround) super.e(jSONObject, providerUid, itemFloor);
        if (itemGround != null) {
            itemGround.setMaterialFloor(n(jSONObject));
        }
        return itemGround;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.model.converter.json.from.w
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ItemGround g(String str, ItemWall[] itemWallArr, ItemFloor itemFloor, ProviderUid providerUid) {
        return new ItemGround(str, itemWallArr, itemFloor, providerUid);
    }
}
