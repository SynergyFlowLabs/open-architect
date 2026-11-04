package com.devtodev.analytics.external.analytics;

import com.devtodev.analytics.internal.core.Core;
import com.devtodev.analytics.internal.logger.Logger;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DTDCustomEventParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f98025a = MapsKt.emptyMap();

    public final void a(String str, Object obj) {
        int size = this.f98025a.size();
        Core core = Core.INSTANCE;
        if (size < core.getAnalyticsProxy().getCustomEventParamsCount()) {
            Map mutableMap = MapsKt.toMutableMap(this.f98025a);
            mutableMap.put(str, obj);
            this.f98025a = mutableMap;
            return;
        }
        Logger.INSTANCE.error("[CustomEventParameters] Limit reached [" + core.getAnalyticsProxy().getCustomEventParamsCount() + "] when adding a new parameter", null);
    }

    public final void add(@NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        a(key, Boolean.valueOf(z10));
    }

    @NotNull
    public final Map<String, Object> getAllParameters() {
        return this.f98025a;
    }

    @NotNull
    public final Map<String, Object> getParams$DTDAnalytics_androidRelease() {
        return this.f98025a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : this.f98025a.entrySet()) {
            sb2.append(((String) entry.getKey()) + ":" + entry.getValue() + "\n");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public final void add(@NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        a(key, Long.valueOf(j10));
    }

    public final void add(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        a(key, value);
    }

    public final void add(@NotNull String key, double d10) {
        Intrinsics.checkNotNullParameter(key, "key");
        a(key, Double.valueOf(d10));
    }
}
