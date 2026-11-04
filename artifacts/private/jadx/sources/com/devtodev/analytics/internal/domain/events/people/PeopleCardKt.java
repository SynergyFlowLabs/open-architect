package com.devtodev.analytics.internal.domain.events.people;

import com.devtodev.analytics.internal.modues.people.PeopleReservedKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PeopleCardKt {
    public static final void addPeopleParameterCheater(@NotNull String key, @NotNull Object value, @NotNull Map<String, PeopleParameter> param) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(param, "param");
        if (!Intrinsics.areEqual(key, PeopleReservedKeys.Cheater.getValue())) {
            param.put(key, new PeopleParameterBoolean(((Boolean) value).booleanValue()));
        } else if (((Boolean) value).booleanValue()) {
            param.put(key, new PeopleParameterBoolean(true));
        } else {
            param.put(key, new PeopleParameterBoolean(false));
        }
    }

    @NotNull
    public static final Map<String, PeopleParameter> fromJson(@NotNull String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(json, "") || Intrinsics.areEqual(json, v.f334777p)) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = new JSONArray(json);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                if (jSONObject.isNull(key)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    int i11 = 6 >> 1;
                    linkedHashMap.put(key, new PeopleParameterEmpty(null, 1, null));
                } else {
                    Object obj2 = jSONObject.get(key);
                    if (obj2 instanceof Double) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        linkedHashMap.put(key, new PeopleParameterDouble(((Number) obj2).doubleValue()));
                    } else if (obj2 instanceof Long) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        linkedHashMap.put(key, new PeopleParameterLong(((Number) obj2).longValue()));
                    } else if (obj2 instanceof Boolean) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        addPeopleParameterCheater(key, obj2, linkedHashMap);
                    } else if (obj2 instanceof String) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        linkedHashMap.put(key, new PeopleParameterString((String) obj2));
                    } else if (obj2 instanceof Integer) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        linkedHashMap.put(key, new PeopleParameterLong(((Number) obj2).intValue()));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> getChangedKeys(String str) throws JSONException {
        if (Intrinsics.areEqual(str, "")) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) obj);
        }
        return arrayList;
    }

    @NotNull
    public static final String json(@NotNull Map<String, PeopleParameter> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, PeopleParameter> entry : map.entrySet()) {
            String key = entry.getKey();
            PeopleParameter value = entry.getValue();
            if (value instanceof PeopleParameterString) {
                jSONArray.put(new JSONObject().accumulate(key, ((PeopleParameterString) value).getValue()));
            } else if (value instanceof PeopleParameterLong) {
                jSONArray.put(new JSONObject().accumulate(key, Long.valueOf(((PeopleParameterLong) value).getValue())));
            } else if (value instanceof PeopleParameterBoolean) {
                jSONArray.put(new JSONObject().accumulate(key, Boolean.valueOf(((PeopleParameterBoolean) value).getValue())));
            } else if (value instanceof PeopleParameterDouble) {
                jSONArray.put(new JSONObject().accumulate(key, Double.valueOf(((PeopleParameterDouble) value).getValue())));
            } else if (value instanceof PeopleParameterEmpty) {
                jSONArray.put(new JSONObject().accumulate(key, JSONObject.NULL));
            }
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.toString()");
        return string;
    }

    @NotNull
    public static final JSONObject jsonForSending(@NotNull Map<String, PeopleParameter> map) throws JSONException {
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, PeopleParameter> entry : map.entrySet()) {
            String key = entry.getKey();
            PeopleParameter value = entry.getValue();
            if (value instanceof PeopleParameterString) {
                jSONObject.accumulate(key, ((PeopleParameterString) value).getValue());
            } else if (value instanceof PeopleParameterLong) {
                jSONObject.accumulate(key, Long.valueOf(((PeopleParameterLong) value).getValue()));
            } else if (value instanceof PeopleParameterBoolean) {
                jSONObject.accumulate(key, Boolean.valueOf(((PeopleParameterBoolean) value).getValue()));
            } else if (value instanceof PeopleParameterDouble) {
                jSONObject.accumulate(key, Double.valueOf(((PeopleParameterDouble) value).getValue()));
            } else if (value instanceof PeopleParameterEmpty) {
                jSONObject.accumulate(key, JSONObject.NULL);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String json(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "array.toString()");
        return string;
    }
}
