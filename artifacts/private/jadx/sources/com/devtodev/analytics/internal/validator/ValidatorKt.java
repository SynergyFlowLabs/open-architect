package com.devtodev.analytics.internal.validator;

import com.devtodev.analytics.internal.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Validator.kt\ncom/devtodev/analytics/internal/validator/ValidatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,296:1\n1855#2,2:297\n1855#2,2:299\n*S KotlinDebug\n*F\n+ 1 Validator.kt\ncom/devtodev/analytics/internal/validator/ValidatorKt\n*L\n239#1:297,2\n246#1:299,2\n*E\n"})
public final class ValidatorKt {
    public static final boolean containsOnlyStringValues(@NotNull List<? extends JSONObject> list, @NotNull String method) throws JSONException {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(method, "method");
        for (JSONObject jSONObject : list) {
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
            if (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (!(obj instanceof JSONArray)) {
                    if (!(obj instanceof String)) {
                        Logger.INSTANCE.error(Validator.INSTANCE.methodOccurred$DTDAnalytics_androidRelease(method) + "\n\tKey [" + next + "] of " + jSONObject + " has not string format value.", null);
                        break;
                    }
                    return true;
                }
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if (!(jSONArray.get(i10) instanceof String)) {
                        Logger.INSTANCE.error(Validator.INSTANCE.methodOccurred$DTDAnalytics_androidRelease(method) + "\n\tKey [" + next + "] of " + jSONObject + " has not string format value.", null);
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static final List<JSONObject> convertToJsonList(@NotNull List<String> list, @NotNull String methodExecutor) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(methodExecutor, "methodExecutor");
        ArrayList arrayList = new ArrayList();
        String str = "";
        try {
            for (String str2 : list) {
                try {
                    arrayList.add(new JSONObject(str2));
                    str = str2;
                } catch (JSONException unused) {
                    str = str2;
                    Logger.INSTANCE.error(Validator.INSTANCE.methodOccurred$DTDAnalytics_androidRelease(methodExecutor) + "\n\tPurchase [" + str + "] has invalid json format.", null);
                    return null;
                }
            }
            return arrayList;
        } catch (JSONException unused2) {
        }
    }

    public static final boolean hasEmptyObj(@NotNull List<? extends JSONObject> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((JSONObject) it.next()).keys().hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean hasRequiredKeys(@NotNull JSONObject jSONObject, @NotNull String method, @NotNull String jsonKey) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(jsonKey, "jsonKey");
        if (jSONObject.has(jsonKey)) {
            return true;
        }
        Logger.error$default(Logger.INSTANCE, Validator.INSTANCE.methodOccurred$DTDAnalytics_androidRelease(method) + "\n\tPurchase " + jSONObject + " not contains [" + jsonKey + "] key.", null, 2, null);
        return false;
    }

    public static final boolean notNullOrEmpty(@NotNull JSONObject jSONObject, @NotNull String method, @NotNull String jsonKey) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(jsonKey, "jsonKey");
        return Validator.INSTANCE.notNullOrEmpty(method, jsonKey, !jSONObject.isNull(jsonKey) ? jSONObject.get(jsonKey).toString() : null);
    }
}
