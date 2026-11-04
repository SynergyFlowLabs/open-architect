package kotlin.collections;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import qj.g;

/* JADX INFO: loaded from: classes11.dex */
interface MutableMapWithDefault<K, V> extends Map<K, V>, MapWithDefault<K, V>, g {
    @Override // kotlin.collections.MapWithDefault
    @NotNull
    Map<K, V> getMap();
}
