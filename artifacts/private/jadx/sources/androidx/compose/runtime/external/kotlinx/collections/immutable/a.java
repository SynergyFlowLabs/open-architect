package androidx.compose.runtime.external.kotlinx.collections.immutable;

import g0.o;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
public final class a {
    @NotNull
    public static final <K, V> h<K, V> A(@NotNull h<? extends K, ? extends V> hVar, @NotNull Function1<? super Map<K, V>, Unit> function1) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> aVarBuilder = hVar.c();
        function1.invoke(aVarBuilder);
        return aVarBuilder.build2();
    }

    @NotNull
    public static final <T> i<T> B(@NotNull i<? extends T> iVar, @NotNull Function1<? super Set<T>, Unit> function1) {
        i.a<? extends T> aVarBuilder = iVar.builder();
        function1.invoke(aVarBuilder);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <K, V> h<K, V> C() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f35618c.a();
    }

    @NotNull
    public static final <K, V> h<K, V> D(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, V> dVarA = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f35618c.a();
        Intrinsics.checkNotNull(dVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<K, V> aVarBuilder = dVarA.c();
        MapsKt.putAll(aVarBuilder, pairArr);
        return aVarBuilder.build2();
    }

    @NotNull
    public static final <E> i<E> E() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.f35682c.a();
    }

    @NotNull
    public static final <E> i<E> F(@NotNull E... eArr) {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.f35682c.a().addAll((Collection) ArraysKt.asList(eArr));
    }

    @NotNull
    public static final <E> g<E> G() {
        return o.b();
    }

    @NotNull
    public static final <E> g<E> H(@NotNull E... eArr) {
        return o.b().addAll((Collection) ArraysKt.asList(eArr));
    }

    @NotNull
    public static final <K, V> h<K, V> I() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c.f35722d.a();
    }

    @NotNull
    public static final <K, V> h<K, V> J(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c<K, V> cVarA = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c.f35722d.a();
        Intrinsics.checkNotNull(cVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<K, V> aVarBuilder = cVarA.c();
        MapsKt.putAll(aVarBuilder, pairArr);
        return aVarBuilder.build2();
    }

    @NotNull
    public static final <E> i<E> K() {
        return h0.b.f280068d.a();
    }

    @NotNull
    public static final <E> i<E> L(@NotNull E... eArr) {
        return h0.b.f280068d.a().addAll((Collection) ArraysKt.asList(eArr));
    }

    @NotNull
    public static final <E> f<E> M(@NotNull f<? extends E> fVar, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return fVar.addAll((Collection<? extends Object>) iterable);
        }
        f.a<? extends E> aVarBuilder = fVar.builder();
        CollectionsKt.addAll(aVarBuilder, iterable);
        return aVarBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> f<E> N(@NotNull f<? extends E> fVar, E e10) {
        return fVar.add((Object) e10);
    }

    @NotNull
    public static final <E> f<E> O(@NotNull f<? extends E> fVar, @NotNull Sequence<? extends E> sequence) {
        f.a<? extends E> aVarBuilder = fVar.builder();
        CollectionsKt.addAll(aVarBuilder, sequence);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <E> f<E> P(@NotNull f<? extends E> fVar, @NotNull E[] eArr) {
        f.a<? extends E> aVarBuilder = fVar.builder();
        CollectionsKt.addAll(aVarBuilder, eArr);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <E> g<E> Q(@NotNull g<? extends E> gVar, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return gVar.addAll((Collection<? extends Object>) iterable);
        }
        g.a<? extends E> aVarBuilder = gVar.builder();
        CollectionsKt.addAll(aVarBuilder, iterable);
        return aVarBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> g<E> R(@NotNull g<? extends E> gVar, E e10) {
        return gVar.add((Object) e10);
    }

    @NotNull
    public static final <E> g<E> S(@NotNull g<? extends E> gVar, @NotNull Sequence<? extends E> sequence) {
        g.a<? extends E> aVarBuilder = gVar.builder();
        CollectionsKt.addAll(aVarBuilder, sequence);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <E> g<E> T(@NotNull g<? extends E> gVar, @NotNull E[] eArr) {
        g.a<? extends E> aVarBuilder = gVar.builder();
        CollectionsKt.addAll(aVarBuilder, eArr);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <K, V> h<K, V> U(@NotNull h<? extends K, ? extends V> hVar, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return d0(hVar, iterable);
    }

    @NotNull
    public static final <K, V> h<K, V> V(@NotNull h<? extends K, ? extends V> hVar, @NotNull Map<? extends K, ? extends V> map) {
        return e0(hVar, map);
    }

    @NotNull
    public static final <K, V> h<K, V> W(@NotNull h<? extends K, ? extends V> hVar, @NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return hVar.put((Object) pair.getFirst(), (Object) pair.getSecond());
    }

    @NotNull
    public static final <K, V> h<K, V> X(@NotNull h<? extends K, ? extends V> hVar, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        return f0(hVar, sequence);
    }

    @NotNull
    public static final <K, V> h<K, V> Y(@NotNull h<? extends K, ? extends V> hVar, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        return g0(hVar, pairArr);
    }

    @NotNull
    public static final <E> i<E> Z(@NotNull i<? extends E> iVar, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return iVar.addAll((Collection<? extends Object>) iterable);
        }
        i.a<? extends E> aVarBuilder = iVar.builder();
        CollectionsKt.addAll(aVarBuilder, iterable);
        return aVarBuilder.build();
    }

    @l(message = "Use persistentHashMapOf instead.", replaceWith = @b1(expression = "persistentHashMapOf(*pairs)", imports = {}))
    @NotNull
    public static final <K, V> h<K, V> a(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return D((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> i<E> a0(@NotNull i<? extends E> iVar, E e10) {
        return iVar.add((Object) e10);
    }

    @l(message = "Use persistentHashSetOf instead.", replaceWith = @b1(expression = "persistentHashSetOf(*elements)", imports = {}))
    @NotNull
    public static final <E> i<E> b(@NotNull E... eArr) {
        return F(Arrays.copyOf(eArr, eArr.length));
    }

    @NotNull
    public static final <E> i<E> b0(@NotNull i<? extends E> iVar, @NotNull Sequence<? extends E> sequence) {
        i.a<? extends E> aVarBuilder = iVar.builder();
        CollectionsKt.addAll(aVarBuilder, sequence);
        return aVarBuilder.build();
    }

    @l(message = "Use persistentListOf instead.", replaceWith = @b1(expression = "persistentListOf()", imports = {}))
    @NotNull
    public static final <E> g<E> c() {
        return G();
    }

    @NotNull
    public static final <E> i<E> c0(@NotNull i<? extends E> iVar, @NotNull E[] eArr) {
        i.a<? extends E> aVarBuilder = iVar.builder();
        CollectionsKt.addAll(aVarBuilder, eArr);
        return aVarBuilder.build();
    }

    @l(message = "Use persistentListOf instead.", replaceWith = @b1(expression = "persistentListOf(*elements)", imports = {}))
    @NotNull
    public static final <E> g<E> d(@NotNull E... eArr) {
        return H(Arrays.copyOf(eArr, eArr.length));
    }

    @NotNull
    public static final <K, V> h<K, V> d0(@NotNull h<? extends K, ? extends V> hVar, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> aVarBuilder = hVar.c();
        MapsKt.putAll(aVarBuilder, iterable);
        return aVarBuilder.build2();
    }

    @l(message = "Use persistentMapOf instead.", replaceWith = @b1(expression = "persistentMapOf(*pairs)", imports = {}))
    @NotNull
    public static final <K, V> h<K, V> e(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return J((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> h<K, V> e0(@NotNull h<? extends K, ? extends V> hVar, @NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return hVar.putAll((Map<? extends Object, ? extends Object>) map);
    }

    @l(message = "Use persistentSetOf instead.", replaceWith = @b1(expression = "persistentSetOf()", imports = {}))
    @NotNull
    public static final <E> i<E> f() {
        return K();
    }

    @NotNull
    public static final <K, V> h<K, V> f0(@NotNull h<? extends K, ? extends V> hVar, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> aVarBuilder = hVar.c();
        MapsKt.putAll(aVarBuilder, sequence);
        return aVarBuilder.build2();
    }

    @l(message = "Use persistentSetOf instead.", replaceWith = @b1(expression = "persistentSetOf(*elements)", imports = {}))
    @NotNull
    public static final <E> i<E> g(@NotNull E... eArr) {
        return L(Arrays.copyOf(eArr, eArr.length));
    }

    @NotNull
    public static final <K, V> h<K, V> g0(@NotNull h<? extends K, ? extends V> hVar, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> aVarBuilder = hVar.c();
        MapsKt.putAll(aVarBuilder, pairArr);
        return aVarBuilder.build2();
    }

    @NotNull
    public static final <E> i<E> h(@NotNull f<? extends E> fVar, @NotNull Iterable<? extends E> iterable) {
        return i(x0(fVar), iterable);
    }

    @NotNull
    public static final c<Character> h0(@NotNull CharSequence charSequence) {
        return s0(charSequence);
    }

    @NotNull
    public static final <E> i<E> i(@NotNull i<? extends E> iVar, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return iVar.retainAll((Collection<? extends Object>) iterable);
        }
        i.a<? extends E> aVarBuilder = iVar.builder();
        CollectionsKt.retainAll(aVarBuilder, iterable);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <T> c<T> i0(@NotNull Iterable<? extends T> iterable) {
        c<T> cVar = iterable instanceof c ? (c) iterable : null;
        return cVar == null ? t0(iterable) : cVar;
    }

    @NotNull
    public static final <E> f<E> j(@NotNull f<? extends E> fVar, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return fVar.removeAll((Collection<? extends Object>) iterable);
        }
        f.a<? extends E> aVarBuilder = fVar.builder();
        CollectionsKt.removeAll(aVarBuilder, iterable);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <T> c<T> j0(@NotNull Sequence<? extends T> sequence) {
        return u0(sequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> f<E> k(@NotNull f<? extends E> fVar, E e10) {
        return fVar.remove((Object) e10);
    }

    @NotNull
    public static final <K, V> d<K, V> k0(@NotNull Map<K, ? extends V> map) {
        d<K, V> dVar = map instanceof d ? (d) map : null;
        if (dVar != null) {
            return dVar;
        }
        h.a aVar = map instanceof h.a ? (h.a) map : null;
        h<K, V> hVarBuild = aVar != null ? aVar.build2() : null;
        return hVarBuild != null ? hVarBuild : I().putAll((Map) map);
    }

    @NotNull
    public static final <E> f<E> l(@NotNull f<? extends E> fVar, @NotNull Sequence<? extends E> sequence) {
        f.a<? extends E> aVarBuilder = fVar.builder();
        CollectionsKt.removeAll(aVarBuilder, sequence);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <T> e<T> l0(@NotNull Iterable<? extends T> iterable) {
        int i10 = 1 >> 0;
        e<T> eVar = iterable instanceof e ? (e) iterable : null;
        if (eVar != null) {
            return eVar;
        }
        i.a aVar = iterable instanceof i.a ? (i.a) iterable : null;
        i iVarBuild = aVar != null ? aVar.build() : null;
        return iVarBuild != null ? iVarBuild : Z(K(), iterable);
    }

    @NotNull
    public static final <E> f<E> m(@NotNull f<? extends E> fVar, @NotNull E[] eArr) {
        f.a<? extends E> aVarBuilder = fVar.builder();
        CollectionsKt.removeAll(aVarBuilder, eArr);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <T> e<T> m0(@NotNull Sequence<? extends T> sequence) {
        return y0(sequence);
    }

    @NotNull
    public static final <E> g<E> n(@NotNull g<? extends E> gVar, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return gVar.removeAll((Collection<? extends Object>) iterable);
        }
        g.a<? extends E> aVarBuilder = gVar.builder();
        CollectionsKt.removeAll(aVarBuilder, iterable);
        return aVarBuilder.build();
    }

    @NotNull
    public static final i<Character> n0(@NotNull CharSequence charSequence) {
        return w0(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> g<E> o(@NotNull g<? extends E> gVar, E e10) {
        return gVar.remove((Object) e10);
    }

    @NotNull
    public static final <K, V> h<K, V> o0(@NotNull Map<K, ? extends V> map) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d dVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d) map : null;
        if (dVar != null) {
            return dVar;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f fVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f) map : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, V> dVarBuild = fVar != null ? fVar.build2() : null;
        return dVarBuild != null ? dVarBuild : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f35618c.a().putAll((Map) map);
    }

    @NotNull
    public static final <E> g<E> p(@NotNull g<? extends E> gVar, @NotNull Sequence<? extends E> sequence) {
        g.a<? extends E> aVarBuilder = gVar.builder();
        CollectionsKt.removeAll(aVarBuilder, sequence);
        return aVarBuilder.build();
    }

    @NotNull
    public static final i<Character> p0(@NotNull CharSequence charSequence) {
        i.a aVarBuilder = E().builder();
        StringsKt.e9(charSequence, aVarBuilder);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <E> g<E> q(@NotNull g<? extends E> gVar, @NotNull E[] eArr) {
        g.a<? extends E> aVarBuilder = gVar.builder();
        CollectionsKt.removeAll(aVarBuilder, eArr);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <T> i<T> q0(@NotNull Iterable<? extends T> iterable) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a aVar = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a) iterable : null;
        if (aVar != null) {
            return aVar;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b bVar = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b) iterable : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a aVarBuild = bVar != null ? bVar.build() : null;
        return aVarBuild != null ? aVarBuild : Z(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.f35682c.a(), iterable);
    }

    @NotNull
    public static final <K, V> h<K, V> r(@NotNull h<? extends K, ? extends V> hVar, @NotNull Iterable<? extends K> iterable) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> aVarBuilder = hVar.c();
        CollectionsKt.removeAll(aVarBuilder.keySet(), iterable);
        return aVarBuilder.build2();
    }

    @NotNull
    public static final <T> i<T> r0(@NotNull Sequence<? extends T> sequence) {
        return b0(E(), sequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> h<K, V> s(@NotNull h<? extends K, ? extends V> hVar, K k10) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return hVar.remove((Object) k10);
    }

    @NotNull
    public static final g<Character> s0(@NotNull CharSequence charSequence) {
        g.a aVarBuilder = G().builder();
        StringsKt.e9(charSequence, aVarBuilder);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <K, V> h<K, V> t(@NotNull h<? extends K, ? extends V> hVar, @NotNull Sequence<? extends K> sequence) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> aVarBuilder = hVar.c();
        CollectionsKt.removeAll(aVarBuilder.keySet(), sequence);
        return aVarBuilder.build2();
    }

    @NotNull
    public static final <T> g<T> t0(@NotNull Iterable<? extends T> iterable) {
        g<T> gVar = iterable instanceof g ? (g) iterable : null;
        if (gVar != null) {
            return gVar;
        }
        g.a aVar = iterable instanceof g.a ? (g.a) iterable : null;
        g<T> gVarBuild = aVar != null ? aVar.build() : null;
        return gVarBuild == null ? Q(G(), iterable) : gVarBuild;
    }

    @NotNull
    public static final <K, V> h<K, V> u(@NotNull h<? extends K, ? extends V> hVar, @NotNull K[] kArr) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> aVarBuilder = hVar.c();
        CollectionsKt.removeAll(aVarBuilder.keySet(), kArr);
        return aVarBuilder.build2();
    }

    @NotNull
    public static final <T> g<T> u0(@NotNull Sequence<? extends T> sequence) {
        return S(G(), sequence);
    }

    @NotNull
    public static final <E> i<E> v(@NotNull i<? extends E> iVar, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return iVar.removeAll((Collection<? extends Object>) iterable);
        }
        i.a<? extends E> aVarBuilder = iVar.builder();
        CollectionsKt.removeAll(aVarBuilder, iterable);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <K, V> h<K, V> v0(@NotNull Map<K, ? extends V> map) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c cVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c) map : null;
        if (cVar != null) {
            return cVar;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.d dVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.d ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.d) map : null;
        h<K, V> hVarBuild = dVar != null ? dVar.build2() : null;
        return hVarBuild == null ? androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c.f35722d.a().putAll((Map) map) : hVarBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> i<E> w(@NotNull i<? extends E> iVar, E e10) {
        return iVar.remove((Object) e10);
    }

    @NotNull
    public static final i<Character> w0(@NotNull CharSequence charSequence) {
        i.a aVarBuilder = K().builder();
        StringsKt.e9(charSequence, aVarBuilder);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <E> i<E> x(@NotNull i<? extends E> iVar, @NotNull Sequence<? extends E> sequence) {
        i.a<? extends E> aVarBuilder = iVar.builder();
        CollectionsKt.removeAll(aVarBuilder, sequence);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <T> i<T> x0(@NotNull Iterable<? extends T> iterable) {
        h0.b bVar = iterable instanceof h0.b ? (h0.b) iterable : null;
        if (bVar != null) {
            return bVar;
        }
        h0.c cVar = iterable instanceof h0.c ? (h0.c) iterable : null;
        i<T> iVarBuild = cVar != null ? cVar.build() : null;
        return iVarBuild == null ? Z(h0.b.f280068d.a(), iterable) : iVarBuild;
    }

    @NotNull
    public static final <E> i<E> y(@NotNull i<? extends E> iVar, @NotNull E[] eArr) {
        i.a<? extends E> aVarBuilder = iVar.builder();
        CollectionsKt.removeAll(aVarBuilder, eArr);
        return aVarBuilder.build();
    }

    @NotNull
    public static final <T> i<T> y0(@NotNull Sequence<? extends T> sequence) {
        return b0(K(), sequence);
    }

    @NotNull
    public static final <T> g<T> z(@NotNull g<? extends T> gVar, @NotNull Function1<? super List<T>, Unit> function1) {
        g.a<? extends T> aVarBuilder = gVar.builder();
        function1.invoke(aVarBuilder);
        return aVarBuilder.build();
    }
}
