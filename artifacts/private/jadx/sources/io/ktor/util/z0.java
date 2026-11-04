package io.ktor.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nio/ktor/util/LRUCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class z0<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<K, V> f296830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<V, Unit> f296831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f296832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(@NotNull Function1<? super K, ? extends V> supplier, @NotNull Function1<? super V, Unit> close, int i10) {
        super(10, 0.75f, true);
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        Intrinsics.checkNotNullParameter(close, "close");
        this.f296830a = supplier;
        this.f296831b = close;
        this.f296832c = i10;
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> a() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> b() {
        return super.keySet();
    }

    public /* bridge */ int c() {
        return super.size();
    }

    public /* bridge */ Collection<Object> d() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) a();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (this.f296832c == 0) {
            return this.f296830a.invoke(obj);
        }
        synchronized (this) {
            V v10 = (V) super.get(obj);
            if (v10 != null) {
                return v10;
            }
            V vInvoke = this.f296830a.invoke(obj);
            put(obj, vInvoke);
            return vInvoke;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) b();
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(@NotNull Map.Entry<? extends K, ? extends V> eldest) {
        Intrinsics.checkNotNullParameter(eldest, "eldest");
        boolean z10 = size() > this.f296832c;
        if (z10) {
            this.f296831b.invoke(eldest.getValue());
        }
        return z10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) d();
    }
}
