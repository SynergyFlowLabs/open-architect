package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class CreateMapForCacheKt {
    @NotNull
    public static final <K, V> Map<K, V> createMapForCache(int i10) {
        return new ConcurrentHashMap(i10);
    }
}
