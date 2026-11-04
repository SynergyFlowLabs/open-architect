package io.ktor.util.collections;

import io.ktor.utils.io.o0;
import io.sentry.protocol.b0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@o0
@SourceDebugExtension({"SMAP\nCopyOnWriteHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyOnWriteHashMap.kt\nio/ktor/util/collections/CopyOnWriteHashMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class g<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f296559a = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, b0.b.f306151f);

    @NotNull
    private volatile /* synthetic */ Object current = MapsKt.emptyMap();

    @NotNull
    public final V a(@NotNull K key, @NotNull Function1<? super K, ? extends V> producer) {
        Map map;
        HashMap map2;
        V vInvoke;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(producer, "producer");
        do {
            map = (Map) this.current;
            V v10 = (V) map.get(key);
            if (v10 != null) {
                return v10;
            }
            map2 = new HashMap(map);
            vInvoke = producer.invoke(key);
            map2.put(key, vInvoke);
        } while (!androidx.concurrent.futures.b.a(f296559a, this, map, map2));
        return vInvoke;
    }

    @Nullable
    public final V b(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (V) ((Map) this.current).get(key);
    }

    @Nullable
    public final V c(@NotNull K key, @NotNull V value) {
        Map map;
        HashMap map2;
        V v10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        do {
            map = (Map) this.current;
            if (map.get(key) == value) {
                return value;
            }
            map2 = new HashMap(map);
            v10 = (V) map2.put(key, value);
        } while (!androidx.concurrent.futures.b.a(f296559a, this, map, map2));
        return v10;
    }

    @Nullable
    public final V d(@NotNull K key) {
        Map map;
        HashMap map2;
        V v10;
        Intrinsics.checkNotNullParameter(key, "key");
        do {
            map = (Map) this.current;
            if (map.get(key) == null) {
                return null;
            }
            map2 = new HashMap(map);
            v10 = (V) map2.remove(key);
        } while (!androidx.concurrent.futures.b.a(f296559a, this, map, map2));
        return v10;
    }

    public final void e(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        c(key, value);
    }
}
