package com.appsflyer.internal.models;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSubscriptionPurchase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionPurchase.kt\ncom/appsflyer/internal/models/SubscriptionPurchaseKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
public final class SubscriptionPurchaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T getNullable(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return (T) jSONObject.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<T> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.get(i10));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T toObject(JSONObject jSONObject, String str, Deserialize<T> deserialize) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return deserialize.fromJson(jSONObjectOptJSONObject);
        }
        return null;
    }
}
