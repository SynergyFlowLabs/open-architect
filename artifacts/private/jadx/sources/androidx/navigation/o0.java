package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntryKt\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n27#2:164\n46#2:165\n32#2,4:166\n31#2,7:176\n126#3:170\n153#3,3:171\n37#4,2:174\n1#5:183\n106#6:184\n46#7:185\n462#8:186\n412#8:187\n1246#9,4:188\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntryKt\n*L\n159#1:164\n159#1:165\n159#1:166,4\n159#1:176,7\n159#1:170\n159#1:171,3\n159#1:174,2\n159#1:183\n159#1:184\n159#1:185\n160#1:186\n160#1:187\n160#1:188,4\n*E\n"})
public final class o0 {
    public static final /* synthetic */ <T> T a(n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return (T) b(n0Var, kotlin.jvm.internal.j1.d(Object.class));
    }

    public static final <T> T b(@NotNull n0 n0Var, @NotNull kotlin.reflect.d<?> route) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Bundle bundleB = n0Var.b();
        if (bundleB == null) {
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
            bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            androidx.savedstate.n.c(bundleB);
        }
        Map<String, j0> mapU = n0Var.f().u();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapU.size()));
        Iterator<T> it = mapU.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), ((j0) entry2.getValue()).b());
        }
        return (T) androidx.navigation.serialization.i.a(kotlinx.serialization.m0.i(route), bundleB, linkedHashMap);
    }
}
