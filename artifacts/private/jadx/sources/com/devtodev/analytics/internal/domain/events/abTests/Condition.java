package com.devtodev.analytics.internal.domain.events.abTests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Condition.kt\ncom/devtodev/analytics/internal/domain/events/abTests/Condition\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1855#2,2:54\n1#3:56\n*S KotlinDebug\n*F\n+ 1 Condition.kt\ncom/devtodev/analytics/internal/domain/events/abTests/Condition\n*L\n38#1:54,2\n*E\n"})
public final class Condition {

    @NotNull
    private Comparison comparison;

    @NotNull
    private ConditionsType conditionsType;

    @NotNull
    private String eventCode;
    private boolean isChecked;

    @NotNull
    private final List<String> searchPath;

    public Condition(@NotNull String eventCode, @NotNull List<String> searchPath, @NotNull ConditionsType conditionsType, @NotNull Comparison comparison, boolean z10) {
        Intrinsics.checkNotNullParameter(eventCode, "eventCode");
        Intrinsics.checkNotNullParameter(searchPath, "searchPath");
        Intrinsics.checkNotNullParameter(conditionsType, "conditionsType");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        this.eventCode = eventCode;
        this.searchPath = searchPath;
        this.conditionsType = conditionsType;
        this.comparison = comparison;
        this.isChecked = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Condition copy$default(Condition condition, String str, List list, ConditionsType conditionsType, Comparison comparison, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = condition.eventCode;
        }
        if ((i10 & 2) != 0) {
            list = condition.searchPath;
        }
        if ((i10 & 4) != 0) {
            conditionsType = condition.conditionsType;
        }
        if ((i10 & 8) != 0) {
            comparison = condition.comparison;
        }
        if ((i10 & 16) != 0) {
            z10 = condition.isChecked;
        }
        boolean z11 = z10;
        ConditionsType conditionsType2 = conditionsType;
        return condition.copy(str, list, conditionsType2, comparison, z11);
    }

    @NotNull
    public final String component1() {
        return this.eventCode;
    }

    @NotNull
    public final List<String> component2() {
        return this.searchPath;
    }

    @NotNull
    public final ConditionsType component3() {
        return this.conditionsType;
    }

    @NotNull
    public final Comparison component4() {
        return this.comparison;
    }

    public final boolean component5() {
        return this.isChecked;
    }

    @NotNull
    public final Condition copy(@NotNull String eventCode, @NotNull List<String> searchPath, @NotNull ConditionsType conditionsType, @NotNull Comparison comparison, boolean z10) {
        Intrinsics.checkNotNullParameter(eventCode, "eventCode");
        Intrinsics.checkNotNullParameter(searchPath, "searchPath");
        Intrinsics.checkNotNullParameter(conditionsType, "conditionsType");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        return new Condition(eventCode, searchPath, conditionsType, comparison, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Condition)) {
            return false;
        }
        Condition condition = (Condition) obj;
        return Intrinsics.areEqual(this.eventCode, condition.eventCode) && Intrinsics.areEqual(this.searchPath, condition.searchPath) && this.conditionsType == condition.conditionsType && Intrinsics.areEqual(this.comparison, condition.comparison) && this.isChecked == condition.isChecked;
    }

    @NotNull
    public final Comparison getComparison() {
        return this.comparison;
    }

    @NotNull
    public final ConditionsType getConditionsType() {
        return this.conditionsType;
    }

    @NotNull
    public final String getEventCode() {
        return this.eventCode;
    }

    @NotNull
    public final List<String> getSearchPath() {
        return this.searchPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = (this.comparison.hashCode() + ((this.conditionsType.hashCode() + ((this.searchPath.hashCode() + (this.eventCode.hashCode() * 31)) * 31)) * 31)) * 31;
        boolean z10 = this.isChecked;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z10) {
        this.isChecked = z10;
    }

    public final void setComparison(@NotNull Comparison comparison) {
        Intrinsics.checkNotNullParameter(comparison, "<set-?>");
        this.comparison = comparison;
    }

    public final void setConditionsType(@NotNull ConditionsType conditionsType) {
        Intrinsics.checkNotNullParameter(conditionsType, "<set-?>");
        this.conditionsType = conditionsType;
    }

    public final void setEventCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventCode = str;
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", this.eventCode);
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.searchPath.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject.accumulate("searchPath", jSONArray);
        jSONObject.accumulate("conditionsType", this.conditionsType);
        jSONObject.accumulate("comparison", this.comparison.toJson());
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "Condition(eventCode=" + this.eventCode + ", searchPath=" + this.searchPath + ", conditionsType=" + this.conditionsType + ", comparison=" + this.comparison + ", isChecked=" + this.isChecked + ")";
    }

    public /* synthetic */ Condition(String str, List list, ConditionsType conditionsType, Comparison comparison, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? new ArrayList() : list, conditionsType, comparison, (i10 & 16) != 0 ? false : z10);
    }
}
