package com.devtodev.analytics.internal.helpfultools;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ABTestDefaultParamsCache {

    @NotNull
    private Map<String, ? extends Object> savedDefaults = MapsKt.emptyMap();

    @NotNull
    public final Map<String, Object> getDefaults() {
        return this.savedDefaults;
    }

    public final void setDefaults(@NotNull Map<String, ? extends Object> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.savedDefaults = values;
    }
}
