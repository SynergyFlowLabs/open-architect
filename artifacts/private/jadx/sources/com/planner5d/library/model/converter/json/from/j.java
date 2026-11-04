package com.planner5d.library.model.converter.json.from;

import androidx.annotation.m1;
import androidx.annotation.p0;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemLight;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemOpenClose;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.model.item.model2d.Model2D;
import com.planner5d.library.services.utility.k1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class j extends e<ItemNs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected z f180602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.builtin.i f180603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.userimporteddata.n f180604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.application.d f180605d;

    @ij.a
    public j() {
    }

    @m1
    private boolean d(@p0 String str) {
        return this.f180605d.e() || this.f180604c.b(str) || this.f180603b.r0(str);
    }

    @Override // com.planner5d.library.model.converter.json.from.e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ItemNs b(JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        throw new RuntimeException("Should not be called");
    }

    @m1
    public ItemNs f(JSONObject jSONObject, ProviderUid providerUid, a aVar) throws JSONException {
        Model2D model2DA;
        ItemNs itemWindow;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString(com.planner5d.library.services.r.id.f224891a);
        if (!d(string) || (model2DA = aVar.a(string)) == null) {
            return null;
        }
        String string2 = jSONObject.getString(com.planner5d.library.services.r.className.f224891a);
        String strC = c(jSONObject, providerUid);
        string2.getClass();
        switch (string2) {
            case "Window":
                itemWindow = new ItemWindow(strC, string, model2DA);
                break;
            case "OpenClose":
                itemWindow = new ItemOpenClose(strC, string, model2DA);
                break;
            case "Ns":
                if (!k1.a(jSONObject, com.planner5d.library.services.r.isOpenClose)) {
                    itemWindow = new ItemNs(strC, string, model2DA);
                    break;
                } else {
                    itemWindow = new ItemOpenClose(strC, string, model2DA);
                    break;
                }
                break;
            case "Door":
                itemWindow = new ItemDoor(strC, string, model2DA);
                break;
            case "Light":
                itemWindow = new ItemLight(strC, string, model2DA);
                break;
            default:
                return null;
        }
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.stored;
        if (jSONObject.has(rVar.f224891a)) {
            itemWindow.setStored(jSONObject.getJSONObject(rVar.f224891a));
        }
        if (itemWindow instanceof ItemWindow) {
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.wall;
            if (jSONObject.has(rVar2.f224891a)) {
                itemWindow.setAttachedTo(jSONObject.getString(rVar2.f224891a));
            }
        }
        itemWindow.setClosed(k1.a(jSONObject, com.planner5d.library.services.r.aframe));
        if (jSONObject.has(com.planner5d.library.services.r.materials.f224891a)) {
            itemWindow.setMaterials(this.f180602a.convert(jSONObject), this.f180603b);
        }
        itemWindow.setLayout(new ItemLayout().setRotation(0.0f, k1.h(jSONObject, com.planner5d.library.services.r.a, 0.0f), 0.0f).setPosition(k1.h(jSONObject, com.planner5d.library.services.r.x, 0.0f), k1.h(jSONObject, com.planner5d.library.services.r.y, 0.0f), k1.h(jSONObject, com.planner5d.library.services.r.z, 0.0f)).setScale(k1.h(jSONObject, com.planner5d.library.services.r.sX, 1.0f) / 100.0f, k1.h(jSONObject, com.planner5d.library.services.r.sY, 1.0f) / 100.0f, k1.h(jSONObject, com.planner5d.library.services.r.sZ, 1.0f) / 100.0f).setFlip(k1.a(jSONObject, com.planner5d.library.services.r.fY), k1.a(jSONObject, com.planner5d.library.services.r.fX)));
        return itemWindow;
    }
}
