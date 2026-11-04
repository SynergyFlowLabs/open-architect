package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1lSDK {
    public static JSONObject getCurrencyIso4217Code(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), getRevenue(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static List<Object> getMediationNetwork(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object monetizationNetwork = jSONArray.get(i10);
            if (monetizationNetwork instanceof JSONArray) {
                monetizationNetwork = getMediationNetwork((JSONArray) monetizationNetwork);
            } else if (monetizationNetwork instanceof JSONObject) {
                monetizationNetwork = getMonetizationNetwork((JSONObject) monetizationNetwork);
            }
            arrayList.add(monetizationNetwork);
        }
        return arrayList;
    }

    @androidx.annotation.p0
    public static JSONObject getMonetizationNetwork(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Object getRevenue(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(getRevenue(it.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i10 = 0; i10 < length; i10++) {
                    jSONArray2.put(getRevenue(Array.get(obj, i10)));
                }
                return jSONArray2;
            }
            if (obj instanceof Map) {
                return getCurrencyIso4217Code((Map) obj);
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short)) {
                if (obj instanceof String) {
                    return obj;
                }
                obj = obj.toString();
            }
            return obj;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static Map<String, Object> getMonetizationNetwork(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object monetizationNetwork = jSONObject.get(next);
            if (monetizationNetwork instanceof JSONArray) {
                monetizationNetwork = getMediationNetwork((JSONArray) monetizationNetwork);
            } else if (monetizationNetwork instanceof JSONObject) {
                monetizationNetwork = getMonetizationNetwork((JSONObject) monetizationNetwork);
            }
            map.put(next, monetizationNetwork);
        }
        return map;
    }
}
