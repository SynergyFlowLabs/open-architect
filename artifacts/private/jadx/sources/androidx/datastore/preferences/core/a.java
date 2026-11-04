package androidx.datastore.preferences.core;

import androidx.annotation.b1;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {
    @NotNull
    public static final <T> Set<T> a(@NotNull Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "set");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.toSet(set));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    @NotNull
    public static final <K, V> Map<K, V> b(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    @NotNull
    public static final n0 c() {
        return l1.c();
    }
}
