package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public class f<K, V> extends AbstractMutableMap<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f35627g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private d<K, V> f35628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private i0.f f35629b = new i0.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private u<K, V> f35630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private V f35631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35633f;

    public f(@NotNull d<K, V> dVar) {
        this.f35628a = dVar;
        this.f35630c = this.f35628a.f();
        this.f35633f = this.f35628a.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h.a
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d<K, V> build2() {
        d<K, V> dVar;
        if (this.f35630c == this.f35628a.f()) {
            dVar = this.f35628a;
        } else {
            this.f35629b = new i0.f();
            dVar = new d<>(this.f35630c, size());
        }
        this.f35628a = dVar;
        return dVar;
    }

    public final int b() {
        return this.f35632e;
    }

    @NotNull
    public final u<K, V> c() {
        return this.f35630c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        u<K, V> uVarA = u.f35659e.a();
        Intrinsics.checkNotNull(uVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f35630c = uVarA;
        j(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f35630c.n(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Nullable
    public final V d() {
        return this.f35631d;
    }

    @NotNull
    public final i0.f e() {
        return this.f35629b;
    }

    public final void f(int i10) {
        this.f35632e = i10;
    }

    public final void g(@NotNull u<K, V> uVar) {
        this.f35630c = uVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f35630c.r(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new h(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new j(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.f35633f;
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Collection<V> getValues() {
        return new l(this);
    }

    public final void h(@Nullable V v10) {
        this.f35631d = v10;
    }

    protected final void i(@NotNull i0.f fVar) {
        this.f35629b = fVar;
    }

    public void j(int i10) {
        this.f35633f = i10;
        this.f35632e++;
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        this.f35631d = null;
        this.f35630c = this.f35630c.G(k10 != null ? k10.hashCode() : 0, k10, v10, 0, this);
        return this.f35631d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        d<K, V> dVarBuild = map instanceof d ? (d) map : null;
        if (dVarBuild == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarBuild = fVar != null ? fVar.build2() : null;
        }
        if (dVarBuild == null) {
            super.putAll(map);
            return;
        }
        i0.b bVar = new i0.b(0, 1, null);
        int size = size();
        u<K, V> uVar = this.f35630c;
        u<K, V> uVarF = dVarBuild.f();
        Intrinsics.checkNotNull(uVarF, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f35630c = uVar.H(uVarF, 0, bVar, this);
        int size2 = (dVarBuild.size() + size) - bVar.d();
        if (size != size2) {
            j(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(Object obj) {
        this.f35631d = null;
        u uVarJ = this.f35630c.J(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (uVarJ == null) {
            uVarJ = u.f35659e.a();
            Intrinsics.checkNotNull(uVarJ, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f35630c = uVarJ;
        return this.f35631d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        u uVarK = this.f35630c.K(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (uVarK == null) {
            uVarK = u.f35659e.a();
            Intrinsics.checkNotNull(uVarK, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f35630c = uVarK;
        return size != size();
    }
}
