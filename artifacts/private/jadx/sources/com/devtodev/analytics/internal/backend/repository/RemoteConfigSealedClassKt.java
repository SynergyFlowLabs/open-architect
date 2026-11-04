package com.devtodev.analytics.internal.backend.repository;

import com.devtodev.analytics.internal.domain.events.abTests.Condition;
import com.devtodev.analytics.internal.logger.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRemoteConfigSealedClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfigSealedClass.kt\ncom/devtodev/analytics/internal/backend/repository/RemoteConfigSealedClassKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1855#2,2:103\n1855#2,2:105\n*S KotlinDebug\n*F\n+ 1 RemoteConfigSealedClass.kt\ncom/devtodev/analytics/internal/backend/repository/RemoteConfigSealedClassKt\n*L\n56#1:103,2\n79#1:105,2\n*E\n"})
public final class RemoteConfigSealedClassKt {
    @NotNull
    public static final String getConditions(@Nullable List<Condition> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            try {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((Condition) it.next()).toJson());
                }
            } catch (JSONException e10) {
                Logger.INSTANCE.error("When trying to get json string from \n\t[getConditions] method\nan Error has occurred:", e10);
            }
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "conditionsArray.toString()");
        return string;
    }

    @NotNull
    public static final String getParameters(@Nullable List<Parameter> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            try {
                for (Parameter parameter : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.accumulate("key", parameter.getKey());
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Object> entry : parameter.getValues().entrySet()) {
                        jSONObject2.accumulate(entry.getKey(), entry.getValue());
                    }
                    jSONObject.accumulate("values", jSONObject2);
                    jSONArray.put(jSONObject);
                }
            } catch (JSONException e10) {
                Logger.INSTANCE.error("When trying to get json string from \n\t[getParameters] method\nan Error has occurred:", e10);
            }
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "parametersArray.toString()");
        return string;
    }

    @NotNull
    public static final String getString(@NotNull UserProperties userProperties) throws JSONException {
        Intrinsics.checkNotNullParameter(userProperties, "<this>");
        JSONObject jSONObject = new JSONObject();
        String country = userProperties.getCountry();
        if (country != null) {
            jSONObject.accumulate("country", country);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonUserProperties.toString()");
        return string;
    }
}
