package kotlin.collections.jdk8;

import java.util.Map;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r1;
import oj.i;

/* JADX INFO: loaded from: classes11.dex */
@i(name = "CollectionsJDK8Kt")
public final class CollectionsJDK8Kt {
    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.2")
    @f
    private static final <K, V> V getOrDefault(Map<? extends K, ? extends V> map, K k10, V v10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.getOrDefault(k10, v10);
    }

    @e1(version = "1.2")
    @f
    private static final <K, V> boolean remove(Map<? extends K, ? extends V> map, K k10, V v10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return r1.k(map).remove(k10, v10);
    }
}
