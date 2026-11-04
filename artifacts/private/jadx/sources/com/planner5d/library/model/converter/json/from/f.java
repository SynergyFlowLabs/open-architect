package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ProviderUid;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class f extends e<Item> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, e<?>> f180584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f180585b;

    @ij.a
    public f(o oVar, h hVar, s sVar, m mVar, j jVar, u uVar) {
        HashMap<String, e<?>> map = new HashMap<>();
        this.f180584a = map;
        map.put("Door", jVar);
        map.put("Window", jVar);
        map.put("OpenClose", jVar);
        map.put("Light", jVar);
        map.put("Ns", jVar);
        map.put("Ground", hVar);
        map.put("Room", sVar);
        map.put("Partition", mVar);
        map.put("Pr", oVar);
        this.f180585b = uVar;
    }

    private Item e(JSONObject jSONObject, ProviderUid providerUid, ItemFloor itemFloor, a aVar) throws JSONException {
        if (jSONObject != null) {
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.className;
            if (jSONObject.has(rVar.f224891a)) {
                e<?> eVar = this.f180584a.get(jSONObject.getString(rVar.f224891a));
                if (eVar == null) {
                    return null;
                }
                if (eVar instanceof m) {
                    return ((m) eVar).e(jSONObject, providerUid, itemFloor);
                }
                if (eVar instanceof s) {
                    return ((s) eVar).e(jSONObject, providerUid, itemFloor);
                }
                if (eVar instanceof h) {
                    return ((h) eVar).e(jSONObject, providerUid, itemFloor);
                }
                return eVar instanceof j ? ((j) eVar).f(jSONObject, providerUid, aVar) : eVar.b(jSONObject, providerUid);
            }
        }
        return null;
    }

    @Override // com.planner5d.library.model.converter.json.from.e
    public Item b(JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        throw new JSONException("Cannot convert without floor");
    }

    public Item d(JSONObject jSONObject, ProviderUid providerUid, ItemFloor itemFloor, a aVar) throws JSONException {
        Item itemE = e(jSONObject, providerUid, itemFloor, aVar);
        return itemE == null ? this.f180585b.b(jSONObject, providerUid) : itemE;
    }
}
