package com.superwall.sdk.storage.core_data;

import androidx.room.s2;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Converters.kt\ncom/superwall/sdk/storage/core_data/Converters\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,110:1\n503#2,7:111\n*S KotlinDebug\n*F\n+ 1 Converters.kt\ncom/superwall/sdk/storage/core_data/Converters\n*L\n47#1:111,7\n*E\n"})
public final class Converters {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<Json> jsonParser$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.storage.core_data.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Converters.jsonParser_delegate$lambda$2();
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Json getJsonParser() {
            return (Json) Converters.jsonParser$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Json jsonParser_delegate$lambda$2() {
        return JsonKt.Json$default(null, new Function1() { // from class: com.superwall.sdk.storage.core_data.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Converters.jsonParser_delegate$lambda$2$lambda$1((JsonBuilder) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jsonParser_delegate$lambda$2$lambda$1(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        int i10 = 2 >> 1;
        Json.setIgnoreUnknownKeys(true);
        Json.setLenient(true);
        return Unit.f312394a;
    }

    @s2
    @NotNull
    public final String fromMap(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return ConvertersKt.fromTypedMap(Companion.getJsonParser(), sanitizeMap(map));
    }

    @NotNull
    public final Map<String, Object> sanitizeMap(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof String) || (value instanceof Number) || (value instanceof Boolean) || (value instanceof List) || (value instanceof Map)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @s2
    @NotNull
    public final Date toDate(long j10) {
        return new Date(j10);
    }

    @s2
    @NotNull
    public final Map<String, Object> toMap(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return sanitizeMap(ConvertersKt.toTypedMap(Companion.getJsonParser(), json));
    }

    @s2
    @Nullable
    public final Long toTimestamp(@Nullable Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }
}
