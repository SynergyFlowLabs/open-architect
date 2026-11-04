package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class x implements ib.a<JSONObject, ItemMaterial> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f180637a;

    @ij.a
    public x(p0 p0Var) {
        this.f180637a = p0Var;
    }

    @fj.h
    static Integer f(JSONObject jSONObject, String str, p0 p0Var) throws JSONException {
        return g(jSONObject, str, p0Var, null);
    }

    @fj.h
    static Integer g(JSONObject jSONObject, String str, p0 p0Var, @fj.h Integer num) throws JSONException {
        return (str == null || !jSONObject.has(str)) ? num : Integer.valueOf(p0Var.c(jSONObject.getString(str), 1.0d));
    }

    static com.planner5d.library.model.y h(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (jSONObject.has(str)) {
            str2 = jSONObject.getString(str);
        }
        if (str2 == null || str2.isEmpty()) {
            return null;
        }
        com.planner5d.library.model.y yVarQ = k5.B().q(str2);
        if (yVarQ != null) {
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.translate;
            JSONObject jSONObject2 = jSONObject.has(rVar.f224891a) ? jSONObject.getJSONObject(rVar.f224891a) : new JSONObject();
            return new com.planner5d.library.model.y(k1.h(jSONObject2, com.planner5d.library.services.r.x, 0.0f), k1.h(jSONObject2, com.planner5d.library.services.r.y, 0.0f), new com.planner5d.library.model.y(yVarQ, k1.j(jSONObject, com.planner5d.library.services.r.scale, null), k1.j(jSONObject, com.planner5d.library.services.r.rotate, null), com.planner5d.library.engine.rendering.util.i.l(k1.w(jSONObject, com.planner5d.library.services.r.repeat, null)), com.planner5d.library.engine.rendering.util.f.l(k1.w(jSONObject, com.planner5d.library.services.r.alignment, null))));
        }
        throw new JSONException("Texture not found: " + str2);
    }

    @Override // ib.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ItemMaterial convert(JSONObject jSONObject) throws JSONException {
        throw new JSONException("Cannot be called directly");
    }

    public ItemMaterial b(JSONObject jSONObject, int i10) throws JSONException {
        return c(jSONObject, i10, null);
    }

    public ItemMaterial c(JSONObject jSONObject, int i10, String str) throws JSONException {
        return d(jSONObject, i10, com.planner5d.library.services.r.texture.f224891a, com.planner5d.library.services.r.tcolor.f224891a, str);
    }

    public ItemMaterial d(JSONObject jSONObject, int i10, String str, String str2, String str3) throws JSONException {
        return new ItemMaterial(k1.w(jSONObject, com.planner5d.library.services.r.itemMaterialName, null), f(jSONObject, com.planner5d.library.services.r.color.f224891a, this.f180637a), f(jSONObject, str2, this.f180637a), h(jSONObject, str, str3), i10);
    }

    public ItemMaterial e(JSONObject jSONObject, String str, String str2, Integer num) throws JSONException {
        com.planner5d.library.model.y yVar = null;
        String string = jSONObject.has(str) ? jSONObject.getString(str) : null;
        Integer numG = g(jSONObject, str2, this.f180637a, num);
        if (string != null && !AbstractJsonLexerKt.NULL.equals(string)) {
            yVar = new com.planner5d.library.model.y(string);
        }
        return new ItemMaterial(null, numG, null, yVar, 0);
    }
}
