package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Map;
import java.util.Set;
import kotlin.a1;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,135:1\n53#2:136\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n119#1:136\n*E\n"})
public final class c<K, V> extends AbstractMap<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f35722d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35723e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final c f35724f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f35725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f35726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>> f35727c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <K, V> c<K, V> a() {
            c<K, V> cVar = c.f35724f;
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return cVar;
        }

        private a() {
        }
    }

    static {
        i0.c cVar = i0.c.f286699a;
        f35724f = new c(cVar, cVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f35618c.a());
    }

    public c(@Nullable Object obj, @Nullable Object obj2, @NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>> dVar) {
        this.f35725a = obj;
        this.f35726b = obj2;
        this.f35727c = dVar;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> c() {
        return new l(this);
    }

    @Override // kotlin.collections.AbstractMap
    @NotNull
    /* JADX INFO: renamed from: O1 */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> getValues() {
        return new q(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> T3() {
        return c();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    /* JADX INFO: renamed from: builder */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> c() {
        return new d(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> clear() {
        return f35722d.a();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f35727c.containsKey(obj);
    }

    public final /* bridge */ androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> d() {
        return T3();
    }

    @Nullable
    public final Object e() {
        return this.f35725a;
    }

    @NotNull
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>> f() {
        return this.f35727c;
    }

    @Nullable
    public final Object g() {
        return this.f35726b;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    @Nullable
    public V get(Object obj) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar = this.f35727c.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    @Override // kotlin.collections.AbstractMap
    @a1
    @NotNull
    public final Set<Map.Entry<K, V>> getEntries() {
        return c();
    }

    @Override // kotlin.collections.AbstractMap
    public int getSize() {
        return this.f35727c.size();
    }

    public final /* bridge */ androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> h() {
        return getKeys();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c<K, V> put(K k10, V v10) {
        if (isEmpty()) {
            return new c<>(k10, k10, this.f35727c.put(k10, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<>(v10)));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar = this.f35727c.get(k10);
        if (aVar != null) {
            if (aVar.e() == v10) {
                return this;
            }
            return new c<>(this.f35725a, this.f35726b, this.f35727c.put(k10, aVar.h(v10)));
        }
        Object obj = this.f35726b;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar2 = this.f35727c.get(obj);
        Intrinsics.checkNotNull(aVar2);
        return new c<>(this.f35725a, k10, this.f35727c.put((K) obj, aVar2.f(k10)).put(k10, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<>(v10, obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public c<K, V> remove(K k10) {
        ?? r10;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar = this.f35727c.get(k10);
        if (aVar == null) {
            return this;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>> dVarRemove = this.f35727c.remove(k10);
        if (aVar.b()) {
            r10 = dVarRemove;
            Object obj = dVarRemove.get(aVar.d());
            Intrinsics.checkNotNull(obj);
            r10 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>>) dVarRemove.put(aVar.d(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a) obj).f(aVar.c()));
        }
        r10 = dVarRemove;
        ?? Put = r10;
        if (aVar.a()) {
            Object obj2 = r10.get(aVar.c());
            Intrinsics.checkNotNull(obj2);
            Put = r10.put(aVar.c(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a) obj2).g(aVar.d()));
        }
        return new c<>(!aVar.b() ? aVar.c() : this.f35725a, !aVar.a() ? aVar.d() : this.f35726b, Put);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c<K, V> remove(K k10, V v10) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar = this.f35727c.get(k10);
        return (aVar != null && Intrinsics.areEqual(aVar.e(), v10)) ? remove(k10) : this;
    }

    public final /* bridge */ androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> l() {
        return getValues();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> putAll(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> aVarC = c();
        aVarC.putAll(map);
        return aVarC.build2();
    }

    @Override // kotlin.collections.AbstractMap
    @NotNull
    /* JADX INFO: renamed from: r */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> getKeys() {
        return new n(this);
    }
}
