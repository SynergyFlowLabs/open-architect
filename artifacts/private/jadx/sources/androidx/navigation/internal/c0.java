package androidx.navigation.internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.f3;
import androidx.navigation.l0;
import androidx.navigation.o1;
import androidx.navigation.w1;
import androidx.navigation.y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavDestinationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationImpl.kt\nandroidx/navigation/internal/NavDestinationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,213:1\n1#2:214\n1#2:234\n27#3:215\n46#3:216\n32#3,4:217\n31#3,7:227\n126#4:221\n153#4,3:222\n37#5,2:225\n106#6:235\n106#6:237\n90#6:238\n46#7:236\n*S KotlinDebug\n*F\n+ 1 NavDestinationImpl.kt\nandroidx/navigation/internal/NavDestinationImpl\n*L\n193#1:234\n193#1:215\n193#1:216\n193#1:217,4\n193#1:227,7\n193#1:221\n193#1:222,3\n193#1:225,2\n193#1:235\n198#1:237\n161#1:238\n193#1:236\n*E\n"})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y1 f71028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f71029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<o1> f71030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Map<String, androidx.navigation.j0> f71031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f71032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f71033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private kotlin.f0<o1> f71034g;

    public c0(@NotNull y1 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f71028a = destination;
        this.f71030c = new ArrayList();
        this.f71031d = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(o1 o1Var, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return !o1Var.q().contains(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o1 f(String str) {
        return new o1.a().g(str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(o1 o1Var, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return !o1Var.q().contains(key);
    }

    private final boolean q(o1 o1Var, Uri uri, Map<String, androidx.navigation.j0> map) {
        final Bundle bundleX = o1Var.x(uri, map);
        return l0.a(map, new Function1() { // from class: androidx.navigation.internal.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(c0.r(bundleX, (String) obj));
            }
        }).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return !androidx.savedstate.f.c(androidx.savedstate.f.b(bundle), key);
    }

    public final void g(@NotNull String argumentName, @NotNull androidx.navigation.j0 argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.f71031d.put(argumentName, argument);
    }

    public final void i(@NotNull final o1 navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List<String> listA = l0.a(this.f71031d, new Function1() { // from class: androidx.navigation.internal.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(c0.h(navDeepLink, (String) obj));
            }
        });
        if (listA.isEmpty()) {
            this.f71030c.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.G() + " can't be used to open destination " + this.f71028a + ".\nFollowing required arguments are missing: " + listA).toString());
    }

    @Nullable
    public final Bundle j(@Nullable Bundle bundle) {
        Pair[] pairArr;
        if (bundle == null && this.f71031d.isEmpty()) {
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
        androidx.savedstate.n.c(bundleB);
        for (Map.Entry<String, androidx.navigation.j0> entry2 : this.f71031d.entrySet()) {
            entry2.getValue().f(entry2.getKey(), bundleB);
        }
        if (bundle != null) {
            androidx.savedstate.n.g(androidx.savedstate.n.c(bundleB), bundle);
            for (Map.Entry<String, androidx.navigation.j0> entry3 : this.f71031d.entrySet()) {
                String key = entry3.getKey();
                androidx.navigation.j0 value = entry3.getValue();
                if (!value.d() && !value.g(key, bundleB)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument savedState. " + value.b().getName() + " expected.").toString());
                }
            }
        }
        return bundleB;
    }

    @NotNull
    public final Map<String, androidx.navigation.j0> k() {
        return this.f71031d;
    }

    @NotNull
    public final List<o1> l() {
        return this.f71030c;
    }

    @NotNull
    public final y1 m() {
        return this.f71028a;
    }

    public final int n() {
        return this.f71032e;
    }

    @Nullable
    public final String o() {
        return this.f71029b;
    }

    @Nullable
    public final String p() {
        return this.f71033f;
    }

    public final boolean s(@NotNull String route, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (Intrinsics.areEqual(this.f71033f, route)) {
            return true;
        }
        y1.c cVarU = u(route);
        if (Intrinsics.areEqual(this.f71028a, cVarU != null ? cVarU.k() : null)) {
            return cVarU.n(bundle);
        }
        return false;
    }

    @Nullable
    public final y1.c t(@NotNull w1 navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.f71030c.isEmpty()) {
            return null;
        }
        y1.c cVar = null;
        for (o1 o1Var : this.f71030c) {
            Uri uriC = navDeepLinkRequest.c();
            if (o1Var.O(navDeepLinkRequest)) {
                Bundle bundleV = uriC != null ? o1Var.v(uriC, this.f71031d) : null;
                int iK = o1Var.k(uriC);
                String strA = navDeepLinkRequest.a();
                boolean z10 = strA != null && Intrinsics.areEqual(strA, o1Var.p());
                String strB = navDeepLinkRequest.b();
                int iC = strB != null ? o1Var.C(strB) : -1;
                if (bundleV == null) {
                    if (z10 || iC > -1) {
                        if (q(o1Var, uriC, this.f71031d)) {
                        }
                    }
                }
                y1.c cVar2 = new y1.c(this.f71028a, bundleV, o1Var.H(), iK, z10, iC);
                if (cVar == null || cVar2.compareTo(cVar) > 0) {
                    cVar = cVar2;
                }
            }
        }
        return cVar;
    }

    @Nullable
    public final y1.c u(@NotNull String route) {
        o1 value;
        Uri uriA;
        Bundle bundleV;
        Intrinsics.checkNotNullParameter(route, "route");
        kotlin.f0<o1> f0Var = this.f71034g;
        if (f0Var == null || (value = f0Var.getValue()) == null || (bundleV = value.v((uriA = f3.a(y1.f71443f.c(route))), this.f71031d)) == null) {
            return null;
        }
        return new y1.c(this.f71028a, bundleV, value.H(), value.k(uriA), false, -1);
    }

    public final void v(@NotNull String argumentName) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        this.f71031d.remove(argumentName);
    }

    public final void w(@NotNull Map<String, androidx.navigation.j0> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f71031d = map;
    }

    public final void x(int i10) {
        this.f71032e = i10;
        this.f71029b = null;
    }

    public final void y(@Nullable String str) {
        this.f71029b = str;
    }

    public final void z(@Nullable String str) {
        if (str == null) {
            x(0);
        } else {
            if (StringsKt.w3(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            final String strC = y1.f71443f.c(str);
            final o1 o1VarA = new o1.a().g(strC).a();
            List<String> listA = l0.a(this.f71031d, new Function1() { // from class: androidx.navigation.internal.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(c0.e(o1VarA, (String) obj));
                }
            });
            if (!listA.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this.f71028a + ". Following required arguments are missing: " + listA).toString());
            }
            this.f71034g = kotlin.g0.c(new Function0() { // from class: androidx.navigation.internal.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c0.f(strC);
                }
            });
            x(strC.hashCode());
        }
        this.f71033f = str;
    }
}
