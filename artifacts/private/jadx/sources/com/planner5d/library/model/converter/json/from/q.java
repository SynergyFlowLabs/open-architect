package com.planner5d.library.model.converter.json.from;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemProjectScreenshot;
import com.planner5d.library.model.item.ItemUnknown;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class q extends e<ItemProject> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f180617f = {com.planner5d.library.services.r.s.f224891a, com.planner5d.library.services.r.v.f224891a, com.planner5d.library.services.r.version.f224891a, com.planner5d.library.services.r.readOnly.f224891a, com.planner5d.library.services.r.contestCamera.f224891a, com.planner5d.library.services.r.contestCameraPosition.f224891a, com.planner5d.library.services.r.cover.f224891a};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p0 f180618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f180619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final x f180620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final ij.c<a> f180621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final b2 f180622e;

    @ij.a
    public q(p0 p0Var, f fVar, x xVar, ij.c<a> cVar, b2 b2Var) {
        this.f180618a = p0Var;
        this.f180619b = fVar;
        this.f180620c = xVar;
        this.f180621d = cVar;
        this.f180622e = b2Var;
    }

    private ItemFloor e(JSONObject jSONObject, ProviderUid providerUid, a aVar) throws JSONException {
        ItemFloor itemFloor = new ItemFloor(c(jSONObject, providerUid));
        itemFloor.title = k1.w(jSONObject, com.planner5d.library.services.r.itemName, com.planner5d.library.model.payments.a.f222474i);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.items;
        if (jSONObject.has(rVar.f224891a)) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(rVar.f224891a);
            boolean z10 = false;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Item itemD = this.f180619b.d(jSONArray.getJSONObject(i10), providerUid, itemFloor, aVar);
                if (itemD != null) {
                    arrayList.add(itemD);
                    if (itemD instanceof ItemUnknown) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                this.f180622e.b(com.planner5d.library.f.s.f168983ab, new Object[0]);
            }
            itemFloor.setItems(arrayList);
        }
        return itemFloor;
    }

    private List<ItemProjectScreenshot> g(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(f(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    private JSONObject h(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        for (String str : f180617f) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.get(str));
            }
        }
        return jSONObject2;
    }

    private vd.a i(JSONObject jSONObject) throws JSONException {
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.from;
        JSONArray jSONArray = jSONObject.has(rVar.f224891a) ? jSONObject.getJSONArray(rVar.f224891a) : new JSONArray();
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.to;
        JSONArray jSONArray2 = jSONObject.has(rVar2.f224891a) ? jSONObject.getJSONArray(rVar2.f224891a) : new JSONArray();
        if (jSONArray.length() != 3 || jSONArray2.length() != 3) {
            return null;
        }
        int i10 = 3 << 2;
        return new vd.a(new com.planner5d.library.math.m((float) jSONArray.getDouble(0), (float) jSONArray.getDouble(1), (float) jSONArray.getDouble(2)), new com.planner5d.library.math.m((float) jSONArray2.getDouble(0), (float) jSONArray2.getDouble(1), (float) jSONArray2.getDouble(2)), 50.0f);
    }

    @Override // com.planner5d.library.model.converter.json.from.e
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ItemProject b(JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        ItemMaterial itemMaterial;
        if (jSONObject != null) {
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.className;
            if (jSONObject.has(rVar.f224891a) && "Project".equals(jSONObject.getString(rVar.f224891a))) {
                ItemProject itemProject = new ItemProject(h(jSONObject));
                itemProject.setActiveFloor(k1.m(jSONObject, com.planner5d.library.services.r.currentFloor, 0));
                com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.contestCamera;
                itemProject.setContestCamera(jSONObject.has(rVar2.f224891a) ? i(jSONObject.getJSONObject(rVar2.f224891a)) : null);
                com.planner5d.library.math.k kVar = ItemEarth.DEFAULT_SIZE;
                int[] iArr = {(int) kVar.f180480a, (int) kVar.f180481b};
                com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.ground;
                if (jSONObject.has(rVar3.f224891a)) {
                    itemMaterial = this.f180620c.e(jSONObject.getJSONObject(rVar3.f224891a), com.planner5d.library.services.r.texture.f224891a, com.planner5d.library.services.r.color.f224891a, -1);
                    com.planner5d.library.services.r rVar4 = com.planner5d.library.services.r.width;
                    if (jSONObject.has(rVar4.f224891a)) {
                        iArr[0] = jSONObject.getInt(rVar4.f224891a);
                    }
                    com.planner5d.library.services.r rVar5 = com.planner5d.library.services.r.height;
                    if (jSONObject.has(rVar5.f224891a)) {
                        iArr[1] = jSONObject.getInt(rVar5.f224891a);
                    }
                } else {
                    itemMaterial = new ItemMaterial((String) null, -1, "bg_1_fill.png");
                }
                ItemEarth itemEarth = new ItemEarth(iArr[0], iArr[1]);
                itemEarth.setMaterial(itemMaterial);
                itemProject.setEarth(itemEarth);
                com.planner5d.library.services.r rVar6 = com.planner5d.library.services.r.items;
                if (jSONObject.has(rVar6.f224891a)) {
                    JSONArray jSONArray = jSONObject.getJSONArray(rVar6.f224891a);
                    a aVar = this.f180621d.get();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        itemProject.setFloor(e(jSONArray.getJSONObject(i10), providerUid, aVar), i10);
                    }
                }
                for (ItemFloor itemFloor : itemProject.getFloorArray()) {
                    if (itemFloor != null) {
                        itemProject.setScreenshots(g(jSONObject.optJSONArray(com.planner5d.library.services.r.ss.f224891a)));
                        return itemProject;
                    }
                }
                ItemFloor itemFloor2 = new ItemFloor(c(null, providerUid));
                itemFloor2.title = com.planner5d.library.model.payments.a.f222474i;
                itemProject.setFloor(itemFloor2, 0);
                itemProject.setActiveFloor(itemFloor2);
                itemProject.setScreenshots(g(jSONObject.optJSONArray(com.planner5d.library.services.r.ss.f224891a)));
                return itemProject;
            }
        }
        throw new JSONException("Invalid project");
    }

    public ItemProjectScreenshot f(JSONObject jSONObject) throws JSONException {
        int iN = k1.n(jSONObject, com.planner5d.library.services.r.id.f224891a, 0);
        String strX = k1.x(jSONObject, com.planner5d.library.services.r.url.f224891a, com.planner5d.library.model.payments.a.f222474i);
        Objects.requireNonNull(strX);
        return new ItemProjectScreenshot(iN, strX, k1.a(jSONObject, com.planner5d.library.services.r.is3d), k1.p(jSONObject, com.planner5d.library.services.r.taskId));
    }
}
