package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nActionOnlyNavDirections.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionOnlyNavDirections.android.kt\nandroidx/navigation/ActionOnlyNavDirections\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,52:1\n27#2:53\n46#2:54\n32#2,4:55\n31#2,7:65\n126#3:59\n153#3,3:60\n37#4,2:63\n1#5:72\n106#6:73\n46#7:74\n*S KotlinDebug\n*F\n+ 1 ActionOnlyNavDirections.android.kt\nandroidx/navigation/ActionOnlyNavDirections\n*L\n29#1:53\n29#1:54\n29#1:55,4\n29#1:65,7\n29#1:59\n29#1:60,3\n29#1:63,2\n29#1:72\n29#1:73\n29#1:74\n*E\n"})
public final class a implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f70609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bundle f70610b;

    public a(int i10) {
        Pair[] pairArr;
        this.f70609a = i10;
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        androidx.savedstate.n.c(bundleB);
        this.f70610b = bundleB;
    }

    public static /* synthetic */ a c(a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = aVar.f70609a;
        }
        return aVar.b(i10);
    }

    public final int a() {
        return this.f70609a;
    }

    @NotNull
    public final a b(int i10) {
        return new a(i10);
    }

    @Override // androidx.navigation.c2
    @NotNull
    public Bundle d() {
        return this.f70610b;
    }

    @Override // androidx.navigation.c2
    public int e() {
        return this.f70609a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Intrinsics.areEqual(a.class, obj.getClass()) && e() == ((a) obj).e();
    }

    public int hashCode() {
        return 31 + e();
    }

    @NotNull
    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + e() + ')';
    }
}
