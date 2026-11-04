package androidx.navigation.internal;

import android.os.Bundle;
import androidx.navigation.c1;
import androidx.navigation.n0;
import androidx.navigation.y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavBackStackEntryStateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryStateImpl.kt\nandroidx/navigation/internal/NavBackStackEntryStateImpl\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,82:1\n27#2:83\n46#2:84\n32#2,4:85\n31#2,7:95\n27#2:109\n46#2:110\n32#2,4:111\n31#2,7:121\n27#2:130\n46#2:131\n32#2,4:132\n31#2,7:142\n126#3:89\n153#3,3:90\n126#3:115\n153#3,3:116\n126#3:136\n153#3,3:137\n37#4,2:93\n37#4,2:119\n37#4,2:140\n1#5:102\n1#5:128\n1#5:149\n106#6:103\n90#6:105\n90#6:106\n90#6:107\n90#6:108\n106#6:129\n106#6:150\n46#7:104\n46#7:151\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntryStateImpl.kt\nandroidx/navigation/internal/NavBackStackEntryStateImpl\n*L\n37#1:83\n37#1:84\n37#1:85,4\n37#1:95,7\n49#1:109\n49#1:110\n49#1:111,4\n49#1:121,7\n52#1:130\n52#1:131\n52#1:132,4\n52#1:142,7\n37#1:89\n37#1:90,3\n49#1:115\n49#1:116,3\n52#1:136\n52#1:137,3\n37#1:93,2\n49#1:119,2\n52#1:140,2\n37#1:102\n49#1:128\n52#1:149\n37#1:103\n42#1:105\n43#1:106\n44#1:107\n45#1:108\n49#1:129\n52#1:150\n37#1:104\n52#1:151\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f71060e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f71061f = "nav-entry-state:id";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f71062g = "nav-entry-state:destination-id";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f71063h = "nav-entry-state:args";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f71064i = "nav-entry-state:saved-state";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f71065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f71066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bundle f71067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Bundle f71068d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(@NotNull n0 entry, int i10) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f71065a = entry.h();
        this.f71066b = i10;
        this.f71067c = entry.b();
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry2 : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        androidx.savedstate.n.c(bundleB);
        this.f71068d = bundleB;
        entry.r(bundleB);
    }

    @Nullable
    public final Bundle a() {
        return this.f71067c;
    }

    public final int b() {
        return this.f71066b;
    }

    @NotNull
    public final String c() {
        return this.f71065a;
    }

    @NotNull
    public final Bundle d() {
        return this.f71068d;
    }

    @NotNull
    public final n0 e(@NotNull h context, @NotNull y1 destination, @Nullable Bundle bundle, @NotNull androidx.lifecycle.c0.b hostLifecycleState, @Nullable c1 c1Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        return n0.f71145j.a(context, destination, bundle, hostLifecycleState, c1Var, this.f71065a, this.f71068d);
    }

    @NotNull
    public final Bundle f() {
        Pair[] pairArr;
        Pair[] pairArr2;
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
        Bundle bundleC = androidx.savedstate.n.c(bundleB);
        androidx.savedstate.n.J(bundleC, f71061f, this.f71065a);
        androidx.savedstate.n.t(bundleC, f71062g, this.f71066b);
        Bundle bundleB2 = this.f71067c;
        if (bundleB2 == null) {
            Map mapEmptyMap2 = MapsKt.emptyMap();
            if (mapEmptyMap2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapEmptyMap2.size());
                for (Map.Entry entry2 : mapEmptyMap2.entrySet()) {
                    arrayList2.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
            }
            bundleB2 = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            androidx.savedstate.n.c(bundleB2);
        }
        androidx.savedstate.n.D(bundleC, f71063h, bundleB2);
        androidx.savedstate.n.D(bundleC, f71064i, this.f71068d);
        return bundleB;
    }

    public g(@NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f71065a = androidx.savedstate.f.u0(androidx.savedstate.f.b(state), f71061f);
        this.f71066b = androidx.savedstate.f.G(androidx.savedstate.f.b(state), f71062g);
        this.f71067c = androidx.savedstate.f.g0(androidx.savedstate.f.b(state), f71063h);
        this.f71068d = androidx.savedstate.f.g0(androidx.savedstate.f.b(state), f71064i);
    }
}
