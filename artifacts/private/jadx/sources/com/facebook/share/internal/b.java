package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f101816a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashMap<Class<?>, d> f101817b = MapsKt.hashMapOf(TuplesKt.to(String.class, new a()), TuplesKt.to(String[].class, new C0918b()), TuplesKt.to(JSONArray.class, new c()));

    public static final class a implements d {
        a() {
        }

        @Override // com.facebook.share.internal.b.d
        public void a(@NotNull JSONObject json, @NotNull String key, @Nullable Object obj) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            json.put(key, obj);
        }

        @Override // com.facebook.share.internal.b.d
        public void b(@NotNull CameraEffectArguments.a builder, @NotNull String key, @Nullable Object obj) throws JSONException {
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter(key, "key");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            builder.d(key, (String) obj);
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.b$b, reason: collision with other inner class name */
    public static final class C0918b implements d {
        C0918b() {
        }

        @Override // com.facebook.share.internal.b.d
        public void a(@NotNull JSONObject json, @NotNull String key, @Nullable Object obj) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            JSONArray jSONArray = new JSONArray();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
            }
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                jSONArray.put(str);
            }
            json.put(key, jSONArray);
        }

        @Override // com.facebook.share.internal.b.d
        public void b(@NotNull CameraEffectArguments.a builder, @NotNull String key, @Nullable Object obj) throws JSONException {
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter(key, "key");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    public static final class c implements d {
        c() {
        }

        @Override // com.facebook.share.internal.b.d
        public void a(@NotNull JSONObject json, @NotNull String key, @Nullable Object obj) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }

        @Override // com.facebook.share.internal.b.d
        public void b(@NotNull CameraEffectArguments.a builder, @NotNull String key, @Nullable Object obj) throws JSONException {
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter(key, "key");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    Object obj2 = jSONArray.get(i10);
                    if (!(obj2 instanceof String)) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected type in an array: ", obj2.getClass()));
                    }
                    arrayList.add(obj2);
                    if (i11 >= length) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            builder.e(key, (String[]) array);
        }
    }

    private interface d {
        void a(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Object obj) throws JSONException;

        void b(@NotNull CameraEffectArguments.a aVar, @NotNull String str, @Nullable Object obj) throws JSONException;
    }

    private b() {
    }

    @n
    @Nullable
    public static final CameraEffectArguments a(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        CameraEffectArguments.a aVar = new CameraEffectArguments.a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object obj = jSONObject.get(key);
            if (obj != JSONObject.NULL) {
                d dVar = f101817b.get(obj.getClass());
                if (dVar == null) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Unsupported type: ", obj.getClass()));
                }
                Intrinsics.checkNotNullExpressionValue(key, "key");
                dVar.b(aVar, key, obj);
            }
        }
        return aVar.build();
    }

    @n
    @Nullable
    public static final JSONObject b(@Nullable CameraEffectArguments cameraEffectArguments) throws JSONException {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.f()) {
            Object objB = cameraEffectArguments.b(str);
            if (objB != null) {
                d dVar = f101817b.get(objB.getClass());
                if (dVar == null) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Unsupported type: ", objB.getClass()));
                }
                dVar.a(jSONObject, str, objB);
            }
        }
        return jSONObject;
    }
}
