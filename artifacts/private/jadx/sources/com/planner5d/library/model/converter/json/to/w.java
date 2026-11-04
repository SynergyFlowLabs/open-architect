package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.services.utility.p0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class w implements ib.a<ItemMaterial, JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected p0 f180673a;

    @ij.a
    public w() {
    }

    @Override // ib.a
    @fj.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JSONObject convert(ItemMaterial itemMaterial) throws JSONException {
        return b(itemMaterial, "tcolor", null);
    }

    public JSONObject b(ItemMaterial itemMaterial, String str, JSONObject jSONObject) throws JSONException {
        Integer num;
        if (itemMaterial == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str2 = itemMaterial.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        com.planner5d.library.model.y yVar = itemMaterial.texture;
        if (yVar != null) {
            jSONObject.put("texture", yVar.f222851c);
            Float f10 = yVar.f222853e;
            if (f10 != null) {
                jSONObject.put("rotate", f10);
            }
            Float f11 = yVar.f222852d;
            if (f11 != null) {
                jSONObject.put("scale", f11);
            }
            if (yVar.f222854f.floatValue() != 0.0f || yVar.f222855g.floatValue() != 0.0f) {
                jSONObject.put("translate", new JSONObject().put("x", yVar.f222854f).put("y", yVar.f222855g));
            }
            com.planner5d.library.engine.rendering.util.i iVar = yVar.f222857i;
            if (iVar != null && iVar != com.planner5d.library.engine.rendering.util.i.RepeatXY) {
                jSONObject.put("repeat", iVar.name());
            }
            com.planner5d.library.engine.rendering.util.f fVar = yVar.f222858j;
            if (fVar != null && fVar != com.planner5d.library.engine.rendering.util.f.Center) {
                jSONObject.put("alignment", fVar.name());
            }
        }
        if (str != null && (num = itemMaterial.colorTexture) != null && num.intValue() != 0) {
            jSONObject.put(str, this.f180673a.d(itemMaterial.colorTexture.intValue()));
        }
        Integer num2 = itemMaterial.color;
        if (num2 != null && num2.intValue() != 0) {
            jSONObject.put("color", this.f180673a.d(itemMaterial.color.intValue()));
        }
        return jSONObject;
    }
}
