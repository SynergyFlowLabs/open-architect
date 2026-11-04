package uf;

import com.segment.analytics.kotlin.core.utilities.o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    @NotNull
    public static final JSONArray a(@NotNull List<? extends JsonElement> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof JsonPrimitive) {
                jSONArray.put(o.A((JsonPrimitive) obj));
            } else if (obj instanceof JsonObject) {
                jSONArray.put(b((Map) obj));
            } else if (obj instanceof JsonArray) {
                jSONArray.put(a((List) obj));
            }
        }
        return jSONArray;
    }

    @NotNull
    public static final JSONObject b(@NotNull Map<String, ? extends JsonElement> map) throws JSONException {
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends JsonElement> entry : map.entrySet()) {
            String key = entry.getKey();
            Object obj = (JsonElement) entry.getValue();
            if (obj instanceof JsonPrimitive) {
                jSONObject.put(key, o.A((JsonPrimitive) obj));
            } else if (obj instanceof JsonObject) {
                jSONObject.put(key, b((Map) obj));
            } else if (obj instanceof JsonArray) {
                jSONObject.put(key, a((List) obj));
            }
        }
        return jSONObject;
    }
}
