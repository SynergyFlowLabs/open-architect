package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.l1;
import androidx.navigation.d3;
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
@SourceDebugExtension({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/SavedStateHandleArgStore\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,186:1\n27#2:187\n46#2:188\n32#2,4:189\n31#2,7:199\n126#3:193\n153#3,3:194\n37#4,2:197\n1#5:206\n1#5:209\n106#6:207\n46#7:208\n*S KotlinDebug\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/SavedStateHandleArgStore\n*L\n165#1:187\n165#1:188\n165#1:189,4\n165#1:199,7\n165#1:193\n165#1:194,3\n165#1:197,2\n165#1:206\n165#1:207\n165#1:208\n*E\n"})
final class r extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l1 f71303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, d3<?>> f71304b;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull l1 handle, @NotNull Map<String, ? extends d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.f71303a = handle;
        this.f71304b = typeMap;
    }

    @Override // androidx.navigation.serialization.a
    public boolean a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f71303a.c(key);
    }

    @Override // androidx.navigation.serialization.a
    @Nullable
    public Object b(@NotNull String key) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(key, "key");
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(key, this.f71303a.e(key)));
        if (mapMapOf.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapMapOf.size());
            for (Map.Entry entry : mapMapOf.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        androidx.savedstate.n.c(bundleB);
        d3<?> d3Var = this.f71304b.get(key);
        if (d3Var != null) {
            return d3Var.get(bundleB, key);
        }
        throw new IllegalStateException(("Failed to find type for " + key + " when decoding " + this.f71303a).toString());
    }
}
