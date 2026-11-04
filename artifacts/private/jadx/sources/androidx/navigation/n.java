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
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/BoolArrayNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n1557#3:886\n1628#3,3:887\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/BoolArrayNavType\n*L\n704#1:884\n709#1:885\n727#1:886\n727#1:887,3\n*E\n"})
public final class n extends q<boolean[]> {
    public n() {
        super(true);
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        return new boolean[0];
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean[] get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleB = androidx.savedstate.f.b(bundle);
        if (androidx.savedstate.f.c(bundleB, key) && !androidx.savedstate.f.C0(bundleB, key)) {
            return androidx.savedstate.f.l(bundleB, key);
        }
        return null;
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean[] parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new boolean[]{d3.BoolType.parseValue(value).booleanValue()};
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] parseValue(@NotNull String value, @Nullable boolean[] zArr) {
        boolean[] zArrPlus;
        Intrinsics.checkNotNullParameter(value, "value");
        return (zArr == null || (zArrPlus = ArraysKt.plus(zArr, parseValue(value))) == null) ? parseValue(value) : zArrPlus;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable boolean[] zArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleC = androidx.savedstate.n.c(bundle);
        if (zArr != null) {
            androidx.savedstate.n.j(bundleC, key, zArr);
        } else {
            androidx.savedstate.n.z(bundleC, key);
        }
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "boolean[]";
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<String> b(@Nullable boolean[] zArr) {
        List<Boolean> list;
        if (zArr == null || (list = ArraysKt.toList(zArr)) == null) {
            return CollectionsKt.emptyList();
        }
        List<Boolean> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean valueEquals(@Nullable boolean[] zArr, @Nullable boolean[] zArr2) {
        return ArraysKt.contentDeepEquals(zArr != null ? ArraysKt.toTypedArray(zArr) : null, zArr2 != null ? ArraysKt.toTypedArray(zArr2) : null);
    }
}
