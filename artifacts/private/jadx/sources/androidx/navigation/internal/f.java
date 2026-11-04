package androidx.navigation.internal;

import android.os.Bundle;
import androidx.annotation.b1;
import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l1;
import androidx.lifecycle.l2;
import androidx.lifecycle.o1;
import androidx.lifecycle.q0;
import androidx.lifecycle.t1;
import androidx.navigation.i3;
import androidx.navigation.n0;
import androidx.navigation.y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavBackStackEntryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryImpl.kt\nandroidx/navigation/internal/NavBackStackEntryImpl\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,166:1\n27#2:167\n46#2:168\n32#2,4:169\n31#2,7:179\n126#3:173\n153#3,3:174\n37#4,2:177\n1#5:186\n1#5:188\n106#6:187\n32#7:189\n69#7,2:190\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntryImpl.kt\nandroidx/navigation/internal/NavBackStackEntryImpl\n*L\n62#1:167\n62#1:168\n62#1:169,4\n62#1:179,7\n62#1:173\n62#1:174,3\n62#1:177,2\n62#1:186\n62#1:187\n161#1:189\n161#1:190,2\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n0 f71036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final h f71037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private y1 f71038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Bundle f71039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private androidx.lifecycle.c0.b f71040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final i3 f71041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f71042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final Bundle f71043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.savedstate.l f71044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f71045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final q0 f71047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private androidx.lifecycle.c0.b f71048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final j2.c f71049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71050o;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends f2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final l1 f71051a;

        public a(@NotNull l1 handle) {
            Intrinsics.checkNotNullParameter(handle, "handle");
            this.f71051a = handle;
        }

        @NotNull
        public final l1 U() {
            return this.f71051a;
        }
    }

    public f(@NotNull n0 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f71036a = entry;
        this.f71037b = entry.d();
        this.f71038c = entry.f();
        this.f71039d = entry.i();
        this.f71040e = entry.g();
        this.f71041f = entry.p();
        this.f71042g = entry.h();
        this.f71043h = entry.l();
        this.f71044i = androidx.savedstate.l.f75159c.b(entry);
        this.f71046k = kotlin.g0.c(new Function0() { // from class: androidx.navigation.internal.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.d();
            }
        });
        this.f71047l = new q0(entry);
        this.f71048m = androidx.lifecycle.c0.b.INITIALIZED;
        this.f71049n = g();
        this.f71050o = kotlin.g0.c(new Function0() { // from class: androidx.navigation.internal.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a A(v2.a initializer) {
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        return new a(o1.b(initializer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t1 d() {
        return new t1();
    }

    private final j2.c q() {
        return (j2.c) this.f71050o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j2.c z() {
        v2.d dVar = new v2.d();
        dVar.a(j1.d(a.class), new Function1() { // from class: androidx.navigation.internal.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.A((v2.a) obj);
            }
        });
        return dVar.b();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public final void B(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f71044i.e(outBundle);
    }

    public final void C(@NotNull y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "<set-?>");
        this.f71038c = y1Var;
    }

    public final void D(@NotNull androidx.lifecycle.c0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f71040e = bVar;
    }

    public final void E(@NotNull androidx.lifecycle.c0.b maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.f71048m = maxState;
        G();
    }

    public final void F(boolean z10) {
        this.f71045j = z10;
    }

    public final void G() {
        if (!this.f71045j) {
            this.f71044i.c();
            this.f71045j = true;
            if (this.f71041f != null) {
                o1.c(this.f71036a);
            }
            this.f71044i.d(this.f71043h);
        }
        if (this.f71040e.ordinal() < this.f71048m.ordinal()) {
            this.f71047l.v(this.f71040e);
        } else {
            this.f71047l.v(this.f71048m);
        }
    }

    @Nullable
    public final Bundle e() {
        Pair[] pairArr;
        if (this.f71039d == null) {
            return null;
        }
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
        androidx.savedstate.n.g(androidx.savedstate.n.c(bundleB), this.f71039d);
        return bundleB;
    }

    @Nullable
    public final h f() {
        return this.f71037b;
    }

    @NotNull
    public final t1 g() {
        return (t1) this.f71046k.getValue();
    }

    @NotNull
    public final v2.f h() {
        v2.f fVar = new v2.f(null, 1, null);
        fVar.c(o1.f52458c, this.f71036a);
        fVar.c(o1.f52459d, this.f71036a);
        Bundle bundleE = e();
        if (bundleE != null) {
            fVar.c(o1.f52460e, bundleE);
        }
        return fVar;
    }

    @NotNull
    public final j2.c i() {
        return this.f71049n;
    }

    @NotNull
    public final y1 j() {
        return this.f71038c;
    }

    @NotNull
    public final n0 k() {
        return this.f71036a;
    }

    @NotNull
    public final androidx.lifecycle.c0.b l() {
        return this.f71040e;
    }

    @NotNull
    public final String m() {
        return this.f71042g;
    }

    @Nullable
    public final Bundle n() {
        return this.f71039d;
    }

    @NotNull
    public final q0 o() {
        return this.f71047l;
    }

    @NotNull
    public final androidx.lifecycle.c0.b p() {
        return this.f71048m;
    }

    @Nullable
    public final Bundle r() {
        return this.f71043h;
    }

    @NotNull
    public final l1 s() {
        if (!this.f71045j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f71047l.d() != androidx.lifecycle.c0.b.DESTROYED) {
            return ((a) j2.b.d(j2.f52401b, this.f71036a, q(), null, 4, null).f(j1.d(a.class))).U();
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
    }

    @NotNull
    public final androidx.savedstate.j t() {
        return this.f71044i.b();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j1.d(this.f71036a.getClass()).Q());
        sb2.append('(' + this.f71042g + ')');
        sb2.append(" destination=");
        sb2.append(this.f71038c);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean u() {
        return this.f71045j;
    }

    @NotNull
    public final androidx.savedstate.l v() {
        return this.f71044i;
    }

    @NotNull
    public final l2 w() {
        if (!this.f71045j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f71047l.d() == androidx.lifecycle.c0.b.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        i3 i3Var = this.f71041f;
        if (i3Var != null) {
            return i3Var.y(this.f71042g);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    @Nullable
    public final i3 x() {
        return this.f71041f;
    }

    public final void y(@NotNull androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71036a.u(event.p());
        this.f71040e = event.p();
        G();
    }
}
