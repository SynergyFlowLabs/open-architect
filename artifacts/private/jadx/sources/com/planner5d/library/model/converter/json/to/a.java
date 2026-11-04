package com.planner5d.library.model.converter.json.to;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemOpenClose;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<From extends Item> extends xc.a<From, JSONObject> {
    static double e(float f10, double d10) {
        return (Float.isNaN(f10) || Float.isInfinite(f10)) ? d10 : f10;
    }

    public static float f(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isInfinite(f10)) ? f11 : f10;
    }

    protected <T> JSONObject a(JSONObject jSONObject, String str, T t10) throws JSONException {
        return t10 == null ? jSONObject : jSONObject.put(str, t10);
    }

    protected JSONObject b(JSONObject jSONObject, String str, JSONArray jSONArray) throws JSONException {
        return (jSONArray == null || jSONArray.length() < 1) ? jSONObject : jSONObject.put(str, jSONArray);
    }

    @Override // ib.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract JSONObject convert(From from) throws JSONException;

    protected JSONObject d(@NonNull Item item) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("className", item instanceof ItemOpenClose ? "Ns" : item.getClass().getSimpleName().substring(4));
        a(jSONObject, "puid", item.getUid());
        return jSONObject;
    }
}
