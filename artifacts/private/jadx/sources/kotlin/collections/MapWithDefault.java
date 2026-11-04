package kotlin.collections;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import qj.a;

/* JADX INFO: loaded from: classes11.dex */
interface MapWithDefault<K, V> extends Map<K, V>, a {
    @NotNull
    Map<K, V> getMap();

    V getOrImplicitDefault(K k10);
}
