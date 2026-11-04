package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

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
public final class d<K, V> extends AbstractMutableMap<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35728e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private c<K, V> f35729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Object f35730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Object f35731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<K, a<V>> f35732d;

    public d(@NotNull c<K, V> cVar) {
        this.f35729a = cVar;
        this.f35730b = cVar.e();
        this.f35731c = this.f35729a.g();
        this.f35732d = this.f35729a.f().c();
    }

    @Nullable
    public final Object a() {
        return this.f35730b;
    }

    @NotNull
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<K, a<V>> b() {
        return this.f35732d;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h.a
    @NotNull
    /* JADX INFO: renamed from: build */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> build2() {
        c<K, V> cVar;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, a<V>> dVarBuild2 = this.f35732d.build2();
        if (dVarBuild2 == this.f35729a.f()) {
            i0.a.a(this.f35730b == this.f35729a.e());
            i0.a.a(this.f35731c == this.f35729a.g());
            cVar = this.f35729a;
        } else {
            cVar = new c<>(this.f35730b, this.f35731c, dVarBuild2);
        }
        this.f35729a = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f35732d.clear();
        i0.c cVar = i0.c.f286699a;
        this.f35730b = cVar;
        this.f35731c = cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f35732d.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(Object obj) {
        a<V> aVar = this.f35732d.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new e(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new g(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.f35732d.size();
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Collection<V> getValues() {
        return new j(this);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        a<V> aVar = this.f35732d.get(k10);
        if (aVar != null) {
            if (aVar.e() == v10) {
                return v10;
            }
            this.f35732d.put(k10, aVar.h(v10));
            return aVar.e();
        }
        if (isEmpty()) {
            this.f35730b = k10;
            this.f35731c = k10;
            this.f35732d.put(k10, new a<>(v10));
            return null;
        }
        Object obj = this.f35731c;
        a<V> aVar2 = this.f35732d.get(obj);
        Intrinsics.checkNotNull(aVar2);
        a<V> aVar3 = aVar2;
        i0.a.a(!aVar3.a());
        this.f35732d.put((K) obj, aVar3.f(k10));
        this.f35732d.put(k10, new a<>(v10, obj));
        this.f35731c = k10;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(Object obj) {
        a<V> aVarRemove = this.f35732d.remove(obj);
        if (aVarRemove == null) {
            return null;
        }
        if (aVarRemove.b()) {
            a<V> aVar = this.f35732d.get(aVarRemove.d());
            Intrinsics.checkNotNull(aVar);
            this.f35732d.put((K) aVarRemove.d(), aVar.f(aVarRemove.c()));
        } else {
            this.f35730b = aVarRemove.c();
        }
        if (aVarRemove.a()) {
            a<V> aVar2 = this.f35732d.get(aVarRemove.c());
            Intrinsics.checkNotNull(aVar2);
            this.f35732d.put((K) aVarRemove.c(), aVar2.g(aVarRemove.d()));
        } else {
            this.f35731c = aVarRemove.d();
        }
        return aVarRemove.e();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        a<V> aVar = this.f35732d.get(obj);
        if (aVar == null || !Intrinsics.areEqual(aVar.e(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
