package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringArrayNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n11165#3:886\n11500#3,3:887\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringArrayNavType\n*L\n812#1:884\n817#1:885\n833#1:886\n833#1:887,3\n*E\n"})
public final class b4 extends q<String[]> {
    public b4() {
        super(true);
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String[] a() {
        return new String[0];
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String[] get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleB = androidx.savedstate.f.b(bundle);
        if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
            return null;
        }
        return androidx.savedstate.f.v0(bundleB, key);
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String[] parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new String[]{value};
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String[] parseValue(@NotNull String value, @Nullable String[] strArr) {
        String[] strArr2;
        Intrinsics.checkNotNullParameter(value, "value");
        return (strArr == null || (strArr2 = (String[]) ArraysKt.plus((Object[]) strArr, (Object[]) parseValue(value))) == null) ? parseValue(value) : strArr2;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleC = androidx.savedstate.n.c(bundle);
        if (strArr != null) {
            androidx.savedstate.n.K(bundleC, key, strArr);
        } else {
            androidx.savedstate.n.z(bundleC, key);
        }
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "string[]";
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<String> b(@Nullable String[] strArr) {
        if (strArr == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            int i10 = 5 & 0;
            arrayList.add(g3.c(g3.f71010a, str, null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean valueEquals(@Nullable String[] strArr, @Nullable String[] strArr2) {
        return ArraysKt.contentDeepEquals(strArr, strArr2);
    }
}
