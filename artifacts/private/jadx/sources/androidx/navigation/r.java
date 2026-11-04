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
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/FloatArrayNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n1557#3:886\n1628#3,3:887\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/FloatArrayNavType\n*L\n608#1:884\n613#1:885\n631#1:886\n631#1:887,3\n*E\n"})
public final class r extends q<float[]> {
    public r() {
        super(true);
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        return new float[0];
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public float[] get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleB = androidx.savedstate.f.b(bundle);
        if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
            return null;
        }
        return androidx.savedstate.f.D(bundleB, key);
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public float[] parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new float[]{d3.FloatType.parseValue(value).floatValue()};
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] parseValue(@NotNull String value, @Nullable float[] fArr) {
        float[] fArrPlus;
        Intrinsics.checkNotNullParameter(value, "value");
        return (fArr == null || (fArrPlus = ArraysKt.plus(fArr, parseValue(value))) == null) ? parseValue(value) : fArrPlus;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable float[] fArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleC = androidx.savedstate.n.c(bundle);
        if (fArr != null) {
            androidx.savedstate.n.s(bundleC, key, fArr);
        } else {
            androidx.savedstate.n.z(bundleC, key);
        }
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "float[]";
    }

    @Override // androidx.navigation.q
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<String> b(@Nullable float[] fArr) {
        List<Float> list;
        if (fArr == null || (list = ArraysKt.toList(fArr)) == null) {
            return CollectionsKt.emptyList();
        }
        List<Float> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean valueEquals(@Nullable float[] fArr, @Nullable float[] fArr2) {
        return ArraysKt.contentDeepEquals(fArr != null ? ArraysKt.toTypedArray(fArr) : null, fArr2 != null ? ArraysKt.toTypedArray(fArr2) : null);
    }
}
