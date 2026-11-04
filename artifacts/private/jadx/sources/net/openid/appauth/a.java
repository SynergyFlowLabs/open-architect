package net.openid.appauth;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
class a {
    private a() {
    }

    static Set<String> a(String... strArr) {
        return (strArr == null || strArr.length == 0) ? Collections.EMPTY_SET : Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    static Map<String, String> b(@p0 Map<String, String> map, @NonNull Set<String> set) {
        if (map == null) {
            return Collections.EMPTY_MAP;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            t.g(key, "additional parameter keys cannot be null");
            t.g(value, "additional parameter values cannot be null");
            t.c(!set.contains(key), "Parameter %s is directly supported via the authorization request builder, use the builder method instead", key);
            linkedHashMap.put(key, value);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    static Map<String, String> c(Uri uri, Set<String> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!set.contains(str)) {
                linkedHashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return linkedHashMap;
    }

    static Map<String, String> d(JSONObject jSONObject, Set<String> set) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!set.contains(next)) {
                linkedHashMap.put(next, jSONObject.get(next).toString());
            }
        }
        return linkedHashMap;
    }
}
