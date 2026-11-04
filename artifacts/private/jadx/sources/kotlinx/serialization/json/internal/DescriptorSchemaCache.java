package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSchemaCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n384#2,7:54\n1#3:61\n*S KotlinDebug\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n*L\n25#1:54,7\n*E\n"})
public final class DescriptorSchemaCache {

    @NotNull
    private final Map<SerialDescriptor, Map<Key<Object>, Object>> map = CreateMapForCacheKt.createMapForCache(16);

    public static final class Key<T> {
    }

    @Nullable
    public final <T> T get(@NotNull SerialDescriptor descriptor, @NotNull Key<T> key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<Key<Object>, Object> map = this.map.get(descriptor);
        T t10 = map != null ? (T) map.get(key) : null;
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @NotNull
    public final <T> T getOrPut(@NotNull SerialDescriptor descriptor, @NotNull Key<T> key, @NotNull Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t10 = (T) get(descriptor, key);
        if (t10 != null) {
            return t10;
        }
        T tInvoke = defaultValue.invoke();
        set(descriptor, key, tInvoke);
        return tInvoke;
    }

    public final <T> void set(@NotNull SerialDescriptor descriptor, @NotNull Key<T> key, @NotNull T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<SerialDescriptor, Map<Key<Object>, Object>> map = this.map;
        Map<Key<Object>, Object> mapCreateMapForCache = map.get(descriptor);
        if (mapCreateMapForCache == null) {
            mapCreateMapForCache = CreateMapForCacheKt.createMapForCache(2);
            map.put(descriptor, mapCreateMapForCache);
        }
        mapCreateMapForCache.put(key, value);
    }
}
