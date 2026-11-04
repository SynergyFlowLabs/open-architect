package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,240:1\n27#2:241\n46#2:242\n32#2,4:243\n31#2,7:253\n27#2:266\n46#2:267\n32#2,4:268\n31#2,7:278\n27#2:290\n46#2:291\n32#2,4:292\n31#2,7:302\n126#3:247\n153#3,3:248\n216#3:263\n217#3:265\n126#3:272\n153#3,3:273\n126#3:296\n153#3,3:297\n37#4,2:251\n37#4,2:276\n37#4,2:300\n1#5:260\n1#5:262\n1#5:285\n1#5:287\n1#5:309\n106#6:261\n90#6:264\n106#6:286\n90#6:288\n90#6:289\n106#6:310\n106#6:312\n90#6:313\n46#7:311\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n159#1:241\n159#1:242\n159#1:243,4\n159#1:253,7\n182#1:266\n182#1:267\n182#1:268,4\n182#1:278,7\n200#1:290\n200#1:291\n200#1:292,4\n200#1:302,7\n159#1:247\n159#1:248,3\n166#1:263\n166#1:265\n182#1:272\n182#1:273,3\n200#1:296\n200#1:297,3\n159#1:251,2\n182#1:276,2\n200#1:300,2\n159#1:260\n182#1:285\n200#1:309\n159#1:261\n168#1:264\n182#1:286\n198#1:288\n200#1:289\n200#1:310\n201#1:312\n202#1:313\n200#1:311\n*E\n"})
public final class r1 implements androidx.savedstate.j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.savedstate.j f52495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Bundle f52497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f52498d;

    public r1(@NotNull androidx.savedstate.j savedStateRegistry, @NotNull final m2 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f52495a = savedStateRegistry;
        this.f52498d = kotlin.g0.c(new Function0() { // from class: androidx.lifecycle.q1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r1.f(viewModelStoreOwner);
            }
        });
    }

    private final s1 d() {
        return (s1) this.f52498d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s1 f(m2 m2Var) {
        return o1.e(m2Var);
    }

    @Override // androidx.savedstate.j.b
    @NotNull
    public Bundle a() {
        Pair[] pairArr;
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
        Bundle bundle = this.f52497c;
        if (bundle != null) {
            androidx.savedstate.n.g(bundleC, bundle);
        }
        for (Map.Entry<String, l1> entry2 : d().U().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleA = entry2.getValue().m().a();
            if (!androidx.savedstate.f.B0(androidx.savedstate.f.b(bundleA))) {
                androidx.savedstate.n.D(bundleC, key, bundleA);
            }
        }
        this.f52496b = false;
        return bundleB;
    }

    @Nullable
    public final Bundle c(@NotNull String key) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        Bundle bundle = this.f52497c;
        if (bundle == null || !androidx.savedstate.f.c(androidx.savedstate.f.b(bundle), key)) {
            return null;
        }
        Bundle bundleL0 = androidx.savedstate.f.l0(androidx.savedstate.f.b(bundle), key);
        if (bundleL0 == null) {
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
            bundleL0 = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            androidx.savedstate.n.c(bundleL0);
        }
        androidx.savedstate.n.M(androidx.savedstate.n.c(bundle), key);
        if (androidx.savedstate.f.B0(androidx.savedstate.f.b(bundle))) {
            this.f52497c = null;
        }
        return bundleL0;
    }

    public final void e() {
        Pair[] pairArr;
        if (this.f52496b) {
            return;
        }
        Bundle bundleA = this.f52495a.a(o1.f52457b);
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
        Bundle bundle = this.f52497c;
        if (bundle != null) {
            androidx.savedstate.n.g(bundleC, bundle);
        }
        if (bundleA != null) {
            androidx.savedstate.n.g(bundleC, bundleA);
        }
        this.f52497c = bundleB;
        this.f52496b = true;
        d();
    }
}
