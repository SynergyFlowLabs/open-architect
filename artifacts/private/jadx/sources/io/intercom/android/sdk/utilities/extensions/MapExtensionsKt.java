package io.intercom.android.sdk.utilities.extensions;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class MapExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> V safeGetOrDefault(@NotNull Map<K, ? extends V> map, K k10, V v10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.getOrDefault(k10, v10);
    }
}
