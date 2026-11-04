package com.devtodev.analytics.internal.backend;

import com.devtodev.analytics.internal.backend.repository.json.JsonParser;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nConfigEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigEntry.kt\ncom/devtodev/analytics/internal/backend/ExcludeEvents\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class ExcludeEvents {

    @Nullable
    private final Boolean all;

    @Nullable
    private final Map<String, List<Object>> excludeEvents;

    @Nullable
    private final Long version;

    /* JADX WARN: Multi-variable type inference failed */
    public ExcludeEvents(@Nullable Long l10, @Nullable Boolean bool, @Nullable Map<String, ? extends List<? extends Object>> map) {
        this.version = l10;
        this.all = bool;
        this.excludeEvents = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExcludeEvents copy$default(ExcludeEvents excludeEvents, Long l10, Boolean bool, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = excludeEvents.version;
        }
        if ((i10 & 2) != 0) {
            bool = excludeEvents.all;
        }
        if ((i10 & 4) != 0) {
            map = excludeEvents.excludeEvents;
        }
        return excludeEvents.copy(l10, bool, map);
    }

    @Nullable
    public final Long component1() {
        return this.version;
    }

    @Nullable
    public final Boolean component2() {
        return this.all;
    }

    @Nullable
    public final Map<String, List<Object>> component3() {
        return this.excludeEvents;
    }

    @NotNull
    public final ExcludeEvents copy(@Nullable Long l10, @Nullable Boolean bool, @Nullable Map<String, ? extends List<? extends Object>> map) {
        return new ExcludeEvents(l10, bool, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeEvents)) {
            return false;
        }
        ExcludeEvents excludeEvents = (ExcludeEvents) obj;
        return Intrinsics.areEqual(this.version, excludeEvents.version) && Intrinsics.areEqual(this.all, excludeEvents.all) && Intrinsics.areEqual(this.excludeEvents, excludeEvents.excludeEvents);
    }

    @Nullable
    public final Boolean getAll() {
        return this.all;
    }

    @Nullable
    public final Map<String, List<Object>> getExcludeEvents() {
        return this.excludeEvents;
    }

    @NotNull
    public final JSONObject getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Long l10 = this.version;
        if (l10 != null) {
            jSONObject.accumulate("version", l10);
        }
        Boolean bool = this.all;
        if (bool != null) {
            jSONObject.accumulate("all", bool);
        }
        if (this.excludeEvents != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, List<Object>> entry : this.excludeEvents.entrySet()) {
                jSONObject2.accumulate(entry.getKey(), new JSONArray((Collection) entry.getValue()));
            }
            jSONObject.accumulate(JsonParser.EXCLUDE_EVENTS, jSONObject2);
        }
        return jSONObject;
    }

    @Nullable
    public final Long getVersion() {
        return this.version;
    }

    public int hashCode() {
        Long l10 = this.version;
        int iHashCode = 0;
        int iHashCode2 = (l10 == null ? 0 : l10.hashCode()) * 31;
        Boolean bool = this.all;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, List<Object>> map = this.excludeEvents;
        if (map != null) {
            iHashCode = map.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    @NotNull
    public String toString() {
        return "ExcludeEvents(version=" + this.version + ", all=" + this.all + ", excludeEvents=" + this.excludeEvents + ")";
    }

    public /* synthetic */ ExcludeEvents(Long l10, Boolean bool, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : bool, map);
    }
}
