package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b2
@SourceDebugExtension({"SMAP\nNavDestinationBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.android.kt\nandroidx/navigation/NavActionBuilder\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,221:1\n27#2:222\n46#2:223\n32#2,4:224\n31#2,7:234\n126#3:228\n153#3,3:229\n37#4,2:232\n1#5:241\n106#6:242\n46#7:243\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.android.kt\nandroidx/navigation/NavActionBuilder\n*L\n218#1:222\n218#1:223\n218#1:224,4\n218#1:234,7\n218#1:228\n218#1:229,3\n218#1:232,2\n218#1:241\n218#1:242\n218#1:243\n*E\n"})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f70910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f70911b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private w2 f70912c;

    @NotNull
    public final e0 a() {
        Pair[] pairArr;
        Bundle bundleB;
        int i10 = this.f70910a;
        w2 w2Var = this.f70912c;
        if (this.f70911b.isEmpty()) {
            bundleB = null;
        } else {
            Map<String, Object> map = this.f70911b;
            if (map.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            androidx.savedstate.n.c(bundleB);
        }
        return new e0(i10, w2Var, bundleB);
    }

    @NotNull
    public final Map<String, Object> b() {
        return this.f70911b;
    }

    public final int c() {
        return this.f70910a;
    }

    public final void d(@NotNull Function1<? super a3, Unit> optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        a3 a3Var = new a3();
        optionsBuilder.invoke(a3Var);
        this.f70912c = a3Var.e();
    }

    public final void e(int i10) {
        this.f70910a = i10;
    }
}
