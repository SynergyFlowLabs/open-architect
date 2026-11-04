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
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n114#2,2:417\n157#2,5:419\n162#2:425\n150#2:426\n163#2,5:428\n116#2,7:433\n168#2,2:440\n154#2:442\n171#2:451\n123#2:452\n114#2,2:453\n157#2,5:455\n162#2:461\n150#2:462\n163#2,5:464\n116#2,7:469\n168#2,2:476\n154#2:478\n171#2:487\n123#2:488\n33#3:424\n33#3:460\n2474#4:427\n2364#4,2:443\n1893#4:445\n2366#4,4:446\n2474#4:463\n2364#4,2:479\n1893#4:481\n2366#4,4:482\n1#5:450\n1#5:486\n1734#6,3:489\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n*L\n299#1:417,2\n299#1:419,5\n299#1:425\n299#1:426\n299#1:428,5\n299#1:433,7\n299#1:440,2\n299#1:442\n299#1:451\n299#1:452\n304#1:453,2\n304#1:455,5\n304#1:461\n304#1:462\n304#1:464,5\n304#1:469,7\n304#1:476,2\n304#1:478\n304#1:487\n304#1:488\n299#1:424\n304#1:460\n299#1:427\n299#1:443,2\n299#1:445\n299#1:446,4\n304#1:463\n304#1:479,2\n304#1:481\n304#1:482,4\n299#1:450\n304#1:486\n310#1:489,3\n*E\n"})
final class f0<K, V> extends e0<K, V, V> {
    public f0(@NotNull l0<K, V> l0Var) {
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
        return c().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!c().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public Void k(V v10) {
        m0.b();
        throw new kotlin.a0();
    }

    @NotNull
    public Void l(@NotNull Collection<? extends V> collection) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b1<K, V> iterator() {
        return new b1<>(c(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) c().k().k().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return c().u(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> collection) {
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
                if (set.contains(entry.getValue())) {
                    aVarC.remove(entry.getKey());
                    z10 = true;
                }
            }
            Unit unit2 = Unit.f312394a;
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarBuild2 = aVarC.build2();
            if (!Intrinsics.areEqual(hVarBuild2, hVarK)) {
                e1 e1VarA2 = l0VarC.A();
                Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                l0.a aVar2 = (l0.a) e1VarA2;
                synchronized (b0.Q()) {
                    try {
                        mVarF = m.f36535e.f();
                        zD = l0VarC.d((l0.a) b0.A0(aVar2, l0VarC, mVarF), iL, hVarBuild2);
                    } finally {
                    }
                }
                b0.c0(mVarF, l0VarC);
            }
            return z10;
        } while (!zD);
        return z10;
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
                e1 e1VarA = l0VarC.A();
                Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                l0.a aVar = (l0.a) b0.L((l0.a) e1VarA);
                hVarK = aVar.k();
                iL = aVar.l();
                Unit unit = Unit.f312394a;
            }
            Intrinsics.checkNotNull(hVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> aVarC = hVarK.c();
            for (Map.Entry<K, V> entry : l0VarC.entrySet()) {
                if (!set.contains(entry.getValue())) {
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
