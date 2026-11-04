package androidx.compose.runtime.saveable;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSaveableStateRegistryWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistryWrapper.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryWrapper\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,83:1\n27#2:84\n46#2:85\n32#2,4:86\n31#2,7:96\n126#3:90\n153#3,3:91\n37#4,2:94\n1#5:103\n106#6:104\n90#6:106\n46#7:105\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistryWrapper.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryWrapper\n*L\n73#1:84\n73#1:85\n73#1:86,4\n73#1:96,7\n73#1:90\n73#1:91,3\n73#1:94,2\n73#1:103\n73#1:104\n75#1:106\n73#1:105\n*E\n"})
public final class a0 implements v, androidx.savedstate.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36382e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ v f36383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.savedstate.l f36384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q0 f36385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.savedstate.j f36386d;

    public a0(@NotNull v vVar) {
        this.f36383a = vVar;
        androidx.savedstate.l lVarB = androidx.savedstate.l.f75159c.b(this);
        this.f36384b = lVarB;
        this.f36385c = q0.f52466k.a(this);
        this.f36386d = lVarB.b();
        Object objF = f("androidx.savedstate.SavedStateRegistry");
        lVarB.d(objF instanceof Bundle ? (Bundle) objF : null);
        b("androidx.savedstate.SavedStateRegistry", new Function0() { // from class: androidx.compose.runtime.saveable.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.e(this.f36434a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(a0 a0Var) {
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
        androidx.savedstate.n.c(bundleB);
        a0Var.f36384b.e(bundleB);
        if (androidx.savedstate.f.B0(androidx.savedstate.f.b(bundleB))) {
            return null;
        }
        return bundleB;
    }

    public static /* synthetic */ void h() {
    }

    @Override // androidx.compose.runtime.saveable.v
    public boolean a(@NotNull Object obj) {
        return this.f36383a.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.v
    @NotNull
    public v.a b(@NotNull String str, @NotNull Function0<? extends Object> function0) {
        return this.f36383a.b(str, function0);
    }

    @Override // androidx.compose.runtime.saveable.v
    @NotNull
    public Map<String, List<Object>> c() {
        return this.f36383a.c();
    }

    @Override // androidx.compose.runtime.saveable.v
    @Nullable
    public Object f(@NotNull String str) {
        return this.f36383a.f(str);
    }

    @NotNull
    public final androidx.savedstate.l g() {
        return this.f36384b;
    }

    @Override // androidx.savedstate.m
    @NotNull
    public androidx.savedstate.j getSavedStateRegistry() {
        return this.f36386d;
    }

    @Override // androidx.lifecycle.o0
    @NotNull
    public q0 getLifecycle() {
        return this.f36385c;
    }
}
