package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f99792a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<Class<?>, h> f99793b;

    public static final class a implements h {
        a() {
        }

        @Override // com.facebook.internal.e.h
        public void a(@NotNull JSONObject json, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            json.put(key, value);
        }

        @Override // com.facebook.internal.e.h
        public void b(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
        }
    }

    public static final class b implements h {
        b() {
        }

        @Override // com.facebook.internal.e.h
        public void a(@NotNull JSONObject json, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            json.put(key, value);
        }

        @Override // com.facebook.internal.e.h
        public void b(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putInt(key, ((Integer) value).intValue());
        }
    }

    public static final class c implements h {
        c() {
        }

        @Override // com.facebook.internal.e.h
        public void a(@NotNull JSONObject json, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            json.put(key, value);
        }

        @Override // com.facebook.internal.e.h
        public void b(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putLong(key, ((Long) value).longValue());
        }
    }

    public static final class d implements h {
        d() {
        }

        @Override // com.facebook.internal.e.h
        public void a(@NotNull JSONObject json, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            json.put(key, value);
        }

        @Override // com.facebook.internal.e.h
        public void b(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putDouble(key, ((Double) value).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.e$e, reason: collision with other inner class name */
    public static final class C0910e implements h {
        C0910e() {
        }

        @Override // com.facebook.internal.e.h
        public void a(@NotNull JSONObject json, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            json.put(key, value);
        }

        @Override // com.facebook.internal.e.h
        public void b(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(key, (String) value);
        }
    }

    public static final class f implements h {
        f() {
        }

        @Override // com.facebook.internal.e.h
        public void a(@NotNull JSONObject json, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONArray jSONArray = new JSONArray();
            String[] strArr = (String[]) value;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                jSONArray.put(str);
            }
            json.put(key, jSONArray);
        }

        @Override // com.facebook.internal.e.h
        public void b(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    public static final class g implements h {
        g() {
        }

        @Override // com.facebook.internal.e.h
        public void a(@NotNull JSONObject json, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.e.h
        public void b(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONArray jSONArray = (JSONArray) value;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(key, arrayList);
                return;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    Object obj = jSONArray.get(i10);
                    if (!(obj instanceof String)) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected type in an array: ", obj.getClass()));
                    }
                    arrayList.add(obj);
                    if (i11 < length) {
                        i10 = i11;
                    }
                }
            }
            bundle.putStringArrayList(key, arrayList);
        }
    }

    public interface h {
        void a(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException;

        void b(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException;
    }

    static {
        HashMap map = new HashMap();
        f99793b = map;
        map.put(Boolean.class, new a());
        map.put(Integer.class, new b());
        map.put(Long.class, new c());
        map.put(Double.class, new d());
        map.put(String.class, new C0910e());
        map.put(String[].class, new f());
        map.put(JSONArray.class, new g());
    }

    private e() {
    }

    @oj.n
    @NotNull
    public static final Bundle a(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object value = jsonObject.get(key);
            if (value != JSONObject.NULL) {
                if (value instanceof JSONObject) {
                    bundle.putBundle(key, a((JSONObject) value));
                } else {
                    h hVar = f99793b.get(value.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("Unsupported type: ", value.getClass()));
                    }
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    hVar.b(bundle, key, value);
                }
            }
        }
        return bundle;
    }

    @oj.n
    @NotNull
    public static final JSONObject b(@NotNull Bundle bundle) throws JSONException {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String key : bundle.keySet()) {
            Object obj = bundle.get(key);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put(key, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(key, b((Bundle) obj));
                } else {
                    h hVar = f99793b.get(obj.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("Unsupported type: ", obj.getClass()));
                    }
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hVar.a(jSONObject, key, obj);
                }
            }
        }
        return jSONObject;
    }
}
