package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableMapWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1787:1\n1#2:1788\n215#3,2:1789\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableMapWrapper\n*L\n1782#1:1789,2\n*E\n"})
final class d2<K, V> extends g1<K, V> implements Map<K, V>, qj.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k2<K, V> f12185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private i1<K, V> f12186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private v1<K, V> f12187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private n2<K, V> f12188h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(@NotNull k2<K, V> parent) {
        super(parent);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f12185e = parent;
    }

    @Override // androidx.collection.g1
    @NotNull
    public Set<Map.Entry<K, V>> a() {
        i1<K, V> i1Var = this.f12186f;
        if (i1Var != null) {
            return i1Var;
        }
        i1<K, V> i1Var2 = new i1<>(this.f12185e);
        this.f12186f = i1Var2;
        return i1Var2;
    }

    @Override // androidx.collection.g1
    @NotNull
    public Set<K> b() {
        v1<K, V> v1Var = this.f12187g;
        if (v1Var != null) {
            return v1Var;
        }
        v1<K, V> v1Var2 = new v1<>(this.f12185e);
        this.f12187g = v1Var2;
        return v1Var2;
    }

    @Override // androidx.collection.g1, java.util.Map
    public void clear() {
        this.f12185e.K();
    }

    @Override // androidx.collection.g1
    @NotNull
    public Collection<V> d() {
        n2<K, V> n2Var = this.f12188h;
        if (n2Var != null) {
            return n2Var;
        }
        n2<K, V> n2Var2 = new n2<>(this.f12185e);
        this.f12188h = n2Var2;
        return n2Var2;
    }

    @Override // androidx.collection.g1, java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        return this.f12185e.f0(k10, v10);
    }

    @Override // androidx.collection.g1, java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
            this.f12185e.q0(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.g1, java.util.Map
    @Nullable
    public V remove(Object obj) {
        return this.f12185e.l0(obj);
    }
}
