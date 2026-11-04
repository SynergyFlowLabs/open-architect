package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/BoolListNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n37#3,2:886\n37#3,2:888\n1557#4:890\n1628#4,3:891\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/BoolListNavType\n*L\n737#1:884\n744#1:885\n758#1:886,2\n759#1:888,2\n764#1:890\n764#1:891,3\n*E\n"})
public final class o extends q<List<? extends Boolean>> {
    public o() {
        super(true);
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<Boolean> a() {
        return CollectionsKt.emptyList();
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<Boolean> get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleB = androidx.savedstate.f.b(bundle);
        if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
            return null;
        }
        return ArraysKt.toList(androidx.savedstate.f.l(bundleB, key));
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<Boolean> parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return CollectionsKt.listOf(d3.BoolType.parseValue(value));
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<Boolean> parseValue(@NotNull String value, @Nullable List<Boolean> list) {
        List<Boolean> listPlus;
        Intrinsics.checkNotNullParameter(value, "value");
        return (list == null || (listPlus = CollectionsKt.plus((Collection) list, (Iterable) parseValue(value))) == null) ? parseValue(value) : listPlus;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable List<Boolean> list) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleC = androidx.savedstate.n.c(bundle);
        if (list != null) {
            androidx.savedstate.n.j(bundleC, key, CollectionsKt.toBooleanArray(list));
        } else {
            androidx.savedstate.n.z(bundleC, key);
        }
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "List<Boolean>";
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<String> b(@Nullable List<Boolean> list) {
        if (list == null) {
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
    public boolean valueEquals(@Nullable List<Boolean> list, @Nullable List<Boolean> list2) {
        return ArraysKt.contentDeepEquals(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
    }
}
