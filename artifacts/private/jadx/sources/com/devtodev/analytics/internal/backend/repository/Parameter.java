package com.devtodev.analytics.internal.backend.repository;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Parameter {

    @NotNull
    private String key;

    @NotNull
    private Map<String, ? extends Object> values;

    public Parameter(@NotNull String key, @NotNull Map<String, ? extends Object> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        this.key = key;
        this.values = values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Parameter copy$default(Parameter parameter, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = parameter.key;
        }
        if ((i10 & 2) != 0) {
            map = parameter.values;
        }
        return parameter.copy(str, map);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.values;
    }

    @NotNull
    public final Parameter copy(@NotNull String key, @NotNull Map<String, ? extends Object> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        return new Parameter(key, values);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Parameter)) {
            return false;
        }
        Parameter parameter = (Parameter) obj;
        return Intrinsics.areEqual(this.key, parameter.key) && Intrinsics.areEqual(this.values, parameter.values);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final Map<String, Object> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() + (this.key.hashCode() * 31);
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final void setValues(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.values = map;
    }

    @NotNull
    public String toString() {
        return "Parameter(key=" + this.key + ", values=" + this.values + ")";
    }
}
