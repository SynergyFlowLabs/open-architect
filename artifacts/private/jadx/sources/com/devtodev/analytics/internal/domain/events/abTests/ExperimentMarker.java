package com.devtodev.analytics.internal.domain.events.abTests;

import com.devtodev.analytics.internal.logger.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String group;
    private final long idKey;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ExperimentMarker fromJson(@Nullable String str) {
            if (str == null) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                long j10 = jSONObject.getLong("id");
                String string = jSONObject.getString("group");
                Intrinsics.checkNotNullExpressionValue(string, "it.getString(\"group\")");
                return new ExperimentMarker(j10, string);
            } catch (JSONException e10) {
                Logger.INSTANCE.error("EventExperiment", e10);
                return null;
            }
        }

        private Companion() {
        }
    }

    public ExperimentMarker(long j10, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.idKey = j10;
        this.group = group;
    }

    public static /* synthetic */ ExperimentMarker copy$default(ExperimentMarker experimentMarker, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = experimentMarker.idKey;
        }
        if ((i10 & 2) != 0) {
            str = experimentMarker.group;
        }
        return experimentMarker.copy(j10, str);
    }

    public final long component1() {
        return this.idKey;
    }

    @NotNull
    public final String component2() {
        return this.group;
    }

    @NotNull
    public final ExperimentMarker copy(long j10, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        return new ExperimentMarker(j10, group);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExperimentMarker)) {
            return false;
        }
        ExperimentMarker experimentMarker = (ExperimentMarker) obj;
        return this.idKey == experimentMarker.idKey && Intrinsics.areEqual(this.group, experimentMarker.group);
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    public final long getIdKey() {
        return this.idKey;
    }

    public int hashCode() {
        return this.group.hashCode() + (Long.hashCode(this.idKey) * 31);
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("id", Long.valueOf(this.idKey));
        jSONObject.accumulate("group", this.group);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ExperimentMarker(idKey=" + this.idKey + ", group=" + this.group + ")";
    }
}
