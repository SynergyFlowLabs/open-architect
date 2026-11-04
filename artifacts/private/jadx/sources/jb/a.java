package jb;

import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ib.a<JSONObject, String> {
    @Override // ib.a
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String convert(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("picture") || jSONObject.isNull("picture")) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("picture");
        if (jSONObject2.has("128")) {
            return jSONObject2.getString("128");
        }
        return null;
    }
}
