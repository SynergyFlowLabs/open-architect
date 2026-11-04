package androidx.navigation;

import android.app.Application;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavBackStackEntry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.android.kt\nandroidx/navigation/NavBackStackEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n1734#2,3:173\n1863#2,2:176\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.android.kt\nandroidx/navigation/NavBackStackEntry\n*L\n153#1:173,3\n162#1:176,2\n*E\n"})
public final class n0 implements androidx.lifecycle.o0, androidx.lifecycle.m2, androidx.lifecycle.z, androidx.savedstate.m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f71145j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final androidx.navigation.internal.h f71146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private y1 f71147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bundle f71148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.lifecycle.c0.b f71149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final i3 f71150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f71151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Bundle f71152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.internal.f f71153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71154i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n0 b(a aVar, androidx.navigation.internal.h hVar, y1 y1Var, Bundle bundle, androidx.lifecycle.c0.b bVar, i3 i3Var, String str, Bundle bundle2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                bundle = null;
            }
            if ((i10 & 8) != 0) {
                bVar = androidx.lifecycle.c0.b.CREATED;
            }
            if ((i10 & 16) != 0) {
                i3Var = null;
            }
            if ((i10 & 32) != 0) {
                str = aVar.c();
            }
            if ((i10 & 64) != 0) {
                bundle2 = null;
            }
            return aVar.a(hVar, y1Var, bundle, bVar, i3Var, str, bundle2);
        }

        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        @NotNull
        public final n0 a(@Nullable androidx.navigation.internal.h hVar, @NotNull y1 destination, @Nullable Bundle bundle, @NotNull androidx.lifecycle.c0.b hostLifecycleState, @Nullable i3 i3Var, @NotNull String id2, @Nullable Bundle bundle2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
            Intrinsics.checkNotNullParameter(id2, "id");
            return new n0(hVar, destination, bundle, hostLifecycleState, i3Var, id2, bundle2, null);
        }

        @NotNull
        public final String c() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        private a() {
        }
    }

    public /* synthetic */ n0(androidx.navigation.internal.h hVar, y1 y1Var, Bundle bundle, androidx.lifecycle.c0.b bVar, i3 i3Var, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, y1Var, bundle, bVar, i3Var, str, bundle2);
    }

    private static Object c(n0 n0Var) {
        int i10 = 5 >> 0;
        return kotlin.jvm.internal.j1.t(new kotlin.jvm.internal.c1(n0Var.f71153h, androidx.navigation.internal.f.class, "arguments", "getArguments$navigation_common_release()Landroid/os/Bundle;", 0));
    }

    private static Object e(n0 n0Var) {
        return kotlin.jvm.internal.j1.t(new kotlin.jvm.internal.c1(n0Var.f71153h, androidx.navigation.internal.f.class, "defaultViewModelProviderFactory", "getDefaultViewModelProviderFactory$navigation_common_release()Landroidx/lifecycle/ViewModelProvider$Factory;", 0));
    }

    private static Object j(n0 n0Var) {
        return kotlin.jvm.internal.j1.t(new kotlin.jvm.internal.c1(n0Var.f71153h, androidx.navigation.internal.f.class, "lifecycle", "getLifecycle$navigation_common_release()Landroidx/lifecycle/LifecycleRegistry;", 0));
    }

    private static Object n(n0 n0Var) {
        return kotlin.jvm.internal.j1.t(new kotlin.jvm.internal.c1(n0Var.f71153h, androidx.navigation.internal.f.class, "savedStateRegistry", "getSavedStateRegistry$navigation_common_release()Landroidx/savedstate/SavedStateRegistry;", 0));
    }

    private static Object o(n0 n0Var) {
        return kotlin.jvm.internal.j1.t(new kotlin.jvm.internal.c1(n0Var.f71153h, androidx.navigation.internal.f.class, "viewModelStore", "getViewModelStore$navigation_common_release()Landroidx/lifecycle/ViewModelStore;", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.l1 s(n0 n0Var) {
        return n0Var.f71153h.s();
    }

    @Nullable
    public final Bundle b() {
        return this.f71153h.e();
    }

    @Nullable
    public final androidx.navigation.internal.h d() {
        return this.f71146a;
    }

    public boolean equals(@Nullable Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof n0)) {
            n0 n0Var = (n0) obj;
            if (Intrinsics.areEqual(this.f71151f, n0Var.f71151f) && Intrinsics.areEqual(this.f71147b, n0Var.f71147b) && Intrinsics.areEqual(getLifecycle(), n0Var.getLifecycle()) && Intrinsics.areEqual(getSavedStateRegistry(), n0Var.getSavedStateRegistry())) {
                if (!Intrinsics.areEqual(this.f71148c, n0Var.f71148c)) {
                    Bundle bundle = this.f71148c;
                    if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                        Set<String> set = setKeySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Object obj2 = this.f71148c.get(str);
                                Bundle bundle2 = n0Var.f71148c;
                                if (!Intrinsics.areEqual(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final y1 f() {
        return this.f71147b;
    }

    @NotNull
    public final androidx.lifecycle.c0.b g() {
        return this.f71149d;
    }

    @Override // androidx.lifecycle.z
    @NotNull
    public v2.a getDefaultViewModelCreationExtras() {
        v2.f fVarH = this.f71153h.h();
        androidx.navigation.internal.h hVar = this.f71146a;
        Object objA = hVar != null ? hVar.a() : null;
        Application application = objA instanceof Application ? (Application) objA : null;
        if (application != null) {
            fVarH.c(androidx.lifecycle.j2.a.f52406h, application);
        }
        return fVarH;
    }

    @Override // androidx.lifecycle.z
    @NotNull
    public androidx.lifecycle.j2.c getDefaultViewModelProviderFactory() {
        return this.f71153h.i();
    }

    @Override // androidx.lifecycle.o0
    @NotNull
    public androidx.lifecycle.c0 getLifecycle() {
        return this.f71153h.o();
    }

    @Override // androidx.savedstate.m
    @NotNull
    public androidx.savedstate.j getSavedStateRegistry() {
        return this.f71153h.t();
    }

    @Override // androidx.lifecycle.m2
    @NotNull
    public androidx.lifecycle.l2 getViewModelStore() {
        return this.f71153h.w();
    }

    @NotNull
    public final String h() {
        return this.f71151f;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.f71151f.hashCode() * 31) + this.f71147b.hashCode();
        Bundle bundle = this.f71148c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = this.f71148c.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    @Nullable
    public final Bundle i() {
        return this.f71148c;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final androidx.lifecycle.c0.b k() {
        return this.f71153h.p();
    }

    @Nullable
    public final Bundle l() {
        return this.f71152g;
    }

    @androidx.annotation.l0
    @NotNull
    public final androidx.lifecycle.l1 m() {
        return (androidx.lifecycle.l1) this.f71154i.getValue();
    }

    @Nullable
    public final i3 p() {
        return this.f71150e;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void q(@NotNull androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71153h.y(event);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void r(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f71153h.B(outBundle);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void t(@NotNull y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "<set-?>");
        this.f71147b = y1Var;
    }

    @NotNull
    public String toString() {
        return this.f71153h.toString();
    }

    public final void u(@NotNull androidx.lifecycle.c0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f71149d = bVar;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void v(@NotNull androidx.lifecycle.c0.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f71153h.E(value);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void w() {
        this.f71153h.G();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    private n0(androidx.navigation.internal.h hVar, y1 y1Var, Bundle bundle, androidx.lifecycle.c0.b bVar, i3 i3Var, String str, Bundle bundle2) {
        this.f71146a = hVar;
        this.f71147b = y1Var;
        this.f71148c = bundle;
        this.f71149d = bVar;
        this.f71150e = i3Var;
        this.f71151f = str;
        this.f71152g = bundle2;
        this.f71153h = new androidx.navigation.internal.f(this);
        this.f71154i = kotlin.g0.c(new Function0() { // from class: androidx.navigation.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n0.s(this.f71143a);
            }
        });
    }

    /* synthetic */ n0(androidx.navigation.internal.h hVar, y1 y1Var, Bundle bundle, androidx.lifecycle.c0.b bVar, i3 i3Var, String str, Bundle bundle2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, y1Var, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? androidx.lifecycle.c0.b.CREATED : bVar, (i10 & 16) != 0 ? null : i3Var, (i10 & 32) != 0 ? f71145j.c() : str, (i10 & 64) != 0 ? null : bundle2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public n0(@NotNull n0 entry, @Nullable Bundle bundle) {
        this(entry.f71146a, entry.f71147b, bundle, entry.f71149d, entry.f71150e, entry.f71151f, entry.f71152g);
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f71153h.D(entry.f71149d);
        this.f71153h.E(entry.k());
    }

    public /* synthetic */ n0(n0 n0Var, Bundle bundle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(n0Var, (i10 & 2) != 0 ? n0Var.b() : bundle);
    }
}
