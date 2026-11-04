package io.customer.datapipelines.extensions;

import com.segment.analytics.kotlin.core.utilities.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJsonExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonExtensions.kt\nio/customer/datapipelines/extensions/JsonExtensionsKt\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n29#2,3:99\n52#2,3:102\n1617#3,9:105\n1869#3:114\n1870#3:116\n1626#3:117\n1#4:115\n*S KotlinDebug\n*F\n+ 1 JsonExtensions.kt\nio/customer/datapipelines/extensions/JsonExtensionsKt\n*L\n20#1:99,3\n29#1:102,3\n82#1:105,9\n82#1:114\n82#1:116\n82#1:117\n82#1:115\n*E\n"})
public final class c {
    private static final boolean a(Object obj) {
        if (obj instanceof Float) {
            Number number = (Number) obj;
            return Float.isNaN(number.floatValue()) || Float.isInfinite(number.floatValue());
        }
        if (!(obj instanceof Double)) {
            return false;
        }
        Number number2 = (Number) obj;
        return Double.isNaN(number2.doubleValue()) || Double.isInfinite(number2.doubleValue());
    }

    @NotNull
    public static final Map<String, Object> b(@NotNull Map<String, ? extends Object> map, @NotNull ih.e logger) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(logger, "logger");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object objE = e(entry.getValue(), logger);
            if (objE != null) {
                linkedHashMap.put(entry.getKey(), objE);
            } else {
                ih.e.a.b(logger, "Removed invalid JSON numeric value (NaN or infinity) for key: " + ((Object) entry.getKey()), null, null, 6, null);
            }
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Map c(Map map, ih.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = eh.d.f274883c.w();
        }
        return b(map, eVar);
    }

    private static final List<?> d(List<?> list, ih.e eVar) {
        ih.e eVar2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object objE = e(it.next(), eVar);
            if (objE == null) {
                eVar2 = eVar;
                ih.e.a.b(eVar2, "Removed invalid JSON numeric value (NaN or infinity)", null, null, 6, null);
            } else {
                eVar2 = eVar;
            }
            if (objE != null) {
                arrayList.add(objE);
            }
            eVar = eVar2;
        }
        return arrayList;
    }

    private static final <T> T e(T t10, ih.e eVar) {
        if (t10 == null) {
            return (T) JsonNull.INSTANCE;
        }
        T t11 = null;
        if (!(t10 instanceof Double) && !(t10 instanceof Float)) {
            boolean z10 = t10 instanceof Map;
            if (z10) {
                Map map = z10 ? (Map) t10 : null;
                if (map != null) {
                    t11 = (T) b(map, eVar);
                }
                return t11;
            }
            if (t10 instanceof List) {
                return (T) d((List) t10, eVar);
            }
        } else if (a(t10)) {
            return null;
        }
        return t10;
    }

    static /* synthetic */ Object f(Object obj, ih.e eVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            eVar = eh.d.f274883c.w();
        }
        return e(obj, eVar);
    }

    @NotNull
    public static final JsonArray g(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        IntRange intRangeW1 = r.W1(0, jSONArray.length());
        int iL = intRangeW1.l();
        int iM = intRangeW1.m();
        if (iL <= iM) {
            while (true) {
                jsonArrayBuilder.add(i(jSONArray.opt(iL)));
                if (iL == iM) {
                    break;
                }
                iL++;
            }
        }
        return jsonArrayBuilder.build();
    }

    @NotNull
    public static final JsonObject h(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNull(next);
            jsonObjectBuilder.put(next, i(jSONObject.opt(next)));
        }
        return jsonObjectBuilder.build();
    }

    private static final JsonElement i(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof JSONObject) {
            return h((JSONObject) obj);
        }
        return obj instanceof JSONArray ? g((JSONArray) obj) : o.F(obj);
    }
}
