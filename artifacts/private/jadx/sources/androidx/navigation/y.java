package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/LongArrayNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n1557#3:886\n1628#3,3:887\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/LongArrayNavType\n*L\n522#1:884\n527#1:885\n545#1:886\n545#1:887,3\n*E\n"})
public final class y extends q<long[]> {
    public y() {
        super(true);
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        return new long[0];
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public long[] get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleB = androidx.savedstate.f.b(bundle);
        if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
            return null;
        }
        return androidx.savedstate.f.R(bundleB, key);
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public long[] parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new long[]{d3.LongType.parseValue(value).longValue()};
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] parseValue(@NotNull String value, @Nullable long[] jArr) {
        long[] jArrPlus;
        Intrinsics.checkNotNullParameter(value, "value");
        return (jArr == null || (jArrPlus = ArraysKt.plus(jArr, parseValue(value))) == null) ? parseValue(value) : jArrPlus;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable long[] jArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleC = androidx.savedstate.n.c(bundle);
        if (jArr != null) {
            androidx.savedstate.n.y(bundleC, key, jArr);
        } else {
            androidx.savedstate.n.z(bundleC, key);
        }
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "long[]";
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<String> b(@Nullable long[] jArr) {
        List<Long> list;
        if (jArr == null || (list = ArraysKt.toList(jArr)) == null) {
            return CollectionsKt.emptyList();
        }
        List<Long> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean valueEquals(@Nullable long[] jArr, @Nullable long[] jArr2) {
        return ArraysKt.contentDeepEquals(jArr != null ? ArraysKt.toTypedArray(jArr) : null, jArr2 != null ? ArraysKt.toTypedArray(jArr2) : null);
    }
}
