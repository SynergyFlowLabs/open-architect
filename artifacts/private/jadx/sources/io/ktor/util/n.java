package io.ktor.util;

import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f296719a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f296720b = 0.75f;

    @io.ktor.utils.io.o0
    @NotNull
    public static final <K, V> Map<K, V> a(@NotNull Function1<? super K, ? extends V> supplier, @NotNull Function1<? super V, Unit> close, int i10) {
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        Intrinsics.checkNotNullParameter(close, "close");
        Map<K, V> mapSynchronizedMap = Collections.synchronizedMap(new z0(supplier, close, i10));
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(...)");
        return mapSynchronizedMap;
    }
}
