package com.planner5d.library.services.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nJsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n1#2:260\n1863#3,2:261\n*S KotlinDebug\n*F\n+ 1 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n*L\n182#1:261,2\n*E\n"})
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k1 f225294a = new k1();

    private k1() {
    }

    @oj.n
    @Nullable
    public static final List<String> A(@Nullable JSONObject jSONObject, @NotNull com.planner5d.library.services.r key) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.has(key.f224891a) && jSONObject.isNull(key.f224891a)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(key.f224891a);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    public static final /* synthetic */ <T> T[] C(JSONArray array) throws JSONException {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length();
        Intrinsics.reifiedOperationMarker(0, androidx.exifinterface.media.a.f51379e5);
        T[] tArr = (T[]) new Object[length];
        for (int i10 = 0; i10 < length; i10++) {
            tArr[i10] = array.get(i10);
        }
        return tArr;
    }

    @oj.n
    @NotNull
    public static final JSONArray D(@NotNull List<?> items) throws JSONException {
        Intrinsics.checkNotNullParameter(items, "items");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    @oj.n
    public static final /* synthetic */ <T> List<T> E(JSONArray from, Function1<Object, ? extends T> map) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(map, "map");
        int length = from.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = from.get(i10);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            arrayList.add(map.invoke(obj));
        }
        return arrayList;
    }

    @oj.n
    public static final /* synthetic */ <T> List<T> F(JSONArray from, Function1<? super JSONObject, ? extends T> map) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(map, "map");
        int length = from.length();
        if (length <= 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = from.getJSONObject(i10);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            arrayList.add(map.invoke(jSONObject));
        }
        return arrayList;
    }

    @oj.n
    @NotNull
    public static final long[] G(@NotNull JSONArray array) throws JSONException {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length();
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = array.getLong(i10);
        }
        return jArr;
    }

    @oj.n
    @NotNull
    public static final List<String> I(@NotNull JSONObject from, @NotNull String name) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(name, "name");
        JSONArray jSONArray = from.getJSONArray(name);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    @oj.n
    public static final boolean a(@NotNull JSONObject from, @NotNull com.planner5d.library.services.r field) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        return b(from, field.f224891a);
    }

    @oj.n
    public static final boolean b(@NotNull JSONObject from, @NotNull String field) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        boolean z10 = false;
        if (!from.has(field)) {
            return false;
        }
        try {
            return from.getBoolean(field);
        } catch (JSONException unused) {
            Integer numQ = q(from, field);
            if (numQ != null && numQ.intValue() == 1) {
                z10 = true;
            }
            return z10;
        }
    }

    @oj.n
    @Nullable
    public static final Boolean c(@NotNull JSONObject from, @NotNull com.planner5d.library.services.r field, @Nullable Boolean bool) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        return d(from, field.f224891a, bool);
    }

    @oj.n
    @Nullable
    public static final Boolean d(@NotNull JSONObject from, @NotNull String field, @Nullable Boolean bool) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        return from.has(field) ? Boolean.valueOf(from.getBoolean(field)) : bool;
    }

    public static /* synthetic */ Boolean e(JSONObject jSONObject, com.planner5d.library.services.r rVar, Boolean bool, int i10, Object obj) throws JSONException {
        if ((i10 & 4) != 0) {
            bool = null;
        }
        return c(jSONObject, rVar, bool);
    }

    @oj.n
    public static final double f(@NotNull JSONObject from, @NotNull com.planner5d.library.services.r field, double d10) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        Double dG = g(from, field.f224891a, Double.valueOf(d10));
        return dG != null ? dG.doubleValue() : d10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if ((r4.get(r5) instanceof org.json.JSONObject) != false) goto L22;
     */
    @oj.n
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Double g(@org.jetbrains.annotations.NotNull org.json.JSONObject r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.Double r6) throws org.json.JSONException {
        /*
            java.lang.String r0 = "fomr"
            java.lang.String r0 = "from"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.has(r5)     // Catch: org.json.JSONException -> L1c
            if (r0 == 0) goto L59
            double r0 = r4.getDouble(r5)     // Catch: org.json.JSONException -> L1c
            r3 = 1
            java.lang.Double r4 = java.lang.Double.valueOf(r0)     // Catch: org.json.JSONException -> L1c
            return r4
        L1c:
            r0 = move-exception
            boolean r1 = r4.has(r5)
            r3 = 0
            if (r1 == 0) goto L5b
            r3 = 3
            boolean r1 = r4.isNull(r5)
            if (r1 == 0) goto L2c
            goto L59
        L2c:
            java.lang.String r1 = r4.getString(r5)
            java.lang.String r2 = "null"
            r3 = 6
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            r3 = 3
            if (r2 != 0) goto L59
            r3 = 6
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.length()
            r3 = 1
            if (r1 != 0) goto L46
            goto L59
        L46:
            java.lang.Object r1 = r4.get(r5)
            r3 = 6
            boolean r1 = r1 instanceof org.json.JSONArray
            if (r1 != 0) goto L59
            r3 = 3
            java.lang.Object r4 = r4.get(r5)
            boolean r4 = r4 instanceof org.json.JSONObject
            r3 = 3
            if (r4 == 0) goto L5b
        L59:
            r3 = 5
            return r6
        L5b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.utility.k1.g(org.json.JSONObject, java.lang.String, java.lang.Double):java.lang.Double");
    }

    @oj.n
    public static final float h(@NotNull JSONObject from, @NotNull com.planner5d.library.services.r field, float f10) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        Float fK = k(from, field.f224891a, Float.valueOf(f10));
        return fK != null ? fK.floatValue() : f10;
    }

    @oj.n
    public static final float i(@NotNull JSONObject from, @NotNull String field, float f10) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        Float fK = k(from, field, Float.valueOf(f10));
        return fK != null ? fK.floatValue() : f10;
    }

    @oj.n
    @Nullable
    public static final Float j(@NotNull JSONObject from, @NotNull com.planner5d.library.services.r field, @Nullable Float f10) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        return k(from, field.f224891a, f10);
    }

    @oj.n
    @Nullable
    public static final Float k(@NotNull JSONObject from, @NotNull String field, @Nullable Float f10) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        Double dG = g(from, field, f10 != null ? Double.valueOf(f10.floatValue()) : null);
        if (dG != null) {
            float fDoubleValue = (float) dG.doubleValue();
            if (!Float.isInfinite(fDoubleValue)) {
                return Float.valueOf(fDoubleValue);
            }
        }
        return f10;
    }

    public static /* synthetic */ Float l(JSONObject jSONObject, com.planner5d.library.services.r rVar, Float f10, int i10, Object obj) throws JSONException {
        if ((i10 & 4) != 0) {
            f10 = null;
        }
        return j(jSONObject, rVar, f10);
    }

    @oj.n
    public static final int m(@NotNull JSONObject from, @NotNull com.planner5d.library.services.r field, int i10) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        return n(from, field.f224891a, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if ((r4.get(r5) instanceof org.json.JSONArray) != false) goto L21;
     */
    @oj.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int n(@org.jetbrains.annotations.NotNull org.json.JSONObject r4, @org.jetbrains.annotations.NotNull java.lang.String r5, int r6) throws org.json.JSONException {
        /*
            java.lang.String r0 = "from"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "efdml"
            java.lang.String r0 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.has(r5)     // Catch: org.json.JSONException -> L19
            if (r0 == 0) goto L4a
            r3 = 3
            int r4 = r4.getInt(r5)     // Catch: org.json.JSONException -> L19
            r3 = 1
            return r4
        L19:
            r0 = move-exception
            boolean r1 = r4.has(r5)
            if (r1 == 0) goto L4c
            boolean r1 = r4.isNull(r5)
            r3 = 0
            if (r1 == 0) goto L28
            goto L4a
        L28:
            r3 = 2
            java.lang.String r1 = r4.getString(r5)
            r3 = 2
            java.lang.String r2 = "null"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            if (r2 != 0) goto L4a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.length()
            if (r1 != 0) goto L41
            r3 = 3
            goto L4a
        L41:
            java.lang.Object r4 = r4.get(r5)
            r3 = 4
            boolean r4 = r4 instanceof org.json.JSONArray
            if (r4 == 0) goto L4c
        L4a:
            r3 = 2
            return r6
        L4c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.utility.k1.n(org.json.JSONObject, java.lang.String, int):int");
    }

    @oj.n
    @Nullable
    public static final int[] o(@NotNull JSONObject data, @NotNull com.planner5d.library.services.r field) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        if (!data.has(field.f224891a)) {
            return null;
        }
        JSONArray jSONArray = data.getJSONArray(field.f224891a);
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    @oj.n
    @Nullable
    public static final Integer p(@NotNull JSONObject from, @NotNull com.planner5d.library.services.r field) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        return q(from, field.f224891a);
    }

    @oj.n
    @Nullable
    public static final Integer q(@NotNull JSONObject from, @NotNull String field) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        try {
            if (from.has(field)) {
                return Integer.valueOf(from.getInt(field));
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    @oj.n
    @Nullable
    public static final Long v(@NotNull JSONObject from, @NotNull com.planner5d.library.services.r field) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(field, "field");
        try {
            if (from.has(field.f224891a)) {
                return Long.valueOf(from.getLong(field.f224891a));
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    @oj.n
    @Nullable
    public static final String w(@Nullable JSONObject jSONObject, @NotNull com.planner5d.library.services.r field, @Nullable String str) {
        Intrinsics.checkNotNullParameter(field, "field");
        return x(jSONObject, field.f224891a, str);
    }

    @oj.n
    @Nullable
    public static final String x(@Nullable JSONObject jSONObject, @NotNull String field, @Nullable String str) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (jSONObject != null) {
            try {
                if (jSONObject.has(field) && !jSONObject.isNull(field)) {
                    return jSONObject.getString(field);
                }
            } catch (JSONException unused) {
            }
        }
        return str;
    }

    public static /* synthetic */ String y(JSONObject jSONObject, com.planner5d.library.services.r rVar, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return w(jSONObject, rVar, str);
    }

    public static /* synthetic */ String z(JSONObject jSONObject, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return x(jSONObject, str, str2);
    }

    public final boolean B(@NotNull JSONObject jSONObject, @NotNull com.planner5d.library.services.r field) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(field, "field");
        return jSONObject.has(field.f224891a);
    }

    @NotNull
    public final Map<String, Object> H(@NotNull JSONObject from) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArrayNames = from.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArrayNames.getString(i10);
                Intrinsics.checkNotNull(string);
                linkedHashMap.put(string, from.get(string));
            }
        }
        return linkedHashMap;
    }

    @Nullable
    public final JSONArray r(@Nullable JSONObject jSONObject, @NotNull com.planner5d.library.services.r field) throws JSONException {
        Intrinsics.checkNotNullParameter(field, "field");
        return s(jSONObject, field.f224891a);
    }

    @Nullable
    public final JSONArray s(@Nullable JSONObject jSONObject, @NotNull String field) throws JSONException {
        Intrinsics.checkNotNullParameter(field, "field");
        if (jSONObject == null || !jSONObject.has(field) || jSONObject.isNull(field)) {
            return null;
        }
        return jSONObject.getJSONArray(field);
    }

    @Nullable
    public final JSONObject t(@Nullable JSONObject jSONObject, @NotNull com.planner5d.library.services.r field) throws JSONException {
        Intrinsics.checkNotNullParameter(field, "field");
        return u(jSONObject, field.f224891a);
    }

    @Nullable
    public final JSONObject u(@Nullable JSONObject jSONObject, @NotNull String field) throws JSONException {
        Intrinsics.checkNotNullParameter(field, "field");
        if (jSONObject == null || !jSONObject.has(field) || jSONObject.isNull(field)) {
            return null;
        }
        return jSONObject.getJSONObject(field);
    }
}
