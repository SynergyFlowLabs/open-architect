package com.planner5d.library.model.manager.config.purchaseplacement;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    @ij.a
    public c() {
    }

    @NotNull
    public final List<b> a(@NotNull JSONObject purchasePlacementsJson) {
        Intrinsics.checkNotNullParameter(purchasePlacementsJson, "purchasePlacementsJson");
        JSONArray jSONArrayNames = purchasePlacementsJson.names();
        if (jSONArrayNames != null) {
            try {
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                int length = jSONArrayNames.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArrayNames.getString(i10);
                    b.a.C1578a c1578a = b.a.f181615b;
                    Intrinsics.checkNotNull(string);
                    b.a aVarA = c1578a.a(string);
                    if (aVarA != null) {
                        JSONObject jSONObject = purchasePlacementsJson.getJSONObject(string);
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                        listCreateListBuilder.add(new b(aVarA, jSONObject));
                    }
                }
                return CollectionsKt.build(listCreateListBuilder);
            } catch (JSONException e10) {
                timber.log.b.f381052a.f(e10, "Failed to parse purchase placements", new Object[0]);
            }
        }
        return CollectionsKt.emptyList();
    }
}
