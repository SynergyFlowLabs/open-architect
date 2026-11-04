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
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/IntArrayNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n1557#3:886\n1628#3,3:887\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/IntArrayNavType\n*L\n423#1:884\n428#1:885\n446#1:886\n446#1:887,3\n*E\n"})
public final class v extends q<int[]> {
    public v() {
        super(true);
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        return new int[0];
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleB = androidx.savedstate.f.b(bundle);
        if (androidx.savedstate.f.c(bundleB, key) && !androidx.savedstate.f.C0(bundleB, key)) {
            return androidx.savedstate.f.H(bundleB, key);
        }
        return null;
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int[] parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new int[]{d3.IntType.parseValue(value).intValue()};
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] parseValue(@NotNull String value, @Nullable int[] iArr) {
        int[] iArrPlus;
        Intrinsics.checkNotNullParameter(value, "value");
        return (iArr == null || (iArrPlus = ArraysKt.plus(iArr, parseValue(value))) == null) ? parseValue(value) : iArrPlus;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable int[] iArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleC = androidx.savedstate.n.c(bundle);
        if (iArr != null) {
            androidx.savedstate.n.u(bundleC, key, iArr);
        } else {
            androidx.savedstate.n.z(bundleC, key);
        }
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "integer[]";
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<String> b(@Nullable int[] iArr) {
        List<Integer> list;
        if (iArr == null || (list = ArraysKt.toList(iArr)) == null) {
            return CollectionsKt.emptyList();
        }
        List<Integer> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean valueEquals(@Nullable int[] iArr, @Nullable int[] iArr2) {
        return ArraysKt.contentDeepEquals(iArr != null ? ArraysKt.toTypedArray(iArr) : null, iArr2 != null ? ArraysKt.toTypedArray(iArr2) : null);
    }
}
