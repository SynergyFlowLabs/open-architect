package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MapWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1787:1\n1#2:1788\n*E\n"})
class g1<K, V> implements Map<K, V>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a3<K, V> f12243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private l<K, V> f12244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private n0<K, V> f12245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private m3<K, V> f12246d;

    public g1(@NotNull a3<K, V> parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f12243a = parent;
    }

    @NotNull
    public Set<Map.Entry<K, V>> a() {
        l<K, V> lVar = this.f12244b;
        if (lVar != null) {
            return lVar;
        }
        l<K, V> lVar2 = new l<>(this.f12243a);
        this.f12244b = lVar2;
        return lVar2;
    }

    @NotNull
    public Set<K> b() {
        n0<K, V> n0Var = this.f12245c;
        if (n0Var != null) {
            return n0Var;
        }
        n0<K, V> n0Var2 = new n0<>(this.f12243a);
        this.f12245c = n0Var2;
        return n0Var2;
    }

    public int c() {
        return this.f12243a.f12134e;
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
        return this.f12243a.g(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f12243a.h(obj);
    }

    @NotNull
    public Collection<V> d() {
        m3<K, V> m3Var = this.f12246d;
        if (m3Var != null) {
            return m3Var;
        }
        m3<K, V> m3Var2 = new m3<>(this.f12243a);
        this.f12246d = m3Var2;
        return m3Var2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.f12243a, ((g1) obj).f12243a);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f12243a.p(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f12243a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f12243a.x();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
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
        return c();
    }

    @NotNull
    public String toString() {
        return this.f12243a.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return d();
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
