package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

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
@SourceDebugExtension({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
public class d<K, V> extends AbstractMap<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f35618c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35619d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final d f35620e = new d(u.f35659e.a(), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u<K, V> f35621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35622b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <K, V> d<K, V> a() {
            d<K, V> dVar = d.f35620e;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }

        private a() {
        }
    }

    public d(@NotNull u<K, V> uVar, int i10) {
        this.f35621a = uVar;
        this.f35622b = i10;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> d() {
        return new o(this);
    }

    @Override // kotlin.collections.AbstractMap
    @NotNull
    /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> getValues() {
        return new s(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> T3() {
        return d();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    public f<K, V> c() {
        return new f<>(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> clear() {
        return f35618c.a();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f35621a.n(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final /* bridge */ androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> e() {
        return T3();
    }

    @NotNull
    public final u<K, V> f() {
        return this.f35621a;
    }

    public final /* bridge */ androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> g() {
        return getKeys();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f35621a.r(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractMap
    @a1
    @NotNull
    public final Set<Map.Entry<K, V>> getEntries() {
        return d();
    }

    @Override // kotlin.collections.AbstractMap
    public int getSize() {
        return this.f35622b;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d<K, V> put(K k10, V v10) {
        u.b<K, V> bVarS = this.f35621a.S(k10 != null ? k10.hashCode() : 0, k10, v10, 0);
        return bVarS == null ? this : new d<>(bVarS.a(), size() + bVarS.b());
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d<K, V> remove(K k10) {
        u<K, V> uVarT = this.f35621a.T(k10 != null ? k10.hashCode() : 0, k10, 0);
        if (this.f35621a == uVarT) {
            return this;
        }
        return uVarT == null ? f35618c.a() : new d<>(uVarT, size() - 1);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public d<K, V> remove(K k10, V v10) {
        u<K, V> uVarU = this.f35621a.U(k10 != null ? k10.hashCode() : 0, k10, v10, 0);
        if (this.f35621a == uVarU) {
            return this;
        }
        return uVarU == null ? f35618c.a() : new d<>(uVarU, size() - 1);
    }

    public final /* bridge */ androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> k() {
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
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> getKeys() {
        return new q(this);
    }
}
