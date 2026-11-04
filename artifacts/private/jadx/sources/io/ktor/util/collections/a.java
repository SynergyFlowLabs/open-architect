package io.ktor.util.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    @l(level = n.ERROR, message = "Will be dropped with new memory model enabled by default", replaceWith = @b1(expression = "mutableListOf<V>()", imports = {}))
    @NotNull
    public static final <V> List<V> a() {
        return new ArrayList();
    }

    @l(level = n.ERROR, message = "Will be dropped with new memory model enabled by default", replaceWith = @b1(expression = "mutableListOf(values)", imports = {}))
    @NotNull
    public static final <T> List<T> b(@NotNull T... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return CollectionsKt.mutableListOf(Arrays.copyOf(values, values.length));
    }

    @l(level = n.ERROR, message = "Will be dropped with new memory model enabled by default", replaceWith = @b1(expression = "mutableMapOf()", imports = {}))
    @NotNull
    public static final <K, V> Map<K, V> c(int i10) {
        return new LinkedHashMap(i10);
    }

    public static /* synthetic */ Map d(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        return c(i10);
    }
}
