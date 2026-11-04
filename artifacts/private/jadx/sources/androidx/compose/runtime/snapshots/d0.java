package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1863#2,2:417\n1734#2,3:455\n114#3,2:419\n157#3,5:421\n162#3:427\n150#3:428\n163#3,5:430\n116#3,7:435\n168#3,2:442\n154#3:444\n171#3:453\n123#3:454\n33#4:426\n2474#5:429\n2364#5,2:445\n1893#5:447\n2366#5,4:448\n1#6:452\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n272#1:417,2\n283#1:455,3\n278#1:419,2\n278#1:421,5\n278#1:427\n278#1:428\n278#1:430,5\n278#1:435,7\n278#1:442,2\n278#1:444\n278#1:453\n278#1:454\n278#1:426\n278#1:429\n278#1:445,2\n278#1:447\n278#1:448,4\n278#1:452\n*E\n"})
final class d0<K, V> extends e0<K, V, K> {
    public d0(@NotNull l0<K, V> l0Var) {
        super(l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) k(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) l(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return c().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!c().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public Void k(K k10) {
        m0.b();
        throw new kotlin.a0();
    }

    @NotNull
    public Void l(@NotNull Collection<? extends K> collection) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a1<K, V> iterator() {
        return new a1<>(c(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) c().k().k().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return c().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (c().remove(it.next()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> collection) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarK;
        int iL;
        m mVarF;
        boolean zD;
        Set set = CollectionsKt.toSet(collection);
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
            for (Map.Entry<K, V> entry : l0VarC.entrySet()) {
                if (!set.contains(entry.getKey())) {
                    aVarC.remove(entry.getKey());
                    z10 = true;
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
                mVarF = m.f36535e.f();
                zD = l0VarC.d((l0.a) b0.A0(aVar2, l0VarC, mVarF), iL, hVarBuild2);
            }
            b0.c0(mVarF, l0VarC);
        } while (!zD);
        return z10;
    }
}
