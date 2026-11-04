package k2;

import android.os.Bundle;
import androidx.annotation.l0;
import androidx.core.os.e;
import androidx.savedstate.j;
import androidx.savedstate.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSavedStateHandleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleImpl.kt\nandroidx/lifecycle/internal/SavedStateHandleImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 8 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,129:1\n381#2,7:130\n381#2,7:137\n27#3:144\n46#3:145\n32#3,4:146\n31#3,7:156\n126#4:150\n153#4,3:151\n37#5,2:154\n1#6:163\n106#7:164\n46#8:165\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleImpl.kt\nandroidx/lifecycle/internal/SavedStateHandleImpl\n*L\n60#1:130,7\n76#1:137,7\n47#1:144\n47#1:145\n47#1:146,4\n47#1:156,7\n47#1:150\n47#1:151,3\n47#1:154,2\n47#1:163\n47#1:164\n47#1:165\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f307530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, j.b> f307531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, k0<Object>> f307532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, k0<Object>> f307533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final j.b f307534e;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle m(c cVar) {
        Pair[] pairArr;
        for (Map.Entry entry : MapsKt.toMap(cVar.f307533d).entrySet()) {
            cVar.n((String) entry.getKey(), ((k0) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : MapsKt.toMap(cVar.f307531b).entrySet()) {
            cVar.n((String) entry2.getKey(), ((j.b) entry2.getValue()).a());
        }
        Map<String, Object> map = cVar.f307530a;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(TuplesKt.to(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        n.c(bundleB);
        return bundleB;
    }

    @l0
    public final void b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f307531b.remove(key);
    }

    @l0
    public final boolean c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f307530a.containsKey(key);
    }

    @l0
    @Nullable
    public final <T> T d(@NotNull String key) {
        T t10;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            k0<Object> k0Var = this.f307533d.get(key);
            if (k0Var != null && (t10 = (T) k0Var.getValue()) != null) {
                return t10;
            }
            return (T) this.f307530a.get(key);
        } catch (ClassCastException unused) {
            k(key);
            return null;
        }
    }

    @NotNull
    public final Map<String, k0<Object>> e() {
        return this.f307533d;
    }

    @l0
    @NotNull
    public final <T> k0<T> f(@NotNull String key, T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, k0<Object>> map = this.f307533d;
        o0 o0VarA = map.get(key);
        if (o0VarA == null) {
            if (!this.f307530a.containsKey(key)) {
                this.f307530a.put(key, t10);
            }
            o0VarA = b1.a(this.f307530a.get(key));
            map.put(key, (k0<Object>) o0VarA);
        }
        k0<T> k0Var = (k0) o0VarA;
        Intrinsics.checkNotNull(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return k0Var;
    }

    @NotNull
    public final Map<String, Object> g() {
        return this.f307530a;
    }

    @NotNull
    public final j.b h() {
        return this.f307534e;
    }

    @l0
    @NotNull
    public final <T> z0<T> i(@NotNull String key, T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, k0<Object>> map = this.f307532c;
        k0<Object> k0VarA = map.get(key);
        if (k0VarA == null) {
            if (!this.f307530a.containsKey(key)) {
                this.f307530a.put(key, t10);
            }
            k0VarA = b1.a(this.f307530a.get(key));
            map.put(key, k0VarA);
        }
        z0<T> z0VarN = k.n(k0VarA);
        Intrinsics.checkNotNull(z0VarN, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getStateFlow>");
        return z0VarN;
    }

    @l0
    @NotNull
    public final Set<String> j() {
        return SetsKt.plus((Set) this.f307530a.keySet(), (Iterable) this.f307531b.keySet());
    }

    @l0
    @Nullable
    public final <T> T k(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = (T) this.f307530a.remove(key);
        this.f307532c.remove(key);
        this.f307533d.remove(key);
        return t10;
    }

    @NotNull
    public final j.b l() {
        return this.f307534e;
    }

    @l0
    public final <T> void n(@NotNull String key, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f307530a.put(key, t10);
        k0<Object> k0Var = this.f307532c.get(key);
        if (k0Var != null) {
            k0Var.setValue(t10);
        }
        k0<Object> k0Var2 = this.f307533d.get(key);
        if (k0Var2 != null) {
            k0Var2.setValue(t10);
        }
    }

    @l0
    public final void o(@NotNull String key, @NotNull j.b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f307531b.put(key, provider);
    }

    public c(@NotNull Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f307530a = MapsKt.toMutableMap(initialState);
        this.f307531b = new LinkedHashMap();
        this.f307532c = new LinkedHashMap();
        this.f307533d = new LinkedHashMap();
        this.f307534e = new j.b() { // from class: k2.b
            @Override // androidx.savedstate.j.b
            public final Bundle a() {
                return c.m(this.f307529a);
            }
        };
    }

    public /* synthetic */ c(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MapsKt.emptyMap() : map);
    }
}
