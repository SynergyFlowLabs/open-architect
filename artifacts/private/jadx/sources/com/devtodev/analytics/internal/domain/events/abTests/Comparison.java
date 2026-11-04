package com.devtodev.analytics.internal.domain.events.abTests;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Comparison {

    @NotNull
    private final String key;

    @NotNull
    private final Object value;

    public Comparison(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.key = key;
        this.value = value;
    }

    public static /* synthetic */ Comparison copy$default(Comparison comparison, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = comparison.key;
        }
        if ((i10 & 2) != 0) {
            obj = comparison.value;
        }
        return comparison.copy(str, obj);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @NotNull
    public final Object component2() {
        return this.value;
    }

    @NotNull
    public final Comparison copy(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Comparison(key, value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Comparison)) {
            return false;
        }
        Comparison comparison = (Comparison) obj;
        return Intrinsics.areEqual(this.key, comparison.key) && Intrinsics.areEqual(this.value, comparison.value);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("key", this.key);
        jSONObject.accumulate("value", this.value);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "Comparison(key=" + this.key + ", value=" + this.value + ")";
    }
}
