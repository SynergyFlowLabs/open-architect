package net.openid.appauth;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class r {

    static final class a extends b<Boolean> {
        a(String str, boolean z10) {
            super(str, Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.r.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    static abstract class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f333119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f333120b;

        b(String str, T t10) {
            this.f333119a = str;
            this.f333120b = t10;
        }

        abstract T a(String str);
    }

    static abstract class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f333121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<T> f333122b;

        c(String str, List<T> list) {
            this.f333121a = str;
            this.f333122b = list;
        }

        abstract T a(String str);
    }

    static final class d extends b<String> {
        d(String str, String str2) {
            super(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.r.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }

        d(String str) {
            this(str, null);
        }
    }

    static final class e extends c<String> {
        e(String str) {
            super(str, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.r.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }

        e(String str, List<String> list) {
            super(str, list);
        }
    }

    static final class f extends b<Uri> {
        f(String str, Uri uri) {
            super(str, uri);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.r.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Uri a(String str) {
            return Uri.parse(str);
        }

        f(String str) {
            this(str, null);
        }
    }

    private r() {
        throw new IllegalStateException("This type is not intended to be instantiated");
    }

    public static <T> T a(JSONObject jSONObject, b<T> bVar) {
        try {
            return !jSONObject.has(bVar.f333119a) ? bVar.f333120b : bVar.a(jSONObject.getString(bVar.f333119a));
        } catch (JSONException e10) {
            throw new IllegalStateException("unexpected JSONException", e10);
        }
    }

    public static <T> List<T> b(JSONObject jSONObject, c<T> cVar) {
        try {
            if (!jSONObject.has(cVar.f333121a)) {
                return cVar.f333122b;
            }
            Object obj = jSONObject.get(cVar.f333121a);
            if (!(obj instanceof JSONArray)) {
                throw new IllegalStateException(cVar.f333121a + " does not contain the expected JSON array");
            }
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(cVar.a(jSONArray.getString(i10)));
            }
            return arrayList;
        } catch (JSONException e10) {
            throw new IllegalStateException("unexpected JSONException", e10);
        }
    }

    @p0
    public static Long c(@NonNull JSONObject jSONObject, @NonNull String str) throws JSONException {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @NonNull
    public static String d(@NonNull JSONObject jSONObject, @NonNull String str) throws JSONException {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (!jSONObject.has(str)) {
            throw new JSONException("field \"" + str + "\" not found in json object");
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static String e(@NonNull JSONObject jSONObject, @NonNull String str) throws JSONException {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    @NonNull
    public static List<String> f(@NonNull JSONObject jSONObject, @NonNull String str) throws JSONException {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (jSONObject.has(str)) {
            return v(jSONObject.getJSONArray(str));
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    public static List<String> g(@NonNull JSONObject jSONObject, @NonNull String str) throws JSONException {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null) {
            return v(jSONArray);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    @NonNull
    public static Map<String, String> h(JSONObject jSONObject, String str) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, (String) t.g(jSONObject2.getString(next), "additional parameter values must not be null"));
            }
        }
        return linkedHashMap;
    }

    public static Uri i(@NonNull JSONObject jSONObject, @NonNull String str) throws JSONException {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    @p0
    public static Uri j(@NonNull JSONObject jSONObject, @NonNull String str) throws JSONException {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    @NonNull
    public static List<Uri> k(@NonNull JSONObject jSONObject, @NonNull String str) throws JSONException {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (jSONObject.has(str)) {
            return w(jSONObject.getJSONArray(str));
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    @NonNull
    public static JSONObject l(@NonNull Map<String, String> map) {
        t.f(map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            t.g(entry.getKey(), "map entries must not have null keys");
            t.g(entry.getValue(), "map entries must not have null values");
            n(jSONObject, entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static void m(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull int i10) {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        t.g(Integer.valueOf(i10), "value must not be null");
        try {
            jSONObject.put(str, i10);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void n(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull String str2) {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        t.g(str2, "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void o(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull JSONArray jSONArray) {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        t.g(jSONArray, "value must not be null");
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void p(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull JSONObject jSONObject2) {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        t.g(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void q(@NonNull JSONObject jSONObject, @NonNull String str, @p0 Uri uri) {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (uri == null) {
            return;
        }
        try {
            jSONObject.put(str, uri.toString());
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void r(@NonNull JSONObject jSONObject, @NonNull String str, @p0 Long l10) {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (l10 == null) {
            return;
        }
        try {
            jSONObject.put(str, l10);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void s(@NonNull JSONObject jSONObject, @NonNull String str, @p0 String str2) {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void t(@NonNull JSONObject jSONObject, @NonNull String str, @p0 JSONObject jSONObject2) {
        t.g(jSONObject, "json must not be null");
        t.g(str, "field must not be null");
        if (jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    @NonNull
    public static JSONArray u(@NonNull Iterable<?> iterable) {
        t.g(iterable, "objects cannot be null");
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toString());
        }
        return jSONArray;
    }

    @NonNull
    public static List<String> v(@p0 JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(t.f(jSONArray.get(i10)).toString());
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<Uri> w(@p0 JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(Uri.parse(t.f(jSONArray.get(i10)).toString()));
            }
        }
        return arrayList;
    }
}
