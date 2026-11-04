package f0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.e;
import androidx.compose.runtime.internal.w0;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class c<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.d<K, V>, Map<K, V>, qj.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f274913e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<K, V> f274914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e<K> f274915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> f274916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final e<Map.Entry<K, V>> f274917d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Map<K, ? extends V> map) {
        this.f274914a = map;
        this.f274915b = new d(map.keySet());
        this.f274916c = new a(map.values());
        this.f274917d = new d(map.entrySet());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> O1() {
        return this.f274916c;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @NotNull
    public e<Map.Entry<K, V>> T3() {
        return this.f274917d;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ e<Map.Entry<K, V>> entrySet() {
        return T3();
    }

    public int b() {
        return this.f274914a.size();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ e<K> keySet() {
        return r();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f274914a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f274914a.containsValue(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> values() {
        return O1();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return this.f274914a.equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f274914a.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f274914a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f274914a.isEmpty();
    }

    @Override // java.util.Map
    public V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V putIfAbsent(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @NotNull
    public e<K> r() {
        return this.f274915b;
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V replace(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return b();
    }

    @NotNull
    public String toString() {
        return this.f274914a.toString();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(K k10, V v10, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
