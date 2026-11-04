package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1187#2,2:417\n1261#2,4:419\n1734#2,3:459\n114#3,2:423\n157#3,5:425\n162#3:431\n150#3:432\n163#3,5:434\n116#3,7:439\n168#3,2:446\n154#3:448\n171#3:457\n123#3:458\n33#4:430\n2474#5:433\n2364#5,2:449\n1893#5:451\n2366#5,4:452\n1#6:456\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n*L\n248#1:417,2\n248#1:419,4\n257#1:459,3\n249#1:423,2\n249#1:425,5\n249#1:431\n249#1:432\n249#1:434,5\n249#1:439,7\n249#1:446,2\n249#1:448\n249#1:457\n249#1:458\n249#1:430\n249#1:433\n249#1:449,2\n249#1:451\n249#1:452,4\n249#1:456\n*E\n"})
final class c0<K, V> extends e0<K, V, Map.Entry<K, V>> {
    public c0(@NotNull l0<K, V> l0Var) {
        super(l0Var);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) k((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) l(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (r1.I(obj)) {
            return m((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new y0(c(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) c().k().k().entrySet()).iterator());
    }

    @NotNull
    public Void k(@NotNull Map.Entry<K, V> entry) {
        m0.b();
        throw new kotlin.a0();
    }

    @NotNull
    public Void l(@NotNull Collection<? extends Map.Entry<K, V>> collection) {
        m0.b();
        throw new kotlin.a0();
    }

    public boolean m(@NotNull Map.Entry<K, V> entry) {
        return Intrinsics.areEqual(c().get(entry.getKey()), entry.getValue());
    }

    public boolean n(@NotNull Map.Entry<K, V> entry) {
        return c().remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (r1.I(obj)) {
            return n((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (c().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> collection) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarK;
        int iL;
        m mVarF;
        boolean zD;
        Collection<?> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(collection2, 10)), 16));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = TuplesKt.to(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        l0<K, V> l0VarC = c();
        boolean z10 = false;
        do {
            synchronized (m0.f36542a) {
                try {
                    e1 e1VarA = l0VarC.A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    l0.a aVar = (l0.a) b0.L((l0.a) e1VarA);
                    hVarK = aVar.k();
                    iL = aVar.l();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(hVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> aVarC = hVarK.c();
            for (Map.Entry<K, V> entry2 : l0VarC.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.areEqual(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    aVarC.remove(entry2.getKey());
                    z10 = true;
                    boolean z11 = false | true;
                }
            }
            Unit unit2 = Unit.f312394a;
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarBuild2 = aVarC.build2();
            if (Intrinsics.areEqual(hVarBuild2, hVarK)) {
                break;
            }
            e1 e1VarA2 = l0VarC.A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            l0.a aVar2 = (l0.a) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zD = l0VarC.d((l0.a) b0.A0(aVar2, l0VarC, mVarF), iL, hVarBuild2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            b0.c0(mVarF, l0VarC);
        } while (!zD);
        return z10;
    }
}
