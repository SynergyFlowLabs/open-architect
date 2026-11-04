package com.devtodev.analytics.internal.domain.events.abTests;

import com.devtodev.analytics.internal.logger.Logger;
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
@SourceDebugExtension({"SMAP\nSuitableExperiments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuitableExperiments.kt\ncom/devtodev/analytics/internal/domain/events/abTests/SuitableExperiments\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n1855#2,2:22\n*S KotlinDebug\n*F\n+ 1 SuitableExperiments.kt\ncom/devtodev/analytics/internal/domain/events/abTests/SuitableExperiments\n*L\n13#1:22,2\n*E\n"})
public final class SuitableExperiments {

    @NotNull
    private List<Long> suitableExperiments;

    public SuitableExperiments(@NotNull List<Long> suitableExperiments) {
        Intrinsics.checkNotNullParameter(suitableExperiments, "suitableExperiments");
        this.suitableExperiments = suitableExperiments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuitableExperiments copy$default(SuitableExperiments suitableExperiments, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = suitableExperiments.suitableExperiments;
        }
        return suitableExperiments.copy(list);
    }

    @NotNull
    public final List<Long> component1() {
        return this.suitableExperiments;
    }

    @NotNull
    public final SuitableExperiments copy(@NotNull List<Long> suitableExperiments) {
        Intrinsics.checkNotNullParameter(suitableExperiments, "suitableExperiments");
        return new SuitableExperiments(suitableExperiments);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuitableExperiments) && Intrinsics.areEqual(this.suitableExperiments, ((SuitableExperiments) obj).suitableExperiments);
    }

    @NotNull
    public final String getJson() {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            Iterator<T> it = this.suitableExperiments.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Number) it.next()).longValue());
            }
            jSONObject.accumulate("suitableExperiments", jSONArray);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "{\n            val array …json.toString()\n        }");
            return string;
        } catch (JSONException e10) {
            Logger.INSTANCE.error("suitableExperiments", e10);
            return "{}";
        }
    }

    @NotNull
    public final List<Long> getSuitableExperiments() {
        return this.suitableExperiments;
    }

    public int hashCode() {
        return this.suitableExperiments.hashCode();
    }

    public final void setSuitableExperiments(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.suitableExperiments = list;
    }

    @NotNull
    public String toString() {
        return "SuitableExperiments(suitableExperiments=" + this.suitableExperiments + ")";
    }
}
